package Scanner;

import java.util.*;
import Scanner.DataStructure.*;
import Scanner.Constants.*;

%%
%public
%class Scanner
%standalone
%line
%column


/*
 Code Blocks
*/

// Initializes the code on the NORMAL State
%init{
    yybegin(NORMAL);
%init}

%{
    Structure data = new Structure();
    Structure errors = new Structure();
%}

// End of file
%eof{
    System.out.println(data.toString());
    System.out.println(errors.toString());
%eof}

/*
  STATES AND MACROS
*/

%state NORMAL COMMENT STRING IDENTIFIER_TYPE OBTENER_PARAMETROS

number = [1-9][0-9]*
Digit = \d
Octal = 0{number}
Letter = [a-zA-Z]
Space = \s|\t

Identifier = {Letter}({Letter}|{Digit})*

Single_Line_Comment = \/\/.*\n
Multi_Line_Comment = \/\*([^])*\*\/
Comments = {Single_Line_Comment}|{Multi_Line_Comment}
%%

<NORMAL> {

// Comment found
    {Comments} {/* DO NOTHING */}

// Reserved words
    "if"|
    "do"|
    "for"|
    "auto"|
    "else"|
    "enum"|
    "case"|
    "goto"|
    "union"|
    "while"|
    "break"|
    "const"|
    "switch"|
    "extern"|
    "return"|
    "sizeof"|
    "struct"|
    "typedef"|
    "_Packed"|
    "default"|
    "volatile"|
    "continue"|
    "static"|
    "register" { data.addData(yytext(), Types.RESERVED_WORDS, yyline); }

    "int"|
    "void"|
    "long"|
    "char"|
    "float"|
    "short"|
    "double" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline); }

    "signed"|
    "unsigned" { data.addData(yytext(), Types.RESERVED_MODIFIER, yyline); }

// OPERATORS

    // Separators
    "," { data.addData(yytext(), Types.OPERATOR_SEPARATE, yyline); }
    ";" { data.addData(yytext(), Types.OPERATOR_END_LINE, yyline); }

    // Math
    "+" { data.addData(yytext(), Types.OPERATOR_ADD, yyline); }
    "-" { data.addData(yytext(), Types.OPERATOR_SUBTRACT, yyline); }
    "*" { data.addData(yytext(), Types.OPERATOR_MULTIPLY, yyline); }
    "/" { data.addData(yytext(), Types.OPERATOR_DIVIDE, yyline); }
    "%" { data.addData(yytext(), Types.OPERATOR_REMAINDER, yyline); }
    "++" { data.addData(yytext(), Types.OPERATOR_INC, yyline); }
    "--" { data.addData(yytext(), Types.OPERATOR_DEC, yyline); }

    // Comparatives
    "=="|
    ">="|
    ">"|
    "<="|
    "<"|
    "!="|
    "||"|
    "&&"|
    "!" { data.addData(yytext(), Types.OPERATOR_BOOLEAN, yyline); }

    // Assignment
    "="|
    "+="|
    "-="|
    "*="|
    "/=" { data.addData("=", Types.OPERATOR_ASSIGN, yyline); }

    // Blocks


    // Identifiers
    {Identifier} {data.addData(yytext(), Types.IDENTIFIER, yyline);}

    // String found

    \" {
        yybegin(STRING);
    }

}


<COMMENT> {
    "*/" {
        data.addData(yytext(), Types.IDENTIFIER, yyline);
        yybegin(NORMAL);
    }

    . {
        System.out.println("dentro del comentario");
    }
}

<STRING> {
     \" {
            //System.out.println("Fin del string");
            yybegin(NORMAL);
        }

    . {
        //System.out.println(yytext());
    }
}


{Space} {/* DO NOTHING */}
. {/* DO NOTHING */}