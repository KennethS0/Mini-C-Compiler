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
%}

// End of file
%eof{
    System.out.println(data.toString());
%eof}

/*
  STATES AND MACROS
*/

%state NORMAL COMMENT STRING IDENTIFIER_TYPE

number = [1-9][0-9]*
Digit = \d
Octal = 0{number}
Letter = [a-zA-Z]
Space = \s|\t
Identifier = {Letter}({Letter}|{Digit})*

%%

<NORMAL> {

// Identifiers
{Identifier} {data.addData(yytext(), Types.IDENTIFIERS, yyline);}

// Comment found
    "/*" {
        System.out.println("Inicio de comentario multilinea");
        yybegin(COMMENT);
    }

// String found
    \" {
        System.out.println("Inicio de comentario multilinea");
        yybegin(COMMENT);
    }

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
    "register" { data.addData(yytext(), Types.RESERVED_WORDS, yyline); }

    "int"|
    "void"|
    "long"|
    "char"|
    "float"|
    "double" {data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline); }

    "signed"|
    "short"|
    "unsigned"|
    "static" {data.addData(yytext(), Types.RESERVED_MODIFIER, yyline); }

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
    "/=" { data.addData(yytext(), Types.OPERATOR_ASSIGN, yyline); }

    // Blocks
}

/*<IDENTIFIER_TYPE> {
    ""
}*/


<COMMENT> {
    "*/" {
        System.out.println("Fin del comentario");
        yybegin(NORMAL);
    }

    . {
        System.out.println("dentro del comentario");
    }
}

<STRING> {
    . {
          System.out.println("dentro del string");
    }
    \" {
        System.out.println("Fin del string");
        yybegin(NORMAL);
    }
}

{Space} {/* DO NOTHING */}
. {/* DO NOTHING */}