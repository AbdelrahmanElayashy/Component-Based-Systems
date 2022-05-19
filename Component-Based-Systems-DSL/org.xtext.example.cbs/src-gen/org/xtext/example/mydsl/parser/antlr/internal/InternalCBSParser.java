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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'repository'", "'{'", "'}'", "'assemblies'", "','", "'environments'", "'systems'", "'System'", "'childContexts='", "'assemblyConnectors='", "'requiredDelegationConnectors='", "'providedDelegationConnectors='", "'allocation='", "'env='", "'allocationContexts='", "'container'", "'allocates'", "'Environment'", "'containers='", "'linkers='", "'link'", "'('", "')'", "'assembly'", "'CompositeComponent'", "'requires'", "'provides'", "'childContexts'", "'assemblyConnectors'", "'requiredDelegationConnectors'", "'providedDelegationConnectors'", "'instance'", "'provide'", "'require'", "'interfaces'", "'components'", "'types'", "'interface'", "'atomicComponent'", "'services'", "'type'", "':'", "'Void'", "'<'", "'>'", "'service'", "';'", "'internalCall'", "'externalCall'", "'branch'", "'?'", "'loop'", "'String'", "'Int'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'Long'", "'List'", "'Map'"
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
        	return "ComponentBasedSystemContainer";
       	}

       	@Override
       	protected CBSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentBasedSystemContainer"
    // InternalCBS.g:65:1: entryRuleComponentBasedSystemContainer returns [EObject current=null] : iv_ruleComponentBasedSystemContainer= ruleComponentBasedSystemContainer EOF ;
    public final EObject entryRuleComponentBasedSystemContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentBasedSystemContainer = null;


        try {
            // InternalCBS.g:65:70: (iv_ruleComponentBasedSystemContainer= ruleComponentBasedSystemContainer EOF )
            // InternalCBS.g:66:2: iv_ruleComponentBasedSystemContainer= ruleComponentBasedSystemContainer EOF
            {
             newCompositeNode(grammarAccess.getComponentBasedSystemContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentBasedSystemContainer=ruleComponentBasedSystemContainer();

            state._fsp--;

             current =iv_ruleComponentBasedSystemContainer; 
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
    // $ANTLR end "entryRuleComponentBasedSystemContainer"


    // $ANTLR start "ruleComponentBasedSystemContainer"
    // InternalCBS.g:72:1: ruleComponentBasedSystemContainer returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )* ) ) ) ;
    public final EObject ruleComponentBasedSystemContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_repository_3_0 = null;

        EObject lv_assemblies_7_0 = null;

        EObject lv_assemblies_9_0 = null;

        EObject lv_environments_13_0 = null;

        EObject lv_environments_15_0 = null;

        EObject lv_systems_19_0 = null;

        EObject lv_systems_21_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )* ) ) ) )
            // InternalCBS.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )* ) ) )
            {
            // InternalCBS.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )* ) ) )
            // InternalCBS.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )* ) )
            {
            // InternalCBS.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )* ) )
            // InternalCBS.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            			
            // InternalCBS.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )* )
            // InternalCBS.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )*
            {
            // InternalCBS.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) ) )*
            loop4:
            do {
                int alt4=5;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 2) ) {
                    alt4=3;
                }
                else if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 3) ) {
                    alt4=4;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCBS.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) )
            	    {
            	    // InternalCBS.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) ) )
            	    // InternalCBS.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalCBS.g:87:123: ( ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) ) )
            	    // InternalCBS.g:88:5: ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalCBS.g:91:8: ({...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' ) )
            	    // InternalCBS.g:91:9: {...}? => (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "true");
            	    }
            	    // InternalCBS.g:91:18: (otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}' )
            	    // InternalCBS.g:91:19: otherlv_1= 'repository' otherlv_2= '{' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= '}'
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getComponentBasedSystemContainerAccess().getRepositoryKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    								newLeafNode(otherlv_2, grammarAccess.getComponentBasedSystemContainerAccess().getLeftCurlyBracketKeyword_0_1());
            	    							
            	    // InternalCBS.g:99:8: ( (lv_repository_3_0= ruleRepository ) )
            	    // InternalCBS.g:100:9: (lv_repository_3_0= ruleRepository )
            	    {
            	    // InternalCBS.g:100:9: (lv_repository_3_0= ruleRepository )
            	    // InternalCBS.g:101:10: lv_repository_3_0= ruleRepository
            	    {

            	    										newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getRepositoryRepositoryParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_repository_3_0=ruleRepository();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    										}
            	    										set(
            	    											current,
            	    											"repository",
            	    											lv_repository_3_0,
            	    											"org.xtext.example.mydsl.CBS.Repository");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_4, grammarAccess.getComponentBasedSystemContainerAccess().getRightCurlyBracketKeyword_0_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCBS.g:128:3: ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) )
            	    {
            	    // InternalCBS.g:128:3: ({...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) ) )
            	    // InternalCBS.g:129:4: {...}? => ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalCBS.g:129:123: ( ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) ) )
            	    // InternalCBS.g:130:5: ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalCBS.g:133:8: ({...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' ) )
            	    // InternalCBS.g:133:9: {...}? => (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "true");
            	    }
            	    // InternalCBS.g:133:18: (otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}' )
            	    // InternalCBS.g:133:19: otherlv_5= 'assemblies' otherlv_6= '{' ( (lv_assemblies_7_0= ruleAssembly ) ) (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )* otherlv_10= '}'
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getComponentBasedSystemContainerAccess().getAssembliesKeyword_1_0());
            	    							
            	    otherlv_6=(Token)match(input,12,FOLLOW_7); 

            	    								newLeafNode(otherlv_6, grammarAccess.getComponentBasedSystemContainerAccess().getLeftCurlyBracketKeyword_1_1());
            	    							
            	    // InternalCBS.g:141:8: ( (lv_assemblies_7_0= ruleAssembly ) )
            	    // InternalCBS.g:142:9: (lv_assemblies_7_0= ruleAssembly )
            	    {
            	    // InternalCBS.g:142:9: (lv_assemblies_7_0= ruleAssembly )
            	    // InternalCBS.g:143:10: lv_assemblies_7_0= ruleAssembly
            	    {

            	    										newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getAssembliesAssemblyParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_assemblies_7_0=ruleAssembly();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    										}
            	    										add(
            	    											current,
            	    											"assemblies",
            	    											lv_assemblies_7_0,
            	    											"org.xtext.example.mydsl.CBS.Assembly");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalCBS.g:160:8: (otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalCBS.g:161:9: otherlv_8= ',' ( (lv_assemblies_9_0= ruleAssembly ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	    	    									newLeafNode(otherlv_8, grammarAccess.getComponentBasedSystemContainerAccess().getCommaKeyword_1_3_0());
            	    	    								
            	    	    // InternalCBS.g:165:9: ( (lv_assemblies_9_0= ruleAssembly ) )
            	    	    // InternalCBS.g:166:10: (lv_assemblies_9_0= ruleAssembly )
            	    	    {
            	    	    // InternalCBS.g:166:10: (lv_assemblies_9_0= ruleAssembly )
            	    	    // InternalCBS.g:167:11: lv_assemblies_9_0= ruleAssembly
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getAssembliesAssemblyParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_assemblies_9_0=ruleAssembly();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"assemblies",
            	    	    												lv_assemblies_9_0,
            	    	    												"org.xtext.example.mydsl.CBS.Assembly");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_10, grammarAccess.getComponentBasedSystemContainerAccess().getRightCurlyBracketKeyword_1_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCBS.g:195:3: ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalCBS.g:195:3: ({...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) ) )
            	    // InternalCBS.g:196:4: {...}? => ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalCBS.g:196:123: ( ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) ) )
            	    // InternalCBS.g:197:5: ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalCBS.g:200:8: ({...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' ) )
            	    // InternalCBS.g:200:9: {...}? => (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "true");
            	    }
            	    // InternalCBS.g:200:18: (otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}' )
            	    // InternalCBS.g:200:19: otherlv_11= 'environments' otherlv_12= '{' ( (lv_environments_13_0= ruleEnvironment ) ) (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )* otherlv_16= '}'
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    								newLeafNode(otherlv_11, grammarAccess.getComponentBasedSystemContainerAccess().getEnvironmentsKeyword_2_0());
            	    							
            	    otherlv_12=(Token)match(input,12,FOLLOW_9); 

            	    								newLeafNode(otherlv_12, grammarAccess.getComponentBasedSystemContainerAccess().getLeftCurlyBracketKeyword_2_1());
            	    							
            	    // InternalCBS.g:208:8: ( (lv_environments_13_0= ruleEnvironment ) )
            	    // InternalCBS.g:209:9: (lv_environments_13_0= ruleEnvironment )
            	    {
            	    // InternalCBS.g:209:9: (lv_environments_13_0= ruleEnvironment )
            	    // InternalCBS.g:210:10: lv_environments_13_0= ruleEnvironment
            	    {

            	    										newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getEnvironmentsEnvironmentParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_environments_13_0=ruleEnvironment();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    										}
            	    										add(
            	    											current,
            	    											"environments",
            	    											lv_environments_13_0,
            	    											"org.xtext.example.mydsl.CBS.Environment");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalCBS.g:227:8: (otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==15) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalCBS.g:228:9: otherlv_14= ',' ( (lv_environments_15_0= ruleEnvironment ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,15,FOLLOW_9); 

            	    	    									newLeafNode(otherlv_14, grammarAccess.getComponentBasedSystemContainerAccess().getCommaKeyword_2_3_0());
            	    	    								
            	    	    // InternalCBS.g:232:9: ( (lv_environments_15_0= ruleEnvironment ) )
            	    	    // InternalCBS.g:233:10: (lv_environments_15_0= ruleEnvironment )
            	    	    {
            	    	    // InternalCBS.g:233:10: (lv_environments_15_0= ruleEnvironment )
            	    	    // InternalCBS.g:234:11: lv_environments_15_0= ruleEnvironment
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getEnvironmentsEnvironmentParserRuleCall_2_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_environments_15_0=ruleEnvironment();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"environments",
            	    	    												lv_environments_15_0,
            	    	    												"org.xtext.example.mydsl.CBS.Environment");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_16, grammarAccess.getComponentBasedSystemContainerAccess().getRightCurlyBracketKeyword_2_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCBS.g:262:3: ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) )
            	    {
            	    // InternalCBS.g:262:3: ({...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) ) )
            	    // InternalCBS.g:263:4: {...}? => ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalCBS.g:263:123: ( ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) ) )
            	    // InternalCBS.g:264:5: ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalCBS.g:267:8: ({...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' ) )
            	    // InternalCBS.g:267:9: {...}? => (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "true");
            	    }
            	    // InternalCBS.g:267:18: (otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}' )
            	    // InternalCBS.g:267:19: otherlv_17= 'systems' otherlv_18= '{' ( (lv_systems_19_0= ruleSystem ) ) (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )* otherlv_22= '}'
            	    {
            	    otherlv_17=(Token)match(input,17,FOLLOW_3); 

            	    								newLeafNode(otherlv_17, grammarAccess.getComponentBasedSystemContainerAccess().getSystemsKeyword_3_0());
            	    							
            	    otherlv_18=(Token)match(input,12,FOLLOW_10); 

            	    								newLeafNode(otherlv_18, grammarAccess.getComponentBasedSystemContainerAccess().getLeftCurlyBracketKeyword_3_1());
            	    							
            	    // InternalCBS.g:275:8: ( (lv_systems_19_0= ruleSystem ) )
            	    // InternalCBS.g:276:9: (lv_systems_19_0= ruleSystem )
            	    {
            	    // InternalCBS.g:276:9: (lv_systems_19_0= ruleSystem )
            	    // InternalCBS.g:277:10: lv_systems_19_0= ruleSystem
            	    {

            	    										newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getSystemsSystemParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_systems_19_0=ruleSystem();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    										}
            	    										add(
            	    											current,
            	    											"systems",
            	    											lv_systems_19_0,
            	    											"org.xtext.example.mydsl.CBS.System");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalCBS.g:294:8: (otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalCBS.g:295:9: otherlv_20= ',' ( (lv_systems_21_0= ruleSystem ) )
            	    	    {
            	    	    otherlv_20=(Token)match(input,15,FOLLOW_10); 

            	    	    									newLeafNode(otherlv_20, grammarAccess.getComponentBasedSystemContainerAccess().getCommaKeyword_3_3_0());
            	    	    								
            	    	    // InternalCBS.g:299:9: ( (lv_systems_21_0= ruleSystem ) )
            	    	    // InternalCBS.g:300:10: (lv_systems_21_0= ruleSystem )
            	    	    {
            	    	    // InternalCBS.g:300:10: (lv_systems_21_0= ruleSystem )
            	    	    // InternalCBS.g:301:11: lv_systems_21_0= ruleSystem
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getSystemsSystemParserRuleCall_3_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_systems_21_0=ruleSystem();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"systems",
            	    	    												lv_systems_21_0,
            	    	    												"org.xtext.example.mydsl.CBS.System");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_22, grammarAccess.getComponentBasedSystemContainerAccess().getRightCurlyBracketKeyword_3_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            	    				

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

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleComponentBasedSystemContainer"


    // $ANTLR start "entryRuleSystem"
    // InternalCBS.g:339:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalCBS.g:339:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalCBS.g:340:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalCBS.g:346:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' ) ;
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
            // InternalCBS.g:352:2: ( (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' ) )
            // InternalCBS.g:353:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalCBS.g:353:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' )
            // InternalCBS.g:354:3: otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation=' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalCBS.g:358:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:359:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:359:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:360:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:381:3: (otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCBS.g:382:4: otherlv_3= 'childContexts=' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getChildContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBS.g:390:4: ( (lv_childContexts_5_0= ruleAssemblyContext ) )
                    // InternalCBS.g:391:5: (lv_childContexts_5_0= ruleAssemblyContext )
                    {
                    // InternalCBS.g:391:5: (lv_childContexts_5_0= ruleAssemblyContext )
                    // InternalCBS.g:392:6: lv_childContexts_5_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalCBS.g:409:4: (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCBS.g:410:5: otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBS.g:414:5: ( (lv_childContexts_7_0= ruleAssemblyContext ) )
                    	    // InternalCBS.g:415:6: (lv_childContexts_7_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCBS.g:415:6: (lv_childContexts_7_0= ruleAssemblyContext )
                    	    // InternalCBS.g:416:7: lv_childContexts_7_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:439:3: (otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCBS.g:440:4: otherlv_9= 'assemblyConnectors=' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:448:4: ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) )
                    // InternalCBS.g:449:5: (lv_assemblyConnectors_11_0= ruleAssemblyConnector )
                    {
                    // InternalCBS.g:449:5: (lv_assemblyConnectors_11_0= ruleAssemblyConnector )
                    // InternalCBS.g:450:6: lv_assemblyConnectors_11_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalCBS.g:467:4: (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCBS.g:468:5: otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:472:5: ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) )
                    	    // InternalCBS.g:473:6: (lv_assemblyConnectors_13_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalCBS.g:473:6: (lv_assemblyConnectors_13_0= ruleAssemblyConnector )
                    	    // InternalCBS.g:474:7: lv_assemblyConnectors_13_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:497:3: (otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCBS.g:498:4: otherlv_15= 'requiredDelegationConnectors=' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getRequiredDelegationConnectorsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:506:4: ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) )
                    // InternalCBS.g:507:5: (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector )
                    {
                    // InternalCBS.g:507:5: (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector )
                    // InternalCBS.g:508:6: lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalCBS.g:525:4: (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCBS.g:526:5: otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:530:5: ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) )
                    	    // InternalCBS.g:531:6: (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector )
                    	    {
                    	    // InternalCBS.g:531:6: (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector )
                    	    // InternalCBS.g:532:7: lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:555:3: (otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCBS.g:556:4: otherlv_21= 'providedDelegationConnectors=' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getProvidedDelegationConnectorsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_22, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:564:4: ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) )
                    // InternalCBS.g:565:5: (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector )
                    {
                    // InternalCBS.g:565:5: (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector )
                    // InternalCBS.g:566:6: lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalCBS.g:583:4: (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCBS.g:584:5: otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:588:5: ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) )
                    	    // InternalCBS.g:589:6: (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector )
                    	    {
                    	    // InternalCBS.g:589:6: (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector )
                    	    // InternalCBS.g:590:7: lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_26, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getSystemAccess().getAllocationKeyword_7());
            		
            otherlv_28=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_28, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalCBS.g:621:3: ( (lv_allocation_29_0= ruleAllocation ) )
            // InternalCBS.g:622:4: (lv_allocation_29_0= ruleAllocation )
            {
            // InternalCBS.g:622:4: (lv_allocation_29_0= ruleAllocation )
            // InternalCBS.g:623:5: lv_allocation_29_0= ruleAllocation
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getAllocationAllocationParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_30=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_30, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_31=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCBS.g:652:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalCBS.g:652:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalCBS.g:653:2: iv_ruleAllocation= ruleAllocation EOF
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
    // InternalCBS.g:659:1: ruleAllocation returns [EObject current=null] : (otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalCBS.g:665:2: ( (otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? ) )
            // InternalCBS.g:666:2: (otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? )
            {
            // InternalCBS.g:666:2: (otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? )
            // InternalCBS.g:667:3: otherlv_0= 'env=' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationAccess().getEnvKeyword_0());
            		
            // InternalCBS.g:671:3: ( ( ruleEString ) )
            // InternalCBS.g:672:4: ( ruleEString )
            {
            // InternalCBS.g:672:4: ( ruleEString )
            // InternalCBS.g:673:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentCrossReference_1_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:687:3: (otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCBS.g:688:4: otherlv_2= 'allocationContexts=' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalCBS.g:696:4: ( (lv_allocationContexts_4_0= ruleAllocationContext ) )
                    // InternalCBS.g:697:5: (lv_allocationContexts_4_0= ruleAllocationContext )
                    {
                    // InternalCBS.g:697:5: (lv_allocationContexts_4_0= ruleAllocationContext )
                    // InternalCBS.g:698:6: lv_allocationContexts_4_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalCBS.g:715:4: (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCBS.g:716:5: otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalCBS.g:720:5: ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
                    	    // InternalCBS.g:721:6: (lv_allocationContexts_6_0= ruleAllocationContext )
                    	    {
                    	    // InternalCBS.g:721:6: (lv_allocationContexts_6_0= ruleAllocationContext )
                    	    // InternalCBS.g:722:7: lv_allocationContexts_6_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCBS.g:749:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalCBS.g:749:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalCBS.g:750:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalCBS.g:756:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCBS.g:762:2: ( (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:763:2: (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:763:2: (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:764:3: otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getContainerKeyword_1());
            		
            // InternalCBS.g:772:3: ( ( ruleEString ) )
            // InternalCBS.g:773:4: ( ruleEString )
            {
            // InternalCBS.g:773:4: ( ruleEString )
            // InternalCBS.g:774:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_2_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAllocatesKeyword_3());
            		
            // InternalCBS.g:792:3: ( ( ruleEString ) )
            // InternalCBS.g:793:4: ( ruleEString )
            {
            // InternalCBS.g:793:4: ( ruleEString )
            // InternalCBS.g:794:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEnvironment"
    // InternalCBS.g:816:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCBS.g:816:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCBS.g:817:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalCBS.g:823:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers=' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers=' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_container_6_0 = null;

        EObject lv_container_8_0 = null;

        EObject lv_linker_12_0 = null;

        EObject lv_linker_14_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:829:2: ( ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers=' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers=' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalCBS.g:830:2: ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers=' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers=' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalCBS.g:830:2: ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers=' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers=' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalCBS.g:831:3: () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers=' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers=' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalCBS.g:831:3: ()
            // InternalCBS.g:832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            // InternalCBS.g:842:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:843:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:843:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:844:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:865:3: (otherlv_4= 'containers=' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCBS.g:866:4: otherlv_4= 'containers=' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getContainersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:874:4: ( (lv_container_6_0= ruleContainer ) )
                    // InternalCBS.g:875:5: (lv_container_6_0= ruleContainer )
                    {
                    // InternalCBS.g:875:5: (lv_container_6_0= ruleContainer )
                    // InternalCBS.g:876:6: lv_container_6_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_container_6_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"container",
                    							lv_container_6_0,
                    							"org.xtext.example.mydsl.CBS.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:893:4: (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCBS.g:894:5: otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:898:5: ( (lv_container_8_0= ruleContainer ) )
                    	    // InternalCBS.g:899:6: (lv_container_8_0= ruleContainer )
                    	    {
                    	    // InternalCBS.g:899:6: (lv_container_8_0= ruleContainer )
                    	    // InternalCBS.g:900:7: lv_container_8_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_container_8_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"container",
                    	    								lv_container_8_0,
                    	    								"org.xtext.example.mydsl.CBS.Container");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,13,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:923:3: (otherlv_10= 'linkers=' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCBS.g:924:4: otherlv_10= 'linkers=' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLinkersKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:932:4: ( (lv_linker_12_0= ruleLinker ) )
                    // InternalCBS.g:933:5: (lv_linker_12_0= ruleLinker )
                    {
                    // InternalCBS.g:933:5: (lv_linker_12_0= ruleLinker )
                    // InternalCBS.g:934:6: lv_linker_12_0= ruleLinker
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinkerLinkerParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_linker_12_0=ruleLinker();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"linker",
                    							lv_linker_12_0,
                    							"org.xtext.example.mydsl.CBS.Linker");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:951:4: (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCBS.g:952:5: otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEnvironmentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:956:5: ( (lv_linker_14_0= ruleLinker ) )
                    	    // InternalCBS.g:957:6: (lv_linker_14_0= ruleLinker )
                    	    {
                    	    // InternalCBS.g:957:6: (lv_linker_14_0= ruleLinker )
                    	    // InternalCBS.g:958:7: lv_linker_14_0= ruleLinker
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinkerLinkerParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_linker_14_0=ruleLinker();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"linker",
                    	    								lv_linker_14_0,
                    	    								"org.xtext.example.mydsl.CBS.Linker");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleContainer"
    // InternalCBS.g:989:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalCBS.g:989:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalCBS.g:990:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalCBS.g:996:1: ruleContainer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1002:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCBS.g:1003:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCBS.g:1003:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalCBS.g:1004:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCBS.g:1004:3: ()
            // InternalCBS.g:1005:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            // InternalCBS.g:1011:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:1012:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:1012:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:1013:5: lv_name_1_0= ruleEString
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
    // InternalCBS.g:1034:1: entryRuleLinker returns [EObject current=null] : iv_ruleLinker= ruleLinker EOF ;
    public final EObject entryRuleLinker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinker = null;


        try {
            // InternalCBS.g:1034:47: (iv_ruleLinker= ruleLinker EOF )
            // InternalCBS.g:1035:2: iv_ruleLinker= ruleLinker EOF
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
    // InternalCBS.g:1041:1: ruleLinker returns [EObject current=null] : (otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleLinker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCBS.g:1047:2: ( (otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            // InternalCBS.g:1048:2: (otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            {
            // InternalCBS.g:1048:2: (otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            // InternalCBS.g:1049:3: otherlv_0= 'link' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkerAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCBS.g:1057:3: ( ( ruleEString ) )
            // InternalCBS.g:1058:4: ( ruleEString )
            {
            // InternalCBS.g:1058:4: ( ruleEString )
            // InternalCBS.g:1059:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_2_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1073:3: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCBS.g:1074:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLinkerAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCBS.g:1078:4: ( ( ruleEString ) )
            	    // InternalCBS.g:1079:5: ( ruleEString )
            	    {
            	    // InternalCBS.g:1079:5: ( ruleEString )
            	    // InternalCBS.g:1080:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkerRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAssembly"
    // InternalCBS.g:1103:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalCBS.g:1103:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalCBS.g:1104:2: iv_ruleAssembly= ruleAssembly EOF
            {
             newCompositeNode(grammarAccess.getAssemblyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;

             current =iv_ruleAssembly; 
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
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // InternalCBS.g:1110:1: ruleAssembly returns [EObject current=null] : ( () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_compositeComponents_4_0 = null;

        EObject lv_compositeComponents_6_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1116:2: ( ( () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}' ) )
            // InternalCBS.g:1117:2: ( () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}' )
            {
            // InternalCBS.g:1117:2: ( () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}' )
            // InternalCBS.g:1118:3: () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}'
            {
            // InternalCBS.g:1118:3: ()
            // InternalCBS.g:1119:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
            		
            // InternalCBS.g:1129:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:1130:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:1130:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:1131:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:1152:3: ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCBS.g:1153:4: ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )*
                    {
                    // InternalCBS.g:1153:4: ( (lv_compositeComponents_4_0= ruleCompositeComponent ) )
                    // InternalCBS.g:1154:5: (lv_compositeComponents_4_0= ruleCompositeComponent )
                    {
                    // InternalCBS.g:1154:5: (lv_compositeComponents_4_0= ruleCompositeComponent )
                    // InternalCBS.g:1155:6: lv_compositeComponents_4_0= ruleCompositeComponent
                    {

                    						newCompositeNode(grammarAccess.getAssemblyAccess().getCompositeComponentsCompositeComponentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_compositeComponents_4_0=ruleCompositeComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    						}
                    						add(
                    							current,
                    							"compositeComponents",
                    							lv_compositeComponents_4_0,
                    							"org.xtext.example.mydsl.CBS.CompositeComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1172:4: (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalCBS.g:1173:5: otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAssemblyAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCBS.g:1177:5: ( (lv_compositeComponents_6_0= ruleCompositeComponent ) )
                    	    // InternalCBS.g:1178:6: (lv_compositeComponents_6_0= ruleCompositeComponent )
                    	    {
                    	    // InternalCBS.g:1178:6: (lv_compositeComponents_6_0= ruleCompositeComponent )
                    	    // InternalCBS.g:1179:7: lv_compositeComponents_6_0= ruleCompositeComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyAccess().getCompositeComponentsCompositeComponentParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_compositeComponents_6_0=ruleCompositeComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"compositeComponents",
                    	    								lv_compositeComponents_6_0,
                    	    								"org.xtext.example.mydsl.CBS.CompositeComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalCBS.g:1206:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalCBS.g:1206:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalCBS.g:1207:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeComponent=ruleCompositeComponent();

            state._fsp--;

             current =iv_ruleCompositeComponent; 
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
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalCBS.g:1213:1: ruleCompositeComponent returns [EObject current=null] : ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
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
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_childContexts_18_0 = null;

        EObject lv_childContexts_20_0 = null;

        EObject lv_assemblyConnectors_24_0 = null;

        EObject lv_assemblyConnectors_26_0 = null;

        EObject lv_requiredDelegationConnectors_30_0 = null;

        EObject lv_requiredDelegationConnectors_32_0 = null;

        EObject lv_providedDelegationConnectors_36_0 = null;

        EObject lv_providedDelegationConnectors_38_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1219:2: ( ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) )
            // InternalCBS.g:1220:2: ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            {
            // InternalCBS.g:1220:2: ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            // InternalCBS.g:1221:3: () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}'
            {
            // InternalCBS.g:1221:3: ()
            // InternalCBS.g:1222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeComponentAccess().getCompositeComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_1());
            		
            // InternalCBS.g:1232:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:1233:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:1233:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:1234:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:1255:3: (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCBS.g:1256:4: otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getRequiresKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:1264:4: ( ( ruleEString ) )
                    // InternalCBS.g:1265:5: ( ruleEString )
                    {
                    // InternalCBS.g:1265:5: ( ruleEString )
                    // InternalCBS.g:1266:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiresInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1280:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCBS.g:1281:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:1285:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:1286:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:1286:6: ( ruleEString )
                    	    // InternalCBS.g:1287:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,13,FOLLOW_29); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1307:3: (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCBS.g:1308:4: otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getProvidesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:1316:4: ( ( ruleEString ) )
                    // InternalCBS.g:1317:5: ( ruleEString )
                    {
                    // InternalCBS.g:1317:5: ( ruleEString )
                    // InternalCBS.g:1318:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidesInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1332:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCBS.g:1333:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:1337:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:1338:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:1338:6: ( ruleEString )
                    	    // InternalCBS.g:1339:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,13,FOLLOW_30); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1359:3: (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCBS.g:1360:4: otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getChildContextsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:1368:4: ( (lv_childContexts_18_0= ruleAssemblyContext ) )
                    // InternalCBS.g:1369:5: (lv_childContexts_18_0= ruleAssemblyContext )
                    {
                    // InternalCBS.g:1369:5: (lv_childContexts_18_0= ruleAssemblyContext )
                    // InternalCBS.g:1370:6: lv_childContexts_18_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getChildContextsAssemblyContextParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_childContexts_18_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"childContexts",
                    							lv_childContexts_18_0,
                    							"org.xtext.example.mydsl.CBS.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1387:4: (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalCBS.g:1388:5: otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getCompositeComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:1392:5: ( (lv_childContexts_20_0= ruleAssemblyContext ) )
                    	    // InternalCBS.g:1393:6: (lv_childContexts_20_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCBS.g:1393:6: (lv_childContexts_20_0= ruleAssemblyContext )
                    	    // InternalCBS.g:1394:7: lv_childContexts_20_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getChildContextsAssemblyContextParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_childContexts_20_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"childContexts",
                    	    								lv_childContexts_20_0,
                    	    								"org.xtext.example.mydsl.CBS.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,13,FOLLOW_31); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1417:3: (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCBS.g:1418:4: otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCBS.g:1426:4: ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) )
                    // InternalCBS.g:1427:5: (lv_assemblyConnectors_24_0= ruleAssemblyConnector )
                    {
                    // InternalCBS.g:1427:5: (lv_assemblyConnectors_24_0= ruleAssemblyConnector )
                    // InternalCBS.g:1428:6: lv_assemblyConnectors_24_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_assemblyConnectors_24_0=ruleAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"assemblyConnectors",
                    							lv_assemblyConnectors_24_0,
                    							"org.xtext.example.mydsl.CBS.AssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1445:4: (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalCBS.g:1446:5: otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_25=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCBS.g:1450:5: ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) )
                    	    // InternalCBS.g:1451:6: (lv_assemblyConnectors_26_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalCBS.g:1451:6: (lv_assemblyConnectors_26_0= ruleAssemblyConnector )
                    	    // InternalCBS.g:1452:7: lv_assemblyConnectors_26_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_assemblyConnectors_26_0=ruleAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyConnectors",
                    	    								lv_assemblyConnectors_26_0,
                    	    								"org.xtext.example.mydsl.CBS.AssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,13,FOLLOW_32); 

                    				newLeafNode(otherlv_27, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1475:3: (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCBS.g:1476:4: otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getRequiredDelegationConnectorsKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCBS.g:1484:4: ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) )
                    // InternalCBS.g:1485:5: (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector )
                    {
                    // InternalCBS.g:1485:5: (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector )
                    // InternalCBS.g:1486:6: lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_requiredDelegationConnectors_30_0=ruleRequiredDelegationConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"requiredDelegationConnectors",
                    							lv_requiredDelegationConnectors_30_0,
                    							"org.xtext.example.mydsl.CBS.RequiredDelegationConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1503:4: (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalCBS.g:1504:5: otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) )
                    	    {
                    	    otherlv_31=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getCompositeComponentAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCBS.g:1508:5: ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) )
                    	    // InternalCBS.g:1509:6: (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector )
                    	    {
                    	    // InternalCBS.g:1509:6: (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector )
                    	    // InternalCBS.g:1510:7: lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_requiredDelegationConnectors_32_0=ruleRequiredDelegationConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredDelegationConnectors",
                    	    								lv_requiredDelegationConnectors_32_0,
                    	    								"org.xtext.example.mydsl.CBS.RequiredDelegationConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,13,FOLLOW_33); 

                    				newLeafNode(otherlv_33, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1533:3: (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCBS.g:1534:4: otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_34, grammarAccess.getCompositeComponentAccess().getProvidedDelegationConnectorsKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_35, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCBS.g:1542:4: ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) )
                    // InternalCBS.g:1543:5: (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector )
                    {
                    // InternalCBS.g:1543:5: (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector )
                    // InternalCBS.g:1544:6: lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_providedDelegationConnectors_36_0=ruleProvidedDelegationConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"providedDelegationConnectors",
                    							lv_providedDelegationConnectors_36_0,
                    							"org.xtext.example.mydsl.CBS.ProvidedDelegationConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1561:4: (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==15) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalCBS.g:1562:5: otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) )
                    	    {
                    	    otherlv_37=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCBS.g:1566:5: ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) )
                    	    // InternalCBS.g:1567:6: (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector )
                    	    {
                    	    // InternalCBS.g:1567:6: (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector )
                    	    // InternalCBS.g:1568:7: lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_providedDelegationConnectors_38_0=ruleProvidedDelegationConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedDelegationConnectors",
                    	    								lv_providedDelegationConnectors_38_0,
                    	    								"org.xtext.example.mydsl.CBS.ProvidedDelegationConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_39, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_40=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_40, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalCBS.g:1599:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalCBS.g:1599:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalCBS.g:1600:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalCBS.g:1606:1: ruleAssemblyContext returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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
            // InternalCBS.g:1612:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalCBS.g:1613:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalCBS.g:1613:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalCBS.g:1614:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalCBS.g:1614:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:1615:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:1615:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:1616:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getInstanceKeyword_2());
            		
            // InternalCBS.g:1641:3: ( ( ruleEString ) )
            // InternalCBS.g:1642:4: ( ruleEString )
            {
            // InternalCBS.g:1642:4: ( ruleEString )
            // InternalCBS.g:1643:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentCrossReference_3_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1657:3: (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCBS.g:1658:4: otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssemblyContextAccess().getProvideKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalCBS.g:1666:4: ( (lv_providedRoles_6_0= ruleProvidedRole ) )
                    // InternalCBS.g:1667:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    {
                    // InternalCBS.g:1667:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    // InternalCBS.g:1668:6: lv_providedRoles_6_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalCBS.g:1685:4: (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalCBS.g:1686:5: otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAssemblyContextAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:1690:5: ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    // InternalCBS.g:1691:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    {
                    	    // InternalCBS.g:1691:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    // InternalCBS.g:1692:7: lv_providedRoles_8_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,33,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1715:3: (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCBS.g:1716:4: otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getRequireKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalCBS.g:1724:4: ( (lv_requiredRoles_12_0= ruleRequiredRole ) )
                    // InternalCBS.g:1725:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    {
                    // InternalCBS.g:1725:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    // InternalCBS.g:1726:6: lv_requiredRoles_12_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalCBS.g:1743:4: (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==15) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalCBS.g:1744:5: otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:1748:5: ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    // InternalCBS.g:1749:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    {
                    	    // InternalCBS.g:1749:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    // InternalCBS.g:1750:7: lv_requiredRoles_14_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCBS.g:1781:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalCBS.g:1781:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalCBS.g:1782:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalCBS.g:1788:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCBS.g:1794:2: ( (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' ) )
            // InternalCBS.g:1795:2: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' )
            {
            // InternalCBS.g:1795:2: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' )
            // InternalCBS.g:1796:3: otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getLeftParenthesisKeyword_0());
            		
            // InternalCBS.g:1800:3: ( ( ruleEString ) )
            // InternalCBS.g:1801:4: ( ruleEString )
            {
            // InternalCBS.g:1801:4: ( ruleEString )
            // InternalCBS.g:1802:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleCrossReference_1_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getCommaKeyword_2());
            		
            // InternalCBS.g:1820:3: ( ( ruleEString ) )
            // InternalCBS.g:1821:4: ( ruleEString )
            {
            // InternalCBS.g:1821:4: ( ruleEString )
            // InternalCBS.g:1822:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleCrossReference_3_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalCBS.g:1844:1: entryRuleRequiredDelegationConnector returns [EObject current=null] : iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF ;
    public final EObject entryRuleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredDelegationConnector = null;


        try {
            // InternalCBS.g:1844:68: (iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF )
            // InternalCBS.g:1845:2: iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF
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
    // InternalCBS.g:1851:1: ruleRequiredDelegationConnector returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCBS.g:1857:2: ( ( ( ruleEString ) ) )
            // InternalCBS.g:1858:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:1858:2: ( ( ruleEString ) )
            // InternalCBS.g:1859:3: ( ruleEString )
            {
            // InternalCBS.g:1859:3: ( ruleEString )
            // InternalCBS.g:1860:4: ruleEString
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
    // InternalCBS.g:1877:1: entryRuleProvidedDelegationConnector returns [EObject current=null] : iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF ;
    public final EObject entryRuleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedDelegationConnector = null;


        try {
            // InternalCBS.g:1877:68: (iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF )
            // InternalCBS.g:1878:2: iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF
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
    // InternalCBS.g:1884:1: ruleProvidedDelegationConnector returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCBS.g:1890:2: ( ( ( ruleEString ) ) )
            // InternalCBS.g:1891:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:1891:2: ( ( ruleEString ) )
            // InternalCBS.g:1892:3: ( ruleEString )
            {
            // InternalCBS.g:1892:3: ( ruleEString )
            // InternalCBS.g:1893:4: ruleEString
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
    // InternalCBS.g:1910:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCBS.g:1910:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCBS.g:1911:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalCBS.g:1917:1: ruleProvidedRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1923:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalCBS.g:1924:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalCBS.g:1924:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) )
            // InternalCBS.g:1925:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalCBS.g:1925:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:1926:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:1926:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:1927:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1944:3: ( ( ruleEString ) )
            // InternalCBS.g:1945:4: ( ruleEString )
            {
            // InternalCBS.g:1945:4: ( ruleEString )
            // InternalCBS.g:1946:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_1_0());
            				
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
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalCBS.g:1964:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCBS.g:1964:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCBS.g:1965:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalCBS.g:1971:1: ruleRequiredRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1977:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalCBS.g:1978:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalCBS.g:1978:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) )
            // InternalCBS.g:1979:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalCBS.g:1979:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:1980:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:1980:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:1981:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1998:3: ( ( ruleEString ) )
            // InternalCBS.g:1999:4: ( ruleEString )
            {
            // InternalCBS.g:1999:4: ( ruleEString )
            // InternalCBS.g:2000:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_1_0());
            				
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
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleRepository"
    // InternalCBS.g:2018:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalCBS.g:2018:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalCBS.g:2019:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalCBS.g:2025:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        EObject lv_interfaces_5_0 = null;

        EObject lv_interfaces_7_0 = null;

        EObject lv_components_11_0 = null;

        EObject lv_components_13_0 = null;

        EObject lv_types_17_0 = null;

        EObject lv_types_19_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2031:2: ( ( () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalCBS.g:2032:2: ( () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalCBS.g:2032:2: ( () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalCBS.g:2033:3: () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalCBS.g:2033:3: ()
            // InternalCBS.g:2034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:2048:3: (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCBS.g:2049:4: otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBS.g:2057:4: ( (lv_interfaces_5_0= ruleInterface ) )
                    // InternalCBS.g:2058:5: (lv_interfaces_5_0= ruleInterface )
                    {
                    // InternalCBS.g:2058:5: (lv_interfaces_5_0= ruleInterface )
                    // InternalCBS.g:2059:6: lv_interfaces_5_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_interfaces_5_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_5_0,
                    							"org.xtext.example.mydsl.CBS.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2076:4: (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==15) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalCBS.g:2077:5: otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_40); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBS.g:2081:5: ( (lv_interfaces_7_0= ruleInterface ) )
                    	    // InternalCBS.g:2082:6: (lv_interfaces_7_0= ruleInterface )
                    	    {
                    	    // InternalCBS.g:2082:6: (lv_interfaces_7_0= ruleInterface )
                    	    // InternalCBS.g:2083:7: lv_interfaces_7_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_interfaces_7_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_7_0,
                    	    								"org.xtext.example.mydsl.CBS.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:2106:3: (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCBS.g:2107:4: otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getComponentsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_42); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:2115:4: ( (lv_components_11_0= ruleAtomicComponent ) )
                    // InternalCBS.g:2116:5: (lv_components_11_0= ruleAtomicComponent )
                    {
                    // InternalCBS.g:2116:5: (lv_components_11_0= ruleAtomicComponent )
                    // InternalCBS.g:2117:6: lv_components_11_0= ruleAtomicComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsAtomicComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_components_11_0=ruleAtomicComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_11_0,
                    							"org.xtext.example.mydsl.CBS.AtomicComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2134:4: (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==15) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalCBS.g:2135:5: otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_42); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:2139:5: ( (lv_components_13_0= ruleAtomicComponent ) )
                    	    // InternalCBS.g:2140:6: (lv_components_13_0= ruleAtomicComponent )
                    	    {
                    	    // InternalCBS.g:2140:6: (lv_components_13_0= ruleAtomicComponent )
                    	    // InternalCBS.g:2141:7: lv_components_13_0= ruleAtomicComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsAtomicComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_components_13_0=ruleAtomicComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_13_0,
                    	    								"org.xtext.example.mydsl.CBS.AtomicComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_43); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:2164:3: (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCBS.g:2165:4: otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getTypesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_44); 

                    				newLeafNode(otherlv_16, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:2173:4: ( (lv_types_17_0= ruleType ) )
                    // InternalCBS.g:2174:5: (lv_types_17_0= ruleType )
                    {
                    // InternalCBS.g:2174:5: (lv_types_17_0= ruleType )
                    // InternalCBS.g:2175:6: lv_types_17_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_types_17_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_17_0,
                    							"org.xtext.example.mydsl.CBS.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2192:4: (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalCBS.g:2193:5: otherlv_18= ',' ( (lv_types_19_0= ruleType ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRepositoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:2197:5: ( (lv_types_19_0= ruleType ) )
                    	    // InternalCBS.g:2198:6: (lv_types_19_0= ruleType )
                    	    {
                    	    // InternalCBS.g:2198:6: (lv_types_19_0= ruleType )
                    	    // InternalCBS.g:2199:7: lv_types_19_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_types_19_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_19_0,
                    	    								"org.xtext.example.mydsl.CBS.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleInterface"
    // InternalCBS.g:2230:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCBS.g:2230:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCBS.g:2231:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalCBS.g:2237:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_signatures_4_0 = null;

        EObject lv_signatures_6_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2243:2: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}' ) )
            // InternalCBS.g:2244:2: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}' )
            {
            // InternalCBS.g:2244:2: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}' )
            // InternalCBS.g:2245:3: () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}'
            {
            // InternalCBS.g:2245:3: ()
            // InternalCBS.g:2246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCBS.g:2256:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:2257:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:2257:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:2258:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:2279:3: ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCBS.g:2280:4: ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )*
                    {
                    // InternalCBS.g:2280:4: ( (lv_signatures_4_0= ruleSignature ) )
                    // InternalCBS.g:2281:5: (lv_signatures_4_0= ruleSignature )
                    {
                    // InternalCBS.g:2281:5: (lv_signatures_4_0= ruleSignature )
                    // InternalCBS.g:2282:6: lv_signatures_4_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_signatures_4_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signatures",
                    							lv_signatures_4_0,
                    							"org.xtext.example.mydsl.CBS.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2299:4: (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==15) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalCBS.g:2300:5: otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCBS.g:2304:5: ( (lv_signatures_6_0= ruleSignature ) )
                    	    // InternalCBS.g:2305:6: (lv_signatures_6_0= ruleSignature )
                    	    {
                    	    // InternalCBS.g:2305:6: (lv_signatures_6_0= ruleSignature )
                    	    // InternalCBS.g:2306:7: lv_signatures_6_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_signatures_6_0=ruleSignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signatures",
                    	    								lv_signatures_6_0,
                    	    								"org.xtext.example.mydsl.CBS.Signature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleAtomicComponent"
    // InternalCBS.g:2333:1: entryRuleAtomicComponent returns [EObject current=null] : iv_ruleAtomicComponent= ruleAtomicComponent EOF ;
    public final EObject entryRuleAtomicComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicComponent = null;


        try {
            // InternalCBS.g:2333:56: (iv_ruleAtomicComponent= ruleAtomicComponent EOF )
            // InternalCBS.g:2334:2: iv_ruleAtomicComponent= ruleAtomicComponent EOF
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
    // InternalCBS.g:2340:1: ruleAtomicComponent returns [EObject current=null] : ( () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // InternalCBS.g:2346:2: ( ( () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalCBS.g:2347:2: ( () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalCBS.g:2347:2: ( () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalCBS.g:2348:3: () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalCBS.g:2348:3: ()
            // InternalCBS.g:2349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicComponentAccess().getAtomicComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicComponentAccess().getAtomicComponentKeyword_1());
            		
            // InternalCBS.g:2359:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:2360:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:2360:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:2361:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtomicComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:2382:3: (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCBS.g:2383:4: otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicComponentAccess().getProvidesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:2391:4: ( ( ruleEString ) )
                    // InternalCBS.g:2392:5: ( ruleEString )
                    {
                    // InternalCBS.g:2392:5: ( ruleEString )
                    // InternalCBS.g:2393:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2407:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==15) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalCBS.g:2408:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAtomicComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:2412:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:2413:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:2413:6: ( ruleEString )
                    	    // InternalCBS.g:2414:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,13,FOLLOW_47); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:2434:3: (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==36) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCBS.g:2435:4: otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getAtomicComponentAccess().getRequiresKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:2443:4: ( ( ruleEString ) )
                    // InternalCBS.g:2444:5: ( ruleEString )
                    {
                    // InternalCBS.g:2444:5: ( ruleEString )
                    // InternalCBS.g:2445:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2459:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==15) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalCBS.g:2460:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAtomicComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:2464:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:2465:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:2465:6: ( ruleEString )
                    	    // InternalCBS.g:2466:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,13,FOLLOW_48); 

                    				newLeafNode(otherlv_15, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:2486:3: (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCBS.g:2487:4: otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getAtomicComponentAccess().getServicesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_17, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:2495:4: ( (lv_services_18_0= ruleService ) )
                    // InternalCBS.g:2496:5: (lv_services_18_0= ruleService )
                    {
                    // InternalCBS.g:2496:5: (lv_services_18_0= ruleService )
                    // InternalCBS.g:2497:6: lv_services_18_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalCBS.g:2514:4: (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalCBS.g:2515:5: otherlv_19= ',' ( (lv_services_20_0= ruleService ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_49); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getAtomicComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:2519:5: ( (lv_services_20_0= ruleService ) )
                    	    // InternalCBS.g:2520:6: (lv_services_20_0= ruleService )
                    	    {
                    	    // InternalCBS.g:2520:6: (lv_services_20_0= ruleService )
                    	    // InternalCBS.g:2521:7: lv_services_20_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCBS.g:2552:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalCBS.g:2552:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalCBS.g:2553:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalCBS.g:2559:1: ruleSignature returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalCBS.g:2565:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) )
            // InternalCBS.g:2566:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            {
            // InternalCBS.g:2566:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            // InternalCBS.g:2567:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
            {
            // InternalCBS.g:2567:3: ( ( ruleEString ) )
            // InternalCBS.g:2568:4: ( ruleEString )
            {
            // InternalCBS.g:2568:4: ( ruleEString )
            // InternalCBS.g:2569:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2583:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:2584:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:2584:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:2585:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,32,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCBS.g:2606:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCBS.g:2607:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalCBS.g:2607:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalCBS.g:2608:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalCBS.g:2608:5: (lv_parameters_3_0= ruleParameter )
                    // InternalCBS.g:2609:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalCBS.g:2626:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==15) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalCBS.g:2627:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCBS.g:2631:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalCBS.g:2632:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalCBS.g:2632:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalCBS.g:2633:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalCBS.g:2660:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCBS.g:2660:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCBS.g:2661:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCBS.g:2667:1: ruleParameter returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2673:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCBS.g:2674:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCBS.g:2674:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalCBS.g:2675:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCBS.g:2675:3: ( ( ruleEString ) )
            // InternalCBS.g:2676:4: ( ruleEString )
            {
            // InternalCBS.g:2676:4: ( ruleEString )
            // InternalCBS.g:2677:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2691:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:2692:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:2692:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:2693:5: lv_name_1_0= ruleEString
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


    // $ANTLR start "entryRuleType"
    // InternalCBS.g:2714:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalCBS.g:2714:45: (iv_ruleType= ruleType EOF )
            // InternalCBS.g:2715:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalCBS.g:2721:1: ruleType returns [EObject current=null] : (this_Void_0= ruleVoid | this_ParameterType_1= ruleParameterType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Void_0 = null;

        EObject this_ParameterType_1 = null;



        	enterRule();

        try {
            // InternalCBS.g:2727:2: ( (this_Void_0= ruleVoid | this_ParameterType_1= ruleParameterType ) )
            // InternalCBS.g:2728:2: (this_Void_0= ruleVoid | this_ParameterType_1= ruleParameterType )
            {
            // InternalCBS.g:2728:2: (this_Void_0= ruleVoid | this_ParameterType_1= ruleParameterType )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                alt54=1;
            }
            else if ( (LA54_0==51||(LA54_0>=71 && LA54_0<=72)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalCBS.g:2729:3: this_Void_0= ruleVoid
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getVoidParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Void_0=ruleVoid();

                    state._fsp--;


                    			current = this_Void_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCBS.g:2738:3: this_ParameterType_1= ruleParameterType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getParameterTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterType_1=ruleParameterType();

                    state._fsp--;


                    			current = this_ParameterType_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleParameterType"
    // InternalCBS.g:2750:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalCBS.g:2750:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalCBS.g:2751:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalCBS.g:2757:1: ruleParameterType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType | this_CollectionType_2= ruleCollectionType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_ComplexType_1 = null;

        EObject this_CollectionType_2 = null;



        	enterRule();

        try {
            // InternalCBS.g:2763:2: ( (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType | this_CollectionType_2= ruleCollectionType ) )
            // InternalCBS.g:2764:2: (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType | this_CollectionType_2= ruleCollectionType )
            {
            // InternalCBS.g:2764:2: (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType | this_CollectionType_2= ruleCollectionType )
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                int LA55_1 = input.LA(2);

                if ( ((LA55_1>=63 && LA55_1<=70)) ) {
                    alt55=1;
                }
                else if ( ((LA55_1>=RULE_STRING && LA55_1<=RULE_ID)) ) {
                    alt55=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA55_0>=71 && LA55_0<=72)) ) {
                alt55=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalCBS.g:2765:3: this_SimpleType_0= ruleSimpleType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getSimpleTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;


                    			current = this_SimpleType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCBS.g:2774:3: this_ComplexType_1= ruleComplexType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getComplexTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexType_1=ruleComplexType();

                    state._fsp--;


                    			current = this_ComplexType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCBS.g:2783:3: this_CollectionType_2= ruleCollectionType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getCollectionTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionType_2=ruleCollectionType();

                    state._fsp--;


                    			current = this_CollectionType_2;
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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleSimpleType"
    // InternalCBS.g:2795:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalCBS.g:2795:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalCBS.g:2796:2: iv_ruleSimpleType= ruleSimpleType EOF
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
    // InternalCBS.g:2802:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2808:2: ( (otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) ) ) )
            // InternalCBS.g:2809:2: (otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) ) )
            {
            // InternalCBS.g:2809:2: (otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) ) )
            // InternalCBS.g:2810:3: otherlv_0= 'type' ( (lv_type_1_0= ruleSimpleTypeEnum ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0());
            		
            // InternalCBS.g:2814:3: ( (lv_type_1_0= ruleSimpleTypeEnum ) )
            // InternalCBS.g:2815:4: (lv_type_1_0= ruleSimpleTypeEnum )
            {
            // InternalCBS.g:2815:4: (lv_type_1_0= ruleSimpleTypeEnum )
            // InternalCBS.g:2816:5: lv_type_1_0= ruleSimpleTypeEnum
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
    // InternalCBS.g:2837:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalCBS.g:2837:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalCBS.g:2838:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalCBS.g:2844:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_members_4_0 = null;

        EObject lv_members_6_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2850:2: ( ( () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}' ) )
            // InternalCBS.g:2851:2: ( () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}' )
            {
            // InternalCBS.g:2851:2: ( () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}' )
            // InternalCBS.g:2852:3: () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}'
            {
            // InternalCBS.g:2852:3: ()
            // InternalCBS.g:2853:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getTypeKeyword_1());
            		
            // InternalCBS.g:2863:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:2864:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:2864:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:2865:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:2886:3: ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_ID)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCBS.g:2887:4: ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )*
                    {
                    // InternalCBS.g:2887:4: ( (lv_members_4_0= ruleComplexMember ) )
                    // InternalCBS.g:2888:5: (lv_members_4_0= ruleComplexMember )
                    {
                    // InternalCBS.g:2888:5: (lv_members_4_0= ruleComplexMember )
                    // InternalCBS.g:2889:6: lv_members_4_0= ruleComplexMember
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_members_4_0=ruleComplexMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_4_0,
                    							"org.xtext.example.mydsl.CBS.ComplexMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2906:4: (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalCBS.g:2907:5: otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCBS.g:2911:5: ( (lv_members_6_0= ruleComplexMember ) )
                    	    // InternalCBS.g:2912:6: (lv_members_6_0= ruleComplexMember )
                    	    {
                    	    // InternalCBS.g:2912:6: (lv_members_6_0= ruleComplexMember )
                    	    // InternalCBS.g:2913:7: lv_members_6_0= ruleComplexMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_members_6_0=ruleComplexMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_6_0,
                    	    								"org.xtext.example.mydsl.CBS.ComplexMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalCBS.g:2940:1: entryRuleComplexMember returns [EObject current=null] : iv_ruleComplexMember= ruleComplexMember EOF ;
    public final EObject entryRuleComplexMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMember = null;


        try {
            // InternalCBS.g:2940:54: (iv_ruleComplexMember= ruleComplexMember EOF )
            // InternalCBS.g:2941:2: iv_ruleComplexMember= ruleComplexMember EOF
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
    // InternalCBS.g:2947:1: ruleComplexMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleComplexMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2953:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) )
            // InternalCBS.g:2954:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            {
            // InternalCBS.g:2954:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            // InternalCBS.g:2955:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )
            {
            // InternalCBS.g:2955:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:2956:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:2956:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:2957:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
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

            otherlv_1=(Token)match(input,52,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexMemberAccess().getColonKeyword_1());
            		
            // InternalCBS.g:2978:3: ( ( ruleEString ) )
            // InternalCBS.g:2979:4: ( ruleEString )
            {
            // InternalCBS.g:2979:4: ( ruleEString )
            // InternalCBS.g:2980:5: ruleEString
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
    // InternalCBS.g:2998:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalCBS.g:2998:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalCBS.g:2999:2: iv_ruleVoid= ruleVoid EOF
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
    // InternalCBS.g:3005:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCBS.g:3011:2: ( ( () otherlv_1= 'Void' ) )
            // InternalCBS.g:3012:2: ( () otherlv_1= 'Void' )
            {
            // InternalCBS.g:3012:2: ( () otherlv_1= 'Void' )
            // InternalCBS.g:3013:3: () otherlv_1= 'Void'
            {
            // InternalCBS.g:3013:3: ()
            // InternalCBS.g:3014:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalCBS.g:3028:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalCBS.g:3028:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalCBS.g:3029:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalCBS.g:3035:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:3041:2: ( ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ) )
            // InternalCBS.g:3042:2: ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' )
            {
            // InternalCBS.g:3042:2: ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' )
            // InternalCBS.g:3043:3: ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>'
            {
            // InternalCBS.g:3043:3: ( (lv_type_0_0= ruleCollectionTypeEnum ) )
            // InternalCBS.g:3044:4: (lv_type_0_0= ruleCollectionTypeEnum )
            {
            // InternalCBS.g:3044:4: (lv_type_0_0= ruleCollectionTypeEnum )
            // InternalCBS.g:3045:5: lv_type_0_0= ruleCollectionTypeEnum
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getTypeCollectionTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
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

            otherlv_1=(Token)match(input,54,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalCBS.g:3066:3: ( ( ruleEString ) )
            // InternalCBS.g:3067:4: ( ruleEString )
            {
            // InternalCBS.g:3067:4: ( ruleEString )
            // InternalCBS.g:3068:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getInnerTypeParameterTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_54);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_2); 

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
    // InternalCBS.g:3090:1: entryRuleAbstractAction returns [EObject current=null] : iv_ruleAbstractAction= ruleAbstractAction EOF ;
    public final EObject entryRuleAbstractAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAction = null;


        try {
            // InternalCBS.g:3090:55: (iv_ruleAbstractAction= ruleAbstractAction EOF )
            // InternalCBS.g:3091:2: iv_ruleAbstractAction= ruleAbstractAction EOF
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
    // InternalCBS.g:3097:1: ruleAbstractAction returns [EObject current=null] : (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction ) ;
    public final EObject ruleAbstractAction() throws RecognitionException {
        EObject current = null;

        EObject this_InternalAction_0 = null;

        EObject this_ExternalCallAction_1 = null;

        EObject this_BranchAction_2 = null;

        EObject this_LoopAction_3 = null;



        	enterRule();

        try {
            // InternalCBS.g:3103:2: ( (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction ) )
            // InternalCBS.g:3104:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction )
            {
            // InternalCBS.g:3104:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt58=1;
                }
                break;
            case 59:
                {
                alt58=2;
                }
                break;
            case 60:
                {
                alt58=3;
                }
                break;
            case 62:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalCBS.g:3105:3: this_InternalAction_0= ruleInternalAction
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
                    // InternalCBS.g:3114:3: this_ExternalCallAction_1= ruleExternalCallAction
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
                    // InternalCBS.g:3123:3: this_BranchAction_2= ruleBranchAction
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
                    // InternalCBS.g:3132:3: this_LoopAction_3= ruleLoopAction
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
    // InternalCBS.g:3144:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalCBS.g:3144:48: (iv_ruleService= ruleService EOF )
            // InternalCBS.g:3145:2: iv_ruleService= ruleService EOF
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
    // InternalCBS.g:3151:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
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
            // InternalCBS.g:3157:2: ( (otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:3158:2: (otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:3158:2: (otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:3159:3: otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalCBS.g:3163:3: ( ( ruleEString ) )
            // InternalCBS.g:3164:4: ( ruleEString )
            {
            // InternalCBS.g:3164:4: ( ruleEString )
            // InternalCBS.g:3165:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getImplementsSignatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:3183:3: ( (lv_actions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:3184:4: (lv_actions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:3184:4: (lv_actions_3_0= ruleAbstractAction )
            // InternalCBS.g:3185:5: lv_actions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
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

            // InternalCBS.g:3202:3: (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==57) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCBS.g:3203:4: otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_55); 

            	    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalCBS.g:3207:4: ( (lv_actions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:3208:5: (lv_actions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:3208:5: (lv_actions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:3209:6: lv_actions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
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
            	    break loop59;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCBS.g:3235:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalCBS.g:3235:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalCBS.g:3236:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalCBS.g:3242:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'internalCall' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCBS.g:3248:2: ( ( () otherlv_1= 'internalCall' ) )
            // InternalCBS.g:3249:2: ( () otherlv_1= 'internalCall' )
            {
            // InternalCBS.g:3249:2: ( () otherlv_1= 'internalCall' )
            // InternalCBS.g:3250:3: () otherlv_1= 'internalCall'
            {
            // InternalCBS.g:3250:3: ()
            // InternalCBS.g:3251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

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
    // InternalCBS.g:3265:1: entryRuleExternalCallAction returns [EObject current=null] : iv_ruleExternalCallAction= ruleExternalCallAction EOF ;
    public final EObject entryRuleExternalCallAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCallAction = null;


        try {
            // InternalCBS.g:3265:59: (iv_ruleExternalCallAction= ruleExternalCallAction EOF )
            // InternalCBS.g:3266:2: iv_ruleExternalCallAction= ruleExternalCallAction EOF
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
    // InternalCBS.g:3272:1: ruleExternalCallAction returns [EObject current=null] : (otherlv_0= 'externalCall' ( ( ruleEString ) ) ) ;
    public final EObject ruleExternalCallAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCBS.g:3278:2: ( (otherlv_0= 'externalCall' ( ( ruleEString ) ) ) )
            // InternalCBS.g:3279:2: (otherlv_0= 'externalCall' ( ( ruleEString ) ) )
            {
            // InternalCBS.g:3279:2: (otherlv_0= 'externalCall' ( ( ruleEString ) ) )
            // InternalCBS.g:3280:3: otherlv_0= 'externalCall' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallActionAccess().getExternalCallKeyword_0());
            		
            // InternalCBS.g:3284:3: ( ( ruleEString ) )
            // InternalCBS.g:3285:4: ( ruleEString )
            {
            // InternalCBS.g:3285:4: ( ruleEString )
            // InternalCBS.g:3286:5: ruleEString
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
    // InternalCBS.g:3304:1: entryRuleBranchAction returns [EObject current=null] : iv_ruleBranchAction= ruleBranchAction EOF ;
    public final EObject entryRuleBranchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchAction = null;


        try {
            // InternalCBS.g:3304:53: (iv_ruleBranchAction= ruleBranchAction EOF )
            // InternalCBS.g:3305:2: iv_ruleBranchAction= ruleBranchAction EOF
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
    // InternalCBS.g:3311:1: ruleBranchAction returns [EObject current=null] : (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' ) ;
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
            // InternalCBS.g:3317:2: ( (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' ) )
            // InternalCBS.g:3318:2: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' )
            {
            // InternalCBS.g:3318:2: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' )
            // InternalCBS.g:3319:3: otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchActionAccess().getBranchKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCBS.g:3327:3: ( (lv_branches_2_0= ruleBranchTransition ) )
            // InternalCBS.g:3328:4: (lv_branches_2_0= ruleBranchTransition )
            {
            // InternalCBS.g:3328:4: (lv_branches_2_0= ruleBranchTransition )
            // InternalCBS.g:3329:5: lv_branches_2_0= ruleBranchTransition
            {

            					newCompositeNode(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalCBS.g:3346:3: (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==15) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalCBS.g:3347:4: otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBranchActionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCBS.g:3351:4: ( (lv_branches_4_0= ruleBranchTransition ) )
            	    // InternalCBS.g:3352:5: (lv_branches_4_0= ruleBranchTransition )
            	    {
            	    // InternalCBS.g:3352:5: (lv_branches_4_0= ruleBranchTransition )
            	    // InternalCBS.g:3353:6: lv_branches_4_0= ruleBranchTransition
            	    {

            	    						newCompositeNode(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    break loop60;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCBS.g:3379:1: entryRuleBranchTransition returns [EObject current=null] : iv_ruleBranchTransition= ruleBranchTransition EOF ;
    public final EObject entryRuleBranchTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchTransition = null;


        try {
            // InternalCBS.g:3379:57: (iv_ruleBranchTransition= ruleBranchTransition EOF )
            // InternalCBS.g:3380:2: iv_ruleBranchTransition= ruleBranchTransition EOF
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
    // InternalCBS.g:3386:1: ruleBranchTransition returns [EObject current=null] : ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
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
            // InternalCBS.g:3392:2: ( ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:3393:2: ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:3393:2: ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:3394:3: ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            // InternalCBS.g:3394:3: ( (lv_branchCondition_0_0= ruleEString ) )
            // InternalCBS.g:3395:4: (lv_branchCondition_0_0= ruleEString )
            {
            // InternalCBS.g:3395:4: (lv_branchCondition_0_0= ruleEString )
            // InternalCBS.g:3396:5: lv_branchCondition_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchTransitionAccess().getBranchConditionEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_57);
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

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchTransitionAccess().getQuestionMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:3421:3: ( (lv_actions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:3422:4: (lv_actions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:3422:4: (lv_actions_3_0= ruleAbstractAction )
            // InternalCBS.g:3423:5: lv_actions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
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

            // InternalCBS.g:3440:3: (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==57) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalCBS.g:3441:4: otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_55); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBranchTransitionAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalCBS.g:3445:4: ( (lv_actions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:3446:5: (lv_actions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:3446:5: (lv_actions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:3447:6: lv_actions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
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
            	    break loop61;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCBS.g:3473:1: entryRuleLoopAction returns [EObject current=null] : iv_ruleLoopAction= ruleLoopAction EOF ;
    public final EObject entryRuleLoopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopAction = null;


        try {
            // InternalCBS.g:3473:51: (iv_ruleLoopAction= ruleLoopAction EOF )
            // InternalCBS.g:3474:2: iv_ruleLoopAction= ruleLoopAction EOF
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
    // InternalCBS.g:3480:1: ruleLoopAction returns [EObject current=null] : ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
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
            // InternalCBS.g:3486:2: ( ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:3487:2: ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:3487:2: ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:3488:3: () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            // InternalCBS.g:3488:3: ()
            // InternalCBS.g:3489:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopActionAccess().getLoopActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopActionAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:3503:3: ( (lv_bodyActions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:3504:4: (lv_bodyActions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:3504:4: (lv_bodyActions_3_0= ruleAbstractAction )
            // InternalCBS.g:3505:5: lv_bodyActions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
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

            // InternalCBS.g:3522:3: (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==57) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalCBS.g:3523:4: otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_55); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLoopActionAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalCBS.g:3527:4: ( (lv_bodyActions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:3528:5: (lv_bodyActions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:3528:5: (lv_bodyActions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:3529:6: lv_bodyActions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
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
            	    break loop62;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCBS.g:3555:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCBS.g:3555:47: (iv_ruleEString= ruleEString EOF )
            // InternalCBS.g:3556:2: iv_ruleEString= ruleEString EOF
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
    // InternalCBS.g:3562:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCBS.g:3568:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCBS.g:3569:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCBS.g:3569:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalCBS.g:3570:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCBS.g:3578:3: this_ID_1= RULE_ID
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
    // InternalCBS.g:3589:1: ruleSimpleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) ) ;
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
            // InternalCBS.g:3595:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) ) )
            // InternalCBS.g:3596:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) )
            {
            // InternalCBS.g:3596:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) )
            int alt64=8;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt64=1;
                }
                break;
            case 64:
                {
                alt64=2;
                }
                break;
            case 65:
                {
                alt64=3;
                }
                break;
            case 66:
                {
                alt64=4;
                }
                break;
            case 67:
                {
                alt64=5;
                }
                break;
            case 68:
                {
                alt64=6;
                }
                break;
            case 69:
                {
                alt64=7;
                }
                break;
            case 70:
                {
                alt64=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalCBS.g:3597:3: (enumLiteral_0= 'String' )
                    {
                    // InternalCBS.g:3597:3: (enumLiteral_0= 'String' )
                    // InternalCBS.g:3598:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:3605:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalCBS.g:3605:3: (enumLiteral_1= 'Int' )
                    // InternalCBS.g:3606:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCBS.g:3613:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalCBS.g:3613:3: (enumLiteral_2= 'Boolean' )
                    // InternalCBS.g:3614:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCBS.g:3621:3: (enumLiteral_3= 'Char' )
                    {
                    // InternalCBS.g:3621:3: (enumLiteral_3= 'Char' )
                    // InternalCBS.g:3622:4: enumLiteral_3= 'Char'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCBS.g:3629:3: (enumLiteral_4= 'Date' )
                    {
                    // InternalCBS.g:3629:3: (enumLiteral_4= 'Date' )
                    // InternalCBS.g:3630:4: enumLiteral_4= 'Date'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCBS.g:3637:3: (enumLiteral_5= 'Double' )
                    {
                    // InternalCBS.g:3637:3: (enumLiteral_5= 'Double' )
                    // InternalCBS.g:3638:4: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCBS.g:3645:3: (enumLiteral_6= 'Float' )
                    {
                    // InternalCBS.g:3645:3: (enumLiteral_6= 'Float' )
                    // InternalCBS.g:3646:4: enumLiteral_6= 'Float'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCBS.g:3653:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalCBS.g:3653:3: (enumLiteral_7= 'Long' )
                    // InternalCBS.g:3654:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_2); 

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
    // InternalCBS.g:3664:1: ruleCollectionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) ) ;
    public final Enumerator ruleCollectionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCBS.g:3670:2: ( ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) ) )
            // InternalCBS.g:3671:2: ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) )
            {
            // InternalCBS.g:3671:2: ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==71) ) {
                alt65=1;
            }
            else if ( (LA65_0==72) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalCBS.g:3672:3: (enumLiteral_0= 'List' )
                    {
                    // InternalCBS.g:3672:3: (enumLiteral_0= 'List' )
                    // InternalCBS.g:3673:4: enumLiteral_0= 'List'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getCollectionTypeEnumAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCollectionTypeEnumAccess().getListEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:3680:3: (enumLiteral_1= 'Map' )
                    {
                    // InternalCBS.g:3680:3: (enumLiteral_1= 'Map' )
                    // InternalCBS.g:3681:4: enumLiteral_1= 'Map'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000034802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003F000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003E000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003C000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000038000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000180000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000E00000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000C00000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0028000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004003000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004001000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x5C00000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000000000L});

}
