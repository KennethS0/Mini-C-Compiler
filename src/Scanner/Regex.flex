package Scanner;

import java.util.*;
import Scanner.DataStructure.*;
import Scanner.Constants.*;

import java_cup.runtime.Symbol;

import Parser.*;

%%
%public
%class Scanner
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

    @Override
    public String toString() {
        String result = "";

        if (!data.isEmpty()) {result += "====== Tokens Found ======\n" + data.toString();}
        if (!errors.isEmpty()) {result += "====== Lexical Errors Found ======\n" + errors.toString();}

        return result;
    }

    public void readFile(String argv) {

        String encodingName = "UTF-8";

        try {
            java.io.FileInputStream stream = new java.io.FileInputStream(argv);
            this.zzReader = new java.io.InputStreamReader(stream, encodingName);

            while (!this.zzAtEOF) this.next_token();

          } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found : " + argv + "");
          } catch (java.io.IOException e) {
            System.out.println("IO error scanning file " + argv + "");
            System.out.println(e);
          } catch (Exception e) {
            System.out.println("Unexpected exception:");
            e.printStackTrace();
        }
      }

    /**
     * Creates a new scanner
     *
     */
    public Scanner() {
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
New_Line = \r|\n|\r\n
Identifier = [a-zA-Z][a-zA-Z0-9]*

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
Identifier_Error = [0-9]+{Identifier} | (([0-9]|{Identifier})*{Not_English}+([0-9]|{Identifier})*)*

// Elements to ignore
Ignored_Elements = {Comments} | [ \t\f ] | {New_Line}

%%
// Elements to ignore
    {Ignored_Elements} {/* DO NOTHING */}

// Reserved words

    "sizeof" {return new Symbol(sym.RESERVED_WORDS, yycolumn, yyline, yytext());}
    "union"|
    "extern"|
    "struct"|
    "typedef"|
    "_Packed"|
    "register" { data.addData(yytext(), Types.RESERVED_WORDS, yyline);
                return new Symbol(sym.RESERVED_WORDS, yycolumn, yyline, yytext());}

    "enum" { data.addData(yytext(), Types.RESERVED_ENUM, yyline);
             return new Symbol(sym.RESERVED_ENUM , yycolumn, yyline, yytext());
      }
    "switch" { data.addData(yytext(), Types.RESERVED_WORDS, yyline);
          return new Symbol(sym.SWITCH, yycolumn, yyline, yytext());
    }
    "const" { data.addData(yytext(), Types.RESERVED_WORDS, yyline);
          return new Symbol(sym.CONST, yycolumn, yyline, yytext());
    }
    "default" { data.addData(yytext(), Types.RESERVED_WORDS, yyline);
          return new Symbol(sym.DEFAULT, yycolumn, yyline, yytext());
    }
    "return" { data.addData(yytext(), Types.RESERVED_WORDS, yyline);
          return new Symbol(sym.RETURN, yycolumn, yyline, yytext());
    }

    // Conditional and jumps
    "auto"|
    "goto" { data.addData(yytext(), Types.RESERVED_CONDITION, yyline);
            return new Symbol(sym.RESERVED_CONDITION, yycolumn, yyline, yytext());
      }
    "if" { data.addData(yytext(), Types.RESERVED_CONDITION, yyline);
          return new Symbol(sym.IF, yycolumn, yyline, yytext()); }
    "case" { data.addData(yytext(), Types.RESERVED_CONDITION, yyline);
          return new Symbol(sym.CASE, yycolumn, yyline, yytext());
    }
    "else" { data.addData(yytext(), Types.RESERVED_CONDITION, yyline);
          return new Symbol(sym.ELSE, yycolumn, yyline, yytext()); }

    // Loops
    "while" { data.addData(yytext(), Types.RESERVED_LOOP, yyline);
          return new Symbol(sym.WHILE, yycolumn, yyline, yytext());
      }
    "for" { data.addData(yytext(), Types.RESERVED_LOOP, yyline);
          return new Symbol(sym.FOR, yycolumn, yyline, yytext());
      }
    "continue" { data.addData(yytext(), Types.RESERVED_LOOP, yyline);
          return new Symbol(sym.BREAK, yycolumn, yyline, yytext());
      }
    "break" { data.addData(yytext(), Types.RESERVED_LOOP, yyline);
          return new Symbol(sym.BREAK, yycolumn, yyline, yytext());
      }
    "do" { data.addData(yytext(), Types.RESERVED_LOOP, yyline);
          return new Symbol(sym.DO, yycolumn, yyline, yytext()); }

    // Data types
    "int" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline);
          return new Symbol(sym.INT, yycolumn, yyline, yytext());
      }
    "long" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline);
          return new Symbol(sym.LONG, yycolumn, yyline, yytext());
    }
    "void" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline);
          return new Symbol(sym.VOID, yycolumn, yyline, yytext());
    }
    "short" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline);
          return new Symbol(sym.SHORT, yycolumn, yyline, yytext());
    }
    "char" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline);
          return new Symbol(sym.CHAR, yycolumn, yyline, yytext());
    }
    "float"|
    "double" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline);
            return new Symbol(sym.RESERVED_DATA_TYPE, yycolumn, yyline, yytext());
      }

    // Data type modifiers
    "static"|
    "volatile"|
    "signed"|
    "unsigned" { data.addData(yytext(), Types.RESERVED_MODIFIER, yyline);
        return new Symbol(sym.RESERVED_MODIFIER, yycolumn, yyline, yytext());
      }

