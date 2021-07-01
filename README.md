# Mini-C-Compiler

Project created for the Compilers & Interpreters class.

It is a compiler for a very small part of C, which transforms part of the code from a C program into NASM.
The compiler can handle code with a block of global variable declarations followed by function declarations.

It is only able to read if-else statements, while statements that support break and continue and assignments inside of the function blocks.

## Lexical Analysis
The compiler shows all the tokens inside of the C file at the end of the analysis.

## Syntactic Analysis
The compiler shows all the foreseen syntactic errors inside of the C file at the end of the analysis. 

## Semantic Analysis
The compiler shows the following semantic errors inside of the C file:
* Different data types.
* Incorrect amount of parameters when calling a function.
* Incorrect types of parameters when calling a function.
* Break or Continue outside of WHILE statement.
