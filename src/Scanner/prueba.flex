import java.util.*;
import DataStructure.Structure;
%%
%class Scanner
%standalone
%line
%column

Numbers = \d+\.?\d*
Token = [a-zA-Z]

%{
    Structure data = new Structure();
%}

%eof{
    System.out.println("Numbers:");
    for(int i = 0; i < numbers.size(); i++) {
        System.out.println(numbers.get(i) + " Line: " + line.get(i).toString());
    }
%eof}

%%

{Numbers} {}
{Token} {}
\n { System.out.println("SALTO DE LINEA"); }
. { System.out.println("PUNTO"); }
