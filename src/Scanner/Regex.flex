import java.util.*;
import Scanner.DataStructure.*;
import Scanner.Constants.*;

%%
%public
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
    System.out.println(data.toString());
%eof}

%%

{Numbers} {}
{Token} {}


if|
do|
for|
int|
auto|
else|
long|
enum|
case|
char|
void|
goto|
break|
union|
float|
short|
const|
while|
switch|
extern|
return|
signed|
sizeof|
static|
struct|
double|
typedef|
default|
_Packed|
register|
unsigned|
continue|
volatile|
char {
    HashNode symbol = new HashNode(yytext(), Types.RESERVED_WORDS);
    data.addData(symbol, yyline);
}



\n { System.out.println("SALTO DE LINEA"); }
. { System.out.println("PUNTO"); }
