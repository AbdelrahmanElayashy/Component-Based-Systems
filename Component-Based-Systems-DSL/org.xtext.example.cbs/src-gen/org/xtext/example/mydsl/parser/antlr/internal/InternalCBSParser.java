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
import org.xtext.example.mydsl.services.CBSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCBSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'childContexts'", "','", "'}'", "'assemblyConnectors'", "'requiredDelegationConnectors'", "'providedDelegationConnectors'", "'allocation'", "'AssemblyContext'", "'instantiates'", "'providedRoles'", "'requiredRoles'", "'AssemblyConnector'", "'requiringRole'", "'providingRole'", "'RequiredDelegationConnector'", "'ProvidedDelegationConnector'", "'Allocation'", "'environment'", "'allocationContexts'", "'ProvidedRole'", "'interface'", "'RequiredRole'", "'AtomicComponent'", "'requires'", "'('", "')'", "'provides'", "'services'", "'Signature'", "'returnType'", "'parameters'", "'Parameter'", "'type'", "'SimpleType'", "'ComplexType'", "'members'", "'ComplexMember'", "'Void'", "'Service'", "'implements'", "'actions'", "'InternalAction'", "'ExternalCallAction'", "'requiredService'", "'BranchAction'", "'branches'", "'LoopAction'", "'bodyActions'", "'BranchTransition'", "'branchCondition'", "'action'", "'AllocationContext'", "'container'", "'allocates'", "'Container'", "'Linker'", "'links'", "'String'", "'Int'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'Long'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCBSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCBSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCBSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCBS.g"; }



     	private CBSGrammarAccess grammarAccess;

        public InternalCBSParser(TokenStream input, CBSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected CBSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalCBS.g:65:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalCBS.g:65:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalCBS.g:66:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalCBS.g:72:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' ( (lv_allocation_28_0= ruleAllocation ) ) otherlv_29= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_childContexts_5_0 = null;

        EObject lv_childContexts_7_0 = null;

        EObject lv_assemblyConnectors_11_0 = null;

        EObject lv_assemblyConnectors_13_0 = null;

        EObject lv_requiredDelegationConnectors_17_0 = null;

        EObject lv_requiredDelegationConnectors_19_0 = null;

        EObject lv_providedDelegationConnectors_23_0 = null;

        EObject lv_providedDelegationConnectors_25_0 = null;

        EObject lv_allocation_28_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:78:2: ( (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' ( (lv_allocation_28_0= ruleAllocation ) ) otherlv_29= '}' ) )
            // InternalCBS.g:79:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' ( (lv_allocation_28_0= ruleAllocation ) ) otherlv_29= '}' )
            {
            // InternalCBS.g:79:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' ( (lv_allocation_28_0= ruleAllocation ) ) otherlv_29= '}' )
            // InternalCBS.g:80:3: otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' ( (lv_allocation_28_0= ruleAllocation ) ) otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalCBS.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:85:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:107:3: (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCBS.g:108:4: otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getChildContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBS.g:116:4: ( (lv_childContexts_5_0= ruleAssemblyContext ) )
                    // InternalCBS.g:117:5: (lv_childContexts_5_0= ruleAssemblyContext )
                    {
                    // InternalCBS.g:117:5: (lv_childContexts_5_0= ruleAssemblyContext )
                    // InternalCBS.g:118:6: lv_childContexts_5_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_childContexts_5_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"childContexts",
                    							lv_childContexts_5_0,
                    							"org.xtext.example.mydsl.CBS.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:135:4: (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCBS.g:136:5: otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBS.g:140:5: ( (lv_childContexts_7_0= ruleAssemblyContext ) )
                    	    // InternalCBS.g:141:6: (lv_childContexts_7_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCBS.g:141:6: (lv_childContexts_7_0= ruleAssemblyContext )
                    	    // InternalCBS.g:142:7: lv_childContexts_7_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_childContexts_7_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"childContexts",
                    	    								lv_childContexts_7_0,
                    	    								"org.xtext.example.mydsl.CBS.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:165:3: (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCBS.g:166:4: otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:174:4: ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) )
                    // InternalCBS.g:175:5: (lv_assemblyConnectors_11_0= ruleAssemblyConnector )
                    {
                    // InternalCBS.g:175:5: (lv_assemblyConnectors_11_0= ruleAssemblyConnector )
                    // InternalCBS.g:176:6: lv_assemblyConnectors_11_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_assemblyConnectors_11_0=ruleAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"assemblyConnectors",
                    							lv_assemblyConnectors_11_0,
                    							"org.xtext.example.mydsl.CBS.AssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:193:4: (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCBS.g:194:5: otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:198:5: ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) )
                    	    // InternalCBS.g:199:6: (lv_assemblyConnectors_13_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalCBS.g:199:6: (lv_assemblyConnectors_13_0= ruleAssemblyConnector )
                    	    // InternalCBS.g:200:7: lv_assemblyConnectors_13_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_assemblyConnectors_13_0=ruleAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyConnectors",
                    	    								lv_assemblyConnectors_13_0,
                    	    								"org.xtext.example.mydsl.CBS.AssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:223:3: (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCBS.g:224:4: otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getRequiredDelegationConnectorsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:232:4: ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) )
                    // InternalCBS.g:233:5: (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector )
                    {
                    // InternalCBS.g:233:5: (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector )
                    // InternalCBS.g:234:6: lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_requiredDelegationConnectors_17_0=ruleRequiredDelegationConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"requiredDelegationConnectors",
                    							lv_requiredDelegationConnectors_17_0,
                    							"org.xtext.example.mydsl.CBS.RequiredDelegationConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:251:4: (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCBS.g:252:5: otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:256:5: ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) )
                    	    // InternalCBS.g:257:6: (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector )
                    	    {
                    	    // InternalCBS.g:257:6: (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector )
                    	    // InternalCBS.g:258:7: lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_requiredDelegationConnectors_19_0=ruleRequiredDelegationConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredDelegationConnectors",
                    	    								lv_requiredDelegationConnectors_19_0,
                    	    								"org.xtext.example.mydsl.CBS.RequiredDelegationConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:281:3: (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCBS.g:282:4: otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getProvidedDelegationConnectorsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:290:4: ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) )
                    // InternalCBS.g:291:5: (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector )
                    {
                    // InternalCBS.g:291:5: (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector )
                    // InternalCBS.g:292:6: lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_providedDelegationConnectors_23_0=ruleProvidedDelegationConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"providedDelegationConnectors",
                    							lv_providedDelegationConnectors_23_0,
                    							"org.xtext.example.mydsl.CBS.ProvidedDelegationConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:309:4: (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCBS.g:310:5: otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:314:5: ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) )
                    	    // InternalCBS.g:315:6: (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector )
                    	    {
                    	    // InternalCBS.g:315:6: (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector )
                    	    // InternalCBS.g:316:7: lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_providedDelegationConnectors_25_0=ruleProvidedDelegationConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedDelegationConnectors",
                    	    								lv_providedDelegationConnectors_25_0,
                    	    								"org.xtext.example.mydsl.CBS.ProvidedDelegationConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_26, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_27, grammarAccess.getSystemAccess().getAllocationKeyword_7());
            		
            // InternalCBS.g:343:3: ( (lv_allocation_28_0= ruleAllocation ) )
            // InternalCBS.g:344:4: (lv_allocation_28_0= ruleAllocation )
            {
            // InternalCBS.g:344:4: (lv_allocation_28_0= ruleAllocation )
            // InternalCBS.g:345:5: lv_allocation_28_0= ruleAllocation
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getAllocationAllocationParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_16);
            lv_allocation_28_0=ruleAllocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"allocation",
            						lv_allocation_28_0,
            						"org.xtext.example.mydsl.CBS.Allocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleAbstractAction"
    // InternalCBS.g:370:1: entryRuleAbstractAction returns [EObject current=null] : iv_ruleAbstractAction= ruleAbstractAction EOF ;
    public final EObject entryRuleAbstractAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAction = null;


        try {
            // InternalCBS.g:370:55: (iv_ruleAbstractAction= ruleAbstractAction EOF )
            // InternalCBS.g:371:2: iv_ruleAbstractAction= ruleAbstractAction EOF
            {
             newCompositeNode(grammarAccess.getAbstractActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractAction=ruleAbstractAction();

            state._fsp--;

             current =iv_ruleAbstractAction; 
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
    // $ANTLR end "entryRuleAbstractAction"


    // $ANTLR start "ruleAbstractAction"
    // InternalCBS.g:377:1: ruleAbstractAction returns [EObject current=null] : (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction ) ;
    public final EObject ruleAbstractAction() throws RecognitionException {
        EObject current = null;

        EObject this_InternalAction_0 = null;

        EObject this_ExternalCallAction_1 = null;

        EObject this_BranchAction_2 = null;

        EObject this_LoopAction_3 = null;



        	enterRule();

        try {
            // InternalCBS.g:383:2: ( (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction ) )
            // InternalCBS.g:384:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction )
            {
            // InternalCBS.g:384:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt9=1;
                }
                break;
            case 55:
                {
                alt9=2;
                }
                break;
            case 57:
                {
                alt9=3;
                }
                break;
            case 59:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCBS.g:385:3: this_InternalAction_0= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getAbstractActionAccess().getInternalActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_0=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCBS.g:394:3: this_ExternalCallAction_1= ruleExternalCallAction
                    {

                    			newCompositeNode(grammarAccess.getAbstractActionAccess().getExternalCallActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCallAction_1=ruleExternalCallAction();

                    state._fsp--;


                    			current = this_ExternalCallAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCBS.g:403:3: this_BranchAction_2= ruleBranchAction
                    {

                    			newCompositeNode(grammarAccess.getAbstractActionAccess().getBranchActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BranchAction_2=ruleBranchAction();

                    state._fsp--;


                    			current = this_BranchAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCBS.g:412:3: this_LoopAction_3= ruleLoopAction
                    {

                    			newCompositeNode(grammarAccess.getAbstractActionAccess().getLoopActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopAction_3=ruleLoopAction();

                    state._fsp--;


                    			current = this_LoopAction_3;
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
    // $ANTLR end "ruleAbstractAction"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalCBS.g:424:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalCBS.g:424:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalCBS.g:425:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyContext=ruleAssemblyContext();

            state._fsp--;

             current =iv_ruleAssemblyContext; 
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
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalCBS.g:431:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiates' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedRoles_7_0 = null;

        EObject lv_providedRoles_9_0 = null;

        EObject lv_requiredRoles_13_0 = null;

        EObject lv_requiredRoles_15_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:437:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiates' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalCBS.g:438:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiates' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalCBS.g:438:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiates' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalCBS.g:439:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiates' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalCBS.g:443:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:444:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:444:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:445:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getInstantiatesKeyword_3());
            		
            // InternalCBS.g:470:3: ( ( ruleEString ) )
            // InternalCBS.g:471:4: ( ruleEString )
            {
            // InternalCBS.g:471:4: ( ruleEString )
            // InternalCBS.g:472:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:486:3: (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) ) )* otherlv_10= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCBS.g:487:4: otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:495:4: ( (lv_providedRoles_7_0= ruleProvidedRole ) )
                    // InternalCBS.g:496:5: (lv_providedRoles_7_0= ruleProvidedRole )
                    {
                    // InternalCBS.g:496:5: (lv_providedRoles_7_0= ruleProvidedRole )
                    // InternalCBS.g:497:6: lv_providedRoles_7_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_providedRoles_7_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_7_0,
                    							"org.xtext.example.mydsl.CBS.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:514:4: (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCBS.g:515:5: otherlv_8= ',' ( (lv_providedRoles_9_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:519:5: ( (lv_providedRoles_9_0= ruleProvidedRole ) )
                    	    // InternalCBS.g:520:6: (lv_providedRoles_9_0= ruleProvidedRole )
                    	    {
                    	    // InternalCBS.g:520:6: (lv_providedRoles_9_0= ruleProvidedRole )
                    	    // InternalCBS.g:521:7: lv_providedRoles_9_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_providedRoles_9_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_9_0,
                    	    								"org.xtext.example.mydsl.CBS.ProvidedRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:544:3: (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) ) )* otherlv_16= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCBS.g:545:4: otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:553:4: ( (lv_requiredRoles_13_0= ruleRequiredRole ) )
                    // InternalCBS.g:554:5: (lv_requiredRoles_13_0= ruleRequiredRole )
                    {
                    // InternalCBS.g:554:5: (lv_requiredRoles_13_0= ruleRequiredRole )
                    // InternalCBS.g:555:6: lv_requiredRoles_13_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_requiredRoles_13_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_13_0,
                    							"org.xtext.example.mydsl.CBS.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:572:4: (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCBS.g:573:5: otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:577:5: ( (lv_requiredRoles_15_0= ruleRequiredRole ) )
                    	    // InternalCBS.g:578:6: (lv_requiredRoles_15_0= ruleRequiredRole )
                    	    {
                    	    // InternalCBS.g:578:6: (lv_requiredRoles_15_0= ruleRequiredRole )
                    	    // InternalCBS.g:579:7: lv_requiredRoles_15_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_requiredRoles_15_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_15_0,
                    	    								"org.xtext.example.mydsl.CBS.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalCBS.g:610:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalCBS.g:610:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalCBS.g:611:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
            {
             newCompositeNode(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyConnector=ruleAssemblyConnector();

            state._fsp--;

             current =iv_ruleAssemblyConnector; 
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
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalCBS.g:617:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= 'providingRole' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:623:2: ( (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= 'providingRole' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalCBS.g:624:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= 'providingRole' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalCBS.g:624:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= 'providingRole' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalCBS.g:625:3: otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= 'providingRole' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            // InternalCBS.g:629:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:630:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:630:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:631:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getRequiringRoleKeyword_3());
            		
            // InternalCBS.g:656:3: ( ( ruleEString ) )
            // InternalCBS.g:657:4: ( ruleEString )
            {
            // InternalCBS.g:657:4: ( ruleEString )
            // InternalCBS.g:658:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyConnectorAccess().getProvidingRoleKeyword_5());
            		
            // InternalCBS.g:676:3: ( ( ruleEString ) )
            // InternalCBS.g:677:4: ( ruleEString )
            {
            // InternalCBS.g:677:4: ( ruleEString )
            // InternalCBS.g:678:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleRequiredDelegationConnector"
    // InternalCBS.g:700:1: entryRuleRequiredDelegationConnector returns [EObject current=null] : iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF ;
    public final EObject entryRuleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredDelegationConnector = null;


        try {
            // InternalCBS.g:700:68: (iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF )
            // InternalCBS.g:701:2: iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getRequiredDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredDelegationConnector=ruleRequiredDelegationConnector();

            state._fsp--;

             current =iv_ruleRequiredDelegationConnector; 
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
    // $ANTLR end "entryRuleRequiredDelegationConnector"


    // $ANTLR start "ruleRequiredDelegationConnector"
    // InternalCBS.g:707:1: ruleRequiredDelegationConnector returns [EObject current=null] : (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:713:2: ( (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:714:2: (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:714:2: (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:715:3: otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiringRole' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredDelegationConnectorAccess().getRequiredDelegationConnectorKeyword_0());
            		
            // InternalCBS.g:719:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:720:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:720:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:721:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleKeyword_3());
            		
            // InternalCBS.g:746:3: ( ( ruleEString ) )
            // InternalCBS.g:747:4: ( ruleEString )
            {
            // InternalCBS.g:747:4: ( ruleEString )
            // InternalCBS.g:748:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleRequiredRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredDelegationConnectorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRequiredDelegationConnector"


    // $ANTLR start "entryRuleProvidedDelegationConnector"
    // InternalCBS.g:770:1: entryRuleProvidedDelegationConnector returns [EObject current=null] : iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF ;
    public final EObject entryRuleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedDelegationConnector = null;


        try {
            // InternalCBS.g:770:68: (iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF )
            // InternalCBS.g:771:2: iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getProvidedDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedDelegationConnector=ruleProvidedDelegationConnector();

            state._fsp--;

             current =iv_ruleProvidedDelegationConnector; 
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
    // $ANTLR end "entryRuleProvidedDelegationConnector"


    // $ANTLR start "ruleProvidedDelegationConnector"
    // InternalCBS.g:777:1: ruleProvidedDelegationConnector returns [EObject current=null] : (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providingRole' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:783:2: ( (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providingRole' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:784:2: (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providingRole' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:784:2: (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providingRole' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:785:3: otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providingRole' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedDelegationConnectorAccess().getProvidedDelegationConnectorKeyword_0());
            		
            // InternalCBS.g:789:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:790:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:790:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:791:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleKeyword_3());
            		
            // InternalCBS.g:816:3: ( ( ruleEString ) )
            // InternalCBS.g:817:4: ( ruleEString )
            {
            // InternalCBS.g:817:4: ( ruleEString )
            // InternalCBS.g:818:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleProvidedRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedDelegationConnectorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProvidedDelegationConnector"


    // $ANTLR start "entryRuleEString"
    // InternalCBS.g:840:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCBS.g:840:47: (iv_ruleEString= ruleEString EOF )
            // InternalCBS.g:841:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCBS.g:847:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCBS.g:853:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCBS.g:854:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCBS.g:854:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCBS.g:855:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCBS.g:863:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAllocation"
    // InternalCBS.g:874:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalCBS.g:874:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalCBS.g:875:2: iv_ruleAllocation= ruleAllocation EOF
            {
             newCompositeNode(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocation=ruleAllocation();

            state._fsp--;

             current =iv_ruleAllocation; 
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
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // InternalCBS.g:881:1: ruleAllocation returns [EObject current=null] : (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'environment' ( ( ruleEString ) ) (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_allocationContexts_6_0 = null;

        EObject lv_allocationContexts_8_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:887:2: ( (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'environment' ( ( ruleEString ) ) (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalCBS.g:888:2: (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'environment' ( ( ruleEString ) ) (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalCBS.g:888:2: (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'environment' ( ( ruleEString ) ) (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalCBS.g:889:3: otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'environment' ( ( ruleEString ) ) (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationAccess().getAllocationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getEnvironmentKeyword_2());
            		
            // InternalCBS.g:901:3: ( ( ruleEString ) )
            // InternalCBS.g:902:4: ( ruleEString )
            {
            // InternalCBS.g:902:4: ( ruleEString )
            // InternalCBS.g:903:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentCrossReference_3_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:917:3: (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCBS.g:918:4: otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:926:4: ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
                    // InternalCBS.g:927:5: (lv_allocationContexts_6_0= ruleAllocationContext )
                    {
                    // InternalCBS.g:927:5: (lv_allocationContexts_6_0= ruleAllocationContext )
                    // InternalCBS.g:928:6: lv_allocationContexts_6_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_allocationContexts_6_0=ruleAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocationRule());
                    						}
                    						add(
                    							current,
                    							"allocationContexts",
                    							lv_allocationContexts_6_0,
                    							"org.xtext.example.mydsl.CBS.AllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:945:4: (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCBS.g:946:5: otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAllocationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:950:5: ( (lv_allocationContexts_8_0= ruleAllocationContext ) )
                    	    // InternalCBS.g:951:6: (lv_allocationContexts_8_0= ruleAllocationContext )
                    	    {
                    	    // InternalCBS.g:951:6: (lv_allocationContexts_8_0= ruleAllocationContext )
                    	    // InternalCBS.g:952:7: lv_allocationContexts_8_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_allocationContexts_8_0=ruleAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAllocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocationContexts",
                    	    								lv_allocationContexts_8_0,
                    	    								"org.xtext.example.mydsl.CBS.AllocationContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalCBS.g:983:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCBS.g:983:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCBS.g:984:2: iv_ruleProvidedRole= ruleProvidedRole EOF
            {
             newCompositeNode(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedRole=ruleProvidedRole();

            state._fsp--;

             current =iv_ruleProvidedRole; 
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
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalCBS.g:990:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:996:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:997:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:997:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:998:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalCBS.g:1002:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:1003:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:1003:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:1004:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3());
            		
            // InternalCBS.g:1029:3: ( ( ruleEString ) )
            // InternalCBS.g:1030:4: ( ruleEString )
            {
            // InternalCBS.g:1030:4: ( ruleEString )
            // InternalCBS.g:1031:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalCBS.g:1053:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCBS.g:1053:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCBS.g:1054:2: iv_ruleRequiredRole= ruleRequiredRole EOF
            {
             newCompositeNode(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredRole=ruleRequiredRole();

            state._fsp--;

             current =iv_ruleRequiredRole; 
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
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalCBS.g:1060:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1066:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:1067:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:1067:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:1068:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalCBS.g:1072:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:1073:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:1073:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:1074:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3());
            		
            // InternalCBS.g:1099:3: ( ( ruleEString ) )
            // InternalCBS.g:1100:4: ( ruleEString )
            {
            // InternalCBS.g:1100:4: ( ruleEString )
            // InternalCBS.g:1101:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleAtomicComponent"
    // InternalCBS.g:1123:1: entryRuleAtomicComponent returns [EObject current=null] : iv_ruleAtomicComponent= ruleAtomicComponent EOF ;
    public final EObject entryRuleAtomicComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicComponent = null;


        try {
            // InternalCBS.g:1123:56: (iv_ruleAtomicComponent= ruleAtomicComponent EOF )
            // InternalCBS.g:1124:2: iv_ruleAtomicComponent= ruleAtomicComponent EOF
            {
             newCompositeNode(grammarAccess.getAtomicComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicComponent=ruleAtomicComponent();

            state._fsp--;

             current =iv_ruleAtomicComponent; 
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
    // $ANTLR end "entryRuleAtomicComponent"


    // $ANTLR start "ruleAtomicComponent"
    // InternalCBS.g:1130:1: ruleAtomicComponent returns [EObject current=null] : ( () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleAtomicComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_services_18_0 = null;

        EObject lv_services_20_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1136:2: ( ( () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalCBS.g:1137:2: ( () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalCBS.g:1137:2: ( () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalCBS.g:1138:3: () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalCBS.g:1138:3: ()
            // InternalCBS.g:1139:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicComponentAccess().getAtomicComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicComponentAccess().getAtomicComponentKeyword_1());
            		
            // InternalCBS.g:1149:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:1150:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:1150:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:1151:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtomicComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:1172:3: (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCBS.g:1173:4: otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicComponentAccess().getRequiresKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomicComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalCBS.g:1181:4: ( ( ruleEString ) )
                    // InternalCBS.g:1182:5: ( ruleEString )
                    {
                    // InternalCBS.g:1182:5: ( ruleEString )
                    // InternalCBS.g:1183:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1197:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCBS.g:1198:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAtomicComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:1202:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:1203:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:1203:6: ( ruleEString )
                    	    // InternalCBS.g:1204:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,38,FOLLOW_31); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1224:3: (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCBS.g:1225:4: otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getAtomicComponentAccess().getProvidesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtomicComponentAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalCBS.g:1233:4: ( ( ruleEString ) )
                    // InternalCBS.g:1234:5: ( ruleEString )
                    {
                    // InternalCBS.g:1234:5: ( ruleEString )
                    // InternalCBS.g:1235:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1249:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCBS.g:1250:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAtomicComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:1254:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:1255:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:1255:6: ( ruleEString )
                    	    // InternalCBS.g:1256:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,38,FOLLOW_32); 

                    				newLeafNode(otherlv_15, grammarAccess.getAtomicComponentAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1276:3: (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCBS.g:1277:4: otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getAtomicComponentAccess().getServicesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_17, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:1285:4: ( (lv_services_18_0= ruleService ) )
                    // InternalCBS.g:1286:5: (lv_services_18_0= ruleService )
                    {
                    // InternalCBS.g:1286:5: (lv_services_18_0= ruleService )
                    // InternalCBS.g:1287:6: lv_services_18_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_services_18_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicComponentRule());
                    						}
                    						add(
                    							current,
                    							"services",
                    							lv_services_18_0,
                    							"org.xtext.example.mydsl.CBS.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1304:4: (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalCBS.g:1305:5: otherlv_19= ',' ( (lv_services_20_0= ruleService ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getAtomicComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:1309:5: ( (lv_services_20_0= ruleService ) )
                    	    // InternalCBS.g:1310:6: (lv_services_20_0= ruleService )
                    	    {
                    	    // InternalCBS.g:1310:6: (lv_services_20_0= ruleService )
                    	    // InternalCBS.g:1311:7: lv_services_20_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_services_20_0=ruleService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"services",
                    	    								lv_services_20_0,
                    	    								"org.xtext.example.mydsl.CBS.Service");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_21, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAtomicComponent"


    // $ANTLR start "entryRuleSignature"
    // InternalCBS.g:1342:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalCBS.g:1342:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalCBS.g:1343:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalCBS.g:1349:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1355:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalCBS.g:1356:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalCBS.g:1356:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalCBS.g:1357:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalCBS.g:1361:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:1362:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:1362:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:1363:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturnTypeKeyword_3());
            		
            // InternalCBS.g:1388:3: ( ( ruleEString ) )
            // InternalCBS.g:1389:4: ( ruleEString )
            {
            // InternalCBS.g:1389:4: ( ruleEString )
            // InternalCBS.g:1390:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1404:3: (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCBS.g:1405:4: otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:1413:4: ( (lv_parameters_7_0= ruleParameter ) )
                    // InternalCBS.g:1414:5: (lv_parameters_7_0= ruleParameter )
                    {
                    // InternalCBS.g:1414:5: (lv_parameters_7_0= ruleParameter )
                    // InternalCBS.g:1415:6: lv_parameters_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameters_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_7_0,
                    							"org.xtext.example.mydsl.CBS.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1432:4: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalCBS.g:1433:5: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:1437:5: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // InternalCBS.g:1438:6: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // InternalCBS.g:1438:6: (lv_parameters_9_0= ruleParameter )
                    	    // InternalCBS.g:1439:7: lv_parameters_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameters_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_9_0,
                    	    								"org.xtext.example.mydsl.CBS.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalCBS.g:1470:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCBS.g:1470:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCBS.g:1471:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCBS.g:1477:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1483:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:1484:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:1484:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:1485:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalCBS.g:1489:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:1490:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:1490:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:1491:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalCBS.g:1516:3: ( ( ruleEString ) )
            // InternalCBS.g:1517:4: ( ruleEString )
            {
            // InternalCBS.g:1517:4: ( ruleEString )
            // InternalCBS.g:1518:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSimpleType"
    // InternalCBS.g:1540:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalCBS.g:1540:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalCBS.g:1541:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalCBS.g:1547:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSimpleTypeEnum ) ) otherlv_4= '}' ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1553:2: ( (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSimpleTypeEnum ) ) otherlv_4= '}' ) )
            // InternalCBS.g:1554:2: (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSimpleTypeEnum ) ) otherlv_4= '}' )
            {
            // InternalCBS.g:1554:2: (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSimpleTypeEnum ) ) otherlv_4= '}' )
            // InternalCBS.g:1555:3: otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSimpleTypeEnum ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getTypeKeyword_2());
            		
            // InternalCBS.g:1567:3: ( (lv_type_3_0= ruleSimpleTypeEnum ) )
            // InternalCBS.g:1568:4: (lv_type_3_0= ruleSimpleTypeEnum )
            {
            // InternalCBS.g:1568:4: (lv_type_3_0= ruleSimpleTypeEnum )
            // InternalCBS.g:1569:5: lv_type_3_0= ruleSimpleTypeEnum
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_3_0=ruleSimpleTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.CBS.SimpleTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleComplexType"
    // InternalCBS.g:1594:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalCBS.g:1594:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalCBS.g:1595:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalCBS.g:1601:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'ComplexType' otherlv_2= '{' (otherlv_3= 'members' otherlv_4= '{' ( (lv_members_5_0= ruleComplexMember ) ) (otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_members_5_0 = null;

        EObject lv_members_7_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1607:2: ( ( () otherlv_1= 'ComplexType' otherlv_2= '{' (otherlv_3= 'members' otherlv_4= '{' ( (lv_members_5_0= ruleComplexMember ) ) (otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalCBS.g:1608:2: ( () otherlv_1= 'ComplexType' otherlv_2= '{' (otherlv_3= 'members' otherlv_4= '{' ( (lv_members_5_0= ruleComplexMember ) ) (otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalCBS.g:1608:2: ( () otherlv_1= 'ComplexType' otherlv_2= '{' (otherlv_3= 'members' otherlv_4= '{' ( (lv_members_5_0= ruleComplexMember ) ) (otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalCBS.g:1609:3: () otherlv_1= 'ComplexType' otherlv_2= '{' (otherlv_3= 'members' otherlv_4= '{' ( (lv_members_5_0= ruleComplexMember ) ) (otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalCBS.g:1609:3: ()
            // InternalCBS.g:1610:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:1624:3: (otherlv_3= 'members' otherlv_4= '{' ( (lv_members_5_0= ruleComplexMember ) ) (otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) ) )* otherlv_8= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCBS.g:1625:4: otherlv_3= 'members' otherlv_4= '{' ( (lv_members_5_0= ruleComplexMember ) ) (otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getMembersKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBS.g:1633:4: ( (lv_members_5_0= ruleComplexMember ) )
                    // InternalCBS.g:1634:5: (lv_members_5_0= ruleComplexMember )
                    {
                    // InternalCBS.g:1634:5: (lv_members_5_0= ruleComplexMember )
                    // InternalCBS.g:1635:6: lv_members_5_0= ruleComplexMember
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_members_5_0=ruleComplexMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_5_0,
                    							"org.xtext.example.mydsl.CBS.ComplexMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1652:4: (otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCBS.g:1653:5: otherlv_6= ',' ( (lv_members_7_0= ruleComplexMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_40); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComplexTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBS.g:1657:5: ( (lv_members_7_0= ruleComplexMember ) )
                    	    // InternalCBS.g:1658:6: (lv_members_7_0= ruleComplexMember )
                    	    {
                    	    // InternalCBS.g:1658:6: (lv_members_7_0= ruleComplexMember )
                    	    // InternalCBS.g:1659:7: lv_members_7_0= ruleComplexMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_members_7_0=ruleComplexMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_7_0,
                    	    								"org.xtext.example.mydsl.CBS.ComplexMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleComplexMember"
    // InternalCBS.g:1690:1: entryRuleComplexMember returns [EObject current=null] : iv_ruleComplexMember= ruleComplexMember EOF ;
    public final EObject entryRuleComplexMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMember = null;


        try {
            // InternalCBS.g:1690:54: (iv_ruleComplexMember= ruleComplexMember EOF )
            // InternalCBS.g:1691:2: iv_ruleComplexMember= ruleComplexMember EOF
            {
             newCompositeNode(grammarAccess.getComplexMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexMember=ruleComplexMember();

            state._fsp--;

             current =iv_ruleComplexMember; 
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
    // $ANTLR end "entryRuleComplexMember"


    // $ANTLR start "ruleComplexMember"
    // InternalCBS.g:1697:1: ruleComplexMember returns [EObject current=null] : (otherlv_0= 'ComplexMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleComplexMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1703:2: ( (otherlv_0= 'ComplexMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:1704:2: (otherlv_0= 'ComplexMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:1704:2: (otherlv_0= 'ComplexMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:1705:3: otherlv_0= 'ComplexMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexMemberAccess().getComplexMemberKeyword_0());
            		
            // InternalCBS.g:1709:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:1710:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:1710:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:1711:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexMemberAccess().getTypeKeyword_3());
            		
            // InternalCBS.g:1736:3: ( ( ruleEString ) )
            // InternalCBS.g:1737:4: ( ruleEString )
            {
            // InternalCBS.g:1737:4: ( ruleEString )
            // InternalCBS.g:1738:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComplexMemberAccess().getTypeParameterTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexMemberAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComplexMember"


    // $ANTLR start "entryRuleVoid"
    // InternalCBS.g:1760:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalCBS.g:1760:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalCBS.g:1761:2: iv_ruleVoid= ruleVoid EOF
            {
             newCompositeNode(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoid=ruleVoid();

            state._fsp--;

             current =iv_ruleVoid; 
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
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalCBS.g:1767:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCBS.g:1773:2: ( ( () otherlv_1= 'Void' ) )
            // InternalCBS.g:1774:2: ( () otherlv_1= 'Void' )
            {
            // InternalCBS.g:1774:2: ( () otherlv_1= 'Void' )
            // InternalCBS.g:1775:3: () otherlv_1= 'Void'
            {
            // InternalCBS.g:1775:3: ()
            // InternalCBS.g:1776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidAccess().getVoidKeyword_1());
            		

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
    // $ANTLR end "ruleVoid"


    // $ANTLR start "entryRuleService"
    // InternalCBS.g:1790:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalCBS.g:1790:48: (iv_ruleService= ruleService EOF )
            // InternalCBS.g:1791:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalCBS.g:1797:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'implements' ( ( ruleEString ) ) otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAbstractAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAbstractAction ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1803:2: ( (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'implements' ( ( ruleEString ) ) otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAbstractAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAbstractAction ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalCBS.g:1804:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'implements' ( ( ruleEString ) ) otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAbstractAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAbstractAction ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalCBS.g:1804:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'implements' ( ( ruleEString ) ) otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAbstractAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAbstractAction ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalCBS.g:1805:3: otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'implements' ( ( ruleEString ) ) otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAbstractAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAbstractAction ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getImplementsKeyword_2());
            		
            // InternalCBS.g:1817:3: ( ( ruleEString ) )
            // InternalCBS.g:1818:4: ( ruleEString )
            {
            // InternalCBS.g:1818:4: ( ruleEString )
            // InternalCBS.g:1819:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getImplementsSignatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getActionsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalCBS.g:1841:3: ( (lv_actions_6_0= ruleAbstractAction ) )
            // InternalCBS.g:1842:4: (lv_actions_6_0= ruleAbstractAction )
            {
            // InternalCBS.g:1842:4: (lv_actions_6_0= ruleAbstractAction )
            // InternalCBS.g:1843:5: lv_actions_6_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_actions_6_0=ruleAbstractAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_6_0,
            						"org.xtext.example.mydsl.CBS.AbstractAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1860:3: (otherlv_7= ',' ( (lv_actions_8_0= ruleAbstractAction ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCBS.g:1861:4: otherlv_7= ',' ( (lv_actions_8_0= ruleAbstractAction ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_43); 

            	    				newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCBS.g:1865:4: ( (lv_actions_8_0= ruleAbstractAction ) )
            	    // InternalCBS.g:1866:5: (lv_actions_8_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:1866:5: (lv_actions_8_0= ruleAbstractAction )
            	    // InternalCBS.g:1867:6: lv_actions_8_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_actions_8_0=ruleAbstractAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_8_0,
            	    							"org.xtext.example.mydsl.CBS.AbstractAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleInternalAction"
    // InternalCBS.g:1897:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalCBS.g:1897:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalCBS.g:1898:2: iv_ruleInternalAction= ruleInternalAction EOF
            {
             newCompositeNode(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAction=ruleInternalAction();

            state._fsp--;

             current =iv_ruleInternalAction; 
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
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalCBS.g:1904:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCBS.g:1910:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalCBS.g:1911:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalCBS.g:1911:2: ( () otherlv_1= 'InternalAction' )
            // InternalCBS.g:1912:3: () otherlv_1= 'InternalAction'
            {
            // InternalCBS.g:1912:3: ()
            // InternalCBS.g:1913:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		

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
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCallAction"
    // InternalCBS.g:1927:1: entryRuleExternalCallAction returns [EObject current=null] : iv_ruleExternalCallAction= ruleExternalCallAction EOF ;
    public final EObject entryRuleExternalCallAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCallAction = null;


        try {
            // InternalCBS.g:1927:59: (iv_ruleExternalCallAction= ruleExternalCallAction EOF )
            // InternalCBS.g:1928:2: iv_ruleExternalCallAction= ruleExternalCallAction EOF
            {
             newCompositeNode(grammarAccess.getExternalCallActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCallAction=ruleExternalCallAction();

            state._fsp--;

             current =iv_ruleExternalCallAction; 
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
    // $ANTLR end "entryRuleExternalCallAction"


    // $ANTLR start "ruleExternalCallAction"
    // InternalCBS.g:1934:1: ruleExternalCallAction returns [EObject current=null] : (otherlv_0= 'ExternalCallAction' otherlv_1= '{' otherlv_2= 'requiredService' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleExternalCallAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCBS.g:1940:2: ( (otherlv_0= 'ExternalCallAction' otherlv_1= '{' otherlv_2= 'requiredService' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalCBS.g:1941:2: (otherlv_0= 'ExternalCallAction' otherlv_1= '{' otherlv_2= 'requiredService' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalCBS.g:1941:2: (otherlv_0= 'ExternalCallAction' otherlv_1= '{' otherlv_2= 'requiredService' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalCBS.g:1942:3: otherlv_0= 'ExternalCallAction' otherlv_1= '{' otherlv_2= 'requiredService' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallActionAccess().getExternalCallActionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallActionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallActionAccess().getRequiredServiceKeyword_2());
            		
            // InternalCBS.g:1954:3: ( ( ruleEString ) )
            // InternalCBS.g:1955:4: ( ruleEString )
            {
            // InternalCBS.g:1955:4: ( ruleEString )
            // InternalCBS.g:1956:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalCallActionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleExternalCallAction"


    // $ANTLR start "entryRuleBranchAction"
    // InternalCBS.g:1978:1: entryRuleBranchAction returns [EObject current=null] : iv_ruleBranchAction= ruleBranchAction EOF ;
    public final EObject entryRuleBranchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchAction = null;


        try {
            // InternalCBS.g:1978:53: (iv_ruleBranchAction= ruleBranchAction EOF )
            // InternalCBS.g:1979:2: iv_ruleBranchAction= ruleBranchAction EOF
            {
             newCompositeNode(grammarAccess.getBranchActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranchAction=ruleBranchAction();

            state._fsp--;

             current =iv_ruleBranchAction; 
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
    // $ANTLR end "entryRuleBranchAction"


    // $ANTLR start "ruleBranchAction"
    // InternalCBS.g:1985:1: ruleBranchAction returns [EObject current=null] : (otherlv_0= 'BranchAction' otherlv_1= '{' otherlv_2= 'branches' otherlv_3= '{' ( (lv_branches_4_0= ruleBranchTransition ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranchTransition ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleBranchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_branches_4_0 = null;

        EObject lv_branches_6_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1991:2: ( (otherlv_0= 'BranchAction' otherlv_1= '{' otherlv_2= 'branches' otherlv_3= '{' ( (lv_branches_4_0= ruleBranchTransition ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranchTransition ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalCBS.g:1992:2: (otherlv_0= 'BranchAction' otherlv_1= '{' otherlv_2= 'branches' otherlv_3= '{' ( (lv_branches_4_0= ruleBranchTransition ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranchTransition ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalCBS.g:1992:2: (otherlv_0= 'BranchAction' otherlv_1= '{' otherlv_2= 'branches' otherlv_3= '{' ( (lv_branches_4_0= ruleBranchTransition ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranchTransition ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalCBS.g:1993:3: otherlv_0= 'BranchAction' otherlv_1= '{' otherlv_2= 'branches' otherlv_3= '{' ( (lv_branches_4_0= ruleBranchTransition ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranchTransition ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchActionAccess().getBranchActionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchActionAccess().getBranchesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:2009:3: ( (lv_branches_4_0= ruleBranchTransition ) )
            // InternalCBS.g:2010:4: (lv_branches_4_0= ruleBranchTransition )
            {
            // InternalCBS.g:2010:4: (lv_branches_4_0= ruleBranchTransition )
            // InternalCBS.g:2011:5: lv_branches_4_0= ruleBranchTransition
            {

            					newCompositeNode(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_branches_4_0=ruleBranchTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchActionRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_4_0,
            						"org.xtext.example.mydsl.CBS.BranchTransition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2028:3: (otherlv_5= ',' ( (lv_branches_6_0= ruleBranchTransition ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCBS.g:2029:4: otherlv_5= ',' ( (lv_branches_6_0= ruleBranchTransition ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_46); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBranchActionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCBS.g:2033:4: ( (lv_branches_6_0= ruleBranchTransition ) )
            	    // InternalCBS.g:2034:5: (lv_branches_6_0= ruleBranchTransition )
            	    {
            	    // InternalCBS.g:2034:5: (lv_branches_6_0= ruleBranchTransition )
            	    // InternalCBS.g:2035:6: lv_branches_6_0= ruleBranchTransition
            	    {

            	    						newCompositeNode(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_branches_6_0=ruleBranchTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBranchActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_6_0,
            	    							"org.xtext.example.mydsl.CBS.BranchTransition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleBranchAction"


    // $ANTLR start "entryRuleLoopAction"
    // InternalCBS.g:2065:1: entryRuleLoopAction returns [EObject current=null] : iv_ruleLoopAction= ruleLoopAction EOF ;
    public final EObject entryRuleLoopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopAction = null;


        try {
            // InternalCBS.g:2065:51: (iv_ruleLoopAction= ruleLoopAction EOF )
            // InternalCBS.g:2066:2: iv_ruleLoopAction= ruleLoopAction EOF
            {
             newCompositeNode(grammarAccess.getLoopActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopAction=ruleLoopAction();

            state._fsp--;

             current =iv_ruleLoopAction; 
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
    // $ANTLR end "entryRuleLoopAction"


    // $ANTLR start "ruleLoopAction"
    // InternalCBS.g:2072:1: ruleLoopAction returns [EObject current=null] : ( () otherlv_1= 'LoopAction' otherlv_2= '{' (otherlv_3= 'bodyActions' otherlv_4= '{' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) (otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleLoopAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_bodyActions_5_0 = null;

        EObject lv_bodyActions_7_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2078:2: ( ( () otherlv_1= 'LoopAction' otherlv_2= '{' (otherlv_3= 'bodyActions' otherlv_4= '{' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) (otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalCBS.g:2079:2: ( () otherlv_1= 'LoopAction' otherlv_2= '{' (otherlv_3= 'bodyActions' otherlv_4= '{' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) (otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalCBS.g:2079:2: ( () otherlv_1= 'LoopAction' otherlv_2= '{' (otherlv_3= 'bodyActions' otherlv_4= '{' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) (otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalCBS.g:2080:3: () otherlv_1= 'LoopAction' otherlv_2= '{' (otherlv_3= 'bodyActions' otherlv_4= '{' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) (otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalCBS.g:2080:3: ()
            // InternalCBS.g:2081:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopActionAccess().getLoopActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopActionAccess().getLoopActionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:2095:3: (otherlv_3= 'bodyActions' otherlv_4= '{' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) (otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) ) )* otherlv_8= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==60) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCBS.g:2096:4: otherlv_3= 'bodyActions' otherlv_4= '{' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) (otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopActionAccess().getBodyActionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBS.g:2104:4: ( (lv_bodyActions_5_0= ruleAbstractAction ) )
                    // InternalCBS.g:2105:5: (lv_bodyActions_5_0= ruleAbstractAction )
                    {
                    // InternalCBS.g:2105:5: (lv_bodyActions_5_0= ruleAbstractAction )
                    // InternalCBS.g:2106:6: lv_bodyActions_5_0= ruleAbstractAction
                    {

                    						newCompositeNode(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_bodyActions_5_0=ruleAbstractAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopActionRule());
                    						}
                    						add(
                    							current,
                    							"bodyActions",
                    							lv_bodyActions_5_0,
                    							"org.xtext.example.mydsl.CBS.AbstractAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2123:4: (otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalCBS.g:2124:5: otherlv_6= ',' ( (lv_bodyActions_7_0= ruleAbstractAction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLoopActionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBS.g:2128:5: ( (lv_bodyActions_7_0= ruleAbstractAction ) )
                    	    // InternalCBS.g:2129:6: (lv_bodyActions_7_0= ruleAbstractAction )
                    	    {
                    	    // InternalCBS.g:2129:6: (lv_bodyActions_7_0= ruleAbstractAction )
                    	    // InternalCBS.g:2130:7: lv_bodyActions_7_0= ruleAbstractAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_bodyActions_7_0=ruleAbstractAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bodyActions",
                    	    								lv_bodyActions_7_0,
                    	    								"org.xtext.example.mydsl.CBS.AbstractAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLoopAction"


    // $ANTLR start "entryRuleBranchTransition"
    // InternalCBS.g:2161:1: entryRuleBranchTransition returns [EObject current=null] : iv_ruleBranchTransition= ruleBranchTransition EOF ;
    public final EObject entryRuleBranchTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchTransition = null;


        try {
            // InternalCBS.g:2161:57: (iv_ruleBranchTransition= ruleBranchTransition EOF )
            // InternalCBS.g:2162:2: iv_ruleBranchTransition= ruleBranchTransition EOF
            {
             newCompositeNode(grammarAccess.getBranchTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranchTransition=ruleBranchTransition();

            state._fsp--;

             current =iv_ruleBranchTransition; 
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
    // $ANTLR end "entryRuleBranchTransition"


    // $ANTLR start "ruleBranchTransition"
    // InternalCBS.g:2168:1: ruleBranchTransition returns [EObject current=null] : (otherlv_0= 'BranchTransition' otherlv_1= '{' (otherlv_2= 'branchCondition' ( (lv_branchCondition_3_0= ruleEString ) ) )? otherlv_4= 'action' ( (lv_action_5_0= ruleAbstractAction ) ) otherlv_6= '}' ) ;
    public final EObject ruleBranchTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_branchCondition_3_0 = null;

        EObject lv_action_5_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2174:2: ( (otherlv_0= 'BranchTransition' otherlv_1= '{' (otherlv_2= 'branchCondition' ( (lv_branchCondition_3_0= ruleEString ) ) )? otherlv_4= 'action' ( (lv_action_5_0= ruleAbstractAction ) ) otherlv_6= '}' ) )
            // InternalCBS.g:2175:2: (otherlv_0= 'BranchTransition' otherlv_1= '{' (otherlv_2= 'branchCondition' ( (lv_branchCondition_3_0= ruleEString ) ) )? otherlv_4= 'action' ( (lv_action_5_0= ruleAbstractAction ) ) otherlv_6= '}' )
            {
            // InternalCBS.g:2175:2: (otherlv_0= 'BranchTransition' otherlv_1= '{' (otherlv_2= 'branchCondition' ( (lv_branchCondition_3_0= ruleEString ) ) )? otherlv_4= 'action' ( (lv_action_5_0= ruleAbstractAction ) ) otherlv_6= '}' )
            // InternalCBS.g:2176:3: otherlv_0= 'BranchTransition' otherlv_1= '{' (otherlv_2= 'branchCondition' ( (lv_branchCondition_3_0= ruleEString ) ) )? otherlv_4= 'action' ( (lv_action_5_0= ruleAbstractAction ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchTransitionAccess().getBranchTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCBS.g:2184:3: (otherlv_2= 'branchCondition' ( (lv_branchCondition_3_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==62) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCBS.g:2185:4: otherlv_2= 'branchCondition' ( (lv_branchCondition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBranchTransitionAccess().getBranchConditionKeyword_2_0());
                    			
                    // InternalCBS.g:2189:4: ( (lv_branchCondition_3_0= ruleEString ) )
                    // InternalCBS.g:2190:5: (lv_branchCondition_3_0= ruleEString )
                    {
                    // InternalCBS.g:2190:5: (lv_branchCondition_3_0= ruleEString )
                    // InternalCBS.g:2191:6: lv_branchCondition_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBranchTransitionAccess().getBranchConditionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_branchCondition_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchTransitionRule());
                    						}
                    						set(
                    							current,
                    							"branchCondition",
                    							lv_branchCondition_3_0,
                    							"org.xtext.example.mydsl.CBS.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,63,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getBranchTransitionAccess().getActionKeyword_3());
            		
            // InternalCBS.g:2213:3: ( (lv_action_5_0= ruleAbstractAction ) )
            // InternalCBS.g:2214:4: (lv_action_5_0= ruleAbstractAction )
            {
            // InternalCBS.g:2214:4: (lv_action_5_0= ruleAbstractAction )
            // InternalCBS.g:2215:5: lv_action_5_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getBranchTransitionAccess().getActionAbstractActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_action_5_0=ruleAbstractAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchTransitionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_5_0,
            						"org.xtext.example.mydsl.CBS.AbstractAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBranchTransitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBranchTransition"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalCBS.g:2240:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalCBS.g:2240:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalCBS.g:2241:2: iv_ruleAllocationContext= ruleAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationContext=ruleAllocationContext();

            state._fsp--;

             current =iv_ruleAllocationContext; 
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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalCBS.g:2247:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'allocates' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalCBS.g:2253:2: ( (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'allocates' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalCBS.g:2254:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'allocates' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalCBS.g:2254:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'allocates' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalCBS.g:2255:3: otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'allocates' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getContainerKeyword_2());
            		
            // InternalCBS.g:2267:3: ( ( ruleEString ) )
            // InternalCBS.g:2268:4: ( ruleEString )
            {
            // InternalCBS.g:2268:4: ( ruleEString )
            // InternalCBS.g:2269:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0());
            				
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocationContextAccess().getAllocatesKeyword_4());
            		
            // InternalCBS.g:2287:3: ( ( ruleEString ) )
            // InternalCBS.g:2288:4: ( ruleEString )
            {
            // InternalCBS.g:2288:4: ( ruleEString )
            // InternalCBS.g:2289:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleContainer"
    // InternalCBS.g:2311:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalCBS.g:2311:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalCBS.g:2312:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalCBS.g:2318:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2324:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCBS.g:2325:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCBS.g:2325:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCBS.g:2326:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCBS.g:2326:3: ()
            // InternalCBS.g:2327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalCBS.g:2337:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:2338:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:2338:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:2339:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLinker"
    // InternalCBS.g:2360:1: entryRuleLinker returns [EObject current=null] : iv_ruleLinker= ruleLinker EOF ;
    public final EObject entryRuleLinker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinker = null;


        try {
            // InternalCBS.g:2360:47: (iv_ruleLinker= ruleLinker EOF )
            // InternalCBS.g:2361:2: iv_ruleLinker= ruleLinker EOF
            {
             newCompositeNode(grammarAccess.getLinkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinker=ruleLinker();

            state._fsp--;

             current =iv_ruleLinker; 
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
    // $ANTLR end "entryRuleLinker"


    // $ANTLR start "ruleLinker"
    // InternalCBS.g:2367:1: ruleLinker returns [EObject current=null] : (otherlv_0= 'Linker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleLinker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2373:2: ( (otherlv_0= 'Linker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalCBS.g:2374:2: (otherlv_0= 'Linker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalCBS.g:2374:2: (otherlv_0= 'Linker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalCBS.g:2375:3: otherlv_0= 'Linker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkerAccess().getLinkerKeyword_0());
            		
            // InternalCBS.g:2379:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:2380:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:2380:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:2381:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,69,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkerAccess().getLinksKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkerAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCBS.g:2410:3: ( ( ruleEString ) )
            // InternalCBS.g:2411:4: ( ruleEString )
            {
            // InternalCBS.g:2411:4: ( ruleEString )
            // InternalCBS.g:2412:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2426:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==14) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCBS.g:2427:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkerAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCBS.g:2431:4: ( ( ruleEString ) )
            	    // InternalCBS.g:2432:5: ( ruleEString )
            	    {
            	    // InternalCBS.g:2432:5: ( ruleEString )
            	    // InternalCBS.g:2433:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkerRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_8=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkerAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkerAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLinker"


    // $ANTLR start "ruleSimpleTypeEnum"
    // InternalCBS.g:2460:1: ruleSimpleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) ) ;
    public final Enumerator ruleSimpleTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalCBS.g:2466:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) ) )
            // InternalCBS.g:2467:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) )
            {
            // InternalCBS.g:2467:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) )
            int alt33=8;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt33=1;
                }
                break;
            case 71:
                {
                alt33=2;
                }
                break;
            case 72:
                {
                alt33=3;
                }
                break;
            case 73:
                {
                alt33=4;
                }
                break;
            case 74:
                {
                alt33=5;
                }
                break;
            case 75:
                {
                alt33=6;
                }
                break;
            case 76:
                {
                alt33=7;
                }
                break;
            case 77:
                {
                alt33=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalCBS.g:2468:3: (enumLiteral_0= 'String' )
                    {
                    // InternalCBS.g:2468:3: (enumLiteral_0= 'String' )
                    // InternalCBS.g:2469:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:2476:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalCBS.g:2476:3: (enumLiteral_1= 'Int' )
                    // InternalCBS.g:2477:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCBS.g:2484:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalCBS.g:2484:3: (enumLiteral_2= 'Boolean' )
                    // InternalCBS.g:2485:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCBS.g:2492:3: (enumLiteral_3= 'Char' )
                    {
                    // InternalCBS.g:2492:3: (enumLiteral_3= 'Char' )
                    // InternalCBS.g:2493:4: enumLiteral_3= 'Char'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCBS.g:2500:3: (enumLiteral_4= 'Date' )
                    {
                    // InternalCBS.g:2500:3: (enumLiteral_4= 'Date' )
                    // InternalCBS.g:2501:4: enumLiteral_4= 'Date'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCBS.g:2508:3: (enumLiteral_5= 'Double' )
                    {
                    // InternalCBS.g:2508:3: (enumLiteral_5= 'Double' )
                    // InternalCBS.g:2509:4: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCBS.g:2516:3: (enumLiteral_6= 'Float' )
                    {
                    // InternalCBS.g:2516:3: (enumLiteral_6= 'Float' )
                    // InternalCBS.g:2517:4: enumLiteral_6= 'Float'
                    {
                    enumLiteral_6=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCBS.g:2524:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalCBS.g:2524:3: (enumLiteral_7= 'Long' )
                    // InternalCBS.g:2525:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleSimpleTypeEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F2000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000019000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000018000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003FC0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0AC0000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});

}