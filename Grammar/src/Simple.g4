grammar Simple;

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

prog: ( stat? NEWLINE )* ;

stat:
        WRITE ID		#write
	|   ID '=' expr		#assign
	|   READ ID   		#read
;

expr:
    value ADD expr      #add
    | value             #single
;

value:
    ID
    | INT
    | REAL
;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

WRITE:	'write'
   ;

READ:	'read'
   ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

REAL: '0'..'9'+'.''0'..'9'+
    ;

INT:   '0'..'9'+
    ;

ADD:    '+'
    ;

NEWLINE:	'\r'? '\n'
    ;

WS: ( [ \t\r\n]) -> skip ;

COMMENT : '#' ~[\r\n]* NEWLINE? -> skip ;