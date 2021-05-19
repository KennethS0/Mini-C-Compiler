package Scanner;

import java.util.*;
import Scanner.DataStructure.*;
import Scanner.Constants.*;

import java_cup.runtime.Symbol;

%%
%public
%class ScannerCup
%type java_cup.runtime.Symbol
%cup
%standalone
%full
%line
%char
%column


/*
 Code Blocks
*/

%{
    private Structure data = new Structure();
    private Structure errors = new Structure();

    public Structure getData() {
        return this.data;
    }

    public Structure getErrors() {
        return this.errors;
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
%}

//   ========= MACROS ==========


// Numbers
Digit = \d
Decimal = [1-9][0-9]* | 0
Octal = 0[1-7][0-7]*
Hexa = 0x[1-9A-F][0-9A-F]*
Flotante = {Decimal}\.[0-9]+
FlotanteConExponente = ({Flotante}|{Decimal})[eE]\-?{Decimal}

// Letters
Letter = [a-zA-Z]
Not_English = [\u00C0-\u00FF]

// Ignored Characters
Space = [ ,\t,\r,\n]+
New_Line = \n
Identifier = {Letter}({Letter}|{Digit})*

// Literals
String = \".*\"
Escape_Characters = (a|b|f|n|r|t|v|\\|\'|\"|\?|nnn|xhh|0)
Character = \'[^\'\"]\' | \'\' | \'\\{Escape_Characters}\'

// Comments
Single_Line_Comment = \/\/.*
Multi_Line_Comment =  \/\*[^*]*\*+([^*/][^*]*\*+)*\/
Comments = {Single_Line_Comment}|{Multi_Line_Comment}

// Specific Errors
String_Error = \"[^\"(\n)]*
Character_Error = \'[^\'(\n)][^\'(\n)]+\' | \'([^(\')(\n)])*
Comments_Error = \/\*([^(\*\/)])*
Float_Many_Dots = {Flotante}(\.{Digit}*)+
Identifier_Error = {Digit}+{Identifier} | (({Digit}|{Identifier})*{Not_English}+({Digit}|{Identifier})*)*

// Elements to ignore
Ignored_Elements = {Comments} | {Space} | {New_Line}

%%
// Elements to ignore
    {Ignored_Elements} {/* DO NOTHING */}

// Reserved words

    "union"|
    "const"|
    "switch"|
    "extern"|
    "return"|
    "sizeof"|
    "struct"|
    "typedef"|
    "_Packed"|
    "default"|
    "register" { data.addData(yytext(), Types.RESERVED_WORDS, yyline);
                return new Symbol(sym.RESERVED_WORDS, yychar, yyline, yytext());}

    "enum" { data.addData(yytext(), Types.RESERVED_ENUM, yyline);
             return new Symbol(sym.RESERVED_ENUM , yychar, yyline, yytext());
      }

    // Conditional and jumps
    "if"|
    "auto"|
    "else"|
    "case"|
    "goto" { data.addData(yytext(), Types.RESERVED_CONDITION, yyline);
            return new Symbol(sym.RESERVED_CONDITION, yychar, yyline, yytext());
      }

    // Loops
    "do"|
    "while"|
    "for"|
    "continue"|
    "break" { data.addData(yytext(), Types.RESERVED_LOOP, yyline);
      return new Symbol(sym.RESERVED_LOOP, yychar, yyline, yytext());
      }

    // Data types
    "int"|
    "void"|
    "long"|
    "char"|
    "float"|
    "short"|
    "double" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline);
            return new Symbol(sym.RESERVED_DATA_TYPE, yychar, yyline, yytext());
      }

    // Data type modifiers
    "static"|
    "volatile"|
    "signed"|
    "unsigned" { data.addData(yytext(), Types.RESERVED_MODIFIER, yyline);
        return new Symbol(sym.RESERVED_MODIFIER, yychar, yyline, yytext());
      }

