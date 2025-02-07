package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_COMPARISONOPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'trainee'", "'junior'", "'senior'", "'easy'", "'moderate'", "'hard'", "'True'", "'False'", "'nightshift'", "'dayshift'", "'eveningshift'", "'worker'", "'{'", "'name'", "'='", "';'", "'seniority'", "'active'", "'}'", "'task'", "'difficulty'", "'duration'", "'start'", "'if'", "'then'", "':'", "'OR'", "'AND'", "'('", "')'", "'min'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_COMPARISONOPERATOR=7;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWorker"
    // InternalMyDsl.g:78:1: entryRuleWorker : ruleWorker EOF ;
    public final void entryRuleWorker() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleWorker EOF )
            // InternalMyDsl.g:80:1: ruleWorker EOF
            {
             before(grammarAccess.getWorkerRule()); 
            pushFollow(FOLLOW_1);
            ruleWorker();

            state._fsp--;

             after(grammarAccess.getWorkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorker"


    // $ANTLR start "ruleWorker"
    // InternalMyDsl.g:87:1: ruleWorker : ( ( rule__Worker__Group__0 ) ) ;
    public final void ruleWorker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Worker__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Worker__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Worker__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Worker__Group__0 )
            {
             before(grammarAccess.getWorkerAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Worker__Group__0 )
            // InternalMyDsl.g:94:4: rule__Worker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Worker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkerAccess().getGroup()); 

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
    // $ANTLR end "ruleWorker"


    // $ANTLR start "entryRuleTask"
    // InternalMyDsl.g:103:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTask EOF )
            // InternalMyDsl.g:105:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalMyDsl.g:112:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Task__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Task__Group__0 )
            // InternalMyDsl.g:119:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:128:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRule EOF )
            // InternalMyDsl.g:130:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:137:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Rule__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Rule__Group__0 )
            // InternalMyDsl.g:144:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleTIME"
    // InternalMyDsl.g:153:1: entryRuleTIME : ruleTIME EOF ;
    public final void entryRuleTIME() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTIME EOF )
            // InternalMyDsl.g:155:1: ruleTIME EOF
            {
             before(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_1);
            ruleTIME();

            state._fsp--;

             after(grammarAccess.getTIMERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // InternalMyDsl.g:162:1: ruleTIME : ( ( rule__TIME__Group__0 ) ) ;
    public final void ruleTIME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__TIME__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__TIME__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__TIME__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__TIME__Group__0 )
            {
             before(grammarAccess.getTIMEAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__TIME__Group__0 )
            // InternalMyDsl.g:169:4: rule__TIME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TIME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getGroup()); 

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
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:178:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleCondition EOF )
            // InternalMyDsl.g:180:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:187:1: ruleCondition : ( ruleOrCondition ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ruleOrCondition ) )
            // InternalMyDsl.g:192:2: ( ruleOrCondition )
            {
            // InternalMyDsl.g:192:2: ( ruleOrCondition )
            // InternalMyDsl.g:193:3: ruleOrCondition
            {
             before(grammarAccess.getConditionAccess().getOrConditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrCondition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOrConditionParserRuleCall()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOrCondition"
    // InternalMyDsl.g:203:1: entryRuleOrCondition : ruleOrCondition EOF ;
    public final void entryRuleOrCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleOrCondition EOF )
            // InternalMyDsl.g:205:1: ruleOrCondition EOF
            {
             before(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrCondition();

            state._fsp--;

             after(grammarAccess.getOrConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // InternalMyDsl.g:212:1: ruleOrCondition : ( ( rule__OrCondition__Group__0 ) ) ;
    public final void ruleOrCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__OrCondition__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__OrCondition__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__OrCondition__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__OrCondition__Group__0 )
            {
             before(grammarAccess.getOrConditionAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__OrCondition__Group__0 )
            // InternalMyDsl.g:219:4: rule__OrCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "entryRuleAndCondition"
    // InternalMyDsl.g:228:1: entryRuleAndCondition : ruleAndCondition EOF ;
    public final void entryRuleAndCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleAndCondition EOF )
            // InternalMyDsl.g:230:1: ruleAndCondition EOF
            {
             before(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndCondition();

            state._fsp--;

             after(grammarAccess.getAndConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // InternalMyDsl.g:237:1: ruleAndCondition : ( ( rule__AndCondition__Group__0 ) ) ;
    public final void ruleAndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__AndCondition__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__AndCondition__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__AndCondition__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__AndCondition__Group__0 )
            {
             before(grammarAccess.getAndConditionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__AndCondition__Group__0 )
            // InternalMyDsl.g:244:4: rule__AndCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRulePrimaryCondition"
    // InternalMyDsl.g:253:1: entryRulePrimaryCondition : rulePrimaryCondition EOF ;
    public final void entryRulePrimaryCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( rulePrimaryCondition EOF )
            // InternalMyDsl.g:255:1: rulePrimaryCondition EOF
            {
             before(grammarAccess.getPrimaryConditionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryCondition();

            state._fsp--;

             after(grammarAccess.getPrimaryConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryCondition"


    // $ANTLR start "rulePrimaryCondition"
    // InternalMyDsl.g:262:1: rulePrimaryCondition : ( ( rule__PrimaryCondition__Alternatives ) ) ;
    public final void rulePrimaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__PrimaryCondition__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__PrimaryCondition__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__PrimaryCondition__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__PrimaryCondition__Alternatives )
            {
             before(grammarAccess.getPrimaryConditionAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__PrimaryCondition__Alternatives )
            // InternalMyDsl.g:269:4: rule__PrimaryCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryConditionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryCondition"


    // $ANTLR start "entryRuleShiftCondition"
    // InternalMyDsl.g:278:1: entryRuleShiftCondition : ruleShiftCondition EOF ;
    public final void entryRuleShiftCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleShiftCondition EOF )
            // InternalMyDsl.g:280:1: ruleShiftCondition EOF
            {
             before(grammarAccess.getShiftConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleShiftCondition();

            state._fsp--;

             after(grammarAccess.getShiftConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShiftCondition"


    // $ANTLR start "ruleShiftCondition"
    // InternalMyDsl.g:287:1: ruleShiftCondition : ( ( rule__ShiftCondition__ShiftAssignment ) ) ;
    public final void ruleShiftCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ShiftCondition__ShiftAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ShiftCondition__ShiftAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ShiftCondition__ShiftAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__ShiftCondition__ShiftAssignment )
            {
             before(grammarAccess.getShiftConditionAccess().getShiftAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__ShiftCondition__ShiftAssignment )
            // InternalMyDsl.g:294:4: rule__ShiftCondition__ShiftAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ShiftCondition__ShiftAssignment();

            state._fsp--;


            }

             after(grammarAccess.getShiftConditionAccess().getShiftAssignment()); 

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
    // $ANTLR end "ruleShiftCondition"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:303:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleComparison EOF )
            // InternalMyDsl.g:305:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:312:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Comparison__Group__0 )
            // InternalMyDsl.g:319:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleDifficultyCondition"
    // InternalMyDsl.g:328:1: entryRuleDifficultyCondition : ruleDifficultyCondition EOF ;
    public final void entryRuleDifficultyCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleDifficultyCondition EOF )
            // InternalMyDsl.g:330:1: ruleDifficultyCondition EOF
            {
             before(grammarAccess.getDifficultyConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleDifficultyCondition();

            state._fsp--;

             after(grammarAccess.getDifficultyConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDifficultyCondition"


    // $ANTLR start "ruleDifficultyCondition"
    // InternalMyDsl.g:337:1: ruleDifficultyCondition : ( ( rule__DifficultyCondition__DifficultyAssignment ) ) ;
    public final void ruleDifficultyCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__DifficultyCondition__DifficultyAssignment ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__DifficultyCondition__DifficultyAssignment ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__DifficultyCondition__DifficultyAssignment ) )
            // InternalMyDsl.g:343:3: ( rule__DifficultyCondition__DifficultyAssignment )
            {
             before(grammarAccess.getDifficultyConditionAccess().getDifficultyAssignment()); 
            // InternalMyDsl.g:344:3: ( rule__DifficultyCondition__DifficultyAssignment )
            // InternalMyDsl.g:344:4: rule__DifficultyCondition__DifficultyAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DifficultyCondition__DifficultyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDifficultyConditionAccess().getDifficultyAssignment()); 

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
    // $ANTLR end "ruleDifficultyCondition"


    // $ANTLR start "ruleSeniorityLevel"
    // InternalMyDsl.g:353:1: ruleSeniorityLevel : ( ( rule__SeniorityLevel__Alternatives ) ) ;
    public final void ruleSeniorityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__SeniorityLevel__Alternatives ) ) )
            // InternalMyDsl.g:358:2: ( ( rule__SeniorityLevel__Alternatives ) )
            {
            // InternalMyDsl.g:358:2: ( ( rule__SeniorityLevel__Alternatives ) )
            // InternalMyDsl.g:359:3: ( rule__SeniorityLevel__Alternatives )
            {
             before(grammarAccess.getSeniorityLevelAccess().getAlternatives()); 
            // InternalMyDsl.g:360:3: ( rule__SeniorityLevel__Alternatives )
            // InternalMyDsl.g:360:4: rule__SeniorityLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SeniorityLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeniorityLevelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSeniorityLevel"


    // $ANTLR start "ruleDifficulty"
    // InternalMyDsl.g:369:1: ruleDifficulty : ( ( rule__Difficulty__Alternatives ) ) ;
    public final void ruleDifficulty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( ( ( rule__Difficulty__Alternatives ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__Difficulty__Alternatives ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__Difficulty__Alternatives ) )
            // InternalMyDsl.g:375:3: ( rule__Difficulty__Alternatives )
            {
             before(grammarAccess.getDifficultyAccess().getAlternatives()); 
            // InternalMyDsl.g:376:3: ( rule__Difficulty__Alternatives )
            // InternalMyDsl.g:376:4: rule__Difficulty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Difficulty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDifficultyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDifficulty"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:385:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalMyDsl.g:390:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalMyDsl.g:390:2: ( ( rule__Boolean__Alternatives ) )
            // InternalMyDsl.g:391:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalMyDsl.g:392:3: ( rule__Boolean__Alternatives )
            // InternalMyDsl.g:392:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleShift"
    // InternalMyDsl.g:401:1: ruleShift : ( ( rule__Shift__Alternatives ) ) ;
    public final void ruleShift() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( ( rule__Shift__Alternatives ) ) )
            // InternalMyDsl.g:406:2: ( ( rule__Shift__Alternatives ) )
            {
            // InternalMyDsl.g:406:2: ( ( rule__Shift__Alternatives ) )
            // InternalMyDsl.g:407:3: ( rule__Shift__Alternatives )
            {
             before(grammarAccess.getShiftAccess().getAlternatives()); 
            // InternalMyDsl.g:408:3: ( rule__Shift__Alternatives )
            // InternalMyDsl.g:408:4: rule__Shift__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Shift__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShiftAccess().getAlternatives()); 

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
    // $ANTLR end "ruleShift"


    // $ANTLR start "rule__PrimaryCondition__Alternatives"
    // InternalMyDsl.g:416:1: rule__PrimaryCondition__Alternatives : ( ( ( rule__PrimaryCondition__Group_0__0 ) ) | ( ruleComparison ) | ( ruleShiftCondition ) | ( ruleDifficultyCondition ) );
    public final void rule__PrimaryCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( ( ( rule__PrimaryCondition__Group_0__0 ) ) | ( ruleComparison ) | ( ruleShiftCondition ) | ( ruleDifficultyCondition ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case RULE_COMPARISONOPERATOR:
                {
                alt1=2;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt1=3;
                }
                break;
            case 15:
            case 16:
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:421:2: ( ( rule__PrimaryCondition__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:421:2: ( ( rule__PrimaryCondition__Group_0__0 ) )
                    // InternalMyDsl.g:422:3: ( rule__PrimaryCondition__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryConditionAccess().getGroup_0()); 
                    // InternalMyDsl.g:423:3: ( rule__PrimaryCondition__Group_0__0 )
                    // InternalMyDsl.g:423:4: rule__PrimaryCondition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryCondition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryConditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:427:2: ( ruleComparison )
                    {
                    // InternalMyDsl.g:427:2: ( ruleComparison )
                    // InternalMyDsl.g:428:3: ruleComparison
                    {
                     before(grammarAccess.getPrimaryConditionAccess().getComparisonParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComparison();

                    state._fsp--;

                     after(grammarAccess.getPrimaryConditionAccess().getComparisonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:433:2: ( ruleShiftCondition )
                    {
                    // InternalMyDsl.g:433:2: ( ruleShiftCondition )
                    // InternalMyDsl.g:434:3: ruleShiftCondition
                    {
                     before(grammarAccess.getPrimaryConditionAccess().getShiftConditionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleShiftCondition();

                    state._fsp--;

                     after(grammarAccess.getPrimaryConditionAccess().getShiftConditionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:439:2: ( ruleDifficultyCondition )
                    {
                    // InternalMyDsl.g:439:2: ( ruleDifficultyCondition )
                    // InternalMyDsl.g:440:3: ruleDifficultyCondition
                    {
                     before(grammarAccess.getPrimaryConditionAccess().getDifficultyConditionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDifficultyCondition();

                    state._fsp--;

                     after(grammarAccess.getPrimaryConditionAccess().getDifficultyConditionParserRuleCall_3()); 

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
    // $ANTLR end "rule__PrimaryCondition__Alternatives"


    // $ANTLR start "rule__SeniorityLevel__Alternatives"
    // InternalMyDsl.g:449:1: rule__SeniorityLevel__Alternatives : ( ( ( 'trainee' ) ) | ( ( 'junior' ) ) | ( ( 'senior' ) ) );
    public final void rule__SeniorityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( ( 'trainee' ) ) | ( ( 'junior' ) ) | ( ( 'senior' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:454:2: ( ( 'trainee' ) )
                    {
                    // InternalMyDsl.g:454:2: ( ( 'trainee' ) )
                    // InternalMyDsl.g:455:3: ( 'trainee' )
                    {
                     before(grammarAccess.getSeniorityLevelAccess().getTraineeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:456:3: ( 'trainee' )
                    // InternalMyDsl.g:456:4: 'trainee'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSeniorityLevelAccess().getTraineeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:460:2: ( ( 'junior' ) )
                    {
                    // InternalMyDsl.g:460:2: ( ( 'junior' ) )
                    // InternalMyDsl.g:461:3: ( 'junior' )
                    {
                     before(grammarAccess.getSeniorityLevelAccess().getJuniorEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:462:3: ( 'junior' )
                    // InternalMyDsl.g:462:4: 'junior'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSeniorityLevelAccess().getJuniorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:466:2: ( ( 'senior' ) )
                    {
                    // InternalMyDsl.g:466:2: ( ( 'senior' ) )
                    // InternalMyDsl.g:467:3: ( 'senior' )
                    {
                     before(grammarAccess.getSeniorityLevelAccess().getSeniorEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:468:3: ( 'senior' )
                    // InternalMyDsl.g:468:4: 'senior'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSeniorityLevelAccess().getSeniorEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SeniorityLevel__Alternatives"


    // $ANTLR start "rule__Difficulty__Alternatives"
    // InternalMyDsl.g:476:1: rule__Difficulty__Alternatives : ( ( ( 'easy' ) ) | ( ( 'moderate' ) ) | ( ( 'hard' ) ) );
    public final void rule__Difficulty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( ( 'easy' ) ) | ( ( 'moderate' ) ) | ( ( 'hard' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:481:2: ( ( 'easy' ) )
                    {
                    // InternalMyDsl.g:481:2: ( ( 'easy' ) )
                    // InternalMyDsl.g:482:3: ( 'easy' )
                    {
                     before(grammarAccess.getDifficultyAccess().getEasyEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:483:3: ( 'easy' )
                    // InternalMyDsl.g:483:4: 'easy'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficultyAccess().getEasyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:487:2: ( ( 'moderate' ) )
                    {
                    // InternalMyDsl.g:487:2: ( ( 'moderate' ) )
                    // InternalMyDsl.g:488:3: ( 'moderate' )
                    {
                     before(grammarAccess.getDifficultyAccess().getModerateEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:489:3: ( 'moderate' )
                    // InternalMyDsl.g:489:4: 'moderate'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficultyAccess().getModerateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:493:2: ( ( 'hard' ) )
                    {
                    // InternalMyDsl.g:493:2: ( ( 'hard' ) )
                    // InternalMyDsl.g:494:3: ( 'hard' )
                    {
                     before(grammarAccess.getDifficultyAccess().getHardEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:495:3: ( 'hard' )
                    // InternalMyDsl.g:495:4: 'hard'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficultyAccess().getHardEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Difficulty__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalMyDsl.g:503:1: rule__Boolean__Alternatives : ( ( ( 'True' ) ) | ( ( 'False' ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ( 'True' ) ) | ( ( 'False' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:508:2: ( ( 'True' ) )
                    {
                    // InternalMyDsl.g:508:2: ( ( 'True' ) )
                    // InternalMyDsl.g:509:3: ( 'True' )
                    {
                     before(grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:510:3: ( 'True' )
                    // InternalMyDsl.g:510:4: 'True'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:514:2: ( ( 'False' ) )
                    {
                    // InternalMyDsl.g:514:2: ( ( 'False' ) )
                    // InternalMyDsl.g:515:3: ( 'False' )
                    {
                     before(grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:516:3: ( 'False' )
                    // InternalMyDsl.g:516:4: 'False'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Shift__Alternatives"
    // InternalMyDsl.g:524:1: rule__Shift__Alternatives : ( ( ( 'nightshift' ) ) | ( ( 'dayshift' ) ) | ( ( 'eveningshift' ) ) );
    public final void rule__Shift__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( ( ( 'nightshift' ) ) | ( ( 'dayshift' ) ) | ( ( 'eveningshift' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:529:2: ( ( 'nightshift' ) )
                    {
                    // InternalMyDsl.g:529:2: ( ( 'nightshift' ) )
                    // InternalMyDsl.g:530:3: ( 'nightshift' )
                    {
                     before(grammarAccess.getShiftAccess().getNightshiftEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:531:3: ( 'nightshift' )
                    // InternalMyDsl.g:531:4: 'nightshift'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getShiftAccess().getNightshiftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:535:2: ( ( 'dayshift' ) )
                    {
                    // InternalMyDsl.g:535:2: ( ( 'dayshift' ) )
                    // InternalMyDsl.g:536:3: ( 'dayshift' )
                    {
                     before(grammarAccess.getShiftAccess().getDayshiftEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:537:3: ( 'dayshift' )
                    // InternalMyDsl.g:537:4: 'dayshift'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getShiftAccess().getDayshiftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:541:2: ( ( 'eveningshift' ) )
                    {
                    // InternalMyDsl.g:541:2: ( ( 'eveningshift' ) )
                    // InternalMyDsl.g:542:3: ( 'eveningshift' )
                    {
                     before(grammarAccess.getShiftAccess().getEveningshiftEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:543:3: ( 'eveningshift' )
                    // InternalMyDsl.g:543:4: 'eveningshift'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getShiftAccess().getEveningshiftEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Shift__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:551:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:556:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:563:1: rule__Model__Group__0__Impl : ( ( rule__Model__WorkersAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( ( rule__Model__WorkersAssignment_0 )* ) )
            // InternalMyDsl.g:568:1: ( ( rule__Model__WorkersAssignment_0 )* )
            {
            // InternalMyDsl.g:568:1: ( ( rule__Model__WorkersAssignment_0 )* )
            // InternalMyDsl.g:569:2: ( rule__Model__WorkersAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getWorkersAssignment_0()); 
            // InternalMyDsl.g:570:2: ( rule__Model__WorkersAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:570:3: rule__Model__WorkersAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__WorkersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getWorkersAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:578:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:583:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:590:1: rule__Model__Group__1__Impl : ( ( rule__Model__TasksAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( ( rule__Model__TasksAssignment_1 )* ) )
            // InternalMyDsl.g:595:1: ( ( rule__Model__TasksAssignment_1 )* )
            {
            // InternalMyDsl.g:595:1: ( ( rule__Model__TasksAssignment_1 )* )
            // InternalMyDsl.g:596:2: ( rule__Model__TasksAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getTasksAssignment_1()); 
            // InternalMyDsl.g:597:2: ( rule__Model__TasksAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:597:3: rule__Model__TasksAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__TasksAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTasksAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDsl.g:605:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__Model__Group__2__Impl )
            // InternalMyDsl.g:610:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDsl.g:616:1: rule__Model__Group__2__Impl : ( ( rule__Model__RulesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( ( ( rule__Model__RulesAssignment_2 )* ) )
            // InternalMyDsl.g:621:1: ( ( rule__Model__RulesAssignment_2 )* )
            {
            // InternalMyDsl.g:621:1: ( ( rule__Model__RulesAssignment_2 )* )
            // InternalMyDsl.g:622:2: ( rule__Model__RulesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getRulesAssignment_2()); 
            // InternalMyDsl.g:623:2: ( rule__Model__RulesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:623:3: rule__Model__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRulesAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Worker__Group__0"
    // InternalMyDsl.g:632:1: rule__Worker__Group__0 : rule__Worker__Group__0__Impl rule__Worker__Group__1 ;
    public final void rule__Worker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__Worker__Group__0__Impl rule__Worker__Group__1 )
            // InternalMyDsl.g:637:2: rule__Worker__Group__0__Impl rule__Worker__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Worker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__0"


    // $ANTLR start "rule__Worker__Group__0__Impl"
    // InternalMyDsl.g:644:1: rule__Worker__Group__0__Impl : ( 'worker' ) ;
    public final void rule__Worker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( 'worker' ) )
            // InternalMyDsl.g:649:1: ( 'worker' )
            {
            // InternalMyDsl.g:649:1: ( 'worker' )
            // InternalMyDsl.g:650:2: 'worker'
            {
             before(grammarAccess.getWorkerAccess().getWorkerKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getWorkerKeyword_0()); 

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
    // $ANTLR end "rule__Worker__Group__0__Impl"


    // $ANTLR start "rule__Worker__Group__1"
    // InternalMyDsl.g:659:1: rule__Worker__Group__1 : rule__Worker__Group__1__Impl rule__Worker__Group__2 ;
    public final void rule__Worker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__Worker__Group__1__Impl rule__Worker__Group__2 )
            // InternalMyDsl.g:664:2: rule__Worker__Group__1__Impl rule__Worker__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Worker__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__1"


    // $ANTLR start "rule__Worker__Group__1__Impl"
    // InternalMyDsl.g:671:1: rule__Worker__Group__1__Impl : ( ( rule__Worker__IdAssignment_1 ) ) ;
    public final void rule__Worker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( ( rule__Worker__IdAssignment_1 ) ) )
            // InternalMyDsl.g:676:1: ( ( rule__Worker__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:676:1: ( ( rule__Worker__IdAssignment_1 ) )
            // InternalMyDsl.g:677:2: ( rule__Worker__IdAssignment_1 )
            {
             before(grammarAccess.getWorkerAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:678:2: ( rule__Worker__IdAssignment_1 )
            // InternalMyDsl.g:678:3: rule__Worker__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Worker__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkerAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__Worker__Group__1__Impl"


    // $ANTLR start "rule__Worker__Group__2"
    // InternalMyDsl.g:686:1: rule__Worker__Group__2 : rule__Worker__Group__2__Impl rule__Worker__Group__3 ;
    public final void rule__Worker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__Worker__Group__2__Impl rule__Worker__Group__3 )
            // InternalMyDsl.g:691:2: rule__Worker__Group__2__Impl rule__Worker__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Worker__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__2"


    // $ANTLR start "rule__Worker__Group__2__Impl"
    // InternalMyDsl.g:698:1: rule__Worker__Group__2__Impl : ( '{' ) ;
    public final void rule__Worker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( '{' ) )
            // InternalMyDsl.g:703:1: ( '{' )
            {
            // InternalMyDsl.g:703:1: ( '{' )
            // InternalMyDsl.g:704:2: '{'
            {
             before(grammarAccess.getWorkerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Worker__Group__2__Impl"


    // $ANTLR start "rule__Worker__Group__3"
    // InternalMyDsl.g:713:1: rule__Worker__Group__3 : rule__Worker__Group__3__Impl rule__Worker__Group__4 ;
    public final void rule__Worker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__Worker__Group__3__Impl rule__Worker__Group__4 )
            // InternalMyDsl.g:718:2: rule__Worker__Group__3__Impl rule__Worker__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Worker__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__3"


    // $ANTLR start "rule__Worker__Group__3__Impl"
    // InternalMyDsl.g:725:1: rule__Worker__Group__3__Impl : ( 'name' ) ;
    public final void rule__Worker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( 'name' ) )
            // InternalMyDsl.g:730:1: ( 'name' )
            {
            // InternalMyDsl.g:730:1: ( 'name' )
            // InternalMyDsl.g:731:2: 'name'
            {
             before(grammarAccess.getWorkerAccess().getNameKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getNameKeyword_3()); 

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
    // $ANTLR end "rule__Worker__Group__3__Impl"


    // $ANTLR start "rule__Worker__Group__4"
    // InternalMyDsl.g:740:1: rule__Worker__Group__4 : rule__Worker__Group__4__Impl rule__Worker__Group__5 ;
    public final void rule__Worker__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__Worker__Group__4__Impl rule__Worker__Group__5 )
            // InternalMyDsl.g:745:2: rule__Worker__Group__4__Impl rule__Worker__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Worker__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__4"


    // $ANTLR start "rule__Worker__Group__4__Impl"
    // InternalMyDsl.g:752:1: rule__Worker__Group__4__Impl : ( '=' ) ;
    public final void rule__Worker__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( '=' ) )
            // InternalMyDsl.g:757:1: ( '=' )
            {
            // InternalMyDsl.g:757:1: ( '=' )
            // InternalMyDsl.g:758:2: '='
            {
             before(grammarAccess.getWorkerAccess().getEqualsSignKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Worker__Group__4__Impl"


    // $ANTLR start "rule__Worker__Group__5"
    // InternalMyDsl.g:767:1: rule__Worker__Group__5 : rule__Worker__Group__5__Impl rule__Worker__Group__6 ;
    public final void rule__Worker__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__Worker__Group__5__Impl rule__Worker__Group__6 )
            // InternalMyDsl.g:772:2: rule__Worker__Group__5__Impl rule__Worker__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Worker__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__5"


    // $ANTLR start "rule__Worker__Group__5__Impl"
    // InternalMyDsl.g:779:1: rule__Worker__Group__5__Impl : ( ( rule__Worker__NameAssignment_5 ) ) ;
    public final void rule__Worker__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( ( rule__Worker__NameAssignment_5 ) ) )
            // InternalMyDsl.g:784:1: ( ( rule__Worker__NameAssignment_5 ) )
            {
            // InternalMyDsl.g:784:1: ( ( rule__Worker__NameAssignment_5 ) )
            // InternalMyDsl.g:785:2: ( rule__Worker__NameAssignment_5 )
            {
             before(grammarAccess.getWorkerAccess().getNameAssignment_5()); 
            // InternalMyDsl.g:786:2: ( rule__Worker__NameAssignment_5 )
            // InternalMyDsl.g:786:3: rule__Worker__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Worker__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkerAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__Worker__Group__5__Impl"


    // $ANTLR start "rule__Worker__Group__6"
    // InternalMyDsl.g:794:1: rule__Worker__Group__6 : rule__Worker__Group__6__Impl rule__Worker__Group__7 ;
    public final void rule__Worker__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__Worker__Group__6__Impl rule__Worker__Group__7 )
            // InternalMyDsl.g:799:2: rule__Worker__Group__6__Impl rule__Worker__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Worker__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__6"


    // $ANTLR start "rule__Worker__Group__6__Impl"
    // InternalMyDsl.g:806:1: rule__Worker__Group__6__Impl : ( ';' ) ;
    public final void rule__Worker__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( ';' ) )
            // InternalMyDsl.g:811:1: ( ';' )
            {
            // InternalMyDsl.g:811:1: ( ';' )
            // InternalMyDsl.g:812:2: ';'
            {
             before(grammarAccess.getWorkerAccess().getSemicolonKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Worker__Group__6__Impl"


    // $ANTLR start "rule__Worker__Group__7"
    // InternalMyDsl.g:821:1: rule__Worker__Group__7 : rule__Worker__Group__7__Impl rule__Worker__Group__8 ;
    public final void rule__Worker__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__Worker__Group__7__Impl rule__Worker__Group__8 )
            // InternalMyDsl.g:826:2: rule__Worker__Group__7__Impl rule__Worker__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Worker__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__7"


    // $ANTLR start "rule__Worker__Group__7__Impl"
    // InternalMyDsl.g:833:1: rule__Worker__Group__7__Impl : ( 'seniority' ) ;
    public final void rule__Worker__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( 'seniority' ) )
            // InternalMyDsl.g:838:1: ( 'seniority' )
            {
            // InternalMyDsl.g:838:1: ( 'seniority' )
            // InternalMyDsl.g:839:2: 'seniority'
            {
             before(grammarAccess.getWorkerAccess().getSeniorityKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getSeniorityKeyword_7()); 

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
    // $ANTLR end "rule__Worker__Group__7__Impl"


    // $ANTLR start "rule__Worker__Group__8"
    // InternalMyDsl.g:848:1: rule__Worker__Group__8 : rule__Worker__Group__8__Impl rule__Worker__Group__9 ;
    public final void rule__Worker__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__Worker__Group__8__Impl rule__Worker__Group__9 )
            // InternalMyDsl.g:853:2: rule__Worker__Group__8__Impl rule__Worker__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Worker__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__8"


    // $ANTLR start "rule__Worker__Group__8__Impl"
    // InternalMyDsl.g:860:1: rule__Worker__Group__8__Impl : ( '=' ) ;
    public final void rule__Worker__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( '=' ) )
            // InternalMyDsl.g:865:1: ( '=' )
            {
            // InternalMyDsl.g:865:1: ( '=' )
            // InternalMyDsl.g:866:2: '='
            {
             before(grammarAccess.getWorkerAccess().getEqualsSignKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getEqualsSignKeyword_8()); 

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
    // $ANTLR end "rule__Worker__Group__8__Impl"


    // $ANTLR start "rule__Worker__Group__9"
    // InternalMyDsl.g:875:1: rule__Worker__Group__9 : rule__Worker__Group__9__Impl rule__Worker__Group__10 ;
    public final void rule__Worker__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__Worker__Group__9__Impl rule__Worker__Group__10 )
            // InternalMyDsl.g:880:2: rule__Worker__Group__9__Impl rule__Worker__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Worker__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__9"


    // $ANTLR start "rule__Worker__Group__9__Impl"
    // InternalMyDsl.g:887:1: rule__Worker__Group__9__Impl : ( ( rule__Worker__SeniorityAssignment_9 ) ) ;
    public final void rule__Worker__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( ( rule__Worker__SeniorityAssignment_9 ) ) )
            // InternalMyDsl.g:892:1: ( ( rule__Worker__SeniorityAssignment_9 ) )
            {
            // InternalMyDsl.g:892:1: ( ( rule__Worker__SeniorityAssignment_9 ) )
            // InternalMyDsl.g:893:2: ( rule__Worker__SeniorityAssignment_9 )
            {
             before(grammarAccess.getWorkerAccess().getSeniorityAssignment_9()); 
            // InternalMyDsl.g:894:2: ( rule__Worker__SeniorityAssignment_9 )
            // InternalMyDsl.g:894:3: rule__Worker__SeniorityAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Worker__SeniorityAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getWorkerAccess().getSeniorityAssignment_9()); 

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
    // $ANTLR end "rule__Worker__Group__9__Impl"


    // $ANTLR start "rule__Worker__Group__10"
    // InternalMyDsl.g:902:1: rule__Worker__Group__10 : rule__Worker__Group__10__Impl rule__Worker__Group__11 ;
    public final void rule__Worker__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__Worker__Group__10__Impl rule__Worker__Group__11 )
            // InternalMyDsl.g:907:2: rule__Worker__Group__10__Impl rule__Worker__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Worker__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__10"


    // $ANTLR start "rule__Worker__Group__10__Impl"
    // InternalMyDsl.g:914:1: rule__Worker__Group__10__Impl : ( ';' ) ;
    public final void rule__Worker__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( ';' ) )
            // InternalMyDsl.g:919:1: ( ';' )
            {
            // InternalMyDsl.g:919:1: ( ';' )
            // InternalMyDsl.g:920:2: ';'
            {
             before(grammarAccess.getWorkerAccess().getSemicolonKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getSemicolonKeyword_10()); 

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
    // $ANTLR end "rule__Worker__Group__10__Impl"


    // $ANTLR start "rule__Worker__Group__11"
    // InternalMyDsl.g:929:1: rule__Worker__Group__11 : rule__Worker__Group__11__Impl rule__Worker__Group__12 ;
    public final void rule__Worker__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__Worker__Group__11__Impl rule__Worker__Group__12 )
            // InternalMyDsl.g:934:2: rule__Worker__Group__11__Impl rule__Worker__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Worker__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__12();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__11"


    // $ANTLR start "rule__Worker__Group__11__Impl"
    // InternalMyDsl.g:941:1: rule__Worker__Group__11__Impl : ( 'active' ) ;
    public final void rule__Worker__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( 'active' ) )
            // InternalMyDsl.g:946:1: ( 'active' )
            {
            // InternalMyDsl.g:946:1: ( 'active' )
            // InternalMyDsl.g:947:2: 'active'
            {
             before(grammarAccess.getWorkerAccess().getActiveKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getActiveKeyword_11()); 

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
    // $ANTLR end "rule__Worker__Group__11__Impl"


    // $ANTLR start "rule__Worker__Group__12"
    // InternalMyDsl.g:956:1: rule__Worker__Group__12 : rule__Worker__Group__12__Impl rule__Worker__Group__13 ;
    public final void rule__Worker__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__Worker__Group__12__Impl rule__Worker__Group__13 )
            // InternalMyDsl.g:961:2: rule__Worker__Group__12__Impl rule__Worker__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__Worker__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__13();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__12"


    // $ANTLR start "rule__Worker__Group__12__Impl"
    // InternalMyDsl.g:968:1: rule__Worker__Group__12__Impl : ( '=' ) ;
    public final void rule__Worker__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( '=' ) )
            // InternalMyDsl.g:973:1: ( '=' )
            {
            // InternalMyDsl.g:973:1: ( '=' )
            // InternalMyDsl.g:974:2: '='
            {
             before(grammarAccess.getWorkerAccess().getEqualsSignKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getEqualsSignKeyword_12()); 

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
    // $ANTLR end "rule__Worker__Group__12__Impl"


    // $ANTLR start "rule__Worker__Group__13"
    // InternalMyDsl.g:983:1: rule__Worker__Group__13 : rule__Worker__Group__13__Impl rule__Worker__Group__14 ;
    public final void rule__Worker__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__Worker__Group__13__Impl rule__Worker__Group__14 )
            // InternalMyDsl.g:988:2: rule__Worker__Group__13__Impl rule__Worker__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Worker__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__14();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__13"


    // $ANTLR start "rule__Worker__Group__13__Impl"
    // InternalMyDsl.g:995:1: rule__Worker__Group__13__Impl : ( ( rule__Worker__IsActiveAssignment_13 ) ) ;
    public final void rule__Worker__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( ( rule__Worker__IsActiveAssignment_13 ) ) )
            // InternalMyDsl.g:1000:1: ( ( rule__Worker__IsActiveAssignment_13 ) )
            {
            // InternalMyDsl.g:1000:1: ( ( rule__Worker__IsActiveAssignment_13 ) )
            // InternalMyDsl.g:1001:2: ( rule__Worker__IsActiveAssignment_13 )
            {
             before(grammarAccess.getWorkerAccess().getIsActiveAssignment_13()); 
            // InternalMyDsl.g:1002:2: ( rule__Worker__IsActiveAssignment_13 )
            // InternalMyDsl.g:1002:3: rule__Worker__IsActiveAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Worker__IsActiveAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getWorkerAccess().getIsActiveAssignment_13()); 

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
    // $ANTLR end "rule__Worker__Group__13__Impl"


    // $ANTLR start "rule__Worker__Group__14"
    // InternalMyDsl.g:1010:1: rule__Worker__Group__14 : rule__Worker__Group__14__Impl rule__Worker__Group__15 ;
    public final void rule__Worker__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__Worker__Group__14__Impl rule__Worker__Group__15 )
            // InternalMyDsl.g:1015:2: rule__Worker__Group__14__Impl rule__Worker__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__Worker__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Worker__Group__15();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__14"


    // $ANTLR start "rule__Worker__Group__14__Impl"
    // InternalMyDsl.g:1022:1: rule__Worker__Group__14__Impl : ( ';' ) ;
    public final void rule__Worker__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ';' ) )
            // InternalMyDsl.g:1027:1: ( ';' )
            {
            // InternalMyDsl.g:1027:1: ( ';' )
            // InternalMyDsl.g:1028:2: ';'
            {
             before(grammarAccess.getWorkerAccess().getSemicolonKeyword_14()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getSemicolonKeyword_14()); 

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
    // $ANTLR end "rule__Worker__Group__14__Impl"


    // $ANTLR start "rule__Worker__Group__15"
    // InternalMyDsl.g:1037:1: rule__Worker__Group__15 : rule__Worker__Group__15__Impl ;
    public final void rule__Worker__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__Worker__Group__15__Impl )
            // InternalMyDsl.g:1042:2: rule__Worker__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Worker__Group__15__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Worker__Group__15"


    // $ANTLR start "rule__Worker__Group__15__Impl"
    // InternalMyDsl.g:1048:1: rule__Worker__Group__15__Impl : ( '}' ) ;
    public final void rule__Worker__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( ( '}' ) )
            // InternalMyDsl.g:1053:1: ( '}' )
            {
            // InternalMyDsl.g:1053:1: ( '}' )
            // InternalMyDsl.g:1054:2: '}'
            {
             before(grammarAccess.getWorkerAccess().getRightCurlyBracketKeyword_15()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Worker__Group__15__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalMyDsl.g:1064:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalMyDsl.g:1069:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalMyDsl.g:1076:1: rule__Task__Group__0__Impl : ( 'task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( 'task' ) )
            // InternalMyDsl.g:1081:1: ( 'task' )
            {
            // InternalMyDsl.g:1081:1: ( 'task' )
            // InternalMyDsl.g:1082:2: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalMyDsl.g:1091:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalMyDsl.g:1096:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalMyDsl.g:1103:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1108:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1108:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalMyDsl.g:1109:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1110:2: ( rule__Task__NameAssignment_1 )
            // InternalMyDsl.g:1110:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalMyDsl.g:1118:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalMyDsl.g:1123:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalMyDsl.g:1130:1: rule__Task__Group__2__Impl : ( '{' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( ( '{' ) )
            // InternalMyDsl.g:1135:1: ( '{' )
            {
            // InternalMyDsl.g:1135:1: ( '{' )
            // InternalMyDsl.g:1136:2: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalMyDsl.g:1145:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalMyDsl.g:1150:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalMyDsl.g:1157:1: rule__Task__Group__3__Impl : ( 'difficulty' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( 'difficulty' ) )
            // InternalMyDsl.g:1162:1: ( 'difficulty' )
            {
            // InternalMyDsl.g:1162:1: ( 'difficulty' )
            // InternalMyDsl.g:1163:2: 'difficulty'
            {
             before(grammarAccess.getTaskAccess().getDifficultyKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDifficultyKeyword_3()); 

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
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalMyDsl.g:1172:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalMyDsl.g:1177:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalMyDsl.g:1184:1: rule__Task__Group__4__Impl : ( '=' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( '=' ) )
            // InternalMyDsl.g:1189:1: ( '=' )
            {
            // InternalMyDsl.g:1189:1: ( '=' )
            // InternalMyDsl.g:1190:2: '='
            {
             before(grammarAccess.getTaskAccess().getEqualsSignKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalMyDsl.g:1199:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalMyDsl.g:1204:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalMyDsl.g:1211:1: rule__Task__Group__5__Impl : ( ( rule__Task__DifficultyAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( ( ( rule__Task__DifficultyAssignment_5 ) ) )
            // InternalMyDsl.g:1216:1: ( ( rule__Task__DifficultyAssignment_5 ) )
            {
            // InternalMyDsl.g:1216:1: ( ( rule__Task__DifficultyAssignment_5 ) )
            // InternalMyDsl.g:1217:2: ( rule__Task__DifficultyAssignment_5 )
            {
             before(grammarAccess.getTaskAccess().getDifficultyAssignment_5()); 
            // InternalMyDsl.g:1218:2: ( rule__Task__DifficultyAssignment_5 )
            // InternalMyDsl.g:1218:3: rule__Task__DifficultyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Task__DifficultyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDifficultyAssignment_5()); 

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
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalMyDsl.g:1226:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalMyDsl.g:1231:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalMyDsl.g:1238:1: rule__Task__Group__6__Impl : ( ';' ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ';' ) )
            // InternalMyDsl.g:1243:1: ( ';' )
            {
            // InternalMyDsl.g:1243:1: ( ';' )
            // InternalMyDsl.g:1244:2: ';'
            {
             before(grammarAccess.getTaskAccess().getSemicolonKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // InternalMyDsl.g:1253:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalMyDsl.g:1258:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // InternalMyDsl.g:1265:1: rule__Task__Group__7__Impl : ( 'duration' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( 'duration' ) )
            // InternalMyDsl.g:1270:1: ( 'duration' )
            {
            // InternalMyDsl.g:1270:1: ( 'duration' )
            // InternalMyDsl.g:1271:2: 'duration'
            {
             before(grammarAccess.getTaskAccess().getDurationKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDurationKeyword_7()); 

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
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // InternalMyDsl.g:1280:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalMyDsl.g:1285:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Task__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // InternalMyDsl.g:1292:1: rule__Task__Group__8__Impl : ( '=' ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( '=' ) )
            // InternalMyDsl.g:1297:1: ( '=' )
            {
            // InternalMyDsl.g:1297:1: ( '=' )
            // InternalMyDsl.g:1298:2: '='
            {
             before(grammarAccess.getTaskAccess().getEqualsSignKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getEqualsSignKeyword_8()); 

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
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__9"
    // InternalMyDsl.g:1307:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalMyDsl.g:1312:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__9"


    // $ANTLR start "rule__Task__Group__9__Impl"
    // InternalMyDsl.g:1319:1: rule__Task__Group__9__Impl : ( ( rule__Task__DurationAssignment_9 ) ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( ( ( rule__Task__DurationAssignment_9 ) ) )
            // InternalMyDsl.g:1324:1: ( ( rule__Task__DurationAssignment_9 ) )
            {
            // InternalMyDsl.g:1324:1: ( ( rule__Task__DurationAssignment_9 ) )
            // InternalMyDsl.g:1325:2: ( rule__Task__DurationAssignment_9 )
            {
             before(grammarAccess.getTaskAccess().getDurationAssignment_9()); 
            // InternalMyDsl.g:1326:2: ( rule__Task__DurationAssignment_9 )
            // InternalMyDsl.g:1326:3: rule__Task__DurationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDurationAssignment_9()); 

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
    // $ANTLR end "rule__Task__Group__9__Impl"


    // $ANTLR start "rule__Task__Group__10"
    // InternalMyDsl.g:1334:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalMyDsl.g:1339:2: rule__Task__Group__10__Impl rule__Task__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__Task__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__10"


    // $ANTLR start "rule__Task__Group__10__Impl"
    // InternalMyDsl.g:1346:1: rule__Task__Group__10__Impl : ( ';' ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( ';' ) )
            // InternalMyDsl.g:1351:1: ( ';' )
            {
            // InternalMyDsl.g:1351:1: ( ';' )
            // InternalMyDsl.g:1352:2: ';'
            {
             before(grammarAccess.getTaskAccess().getSemicolonKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSemicolonKeyword_10()); 

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
    // $ANTLR end "rule__Task__Group__10__Impl"


    // $ANTLR start "rule__Task__Group__11"
    // InternalMyDsl.g:1361:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalMyDsl.g:1366:2: rule__Task__Group__11__Impl rule__Task__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__12();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__11"


    // $ANTLR start "rule__Task__Group__11__Impl"
    // InternalMyDsl.g:1373:1: rule__Task__Group__11__Impl : ( 'start' ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1377:1: ( ( 'start' ) )
            // InternalMyDsl.g:1378:1: ( 'start' )
            {
            // InternalMyDsl.g:1378:1: ( 'start' )
            // InternalMyDsl.g:1379:2: 'start'
            {
             before(grammarAccess.getTaskAccess().getStartKeyword_11()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartKeyword_11()); 

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
    // $ANTLR end "rule__Task__Group__11__Impl"


    // $ANTLR start "rule__Task__Group__12"
    // InternalMyDsl.g:1388:1: rule__Task__Group__12 : rule__Task__Group__12__Impl rule__Task__Group__13 ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( rule__Task__Group__12__Impl rule__Task__Group__13 )
            // InternalMyDsl.g:1393:2: rule__Task__Group__12__Impl rule__Task__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__Task__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__13();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__12"


    // $ANTLR start "rule__Task__Group__12__Impl"
    // InternalMyDsl.g:1400:1: rule__Task__Group__12__Impl : ( '=' ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( '=' ) )
            // InternalMyDsl.g:1405:1: ( '=' )
            {
            // InternalMyDsl.g:1405:1: ( '=' )
            // InternalMyDsl.g:1406:2: '='
            {
             before(grammarAccess.getTaskAccess().getEqualsSignKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getEqualsSignKeyword_12()); 

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
    // $ANTLR end "rule__Task__Group__12__Impl"


    // $ANTLR start "rule__Task__Group__13"
    // InternalMyDsl.g:1415:1: rule__Task__Group__13 : rule__Task__Group__13__Impl rule__Task__Group__14 ;
    public final void rule__Task__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( rule__Task__Group__13__Impl rule__Task__Group__14 )
            // InternalMyDsl.g:1420:2: rule__Task__Group__13__Impl rule__Task__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__14();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__13"


    // $ANTLR start "rule__Task__Group__13__Impl"
    // InternalMyDsl.g:1427:1: rule__Task__Group__13__Impl : ( ( rule__Task__StartAssignment_13 ) ) ;
    public final void rule__Task__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( ( rule__Task__StartAssignment_13 ) ) )
            // InternalMyDsl.g:1432:1: ( ( rule__Task__StartAssignment_13 ) )
            {
            // InternalMyDsl.g:1432:1: ( ( rule__Task__StartAssignment_13 ) )
            // InternalMyDsl.g:1433:2: ( rule__Task__StartAssignment_13 )
            {
             before(grammarAccess.getTaskAccess().getStartAssignment_13()); 
            // InternalMyDsl.g:1434:2: ( rule__Task__StartAssignment_13 )
            // InternalMyDsl.g:1434:3: rule__Task__StartAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Task__StartAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStartAssignment_13()); 

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
    // $ANTLR end "rule__Task__Group__13__Impl"


    // $ANTLR start "rule__Task__Group__14"
    // InternalMyDsl.g:1442:1: rule__Task__Group__14 : rule__Task__Group__14__Impl rule__Task__Group__15 ;
    public final void rule__Task__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( rule__Task__Group__14__Impl rule__Task__Group__15 )
            // InternalMyDsl.g:1447:2: rule__Task__Group__14__Impl rule__Task__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__Task__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__15();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__14"


    // $ANTLR start "rule__Task__Group__14__Impl"
    // InternalMyDsl.g:1454:1: rule__Task__Group__14__Impl : ( ';' ) ;
    public final void rule__Task__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( ';' ) )
            // InternalMyDsl.g:1459:1: ( ';' )
            {
            // InternalMyDsl.g:1459:1: ( ';' )
            // InternalMyDsl.g:1460:2: ';'
            {
             before(grammarAccess.getTaskAccess().getSemicolonKeyword_14()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSemicolonKeyword_14()); 

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
    // $ANTLR end "rule__Task__Group__14__Impl"


    // $ANTLR start "rule__Task__Group__15"
    // InternalMyDsl.g:1469:1: rule__Task__Group__15 : rule__Task__Group__15__Impl ;
    public final void rule__Task__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( rule__Task__Group__15__Impl )
            // InternalMyDsl.g:1474:2: rule__Task__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__15__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Task__Group__15"


    // $ANTLR start "rule__Task__Group__15__Impl"
    // InternalMyDsl.g:1480:1: rule__Task__Group__15__Impl : ( '}' ) ;
    public final void rule__Task__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( '}' ) )
            // InternalMyDsl.g:1485:1: ( '}' )
            {
            // InternalMyDsl.g:1485:1: ( '}' )
            // InternalMyDsl.g:1486:2: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_15()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Task__Group__15__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMyDsl.g:1496:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMyDsl.g:1501:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMyDsl.g:1508:1: rule__Rule__Group__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( ( 'if' ) )
            // InternalMyDsl.g:1513:1: ( 'if' )
            {
            // InternalMyDsl.g:1513:1: ( 'if' )
            // InternalMyDsl.g:1514:2: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMyDsl.g:1523:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMyDsl.g:1528:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMyDsl.g:1535:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( ( rule__Rule__ConditionAssignment_1 ) ) )
            // InternalMyDsl.g:1540:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            {
            // InternalMyDsl.g:1540:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            // InternalMyDsl.g:1541:2: ( rule__Rule__ConditionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_1()); 
            // InternalMyDsl.g:1542:2: ( rule__Rule__ConditionAssignment_1 )
            // InternalMyDsl.g:1542:3: rule__Rule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMyDsl.g:1550:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMyDsl.g:1555:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMyDsl.g:1562:1: rule__Rule__Group__2__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1566:1: ( ( 'then' ) )
            // InternalMyDsl.g:1567:1: ( 'then' )
            {
            // InternalMyDsl.g:1567:1: ( 'then' )
            // InternalMyDsl.g:1568:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThenKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalMyDsl.g:1577:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalMyDsl.g:1582:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalMyDsl.g:1589:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__AssignAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ( rule__Rule__AssignAssignment_3 ) ) )
            // InternalMyDsl.g:1594:1: ( ( rule__Rule__AssignAssignment_3 ) )
            {
            // InternalMyDsl.g:1594:1: ( ( rule__Rule__AssignAssignment_3 ) )
            // InternalMyDsl.g:1595:2: ( rule__Rule__AssignAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getAssignAssignment_3()); 
            // InternalMyDsl.g:1596:2: ( rule__Rule__AssignAssignment_3 )
            // InternalMyDsl.g:1596:3: rule__Rule__AssignAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AssignAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAssignAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalMyDsl.g:1604:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( rule__Rule__Group__4__Impl )
            // InternalMyDsl.g:1609:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalMyDsl.g:1615:1: rule__Rule__Group__4__Impl : ( ';' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( ';' ) )
            // InternalMyDsl.g:1620:1: ( ';' )
            {
            // InternalMyDsl.g:1620:1: ( ';' )
            // InternalMyDsl.g:1621:2: ';'
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__TIME__Group__0"
    // InternalMyDsl.g:1631:1: rule__TIME__Group__0 : rule__TIME__Group__0__Impl rule__TIME__Group__1 ;
    public final void rule__TIME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( rule__TIME__Group__0__Impl rule__TIME__Group__1 )
            // InternalMyDsl.g:1636:2: rule__TIME__Group__0__Impl rule__TIME__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__TIME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TIME__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__TIME__Group__0"


    // $ANTLR start "rule__TIME__Group__0__Impl"
    // InternalMyDsl.g:1643:1: rule__TIME__Group__0__Impl : ( ( rule__TIME__HoursAssignment_0 ) ) ;
    public final void rule__TIME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( ( ( rule__TIME__HoursAssignment_0 ) ) )
            // InternalMyDsl.g:1648:1: ( ( rule__TIME__HoursAssignment_0 ) )
            {
            // InternalMyDsl.g:1648:1: ( ( rule__TIME__HoursAssignment_0 ) )
            // InternalMyDsl.g:1649:2: ( rule__TIME__HoursAssignment_0 )
            {
             before(grammarAccess.getTIMEAccess().getHoursAssignment_0()); 
            // InternalMyDsl.g:1650:2: ( rule__TIME__HoursAssignment_0 )
            // InternalMyDsl.g:1650:3: rule__TIME__HoursAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TIME__HoursAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getHoursAssignment_0()); 

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
    // $ANTLR end "rule__TIME__Group__0__Impl"


    // $ANTLR start "rule__TIME__Group__1"
    // InternalMyDsl.g:1658:1: rule__TIME__Group__1 : rule__TIME__Group__1__Impl rule__TIME__Group__2 ;
    public final void rule__TIME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( rule__TIME__Group__1__Impl rule__TIME__Group__2 )
            // InternalMyDsl.g:1663:2: rule__TIME__Group__1__Impl rule__TIME__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__TIME__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TIME__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__TIME__Group__1"


    // $ANTLR start "rule__TIME__Group__1__Impl"
    // InternalMyDsl.g:1670:1: rule__TIME__Group__1__Impl : ( ':' ) ;
    public final void rule__TIME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( ':' ) )
            // InternalMyDsl.g:1675:1: ( ':' )
            {
            // InternalMyDsl.g:1675:1: ( ':' )
            // InternalMyDsl.g:1676:2: ':'
            {
             before(grammarAccess.getTIMEAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTIMEAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__TIME__Group__1__Impl"


    // $ANTLR start "rule__TIME__Group__2"
    // InternalMyDsl.g:1685:1: rule__TIME__Group__2 : rule__TIME__Group__2__Impl ;
    public final void rule__TIME__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( rule__TIME__Group__2__Impl )
            // InternalMyDsl.g:1690:2: rule__TIME__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TIME__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TIME__Group__2"


    // $ANTLR start "rule__TIME__Group__2__Impl"
    // InternalMyDsl.g:1696:1: rule__TIME__Group__2__Impl : ( ( rule__TIME__MinutesAssignment_2 ) ) ;
    public final void rule__TIME__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( ( ( rule__TIME__MinutesAssignment_2 ) ) )
            // InternalMyDsl.g:1701:1: ( ( rule__TIME__MinutesAssignment_2 ) )
            {
            // InternalMyDsl.g:1701:1: ( ( rule__TIME__MinutesAssignment_2 ) )
            // InternalMyDsl.g:1702:2: ( rule__TIME__MinutesAssignment_2 )
            {
             before(grammarAccess.getTIMEAccess().getMinutesAssignment_2()); 
            // InternalMyDsl.g:1703:2: ( rule__TIME__MinutesAssignment_2 )
            // InternalMyDsl.g:1703:3: rule__TIME__MinutesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TIME__MinutesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getMinutesAssignment_2()); 

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
    // $ANTLR end "rule__TIME__Group__2__Impl"


    // $ANTLR start "rule__OrCondition__Group__0"
    // InternalMyDsl.g:1712:1: rule__OrCondition__Group__0 : rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 ;
    public final void rule__OrCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 )
            // InternalMyDsl.g:1717:2: rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__OrCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__OrCondition__Group__0"


    // $ANTLR start "rule__OrCondition__Group__0__Impl"
    // InternalMyDsl.g:1724:1: rule__OrCondition__Group__0__Impl : ( ruleAndCondition ) ;
    public final void rule__OrCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( ( ruleAndCondition ) )
            // InternalMyDsl.g:1729:1: ( ruleAndCondition )
            {
            // InternalMyDsl.g:1729:1: ( ruleAndCondition )
            // InternalMyDsl.g:1730:2: ruleAndCondition
            {
             before(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndCondition();

            state._fsp--;

             after(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrCondition__Group__0__Impl"


    // $ANTLR start "rule__OrCondition__Group__1"
    // InternalMyDsl.g:1739:1: rule__OrCondition__Group__1 : rule__OrCondition__Group__1__Impl ;
    public final void rule__OrCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1743:1: ( rule__OrCondition__Group__1__Impl )
            // InternalMyDsl.g:1744:2: rule__OrCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__OrCondition__Group__1"


    // $ANTLR start "rule__OrCondition__Group__1__Impl"
    // InternalMyDsl.g:1750:1: rule__OrCondition__Group__1__Impl : ( ( rule__OrCondition__Group_1__0 )* ) ;
    public final void rule__OrCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1754:1: ( ( ( rule__OrCondition__Group_1__0 )* ) )
            // InternalMyDsl.g:1755:1: ( ( rule__OrCondition__Group_1__0 )* )
            {
            // InternalMyDsl.g:1755:1: ( ( rule__OrCondition__Group_1__0 )* )
            // InternalMyDsl.g:1756:2: ( rule__OrCondition__Group_1__0 )*
            {
             before(grammarAccess.getOrConditionAccess().getGroup_1()); 
            // InternalMyDsl.g:1757:2: ( rule__OrCondition__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1757:3: rule__OrCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OrCondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getOrConditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrCondition__Group__1__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__0"
    // InternalMyDsl.g:1766:1: rule__OrCondition__Group_1__0 : rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1 ;
    public final void rule__OrCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1 )
            // InternalMyDsl.g:1771:2: rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__OrCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__OrCondition__Group_1__0"


    // $ANTLR start "rule__OrCondition__Group_1__0__Impl"
    // InternalMyDsl.g:1778:1: rule__OrCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__OrCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( ( () ) )
            // InternalMyDsl.g:1783:1: ( () )
            {
            // InternalMyDsl.g:1783:1: ( () )
            // InternalMyDsl.g:1784:2: ()
            {
             before(grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0()); 
            // InternalMyDsl.g:1785:2: ()
            // InternalMyDsl.g:1785:3: 
            {
            }

             after(grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__0__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__1"
    // InternalMyDsl.g:1793:1: rule__OrCondition__Group_1__1 : rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2 ;
    public final void rule__OrCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1797:1: ( rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2 )
            // InternalMyDsl.g:1798:2: rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__OrCondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__OrCondition__Group_1__1"


    // $ANTLR start "rule__OrCondition__Group_1__1__Impl"
    // InternalMyDsl.g:1805:1: rule__OrCondition__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__OrCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( ( 'OR' ) )
            // InternalMyDsl.g:1810:1: ( 'OR' )
            {
            // InternalMyDsl.g:1810:1: ( 'OR' )
            // InternalMyDsl.g:1811:2: 'OR'
            {
             before(grammarAccess.getOrConditionAccess().getORKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOrConditionAccess().getORKeyword_1_1()); 

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
    // $ANTLR end "rule__OrCondition__Group_1__1__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__2"
    // InternalMyDsl.g:1820:1: rule__OrCondition__Group_1__2 : rule__OrCondition__Group_1__2__Impl ;
    public final void rule__OrCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( rule__OrCondition__Group_1__2__Impl )
            // InternalMyDsl.g:1825:2: rule__OrCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__OrCondition__Group_1__2"


    // $ANTLR start "rule__OrCondition__Group_1__2__Impl"
    // InternalMyDsl.g:1831:1: rule__OrCondition__Group_1__2__Impl : ( ( rule__OrCondition__RightAssignment_1_2 ) ) ;
    public final void rule__OrCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1835:1: ( ( ( rule__OrCondition__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1836:1: ( ( rule__OrCondition__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1836:1: ( ( rule__OrCondition__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1837:2: ( rule__OrCondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrConditionAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1838:2: ( rule__OrCondition__RightAssignment_1_2 )
            // InternalMyDsl.g:1838:3: rule__OrCondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrConditionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OrCondition__Group_1__2__Impl"


    // $ANTLR start "rule__AndCondition__Group__0"
    // InternalMyDsl.g:1847:1: rule__AndCondition__Group__0 : rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 ;
    public final void rule__AndCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 )
            // InternalMyDsl.g:1852:2: rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AndCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AndCondition__Group__0"


    // $ANTLR start "rule__AndCondition__Group__0__Impl"
    // InternalMyDsl.g:1859:1: rule__AndCondition__Group__0__Impl : ( rulePrimaryCondition ) ;
    public final void rule__AndCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( ( rulePrimaryCondition ) )
            // InternalMyDsl.g:1864:1: ( rulePrimaryCondition )
            {
            // InternalMyDsl.g:1864:1: ( rulePrimaryCondition )
            // InternalMyDsl.g:1865:2: rulePrimaryCondition
            {
             before(grammarAccess.getAndConditionAccess().getPrimaryConditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryCondition();

            state._fsp--;

             after(grammarAccess.getAndConditionAccess().getPrimaryConditionParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndCondition__Group__0__Impl"


    // $ANTLR start "rule__AndCondition__Group__1"
    // InternalMyDsl.g:1874:1: rule__AndCondition__Group__1 : rule__AndCondition__Group__1__Impl ;
    public final void rule__AndCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1878:1: ( rule__AndCondition__Group__1__Impl )
            // InternalMyDsl.g:1879:2: rule__AndCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AndCondition__Group__1"


    // $ANTLR start "rule__AndCondition__Group__1__Impl"
    // InternalMyDsl.g:1885:1: rule__AndCondition__Group__1__Impl : ( ( rule__AndCondition__Group_1__0 )* ) ;
    public final void rule__AndCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1889:1: ( ( ( rule__AndCondition__Group_1__0 )* ) )
            // InternalMyDsl.g:1890:1: ( ( rule__AndCondition__Group_1__0 )* )
            {
            // InternalMyDsl.g:1890:1: ( ( rule__AndCondition__Group_1__0 )* )
            // InternalMyDsl.g:1891:2: ( rule__AndCondition__Group_1__0 )*
            {
             before(grammarAccess.getAndConditionAccess().getGroup_1()); 
            // InternalMyDsl.g:1892:2: ( rule__AndCondition__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1892:3: rule__AndCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AndCondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAndConditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndCondition__Group__1__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__0"
    // InternalMyDsl.g:1901:1: rule__AndCondition__Group_1__0 : rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1 ;
    public final void rule__AndCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1 )
            // InternalMyDsl.g:1906:2: rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__AndCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__AndCondition__Group_1__0"


    // $ANTLR start "rule__AndCondition__Group_1__0__Impl"
    // InternalMyDsl.g:1913:1: rule__AndCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__AndCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( ( () ) )
            // InternalMyDsl.g:1918:1: ( () )
            {
            // InternalMyDsl.g:1918:1: ( () )
            // InternalMyDsl.g:1919:2: ()
            {
             before(grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0()); 
            // InternalMyDsl.g:1920:2: ()
            // InternalMyDsl.g:1920:3: 
            {
            }

             after(grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__0__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__1"
    // InternalMyDsl.g:1928:1: rule__AndCondition__Group_1__1 : rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2 ;
    public final void rule__AndCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2 )
            // InternalMyDsl.g:1933:2: rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__AndCondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__AndCondition__Group_1__1"


    // $ANTLR start "rule__AndCondition__Group_1__1__Impl"
    // InternalMyDsl.g:1940:1: rule__AndCondition__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__AndCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( 'AND' ) )
            // InternalMyDsl.g:1945:1: ( 'AND' )
            {
            // InternalMyDsl.g:1945:1: ( 'AND' )
            // InternalMyDsl.g:1946:2: 'AND'
            {
             before(grammarAccess.getAndConditionAccess().getANDKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAndConditionAccess().getANDKeyword_1_1()); 

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
    // $ANTLR end "rule__AndCondition__Group_1__1__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__2"
    // InternalMyDsl.g:1955:1: rule__AndCondition__Group_1__2 : rule__AndCondition__Group_1__2__Impl ;
    public final void rule__AndCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( rule__AndCondition__Group_1__2__Impl )
            // InternalMyDsl.g:1960:2: rule__AndCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AndCondition__Group_1__2"


    // $ANTLR start "rule__AndCondition__Group_1__2__Impl"
    // InternalMyDsl.g:1966:1: rule__AndCondition__Group_1__2__Impl : ( ( rule__AndCondition__RightAssignment_1_2 ) ) ;
    public final void rule__AndCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( ( rule__AndCondition__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1971:1: ( ( rule__AndCondition__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1971:1: ( ( rule__AndCondition__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1972:2: ( rule__AndCondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndConditionAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1973:2: ( rule__AndCondition__RightAssignment_1_2 )
            // InternalMyDsl.g:1973:3: rule__AndCondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndConditionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndCondition__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryCondition__Group_0__0"
    // InternalMyDsl.g:1982:1: rule__PrimaryCondition__Group_0__0 : rule__PrimaryCondition__Group_0__0__Impl rule__PrimaryCondition__Group_0__1 ;
    public final void rule__PrimaryCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1986:1: ( rule__PrimaryCondition__Group_0__0__Impl rule__PrimaryCondition__Group_0__1 )
            // InternalMyDsl.g:1987:2: rule__PrimaryCondition__Group_0__0__Impl rule__PrimaryCondition__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__PrimaryCondition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Group_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__PrimaryCondition__Group_0__0"


    // $ANTLR start "rule__PrimaryCondition__Group_0__0__Impl"
    // InternalMyDsl.g:1994:1: rule__PrimaryCondition__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimaryCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( ( () ) )
            // InternalMyDsl.g:1999:1: ( () )
            {
            // InternalMyDsl.g:1999:1: ( () )
            // InternalMyDsl.g:2000:2: ()
            {
             before(grammarAccess.getPrimaryConditionAccess().getPrimaryConditionAction_0_0()); 
            // InternalMyDsl.g:2001:2: ()
            // InternalMyDsl.g:2001:3: 
            {
            }

             after(grammarAccess.getPrimaryConditionAccess().getPrimaryConditionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondition__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryCondition__Group_0__1"
    // InternalMyDsl.g:2009:1: rule__PrimaryCondition__Group_0__1 : rule__PrimaryCondition__Group_0__1__Impl rule__PrimaryCondition__Group_0__2 ;
    public final void rule__PrimaryCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( rule__PrimaryCondition__Group_0__1__Impl rule__PrimaryCondition__Group_0__2 )
            // InternalMyDsl.g:2014:2: rule__PrimaryCondition__Group_0__1__Impl rule__PrimaryCondition__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__PrimaryCondition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Group_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__PrimaryCondition__Group_0__1"


    // $ANTLR start "rule__PrimaryCondition__Group_0__1__Impl"
    // InternalMyDsl.g:2021:1: rule__PrimaryCondition__Group_0__1__Impl : ( '(' ) ;
    public final void rule__PrimaryCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2025:1: ( ( '(' ) )
            // InternalMyDsl.g:2026:1: ( '(' )
            {
            // InternalMyDsl.g:2026:1: ( '(' )
            // InternalMyDsl.g:2027:2: '('
            {
             before(grammarAccess.getPrimaryConditionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPrimaryConditionAccess().getLeftParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__PrimaryCondition__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryCondition__Group_0__2"
    // InternalMyDsl.g:2036:1: rule__PrimaryCondition__Group_0__2 : rule__PrimaryCondition__Group_0__2__Impl rule__PrimaryCondition__Group_0__3 ;
    public final void rule__PrimaryCondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2040:1: ( rule__PrimaryCondition__Group_0__2__Impl rule__PrimaryCondition__Group_0__3 )
            // InternalMyDsl.g:2041:2: rule__PrimaryCondition__Group_0__2__Impl rule__PrimaryCondition__Group_0__3
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryCondition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Group_0__3();

            state._fsp--;


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
    // $ANTLR end "rule__PrimaryCondition__Group_0__2"


    // $ANTLR start "rule__PrimaryCondition__Group_0__2__Impl"
    // InternalMyDsl.g:2048:1: rule__PrimaryCondition__Group_0__2__Impl : ( ( rule__PrimaryCondition__InnerAssignment_0_2 ) ) ;
    public final void rule__PrimaryCondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( ( rule__PrimaryCondition__InnerAssignment_0_2 ) ) )
            // InternalMyDsl.g:2053:1: ( ( rule__PrimaryCondition__InnerAssignment_0_2 ) )
            {
            // InternalMyDsl.g:2053:1: ( ( rule__PrimaryCondition__InnerAssignment_0_2 ) )
            // InternalMyDsl.g:2054:2: ( rule__PrimaryCondition__InnerAssignment_0_2 )
            {
             before(grammarAccess.getPrimaryConditionAccess().getInnerAssignment_0_2()); 
            // InternalMyDsl.g:2055:2: ( rule__PrimaryCondition__InnerAssignment_0_2 )
            // InternalMyDsl.g:2055:3: rule__PrimaryCondition__InnerAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__InnerAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryConditionAccess().getInnerAssignment_0_2()); 

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
    // $ANTLR end "rule__PrimaryCondition__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryCondition__Group_0__3"
    // InternalMyDsl.g:2063:1: rule__PrimaryCondition__Group_0__3 : rule__PrimaryCondition__Group_0__3__Impl ;
    public final void rule__PrimaryCondition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( rule__PrimaryCondition__Group_0__3__Impl )
            // InternalMyDsl.g:2068:2: rule__PrimaryCondition__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Group_0__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PrimaryCondition__Group_0__3"


    // $ANTLR start "rule__PrimaryCondition__Group_0__3__Impl"
    // InternalMyDsl.g:2074:1: rule__PrimaryCondition__Group_0__3__Impl : ( ')' ) ;
    public final void rule__PrimaryCondition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( ( ')' ) )
            // InternalMyDsl.g:2079:1: ( ')' )
            {
            // InternalMyDsl.g:2079:1: ( ')' )
            // InternalMyDsl.g:2080:2: ')'
            {
             before(grammarAccess.getPrimaryConditionAccess().getRightParenthesisKeyword_0_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimaryConditionAccess().getRightParenthesisKeyword_0_3()); 

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
    // $ANTLR end "rule__PrimaryCondition__Group_0__3__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalMyDsl.g:2090:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMyDsl.g:2095:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalMyDsl.g:2102:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__OperatorAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( ( rule__Comparison__OperatorAssignment_0 ) ) )
            // InternalMyDsl.g:2107:1: ( ( rule__Comparison__OperatorAssignment_0 ) )
            {
            // InternalMyDsl.g:2107:1: ( ( rule__Comparison__OperatorAssignment_0 ) )
            // InternalMyDsl.g:2108:2: ( rule__Comparison__OperatorAssignment_0 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_0()); 
            // InternalMyDsl.g:2109:2: ( rule__Comparison__OperatorAssignment_0 )
            // InternalMyDsl.g:2109:3: rule__Comparison__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperatorAssignment_0()); 

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalMyDsl.g:2117:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalMyDsl.g:2122:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalMyDsl.g:2129:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__DurationAssignment_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( ( ( rule__Comparison__DurationAssignment_1 ) ) )
            // InternalMyDsl.g:2134:1: ( ( rule__Comparison__DurationAssignment_1 ) )
            {
            // InternalMyDsl.g:2134:1: ( ( rule__Comparison__DurationAssignment_1 ) )
            // InternalMyDsl.g:2135:2: ( rule__Comparison__DurationAssignment_1 )
            {
             before(grammarAccess.getComparisonAccess().getDurationAssignment_1()); 
            // InternalMyDsl.g:2136:2: ( rule__Comparison__DurationAssignment_1 )
            // InternalMyDsl.g:2136:3: rule__Comparison__DurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__DurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getDurationAssignment_1()); 

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // InternalMyDsl.g:2144:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( rule__Comparison__Group__2__Impl )
            // InternalMyDsl.g:2149:2: rule__Comparison__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // InternalMyDsl.g:2155:1: rule__Comparison__Group__2__Impl : ( ( 'min' )? ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2159:1: ( ( ( 'min' )? ) )
            // InternalMyDsl.g:2160:1: ( ( 'min' )? )
            {
            // InternalMyDsl.g:2160:1: ( ( 'min' )? )
            // InternalMyDsl.g:2161:2: ( 'min' )?
            {
             before(grammarAccess.getComparisonAccess().getMinKeyword_2()); 
            // InternalMyDsl.g:2162:2: ( 'min' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:2162:3: 'min'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComparisonAccess().getMinKeyword_2()); 

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
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Model__WorkersAssignment_0"
    // InternalMyDsl.g:2171:1: rule__Model__WorkersAssignment_0 : ( ruleWorker ) ;
    public final void rule__Model__WorkersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( ( ruleWorker ) )
            // InternalMyDsl.g:2176:2: ( ruleWorker )
            {
            // InternalMyDsl.g:2176:2: ( ruleWorker )
            // InternalMyDsl.g:2177:3: ruleWorker
            {
             before(grammarAccess.getModelAccess().getWorkersWorkerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWorker();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWorkersWorkerParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__WorkersAssignment_0"


    // $ANTLR start "rule__Model__TasksAssignment_1"
    // InternalMyDsl.g:2186:1: rule__Model__TasksAssignment_1 : ( ruleTask ) ;
    public final void rule__Model__TasksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2190:1: ( ( ruleTask ) )
            // InternalMyDsl.g:2191:2: ( ruleTask )
            {
            // InternalMyDsl.g:2191:2: ( ruleTask )
            // InternalMyDsl.g:2192:3: ruleTask
            {
             before(grammarAccess.getModelAccess().getTasksTaskParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTasksTaskParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__TasksAssignment_1"


    // $ANTLR start "rule__Model__RulesAssignment_2"
    // InternalMyDsl.g:2201:1: rule__Model__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( ( ruleRule ) )
            // InternalMyDsl.g:2206:2: ( ruleRule )
            {
            // InternalMyDsl.g:2206:2: ( ruleRule )
            // InternalMyDsl.g:2207:3: ruleRule
            {
             before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__RulesAssignment_2"


    // $ANTLR start "rule__Worker__IdAssignment_1"
    // InternalMyDsl.g:2216:1: rule__Worker__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Worker__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2220:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2221:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2221:2: ( RULE_ID )
            // InternalMyDsl.g:2222:3: RULE_ID
            {
             before(grammarAccess.getWorkerAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Worker__IdAssignment_1"


    // $ANTLR start "rule__Worker__NameAssignment_5"
    // InternalMyDsl.g:2231:1: rule__Worker__NameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Worker__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2236:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2236:2: ( RULE_STRING )
            // InternalMyDsl.g:2237:3: RULE_STRING
            {
             before(grammarAccess.getWorkerAccess().getNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWorkerAccess().getNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Worker__NameAssignment_5"


    // $ANTLR start "rule__Worker__SeniorityAssignment_9"
    // InternalMyDsl.g:2246:1: rule__Worker__SeniorityAssignment_9 : ( ruleSeniorityLevel ) ;
    public final void rule__Worker__SeniorityAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2250:1: ( ( ruleSeniorityLevel ) )
            // InternalMyDsl.g:2251:2: ( ruleSeniorityLevel )
            {
            // InternalMyDsl.g:2251:2: ( ruleSeniorityLevel )
            // InternalMyDsl.g:2252:3: ruleSeniorityLevel
            {
             before(grammarAccess.getWorkerAccess().getSenioritySeniorityLevelEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSeniorityLevel();

            state._fsp--;

             after(grammarAccess.getWorkerAccess().getSenioritySeniorityLevelEnumRuleCall_9_0()); 

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
    // $ANTLR end "rule__Worker__SeniorityAssignment_9"


    // $ANTLR start "rule__Worker__IsActiveAssignment_13"
    // InternalMyDsl.g:2261:1: rule__Worker__IsActiveAssignment_13 : ( ruleBoolean ) ;
    public final void rule__Worker__IsActiveAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2265:1: ( ( ruleBoolean ) )
            // InternalMyDsl.g:2266:2: ( ruleBoolean )
            {
            // InternalMyDsl.g:2266:2: ( ruleBoolean )
            // InternalMyDsl.g:2267:3: ruleBoolean
            {
             before(grammarAccess.getWorkerAccess().getIsActiveBooleanEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getWorkerAccess().getIsActiveBooleanEnumRuleCall_13_0()); 

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
    // $ANTLR end "rule__Worker__IsActiveAssignment_13"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalMyDsl.g:2276:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2281:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2281:2: ( RULE_ID )
            // InternalMyDsl.g:2282:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__DifficultyAssignment_5"
    // InternalMyDsl.g:2291:1: rule__Task__DifficultyAssignment_5 : ( ruleDifficulty ) ;
    public final void rule__Task__DifficultyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( ruleDifficulty ) )
            // InternalMyDsl.g:2296:2: ( ruleDifficulty )
            {
            // InternalMyDsl.g:2296:2: ( ruleDifficulty )
            // InternalMyDsl.g:2297:3: ruleDifficulty
            {
             before(grammarAccess.getTaskAccess().getDifficultyDifficultyEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDifficulty();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDifficultyDifficultyEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Task__DifficultyAssignment_5"


    // $ANTLR start "rule__Task__DurationAssignment_9"
    // InternalMyDsl.g:2306:1: rule__Task__DurationAssignment_9 : ( RULE_INT ) ;
    public final void rule__Task__DurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2311:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2311:2: ( RULE_INT )
            // InternalMyDsl.g:2312:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Task__DurationAssignment_9"


    // $ANTLR start "rule__Task__StartAssignment_13"
    // InternalMyDsl.g:2321:1: rule__Task__StartAssignment_13 : ( ruleTIME ) ;
    public final void rule__Task__StartAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( ruleTIME ) )
            // InternalMyDsl.g:2326:2: ( ruleTIME )
            {
            // InternalMyDsl.g:2326:2: ( ruleTIME )
            // InternalMyDsl.g:2327:3: ruleTIME
            {
             before(grammarAccess.getTaskAccess().getStartTIMEParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleTIME();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getStartTIMEParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Task__StartAssignment_13"


    // $ANTLR start "rule__Rule__ConditionAssignment_1"
    // InternalMyDsl.g:2336:1: rule__Rule__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:2341:2: ( ruleCondition )
            {
            // InternalMyDsl.g:2341:2: ( ruleCondition )
            // InternalMyDsl.g:2342:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__ConditionAssignment_1"


    // $ANTLR start "rule__Rule__AssignAssignment_3"
    // InternalMyDsl.g:2351:1: rule__Rule__AssignAssignment_3 : ( ruleSeniorityLevel ) ;
    public final void rule__Rule__AssignAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2355:1: ( ( ruleSeniorityLevel ) )
            // InternalMyDsl.g:2356:2: ( ruleSeniorityLevel )
            {
            // InternalMyDsl.g:2356:2: ( ruleSeniorityLevel )
            // InternalMyDsl.g:2357:3: ruleSeniorityLevel
            {
             before(grammarAccess.getRuleAccess().getAssignSeniorityLevelEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSeniorityLevel();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssignSeniorityLevelEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__AssignAssignment_3"


    // $ANTLR start "rule__TIME__HoursAssignment_0"
    // InternalMyDsl.g:2366:1: rule__TIME__HoursAssignment_0 : ( RULE_INT ) ;
    public final void rule__TIME__HoursAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2370:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2371:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2371:2: ( RULE_INT )
            // InternalMyDsl.g:2372:3: RULE_INT
            {
             before(grammarAccess.getTIMEAccess().getHoursINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTIMEAccess().getHoursINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TIME__HoursAssignment_0"


    // $ANTLR start "rule__TIME__MinutesAssignment_2"
    // InternalMyDsl.g:2381:1: rule__TIME__MinutesAssignment_2 : ( RULE_INT ) ;
    public final void rule__TIME__MinutesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2386:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2386:2: ( RULE_INT )
            // InternalMyDsl.g:2387:3: RULE_INT
            {
             before(grammarAccess.getTIMEAccess().getMinutesINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTIMEAccess().getMinutesINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TIME__MinutesAssignment_2"


    // $ANTLR start "rule__OrCondition__RightAssignment_1_2"
    // InternalMyDsl.g:2396:1: rule__OrCondition__RightAssignment_1_2 : ( ruleAndCondition ) ;
    public final void rule__OrCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2400:1: ( ( ruleAndCondition ) )
            // InternalMyDsl.g:2401:2: ( ruleAndCondition )
            {
            // InternalMyDsl.g:2401:2: ( ruleAndCondition )
            // InternalMyDsl.g:2402:3: ruleAndCondition
            {
             before(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndCondition();

            state._fsp--;

             after(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrCondition__RightAssignment_1_2"


    // $ANTLR start "rule__AndCondition__RightAssignment_1_2"
    // InternalMyDsl.g:2411:1: rule__AndCondition__RightAssignment_1_2 : ( rulePrimaryCondition ) ;
    public final void rule__AndCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2415:1: ( ( rulePrimaryCondition ) )
            // InternalMyDsl.g:2416:2: ( rulePrimaryCondition )
            {
            // InternalMyDsl.g:2416:2: ( rulePrimaryCondition )
            // InternalMyDsl.g:2417:3: rulePrimaryCondition
            {
             before(grammarAccess.getAndConditionAccess().getRightPrimaryConditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryCondition();

            state._fsp--;

             after(grammarAccess.getAndConditionAccess().getRightPrimaryConditionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndCondition__RightAssignment_1_2"


    // $ANTLR start "rule__PrimaryCondition__InnerAssignment_0_2"
    // InternalMyDsl.g:2426:1: rule__PrimaryCondition__InnerAssignment_0_2 : ( ruleCondition ) ;
    public final void rule__PrimaryCondition__InnerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:2431:2: ( ruleCondition )
            {
            // InternalMyDsl.g:2431:2: ( ruleCondition )
            // InternalMyDsl.g:2432:3: ruleCondition
            {
             before(grammarAccess.getPrimaryConditionAccess().getInnerConditionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPrimaryConditionAccess().getInnerConditionParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__PrimaryCondition__InnerAssignment_0_2"


    // $ANTLR start "rule__ShiftCondition__ShiftAssignment"
    // InternalMyDsl.g:2441:1: rule__ShiftCondition__ShiftAssignment : ( ruleShift ) ;
    public final void rule__ShiftCondition__ShiftAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2445:1: ( ( ruleShift ) )
            // InternalMyDsl.g:2446:2: ( ruleShift )
            {
            // InternalMyDsl.g:2446:2: ( ruleShift )
            // InternalMyDsl.g:2447:3: ruleShift
            {
             before(grammarAccess.getShiftConditionAccess().getShiftShiftEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleShift();

            state._fsp--;

             after(grammarAccess.getShiftConditionAccess().getShiftShiftEnumRuleCall_0()); 

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
    // $ANTLR end "rule__ShiftCondition__ShiftAssignment"


    // $ANTLR start "rule__Comparison__OperatorAssignment_0"
    // InternalMyDsl.g:2456:1: rule__Comparison__OperatorAssignment_0 : ( RULE_COMPARISONOPERATOR ) ;
    public final void rule__Comparison__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2460:1: ( ( RULE_COMPARISONOPERATOR ) )
            // InternalMyDsl.g:2461:2: ( RULE_COMPARISONOPERATOR )
            {
            // InternalMyDsl.g:2461:2: ( RULE_COMPARISONOPERATOR )
            // InternalMyDsl.g:2462:3: RULE_COMPARISONOPERATOR
            {
             before(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorTerminalRuleCall_0_0()); 
            match(input,RULE_COMPARISONOPERATOR,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Comparison__OperatorAssignment_0"


    // $ANTLR start "rule__Comparison__DurationAssignment_1"
    // InternalMyDsl.g:2471:1: rule__Comparison__DurationAssignment_1 : ( RULE_INT ) ;
    public final void rule__Comparison__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2476:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2476:2: ( RULE_INT )
            // InternalMyDsl.g:2477:3: RULE_INT
            {
             before(grammarAccess.getComparisonAccess().getDurationINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getDurationINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Comparison__DurationAssignment_1"


    // $ANTLR start "rule__DifficultyCondition__DifficultyAssignment"
    // InternalMyDsl.g:2486:1: rule__DifficultyCondition__DifficultyAssignment : ( ruleDifficulty ) ;
    public final void rule__DifficultyCondition__DifficultyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2490:1: ( ( ruleDifficulty ) )
            // InternalMyDsl.g:2491:2: ( ruleDifficulty )
            {
            // InternalMyDsl.g:2491:2: ( ruleDifficulty )
            // InternalMyDsl.g:2492:3: ruleDifficulty
            {
             before(grammarAccess.getDifficultyConditionAccess().getDifficultyDifficultyEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDifficulty();

            state._fsp--;

             after(grammarAccess.getDifficultyConditionAccess().getDifficultyDifficultyEnumRuleCall_0()); 

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
    // $ANTLR end "rule__DifficultyCondition__DifficultyAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000738080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});

}