// ======= OPERATORS =======

    // Separators
    "," { data.addData(yytext(), Types.OPERATOR_SEPARATE, yyline);
        return new Symbol(sym.OPERATOR_SEPARATE, yycolumn, yyline, yytext());
    }
    ";" { data.addData(yytext(), Types.OPERATOR_END_LINE, yyline);
        return new Symbol(sym.OPERATOR_END_LINE, yycolumn, yyline, yytext());
    }
    \\ { data.addData(yytext(), Types.OPERATOR_CONTINUE_LINE, yyline);
        return new Symbol(sym.OPERATOR_CONTINUE_LINE, yycolumn, yyline, yytext());
    }

    // Math
    "+" { data.addData(yytext(), Types.OPERATOR_ADD, yyline);
         return new Symbol(sym.OPERATOR_ADD, yycolumn, yyline, yytext());
    }
    "-" { data.addData(yytext(), Types.OPERATOR_NEGATIVE, yyline);
        return new Symbol(sym.OPERATOR_NEGATIVE, yycolumn, yyline, yytext());
    }
    "*" { data.addData(yytext(), Types.OPERATOR_MULTIPLY, yyline);
        return new Symbol(sym.OPERATOR_MULTIPLY, yycolumn, yyline, yytext());
    }
    "/" { data.addData(yytext(), Types.OPERATOR_DIVIDE, yyline);
        return new Symbol(sym.OPERATOR_DIVIDE, yycolumn, yyline, yytext());
     }
    "%" { data.addData(yytext(), Types.OPERATOR_REMAINDER, yyline);
        return new Symbol(sym.OPERATOR_REMAINDER, yycolumn, yyline, yytext());
     }
    "++" { data.addData(yytext(), Types.OPERATOR_INC, yyline);
        return new Symbol(sym.OPERATOR_INC, yycolumn, yyline, yytext());
    }
    "--" { data.addData(yytext(), Types.OPERATOR_DEC, yyline);
        return new Symbol(sym.OPERATOR_DEC, yycolumn, yyline, yytext());
    }

    // Comparatives
    // Accepted by the parser
    "=="|
    ">="|
    ">"|
    "<="|
    "<"|
    "||"|
    "&&" { data.addData(yytext(), Types.OPERATOR_BOOLEAN, yyline);
                return new Symbol(sym.OPERATOR_COMPARATIVE, yycolumn, yyline, yytext());}
    "!" { data.addData(yytext(), Types.OPERATOR_BOOLEAN, yyline);
                        return new Symbol(sym.OPERATOR_NOT, yycolumn, yyline, yytext());}

    // Not accepted by the pars
    "!="|
    "?"|
    ":" { data.addData(yytext(), Types.OPERATOR_BOOLEAN, yyline);
        return new Symbol(sym.OPERATOR_BOOLEAN, yycolumn, yyline, yytext());
     }

    //
    //--------------------------------------------------------//
    "=" { data.addData(yytext(), Types.OPERATOR_ASSIGNMENT, yyline);
              return new Symbol(sym.OPERATOR_ASSIGNMENT, yycolumn, yyline, yytext()); }
        "+=" { data.addData(yytext(), Types.OPERATOR_ASSIGNMENT, yyline);
               return new Symbol(sym.OPERATOR_ASSIGNMENT, yycolumn, yyline, yytext()); }
        "-=" { data.addData(yytext(), Types.OPERATOR_ASSIGNMENT, yyline);
               return new Symbol(sym.OPERATOR_ASSIGNMENT, yycolumn, yyline, yytext()); }
        "*=" { data.addData(yytext(), Types.OPERATOR_ASSIGNMENT, yyline);
               return new Symbol(sym.OPERATOR_ASSIGNMENT, yycolumn, yyline, yytext()); }
        "/=" { data.addData(yytext(), Types.OPERATOR_ASSIGNMENT, yyline);
                return new Symbol(sym.OPERATOR_ASSIGNMENT, yycolumn, yyline, yytext()); }

    // Code Blocks
    "(" { data.addData(yytext(), Types.OPERATOR_PARENTHESIS, yyline);
           return new Symbol(sym.OPERATOR_PARENTHESIS_L, yycolumn, yyline, yytext()); }
    ")" { data.addData(yytext(), Types.OPERATOR_PARENTHESIS, yyline);
           return new Symbol(sym.OPERATOR_PARENTHESIS_R, yycolumn, yyline, yytext()); }

    "["|
    "]" {data.addData(yytext(), Types.OPERATOR_SQ_BRACKET, yyline);
        return new Symbol(sym.OPERATOR_SQ_BRACKET, yycolumn, yyline, yytext());
    }

    "{"|
    "}" {data.addData(yytext(), Types.OPERATOR_BRACKET, yyline);
        return new Symbol(sym.OPERATOR_BRACKET, yycolumn, yyline, yytext());
    }

    // Binary Operators
    "&"|
    "|"|
    "^"|
    "~"|
    "<<"|
    ">>" {data.addData(yytext(), Types.OPERATOR_BINARY, yyline);
          return new Symbol(sym.OPERATOR_BINARY, yycolumn, yyline, yytext());
     }

    // Memory Operators
    "->" {data.addData(yytext(), Types.OPERATOR_MEMORY, yyline);
        return new Symbol(sym.OPERATOR_MEMORY, yycolumn, yyline, yytext());
    }
    "." {data.addData(yytext(), Types.OPERATOR_DOT, yyline);
        return new Symbol(sym.OPERATOR_DOT, yycolumn, yyline, yytext());
    }

