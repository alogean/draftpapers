// $ANTLR 3.0 ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g 2009-04-12 03:04:04

package com.innoq.dtdsl.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class dtdslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int Tokens=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=7;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;

    	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg;
    	}

    public dtdslLexer() {;} 
    public dtdslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:22:7: ( 'primitiveDatatype' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:22:7: 'primitiveDatatype'
            {
            match("primitiveDatatype"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:23:7: ( '{' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:23:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:24:7: ( '@type' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:24:7: '@type'
            {
            match("@type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:25:7: ( '}' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:25:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:26:7: ( 'datatype' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:26:7: 'datatype'
            {
            match("datatype"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:27:7: ( '@description' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:27:7: '@description'
            {
            match("@description"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:28:7: ( '@version' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:28:7: '@version'
            {
            match("@version"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:29:7: ( 'string' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:29:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:30:7: ( 'char' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:30:7: 'char'
            {
            match("char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:31:7: ( 'boolean' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:31:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:32:7: ( 'short' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:32:7: 'short'
            {
            match("short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:33:7: ( 'long' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:33:7: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:34:7: ( 'float' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:34:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:35:7: ( 'integer' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:35:7: 'integer'
            {
            match("integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:36:7: ( 'octet' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:36:7: 'octet'
            {
            match("octet"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:300:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:300:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:300:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:300:4: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:300:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:306:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("304:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:306:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:306:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:306:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:306:53: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:307:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:307:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:307:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:307:54: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:313:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:313:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:313:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:313:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:313:9: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:313:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_WS
    public void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:319:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:319:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:319:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ML_COMMENT
    public void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:325:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:325:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:325:8: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:325:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:331:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:331:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:331:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:331:8: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:331:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:331:22: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    public void mTokens() throws RecognitionException {
        // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=21;
        switch ( input.LA(1) ) {
        case 'p':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                int LA12_18 = input.LA(3);

                if ( (LA12_18=='i') ) {
                    int LA12_33 = input.LA(4);

                    if ( (LA12_33=='m') ) {
                        int LA12_43 = input.LA(5);

                        if ( (LA12_43=='i') ) {
                            int LA12_53 = input.LA(6);

                            if ( (LA12_53=='t') ) {
                                int LA12_63 = input.LA(7);

                                if ( (LA12_63=='i') ) {
                                    int LA12_71 = input.LA(8);

                                    if ( (LA12_71=='v') ) {
                                        int LA12_76 = input.LA(9);

                                        if ( (LA12_76=='e') ) {
                                            int LA12_80 = input.LA(10);

                                            if ( (LA12_80=='D') ) {
                                                int LA12_82 = input.LA(11);

                                                if ( (LA12_82=='a') ) {
                                                    int LA12_83 = input.LA(12);

                                                    if ( (LA12_83=='t') ) {
                                                        int LA12_84 = input.LA(13);

                                                        if ( (LA12_84=='a') ) {
                                                            int LA12_85 = input.LA(14);

                                                            if ( (LA12_85=='t') ) {
                                                                int LA12_86 = input.LA(15);

                                                                if ( (LA12_86=='y') ) {
                                                                    int LA12_87 = input.LA(16);

                                                                    if ( (LA12_87=='p') ) {
                                                                        int LA12_88 = input.LA(17);

                                                                        if ( (LA12_88=='e') ) {
                                                                            int LA12_89 = input.LA(18);

                                                                            if ( ((LA12_89>='0' && LA12_89<='9')||(LA12_89>='A' && LA12_89<='Z')||LA12_89=='_'||(LA12_89>='a' && LA12_89<='z')) ) {
                                                                                alt12=16;
                                                                            }
                                                                            else {
                                                                                alt12=1;}
                                                                        }
                                                                        else {
                                                                            alt12=16;}
                                                                    }
                                                                    else {
                                                                        alt12=16;}
                                                                }
                                                                else {
                                                                    alt12=16;}
                                                            }
                                                            else {
                                                                alt12=16;}
                                                        }
                                                        else {
                                                            alt12=16;}
                                                    }
                                                    else {
                                                        alt12=16;}
                                                }
                                                else {
                                                    alt12=16;}
                                            }
                                            else {
                                                alt12=16;}
                                        }
                                        else {
                                            alt12=16;}
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=16;}
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
            }
            else {
                alt12=16;}
            }
            break;
        case '{':
            {
            alt12=2;
            }
            break;
        case '@':
            {
            switch ( input.LA(2) ) {
            case 'v':
                {
                alt12=7;
                }
                break;
            case 't':
                {
                alt12=3;
                }
                break;
            case 'd':
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 3, input);

                throw nvae;
            }

            }
            break;
        case '}':
            {
            alt12=4;
            }
            break;
        case 'd':
            {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='a') ) {
                int LA12_22 = input.LA(3);

                if ( (LA12_22=='t') ) {
                    int LA12_34 = input.LA(4);

                    if ( (LA12_34=='a') ) {
                        int LA12_44 = input.LA(5);

                        if ( (LA12_44=='t') ) {
                            int LA12_54 = input.LA(6);

                            if ( (LA12_54=='y') ) {
                                int LA12_64 = input.LA(7);

                                if ( (LA12_64=='p') ) {
                                    int LA12_72 = input.LA(8);

                                    if ( (LA12_72=='e') ) {
                                        int LA12_77 = input.LA(9);

                                        if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                                            alt12=16;
                                        }
                                        else {
                                            alt12=5;}
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=16;}
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
            }
            else {
                alt12=16;}
            }
            break;
        case 's':
            {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA12_23 = input.LA(3);

                if ( (LA12_23=='r') ) {
                    int LA12_35 = input.LA(4);

                    if ( (LA12_35=='i') ) {
                        int LA12_45 = input.LA(5);

                        if ( (LA12_45=='n') ) {
                            int LA12_55 = input.LA(6);

                            if ( (LA12_55=='g') ) {
                                int LA12_65 = input.LA(7);

                                if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                                    alt12=16;
                                }
                                else {
                                    alt12=8;}
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
                }
                break;
            case 'h':
                {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='o') ) {
                    int LA12_36 = input.LA(4);

                    if ( (LA12_36=='r') ) {
                        int LA12_46 = input.LA(5);

                        if ( (LA12_46=='t') ) {
                            int LA12_56 = input.LA(6);

                            if ( ((LA12_56>='0' && LA12_56<='9')||(LA12_56>='A' && LA12_56<='Z')||LA12_56=='_'||(LA12_56>='a' && LA12_56<='z')) ) {
                                alt12=16;
                            }
                            else {
                                alt12=11;}
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
                }
                break;
            default:
                alt12=16;}

            }
            break;
        case 'c':
            {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='h') ) {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='a') ) {
                    int LA12_37 = input.LA(4);

                    if ( (LA12_37=='r') ) {
                        int LA12_47 = input.LA(5);

                        if ( ((LA12_47>='0' && LA12_47<='9')||(LA12_47>='A' && LA12_47<='Z')||LA12_47=='_'||(LA12_47>='a' && LA12_47<='z')) ) {
                            alt12=16;
                        }
                        else {
                            alt12=9;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
            }
            else {
                alt12=16;}
            }
            break;
        case 'b':
            {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='o') ) {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='o') ) {
                    int LA12_38 = input.LA(4);

                    if ( (LA12_38=='l') ) {
                        int LA12_48 = input.LA(5);

                        if ( (LA12_48=='e') ) {
                            int LA12_58 = input.LA(6);

                            if ( (LA12_58=='a') ) {
                                int LA12_67 = input.LA(7);

                                if ( (LA12_67=='n') ) {
                                    int LA12_74 = input.LA(8);

                                    if ( ((LA12_74>='0' && LA12_74<='9')||(LA12_74>='A' && LA12_74<='Z')||LA12_74=='_'||(LA12_74>='a' && LA12_74<='z')) ) {
                                        alt12=16;
                                    }
                                    else {
                                        alt12=10;}
                                }
                                else {
                                    alt12=16;}
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
            }
            else {
                alt12=16;}
            }
            break;
        case 'l':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='o') ) {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='n') ) {
                    int LA12_39 = input.LA(4);

                    if ( (LA12_39=='g') ) {
                        int LA12_49 = input.LA(5);

                        if ( ((LA12_49>='0' && LA12_49<='9')||(LA12_49>='A' && LA12_49<='Z')||LA12_49=='_'||(LA12_49>='a' && LA12_49<='z')) ) {
                            alt12=16;
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
            }
            else {
                alt12=16;}
            }
            break;
        case 'f':
            {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='l') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='o') ) {
                    int LA12_40 = input.LA(4);

                    if ( (LA12_40=='a') ) {
                        int LA12_50 = input.LA(5);

                        if ( (LA12_50=='t') ) {
                            int LA12_60 = input.LA(6);

                            if ( ((LA12_60>='0' && LA12_60<='9')||(LA12_60>='A' && LA12_60<='Z')||LA12_60=='_'||(LA12_60>='a' && LA12_60<='z')) ) {
                                alt12=16;
                            }
                            else {
                                alt12=13;}
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
            }
            else {
                alt12=16;}
            }
            break;
        case 'i':
            {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='n') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='t') ) {
                    int LA12_41 = input.LA(4);

                    if ( (LA12_41=='e') ) {
                        int LA12_51 = input.LA(5);

                        if ( (LA12_51=='g') ) {
                            int LA12_61 = input.LA(6);

                            if ( (LA12_61=='e') ) {
                                int LA12_69 = input.LA(7);

                                if ( (LA12_69=='r') ) {
                                    int LA12_75 = input.LA(8);

                                    if ( ((LA12_75>='0' && LA12_75<='9')||(LA12_75>='A' && LA12_75<='Z')||LA12_75=='_'||(LA12_75>='a' && LA12_75<='z')) ) {
                                        alt12=16;
                                    }
                                    else {
                                        alt12=14;}
                                }
                                else {
                                    alt12=16;}
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
            }
            else {
                alt12=16;}
            }
            break;
        case 'o':
            {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='c') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='t') ) {
                    int LA12_42 = input.LA(4);

                    if ( (LA12_42=='e') ) {
                        int LA12_52 = input.LA(5);

                        if ( (LA12_52=='t') ) {
                            int LA12_62 = input.LA(6);

                            if ( ((LA12_62>='0' && LA12_62<='9')||(LA12_62>='A' && LA12_62<='Z')||LA12_62=='_'||(LA12_62>='a' && LA12_62<='z')) ) {
                                alt12=16;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=16;}
            }
            else {
                alt12=16;}
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'a':
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'm':
        case 'n':
        case 'q':
        case 'r':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=16;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=17;
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt12=18;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=19;
            }
            break;
        case '/':
            {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='*') ) {
                alt12=20;
            }
            else if ( (LA12_17=='/') ) {
                alt12=21;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 17, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:78: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:90: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:99: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:107: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ..//DataTypeDSL/src-gen//com/innoq/dtdsl/parser/dtdsl.g:1:123: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}