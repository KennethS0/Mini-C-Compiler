import java.util.*;
%%
%class numberExtraction
%standalone
%line
%column

Numbers = \d+\.?\d*

Token = [a-zA-Z]

%{
    List<String> numbers = new ArrayList<String>();
    List<Integer> line = new ArrayList<Integer>();
%}

%eof{
    System.out.println("Numbers:");
    for(int i = 0; i < numbers.size(); i++) {
        System.out.println(numbers.get(i) + " Line: " + line.get(i).toString());
    }
%eof}

%%

{Numbers} {numbers.add(yytext()); line.add(yyline);}
{Token} {System.out.println(yytext());}
\n { System.out.println("SALTO DE LINEA"); }
. { System.out.println("PUNTO"); }