// Identifiers
    {Identifier} {data.addData(yytext(), Types.IDENTIFIER, yyline);
        return new Symbol(sym.IDENTIFIER, yycolumn, yyline, yytext());
    }


// Literals
    {String} {data.addData(yytext(), Types.LITERAL_STRING, yyline);
        return new Symbol(sym.LITERAL_STRING, yycolumn, yyline, yytext());
    }
    {Character} {data.addData(yytext(), Types.LITERAL_CHARACTER, yyline);
        return new Symbol(sym.LITERAL_CHARACTER, yycolumn, yyline, yytext());
    }

    {Decimal} {data.addData(yytext(), Types.LITERAL_DECIMAL, yyline);
        return new Symbol(sym.LITERAL_DECIMAL, yycolumn, yyline, yytext());
    }
    {Octal} {data.addData(yytext(), Types.LITERAL_OCTAL, yyline);
        return new Symbol(sym.LITERAL_OCTAL, yycolumn, yyline, yytext());
    }
    {Hexa} {data.addData(yytext(), Types.LITERAL_HEXA, yyline);
        return new Symbol(sym.LITERAL_HEXA, yycolumn, yyline, yytext());
    }
    {Flotante} {data.addData(yytext(), Types.LITERAL_FLOAT, yyline);
        return new Symbol(sym.LITERAL_FLOAT, yycolumn, yyline, yytext());
    }

    {FlotanteConExponente} {data.addData(yytext(), Types.LITERAL_EXPONENTIAL_FLOAT, yyline);
        return new Symbol(sym.LITERAL_EXPONENTIAL_FLOAT, yycolumn, yyline, yytext());
    }


// Errors

    {String_Error} {errors.addData(yytext(), Types.STRING_ERROR, yyline);
        return new Symbol(sym.STRING_ERROR, yycolumn, yyline, yytext());
    }
    {Comments_Error} {errors.addData(yytext(), Types.COMMENTS_ERROR, yyline);
        return new Symbol(sym.COMMENTS_ERROR, yycolumn, yyline, yytext());
    }
    {Character_Error} {errors.addData(yytext(), Types.CHARACTER_ERROR, yyline);
        return new Symbol(sym.CHARACTER_ERROR, yycolumn, yyline, yytext());
    }
    {Identifier_Error} {errors.addData(yytext(), Types.IDENTIFIER_ERROR, yyline);
        return new Symbol(sym.IDENTIFIER_ERROR, yycolumn, yyline, yytext());
    }
    {Float_Many_Dots}   {errors.addData(yytext(), Types.FLOAT_MANY_DOTS_ERROR, yyline);
      return new Symbol(sym.FLOAT_MANY_DOTS_ERROR, yycolumn, yyline, yytext());
    }
    . {errors.addData(yytext(), Types.UNKNOWN_ERROR, yyline);
        return new Symbol(sym.UNKNOWN_ERROR, yycolumn, yyline, yytext());
      }