lexer grammar dtdsl;
@members {
	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg;
	}
}
@header {
package com.innoq.dtdsl.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'primitiveDatatype' ;
T11 : '{' ;
T12 : '@type' ;
T13 : '}' ;
T14 : 'datatype' ;
T15 : '@description' ;
T16 : '@version' ;
T17 : 'string' ;
T18 : 'char' ;
T19 : 'boolean' ;
T20 : 'short' ;
T21 : 'long' ;
T22 : 'float' ;
T23 : 'integer' ;
T24 : 'octet' ;

// $ANTLR src "..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g" 298
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g" 304
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g" 311
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g" 317
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g" 323
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g" 329
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

