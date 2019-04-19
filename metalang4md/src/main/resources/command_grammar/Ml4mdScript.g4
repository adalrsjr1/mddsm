grammar Ml4mdScript;

fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment Ç : [çÇ];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

WS
  : [ \t\u000C\r\n]+ -> skip
  ;

ADD
  : A D D
  ;

DELETE
  : D E L E T E
  ;

CHANGE
  : C H A N G E
  ;

IN
  : I N
  ;

FROM
  : F R O M
  ;

WITH
  : W I T H
  ;

TO
  : T O
  ;

ASSIGNMENT
  : '='
  ;

command
  : ADD add_expression
  | DELETE del_expression
  | CHANGE chg_expression
  ;

add_expression
  : TYPE TO ACTOR
  | TYPE TO ACTOR metadata_option_type
  | ITEM TO ITEM
  | ITEM metadata_option_item
  | element
  ;

chg_expression
  : attribute IN element
  ;

attribute
  : NAME ASSIGNMENT token
  | NAME ASSIGNMENT token ',' attribute
  ;

token
  : NAME
  | NUMBER
  | ANY
  ;

ANY
  : (NAME | NUMBER | SPECIAL | ' ')+
  ;

del_expression
  : ACTOR FROM ACTOR
  | TYPE FROM ACTOR
  | ITEM FROM ITEM
  | element
  ;



SPECIAL
  : (','|'.'|'?'|'!'|'('|')'|'['|']'|'{'|'}'|'&'|'|'|'/'|'\\'|'-'|'='|'%'|'#'|'$'|'\''|'"'|'+'|'*'|'_'|'@'|':'|'<'|'>')
  ;

NAME
  : [a-zA-Z]([a-zA-Z0-9]|SPECIAL)*
  ;

NUMBER
  : [1-9][0-9]*(.[0-9]+)?
  ;

element
  : ACTOR
  | TYPE
  | ITEM
  ;

ACTOR
  : ANY ASSIGNMENT ANY
  ;

TYPE
  : ANY ASSIGNMENT ANY
  ;

ITEM
  :	ANY ASSIGNMENT ANY
  ;

metadata_option_type
  : WITH INTERACTION ASSIGNMENT interaction_behavior CARDINALITY ASSIGNMENT cardinality COORDINATION ASSIGNMENT coordination_behavior
  ;

INTERACTION
  : I N T E R A C T I O N
  ;

CARDINALITY
  : C A R D I N A L I T Y
  ;

COORDINATION
  : C O O R D I N A T I O N
  ;

ARISING
  : A R I S I N G
  ;

SYNC
  : S Y N C
  ;

ASYNC
  : A S Y N C
  ;

STATIC
  : S T A T I C
  ;

DYNAMIC
  : D Y N A M I C
  ;

ONE
  : O N E
  ;

MANY
  : M A N Y
  ;

LOCAL
  : L O C A L
  ;

DISTRIBUTED
  : D I S T R I B U T E D
  ;

metadata_option_item
  : WITH ARISING ASSIGNMENT arising_behavior
  ;

interaction_behavior
  : SYNC
  | ASYNC
  ;

arising_behavior
  : STATIC
  | DYNAMIC
  ;

cardinality
  : ONE
  | MANY
  ;

coordination_behavior
  : LOCAL
  | DISTRIBUTED
  ;


