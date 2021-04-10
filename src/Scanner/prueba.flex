import java.util.*;
%%
%class numberExtraction
%standalone
%line
%column

Numbers = \d+\.?\d*

%{
    List<String> numbers = new ArrayList<String>();
%}

%eof{
    System.out.println("Numbers:");
    for(int i = 0; i < numbers.size(); i++) {
        System.out.println(numbers.get(i));
    }
%eof}

%%
{Numbers} {numbers.add(yytext());}
\n { /* Do Nothing */ }
. { /* Do Nothing */}
