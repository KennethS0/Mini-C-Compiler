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

%{
private Structure data = new Structure();
private Structure errors = new Structure();

public Structure getData() {
    return this.data;
}

public Structure getErrors() {
    return this.errors;
}

/**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   */
  public void readFile(String argv) {

        int firstFilePos = 0;
        String encodingName = "UTF-8";

        try {
            java.io.FileInputStream stream = new java.io.FileInputStream(argv);
            this.zzReader = new java.io.InputStreamReader(stream, encodingName);

            while (!this.zzAtEOF) this.yylex();

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

// End of file
%eof{
    System.out.println("===== Tokens: ====== \n");
    System.out.println(data.toString());
    System.out.println("======== Errors:  ====== \n");
    System.out.println(errors.toString());
%eof}


/*
    MACROS
*/

// Numbers
Digit = \d

Decimal = [1-9][0-9]* | 0
Octal = 0[1-7][0-7]*
Hexa = 0x[1-9A-F][0-9A-F]*
Flotante = {Decimal}\.[0-9]+
FlotanteConExponente = ({Flotante}|{Decimal})[eE]\-?{Decimal}

// English Letters
Letter = [a-zA-Z]

// Ignored Characters
Space = \s|\t
New_Line = \n

Identifier = {Letter}({Letter}|{Digit})*

// Literals
Escape_Characters = (a|b|f|n|r|t|v|\\|\'|\"|\?|nnn|xhh|0)
Character = \'[^\'\"]\' | \'\' | \'\\{Escape_Characters}\'
String = \".*\"

// Specific Errors
Identifier_Error = {Digit}+{Identifier}
Comments_Error = \/\*([^(\*\/)])*
String_Error = \"[^\"]*
Character_Error = \'.*\' | \'.*

// Comments
Single_Line_Comment = \/\/.*
Multi_Line_Comment =  \/\*[^*]*\*+([^*/][^*]*\*+)*\/ // \/\*(.*?|\n*)\*\/
Comments = {Single_Line_Comment}|{Multi_Line_Comment}

// Elements to ignore
Ignored_Elements = {Comments} | {Space} | {New_Line}

// Generic Errors
Errors = {Identifier_Error} | {Flotante}(\.{Digit})+ | {Comments_Error} | {String_Error} | {Character_Error}

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
    "register" { data.addData(yytext(), Types.RESERVED_WORDS, yyline); }

    "enum" { data.addData(yytext(), Types.RESERVED_ENUM, yyline); }

    // Conditional and jumps
    "if"|
    "auto"|
    "else"|
    "case"|
    "goto" { data.addData(yytext(), Types.RESERVED_CONDITION, yyline); }

    // Loops
    "do"|
    "while"|
    "for"|
    "continue"|
    "break" { data.addData(yytext(), Types.RESERVED_LOOP, yyline); }

    // Data types
    "int"|
    "void"|
    "long"|
    "char"|
    "float"|
    "short"|
    "double" { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline); }

    // Data type modifiers
    "static"|
    "volatile"|
    "signed"|
    "unsigned" { data.addData(yytext(), Types.RESERVED_MODIFIER, yyline); }

// OPERATORS

    // Separators
    "," { data.addData(yytext(), Types.OPERATOR_SEPARATE, yyline); }
    ";" { data.addData(yytext(), Types.OPERATOR_END_LINE, yyline); }
    \\ { data.addData(yytext(), Types.OPERATOR_CONTINUE_LINE, yyline); }

    // Math
    "+" { data.addData(yytext(), Types.OPERATOR_ADD, yyline); }
    "-" { data.addData(yytext(), Types.OPERATOR_NEGATIVE, yyline); }
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
    "!"|
    "?"|
    ":" { data.addData(yytext(), Types.OPERATOR_BOOLEAN, yyline); }

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
    "|=" { data.addData(yytext(), Types.OPERATOR_ASSIGNMENT, yyline); }

    // Code Blocks
    "("|
    ")" { data.addData(yytext(), Types.OPERATOR_PARENTHESIS, yyline); }

    "["|
    "]" {data.addData(yytext(), Types.OPERATOR_SQ_BRACKET, yyline); }

    "{"|
    "}" {data.addData(yytext(), Types.OPERATOR_BRACKET, yyline); }

    // Binary Operators
    "&"|
    "|"|
    "^"|
    "~"|
    "<<"|
    ">>" {data.addData(yytext(), Types.OPERATOR_BINARY, yyline); }

    // Memory Operators
    "->" {data.addData(yytext(), Types.OPERATOR_MEMORY, yyline); }

// Identifiers
    {Identifier} {data.addData(yytext(), Types.IDENTIFIER, yyline);}

// Literals
    {String} {data.addData(yytext(), Types.LITERAL_STRING, yyline);}
    {Character} {data.addData(yytext(), Types.LITERAL_CHARACTER, yyline);}

    {Decimal} {data.addData(yytext(), Types.LITERAL_DECIMAL, yyline);}
    {Octal} {data.addData(yytext(), Types.LITERAL_OCTAL, yyline);}
    {Hexa} {data.addData(yytext(), Types.LITERAL_HEXA, yyline);}
    {Flotante} {data.addData(yytext(), Types.LITERAL_FLOAT, yyline);}

    {FlotanteConExponente} {data.addData(yytext(), Types.LITERAL_EXPONENTIAL_FLOAT, yyline);}


// Error
    {Errors} | . {errors.addData(yytext(), Types.ERROR, yyline); }