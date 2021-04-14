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

%state NORMAL COMMENT STRING

Digit = \d
Letter = [a-zA-Z]

%%

<NORMAL> {

// Comment found


// String found


// Reserved words


// Identifiers

}

<COMMENT> {

}

<STRING> {

}