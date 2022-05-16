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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'childContexts='", "','", "'}'", "'assemblyConnectors='", "'requiredDelegationConnectors='", "'providedDelegationConnectors='", "'allocation='", "'env='", "'allocationContexts='", "'container'", "'allocates'", "'link'", "'('", "')'", "'instance'", "'provide'", "'require'", "'AtomicComponent'", "'requires'", "'provides'", "'services'", "'type'", "':'", "'Void'", "'<'", "'>'", "'Service'", "';'", "'internalCall'", "'externalCall'", "'branch'", "'?'", "'loop'", "'String'", "'Int'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'Long'", "'List'", "'Map'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalCBS.g:72:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' ) ;
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
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_childContexts_5_0 = null;

        EObject lv_childContexts_7_0 = null;

        EObject lv_assemblyConnectors_11_0 = null;

        EObject lv_assemblyConnectors_13_0 = null;

        EObject lv_requiredDelegationConnectors_17_0 = null;

        EObject lv_requiredDelegationConnectors_19_0 = null;

        EObject lv_providedDelegationConnectors_23_0 = null;

        EObject lv_providedDelegationConnectors_25_0 = null;

        EObject lv_allocation_29_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:78:2: ( (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' ) )
            // InternalCBS.g:79:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalCBS.g:79:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' )
            // InternalCBS.g:80:3: otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}'
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
            		
            // InternalCBS.g:107:3: (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCBS.g:108:4: otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getChildContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBS.g:116:4: ( (lv_childContexts_5_0= ruleAssemblyContext ) )
                    // InternalCBS.g:117:5: (lv_childContexts_5_0= ruleAssemblyContext )
                    {
                    // InternalCBS.g:117:5: (lv_childContexts_5_0= ruleAssemblyContext )
                    // InternalCBS.g:118:6: lv_childContexts_5_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBS.g:140:5: ( (lv_childContexts_7_0= ruleAssemblyContext ) )
                    	    // InternalCBS.g:141:6: (lv_childContexts_7_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCBS.g:141:6: (lv_childContexts_7_0= ruleAssemblyContext )
                    	    // InternalCBS.g:142:7: lv_childContexts_7_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:165:3: (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCBS.g:166:4: otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:174:4: ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) )
                    // InternalCBS.g:175:5: (lv_assemblyConnectors_11_0= ruleAssemblyConnector )
                    {
                    // InternalCBS.g:175:5: (lv_assemblyConnectors_11_0= ruleAssemblyConnector )
                    // InternalCBS.g:176:6: lv_assemblyConnectors_11_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
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
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:198:5: ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) )
                    	    // InternalCBS.g:199:6: (lv_assemblyConnectors_13_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalCBS.g:199:6: (lv_assemblyConnectors_13_0= ruleAssemblyConnector )
                    	    // InternalCBS.g:200:7: lv_assemblyConnectors_13_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:223:3: (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCBS.g:224:4: otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getRequiredDelegationConnectorsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:232:4: ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) )
                    // InternalCBS.g:233:5: (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector )
                    {
                    // InternalCBS.g:233:5: (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector )
                    // InternalCBS.g:234:6: lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
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
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:256:5: ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) )
                    	    // InternalCBS.g:257:6: (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector )
                    	    {
                    	    // InternalCBS.g:257:6: (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector )
                    	    // InternalCBS.g:258:7: lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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

                    otherlv_20=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:281:3: (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCBS.g:282:4: otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getProvidedDelegationConnectorsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:290:4: ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) )
                    // InternalCBS.g:291:5: (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector )
                    {
                    // InternalCBS.g:291:5: (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector )
                    // InternalCBS.g:292:6: lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
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
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:314:5: ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) )
                    	    // InternalCBS.g:315:6: (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector )
                    	    {
                    	    // InternalCBS.g:315:6: (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector )
                    	    // InternalCBS.g:316:7: lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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

                    otherlv_26=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_26, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_27, grammarAccess.getSystemAccess().getAllocationKeyword_7());
            		
            otherlv_28=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_28, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalCBS.g:347:3: ( (lv_allocation_29_0= ruleAllocation ) )
            // InternalCBS.g:348:4: (lv_allocation_29_0= ruleAllocation )
            {
            // InternalCBS.g:348:4: (lv_allocation_29_0= ruleAllocation )
            // InternalCBS.g:349:5: lv_allocation_29_0= ruleAllocation
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getAllocationAllocationParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_13);
            lv_allocation_29_0=ruleAllocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"allocation",
            						lv_allocation_29_0,
            						"org.xtext.example.mydsl.CBS.Allocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_30=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_30, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleAllocation"
    // InternalCBS.g:378:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalCBS.g:378:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalCBS.g:379:2: iv_ruleAllocation= ruleAllocation EOF
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
    // InternalCBS.g:385:1: ruleAllocation returns [EObject current=null] : (otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_allocationContexts_4_0 = null;

        EObject lv_allocationContexts_6_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:391:2: ( (otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? ) )
            // InternalCBS.g:392:2: (otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? )
            {
            // InternalCBS.g:392:2: (otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? )
            // InternalCBS.g:393:3: otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationAccess().getEnvKeyword_0());
            		
            // InternalCBS.g:397:3: ( ( ruleEString ) )
            // InternalCBS.g:398:4: ( ruleEString )
            {
            // InternalCBS.g:398:4: ( ruleEString )
            // InternalCBS.g:399:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:413:3: (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCBS.g:414:4: otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalCBS.g:422:4: ( (lv_allocationContexts_4_0= ruleAllocationContext ) )
                    // InternalCBS.g:423:5: (lv_allocationContexts_4_0= ruleAllocationContext )
                    {
                    // InternalCBS.g:423:5: (lv_allocationContexts_4_0= ruleAllocationContext )
                    // InternalCBS.g:424:6: lv_allocationContexts_4_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_allocationContexts_4_0=ruleAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocationRule());
                    						}
                    						add(
                    							current,
                    							"allocationContexts",
                    							lv_allocationContexts_4_0,
                    							"org.xtext.example.mydsl.CBS.AllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:441:4: (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCBS.g:442:5: otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalCBS.g:446:5: ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
                    	    // InternalCBS.g:447:6: (lv_allocationContexts_6_0= ruleAllocationContext )
                    	    {
                    	    // InternalCBS.g:447:6: (lv_allocationContexts_6_0= ruleAllocationContext )
                    	    // InternalCBS.g:448:7: lv_allocationContexts_6_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_2_4());
                    			

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
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalCBS.g:475:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalCBS.g:475:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalCBS.g:476:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalCBS.g:482:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCBS.g:488:2: ( (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:489:2: (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:489:2: (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:490:3: otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getContainerKeyword_1());
            		
            // InternalCBS.g:498:3: ( ( ruleEString ) )
            // InternalCBS.g:499:4: ( ruleEString )
            {
            // InternalCBS.g:499:4: ( ruleEString )
            // InternalCBS.g:500:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_2_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAllocatesKeyword_3());
            		
            // InternalCBS.g:518:3: ( ( ruleEString ) )
            // InternalCBS.g:519:4: ( ruleEString )
            {
            // InternalCBS.g:519:4: ( ruleEString )
            // InternalCBS.g:520:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalCBS.g:542:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalCBS.g:542:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalCBS.g:543:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalCBS.g:549:1: ruleContainer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:555:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCBS.g:556:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCBS.g:556:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalCBS.g:557:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCBS.g:557:3: ()
            // InternalCBS.g:558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            // InternalCBS.g:564:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:565:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:565:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:566:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalCBS.g:587:1: entryRuleLinker returns [EObject current=null] : iv_ruleLinker= ruleLinker EOF ;
    public final EObject entryRuleLinker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinker = null;


        try {
            // InternalCBS.g:587:47: (iv_ruleLinker= ruleLinker EOF )
            // InternalCBS.g:588:2: iv_ruleLinker= ruleLinker EOF
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
    // InternalCBS.g:594:1: ruleLinker returns [EObject current=null] : (otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleLinker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCBS.g:600:2: ( (otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            // InternalCBS.g:601:2: (otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            {
            // InternalCBS.g:601:2: (otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            // InternalCBS.g:602:3: otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkerAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCBS.g:610:3: ( ( ruleEString ) )
            // InternalCBS.g:611:4: ( ruleEString )
            {
            // InternalCBS.g:611:4: ( ruleEString )
            // InternalCBS.g:612:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:626:3: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCBS.g:627:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLinkerAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCBS.g:631:4: ( ( ruleEString ) )
            	    // InternalCBS.g:632:5: ( ruleEString )
            	    {
            	    // InternalCBS.g:632:5: ( ruleEString )
            	    // InternalCBS.g:633:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkerRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLinkerAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalCBS.g:656:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalCBS.g:656:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalCBS.g:657:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalCBS.g:663:1: ruleAssemblyContext returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_providedRoles_6_0 = null;

        EObject lv_providedRoles_8_0 = null;

        EObject lv_requiredRoles_12_0 = null;

        EObject lv_requiredRoles_14_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:669:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalCBS.g:670:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalCBS.g:670:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalCBS.g:671:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalCBS.g:671:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:672:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:672:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:673:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getInstanceKeyword_2());
            		
            // InternalCBS.g:698:3: ( ( ruleEString ) )
            // InternalCBS.g:699:4: ( ruleEString )
            {
            // InternalCBS.g:699:4: ( ruleEString )
            // InternalCBS.g:700:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentCrossReference_3_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:714:3: (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCBS.g:715:4: otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssemblyContextAccess().getProvideKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalCBS.g:723:4: ( (lv_providedRoles_6_0= ruleProvidedRole ) )
                    // InternalCBS.g:724:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    {
                    // InternalCBS.g:724:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    // InternalCBS.g:725:6: lv_providedRoles_6_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_providedRoles_6_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_6_0,
                    							"org.xtext.example.mydsl.CBS.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:742:4: (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCBS.g:743:5: otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAssemblyContextAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:747:5: ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    // InternalCBS.g:748:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    {
                    	    // InternalCBS.g:748:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    // InternalCBS.g:749:7: lv_providedRoles_8_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_providedRoles_8_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_8_0,
                    	    								"org.xtext.example.mydsl.CBS.ProvidedRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:772:3: (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCBS.g:773:4: otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getRequireKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalCBS.g:781:4: ( (lv_requiredRoles_12_0= ruleRequiredRole ) )
                    // InternalCBS.g:782:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    {
                    // InternalCBS.g:782:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    // InternalCBS.g:783:6: lv_requiredRoles_12_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_requiredRoles_12_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_12_0,
                    							"org.xtext.example.mydsl.CBS.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:800:4: (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCBS.g:801:5: otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:805:5: ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    // InternalCBS.g:806:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    {
                    	    // InternalCBS.g:806:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    // InternalCBS.g:807:7: lv_requiredRoles_14_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_requiredRoles_14_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_14_0,
                    	    								"org.xtext.example.mydsl.CBS.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalCBS.g:838:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalCBS.g:838:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalCBS.g:839:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalCBS.g:845:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCBS.g:851:2: ( (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' ) )
            // InternalCBS.g:852:2: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' )
            {
            // InternalCBS.g:852:2: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' )
            // InternalCBS.g:853:3: otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getLeftParenthesisKeyword_0());
            		
            // InternalCBS.g:857:3: ( ( ruleEString ) )
            // InternalCBS.g:858:4: ( ruleEString )
            {
            // InternalCBS.g:858:4: ( ruleEString )
            // InternalCBS.g:859:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleCrossReference_1_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getCommaKeyword_2());
            		
            // InternalCBS.g:877:3: ( ( ruleEString ) )
            // InternalCBS.g:878:4: ( ruleEString )
            {
            // InternalCBS.g:878:4: ( ruleEString )
            // InternalCBS.g:879:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleCrossReference_3_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAssemblyConnectorAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalCBS.g:901:1: entryRuleRequiredDelegationConnector returns [EObject current=null] : iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF ;
    public final EObject entryRuleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredDelegationConnector = null;


        try {
            // InternalCBS.g:901:68: (iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF )
            // InternalCBS.g:902:2: iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF
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
    // InternalCBS.g:908:1: ruleRequiredDelegationConnector returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCBS.g:914:2: ( ( ( ruleEString ) ) )
            // InternalCBS.g:915:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:915:2: ( ( ruleEString ) )
            // InternalCBS.g:916:3: ( ruleEString )
            {
            // InternalCBS.g:916:3: ( ruleEString )
            // InternalCBS.g:917:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            				}
            			

            				newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleRequiredRoleCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleRequiredDelegationConnector"


    // $ANTLR start "entryRuleProvidedDelegationConnector"
    // InternalCBS.g:934:1: entryRuleProvidedDelegationConnector returns [EObject current=null] : iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF ;
    public final EObject entryRuleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedDelegationConnector = null;


        try {
            // InternalCBS.g:934:68: (iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF )
            // InternalCBS.g:935:2: iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF
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
    // InternalCBS.g:941:1: ruleProvidedDelegationConnector returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCBS.g:947:2: ( ( ( ruleEString ) ) )
            // InternalCBS.g:948:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:948:2: ( ( ruleEString ) )
            // InternalCBS.g:949:3: ( ruleEString )
            {
            // InternalCBS.g:949:3: ( ruleEString )
            // InternalCBS.g:950:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            				}
            			

            				newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleProvidedRoleCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleProvidedDelegationConnector"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalCBS.g:967:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCBS.g:967:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCBS.g:968:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalCBS.g:974:1: ruleProvidedRole returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCBS.g:980:2: ( ( ( ruleEString ) ) )
            // InternalCBS.g:981:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:981:2: ( ( ruleEString ) )
            // InternalCBS.g:982:3: ( ruleEString )
            {
            // InternalCBS.g:982:3: ( ruleEString )
            // InternalCBS.g:983:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProvidedRoleRule());
            				}
            			

            				newCompositeNode(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalCBS.g:1000:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCBS.g:1000:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCBS.g:1001:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalCBS.g:1007:1: ruleRequiredRole returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCBS.g:1013:2: ( ( ( ruleEString ) ) )
            // InternalCBS.g:1014:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:1014:2: ( ( ruleEString ) )
            // InternalCBS.g:1015:3: ( ruleEString )
            {
            // InternalCBS.g:1015:3: ( ruleEString )
            // InternalCBS.g:1016:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRequiredRoleRule());
            				}
            			

            				newCompositeNode(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleAtomicComponent"
    // InternalCBS.g:1033:1: entryRuleAtomicComponent returns [EObject current=null] : iv_ruleAtomicComponent= ruleAtomicComponent EOF ;
    public final EObject entryRuleAtomicComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicComponent = null;


        try {
            // InternalCBS.g:1033:56: (iv_ruleAtomicComponent= ruleAtomicComponent EOF )
            // InternalCBS.g:1034:2: iv_ruleAtomicComponent= ruleAtomicComponent EOF
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
    // InternalCBS.g:1040:1: ruleAtomicComponent returns [EObject current=null] : ( () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // InternalCBS.g:1046:2: ( ( () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalCBS.g:1047:2: ( () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalCBS.g:1047:2: ( () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalCBS.g:1048:3: () otherlv_1= 'AtomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalCBS.g:1048:3: ()
            // InternalCBS.g:1049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicComponentAccess().getAtomicComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicComponentAccess().getAtomicComponentKeyword_1());
            		
            // InternalCBS.g:1059:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:1060:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:1060:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:1061:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:1082:3: (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCBS.g:1083:4: otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicComponentAccess().getRequiresKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:1091:4: ( ( ruleEString ) )
                    // InternalCBS.g:1092:5: ( ruleEString )
                    {
                    // InternalCBS.g:1092:5: ( ruleEString )
                    // InternalCBS.g:1093:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1107:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCBS.g:1108:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAtomicComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:1112:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:1113:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:1113:6: ( ruleEString )
                    	    // InternalCBS.g:1114:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1134:3: (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCBS.g:1135:4: otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getAtomicComponentAccess().getProvidesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:1143:4: ( ( ruleEString ) )
                    // InternalCBS.g:1144:5: ( ruleEString )
                    {
                    // InternalCBS.g:1144:5: ( ruleEString )
                    // InternalCBS.g:1145:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1159:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCBS.g:1160:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAtomicComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:1164:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:1165:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:1165:6: ( ruleEString )
                    	    // InternalCBS.g:1166:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1186:3: (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCBS.g:1187:4: otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getAtomicComponentAccess().getServicesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_17, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:1195:4: ( (lv_services_18_0= ruleService ) )
                    // InternalCBS.g:1196:5: (lv_services_18_0= ruleService )
                    {
                    // InternalCBS.g:1196:5: (lv_services_18_0= ruleService )
                    // InternalCBS.g:1197:6: lv_services_18_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalCBS.g:1214:4: (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalCBS.g:1215:5: otherlv_19= ',' ( (lv_services_20_0= ruleService ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getAtomicComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:1219:5: ( (lv_services_20_0= ruleService ) )
                    	    // InternalCBS.g:1220:6: (lv_services_20_0= ruleService )
                    	    {
                    	    // InternalCBS.g:1220:6: (lv_services_20_0= ruleService )
                    	    // InternalCBS.g:1221:7: lv_services_20_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_13); 

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
    // InternalCBS.g:1252:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalCBS.g:1252:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalCBS.g:1253:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalCBS.g:1259:1: ruleSignature returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1265:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // InternalCBS.g:1266:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // InternalCBS.g:1266:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // InternalCBS.g:1267:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            // InternalCBS.g:1267:3: ( ( ruleEString ) )
            // InternalCBS.g:1268:4: ( ruleEString )
            {
            // InternalCBS.g:1268:4: ( ruleEString )
            // InternalCBS.g:1269:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1283:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:1284:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:1284:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:1285:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalCBS.g:1302:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCBS.g:1303:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalCBS.g:1307:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalCBS.g:1308:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalCBS.g:1308:5: (lv_parameters_3_0= ruleParameter )
                    // InternalCBS.g:1309:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"org.xtext.example.mydsl.CBS.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1326:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCBS.g:1327:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalCBS.g:1331:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalCBS.g:1332:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalCBS.g:1332:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalCBS.g:1333:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"org.xtext.example.mydsl.CBS.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalCBS.g:1360:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCBS.g:1360:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCBS.g:1361:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCBS.g:1367:1: ruleParameter returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1373:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCBS.g:1374:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCBS.g:1374:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalCBS.g:1375:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCBS.g:1375:3: ( ( ruleEString ) )
            // InternalCBS.g:1376:4: ( ruleEString )
            {
            // InternalCBS.g:1376:4: ( ruleEString )
            // InternalCBS.g:1377:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1391:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:1392:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:1392:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:1393:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalCBS.g:1414:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalCBS.g:1414:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalCBS.g:1415:2: iv_ruleSimpleType= ruleSimpleType EOF
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
    // InternalCBS.g:1421:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1427:2: ( (otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) ) ) )
            // InternalCBS.g:1428:2: (otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) ) )
            {
            // InternalCBS.g:1428:2: (otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) ) )
            // InternalCBS.g:1429:3: otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0());
            		
            // InternalCBS.g:1433:3: ( (lv_type_1_0= ruleSimpleTypeEnum ) )
            // InternalCBS.g:1434:4: (lv_type_1_0= ruleSimpleTypeEnum )
            {
            // InternalCBS.g:1434:4: (lv_type_1_0= ruleSimpleTypeEnum )
            // InternalCBS.g:1435:5: lv_type_1_0= ruleSimpleTypeEnum
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleSimpleTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.mydsl.CBS.SimpleTypeEnum");
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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleComplexType"
    // InternalCBS.g:1456:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalCBS.g:1456:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalCBS.g:1457:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalCBS.g:1463:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'type' otherlv_2= '{' ( ( (lv_members_3_0= ruleComplexMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1469:2: ( ( () otherlv_1= 'type' otherlv_2= '{' ( ( (lv_members_3_0= ruleComplexMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) ) )* )? otherlv_6= '}' ) )
            // InternalCBS.g:1470:2: ( () otherlv_1= 'type' otherlv_2= '{' ( ( (lv_members_3_0= ruleComplexMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) ) )* )? otherlv_6= '}' )
            {
            // InternalCBS.g:1470:2: ( () otherlv_1= 'type' otherlv_2= '{' ( ( (lv_members_3_0= ruleComplexMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) ) )* )? otherlv_6= '}' )
            // InternalCBS.g:1471:3: () otherlv_1= 'type' otherlv_2= '{' ( ( (lv_members_3_0= ruleComplexMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) ) )* )? otherlv_6= '}'
            {
            // InternalCBS.g:1471:3: ()
            // InternalCBS.g:1472:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:1486:3: ( ( (lv_members_3_0= ruleComplexMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCBS.g:1487:4: ( (lv_members_3_0= ruleComplexMember ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) ) )*
                    {
                    // InternalCBS.g:1487:4: ( (lv_members_3_0= ruleComplexMember ) )
                    // InternalCBS.g:1488:5: (lv_members_3_0= ruleComplexMember )
                    {
                    // InternalCBS.g:1488:5: (lv_members_3_0= ruleComplexMember )
                    // InternalCBS.g:1489:6: lv_members_3_0= ruleComplexMember
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_members_3_0=ruleComplexMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_3_0,
                    							"org.xtext.example.mydsl.CBS.ComplexMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1506:4: (otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCBS.g:1507:5: otherlv_4= ',' ( (lv_members_5_0= ruleComplexMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getComplexTypeAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCBS.g:1511:5: ( (lv_members_5_0= ruleComplexMember ) )
                    	    // InternalCBS.g:1512:6: (lv_members_5_0= ruleComplexMember )
                    	    {
                    	    // InternalCBS.g:1512:6: (lv_members_5_0= ruleComplexMember )
                    	    // InternalCBS.g:1513:7: lv_members_5_0= ruleComplexMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalCBS.g:1540:1: entryRuleComplexMember returns [EObject current=null] : iv_ruleComplexMember= ruleComplexMember EOF ;
    public final EObject entryRuleComplexMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMember = null;


        try {
            // InternalCBS.g:1540:54: (iv_ruleComplexMember= ruleComplexMember EOF )
            // InternalCBS.g:1541:2: iv_ruleComplexMember= ruleComplexMember EOF
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
    // InternalCBS.g:1547:1: ruleComplexMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleComplexMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1553:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) )
            // InternalCBS.g:1554:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            {
            // InternalCBS.g:1554:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            // InternalCBS.g:1555:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )
            {
            // InternalCBS.g:1555:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:1556:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:1556:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:1557:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexMemberAccess().getColonKeyword_1());
            		
            // InternalCBS.g:1578:3: ( ( ruleEString ) )
            // InternalCBS.g:1579:4: ( ruleEString )
            {
            // InternalCBS.g:1579:4: ( ruleEString )
            // InternalCBS.g:1580:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComplexMemberAccess().getTypeParameterTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleComplexMember"


    // $ANTLR start "entryRuleVoid"
    // InternalCBS.g:1598:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalCBS.g:1598:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalCBS.g:1599:2: iv_ruleVoid= ruleVoid EOF
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
    // InternalCBS.g:1605:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCBS.g:1611:2: ( ( () otherlv_1= 'Void' ) )
            // InternalCBS.g:1612:2: ( () otherlv_1= 'Void' )
            {
            // InternalCBS.g:1612:2: ( () otherlv_1= 'Void' )
            // InternalCBS.g:1613:3: () otherlv_1= 'Void'
            {
            // InternalCBS.g:1613:3: ()
            // InternalCBS.g:1614:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCollectionType"
    // InternalCBS.g:1628:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalCBS.g:1628:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalCBS.g:1629:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType; 
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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalCBS.g:1635:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1641:2: ( ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ) )
            // InternalCBS.g:1642:2: ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' )
            {
            // InternalCBS.g:1642:2: ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' )
            // InternalCBS.g:1643:3: ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>'
            {
            // InternalCBS.g:1643:3: ( (lv_type_0_0= ruleCollectionTypeEnum ) )
            // InternalCBS.g:1644:4: (lv_type_0_0= ruleCollectionTypeEnum )
            {
            // InternalCBS.g:1644:4: (lv_type_0_0= ruleCollectionTypeEnum )
            // InternalCBS.g:1645:5: lv_type_0_0= ruleCollectionTypeEnum
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getTypeCollectionTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_type_0_0=ruleCollectionTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.CBS.CollectionTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalCBS.g:1666:3: ( ( ruleEString ) )
            // InternalCBS.g:1667:4: ( ruleEString )
            {
            // InternalCBS.g:1667:4: ( ruleEString )
            // InternalCBS.g:1668:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getInnerTypeParameterTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleAbstractAction"
    // InternalCBS.g:1690:1: entryRuleAbstractAction returns [EObject current=null] : iv_ruleAbstractAction= ruleAbstractAction EOF ;
    public final EObject entryRuleAbstractAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAction = null;


        try {
            // InternalCBS.g:1690:55: (iv_ruleAbstractAction= ruleAbstractAction EOF )
            // InternalCBS.g:1691:2: iv_ruleAbstractAction= ruleAbstractAction EOF
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
    // InternalCBS.g:1697:1: ruleAbstractAction returns [EObject current=null] : (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction ) ;
    public final EObject ruleAbstractAction() throws RecognitionException {
        EObject current = null;

        EObject this_InternalAction_0 = null;

        EObject this_ExternalCallAction_1 = null;

        EObject this_BranchAction_2 = null;

        EObject this_LoopAction_3 = null;



        	enterRule();

        try {
            // InternalCBS.g:1703:2: ( (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction ) )
            // InternalCBS.g:1704:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction )
            {
            // InternalCBS.g:1704:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt26=1;
                }
                break;
            case 42:
                {
                alt26=2;
                }
                break;
            case 43:
                {
                alt26=3;
                }
                break;
            case 45:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalCBS.g:1705:3: this_InternalAction_0= ruleInternalAction
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
                    // InternalCBS.g:1714:3: this_ExternalCallAction_1= ruleExternalCallAction
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
                    // InternalCBS.g:1723:3: this_BranchAction_2= ruleBranchAction
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
                    // InternalCBS.g:1732:3: this_LoopAction_3= ruleLoopAction
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


    // $ANTLR start "entryRuleService"
    // InternalCBS.g:1744:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalCBS.g:1744:48: (iv_ruleService= ruleService EOF )
            // InternalCBS.g:1745:2: iv_ruleService= ruleService EOF
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
    // InternalCBS.g:1751:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_actions_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1757:2: ( (otherlv_0= 'Service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:1758:2: (otherlv_0= 'Service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:1758:2: (otherlv_0= 'Service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:1759:3: otherlv_0= 'Service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalCBS.g:1763:3: ( ( ruleEString ) )
            // InternalCBS.g:1764:4: ( ruleEString )
            {
            // InternalCBS.g:1764:4: ( ruleEString )
            // InternalCBS.g:1765:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getImplementsSignatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:1783:3: ( (lv_actions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:1784:4: (lv_actions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:1784:4: (lv_actions_3_0= ruleAbstractAction )
            // InternalCBS.g:1785:5: lv_actions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_actions_3_0=ruleAbstractAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_3_0,
            						"org.xtext.example.mydsl.CBS.AbstractAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1802:3: (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCBS.g:1803:4: otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalCBS.g:1807:4: ( (lv_actions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:1808:5: (lv_actions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:1808:5: (lv_actions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:1809:6: lv_actions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_actions_5_0=ruleAbstractAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_5_0,
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalCBS.g:1835:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalCBS.g:1835:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalCBS.g:1836:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalCBS.g:1842:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'internalCall' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCBS.g:1848:2: ( ( () otherlv_1= 'internalCall' ) )
            // InternalCBS.g:1849:2: ( () otherlv_1= 'internalCall' )
            {
            // InternalCBS.g:1849:2: ( () otherlv_1= 'internalCall' )
            // InternalCBS.g:1850:3: () otherlv_1= 'internalCall'
            {
            // InternalCBS.g:1850:3: ()
            // InternalCBS.g:1851:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalCallKeyword_1());
            		

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
    // InternalCBS.g:1865:1: entryRuleExternalCallAction returns [EObject current=null] : iv_ruleExternalCallAction= ruleExternalCallAction EOF ;
    public final EObject entryRuleExternalCallAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCallAction = null;


        try {
            // InternalCBS.g:1865:59: (iv_ruleExternalCallAction= ruleExternalCallAction EOF )
            // InternalCBS.g:1866:2: iv_ruleExternalCallAction= ruleExternalCallAction EOF
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
    // InternalCBS.g:1872:1: ruleExternalCallAction returns [EObject current=null] : (otherlv_0= 'externalCall' ( ( ruleEString ) ) ) ;
    public final EObject ruleExternalCallAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCBS.g:1878:2: ( (otherlv_0= 'externalCall' ( ( ruleEString ) ) ) )
            // InternalCBS.g:1879:2: (otherlv_0= 'externalCall' ( ( ruleEString ) ) )
            {
            // InternalCBS.g:1879:2: (otherlv_0= 'externalCall' ( ( ruleEString ) ) )
            // InternalCBS.g:1880:3: otherlv_0= 'externalCall' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallActionAccess().getExternalCallKeyword_0());
            		
            // InternalCBS.g:1884:3: ( ( ruleEString ) )
            // InternalCBS.g:1885:4: ( ruleEString )
            {
            // InternalCBS.g:1885:4: ( ruleEString )
            // InternalCBS.g:1886:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleExternalCallAction"


    // $ANTLR start "entryRuleBranchAction"
    // InternalCBS.g:1904:1: entryRuleBranchAction returns [EObject current=null] : iv_ruleBranchAction= ruleBranchAction EOF ;
    public final EObject entryRuleBranchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchAction = null;


        try {
            // InternalCBS.g:1904:53: (iv_ruleBranchAction= ruleBranchAction EOF )
            // InternalCBS.g:1905:2: iv_ruleBranchAction= ruleBranchAction EOF
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
    // InternalCBS.g:1911:1: ruleBranchAction returns [EObject current=null] : (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBranchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_branches_2_0 = null;

        EObject lv_branches_4_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1917:2: ( (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' ) )
            // InternalCBS.g:1918:2: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' )
            {
            // InternalCBS.g:1918:2: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' )
            // InternalCBS.g:1919:3: otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchActionAccess().getBranchKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCBS.g:1927:3: ( (lv_branches_2_0= ruleBranchTransition ) )
            // InternalCBS.g:1928:4: (lv_branches_2_0= ruleBranchTransition )
            {
            // InternalCBS.g:1928:4: (lv_branches_2_0= ruleBranchTransition )
            // InternalCBS.g:1929:5: lv_branches_2_0= ruleBranchTransition
            {

            					newCompositeNode(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_branches_2_0=ruleBranchTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchActionRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_2_0,
            						"org.xtext.example.mydsl.CBS.BranchTransition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1946:3: (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCBS.g:1947:4: otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBranchActionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCBS.g:1951:4: ( (lv_branches_4_0= ruleBranchTransition ) )
            	    // InternalCBS.g:1952:5: (lv_branches_4_0= ruleBranchTransition )
            	    {
            	    // InternalCBS.g:1952:5: (lv_branches_4_0= ruleBranchTransition )
            	    // InternalCBS.g:1953:6: lv_branches_4_0= ruleBranchTransition
            	    {

            	    						newCompositeNode(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleBranchTransition"
    // InternalCBS.g:1979:1: entryRuleBranchTransition returns [EObject current=null] : iv_ruleBranchTransition= ruleBranchTransition EOF ;
    public final EObject entryRuleBranchTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchTransition = null;


        try {
            // InternalCBS.g:1979:57: (iv_ruleBranchTransition= ruleBranchTransition EOF )
            // InternalCBS.g:1980:2: iv_ruleBranchTransition= ruleBranchTransition EOF
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
    // InternalCBS.g:1986:1: ruleBranchTransition returns [EObject current=null] : ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleBranchTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_branchCondition_0_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1992:2: ( ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:1993:2: ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:1993:2: ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:1994:3: ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            // InternalCBS.g:1994:3: ( (lv_branchCondition_0_0= ruleEString ) )
            // InternalCBS.g:1995:4: (lv_branchCondition_0_0= ruleEString )
            {
            // InternalCBS.g:1995:4: (lv_branchCondition_0_0= ruleEString )
            // InternalCBS.g:1996:5: lv_branchCondition_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchTransitionAccess().getBranchConditionEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_branchCondition_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchTransitionRule());
            					}
            					set(
            						current,
            						"branchCondition",
            						lv_branchCondition_0_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchTransitionAccess().getQuestionMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:2021:3: ( (lv_actions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:2022:4: (lv_actions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:2022:4: (lv_actions_3_0= ruleAbstractAction )
            // InternalCBS.g:2023:5: lv_actions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_actions_3_0=ruleAbstractAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchTransitionRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_3_0,
            						"org.xtext.example.mydsl.CBS.AbstractAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2040:3: (otherlv_4= ',' ( (lv_actions_5_0= ruleAbstractAction ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==14) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCBS.g:2041:4: otherlv_4= ',' ( (lv_actions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_33); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBranchTransitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCBS.g:2045:4: ( (lv_actions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:2046:5: (lv_actions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:2046:5: (lv_actions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:2047:6: lv_actions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_actions_5_0=ruleAbstractAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBranchTransitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_5_0,
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


    // $ANTLR start "entryRuleLoopAction"
    // InternalCBS.g:2073:1: entryRuleLoopAction returns [EObject current=null] : iv_ruleLoopAction= ruleLoopAction EOF ;
    public final EObject entryRuleLoopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopAction = null;


        try {
            // InternalCBS.g:2073:51: (iv_ruleLoopAction= ruleLoopAction EOF )
            // InternalCBS.g:2074:2: iv_ruleLoopAction= ruleLoopAction EOF
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
    // InternalCBS.g:2080:1: ruleLoopAction returns [EObject current=null] : ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleLoopAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_bodyActions_3_0 = null;

        EObject lv_bodyActions_5_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2086:2: ( ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:2087:2: ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:2087:2: ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:2088:3: () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ',' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            // InternalCBS.g:2088:3: ()
            // InternalCBS.g:2089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopActionAccess().getLoopActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopActionAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:2103:3: ( (lv_bodyActions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:2104:4: (lv_bodyActions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:2104:4: (lv_bodyActions_3_0= ruleAbstractAction )
            // InternalCBS.g:2105:5: lv_bodyActions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_bodyActions_3_0=ruleAbstractAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopActionRule());
            					}
            					add(
            						current,
            						"bodyActions",
            						lv_bodyActions_3_0,
            						"org.xtext.example.mydsl.CBS.AbstractAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2122:3: (otherlv_4= ',' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCBS.g:2123:4: otherlv_4= ',' ( (lv_bodyActions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_33); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLoopActionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCBS.g:2127:4: ( (lv_bodyActions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:2128:5: (lv_bodyActions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:2128:5: (lv_bodyActions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:2129:6: lv_bodyActions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalCBS.g:2155:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCBS.g:2155:47: (iv_ruleEString= ruleEString EOF )
            // InternalCBS.g:2156:2: iv_ruleEString= ruleEString EOF
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
    // InternalCBS.g:2162:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCBS.g:2168:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCBS.g:2169:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCBS.g:2169:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCBS.g:2170:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCBS.g:2178:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleSimpleTypeEnum"
    // InternalCBS.g:2189:1: ruleSimpleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) ) ;
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
            // InternalCBS.g:2195:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) ) )
            // InternalCBS.g:2196:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) )
            {
            // InternalCBS.g:2196:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt32=1;
                }
                break;
            case 47:
                {
                alt32=2;
                }
                break;
            case 48:
                {
                alt32=3;
                }
                break;
            case 49:
                {
                alt32=4;
                }
                break;
            case 50:
                {
                alt32=5;
                }
                break;
            case 51:
                {
                alt32=6;
                }
                break;
            case 52:
                {
                alt32=7;
                }
                break;
            case 53:
                {
                alt32=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalCBS.g:2197:3: (enumLiteral_0= 'String' )
                    {
                    // InternalCBS.g:2197:3: (enumLiteral_0= 'String' )
                    // InternalCBS.g:2198:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:2205:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalCBS.g:2205:3: (enumLiteral_1= 'Int' )
                    // InternalCBS.g:2206:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCBS.g:2213:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalCBS.g:2213:3: (enumLiteral_2= 'Boolean' )
                    // InternalCBS.g:2214:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCBS.g:2221:3: (enumLiteral_3= 'Char' )
                    {
                    // InternalCBS.g:2221:3: (enumLiteral_3= 'Char' )
                    // InternalCBS.g:2222:4: enumLiteral_3= 'Char'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCBS.g:2229:3: (enumLiteral_4= 'Date' )
                    {
                    // InternalCBS.g:2229:3: (enumLiteral_4= 'Date' )
                    // InternalCBS.g:2230:4: enumLiteral_4= 'Date'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCBS.g:2237:3: (enumLiteral_5= 'Double' )
                    {
                    // InternalCBS.g:2237:3: (enumLiteral_5= 'Double' )
                    // InternalCBS.g:2238:4: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCBS.g:2245:3: (enumLiteral_6= 'Float' )
                    {
                    // InternalCBS.g:2245:3: (enumLiteral_6= 'Float' )
                    // InternalCBS.g:2246:4: enumLiteral_6= 'Float'
                    {
                    enumLiteral_6=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCBS.g:2253:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalCBS.g:2253:3: (enumLiteral_7= 'Long' )
                    // InternalCBS.g:2254:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,53,FOLLOW_2); 

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


    // $ANTLR start "ruleCollectionTypeEnum"
    // InternalCBS.g:2264:1: ruleCollectionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) ) ;
    public final Enumerator ruleCollectionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCBS.g:2270:2: ( ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) ) )
            // InternalCBS.g:2271:2: ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) )
            {
            // InternalCBS.g:2271:2: ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            else if ( (LA33_0==55) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalCBS.g:2272:3: (enumLiteral_0= 'List' )
                    {
                    // InternalCBS.g:2272:3: (enumLiteral_0= 'List' )
                    // InternalCBS.g:2273:4: enumLiteral_0= 'List'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCollectionTypeEnumAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCollectionTypeEnumAccess().getListEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:2280:3: (enumLiteral_1= 'Map' )
                    {
                    // InternalCBS.g:2280:3: (enumLiteral_1= 'Map' )
                    // InternalCBS.g:2281:4: enumLiteral_1= 'Map'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getCollectionTypeEnumAccess().getMapEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCollectionTypeEnumAccess().getMapEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCollectionTypeEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F2000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000380008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x003FC00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00002E0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});

}