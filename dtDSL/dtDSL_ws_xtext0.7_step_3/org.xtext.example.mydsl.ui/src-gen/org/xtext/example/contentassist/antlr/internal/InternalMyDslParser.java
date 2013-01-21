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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'type'", "'entity'", "'{'", "'}'", "'extends'", "'property'", "':'", "'[]'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalMyDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }




    // $ANTLR start entryRuleModel
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:55:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:55:16: ( ruleModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:56:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel60);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:68:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:68:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:69:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:70:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:70:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleImport
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:82:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:82:17: ( ruleImport EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:83:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport120);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:94:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:95:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:95:1: ( ( rule__Import__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:96:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:97:1: ( rule__Import__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:97:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleType
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:109:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:109:15: ( ruleType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:110:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType180);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:117:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:121:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:122:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:122:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:123:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:124:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:124:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType214);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:136:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:136:21: ( ruleSimpleType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:137:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType240);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:144:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:148:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:149:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:149:1: ( ( rule__SimpleType__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:150:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:151:1: ( rule__SimpleType__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:151:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType274);
            rule__SimpleType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:163:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:163:17: ( ruleEntity EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:164:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity300);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:171:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:175:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:176:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:176:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:177:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:178:1: ( rule__Entity__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:178:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity334);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:190:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:190:19: ( ruleProperty EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:191:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty360);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:198:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:202:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:203:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:203:1: ( ( rule__Property__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:204:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:205:1: ( rule__Property__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:205:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty394);
            rule__Property__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start rule__Type__Alternatives
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:217:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:221:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("217:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:222:1: ( ruleSimpleType )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:222:1: ( ruleSimpleType )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:223:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives430);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:228:6: ( ruleEntity )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:228:6: ( ruleEntity )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:229:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives447);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:241:1: rule__Model__Group__0 : ( ( rule__Model__ImportsAssignment_0 )* ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) rule__Model__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( rule__Model__ImportsAssignment_0 )* ) rule__Model__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( rule__Model__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:248:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0481);
            	    rule__Model__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0491);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:259:1: rule__Model__Group__1 : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:263:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:264:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:264:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:265:1: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:266:1: ( rule__Model__ElementsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=12 && LA3_0<=13)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:266:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1519);
            	    rule__Model__ElementsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Import__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:280:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:284:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( 'import' ) rule__Import__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( 'import' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:286:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Import__Group__0559); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0569);
            rule__Import__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:300:1: rule__Import__Group__1 : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:306:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:307:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:307:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1597);
            rule__Import__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__SimpleType__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:321:1: rule__SimpleType__Group__0 : ( 'type' ) rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:325:1: ( ( 'type' ) rule__SimpleType__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( 'type' ) rule__SimpleType__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( 'type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:327:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__SimpleType__Group__0636); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__0646);
            rule__SimpleType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__0


    // $ANTLR start rule__SimpleType__Group__1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:341:1: rule__SimpleType__Group__1 : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:345:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:346:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:346:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:347:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:348:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:348:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1674);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__1


    // $ANTLR start rule__Entity__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:362:1: rule__Entity__Group__0 : ( 'entity' ) rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:366:1: ( ( 'entity' ) rule__Entity__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:367:1: ( 'entity' ) rule__Entity__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:367:1: ( 'entity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:368:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__0713); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0723);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:382:1: rule__Entity__Group__1 : ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:388:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:389:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1751);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1760);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__2
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:400:1: rule__Entity__Group__2 : ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:405:1: ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:405:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:406:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:407:1: ( rule__Entity__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:407:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2788);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2798);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__3
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:418:1: rule__Entity__Group__3 : ( '{' ) rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:422:1: ( ( '{' ) rule__Entity__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:423:1: ( '{' ) rule__Entity__Group__4
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:423:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:424:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__3827); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3837);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__4
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:438:1: rule__Entity__Group__4 : ( ( rule__Entity__PropertiesAssignment_4 )* ) rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( ( ( rule__Entity__PropertiesAssignment_4 )* ) rule__Entity__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( ( rule__Entity__PropertiesAssignment_4 )* ) rule__Entity__Group__5
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:444:1: ( rule__Entity__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:445:1: ( rule__Entity__PropertiesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:445:2: rule__Entity__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4865);
            	    rule__Entity__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4875);
            rule__Entity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__5
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:456:1: rule__Entity__Group__5 : ( '}' ) ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:462:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__5904); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group_2__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:487:1: rule__Entity__Group_2__0 : ( 'extends' ) rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:491:1: ( ( 'extends' ) rule__Entity__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:492:1: ( 'extends' ) rule__Entity__Group_2__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:492:1: ( 'extends' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:493:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group_2__0952); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__0962);
            rule__Entity__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:507:1: rule__Entity__Group_2__1 : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:512:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:512:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:513:1: ( rule__Entity__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:514:1: ( rule__Entity__ExtendsAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:514:2: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1990);
            rule__Entity__ExtendsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Property__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:528:1: rule__Property__Group__0 : ( 'property' ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:532:1: ( ( 'property' ) rule__Property__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( 'property' ) rule__Property__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( 'property' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:534:1: 'property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Property__Group__01029); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01039);
            rule__Property__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:548:1: rule__Property__Group__1 : ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( rule__Property__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:555:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__11067);
            rule__Property__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11076);
            rule__Property__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__2
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:566:1: rule__Property__Group__2 : ( ':' ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( ( ':' ) rule__Property__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( ':' ) rule__Property__Group__3
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:572:1: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Property__Group__21105); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__21115);
            rule__Property__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__3
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:586:1: rule__Property__Group__3 : ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:590:1: ( ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:591:1: ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:591:1: ( ( rule__Property__TypeAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:592:1: ( rule__Property__TypeAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( rule__Property__TypeAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:593:2: rule__Property__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_3_in_rule__Property__Group__31143);
            rule__Property__TypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__31152);
            rule__Property__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__3


    // $ANTLR start rule__Property__Group__4
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:604:1: rule__Property__Group__4 : ( ( rule__Property__ManyAssignment_4 )? ) ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ( ( rule__Property__ManyAssignment_4 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( ( rule__Property__ManyAssignment_4 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( ( rule__Property__ManyAssignment_4 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( rule__Property__ManyAssignment_4 )?
            {
             before(grammarAccess.getPropertyAccess().getManyAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( rule__Property__ManyAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:611:2: rule__Property__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Property__ManyAssignment_4_in_rule__Property__Group__41180);
                    rule__Property__ManyAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getManyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__4


    // $ANTLR start rule__Model__ImportsAssignment_0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:631:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( ruleImport ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ruleImport )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ruleImport )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:637:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01225);
            ruleImport();
            _fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ImportsAssignment_0


    // $ANTLR start rule__Model__ElementsAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:646:1: rule__Model__ElementsAssignment_1 : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( ( ruleType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( ruleType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( ruleType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:652:1: ruleType
            {
             before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__ElementsAssignment_11256);
            ruleType();
            _fsp--;

             after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ElementsAssignment_1


    // $ANTLR start rule__Import__ImportURIAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:661:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:667:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_11287); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__ImportURIAssignment_1


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:676:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:681:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:681:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:682:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_11318); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__NameAssignment_1


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:691:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:696:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:696:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:697:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11349); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__ExtendsAssignment_2_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:706:1: rule__Entity__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:710:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:711:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:711:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:712:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:714:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_11384); 
             after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__ExtendsAssignment_2_1


    // $ANTLR start rule__Entity__PropertiesAssignment_4
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:725:1: rule__Entity__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( ( ruleProperty ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( ruleProperty )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( ruleProperty )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:731:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_41419);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__PropertiesAssignment_4


    // $ANTLR start rule__Property__NameAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:740:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:744:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:746:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_11450); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NameAssignment_1


    // $ANTLR start rule__Property__TypeAssignment_3
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:755:1: rule__Property__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:759:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:763:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__TypeAssignment_31485); 
             after(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__TypeAssignment_3


    // $ANTLR start rule__Property__ManyAssignment_4
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:774:1: rule__Property__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__Property__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:778:1: ( ( ( '[]' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( ( '[]' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( ( '[]' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( '[]' )
            {
             before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( '[]' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:782:1: '[]'
            {
             before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Property__ManyAssignment_41525); 
             after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }

             after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__ManyAssignment_4


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0481 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1519 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_11_in_rule__Import__Group__0559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleType__Group__0636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__0646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__0713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1751 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2788 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__3827 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4865 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group_2__0952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__0962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Property__Group__01029 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__11067 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Property__Group__21105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__21115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_3_in_rule__Property__Group__31143 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__31152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ManyAssignment_4_in_rule__Property__Group__41180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__ElementsAssignment_11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_41419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_11450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__TypeAssignment_31485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Property__ManyAssignment_41525 = new BitSet(new long[]{0x0000000000000002L});

}