grammar Simple;

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

prog: ( stat? NEWLINE )* ;

stat:	 ID '=' expr0		#assign
	| PRINT ID   		    #print
	| READ ID               #read
;

expr0:  expr1			    #single0
      | expr1 ADD expr1		#add
      | expr1 SUB expr1     #sub
;

expr1:  expr2			    #single1
      | expr2 MULT expr2	#mult
      | expr2 DIV expr2     #div
;

expr2:   ID                 #exid
       | INT			    #int
       | REAL			    #real
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

PRINT:	'print'
    ;

READ:	'read'
   ;

TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

REAL: '0'..'9'+'.''0'..'9'+
    ;

INT: '0'..'9'+
    ;

ADD: '+' ;
MULT: '*' ;
SUB: '-' ;
DIV: '/' ;

NEWLINE:	'\r'? '\n'
    ;

WS: ( [ \t\r\n]) -> skip ;

COMMENT : '#' ~[\r\n]* NEWLINE? -> skip ;