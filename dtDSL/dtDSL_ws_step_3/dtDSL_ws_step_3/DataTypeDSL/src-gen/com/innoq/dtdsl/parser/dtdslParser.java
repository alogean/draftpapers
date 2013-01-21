// $ANTLR 3.0 ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g 2009-04-12 03:04:04

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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class dtdslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'primitiveDatatype'", "'{'", "'@type'", "'}'", "'datatype'", "'@description'", "'@version'", "'string'", "'char'", "'boolean'", "'short'", "'long'", "'float'", "'integer'", "'octet'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public dtdslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[13+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g"; }



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



    // $ANTLR start parse
    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:101:1: parse returns [Node r] : result= ruleReusableDatatype EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:102:3: (result= ruleReusableDatatype EOF )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:102:3: result= ruleReusableDatatype EOF
            {
            pushFollow(FOLLOW_ruleReusableDatatype_in_parse67);
            result=ruleReusableDatatype();
            _fsp--;
            if (failed) return r;
            if ( backtracking==0 ) {

              if (result != null)
                ptm.setModelElement(result);
              r = ptm.getCurrent();
              ptm.ruleFinished(result);
            }
            match(input,EOF,FOLLOW_EOF_in_parse78); if (failed) return r;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start ruleReusableDatatype
    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:112:1: ruleReusableDatatype returns [EObject result] : (temp_primitivedatatype= rulePrimitiveDatatype | temp_datatype= ruleDatatype );
    public EObject ruleReusableDatatype() throws RecognitionException {
        EObject result = null;
        int ruleReusableDatatype_StartIndex = input.index();
        EObject temp_primitivedatatype = null;

        EObject temp_datatype = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:114:9: (temp_primitivedatatype= rulePrimitiveDatatype | temp_datatype= ruleDatatype )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("112:1: ruleReusableDatatype returns [EObject result] : (temp_primitivedatatype= rulePrimitiveDatatype | temp_datatype= ruleDatatype );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:114:9: temp_primitivedatatype= rulePrimitiveDatatype
                    {
                    pushFollow(FOLLOW_rulePrimitiveDatatype_in_ruleReusableDatatype101);
                    temp_primitivedatatype=rulePrimitiveDatatype();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_primitivedatatype;
                    }

                    }
                    break;
                case 2 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:114:97: temp_datatype= ruleDatatype
                    {
                    pushFollow(FOLLOW_ruleDatatype_in_ruleReusableDatatype116);
                    temp_datatype=ruleDatatype();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_datatype;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, ruleReusableDatatype_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleReusableDatatype


    // $ANTLR start rulePrimitiveDatatype
    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:116:1: rulePrimitiveDatatype returns [EObject result] : ( ( 'primitiveDatatype' ) ( RULE_ID ) ( '{' ) ( '@type' ) (temp_PrimitiveDatatypes= rulePrimitiveDatatypes ) ( '}' ) ) ;
    public EObject rulePrimitiveDatatype() throws RecognitionException {
        EObject result = null;
        int rulePrimitiveDatatype_StartIndex = input.index();
        Enumerator temp_PrimitiveDatatypes = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:119:4: ( ( ( 'primitiveDatatype' ) ( RULE_ID ) ( '{' ) ( '@type' ) (temp_PrimitiveDatatypes= rulePrimitiveDatatypes ) ( '}' ) ) )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:119:4: ( ( 'primitiveDatatype' ) ( RULE_ID ) ( '{' ) ( '@type' ) (temp_PrimitiveDatatypes= rulePrimitiveDatatypes ) ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "PrimitiveDatatype");
              			 
            }
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:122:1: ( ( 'primitiveDatatype' ) ( RULE_ID ) ( '{' ) ( '@type' ) (temp_PrimitiveDatatypes= rulePrimitiveDatatypes ) ( '}' ) )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:122:2: ( 'primitiveDatatype' ) ( RULE_ID ) ( '{' ) ( '@type' ) (temp_PrimitiveDatatypes= rulePrimitiveDatatypes ) ( '}' )
            {
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:122:2: ( 'primitiveDatatype' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:122:3: 'primitiveDatatype'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,10,FOLLOW_10_in_rulePrimitiveDatatype144); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:128:1: ( RULE_ID )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:128:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveDatatype152); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:138:1: ( '{' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:138:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,11,FOLLOW_11_in_rulePrimitiveDatatype160); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:144:1: ( '@type' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:144:2: '@type'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_rulePrimitiveDatatype167); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:150:1: (temp_PrimitiveDatatypes= rulePrimitiveDatatypes )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:150:2: temp_PrimitiveDatatypes= rulePrimitiveDatatypes
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)));
            }
            pushFollow(FOLLOW_rulePrimitiveDatatypes_in_rulePrimitiveDatatype177);
            temp_PrimitiveDatatypes=rulePrimitiveDatatypes();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_PrimitiveDatatypes != null) {
                hasContent = true;
                factory.set(result,"type",convert(temp_PrimitiveDatatypes),false);
                ptm.ruleFinished(temp_PrimitiveDatatypes);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:161:1: ( '}' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:161:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_rulePrimitiveDatatype185); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, rulePrimitiveDatatype_StartIndex); }
        }
        return result;
    }
    // $ANTLR end rulePrimitiveDatatype


    // $ANTLR start ruleDatatype
    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:174:1: ruleDatatype returns [EObject result] : ( ( 'datatype' ) ( RULE_ID ) ( '{' ) ( '@description' ) ( RULE_STRING ) ( '@version' ) ( RULE_INT ) ( '}' ) ) ;
    public EObject ruleDatatype() throws RecognitionException {
        EObject result = null;
        int ruleDatatype_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:177:4: ( ( ( 'datatype' ) ( RULE_ID ) ( '{' ) ( '@description' ) ( RULE_STRING ) ( '@version' ) ( RULE_INT ) ( '}' ) ) )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:177:4: ( ( 'datatype' ) ( RULE_ID ) ( '{' ) ( '@description' ) ( RULE_STRING ) ( '@version' ) ( RULE_INT ) ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Datatype");
              			 
            }
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:180:1: ( ( 'datatype' ) ( RULE_ID ) ( '{' ) ( '@description' ) ( RULE_STRING ) ( '@version' ) ( RULE_INT ) ( '}' ) )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:180:2: ( 'datatype' ) ( RULE_ID ) ( '{' ) ( '@description' ) ( RULE_STRING ) ( '@version' ) ( RULE_INT ) ( '}' )
            {
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:180:2: ( 'datatype' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:180:3: 'datatype'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleDatatype223); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:186:1: ( RULE_ID )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:186:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatatype231); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:196:1: ( '{' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:196:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,11,FOLLOW_11_in_ruleDatatype239); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:202:1: ( '@description' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:202:2: '@description'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleDatatype246); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:208:1: ( RULE_STRING )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:208:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatatype254); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)));
                factory.set(result,"description",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:218:1: ( '@version' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:218:2: '@version'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleDatatype262); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:224:1: ( RULE_INT )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:224:2: RULE_INT
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDatatype270); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(6)));
                factory.set(result,"version",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:234:1: ( '}' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:234:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleDatatype278); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(7)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, ruleDatatype_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDatatype


    // $ANTLR start rulePrimitiveDatatypes
    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:247:1: rulePrimitiveDatatypes returns [Enumerator r] : ( 'string' | 'char' | 'boolean' | 'short' | 'long' | 'float' | 'integer' | 'octet' );
    public Enumerator rulePrimitiveDatatypes() throws RecognitionException {
        Enumerator r = null;
        int rulePrimitiveDatatypes_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return r; }
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:248:4: ( 'string' | 'char' | 'boolean' | 'short' | 'long' | 'float' | 'integer' | 'octet' )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            case 23:
                {
                alt2=7;
                }
                break;
            case 24:
                {
                alt2=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("247:1: rulePrimitiveDatatypes returns [Enumerator r] : ( 'string' | 'char' | 'boolean' | 'short' | 'long' | 'float' | 'integer' | 'octet' );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:248:4: 'string'
                    {
                    match(input,17,FOLLOW_17_in_rulePrimitiveDatatypes306); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)));
                      r =factory.enumLit("", "PrimitiveDatatypes","stringDT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 2 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:254:7: 'char'
                    {
                    match(input,18,FOLLOW_18_in_rulePrimitiveDatatypes319); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(2)));
                      r =factory.enumLit("", "PrimitiveDatatypes","charDT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 3 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:260:7: 'boolean'
                    {
                    match(input,19,FOLLOW_19_in_rulePrimitiveDatatypes332); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(3)));
                      r =factory.enumLit("", "PrimitiveDatatypes","booleanDT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 4 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:266:7: 'short'
                    {
                    match(input,20,FOLLOW_20_in_rulePrimitiveDatatypes345); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(4)));
                      r =factory.enumLit("", "PrimitiveDatatypes","shortDT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 5 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:272:7: 'long'
                    {
                    match(input,21,FOLLOW_21_in_rulePrimitiveDatatypes358); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(5)));
                      r =factory.enumLit("", "PrimitiveDatatypes","longDT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 6 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:278:7: 'float'
                    {
                    match(input,22,FOLLOW_22_in_rulePrimitiveDatatypes371); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(6)));
                      r =factory.enumLit("", "PrimitiveDatatypes","floatDT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 7 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:284:7: 'integer'
                    {
                    match(input,23,FOLLOW_23_in_rulePrimitiveDatatypes384); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(7)));
                      r =factory.enumLit("", "PrimitiveDatatypes","integerDT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;
                case 8 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:290:7: 'octet'
                    {
                    match(input,24,FOLLOW_24_in_rulePrimitiveDatatypes397); if (failed) return r;
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(8)));
                      r =factory.enumLit("", "PrimitiveDatatypes","octetDT");
                      ptm.setModelElement(r);
                      ptm.ruleFinished(getLastToken());

                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, rulePrimitiveDatatypes_StartIndex); }
        }
        return r;
    }
    // $ANTLR end rulePrimitiveDatatypes


 

    public static final BitSet FOLLOW_ruleReusableDatatype_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDatatype_in_ruleReusableDatatype101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleReusableDatatype116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rulePrimitiveDatatype144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveDatatype152 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePrimitiveDatatype160 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrimitiveDatatype167 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_rulePrimitiveDatatypes_in_rulePrimitiveDatatype177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePrimitiveDatatype185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDatatype223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype231 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDatatype239 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDatatype246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatatype254 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDatatype262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDatatype270 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDatatype278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveDatatypes306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveDatatypes319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimitiveDatatypes332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveDatatypes345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDatatypes358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveDatatypes371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveDatatypes384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveDatatypes397 = new BitSet(new long[]{0x0000000000000002L});

}