// ======= OPERATORS =======

    // Separators
    "," { data.addData(yytext(), Types.OPERATOR_SEPARATE, yyline);
        return new Symbol(sym.OPERATOR_SEPARATE, yychar, yyline, yytext());
    }
    ";" { data.addData(yytext(), Types.OPERATOR_END_LINE, yyline);
        return new Symbol(sym.OPERATOR_END_LINE, yychar, yyline, yytext());
    }
    \\ { data.addData(yytext(), Types.OPERATOR_CONTINUE_LINE, yyline);
        return new Symbol(sym.OPERATOR_CONTINUE_LINE, yychar, yyline, yytext());
    }

    // Math
    "+" { data.addData(yytext(), Types.OPERATOR_ADD, yyline);
         return new Symbol(sym.OPERATOR_ADD, yychar, yyline, yytext());
    }
    "-" { data.addData(yytext(), Types.OPERATOR_NEGATIVE, yyline);
        return new Symbol(sym.OPERATOR_NEGATIVE, yychar, yyline, yytext());
    }
    "*" { data.addData(yytext(), Types.OPERATOR_MULTIPLY, yyline);
        return new Symbol(sym.OPERATOR_MULTIPLY, yychar, yyline, yytext());
    }
    "/" { data.addData(yytext(), Types.OPERATOR_DIVIDE, yyline);
        return new Symbol(sym.OPERATOR_DIVIDE, yychar, yyline, yytext());
     }
    "%" { data.addData(yytext(), Types.OPERATOR_REMAINDER, yyline);
        return new Symbol(sym.OPERATOR_REMAINDER, yychar, yyline, yytext());
     }
    "++" { data.addData(yytext(), Types.OPERATOR_INC, yyline);
        return new Symbol(sym.OPERATOR_INC, yychar, yyline, yytext());
    }
    "--" { data.addData(yytext(), Types.OPERATOR_DEC, yyline);
        return new Symbol(sym.OPERATOR_DEC, yychar, yyline, yytext());
    }

    // Comparatives
    "=="|
    ">="|
    ">"|
    "<="|
    "<"|
    "!="|
    "||"|
    "&&"|
    "!"|
    "?"|
    ":" { data.addData(yytext(), Types.OPERATOR_BOOLEAN, yyline);
        return new Symbol(sym.OPERATOR_BOOLEAN, yychar, yyline, yytext());
     }

    // Assignment
    "="|
    "+="|
    "-="|
    "*="|
    "/="|
    "<<="|
    ">>="|
    "&="|
    "^="|
    "|=" { data.addData(yytext(), Types.OPERATOR_ASSIGNMENT, yyline);
        return new Symbol(sym.OPERATOR_ASSIGNMENT, yychar, yyline, yytext());
    }

    // Code Blocks
    "("|
    ")" { data.addData(yytext(), Types.OPERATOR_PARENTHESIS, yyline);
        return new Symbol(sym.OPERATOR_PARENTHESIS, yychar, yyline, yytext());
    }

    "["|
    "]" {data.addData(yytext(), Types.OPERATOR_SQ_BRACKET, yyline);
        return new Symbol(sym.OPERATOR_SQ_BRACKET, yychar, yyline, yytext());
    }

    "{"|
    "}" {data.addData(yytext(), Types.OPERATOR_BRACKET, yyline);
        return new Symbol(sym.OPERATOR_BRACKET, yychar, yyline, yytext());
    }

    // Binary Operators
    "&"|
    "|"|
    "^"|
    "~"|
    "<<"|
    ">>" {data.addData(yytext(), Types.OPERATOR_BINARY, yyline);
          return new Symbol(sym.OPERATOR_BINARY, yychar, yyline, yytext());
     }

    // Memory Operators
    "->" {data.addData(yytext(), Types.OPERATOR_MEMORY, yyline);
        return new Symbol(sym.OPERATOR_MEMORY, yychar, yyline, yytext());
    }
    "." {data.addData(yytext(), Types.OPERATOR_DOT, yyline);
        return new Symbol(sym.OPERATOR_DOT, yychar, yyline, yytext());
    }

// Identifiers
    {Identifier} {data.addData(yytext(), Types.IDENTIFIER, yyline);
        return new Symbol(sym.IDENTIFIER, yychar, yyline, yytext());
    }


// Literals
    {String} {data.addData(yytext(), Types.LITERAL_STRING, yyline);
        return new Symbol(sym.LITERAL_STRING, yychar, yyline, yytext());
    }
    {Character} {data.addData(yytext(), Types.LITERAL_CHARACTER, yyline);
        return new Symbol(sym.LITERAL_CHARACTER, yychar, yyline, yytext());
    }

    {Decimal} {data.addData(yytext(), Types.LITERAL_DECIMAL, yyline);
        return new Symbol(sym.LITERAL_DECIMAL, yychar, yyline, yytext());
    }
    {Octal} {data.addData(yytext(), Types.LITERAL_OCTAL, yyline);
        return new Symbol(sym.LITERAL_OCTAL, yychar, yyline, yytext());
    }
    {Hexa} {data.addData(yytext(), Types.LITERAL_HEXA, yyline);
        return new Symbol(sym.LITERAL_HEXA, yychar, yyline, yytext());
    }
    {Flotante} {data.addData(yytext(), Types.LITERAL_FLOAT, yyline);
        return new Symbol(sym.LITERAL_FLOAT, yychar, yyline, yytext());
    }

    {FlotanteConExponente} {data.addData(yytext(), Types.LITERAL_EXPONENTIAL_FLOAT, yyline);
        return new Symbol(sym.LITERAL_EXPONENTIAL_FLOAT, yychar, yyline, yytext());
    }


// Errors

    {String_Error} {errors.addData(yytext(), Types.STRING_ERROR, yyline);
        return new Symbol(sym.STRING_ERROR, yychar, yyline, yytext());
    }
    {Comments_Error} {errors.addData(yytext(), Types.COMMENTS_ERROR, yyline);
        return new Symbol(sym.COMMENTS_ERROR, yychar, yyline, yytext());
    }
    {Character_Error} {errors.addData(yytext(), Types.CHARACTER_ERROR, yyline);
        return new Symbol(sym.CHARACTER_ERROR, yychar, yyline, yytext());
    }
    {Identifier_Error} {errors.addData(yytext(), Types.IDENTIFIER_ERROR, yyline);
        return new Symbol(sym.IDENTIFIER_ERROR, yychar, yyline, yytext());  
    }
    {Float_Many_Dots}   {errors.addData(yytext(), Types.FLOAT_MANY_DOTS_ERROR, yyline);
      return new Symbol(sym.FLOAT_MANY_DOTS_ERROR, yychar, yyline, yytext());
    }
    .                   {errors.addData(yytext(), Types.UNKNOWN_ERROR, yyline);
        return new Symbol(sym.UNKNOWN_ERROR, yychar, yyline, yytext());
      }