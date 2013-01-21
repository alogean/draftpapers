/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.services.MyDslGrammarAccess;

}

@parser::members {
 
 	private MyDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }

}




// Entry rule entryRuleModel
entryRuleModel :
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
    @init {
		int stackSize = keepStackSize();
    }
 :
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImport
entryRuleImport :
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
    @init {
		int stackSize = keepStackSize();
    }
 :
(
{ before(grammarAccess.getImportAccess().getGroup()); }
(rule__Import__Group__0)
{ after(grammarAccess.getImportAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType :
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
    @init {
		int stackSize = keepStackSize();
    }
 :
(
{ before(grammarAccess.getTypeAccess().getAlternatives()); }
(rule__Type__Alternatives)
{ after(grammarAccess.getTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSimpleType
entryRuleSimpleType :
{ before(grammarAccess.getSimpleTypeRule()); }
	 ruleSimpleType
{ after(grammarAccess.getSimpleTypeRule()); } 
	 EOF 
;

// Rule SimpleType
ruleSimpleType 
    @init {
		int stackSize = keepStackSize();
    }
 :
(
{ before(grammarAccess.getSimpleTypeAccess().getGroup()); }
(rule__SimpleType__Group__0)
{ after(grammarAccess.getSimpleTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEntity
entryRuleEntity :
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
    @init {
		int stackSize = keepStackSize();
    }
 :
(
{ before(grammarAccess.getEntityAccess().getGroup()); }
(rule__Entity__Group__0)
{ after(grammarAccess.getEntityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProperty
entryRuleProperty :
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty 
    @init {
		int stackSize = keepStackSize();
    }
 :
(
{ before(grammarAccess.getPropertyAccess().getGroup()); }
(rule__Property__Group__0)
{ after(grammarAccess.getPropertyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Type__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); }
	ruleSimpleType
{ after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
	ruleEntity
{ after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getImportsAssignment_0()); }
(rule__Model__ImportsAssignment_0)*
{ after(grammarAccess.getModelAccess().getImportsAssignment_0()); }
)

	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getElementsAssignment_1()); }
(rule__Model__ElementsAssignment_1)*
{ after(grammarAccess.getModelAccess().getElementsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Import__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }

	'import' 

{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)

	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportURIAssignment_1()); }
(rule__Import__ImportURIAssignment_1)
{ after(grammarAccess.getImportAccess().getImportURIAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SimpleType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); }

	'type' 

{ after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); }
)

	rule__SimpleType__Group__1
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); }
(rule__SimpleType__NameAssignment_1)
{ after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Entity__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }

	'entity' 

{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)

	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
(rule__Entity__NameAssignment_1)
{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)

	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_2()); }
(rule__Entity__Group_2__0)?
{ after(grammarAccess.getEntityAccess().getGroup_2()); }
)

	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); }
)

	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); }
(rule__Entity__PropertiesAssignment_4)*
{ after(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); }
)

	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Entity__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); }

	'extends' 

{ after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); }
)

	rule__Entity__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); }
(rule__Entity__ExtendsAssignment_2_1)
{ after(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Property__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); }

	'property' 

{ after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); }
)

	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameAssignment_1()); }
(rule__Property__NameAssignment_1)
{ after(grammarAccess.getPropertyAccess().getNameAssignment_1()); }
)

	rule__Property__Group__2
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getPropertyAccess().getColonKeyword_2()); }
)

	rule__Property__Group__3
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); }
(rule__Property__TypeAssignment_3)
{ after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); }
)

	rule__Property__Group__4
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getManyAssignment_4()); }
(rule__Property__ManyAssignment_4)?
{ after(grammarAccess.getPropertyAccess().getManyAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Model__ImportsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); }
	ruleImport{ after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ElementsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); }
	ruleType{ after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportURIAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__ExtendsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); }
(
{ before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__PropertiesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); }
	ruleProperty{ after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); }
(
{ before(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); }
	RULE_ID{ after(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); }
)
{ after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__ManyAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
(
{ before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }

	'[]' 

{ after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
)

{ after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

