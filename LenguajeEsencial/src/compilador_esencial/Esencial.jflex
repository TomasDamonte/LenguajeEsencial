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
{Identifier} { return new Symbol(sym.ID); }
"while" { return new Symbol(sym.WHILE); }
"<>" { return new Symbol(sym.DISTINTO); }
"do" { return new Symbol(sym.DO); }
"end" { return new Symbol(sym.END); }
"incr" { return new Symbol(sym.INCR); }
";" { return new Symbol(sym.PUNTOYCOMA); }
"decr" { return new Symbol(sym.DECR); }
"=" { return new Symbol(sym.IGUAL); }
{DecIntegerLiteral} { return symbol(sym.NUMERO); }

