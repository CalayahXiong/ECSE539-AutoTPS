package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_COMPARISONOPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'worker'", "'{'", "'name'", "'='", "';'", "'seniority'", "'active'", "'}'", "'task'", "'difficulty'", "'duration'", "'start'", "'if'", "'then'", "':'", "'OR'", "'AND'", "'('", "')'", "'min'", "'trainee'", "'junior'", "'senior'", "'easy'", "'moderate'", "'hard'", "'True'", "'False'", "'nightshift'", "'dayshift'", "'eveningshift'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_workers_0_0= ruleWorker ) )* ( (lv_tasks_1_0= ruleTask ) )* ( (lv_rules_2_0= ruleRule ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_workers_0_0 = null;

        EObject lv_tasks_1_0 = null;

        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( (lv_workers_0_0= ruleWorker ) )* ( (lv_tasks_1_0= ruleTask ) )* ( (lv_rules_2_0= ruleRule ) )* ) )
            // InternalMyDsl.g:79:2: ( ( (lv_workers_0_0= ruleWorker ) )* ( (lv_tasks_1_0= ruleTask ) )* ( (lv_rules_2_0= ruleRule ) )* )
            {
            // InternalMyDsl.g:79:2: ( ( (lv_workers_0_0= ruleWorker ) )* ( (lv_tasks_1_0= ruleTask ) )* ( (lv_rules_2_0= ruleRule ) )* )
            // InternalMyDsl.g:80:3: ( (lv_workers_0_0= ruleWorker ) )* ( (lv_tasks_1_0= ruleTask ) )* ( (lv_rules_2_0= ruleRule ) )*
            {
            // InternalMyDsl.g:80:3: ( (lv_workers_0_0= ruleWorker ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:81:4: (lv_workers_0_0= ruleWorker )
            	    {
            	    // InternalMyDsl.g:81:4: (lv_workers_0_0= ruleWorker )
            	    // InternalMyDsl.g:82:5: lv_workers_0_0= ruleWorker
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getWorkersWorkerParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_workers_0_0=ruleWorker();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workers",
            	    						lv_workers_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Worker");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:99:3: ( (lv_tasks_1_0= ruleTask ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:100:4: (lv_tasks_1_0= ruleTask )
            	    {
            	    // InternalMyDsl.g:100:4: (lv_tasks_1_0= ruleTask )
            	    // InternalMyDsl.g:101:5: lv_tasks_1_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTasksTaskParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_tasks_1_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:118:3: ( (lv_rules_2_0= ruleRule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:119:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalMyDsl.g:119:4: (lv_rules_2_0= ruleRule )
            	    // InternalMyDsl.g:120:5: lv_rules_2_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_rules_2_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWorker"
    // InternalMyDsl.g:141:1: entryRuleWorker returns [EObject current=null] : iv_ruleWorker= ruleWorker EOF ;
    public final EObject entryRuleWorker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorker = null;


        try {
            // InternalMyDsl.g:141:47: (iv_ruleWorker= ruleWorker EOF )
            // InternalMyDsl.g:142:2: iv_ruleWorker= ruleWorker EOF
            {
             newCompositeNode(grammarAccess.getWorkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorker=ruleWorker();

            state._fsp--;

             current =iv_ruleWorker; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorker"


    // $ANTLR start "ruleWorker"
    // InternalMyDsl.g:148:1: ruleWorker returns [EObject current=null] : (otherlv_0= 'worker' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'seniority' otherlv_8= '=' ( (lv_seniority_9_0= ruleSeniorityLevel ) ) otherlv_10= ';' otherlv_11= 'active' otherlv_12= '=' ( (lv_isActive_13_0= ruleBoolean ) ) otherlv_14= ';' otherlv_15= '}' ) ;
    public final EObject ruleWorker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_seniority_9_0 = null;

        Enumerator lv_isActive_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:154:2: ( (otherlv_0= 'worker' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'seniority' otherlv_8= '=' ( (lv_seniority_9_0= ruleSeniorityLevel ) ) otherlv_10= ';' otherlv_11= 'active' otherlv_12= '=' ( (lv_isActive_13_0= ruleBoolean ) ) otherlv_14= ';' otherlv_15= '}' ) )
            // InternalMyDsl.g:155:2: (otherlv_0= 'worker' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'seniority' otherlv_8= '=' ( (lv_seniority_9_0= ruleSeniorityLevel ) ) otherlv_10= ';' otherlv_11= 'active' otherlv_12= '=' ( (lv_isActive_13_0= ruleBoolean ) ) otherlv_14= ';' otherlv_15= '}' )
            {
            // InternalMyDsl.g:155:2: (otherlv_0= 'worker' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'seniority' otherlv_8= '=' ( (lv_seniority_9_0= ruleSeniorityLevel ) ) otherlv_10= ';' otherlv_11= 'active' otherlv_12= '=' ( (lv_isActive_13_0= ruleBoolean ) ) otherlv_14= ';' otherlv_15= '}' )
            // InternalMyDsl.g:156:3: otherlv_0= 'worker' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'seniority' otherlv_8= '=' ( (lv_seniority_9_0= ruleSeniorityLevel ) ) otherlv_10= ';' otherlv_11= 'active' otherlv_12= '=' ( (lv_isActive_13_0= ruleBoolean ) ) otherlv_14= ';' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkerAccess().getWorkerKeyword_0());
            		
            // InternalMyDsl.g:160:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyDsl.g:161:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyDsl.g:161:4: (lv_id_1_0= RULE_ID )
            // InternalMyDsl.g:162:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_id_1_0, grammarAccess.getWorkerAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkerAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkerAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:190:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalMyDsl.g:191:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:191:4: (lv_name_5_0= RULE_STRING )
            // InternalMyDsl.g:192:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_5_0, grammarAccess.getWorkerAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkerAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkerAccess().getSeniorityKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getWorkerAccess().getEqualsSignKeyword_8());
            		
            // InternalMyDsl.g:220:3: ( (lv_seniority_9_0= ruleSeniorityLevel ) )
            // InternalMyDsl.g:221:4: (lv_seniority_9_0= ruleSeniorityLevel )
            {
            // InternalMyDsl.g:221:4: (lv_seniority_9_0= ruleSeniorityLevel )
            // InternalMyDsl.g:222:5: lv_seniority_9_0= ruleSeniorityLevel
            {

            					newCompositeNode(grammarAccess.getWorkerAccess().getSenioritySeniorityLevelEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_seniority_9_0=ruleSeniorityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkerRule());
            					}
            					set(
            						current,
            						"seniority",
            						lv_seniority_9_0,
            						"org.xtext.example.mydsl.MyDsl.SeniorityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getWorkerAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getWorkerAccess().getActiveKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getWorkerAccess().getEqualsSignKeyword_12());
            		
            // InternalMyDsl.g:251:3: ( (lv_isActive_13_0= ruleBoolean ) )
            // InternalMyDsl.g:252:4: (lv_isActive_13_0= ruleBoolean )
            {
            // InternalMyDsl.g:252:4: (lv_isActive_13_0= ruleBoolean )
            // InternalMyDsl.g:253:5: lv_isActive_13_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getWorkerAccess().getIsActiveBooleanEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_11);
            lv_isActive_13_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkerRule());
            					}
            					set(
            						current,
            						"isActive",
            						lv_isActive_13_0,
            						"org.xtext.example.mydsl.MyDsl.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getWorkerAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getWorkerAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorker"


    // $ANTLR start "entryRuleTask"
    // InternalMyDsl.g:282:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalMyDsl.g:282:45: (iv_ruleTask= ruleTask EOF )
            // InternalMyDsl.g:283:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalMyDsl.g:289:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'difficulty' otherlv_4= '=' ( (lv_difficulty_5_0= ruleDifficulty ) ) otherlv_6= ';' otherlv_7= 'duration' otherlv_8= '=' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= ';' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleTIME ) ) otherlv_14= ';' otherlv_15= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_duration_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_difficulty_5_0 = null;

        EObject lv_start_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:295:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'difficulty' otherlv_4= '=' ( (lv_difficulty_5_0= ruleDifficulty ) ) otherlv_6= ';' otherlv_7= 'duration' otherlv_8= '=' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= ';' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleTIME ) ) otherlv_14= ';' otherlv_15= '}' ) )
            // InternalMyDsl.g:296:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'difficulty' otherlv_4= '=' ( (lv_difficulty_5_0= ruleDifficulty ) ) otherlv_6= ';' otherlv_7= 'duration' otherlv_8= '=' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= ';' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleTIME ) ) otherlv_14= ';' otherlv_15= '}' )
            {
            // InternalMyDsl.g:296:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'difficulty' otherlv_4= '=' ( (lv_difficulty_5_0= ruleDifficulty ) ) otherlv_6= ';' otherlv_7= 'duration' otherlv_8= '=' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= ';' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleTIME ) ) otherlv_14= ';' otherlv_15= '}' )
            // InternalMyDsl.g:297:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'difficulty' otherlv_4= '=' ( (lv_difficulty_5_0= ruleDifficulty ) ) otherlv_6= ';' otherlv_7= 'duration' otherlv_8= '=' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= ';' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleTIME ) ) otherlv_14= ';' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalMyDsl.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:303:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getDifficultyKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:331:3: ( (lv_difficulty_5_0= ruleDifficulty ) )
            // InternalMyDsl.g:332:4: (lv_difficulty_5_0= ruleDifficulty )
            {
            // InternalMyDsl.g:332:4: (lv_difficulty_5_0= ruleDifficulty )
            // InternalMyDsl.g:333:5: lv_difficulty_5_0= ruleDifficulty
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getDifficultyDifficultyEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_difficulty_5_0=ruleDifficulty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"difficulty",
            						lv_difficulty_5_0,
            						"org.xtext.example.mydsl.MyDsl.Difficulty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getDurationKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getEqualsSignKeyword_8());
            		
            // InternalMyDsl.g:362:3: ( (lv_duration_9_0= RULE_INT ) )
            // InternalMyDsl.g:363:4: (lv_duration_9_0= RULE_INT )
            {
            // InternalMyDsl.g:363:4: (lv_duration_9_0= RULE_INT )
            // InternalMyDsl.g:364:5: lv_duration_9_0= RULE_INT
            {
            lv_duration_9_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_duration_9_0, grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getStartKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getEqualsSignKeyword_12());
            		
            // InternalMyDsl.g:392:3: ( (lv_start_13_0= ruleTIME ) )
            // InternalMyDsl.g:393:4: (lv_start_13_0= ruleTIME )
            {
            // InternalMyDsl.g:393:4: (lv_start_13_0= ruleTIME )
            // InternalMyDsl.g:394:5: lv_start_13_0= ruleTIME
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getStartTIMEParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_11);
            lv_start_13_0=ruleTIME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_13_0,
            						"org.xtext.example.mydsl.MyDsl.TIME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:423:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMyDsl.g:423:45: (iv_ruleRule= ruleRule EOF )
            // InternalMyDsl.g:424:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:430:1: ruleRule returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_assign_3_0= ruleSeniorityLevel ) ) otherlv_4= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        Enumerator lv_assign_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:436:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_assign_3_0= ruleSeniorityLevel ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:437:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_assign_3_0= ruleSeniorityLevel ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:437:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_assign_3_0= ruleSeniorityLevel ) ) otherlv_4= ';' )
            // InternalMyDsl.g:438:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' ( (lv_assign_3_0= ruleSeniorityLevel ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
            		
            // InternalMyDsl.g:442:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalMyDsl.g:443:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalMyDsl.g:443:4: (lv_condition_1_0= ruleCondition )
            // InternalMyDsl.g:444:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_2());
            		
            // InternalMyDsl.g:465:3: ( (lv_assign_3_0= ruleSeniorityLevel ) )
            // InternalMyDsl.g:466:4: (lv_assign_3_0= ruleSeniorityLevel )
            {
            // InternalMyDsl.g:466:4: (lv_assign_3_0= ruleSeniorityLevel )
            // InternalMyDsl.g:467:5: lv_assign_3_0= ruleSeniorityLevel
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAssignSeniorityLevelEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_assign_3_0=ruleSeniorityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"assign",
            						lv_assign_3_0,
            						"org.xtext.example.mydsl.MyDsl.SeniorityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleTIME"
    // InternalMyDsl.g:492:1: entryRuleTIME returns [EObject current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final EObject entryRuleTIME() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIME = null;


        try {
            // InternalMyDsl.g:492:45: (iv_ruleTIME= ruleTIME EOF )
            // InternalMyDsl.g:493:2: iv_ruleTIME= ruleTIME EOF
            {
             newCompositeNode(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIME=ruleTIME();

            state._fsp--;

             current =iv_ruleTIME; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // InternalMyDsl.g:499:1: ruleTIME returns [EObject current=null] : ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTIME() throws RecognitionException {
        EObject current = null;

        Token lv_hours_0_0=null;
        Token otherlv_1=null;
        Token lv_minutes_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:505:2: ( ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:506:2: ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:506:2: ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:507:3: ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) )
            {
            // InternalMyDsl.g:507:3: ( (lv_hours_0_0= RULE_INT ) )
            // InternalMyDsl.g:508:4: (lv_hours_0_0= RULE_INT )
            {
            // InternalMyDsl.g:508:4: (lv_hours_0_0= RULE_INT )
            // InternalMyDsl.g:509:5: lv_hours_0_0= RULE_INT
            {
            lv_hours_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_hours_0_0, grammarAccess.getTIMEAccess().getHoursINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTIMERule());
            					}
            					setWithLastConsumed(
            						current,
            						"hours",
            						lv_hours_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTIMEAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:529:3: ( (lv_minutes_2_0= RULE_INT ) )
            // InternalMyDsl.g:530:4: (lv_minutes_2_0= RULE_INT )
            {
            // InternalMyDsl.g:530:4: (lv_minutes_2_0= RULE_INT )
            // InternalMyDsl.g:531:5: lv_minutes_2_0= RULE_INT
            {
            lv_minutes_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_minutes_2_0, grammarAccess.getTIMEAccess().getMinutesINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTIMERule());
            					}
            					setWithLastConsumed(
            						current,
            						"minutes",
            						lv_minutes_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:551:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:551:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:552:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:558:1: ruleCondition returns [EObject current=null] : this_OrCondition_0= ruleOrCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_OrCondition_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:564:2: (this_OrCondition_0= ruleOrCondition )
            // InternalMyDsl.g:565:2: this_OrCondition_0= ruleOrCondition
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getOrConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrCondition_0=ruleOrCondition();

            state._fsp--;


            		current = this_OrCondition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOrCondition"
    // InternalMyDsl.g:576:1: entryRuleOrCondition returns [EObject current=null] : iv_ruleOrCondition= ruleOrCondition EOF ;
    public final EObject entryRuleOrCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrCondition = null;


        try {
            // InternalMyDsl.g:576:52: (iv_ruleOrCondition= ruleOrCondition EOF )
            // InternalMyDsl.g:577:2: iv_ruleOrCondition= ruleOrCondition EOF
            {
             newCompositeNode(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrCondition=ruleOrCondition();

            state._fsp--;

             current =iv_ruleOrCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // InternalMyDsl.g:583:1: ruleOrCondition returns [EObject current=null] : (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* ) ;
    public final EObject ruleOrCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:589:2: ( (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* ) )
            // InternalMyDsl.g:590:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            {
            // InternalMyDsl.g:590:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            // InternalMyDsl.g:591:3: this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_AndCondition_0=ruleAndCondition();

            state._fsp--;


            			current = this_AndCondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:599:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:600:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) )
            	    {
            	    // InternalMyDsl.g:600:4: ()
            	    // InternalMyDsl.g:601:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getORKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:611:4: ( (lv_right_3_0= ruleAndCondition ) )
            	    // InternalMyDsl.g:612:5: (lv_right_3_0= ruleAndCondition )
            	    {
            	    // InternalMyDsl.g:612:5: (lv_right_3_0= ruleAndCondition )
            	    // InternalMyDsl.g:613:6: lv_right_3_0= ruleAndCondition
            	    {

            	    						newCompositeNode(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleAndCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.AndCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "entryRuleAndCondition"
    // InternalMyDsl.g:635:1: entryRuleAndCondition returns [EObject current=null] : iv_ruleAndCondition= ruleAndCondition EOF ;
    public final EObject entryRuleAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCondition = null;


        try {
            // InternalMyDsl.g:635:53: (iv_ruleAndCondition= ruleAndCondition EOF )
            // InternalMyDsl.g:636:2: iv_ruleAndCondition= ruleAndCondition EOF
            {
             newCompositeNode(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndCondition=ruleAndCondition();

            state._fsp--;

             current =iv_ruleAndCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // InternalMyDsl.g:642:1: ruleAndCondition returns [EObject current=null] : (this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )* ) ;
    public final EObject ruleAndCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:648:2: ( (this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )* ) )
            // InternalMyDsl.g:649:2: (this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )* )
            {
            // InternalMyDsl.g:649:2: (this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )* )
            // InternalMyDsl.g:650:3: this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndConditionAccess().getPrimaryConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryCondition_0=rulePrimaryCondition();

            state._fsp--;


            			current = this_PrimaryCondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:658:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:659:4: () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) )
            	    {
            	    // InternalMyDsl.g:659:4: ()
            	    // InternalMyDsl.g:660:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getANDKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:670:4: ( (lv_right_3_0= rulePrimaryCondition ) )
            	    // InternalMyDsl.g:671:5: (lv_right_3_0= rulePrimaryCondition )
            	    {
            	    // InternalMyDsl.g:671:5: (lv_right_3_0= rulePrimaryCondition )
            	    // InternalMyDsl.g:672:6: lv_right_3_0= rulePrimaryCondition
            	    {

            	    						newCompositeNode(grammarAccess.getAndConditionAccess().getRightPrimaryConditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=rulePrimaryCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.PrimaryCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRulePrimaryCondition"
    // InternalMyDsl.g:694:1: entryRulePrimaryCondition returns [EObject current=null] : iv_rulePrimaryCondition= rulePrimaryCondition EOF ;
    public final EObject entryRulePrimaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryCondition = null;


        try {
            // InternalMyDsl.g:694:57: (iv_rulePrimaryCondition= rulePrimaryCondition EOF )
            // InternalMyDsl.g:695:2: iv_rulePrimaryCondition= rulePrimaryCondition EOF
            {
             newCompositeNode(grammarAccess.getPrimaryConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryCondition=rulePrimaryCondition();

            state._fsp--;

             current =iv_rulePrimaryCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryCondition"


    // $ANTLR start "rulePrimaryCondition"
    // InternalMyDsl.g:701:1: rulePrimaryCondition returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleCondition ) ) otherlv_3= ')' ) | this_Comparison_4= ruleComparison | this_ShiftCondition_5= ruleShiftCondition | this_DifficultyCondition_6= ruleDifficultyCondition ) ;
    public final EObject rulePrimaryCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inner_2_0 = null;

        EObject this_Comparison_4 = null;

        EObject this_ShiftCondition_5 = null;

        EObject this_DifficultyCondition_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:707:2: ( ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleCondition ) ) otherlv_3= ')' ) | this_Comparison_4= ruleComparison | this_ShiftCondition_5= ruleShiftCondition | this_DifficultyCondition_6= ruleDifficultyCondition ) )
            // InternalMyDsl.g:708:2: ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleCondition ) ) otherlv_3= ')' ) | this_Comparison_4= ruleComparison | this_ShiftCondition_5= ruleShiftCondition | this_DifficultyCondition_6= ruleDifficultyCondition )
            {
            // InternalMyDsl.g:708:2: ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleCondition ) ) otherlv_3= ')' ) | this_Comparison_4= ruleComparison | this_ShiftCondition_5= ruleShiftCondition | this_DifficultyCondition_6= ruleDifficultyCondition )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case RULE_COMPARISONOPERATOR:
                {
                alt6=2;
                }
                break;
            case 40:
            case 41:
            case 42:
                {
                alt6=3;
                }
                break;
            case 35:
            case 36:
            case 37:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:709:3: ( () otherlv_1= '(' ( (lv_inner_2_0= ruleCondition ) ) otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:709:3: ( () otherlv_1= '(' ( (lv_inner_2_0= ruleCondition ) ) otherlv_3= ')' )
                    // InternalMyDsl.g:710:4: () otherlv_1= '(' ( (lv_inner_2_0= ruleCondition ) ) otherlv_3= ')'
                    {
                    // InternalMyDsl.g:710:4: ()
                    // InternalMyDsl.g:711:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryConditionAccess().getPrimaryConditionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryConditionAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalMyDsl.g:721:4: ( (lv_inner_2_0= ruleCondition ) )
                    // InternalMyDsl.g:722:5: (lv_inner_2_0= ruleCondition )
                    {
                    // InternalMyDsl.g:722:5: (lv_inner_2_0= ruleCondition )
                    // InternalMyDsl.g:723:6: lv_inner_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getPrimaryConditionAccess().getInnerConditionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_inner_2_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryConditionRule());
                    						}
                    						set(
                    							current,
                    							"inner",
                    							lv_inner_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryConditionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:746:3: this_Comparison_4= ruleComparison
                    {

                    			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getComparisonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparison_4=ruleComparison();

                    state._fsp--;


                    			current = this_Comparison_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:755:3: this_ShiftCondition_5= ruleShiftCondition
                    {

                    			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getShiftConditionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShiftCondition_5=ruleShiftCondition();

                    state._fsp--;


                    			current = this_ShiftCondition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:764:3: this_DifficultyCondition_6= ruleDifficultyCondition
                    {

                    			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getDifficultyConditionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DifficultyCondition_6=ruleDifficultyCondition();

                    state._fsp--;


                    			current = this_DifficultyCondition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryCondition"


    // $ANTLR start "entryRuleShiftCondition"
    // InternalMyDsl.g:776:1: entryRuleShiftCondition returns [EObject current=null] : iv_ruleShiftCondition= ruleShiftCondition EOF ;
    public final EObject entryRuleShiftCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftCondition = null;


        try {
            // InternalMyDsl.g:776:55: (iv_ruleShiftCondition= ruleShiftCondition EOF )
            // InternalMyDsl.g:777:2: iv_ruleShiftCondition= ruleShiftCondition EOF
            {
             newCompositeNode(grammarAccess.getShiftConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShiftCondition=ruleShiftCondition();

            state._fsp--;

             current =iv_ruleShiftCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftCondition"


    // $ANTLR start "ruleShiftCondition"
    // InternalMyDsl.g:783:1: ruleShiftCondition returns [EObject current=null] : ( (lv_shift_0_0= ruleShift ) ) ;
    public final EObject ruleShiftCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_shift_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:789:2: ( ( (lv_shift_0_0= ruleShift ) ) )
            // InternalMyDsl.g:790:2: ( (lv_shift_0_0= ruleShift ) )
            {
            // InternalMyDsl.g:790:2: ( (lv_shift_0_0= ruleShift ) )
            // InternalMyDsl.g:791:3: (lv_shift_0_0= ruleShift )
            {
            // InternalMyDsl.g:791:3: (lv_shift_0_0= ruleShift )
            // InternalMyDsl.g:792:4: lv_shift_0_0= ruleShift
            {

            				newCompositeNode(grammarAccess.getShiftConditionAccess().getShiftShiftEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_shift_0_0=ruleShift();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getShiftConditionRule());
            				}
            				set(
            					current,
            					"shift",
            					lv_shift_0_0,
            					"org.xtext.example.mydsl.MyDsl.Shift");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiftCondition"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:812:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMyDsl.g:812:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMyDsl.g:813:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:819:1: ruleComparison returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_COMPARISONOPERATOR ) ) ( (lv_duration_1_0= RULE_INT ) ) (otherlv_2= 'min' )? ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token lv_duration_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:825:2: ( ( ( (lv_operator_0_0= RULE_COMPARISONOPERATOR ) ) ( (lv_duration_1_0= RULE_INT ) ) (otherlv_2= 'min' )? ) )
            // InternalMyDsl.g:826:2: ( ( (lv_operator_0_0= RULE_COMPARISONOPERATOR ) ) ( (lv_duration_1_0= RULE_INT ) ) (otherlv_2= 'min' )? )
            {
            // InternalMyDsl.g:826:2: ( ( (lv_operator_0_0= RULE_COMPARISONOPERATOR ) ) ( (lv_duration_1_0= RULE_INT ) ) (otherlv_2= 'min' )? )
            // InternalMyDsl.g:827:3: ( (lv_operator_0_0= RULE_COMPARISONOPERATOR ) ) ( (lv_duration_1_0= RULE_INT ) ) (otherlv_2= 'min' )?
            {
            // InternalMyDsl.g:827:3: ( (lv_operator_0_0= RULE_COMPARISONOPERATOR ) )
            // InternalMyDsl.g:828:4: (lv_operator_0_0= RULE_COMPARISONOPERATOR )
            {
            // InternalMyDsl.g:828:4: (lv_operator_0_0= RULE_COMPARISONOPERATOR )
            // InternalMyDsl.g:829:5: lv_operator_0_0= RULE_COMPARISONOPERATOR
            {
            lv_operator_0_0=(Token)match(input,RULE_COMPARISONOPERATOR,FOLLOW_20); 

            					newLeafNode(lv_operator_0_0, grammarAccess.getComparisonAccess().getOperatorComparisonOperatorTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"org.xtext.example.mydsl.MyDsl.ComparisonOperator");
            				

            }


            }

            // InternalMyDsl.g:845:3: ( (lv_duration_1_0= RULE_INT ) )
            // InternalMyDsl.g:846:4: (lv_duration_1_0= RULE_INT )
            {
            // InternalMyDsl.g:846:4: (lv_duration_1_0= RULE_INT )
            // InternalMyDsl.g:847:5: lv_duration_1_0= RULE_INT
            {
            lv_duration_1_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_duration_1_0, grammarAccess.getComparisonAccess().getDurationINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:863:3: (otherlv_2= 'min' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:864:4: otherlv_2= 'min'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getMinKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleDifficultyCondition"
    // InternalMyDsl.g:873:1: entryRuleDifficultyCondition returns [EObject current=null] : iv_ruleDifficultyCondition= ruleDifficultyCondition EOF ;
    public final EObject entryRuleDifficultyCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifficultyCondition = null;


        try {
            // InternalMyDsl.g:873:60: (iv_ruleDifficultyCondition= ruleDifficultyCondition EOF )
            // InternalMyDsl.g:874:2: iv_ruleDifficultyCondition= ruleDifficultyCondition EOF
            {
             newCompositeNode(grammarAccess.getDifficultyConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDifficultyCondition=ruleDifficultyCondition();

            state._fsp--;

             current =iv_ruleDifficultyCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDifficultyCondition"


    // $ANTLR start "ruleDifficultyCondition"
    // InternalMyDsl.g:880:1: ruleDifficultyCondition returns [EObject current=null] : ( (lv_difficulty_0_0= ruleDifficulty ) ) ;
    public final EObject ruleDifficultyCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_difficulty_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:886:2: ( ( (lv_difficulty_0_0= ruleDifficulty ) ) )
            // InternalMyDsl.g:887:2: ( (lv_difficulty_0_0= ruleDifficulty ) )
            {
            // InternalMyDsl.g:887:2: ( (lv_difficulty_0_0= ruleDifficulty ) )
            // InternalMyDsl.g:888:3: (lv_difficulty_0_0= ruleDifficulty )
            {
            // InternalMyDsl.g:888:3: (lv_difficulty_0_0= ruleDifficulty )
            // InternalMyDsl.g:889:4: lv_difficulty_0_0= ruleDifficulty
            {

            				newCompositeNode(grammarAccess.getDifficultyConditionAccess().getDifficultyDifficultyEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_difficulty_0_0=ruleDifficulty();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDifficultyConditionRule());
            				}
            				set(
            					current,
            					"difficulty",
            					lv_difficulty_0_0,
            					"org.xtext.example.mydsl.MyDsl.Difficulty");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDifficultyCondition"


    // $ANTLR start "ruleSeniorityLevel"
    // InternalMyDsl.g:909:1: ruleSeniorityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'trainee' ) | (enumLiteral_1= 'junior' ) | (enumLiteral_2= 'senior' ) ) ;
    public final Enumerator ruleSeniorityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:915:2: ( ( (enumLiteral_0= 'trainee' ) | (enumLiteral_1= 'junior' ) | (enumLiteral_2= 'senior' ) ) )
            // InternalMyDsl.g:916:2: ( (enumLiteral_0= 'trainee' ) | (enumLiteral_1= 'junior' ) | (enumLiteral_2= 'senior' ) )
            {
            // InternalMyDsl.g:916:2: ( (enumLiteral_0= 'trainee' ) | (enumLiteral_1= 'junior' ) | (enumLiteral_2= 'senior' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:917:3: (enumLiteral_0= 'trainee' )
                    {
                    // InternalMyDsl.g:917:3: (enumLiteral_0= 'trainee' )
                    // InternalMyDsl.g:918:4: enumLiteral_0= 'trainee'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSeniorityLevelAccess().getTraineeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSeniorityLevelAccess().getTraineeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:925:3: (enumLiteral_1= 'junior' )
                    {
                    // InternalMyDsl.g:925:3: (enumLiteral_1= 'junior' )
                    // InternalMyDsl.g:926:4: enumLiteral_1= 'junior'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSeniorityLevelAccess().getJuniorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSeniorityLevelAccess().getJuniorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:933:3: (enumLiteral_2= 'senior' )
                    {
                    // InternalMyDsl.g:933:3: (enumLiteral_2= 'senior' )
                    // InternalMyDsl.g:934:4: enumLiteral_2= 'senior'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSeniorityLevelAccess().getSeniorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSeniorityLevelAccess().getSeniorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeniorityLevel"


    // $ANTLR start "ruleDifficulty"
    // InternalMyDsl.g:944:1: ruleDifficulty returns [Enumerator current=null] : ( (enumLiteral_0= 'easy' ) | (enumLiteral_1= 'moderate' ) | (enumLiteral_2= 'hard' ) ) ;
    public final Enumerator ruleDifficulty() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:950:2: ( ( (enumLiteral_0= 'easy' ) | (enumLiteral_1= 'moderate' ) | (enumLiteral_2= 'hard' ) ) )
            // InternalMyDsl.g:951:2: ( (enumLiteral_0= 'easy' ) | (enumLiteral_1= 'moderate' ) | (enumLiteral_2= 'hard' ) )
            {
            // InternalMyDsl.g:951:2: ( (enumLiteral_0= 'easy' ) | (enumLiteral_1= 'moderate' ) | (enumLiteral_2= 'hard' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:952:3: (enumLiteral_0= 'easy' )
                    {
                    // InternalMyDsl.g:952:3: (enumLiteral_0= 'easy' )
                    // InternalMyDsl.g:953:4: enumLiteral_0= 'easy'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDifficultyAccess().getEasyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDifficultyAccess().getEasyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:960:3: (enumLiteral_1= 'moderate' )
                    {
                    // InternalMyDsl.g:960:3: (enumLiteral_1= 'moderate' )
                    // InternalMyDsl.g:961:4: enumLiteral_1= 'moderate'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDifficultyAccess().getModerateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDifficultyAccess().getModerateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:968:3: (enumLiteral_2= 'hard' )
                    {
                    // InternalMyDsl.g:968:3: (enumLiteral_2= 'hard' )
                    // InternalMyDsl.g:969:4: enumLiteral_2= 'hard'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDifficultyAccess().getHardEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDifficultyAccess().getHardEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDifficulty"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:979:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'True' ) | (enumLiteral_1= 'False' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:985:2: ( ( (enumLiteral_0= 'True' ) | (enumLiteral_1= 'False' ) ) )
            // InternalMyDsl.g:986:2: ( (enumLiteral_0= 'True' ) | (enumLiteral_1= 'False' ) )
            {
            // InternalMyDsl.g:986:2: ( (enumLiteral_0= 'True' ) | (enumLiteral_1= 'False' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:987:3: (enumLiteral_0= 'True' )
                    {
                    // InternalMyDsl.g:987:3: (enumLiteral_0= 'True' )
                    // InternalMyDsl.g:988:4: enumLiteral_0= 'True'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:995:3: (enumLiteral_1= 'False' )
                    {
                    // InternalMyDsl.g:995:3: (enumLiteral_1= 'False' )
                    // InternalMyDsl.g:996:4: enumLiteral_1= 'False'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleShift"
    // InternalMyDsl.g:1006:1: ruleShift returns [Enumerator current=null] : ( (enumLiteral_0= 'nightshift' ) | (enumLiteral_1= 'dayshift' ) | (enumLiteral_2= 'eveningshift' ) ) ;
    public final Enumerator ruleShift() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1012:2: ( ( (enumLiteral_0= 'nightshift' ) | (enumLiteral_1= 'dayshift' ) | (enumLiteral_2= 'eveningshift' ) ) )
            // InternalMyDsl.g:1013:2: ( (enumLiteral_0= 'nightshift' ) | (enumLiteral_1= 'dayshift' ) | (enumLiteral_2= 'eveningshift' ) )
            {
            // InternalMyDsl.g:1013:2: ( (enumLiteral_0= 'nightshift' ) | (enumLiteral_1= 'dayshift' ) | (enumLiteral_2= 'eveningshift' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1014:3: (enumLiteral_0= 'nightshift' )
                    {
                    // InternalMyDsl.g:1014:3: (enumLiteral_0= 'nightshift' )
                    // InternalMyDsl.g:1015:4: enumLiteral_0= 'nightshift'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getShiftAccess().getNightshiftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getShiftAccess().getNightshiftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1022:3: (enumLiteral_1= 'dayshift' )
                    {
                    // InternalMyDsl.g:1022:3: (enumLiteral_1= 'dayshift' )
                    // InternalMyDsl.g:1023:4: enumLiteral_1= 'dayshift'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getShiftAccess().getDayshiftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getShiftAccess().getDayshiftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1030:3: (enumLiteral_2= 'eveningshift' )
                    {
                    // InternalMyDsl.g:1030:3: (enumLiteral_2= 'eveningshift' )
                    // InternalMyDsl.g:1031:4: enumLiteral_2= 'eveningshift'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getShiftAccess().getEveningshiftEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getShiftAccess().getEveningshiftEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShift"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001101002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000073820000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});

}