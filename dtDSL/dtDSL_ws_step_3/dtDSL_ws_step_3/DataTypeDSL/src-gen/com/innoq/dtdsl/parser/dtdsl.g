grammar dtdsl;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package com.innoq.dtdsl.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package com.innoq.dtdsl.parser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManagerNeu;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import com.innoq.dtdsl.MetaModelRegistration;

}
@lexer::members {
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

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}

	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == dtdslLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==dtdslLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==dtdslLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}


	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
    private ParseTreeManagerNeu ptm = new ParseTreeManagerNeu();
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	{
		
	}

	public ParseTreeManagerNeu getResult() {
		return ptm;
	}

	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	@Override
	public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		ptm.addError(msg, e);
		// This doesn't work. ANTLR may simply report an superfluous token. In that case,
		// two nodes will be finished instead of one.
		// ptm.ruleFinished(null, end());
	}

    private boolean skipCurrentToken;
    
	@Override
	protected boolean recoverFromMismatchedElement(IntStream arg0, RecognitionException arg1, BitSet arg2) {
		skipCurrentToken = true;
		return super.recoverFromMismatchedElement(arg0, arg1, arg2);
	}
}


parse returns [Node r]:
	 result=ruleReusableDatatype
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
{
if (result != null)
  ptm.setModelElement(result);
$r = ptm.getCurrent();
ptm.ruleFinished(result);}	 EOF
;

ruleReusableDatatype returns [EObject result]
:
        temp_primitivedatatype=rulePrimitiveDatatype {$result=temp_primitivedatatype;}	|        temp_datatype=ruleDatatype {$result=temp_datatype;}	;

rulePrimitiveDatatype returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "PrimitiveDatatype");
			 }
(({skipCurrentToken = false;}'primitiveDatatype'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'@type'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)));}temp_PrimitiveDatatypes=
rulePrimitiveDatatypes{if (temp_PrimitiveDatatypes != null) {
  hasContent = true;
  factory.set($result,"type",convert(temp_PrimitiveDatatypes),false);
  ptm.ruleFinished(temp_PrimitiveDatatypes);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleDatatype returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Datatype");
			 }
(({skipCurrentToken = false;}'datatype'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'@description'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)));
  factory.set($result,"description",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'@version'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_INT{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(6)));
  factory.set($result,"version",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(7)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

rulePrimitiveDatatypes returns [Enumerator r] :
		 'string'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)));
$r=factory.enumLit("", "PrimitiveDatatypes","stringDT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'char'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(2)));
$r=factory.enumLit("", "PrimitiveDatatypes","charDT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'boolean'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(3)));
$r=factory.enumLit("", "PrimitiveDatatypes","booleanDT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'short'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(4)));
$r=factory.enumLit("", "PrimitiveDatatypes","shortDT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'long'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(5)));
$r=factory.enumLit("", "PrimitiveDatatypes","longDT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'float'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(6)));
$r=factory.enumLit("", "PrimitiveDatatypes","floatDT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'integer'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(7)));
$r=factory.enumLit("", "PrimitiveDatatypes","integerDT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'octet'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(8)));
$r=factory.enumLit("", "PrimitiveDatatypes","octetDT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
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

