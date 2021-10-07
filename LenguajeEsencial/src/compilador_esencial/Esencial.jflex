package compilador_esencial;

import java_cup.runtime.*;


%%

%public

%class Scanner

%cup

%line

%column

%unicode

%standalone


Identifier = [:jletter:] [:jletterdigit:]*
DecIntegerLiteral = 0 | [1-9][0-9]*

%%

"while" { return new Symbol(sym.MIENTRAS); }
"<> 0" { return new Symbol(sym.DISTINTOCERO); }
"do" { return new Symbol(sym.HACER); }
"end" { return new Symbol(sym.END); }
"incr" { return new Symbol(sym.INCR); }
"decr" { return new Symbol(sym.DECR); }
"=" { return new Symbol(sym.IGUAL); }
";" { return new Symbol(sym.PUNTOYCOMA); }
{DecIntegerLiteral} { return new Symbol(sym.NUMERO); }
{Identifier} { return new Symbol(sym.ID); }

