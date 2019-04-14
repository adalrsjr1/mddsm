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
  : attribute 'in' element
  ;

del_expression
  : ACTOR 'from' ACTOR
  | TYPE 'from' ACTOR
  | ITEM 'from' ITEM
  | element
  ;

add_expression
  : TYPE 'to' ACTOR
  | TYPE 'to' ACTOR metadata_option_type
  | ITEM 'to' ITEM
  | ITEM metadata_option_item
  | element
  ;

metadata_option_type
  : 'with' 'interaction' '=' interaction_behavior 'cardinality' '=' cardinality 'coordination' '=' coordination_behavior
  ;

metadata_option_item
  : 'with' 'arising' '=' arising_behavior
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


