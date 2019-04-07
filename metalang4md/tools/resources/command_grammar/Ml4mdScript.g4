grammar Ml4mdScript;

WS
  : [ \t\u000C\r\n]+ -> skip
  ;

command
  : 'add' add_expression
  | 'delete' del_expression
  | 'change' chg_expression
  ;

attribute
  : NAME '=' token
  | NAME '=' token ',' attribute
  ;

token
  : NAME
  | NUMBER
  ;

NAME
  : [a-zA-Z][a-zA-Z0-9]*
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
  : 'actor' '=' NAME
  ;

TYPE
  : 'type' '=' NAME
  ;

ITEM
  :	'item' '=' NAME
  ;

chg_expression
  : attribute 'from' element
  ;

del_expression
  : ACTOR 'from' ACTOR
  | TYPE 'from' ACTOR
  | element
  ;

add_expression
  : TYPE 'to' ACTOR
  | TYPE 'to' ACTOR metadata
  | element
  ;

metadata
  : 'with' metadata_option
  |
  ;

metadata_option
  : 'interaction' '=' interaction_behavior 'arising' '=' arising_behavior 'cardinality' '=' cardinality 'coordination' '=' coordination_behavior
  ;

interaction_behavior
  : 'sync'
  | 'async'
  ;

arising_behavior
  : 'static'
  | 'dynamic'
  ;

cardinality
  : 'one'
  | 'many'
  ;

coordination_behavior
  : 'local'
  | 'distributed'
  ;


