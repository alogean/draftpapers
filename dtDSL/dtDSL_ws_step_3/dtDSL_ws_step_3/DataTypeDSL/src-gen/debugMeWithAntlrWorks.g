grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleReusableDatatype
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
	 EOF
;

ruleReusableDatatype 
:
        temp_primitivedatatype=rulePrimitiveDatatype 	|        temp_datatype=ruleDatatype 	;

rulePrimitiveDatatype 

:
(('primitiveDatatype')

(RULE_ID)

('{')

('@type')

(rulePrimitiveDatatypes)

('}')
)
;

ruleDatatype 

:
(('datatype')

(RULE_ID)

('{')

('@description')

(RULE_STRING)

('@version')

(RULE_INT)

('}')
)
;

rulePrimitiveDatatypes  :
		 'string'
		 
	 |		 'char'
		 
	 |		 'boolean'
		 
	 |		 'short'
		 
	 |		 'long'
		 
	 |		 'float'
		 
	 |		 'integer'
		 
	 |		 'octet'
		 
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

