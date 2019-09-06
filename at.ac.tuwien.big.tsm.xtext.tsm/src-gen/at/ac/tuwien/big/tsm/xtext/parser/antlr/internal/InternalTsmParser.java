package at.ac.tuwien.big.tsm.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.tsm.xtext.services.TsmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTsmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state-machine'", "'starts-at'", "'{'", "'}'", "'state'", "'in'", "'out'", "'transition'", "'sec'", "':'", "'>'", "'.'", "'-'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTsmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTsmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTsmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTsm.g"; }



     	private TsmGrammarAccess grammarAccess;

        public InternalTsmParser(TokenStream input, TsmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected TsmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalTsm.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalTsm.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalTsm.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateMachine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalTsm.g:71:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'state-machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'starts-at' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_states_5_0 = null;

        EObject lv_transitions_6_0 = null;



        	enterRule();

        try {
            // InternalTsm.g:77:2: ( (otherlv_0= 'state-machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'starts-at' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' ) )
            // InternalTsm.g:78:2: (otherlv_0= 'state-machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'starts-at' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' )
            {
            // InternalTsm.g:78:2: (otherlv_0= 'state-machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'starts-at' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' )
            // InternalTsm.g:79:3: otherlv_0= 'state-machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'starts-at' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
              		
            }
            // InternalTsm.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTsm.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTsm.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalTsm.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateMachineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getStartsAtKeyword_2());
              		
            }
            // InternalTsm.g:105:3: ( ( ruleQualifiedName ) )
            // InternalTsm.g:106:4: ( ruleQualifiedName )
            {
            // InternalTsm.g:106:4: ( ruleQualifiedName )
            // InternalTsm.g:107:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateMachineRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateMachineAccess().getStartStateCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalTsm.g:125:3: ( (lv_states_5_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTsm.g:126:4: (lv_states_5_0= ruleState )
            	    {
            	    // InternalTsm.g:126:4: (lv_states_5_0= ruleState )
            	    // InternalTsm.g:127:5: lv_states_5_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"states",
            	      						lv_states_5_0,
            	      						"at.ac.tuwien.big.tsm.xtext.Tsm.State");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTsm.g:144:3: ( (lv_transitions_6_0= ruleTransition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTsm.g:145:4: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // InternalTsm.g:145:4: (lv_transitions_6_0= ruleTransition )
            	    // InternalTsm.g:146:5: lv_transitions_6_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_transitions_6_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"transitions",
            	      						lv_transitions_6_0,
            	      						"at.ac.tuwien.big.tsm.xtext.Tsm.Transition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalTsm.g:171:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalTsm.g:171:46: (iv_ruleState= ruleState EOF )
            // InternalTsm.g:172:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalTsm.g:178:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) otherlv_4= 'out' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTsm.g:184:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) otherlv_4= 'out' ( ( ruleQualifiedName ) ) ) )
            // InternalTsm.g:185:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) otherlv_4= 'out' ( ( ruleQualifiedName ) ) )
            {
            // InternalTsm.g:185:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) otherlv_4= 'out' ( ( ruleQualifiedName ) ) )
            // InternalTsm.g:186:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) otherlv_4= 'out' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
              		
            }
            // InternalTsm.g:190:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTsm.g:191:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTsm.g:191:4: (lv_name_1_0= RULE_ID )
            // InternalTsm.g:192:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getInKeyword_2());
              		
            }
            // InternalTsm.g:212:3: ( ( ruleQualifiedName ) )
            // InternalTsm.g:213:4: ( ruleQualifiedName )
            {
            // InternalTsm.g:213:4: ( ruleQualifiedName )
            // InternalTsm.g:214:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateAccess().getIncomingTransitionCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getOutKeyword_4());
              		
            }
            // InternalTsm.g:232:3: ( ( ruleQualifiedName ) )
            // InternalTsm.g:233:4: ( ruleQualifiedName )
            {
            // InternalTsm.g:233:4: ( ruleQualifiedName )
            // InternalTsm.g:234:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalTsm.g:252:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalTsm.g:252:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalTsm.g:253:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalTsm.g:259:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_timer_2_0= ruleTimeEvent ) ) otherlv_3= 'sec' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '>' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_timer_2_0 = null;



        	enterRule();

        try {
            // InternalTsm.g:265:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_timer_2_0= ruleTimeEvent ) ) otherlv_3= 'sec' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '>' ( ( ruleQualifiedName ) ) ) )
            // InternalTsm.g:266:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_timer_2_0= ruleTimeEvent ) ) otherlv_3= 'sec' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '>' ( ( ruleQualifiedName ) ) )
            {
            // InternalTsm.g:266:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_timer_2_0= ruleTimeEvent ) ) otherlv_3= 'sec' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '>' ( ( ruleQualifiedName ) ) )
            // InternalTsm.g:267:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_timer_2_0= ruleTimeEvent ) ) otherlv_3= 'sec' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '>' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
              		
            }
            // InternalTsm.g:271:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTsm.g:272:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTsm.g:272:4: (lv_name_1_0= RULE_ID )
            // InternalTsm.g:273:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalTsm.g:289:3: ( (lv_timer_2_0= ruleTimeEvent ) )
            // InternalTsm.g:290:4: (lv_timer_2_0= ruleTimeEvent )
            {
            // InternalTsm.g:290:4: (lv_timer_2_0= ruleTimeEvent )
            // InternalTsm.g:291:5: lv_timer_2_0= ruleTimeEvent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransitionAccess().getTimerTimeEventParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_timer_2_0=ruleTimeEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransitionRule());
              					}
              					set(
              						current,
              						"timer",
              						lv_timer_2_0,
              						"at.ac.tuwien.big.tsm.xtext.Tsm.TimeEvent");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getSecKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getColonKeyword_4());
              		
            }
            // InternalTsm.g:316:3: ( ( ruleQualifiedName ) )
            // InternalTsm.g:317:4: ( ruleQualifiedName )
            {
            // InternalTsm.g:317:4: ( ruleQualifiedName )
            // InternalTsm.g:318:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_6());
              		
            }
            // InternalTsm.g:336:3: ( ( ruleQualifiedName ) )
            // InternalTsm.g:337:4: ( ruleQualifiedName )
            {
            // InternalTsm.g:337:4: ( ruleQualifiedName )
            // InternalTsm.g:338:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTimeEvent"
    // InternalTsm.g:356:1: entryRuleTimeEvent returns [EObject current=null] : iv_ruleTimeEvent= ruleTimeEvent EOF ;
    public final EObject entryRuleTimeEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEvent = null;


        try {
            // InternalTsm.g:356:50: (iv_ruleTimeEvent= ruleTimeEvent EOF )
            // InternalTsm.g:357:2: iv_ruleTimeEvent= ruleTimeEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeEvent=ruleTimeEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeEvent"


    // $ANTLR start "ruleTimeEvent"
    // InternalTsm.g:363:1: ruleTimeEvent returns [EObject current=null] : ( (lv_time_0_0= ruleEInt ) ) ;
    public final EObject ruleTimeEvent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_time_0_0 = null;



        	enterRule();

        try {
            // InternalTsm.g:369:2: ( ( (lv_time_0_0= ruleEInt ) ) )
            // InternalTsm.g:370:2: ( (lv_time_0_0= ruleEInt ) )
            {
            // InternalTsm.g:370:2: ( (lv_time_0_0= ruleEInt ) )
            // InternalTsm.g:371:3: (lv_time_0_0= ruleEInt )
            {
            // InternalTsm.g:371:3: (lv_time_0_0= ruleEInt )
            // InternalTsm.g:372:4: lv_time_0_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTimeEventAccess().getTimeEIntParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_time_0_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTimeEventRule());
              				}
              				set(
              					current,
              					"time",
              					lv_time_0_0,
              					"at.ac.tuwien.big.tsm.xtext.Tsm.EInt");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimeEvent"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTsm.g:392:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalTsm.g:392:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTsm.g:393:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalTsm.g:399:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTsm.g:405:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalTsm.g:406:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalTsm.g:406:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalTsm.g:407:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalTsm.g:414:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) && (synpred1_InternalTsm())) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTsm.g:415:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalTsm.g:415:4: ( ( '.' )=>kw= '.' )
            	    // InternalTsm.g:416:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEInt"
    // InternalTsm.g:435:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTsm.g:435:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTsm.g:436:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTsm.g:442:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTsm.g:448:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTsm.g:449:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTsm.g:449:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTsm.g:450:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTsm.g:450:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTsm.g:451:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEInt"

    // $ANTLR start synpred1_InternalTsm
    public final void synpred1_InternalTsm_fragment() throws RecognitionException {   
        // InternalTsm.g:416:5: ( '.' )
        // InternalTsm.g:416:6: '.'
        {
        match(input,22,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTsm

    // Delegated rules

    public final boolean synpred1_InternalTsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});

}