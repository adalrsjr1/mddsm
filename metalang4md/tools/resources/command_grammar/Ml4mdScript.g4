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
  : 'actor'
  | 'type'
  | 'item'
  ;

chg_expression
  : attribute 'from' element
  ;

del_expression
  : 'actor' 'from' 'actor'
  | 'type' 'from' 'actor'
  | element
  ;

add_expression
  : 'actor' 'to' 'actor'
  | 'type' 'to' 'actor' metadata
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


