/*
 * generated by Xtext 2.37.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getWorkersWorkerParserRuleCall_0_0());
				}
				lv_workers_0_0=ruleWorker
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"workers",
						lv_workers_0_0,
						"org.xtext.example.mydsl.MyDsl.Worker");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getTasksTaskParserRuleCall_1_0());
				}
				lv_tasks_1_0=ruleTask
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"tasks",
						lv_tasks_1_0,
						"org.xtext.example.mydsl.MyDsl.Task");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_2_0());
				}
				lv_rules_2_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"rules",
						lv_rules_2_0,
						"org.xtext.example.mydsl.MyDsl.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleWorker
entryRuleWorker returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkerRule()); }
	iv_ruleWorker=ruleWorker
	{ $current=$iv_ruleWorker.current; }
	EOF;

// Rule Worker
ruleWorker returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='worker'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkerAccess().getWorkerKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getWorkerAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkerRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getWorkerAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='name'
		{
			newLeafNode(otherlv_3, grammarAccess.getWorkerAccess().getNameKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getWorkerAccess().getEqualsSignKeyword_4());
		}
		(
			(
				lv_name_5_0=RULE_STRING
				{
					newLeafNode(lv_name_5_0, grammarAccess.getWorkerAccess().getNameSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getWorkerAccess().getSemicolonKeyword_6());
		}
		otherlv_7='seniority'
		{
			newLeafNode(otherlv_7, grammarAccess.getWorkerAccess().getSeniorityKeyword_7());
		}
		otherlv_8='='
		{
			newLeafNode(otherlv_8, grammarAccess.getWorkerAccess().getEqualsSignKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkerAccess().getSenioritySeniorityLevelEnumRuleCall_9_0());
				}
				lv_seniority_9_0=ruleSeniorityLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkerRule());
					}
					set(
						$current,
						"seniority",
						lv_seniority_9_0,
						"org.xtext.example.mydsl.MyDsl.SeniorityLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getWorkerAccess().getSemicolonKeyword_10());
		}
		otherlv_11='employeeNumber'
		{
			newLeafNode(otherlv_11, grammarAccess.getWorkerAccess().getEmployeeNumberKeyword_11());
		}
		otherlv_12='='
		{
			newLeafNode(otherlv_12, grammarAccess.getWorkerAccess().getEqualsSignKeyword_12());
		}
		(
			(
				lv_employeeNumber_13_0=RULE_INT
				{
					newLeafNode(lv_employeeNumber_13_0, grammarAccess.getWorkerAccess().getEmployeeNumberINTTerminalRuleCall_13_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkerRule());
					}
					setWithLastConsumed(
						$current,
						"employeeNumber",
						lv_employeeNumber_13_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getWorkerAccess().getSemicolonKeyword_14());
		}
		otherlv_15='active'
		{
			newLeafNode(otherlv_15, grammarAccess.getWorkerAccess().getActiveKeyword_15());
		}
		otherlv_16='='
		{
			newLeafNode(otherlv_16, grammarAccess.getWorkerAccess().getEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkerAccess().getIsActiveBooleanEnumRuleCall_17_0());
				}
				lv_isActive_17_0=ruleBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkerRule());
					}
					set(
						$current,
						"isActive",
						lv_isActive_17_0,
						"org.xtext.example.mydsl.MyDsl.Boolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_18=';'
		{
			newLeafNode(otherlv_18, grammarAccess.getWorkerAccess().getSemicolonKeyword_18());
		}
		otherlv_19='}'
		{
			newLeafNode(otherlv_19, grammarAccess.getWorkerAccess().getRightCurlyBracketKeyword_19());
		}
	)
;

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='task'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='difficulty'
		{
			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getDifficultyKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getDifficultyDifficultyEnumRuleCall_5_0());
				}
				lv_difficulty_5_0=ruleDifficulty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"difficulty",
						lv_difficulty_5_0,
						"org.xtext.example.mydsl.MyDsl.Difficulty");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getSemicolonKeyword_6());
		}
		otherlv_7='duration'
		{
			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getDurationKeyword_7());
		}
		otherlv_8='='
		{
			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getEqualsSignKeyword_8());
		}
		(
			(
				lv_duration_9_0=RULE_INT
				{
					newLeafNode(lv_duration_9_0, grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"duration",
						lv_duration_9_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getSemicolonKeyword_10());
		}
		otherlv_11='start'
		{
			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getStartKeyword_11());
		}
		otherlv_12='='
		{
			newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getEqualsSignKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getStartTIMEParserRuleCall_13_0());
				}
				lv_start_13_0=ruleTIME
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"start",
						lv_start_13_0,
						"org.xtext.example.mydsl.MyDsl.TIME");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getSemicolonKeyword_14());
		}
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_15());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0());
				}
				lv_condition_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"condition",
						lv_condition_1_0,
						"org.xtext.example.mydsl.MyDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='then'
		{
			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getAssignSeniorityLevelEnumRuleCall_3_0());
				}
				lv_assign_3_0=ruleSeniorityLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"assign",
						lv_assign_3_0,
						"org.xtext.example.mydsl.MyDsl.SeniorityLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleTIME
entryRuleTIME returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTIMERule()); }
	iv_ruleTIME=ruleTIME
	{ $current=$iv_ruleTIME.current; }
	EOF;

// Rule TIME
ruleTIME returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_hours_0_0=RULE_INT
				{
					newLeafNode(lv_hours_0_0, grammarAccess.getTIMEAccess().getHoursINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTIMERule());
					}
					setWithLastConsumed(
						$current,
						"hours",
						lv_hours_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTIMEAccess().getColonKeyword_1());
		}
		(
			(
				lv_minutes_2_0=RULE_INT
				{
					newLeafNode(lv_minutes_2_0, grammarAccess.getTIMEAccess().getMinutesINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTIMERule());
					}
					setWithLastConsumed(
						$current,
						"minutes",
						lv_minutes_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getConditionAccess().getOrConditionParserRuleCall());
	}
	this_OrCondition_0=ruleOrCondition
	{
		$current = $this_OrCondition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrCondition
entryRuleOrCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrConditionRule()); }
	iv_ruleOrCondition=ruleOrCondition
	{ $current=$iv_ruleOrCondition.current; }
	EOF;

// Rule OrCondition
ruleOrCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0());
		}
		this_AndCondition_0=ruleAndCondition
		{
			$current = $this_AndCondition_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='OR'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getORKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrConditionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl.MyDsl.AndCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndCondition
entryRuleAndCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndConditionRule()); }
	iv_ruleAndCondition=ruleAndCondition
	{ $current=$iv_ruleAndCondition.current; }
	EOF;

// Rule AndCondition
ruleAndCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndConditionAccess().getPrimaryConditionParserRuleCall_0());
		}
		this_PrimaryCondition_0=rulePrimaryCondition
		{
			$current = $this_PrimaryCondition_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='AND'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getANDKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndConditionAccess().getRightPrimaryConditionParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimaryCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndConditionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl.MyDsl.PrimaryCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimaryCondition
entryRulePrimaryCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryConditionRule()); }
	iv_rulePrimaryCondition=rulePrimaryCondition
	{ $current=$iv_rulePrimaryCondition.current; }
	EOF;

// Rule PrimaryCondition
rulePrimaryCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryConditionAccess().getPrimaryConditionAction_0_0(),
						$current);
				}
			)
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getPrimaryConditionAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryConditionAccess().getInnerConditionParserRuleCall_0_2_0());
					}
					lv_inner_2_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryConditionRule());
						}
						set(
							$current,
							"inner",
							lv_inner_2_0,
							"org.xtext.example.mydsl.MyDsl.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getPrimaryConditionAccess().getRightParenthesisKeyword_0_3());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getComparisonParserRuleCall_1());
		}
		this_Comparison_4=ruleComparison
		{
			$current = $this_Comparison_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getShiftConditionParserRuleCall_2());
		}
		this_ShiftCondition_5=ruleShiftCondition
		{
			$current = $this_ShiftCondition_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getDifficultyConditionParserRuleCall_3());
		}
		this_DifficultyCondition_6=ruleDifficultyCondition
		{
			$current = $this_DifficultyCondition_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleShiftCondition
entryRuleShiftCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShiftConditionRule()); }
	iv_ruleShiftCondition=ruleShiftCondition
	{ $current=$iv_ruleShiftCondition.current; }
	EOF;

// Rule ShiftCondition
ruleShiftCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='shift'
		{
			newLeafNode(otherlv_0, grammarAccess.getShiftConditionAccess().getShiftKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getShiftConditionAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShiftConditionAccess().getShiftShiftEnumRuleCall_2_0());
				}
				lv_shift_2_0=ruleShift
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShiftConditionRule());
					}
					set(
						$current,
						"shift",
						lv_shift_2_0,
						"org.xtext.example.mydsl.MyDsl.Shift");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	iv_ruleComparison=ruleComparison
	{ $current=$iv_ruleComparison.current; }
	EOF;

// Rule Comparison
ruleComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_operator_0_0=RULE_COMPARISONOPERATOR
				{
					newLeafNode(lv_operator_0_0, grammarAccess.getComparisonAccess().getOperatorComparisonOperatorTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComparisonRule());
					}
					setWithLastConsumed(
						$current,
						"operator",
						lv_operator_0_0,
						"org.xtext.example.mydsl.MyDsl.ComparisonOperator");
				}
			)
		)
		(
			(
				lv_duration_1_0=RULE_INT
				{
					newLeafNode(lv_duration_1_0, grammarAccess.getComparisonAccess().getDurationINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComparisonRule());
					}
					setWithLastConsumed(
						$current,
						"duration",
						lv_duration_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_2='min'
			{
				newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getMinKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleDifficultyCondition
entryRuleDifficultyCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDifficultyConditionRule()); }
	iv_ruleDifficultyCondition=ruleDifficultyCondition
	{ $current=$iv_ruleDifficultyCondition.current; }
	EOF;

// Rule DifficultyCondition
ruleDifficultyCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDifficultyConditionAccess().getDifficultyDifficultyEnumRuleCall_0());
			}
			lv_difficulty_0_0=ruleDifficulty
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDifficultyConditionRule());
				}
				set(
					$current,
					"difficulty",
					lv_difficulty_0_0,
					"org.xtext.example.mydsl.MyDsl.Difficulty");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Rule SeniorityLevel
ruleSeniorityLevel returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='trainee'
			{
				$current = grammarAccess.getSeniorityLevelAccess().getTraineeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSeniorityLevelAccess().getTraineeEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='junior'
			{
				$current = grammarAccess.getSeniorityLevelAccess().getJuniorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSeniorityLevelAccess().getJuniorEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='senior'
			{
				$current = grammarAccess.getSeniorityLevelAccess().getSeniorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSeniorityLevelAccess().getSeniorEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Difficulty
ruleDifficulty returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='easy'
			{
				$current = grammarAccess.getDifficultyAccess().getEasyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDifficultyAccess().getEasyEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='moderate'
			{
				$current = grammarAccess.getDifficultyAccess().getModerateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDifficultyAccess().getModerateEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='hard'
			{
				$current = grammarAccess.getDifficultyAccess().getHardEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDifficultyAccess().getHardEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Boolean
ruleBoolean returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='True'
			{
				$current = grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='False'
			{
				$current = grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Shift
ruleShift returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='nightshift'
			{
				$current = grammarAccess.getShiftAccess().getNightshiftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getShiftAccess().getNightshiftEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='dayshift'
			{
				$current = grammarAccess.getShiftAccess().getDayshiftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getShiftAccess().getDayshiftEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='eveningshift'
			{
				$current = grammarAccess.getShiftAccess().getEveningshiftEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getShiftAccess().getEveningshiftEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_COMPARISONOPERATOR : ('<'|'<='|'='|'>='|'>');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
