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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'childContexts'", "','", "'}'", "'assemblyConnectors'", "'requiredDelegationConnectors'", "'providedDelegationConnectors'", "'allocation'", "'env'", "'allocationContexts'", "'container'", "'allocates'", "'Environment'", "'containers'", "'linkers'", "'<->'", "'assembly'", "'CompositeComponent'", "'requires'", "'provides'", "'instance'", "'provide'", "'('", "')'", "'require'", "'repository'", "'interfaces'", "'components'", "'types'", "'interface'", "'atomicComponent'", "'services'", "'type'", "':'", "'<'", "'>'", "'service'", "';'", "'internalCall'", "'externalCall'", "'branch'", "'?'", "'loop'", "'String'", "'Int'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'Long'", "'List'", "'Map'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalCBS.g:72:1: ruleComponentBasedSystemContainer returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleComponentBasedSystemContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_repository_1_0 = null;

        EObject lv_assembly_2_0 = null;

        EObject lv_environment_3_0 = null;

        EObject lv_system_4_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )* ) ) ) )
            // InternalCBS.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )* ) ) )
            {
            // InternalCBS.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )* ) ) )
            // InternalCBS.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )* ) )
            {
            // InternalCBS.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )* ) )
            // InternalCBS.g:81:4: ( ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            			
            // InternalCBS.g:84:4: ( ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )* )
            // InternalCBS.g:85:5: ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )*
            {
            // InternalCBS.g:85:5: ( ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) ) )*
            loop1:
            do {
                int alt1=5;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 3) ) {
                    alt1=4;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCBS.g:86:3: ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) )
            	    {
            	    // InternalCBS.g:86:3: ({...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) ) )
            	    // InternalCBS.g:87:4: {...}? => ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalCBS.g:87:123: ( ({...}? => ( (lv_repository_1_0= ruleRepository ) ) ) )
            	    // InternalCBS.g:88:5: ({...}? => ( (lv_repository_1_0= ruleRepository ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalCBS.g:91:8: ({...}? => ( (lv_repository_1_0= ruleRepository ) ) )
            	    // InternalCBS.g:91:9: {...}? => ( (lv_repository_1_0= ruleRepository ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "true");
            	    }
            	    // InternalCBS.g:91:18: ( (lv_repository_1_0= ruleRepository ) )
            	    // InternalCBS.g:91:19: (lv_repository_1_0= ruleRepository )
            	    {
            	    // InternalCBS.g:91:19: (lv_repository_1_0= ruleRepository )
            	    // InternalCBS.g:92:9: lv_repository_1_0= ruleRepository
            	    {

            	    									newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getRepositoryRepositoryParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_repository_1_0=ruleRepository();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    									}
            	    									set(
            	    										current,
            	    										"repository",
            	    										lv_repository_1_0,
            	    										"org.xtext.example.mydsl.CBS.Repository");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCBS.g:114:3: ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) )
            	    {
            	    // InternalCBS.g:114:3: ({...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) ) )
            	    // InternalCBS.g:115:4: {...}? => ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalCBS.g:115:123: ( ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) ) )
            	    // InternalCBS.g:116:5: ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalCBS.g:119:8: ({...}? => ( (lv_assembly_2_0= ruleAssembly ) ) )
            	    // InternalCBS.g:119:9: {...}? => ( (lv_assembly_2_0= ruleAssembly ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "true");
            	    }
            	    // InternalCBS.g:119:18: ( (lv_assembly_2_0= ruleAssembly ) )
            	    // InternalCBS.g:119:19: (lv_assembly_2_0= ruleAssembly )
            	    {
            	    // InternalCBS.g:119:19: (lv_assembly_2_0= ruleAssembly )
            	    // InternalCBS.g:120:9: lv_assembly_2_0= ruleAssembly
            	    {

            	    									newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getAssemblyAssemblyParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_assembly_2_0=ruleAssembly();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    									}
            	    									set(
            	    										current,
            	    										"assembly",
            	    										lv_assembly_2_0,
            	    										"org.xtext.example.mydsl.CBS.Assembly");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCBS.g:142:3: ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) )
            	    {
            	    // InternalCBS.g:142:3: ({...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) ) )
            	    // InternalCBS.g:143:4: {...}? => ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalCBS.g:143:123: ( ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) ) )
            	    // InternalCBS.g:144:5: ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalCBS.g:147:8: ({...}? => ( (lv_environment_3_0= ruleEnvironment ) ) )
            	    // InternalCBS.g:147:9: {...}? => ( (lv_environment_3_0= ruleEnvironment ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "true");
            	    }
            	    // InternalCBS.g:147:18: ( (lv_environment_3_0= ruleEnvironment ) )
            	    // InternalCBS.g:147:19: (lv_environment_3_0= ruleEnvironment )
            	    {
            	    // InternalCBS.g:147:19: (lv_environment_3_0= ruleEnvironment )
            	    // InternalCBS.g:148:9: lv_environment_3_0= ruleEnvironment
            	    {

            	    									newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getEnvironmentEnvironmentParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_environment_3_0=ruleEnvironment();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    									}
            	    									set(
            	    										current,
            	    										"environment",
            	    										lv_environment_3_0,
            	    										"org.xtext.example.mydsl.CBS.Environment");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCBS.g:170:3: ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) )
            	    {
            	    // InternalCBS.g:170:3: ({...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) ) )
            	    // InternalCBS.g:171:4: {...}? => ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalCBS.g:171:123: ( ({...}? => ( (lv_system_4_0= ruleSystem ) ) ) )
            	    // InternalCBS.g:172:5: ({...}? => ( (lv_system_4_0= ruleSystem ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalCBS.g:175:8: ({...}? => ( (lv_system_4_0= ruleSystem ) ) )
            	    // InternalCBS.g:175:9: {...}? => ( (lv_system_4_0= ruleSystem ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentBasedSystemContainer", "true");
            	    }
            	    // InternalCBS.g:175:18: ( (lv_system_4_0= ruleSystem ) )
            	    // InternalCBS.g:175:19: (lv_system_4_0= ruleSystem )
            	    {
            	    // InternalCBS.g:175:19: (lv_system_4_0= ruleSystem )
            	    // InternalCBS.g:176:9: lv_system_4_0= ruleSystem
            	    {

            	    									newCompositeNode(grammarAccess.getComponentBasedSystemContainerAccess().getSystemSystemParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_system_4_0=ruleSystem();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getComponentBasedSystemContainerRule());
            	    									}
            	    									set(
            	    										current,
            	    										"system",
            	    										lv_system_4_0,
            	    										"org.xtext.example.mydsl.CBS.System");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalCBS.g:208:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalCBS.g:208:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalCBS.g:209:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalCBS.g:215:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' ) ;
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
            // InternalCBS.g:221:2: ( (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' ) )
            // InternalCBS.g:222:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' )
            {
            // InternalCBS.g:222:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}' )
            // InternalCBS.g:223:3: otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )? (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= 'allocation' otherlv_28= '{' ( (lv_allocation_29_0= ruleAllocation ) ) otherlv_30= '}' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalCBS.g:227:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:228:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:228:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:229:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:250:3: (otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCBS.g:251:4: otherlv_3= 'childContexts' otherlv_4= '{' ( (lv_childContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getChildContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBS.g:259:4: ( (lv_childContexts_5_0= ruleAssemblyContext ) )
                    // InternalCBS.g:260:5: (lv_childContexts_5_0= ruleAssemblyContext )
                    {
                    // InternalCBS.g:260:5: (lv_childContexts_5_0= ruleAssemblyContext )
                    // InternalCBS.g:261:6: lv_childContexts_5_0= ruleAssemblyContext
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

                    // InternalCBS.g:278:4: (otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCBS.g:279:5: otherlv_6= ',' ( (lv_childContexts_7_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBS.g:283:5: ( (lv_childContexts_7_0= ruleAssemblyContext ) )
                    	    // InternalCBS.g:284:6: (lv_childContexts_7_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCBS.g:284:6: (lv_childContexts_7_0= ruleAssemblyContext )
                    	    // InternalCBS.g:285:7: lv_childContexts_7_0= ruleAssemblyContext
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
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:308:3: (otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCBS.g:309:4: otherlv_9= 'assemblyConnectors' otherlv_10= '{' ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) ) (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:317:4: ( (lv_assemblyConnectors_11_0= ruleAssemblyConnector ) )
                    // InternalCBS.g:318:5: (lv_assemblyConnectors_11_0= ruleAssemblyConnector )
                    {
                    // InternalCBS.g:318:5: (lv_assemblyConnectors_11_0= ruleAssemblyConnector )
                    // InternalCBS.g:319:6: lv_assemblyConnectors_11_0= ruleAssemblyConnector
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

                    // InternalCBS.g:336:4: (otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCBS.g:337:5: otherlv_12= ',' ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:341:5: ( (lv_assemblyConnectors_13_0= ruleAssemblyConnector ) )
                    	    // InternalCBS.g:342:6: (lv_assemblyConnectors_13_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalCBS.g:342:6: (lv_assemblyConnectors_13_0= ruleAssemblyConnector )
                    	    // InternalCBS.g:343:7: lv_assemblyConnectors_13_0= ruleAssemblyConnector
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
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:366:3: (otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCBS.g:367:4: otherlv_15= 'requiredDelegationConnectors' otherlv_16= '{' ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) ) (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getRequiredDelegationConnectorsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:375:4: ( (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector ) )
                    // InternalCBS.g:376:5: (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector )
                    {
                    // InternalCBS.g:376:5: (lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector )
                    // InternalCBS.g:377:6: lv_requiredDelegationConnectors_17_0= ruleRequiredDelegationConnector
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

                    // InternalCBS.g:394:4: (otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCBS.g:395:5: otherlv_18= ',' ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:399:5: ( (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector ) )
                    	    // InternalCBS.g:400:6: (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector )
                    	    {
                    	    // InternalCBS.g:400:6: (lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector )
                    	    // InternalCBS.g:401:7: lv_requiredDelegationConnectors_19_0= ruleRequiredDelegationConnector
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
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:424:3: (otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCBS.g:425:4: otherlv_21= 'providedDelegationConnectors' otherlv_22= '{' ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) ) (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getProvidedDelegationConnectorsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:433:4: ( (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector ) )
                    // InternalCBS.g:434:5: (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector )
                    {
                    // InternalCBS.g:434:5: (lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector )
                    // InternalCBS.g:435:6: lv_providedDelegationConnectors_23_0= ruleProvidedDelegationConnector
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

                    // InternalCBS.g:452:4: (otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCBS.g:453:5: otherlv_24= ',' ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:457:5: ( (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector ) )
                    	    // InternalCBS.g:458:6: (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector )
                    	    {
                    	    // InternalCBS.g:458:6: (lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector )
                    	    // InternalCBS.g:459:7: lv_providedDelegationConnectors_25_0= ruleProvidedDelegationConnector
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_26, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_27, grammarAccess.getSystemAccess().getAllocationKeyword_7());
            		
            otherlv_28=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_28, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalCBS.g:490:3: ( (lv_allocation_29_0= ruleAllocation ) )
            // InternalCBS.g:491:4: (lv_allocation_29_0= ruleAllocation )
            {
            // InternalCBS.g:491:4: (lv_allocation_29_0= ruleAllocation )
            // InternalCBS.g:492:5: lv_allocation_29_0= ruleAllocation
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getAllocationAllocationParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_30=(Token)match(input,15,FOLLOW_14); 

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
    // InternalCBS.g:521:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalCBS.g:521:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalCBS.g:522:2: iv_ruleAllocation= ruleAllocation EOF
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
    // InternalCBS.g:528:1: ruleAllocation returns [EObject current=null] : (otherlv_0= 'env' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalCBS.g:534:2: ( (otherlv_0= 'env' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? ) )
            // InternalCBS.g:535:2: (otherlv_0= 'env' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? )
            {
            // InternalCBS.g:535:2: (otherlv_0= 'env' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )? )
            // InternalCBS.g:536:3: otherlv_0= 'env' ( ( ruleEString ) ) (otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationAccess().getEnvKeyword_0());
            		
            // InternalCBS.g:540:3: ( ( ruleEString ) )
            // InternalCBS.g:541:4: ( ruleEString )
            {
            // InternalCBS.g:541:4: ( ruleEString )
            // InternalCBS.g:542:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:556:3: (otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCBS.g:557:4: otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalCBS.g:565:4: ( (lv_allocationContexts_4_0= ruleAllocationContext ) )
                    // InternalCBS.g:566:5: (lv_allocationContexts_4_0= ruleAllocationContext )
                    {
                    // InternalCBS.g:566:5: (lv_allocationContexts_4_0= ruleAllocationContext )
                    // InternalCBS.g:567:6: lv_allocationContexts_4_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:584:4: (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCBS.g:585:5: otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalCBS.g:589:5: ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
                    	    // InternalCBS.g:590:6: (lv_allocationContexts_6_0= ruleAllocationContext )
                    	    {
                    	    // InternalCBS.g:590:6: (lv_allocationContexts_6_0= ruleAllocationContext )
                    	    // InternalCBS.g:591:7: lv_allocationContexts_6_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_2_3_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
    // InternalCBS.g:618:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalCBS.g:618:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalCBS.g:619:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalCBS.g:625:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCBS.g:631:2: ( (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBS.g:632:2: (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBS.g:632:2: (otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBS.g:633:3: otherlv_0= '{' otherlv_1= 'container' ( ( ruleEString ) ) otherlv_3= 'allocates' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getContainerKeyword_1());
            		
            // InternalCBS.g:641:3: ( ( ruleEString ) )
            // InternalCBS.g:642:4: ( ruleEString )
            {
            // InternalCBS.g:642:4: ( ruleEString )
            // InternalCBS.g:643:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAllocatesKeyword_3());
            		
            // InternalCBS.g:661:3: ( ( ruleEString ) )
            // InternalCBS.g:662:4: ( ruleEString )
            {
            // InternalCBS.g:662:4: ( ruleEString )
            // InternalCBS.g:663:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
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


    // $ANTLR start "entryRuleEnvironment"
    // InternalCBS.g:685:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCBS.g:685:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCBS.g:686:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalCBS.g:692:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalCBS.g:698:2: ( ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalCBS.g:699:2: ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalCBS.g:699:2: ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalCBS.g:700:3: () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'linkers' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalCBS.g:700:3: ()
            // InternalCBS.g:701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            // InternalCBS.g:711:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:712:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:712:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:713:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:734:3: (otherlv_4= 'containers' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCBS.g:735:4: otherlv_4= 'containers' otherlv_5= '{' ( (lv_container_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getContainersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:743:4: ( (lv_container_6_0= ruleContainer ) )
                    // InternalCBS.g:744:5: (lv_container_6_0= ruleContainer )
                    {
                    // InternalCBS.g:744:5: (lv_container_6_0= ruleContainer )
                    // InternalCBS.g:745:6: lv_container_6_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:762:4: (otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCBS.g:763:5: otherlv_7= ',' ( (lv_container_8_0= ruleContainer ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:767:5: ( (lv_container_8_0= ruleContainer ) )
                    	    // InternalCBS.g:768:6: (lv_container_8_0= ruleContainer )
                    	    {
                    	    // InternalCBS.g:768:6: (lv_container_8_0= ruleContainer )
                    	    // InternalCBS.g:769:7: lv_container_8_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:792:3: (otherlv_10= 'linkers' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCBS.g:793:4: otherlv_10= 'linkers' otherlv_11= '{' ( (lv_linker_12_0= ruleLinker ) ) (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLinkersKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:801:4: ( (lv_linker_12_0= ruleLinker ) )
                    // InternalCBS.g:802:5: (lv_linker_12_0= ruleLinker )
                    {
                    // InternalCBS.g:802:5: (lv_linker_12_0= ruleLinker )
                    // InternalCBS.g:803:6: lv_linker_12_0= ruleLinker
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinkerLinkerParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:820:4: (otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCBS.g:821:5: otherlv_13= ',' ( (lv_linker_14_0= ruleLinker ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEnvironmentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:825:5: ( (lv_linker_14_0= ruleLinker ) )
                    	    // InternalCBS.g:826:6: (lv_linker_14_0= ruleLinker )
                    	    {
                    	    // InternalCBS.g:826:6: (lv_linker_14_0= ruleLinker )
                    	    // InternalCBS.g:827:7: lv_linker_14_0= ruleLinker
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinkerLinkerParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCBS.g:858:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalCBS.g:858:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalCBS.g:859:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalCBS.g:865:1: ruleContainer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:871:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCBS.g:872:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCBS.g:872:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalCBS.g:873:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCBS.g:873:3: ()
            // InternalCBS.g:874:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            // InternalCBS.g:880:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:881:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:881:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:882:5: lv_name_1_0= ruleEString
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
    // InternalCBS.g:903:1: entryRuleLinker returns [EObject current=null] : iv_ruleLinker= ruleLinker EOF ;
    public final EObject entryRuleLinker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinker = null;


        try {
            // InternalCBS.g:903:47: (iv_ruleLinker= ruleLinker EOF )
            // InternalCBS.g:904:2: iv_ruleLinker= ruleLinker EOF
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
    // InternalCBS.g:910:1: ruleLinker returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '<->' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleLinker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCBS.g:916:2: ( ( ( ( ruleEString ) ) (otherlv_1= '<->' ( ( ruleEString ) ) )* ) )
            // InternalCBS.g:917:2: ( ( ( ruleEString ) ) (otherlv_1= '<->' ( ( ruleEString ) ) )* )
            {
            // InternalCBS.g:917:2: ( ( ( ruleEString ) ) (otherlv_1= '<->' ( ( ruleEString ) ) )* )
            // InternalCBS.g:918:3: ( ( ruleEString ) ) (otherlv_1= '<->' ( ( ruleEString ) ) )*
            {
            // InternalCBS.g:918:3: ( ( ruleEString ) )
            // InternalCBS.g:919:4: ( ruleEString )
            {
            // InternalCBS.g:919:4: ( ruleEString )
            // InternalCBS.g:920:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_0_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:934:3: (otherlv_1= '<->' ( ( ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCBS.g:935:4: otherlv_1= '<->' ( ( ruleEString ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLinkerAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalCBS.g:939:4: ( ( ruleEString ) )
            	    // InternalCBS.g:940:5: ( ruleEString )
            	    {
            	    // InternalCBS.g:940:5: ( ruleEString )
            	    // InternalCBS.g:941:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkerRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // InternalCBS.g:960:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalCBS.g:960:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalCBS.g:961:2: iv_ruleAssembly= ruleAssembly EOF
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
    // InternalCBS.g:967:1: ruleAssembly returns [EObject current=null] : ( () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}' ) ;
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
            // InternalCBS.g:973:2: ( ( () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}' ) )
            // InternalCBS.g:974:2: ( () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}' )
            {
            // InternalCBS.g:974:2: ( () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}' )
            // InternalCBS.g:975:3: () otherlv_1= 'assembly' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )? otherlv_7= '}'
            {
            // InternalCBS.g:975:3: ()
            // InternalCBS.g:976:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
            		
            // InternalCBS.g:986:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:987:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:987:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:988:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:1009:3: ( ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCBS.g:1010:4: ( (lv_compositeComponents_4_0= ruleCompositeComponent ) ) (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )*
                    {
                    // InternalCBS.g:1010:4: ( (lv_compositeComponents_4_0= ruleCompositeComponent ) )
                    // InternalCBS.g:1011:5: (lv_compositeComponents_4_0= ruleCompositeComponent )
                    {
                    // InternalCBS.g:1011:5: (lv_compositeComponents_4_0= ruleCompositeComponent )
                    // InternalCBS.g:1012:6: lv_compositeComponents_4_0= ruleCompositeComponent
                    {

                    						newCompositeNode(grammarAccess.getAssemblyAccess().getCompositeComponentsCompositeComponentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:1029:4: (otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCBS.g:1030:5: otherlv_5= ',' ( (lv_compositeComponents_6_0= ruleCompositeComponent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_22); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAssemblyAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCBS.g:1034:5: ( (lv_compositeComponents_6_0= ruleCompositeComponent ) )
                    	    // InternalCBS.g:1035:6: (lv_compositeComponents_6_0= ruleCompositeComponent )
                    	    {
                    	    // InternalCBS.g:1035:6: (lv_compositeComponents_6_0= ruleCompositeComponent )
                    	    // InternalCBS.g:1036:7: lv_compositeComponents_6_0= ruleCompositeComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyAccess().getCompositeComponentsCompositeComponentParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCBS.g:1063:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalCBS.g:1063:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalCBS.g:1064:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
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
    // InternalCBS.g:1070:1: ruleCompositeComponent returns [EObject current=null] : ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) ;
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
            // InternalCBS.g:1076:2: ( ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) )
            // InternalCBS.g:1077:2: ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            {
            // InternalCBS.g:1077:2: ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            // InternalCBS.g:1078:3: () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )? (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )? otherlv_40= '}'
            {
            // InternalCBS.g:1078:3: ()
            // InternalCBS.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeComponentAccess().getCompositeComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_1());
            		
            // InternalCBS.g:1089:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:1090:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:1090:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:1091:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:1112:3: (otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCBS.g:1113:4: otherlv_4= 'requires' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getRequiresKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:1121:4: ( ( ruleEString ) )
                    // InternalCBS.g:1122:5: ( ruleEString )
                    {
                    // InternalCBS.g:1122:5: ( ruleEString )
                    // InternalCBS.g:1123:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiresInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1137:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCBS.g:1138:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:1142:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:1143:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:1143:6: ( ruleEString )
                    	    // InternalCBS.g:1144:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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

                    otherlv_9=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1164:3: (otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCBS.g:1165:4: otherlv_10= 'provides' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getProvidesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:1173:4: ( ( ruleEString ) )
                    // InternalCBS.g:1174:5: ( ruleEString )
                    {
                    // InternalCBS.g:1174:5: ( ruleEString )
                    // InternalCBS.g:1175:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidesInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:1189:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalCBS.g:1190:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:1194:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:1195:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:1195:6: ( ruleEString )
                    	    // InternalCBS.g:1196:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1216:3: (otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCBS.g:1217:4: otherlv_16= 'childContexts' otherlv_17= '{' ( (lv_childContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getChildContextsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:1225:4: ( (lv_childContexts_18_0= ruleAssemblyContext ) )
                    // InternalCBS.g:1226:5: (lv_childContexts_18_0= ruleAssemblyContext )
                    {
                    // InternalCBS.g:1226:5: (lv_childContexts_18_0= ruleAssemblyContext )
                    // InternalCBS.g:1227:6: lv_childContexts_18_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getChildContextsAssemblyContextParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:1244:4: (otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalCBS.g:1245:5: otherlv_19= ',' ( (lv_childContexts_20_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getCompositeComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:1249:5: ( (lv_childContexts_20_0= ruleAssemblyContext ) )
                    	    // InternalCBS.g:1250:6: (lv_childContexts_20_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCBS.g:1250:6: (lv_childContexts_20_0= ruleAssemblyContext )
                    	    // InternalCBS.g:1251:7: lv_childContexts_20_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getChildContextsAssemblyContextParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1274:3: (otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCBS.g:1275:4: otherlv_22= 'assemblyConnectors' otherlv_23= '{' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_22, grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCBS.g:1283:4: ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) )
                    // InternalCBS.g:1284:5: (lv_assemblyConnectors_24_0= ruleAssemblyConnector )
                    {
                    // InternalCBS.g:1284:5: (lv_assemblyConnectors_24_0= ruleAssemblyConnector )
                    // InternalCBS.g:1285:6: lv_assemblyConnectors_24_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:1302:4: (otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCBS.g:1303:5: otherlv_25= ',' ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCBS.g:1307:5: ( (lv_assemblyConnectors_26_0= ruleAssemblyConnector ) )
                    	    // InternalCBS.g:1308:6: (lv_assemblyConnectors_26_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalCBS.g:1308:6: (lv_assemblyConnectors_26_0= ruleAssemblyConnector )
                    	    // InternalCBS.g:1309:7: lv_assemblyConnectors_26_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_27, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1332:3: (otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCBS.g:1333:4: otherlv_28= 'requiredDelegationConnectors' otherlv_29= '{' ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) ) (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getRequiredDelegationConnectorsKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCBS.g:1341:4: ( (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector ) )
                    // InternalCBS.g:1342:5: (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector )
                    {
                    // InternalCBS.g:1342:5: (lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector )
                    // InternalCBS.g:1343:6: lv_requiredDelegationConnectors_30_0= ruleRequiredDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:1360:4: (otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalCBS.g:1361:5: otherlv_31= ',' ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getCompositeComponentAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCBS.g:1365:5: ( (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector ) )
                    	    // InternalCBS.g:1366:6: (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector )
                    	    {
                    	    // InternalCBS.g:1366:6: (lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector )
                    	    // InternalCBS.g:1367:7: lv_requiredDelegationConnectors_32_0= ruleRequiredDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_33, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1390:3: (otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCBS.g:1391:4: otherlv_34= 'providedDelegationConnectors' otherlv_35= '{' ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) ) (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_34, grammarAccess.getCompositeComponentAccess().getProvidedDelegationConnectorsKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_35, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCBS.g:1399:4: ( (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector ) )
                    // InternalCBS.g:1400:5: (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector )
                    {
                    // InternalCBS.g:1400:5: (lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector )
                    // InternalCBS.g:1401:6: lv_providedDelegationConnectors_36_0= ruleProvidedDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:1418:4: (otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalCBS.g:1419:5: otherlv_37= ',' ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCBS.g:1423:5: ( (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector ) )
                    	    // InternalCBS.g:1424:6: (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector )
                    	    {
                    	    // InternalCBS.g:1424:6: (lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector )
                    	    // InternalCBS.g:1425:7: lv_providedDelegationConnectors_38_0= ruleProvidedDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_39, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_40=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCBS.g:1456:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalCBS.g:1456:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalCBS.g:1457:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalCBS.g:1463:1: ruleAssemblyContext returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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
            // InternalCBS.g:1469:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalCBS.g:1470:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalCBS.g:1470:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalCBS.g:1471:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'instance' ( ( ruleEString ) ) (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )? (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalCBS.g:1471:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:1472:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:1472:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:1473:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getInstanceKeyword_2());
            		
            // InternalCBS.g:1498:3: ( ( ruleEString ) )
            // InternalCBS.g:1499:4: ( ruleEString )
            {
            // InternalCBS.g:1499:4: ( ruleEString )
            // InternalCBS.g:1500:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentCrossReference_3_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:1514:3: (otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCBS.g:1515:4: otherlv_4= 'provide' otherlv_5= '(' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssemblyContextAccess().getProvideKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalCBS.g:1523:4: ( (lv_providedRoles_6_0= ruleProvidedRole ) )
                    // InternalCBS.g:1524:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    {
                    // InternalCBS.g:1524:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    // InternalCBS.g:1525:6: lv_providedRoles_6_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    // InternalCBS.g:1542:4: (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalCBS.g:1543:5: otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAssemblyContextAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:1547:5: ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    // InternalCBS.g:1548:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    {
                    	    // InternalCBS.g:1548:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    // InternalCBS.g:1549:7: lv_providedRoles_8_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,35,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1572:3: (otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCBS.g:1573:4: otherlv_10= 'require' otherlv_11= '(' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getRequireKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalCBS.g:1581:4: ( (lv_requiredRoles_12_0= ruleRequiredRole ) )
                    // InternalCBS.g:1582:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    {
                    // InternalCBS.g:1582:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    // InternalCBS.g:1583:6: lv_requiredRoles_12_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    // InternalCBS.g:1600:4: (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalCBS.g:1601:5: otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:1605:5: ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    // InternalCBS.g:1606:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    {
                    	    // InternalCBS.g:1606:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    // InternalCBS.g:1607:7: lv_requiredRoles_14_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,35,FOLLOW_14); 

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
    // InternalCBS.g:1638:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalCBS.g:1638:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalCBS.g:1639:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalCBS.g:1645:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCBS.g:1651:2: ( (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' ) )
            // InternalCBS.g:1652:2: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' )
            {
            // InternalCBS.g:1652:2: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')' )
            // InternalCBS.g:1653:3: otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= ',' ( ( ruleEString ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getLeftParenthesisKeyword_0());
            		
            // InternalCBS.g:1657:3: ( ( ruleEString ) )
            // InternalCBS.g:1658:4: ( ruleEString )
            {
            // InternalCBS.g:1658:4: ( ruleEString )
            // InternalCBS.g:1659:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getCommaKeyword_2());
            		
            // InternalCBS.g:1677:3: ( ( ruleEString ) )
            // InternalCBS.g:1678:4: ( ruleEString )
            {
            // InternalCBS.g:1678:4: ( ruleEString )
            // InternalCBS.g:1679:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleCrossReference_3_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

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
    // InternalCBS.g:1701:1: entryRuleRequiredDelegationConnector returns [EObject current=null] : iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF ;
    public final EObject entryRuleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredDelegationConnector = null;


        try {
            // InternalCBS.g:1701:68: (iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF )
            // InternalCBS.g:1702:2: iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF
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
    // InternalCBS.g:1708:1: ruleRequiredDelegationConnector returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCBS.g:1714:2: ( ( ( ruleEString ) ) )
            // InternalCBS.g:1715:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:1715:2: ( ( ruleEString ) )
            // InternalCBS.g:1716:3: ( ruleEString )
            {
            // InternalCBS.g:1716:3: ( ruleEString )
            // InternalCBS.g:1717:4: ruleEString
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
    // InternalCBS.g:1734:1: entryRuleProvidedDelegationConnector returns [EObject current=null] : iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF ;
    public final EObject entryRuleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedDelegationConnector = null;


        try {
            // InternalCBS.g:1734:68: (iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF )
            // InternalCBS.g:1735:2: iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF
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
    // InternalCBS.g:1741:1: ruleProvidedDelegationConnector returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCBS.g:1747:2: ( ( ( ruleEString ) ) )
            // InternalCBS.g:1748:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:1748:2: ( ( ruleEString ) )
            // InternalCBS.g:1749:3: ( ruleEString )
            {
            // InternalCBS.g:1749:3: ( ruleEString )
            // InternalCBS.g:1750:4: ruleEString
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
    // InternalCBS.g:1767:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCBS.g:1767:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCBS.g:1768:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalCBS.g:1774:1: ruleProvidedRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1780:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalCBS.g:1781:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalCBS.g:1781:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) )
            // InternalCBS.g:1782:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalCBS.g:1782:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:1783:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:1783:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:1784:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalCBS.g:1801:3: ( ( ruleEString ) )
            // InternalCBS.g:1802:4: ( ruleEString )
            {
            // InternalCBS.g:1802:4: ( ruleEString )
            // InternalCBS.g:1803:5: ruleEString
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
    // InternalCBS.g:1821:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCBS.g:1821:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCBS.g:1822:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalCBS.g:1828:1: ruleRequiredRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:1834:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalCBS.g:1835:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalCBS.g:1835:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) )
            // InternalCBS.g:1836:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalCBS.g:1836:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:1837:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:1837:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:1838:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalCBS.g:1855:3: ( ( ruleEString ) )
            // InternalCBS.g:1856:4: ( ruleEString )
            {
            // InternalCBS.g:1856:4: ( ruleEString )
            // InternalCBS.g:1857:5: ruleEString
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
    // InternalCBS.g:1875:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalCBS.g:1875:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalCBS.g:1876:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalCBS.g:1882:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // InternalCBS.g:1888:2: ( ( () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalCBS.g:1889:2: ( () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalCBS.g:1889:2: ( () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalCBS.g:1890:3: () otherlv_1= 'repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalCBS.g:1890:3: ()
            // InternalCBS.g:1891:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:1905:3: (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCBS.g:1906:4: otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBS.g:1914:4: ( (lv_interfaces_5_0= ruleInterface ) )
                    // InternalCBS.g:1915:5: (lv_interfaces_5_0= ruleInterface )
                    {
                    // InternalCBS.g:1915:5: (lv_interfaces_5_0= ruleInterface )
                    // InternalCBS.g:1916:6: lv_interfaces_5_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:1933:4: (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalCBS.g:1934:5: otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBS.g:1938:5: ( (lv_interfaces_7_0= ruleInterface ) )
                    	    // InternalCBS.g:1939:6: (lv_interfaces_7_0= ruleInterface )
                    	    {
                    	    // InternalCBS.g:1939:6: (lv_interfaces_7_0= ruleInterface )
                    	    // InternalCBS.g:1940:7: lv_interfaces_7_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_37); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:1963:3: (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCBS.g:1964:4: otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleAtomicComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getComponentsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:1972:4: ( (lv_components_11_0= ruleAtomicComponent ) )
                    // InternalCBS.g:1973:5: (lv_components_11_0= ruleAtomicComponent )
                    {
                    // InternalCBS.g:1973:5: (lv_components_11_0= ruleAtomicComponent )
                    // InternalCBS.g:1974:6: lv_components_11_0= ruleAtomicComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsAtomicComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:1991:4: (otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalCBS.g:1992:5: otherlv_12= ',' ( (lv_components_13_0= ruleAtomicComponent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_38); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:1996:5: ( (lv_components_13_0= ruleAtomicComponent ) )
                    	    // InternalCBS.g:1997:6: (lv_components_13_0= ruleAtomicComponent )
                    	    {
                    	    // InternalCBS.g:1997:6: (lv_components_13_0= ruleAtomicComponent )
                    	    // InternalCBS.g:1998:7: lv_components_13_0= ruleAtomicComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsAtomicComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:2021:3: (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCBS.g:2022:4: otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getTypesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_16, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:2030:4: ( (lv_types_17_0= ruleType ) )
                    // InternalCBS.g:2031:5: (lv_types_17_0= ruleType )
                    {
                    // InternalCBS.g:2031:5: (lv_types_17_0= ruleType )
                    // InternalCBS.g:2032:6: lv_types_17_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:2049:4: (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalCBS.g:2050:5: otherlv_18= ',' ( (lv_types_19_0= ruleType ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_40); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRepositoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:2054:5: ( (lv_types_19_0= ruleType ) )
                    	    // InternalCBS.g:2055:6: (lv_types_19_0= ruleType )
                    	    {
                    	    // InternalCBS.g:2055:6: (lv_types_19_0= ruleType )
                    	    // InternalCBS.g:2056:7: lv_types_19_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCBS.g:2087:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCBS.g:2087:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCBS.g:2088:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalCBS.g:2094:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}' ) ;
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
            // InternalCBS.g:2100:2: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}' ) )
            // InternalCBS.g:2101:2: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}' )
            {
            // InternalCBS.g:2101:2: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}' )
            // InternalCBS.g:2102:3: () otherlv_1= 'interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )? otherlv_7= '}'
            {
            // InternalCBS.g:2102:3: ()
            // InternalCBS.g:2103:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCBS.g:2113:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:2114:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:2114:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:2115:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:2136:3: ( ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCBS.g:2137:4: ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )*
                    {
                    // InternalCBS.g:2137:4: ( (lv_signatures_4_0= ruleSignature ) )
                    // InternalCBS.g:2138:5: (lv_signatures_4_0= ruleSignature )
                    {
                    // InternalCBS.g:2138:5: (lv_signatures_4_0= ruleSignature )
                    // InternalCBS.g:2139:6: lv_signatures_4_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:2156:4: (otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalCBS.g:2157:5: otherlv_5= ',' ( (lv_signatures_6_0= ruleSignature ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCBS.g:2161:5: ( (lv_signatures_6_0= ruleSignature ) )
                    	    // InternalCBS.g:2162:6: (lv_signatures_6_0= ruleSignature )
                    	    {
                    	    // InternalCBS.g:2162:6: (lv_signatures_6_0= ruleSignature )
                    	    // InternalCBS.g:2163:7: lv_signatures_6_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCBS.g:2190:1: entryRuleAtomicComponent returns [EObject current=null] : iv_ruleAtomicComponent= ruleAtomicComponent EOF ;
    public final EObject entryRuleAtomicComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicComponent = null;


        try {
            // InternalCBS.g:2190:56: (iv_ruleAtomicComponent= ruleAtomicComponent EOF )
            // InternalCBS.g:2191:2: iv_ruleAtomicComponent= ruleAtomicComponent EOF
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
    // InternalCBS.g:2197:1: ruleAtomicComponent returns [EObject current=null] : ( () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // InternalCBS.g:2203:2: ( ( () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalCBS.g:2204:2: ( () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalCBS.g:2204:2: ( () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalCBS.g:2205:3: () otherlv_1= 'atomicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalCBS.g:2205:3: ()
            // InternalCBS.g:2206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicComponentAccess().getAtomicComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicComponentAccess().getAtomicComponentKeyword_1());
            		
            // InternalCBS.g:2216:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:2217:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:2217:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:2218:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtomicComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:2239:3: (otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==31) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCBS.g:2240:4: otherlv_4= 'provides' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicComponentAccess().getProvidesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBS.g:2248:4: ( ( ruleEString ) )
                    // InternalCBS.g:2249:5: ( ruleEString )
                    {
                    // InternalCBS.g:2249:5: ( ruleEString )
                    // InternalCBS.g:2250:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2264:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalCBS.g:2265:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAtomicComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBS.g:2269:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:2270:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:2270:6: ( ruleEString )
                    	    // InternalCBS.g:2271:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_43); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:2291:3: (otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCBS.g:2292:4: otherlv_10= 'requires' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getAtomicComponentAccess().getRequiresKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBS.g:2300:4: ( ( ruleEString ) )
                    // InternalCBS.g:2301:5: ( ruleEString )
                    {
                    // InternalCBS.g:2301:5: ( ruleEString )
                    // InternalCBS.g:2302:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBS.g:2316:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalCBS.g:2317:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAtomicComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBS.g:2321:5: ( ( ruleEString ) )
                    	    // InternalCBS.g:2322:6: ( ruleEString )
                    	    {
                    	    // InternalCBS.g:2322:6: ( ruleEString )
                    	    // InternalCBS.g:2323:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_44); 

                    				newLeafNode(otherlv_15, grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBS.g:2343:3: (otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCBS.g:2344:4: otherlv_16= 'services' otherlv_17= '{' ( (lv_services_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getAtomicComponentAccess().getServicesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_17, grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBS.g:2352:4: ( (lv_services_18_0= ruleService ) )
                    // InternalCBS.g:2353:5: (lv_services_18_0= ruleService )
                    {
                    // InternalCBS.g:2353:5: (lv_services_18_0= ruleService )
                    // InternalCBS.g:2354:6: lv_services_18_0= ruleService
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

                    // InternalCBS.g:2371:4: (otherlv_19= ',' ( (lv_services_20_0= ruleService ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalCBS.g:2372:5: otherlv_19= ',' ( (lv_services_20_0= ruleService ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_45); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getAtomicComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBS.g:2376:5: ( (lv_services_20_0= ruleService ) )
                    	    // InternalCBS.g:2377:6: (lv_services_20_0= ruleService )
                    	    {
                    	    // InternalCBS.g:2377:6: (lv_services_20_0= ruleService )
                    	    // InternalCBS.g:2378:7: lv_services_20_0= ruleService
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_14); 

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
    // InternalCBS.g:2409:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalCBS.g:2409:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalCBS.g:2410:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalCBS.g:2416:1: ruleSignature returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalCBS.g:2422:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) )
            // InternalCBS.g:2423:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            {
            // InternalCBS.g:2423:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            // InternalCBS.g:2424:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
            {
            // InternalCBS.g:2424:3: ( ( ruleEString ) )
            // InternalCBS.g:2425:4: ( ruleEString )
            {
            // InternalCBS.g:2425:4: ( ruleEString )
            // InternalCBS.g:2426:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2440:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:2441:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:2441:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:2442:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,34,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCBS.g:2463:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCBS.g:2464:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalCBS.g:2464:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalCBS.g:2465:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalCBS.g:2465:5: (lv_parameters_3_0= ruleParameter )
                    // InternalCBS.g:2466:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    // InternalCBS.g:2483:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalCBS.g:2484:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCBS.g:2488:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalCBS.g:2489:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalCBS.g:2489:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalCBS.g:2490:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

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
    // InternalCBS.g:2517:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCBS.g:2517:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCBS.g:2518:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCBS.g:2524:1: ruleParameter returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2530:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCBS.g:2531:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCBS.g:2531:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalCBS.g:2532:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCBS.g:2532:3: ( ( ruleEString ) )
            // InternalCBS.g:2533:4: ( ruleEString )
            {
            // InternalCBS.g:2533:4: ( ruleEString )
            // InternalCBS.g:2534:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2548:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:2549:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:2549:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:2550:5: lv_name_1_0= ruleEString
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
    // InternalCBS.g:2571:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalCBS.g:2571:45: (iv_ruleType= ruleType EOF )
            // InternalCBS.g:2572:2: iv_ruleType= ruleType EOF
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
    // InternalCBS.g:2578:1: ruleType returns [EObject current=null] : (this_Void_0= ruleVoid | this_ParameterType_1= ruleParameterType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Void_0 = null;

        EObject this_ParameterType_1 = null;



        	enterRule();

        try {
            // InternalCBS.g:2584:2: ( (this_Void_0= ruleVoid | this_ParameterType_1= ruleParameterType ) )
            // InternalCBS.g:2585:2: (this_Void_0= ruleVoid | this_ParameterType_1= ruleParameterType )
            {
            // InternalCBS.g:2585:2: (this_Void_0= ruleVoid | this_ParameterType_1= ruleParameterType )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_ID)) ) {
                alt51=1;
            }
            else if ( (LA51_0==44||(LA51_0>=63 && LA51_0<=64)) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCBS.g:2586:3: this_Void_0= ruleVoid
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
                    // InternalCBS.g:2595:3: this_ParameterType_1= ruleParameterType
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
    // InternalCBS.g:2607:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalCBS.g:2607:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalCBS.g:2608:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalCBS.g:2614:1: ruleParameterType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType | this_CollectionType_2= ruleCollectionType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_ComplexType_1 = null;

        EObject this_CollectionType_2 = null;



        	enterRule();

        try {
            // InternalCBS.g:2620:2: ( (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType | this_CollectionType_2= ruleCollectionType ) )
            // InternalCBS.g:2621:2: (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType | this_CollectionType_2= ruleCollectionType )
            {
            // InternalCBS.g:2621:2: (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType | this_CollectionType_2= ruleCollectionType )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==44) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_STRING) ) {
                    int LA52_3 = input.LA(3);

                    if ( ((LA52_3>=55 && LA52_3<=62)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_3==12) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA52_1==RULE_ID) ) {
                    int LA52_4 = input.LA(3);

                    if ( (LA52_4==12) ) {
                        alt52=2;
                    }
                    else if ( ((LA52_4>=55 && LA52_4<=62)) ) {
                        alt52=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA52_0>=63 && LA52_0<=64)) ) {
                alt52=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalCBS.g:2622:3: this_SimpleType_0= ruleSimpleType
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
                    // InternalCBS.g:2631:3: this_ComplexType_1= ruleComplexType
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
                    // InternalCBS.g:2640:3: this_CollectionType_2= ruleCollectionType
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
    // InternalCBS.g:2652:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalCBS.g:2652:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalCBS.g:2653:2: iv_ruleSimpleType= ruleSimpleType EOF
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
    // InternalCBS.g:2659:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleSimpleTypeEnum ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2665:2: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleSimpleTypeEnum ) ) ) )
            // InternalCBS.g:2666:2: (otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleSimpleTypeEnum ) ) )
            {
            // InternalCBS.g:2666:2: (otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleSimpleTypeEnum ) ) )
            // InternalCBS.g:2667:3: otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) ( (lv_type_2_0= ruleSimpleTypeEnum ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0());
            		
            // InternalCBS.g:2671:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:2672:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:2672:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:2673:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.CBS.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBS.g:2690:3: ( (lv_type_2_0= ruleSimpleTypeEnum ) )
            // InternalCBS.g:2691:4: (lv_type_2_0= ruleSimpleTypeEnum )
            {
            // InternalCBS.g:2691:4: (lv_type_2_0= ruleSimpleTypeEnum )
            // InternalCBS.g:2692:5: lv_type_2_0= ruleSimpleTypeEnum
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleSimpleTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
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
    // InternalCBS.g:2713:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalCBS.g:2713:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalCBS.g:2714:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalCBS.g:2720:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}' ) ;
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
            // InternalCBS.g:2726:2: ( ( () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}' ) )
            // InternalCBS.g:2727:2: ( () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}' )
            {
            // InternalCBS.g:2727:2: ( () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}' )
            // InternalCBS.g:2728:3: () otherlv_1= 'type' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )? otherlv_7= '}'
            {
            // InternalCBS.g:2728:3: ()
            // InternalCBS.g:2729:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getTypeKeyword_1());
            		
            // InternalCBS.g:2739:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBS.g:2740:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBS.g:2740:4: (lv_name_2_0= ruleEString )
            // InternalCBS.g:2741:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBS.g:2762:3: ( ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCBS.g:2763:4: ( (lv_members_4_0= ruleComplexMember ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )*
                    {
                    // InternalCBS.g:2763:4: ( (lv_members_4_0= ruleComplexMember ) )
                    // InternalCBS.g:2764:5: (lv_members_4_0= ruleComplexMember )
                    {
                    // InternalCBS.g:2764:5: (lv_members_4_0= ruleComplexMember )
                    // InternalCBS.g:2765:6: lv_members_4_0= ruleComplexMember
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalCBS.g:2782:4: (otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalCBS.g:2783:5: otherlv_5= ',' ( (lv_members_6_0= ruleComplexMember ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalCBS.g:2787:5: ( (lv_members_6_0= ruleComplexMember ) )
                    	    // InternalCBS.g:2788:6: (lv_members_6_0= ruleComplexMember )
                    	    {
                    	    // InternalCBS.g:2788:6: (lv_members_6_0= ruleComplexMember )
                    	    // InternalCBS.g:2789:7: lv_members_6_0= ruleComplexMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCBS.g:2816:1: entryRuleComplexMember returns [EObject current=null] : iv_ruleComplexMember= ruleComplexMember EOF ;
    public final EObject entryRuleComplexMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMember = null;


        try {
            // InternalCBS.g:2816:54: (iv_ruleComplexMember= ruleComplexMember EOF )
            // InternalCBS.g:2817:2: iv_ruleComplexMember= ruleComplexMember EOF
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
    // InternalCBS.g:2823:1: ruleComplexMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleComplexMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2829:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) )
            // InternalCBS.g:2830:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            {
            // InternalCBS.g:2830:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            // InternalCBS.g:2831:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )
            {
            // InternalCBS.g:2831:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBS.g:2832:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBS.g:2832:4: (lv_name_0_0= ruleEString )
            // InternalCBS.g:2833:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
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

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexMemberAccess().getColonKeyword_1());
            		
            // InternalCBS.g:2854:3: ( ( ruleEString ) )
            // InternalCBS.g:2855:4: ( ruleEString )
            {
            // InternalCBS.g:2855:4: ( ruleEString )
            // InternalCBS.g:2856:5: ruleEString
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
    // InternalCBS.g:2874:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalCBS.g:2874:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalCBS.g:2875:2: iv_ruleVoid= ruleVoid EOF
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
    // InternalCBS.g:2881:1: ruleVoid returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2887:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCBS.g:2888:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCBS.g:2888:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalCBS.g:2889:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCBS.g:2889:3: ()
            // InternalCBS.g:2890:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            // InternalCBS.g:2896:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBS.g:2897:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBS.g:2897:4: (lv_name_1_0= ruleEString )
            // InternalCBS.g:2898:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVoidRule());
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
    // $ANTLR end "ruleVoid"


    // $ANTLR start "entryRuleCollectionType"
    // InternalCBS.g:2919:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalCBS.g:2919:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalCBS.g:2920:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalCBS.g:2926:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalCBS.g:2932:2: ( ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalCBS.g:2933:2: ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalCBS.g:2933:2: ( ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ( (lv_name_4_0= ruleEString ) ) )
            // InternalCBS.g:2934:3: ( (lv_type_0_0= ruleCollectionTypeEnum ) ) otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= '>' ( (lv_name_4_0= ruleEString ) )
            {
            // InternalCBS.g:2934:3: ( (lv_type_0_0= ruleCollectionTypeEnum ) )
            // InternalCBS.g:2935:4: (lv_type_0_0= ruleCollectionTypeEnum )
            {
            // InternalCBS.g:2935:4: (lv_type_0_0= ruleCollectionTypeEnum )
            // InternalCBS.g:2936:5: lv_type_0_0= ruleCollectionTypeEnum
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getTypeCollectionTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_49);
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

            otherlv_1=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalCBS.g:2957:3: ( ( ruleEString ) )
            // InternalCBS.g:2958:4: ( ruleEString )
            {
            // InternalCBS.g:2958:4: ( ruleEString )
            // InternalCBS.g:2959:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getInnerTypeParameterTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_50);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3());
            		
            // InternalCBS.g:2977:3: ( (lv_name_4_0= ruleEString ) )
            // InternalCBS.g:2978:4: (lv_name_4_0= ruleEString )
            {
            // InternalCBS.g:2978:4: (lv_name_4_0= ruleEString )
            // InternalCBS.g:2979:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleAbstractAction"
    // InternalCBS.g:3000:1: entryRuleAbstractAction returns [EObject current=null] : iv_ruleAbstractAction= ruleAbstractAction EOF ;
    public final EObject entryRuleAbstractAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAction = null;


        try {
            // InternalCBS.g:3000:55: (iv_ruleAbstractAction= ruleAbstractAction EOF )
            // InternalCBS.g:3001:2: iv_ruleAbstractAction= ruleAbstractAction EOF
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
    // InternalCBS.g:3007:1: ruleAbstractAction returns [EObject current=null] : (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction ) ;
    public final EObject ruleAbstractAction() throws RecognitionException {
        EObject current = null;

        EObject this_InternalAction_0 = null;

        EObject this_ExternalCallAction_1 = null;

        EObject this_BranchAction_2 = null;

        EObject this_LoopAction_3 = null;



        	enterRule();

        try {
            // InternalCBS.g:3013:2: ( (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction ) )
            // InternalCBS.g:3014:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction )
            {
            // InternalCBS.g:3014:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCallAction_1= ruleExternalCallAction | this_BranchAction_2= ruleBranchAction | this_LoopAction_3= ruleLoopAction )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt55=1;
                }
                break;
            case 51:
                {
                alt55=2;
                }
                break;
            case 52:
                {
                alt55=3;
                }
                break;
            case 54:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalCBS.g:3015:3: this_InternalAction_0= ruleInternalAction
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
                    // InternalCBS.g:3024:3: this_ExternalCallAction_1= ruleExternalCallAction
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
                    // InternalCBS.g:3033:3: this_BranchAction_2= ruleBranchAction
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
                    // InternalCBS.g:3042:3: this_LoopAction_3= ruleLoopAction
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
    // InternalCBS.g:3054:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalCBS.g:3054:48: (iv_ruleService= ruleService EOF )
            // InternalCBS.g:3055:2: iv_ruleService= ruleService EOF
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
    // InternalCBS.g:3061:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
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
            // InternalCBS.g:3067:2: ( (otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:3068:2: (otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:3068:2: (otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:3069:3: otherlv_0= 'service' ( ( ruleEString ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalCBS.g:3073:3: ( ( ruleEString ) )
            // InternalCBS.g:3074:4: ( ruleEString )
            {
            // InternalCBS.g:3074:4: ( ruleEString )
            // InternalCBS.g:3075:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getImplementsSignatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:3093:3: ( (lv_actions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:3094:4: (lv_actions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:3094:4: (lv_actions_3_0= ruleAbstractAction )
            // InternalCBS.g:3095:5: lv_actions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalCBS.g:3112:3: (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==49) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalCBS.g:3113:4: otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,49,FOLLOW_51); 

            	    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalCBS.g:3117:4: ( (lv_actions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:3118:5: (lv_actions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:3118:5: (lv_actions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:3119:6: lv_actions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
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
            	    break loop56;
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
    // InternalCBS.g:3145:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalCBS.g:3145:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalCBS.g:3146:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalCBS.g:3152:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'internalCall' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCBS.g:3158:2: ( ( () otherlv_1= 'internalCall' ) )
            // InternalCBS.g:3159:2: ( () otherlv_1= 'internalCall' )
            {
            // InternalCBS.g:3159:2: ( () otherlv_1= 'internalCall' )
            // InternalCBS.g:3160:3: () otherlv_1= 'internalCall'
            {
            // InternalCBS.g:3160:3: ()
            // InternalCBS.g:3161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

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
    // InternalCBS.g:3175:1: entryRuleExternalCallAction returns [EObject current=null] : iv_ruleExternalCallAction= ruleExternalCallAction EOF ;
    public final EObject entryRuleExternalCallAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCallAction = null;


        try {
            // InternalCBS.g:3175:59: (iv_ruleExternalCallAction= ruleExternalCallAction EOF )
            // InternalCBS.g:3176:2: iv_ruleExternalCallAction= ruleExternalCallAction EOF
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
    // InternalCBS.g:3182:1: ruleExternalCallAction returns [EObject current=null] : (otherlv_0= 'externalCall' ( ( ruleEString ) ) ) ;
    public final EObject ruleExternalCallAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCBS.g:3188:2: ( (otherlv_0= 'externalCall' ( ( ruleEString ) ) ) )
            // InternalCBS.g:3189:2: (otherlv_0= 'externalCall' ( ( ruleEString ) ) )
            {
            // InternalCBS.g:3189:2: (otherlv_0= 'externalCall' ( ( ruleEString ) ) )
            // InternalCBS.g:3190:3: otherlv_0= 'externalCall' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallActionAccess().getExternalCallKeyword_0());
            		
            // InternalCBS.g:3194:3: ( ( ruleEString ) )
            // InternalCBS.g:3195:4: ( ruleEString )
            {
            // InternalCBS.g:3195:4: ( ruleEString )
            // InternalCBS.g:3196:5: ruleEString
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
    // InternalCBS.g:3214:1: entryRuleBranchAction returns [EObject current=null] : iv_ruleBranchAction= ruleBranchAction EOF ;
    public final EObject entryRuleBranchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchAction = null;


        try {
            // InternalCBS.g:3214:53: (iv_ruleBranchAction= ruleBranchAction EOF )
            // InternalCBS.g:3215:2: iv_ruleBranchAction= ruleBranchAction EOF
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
    // InternalCBS.g:3221:1: ruleBranchAction returns [EObject current=null] : (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' ) ;
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
            // InternalCBS.g:3227:2: ( (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' ) )
            // InternalCBS.g:3228:2: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' )
            {
            // InternalCBS.g:3228:2: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}' )
            // InternalCBS.g:3229:3: otherlv_0= 'branch' otherlv_1= '{' ( (lv_branches_2_0= ruleBranchTransition ) ) (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchActionAccess().getBranchKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCBS.g:3237:3: ( (lv_branches_2_0= ruleBranchTransition ) )
            // InternalCBS.g:3238:4: (lv_branches_2_0= ruleBranchTransition )
            {
            // InternalCBS.g:3238:4: (lv_branches_2_0= ruleBranchTransition )
            // InternalCBS.g:3239:5: lv_branches_2_0= ruleBranchTransition
            {

            					newCompositeNode(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalCBS.g:3256:3: (otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==14) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalCBS.g:3257:4: otherlv_3= ',' ( (lv_branches_4_0= ruleBranchTransition ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBranchActionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCBS.g:3261:4: ( (lv_branches_4_0= ruleBranchTransition ) )
            	    // InternalCBS.g:3262:5: (lv_branches_4_0= ruleBranchTransition )
            	    {
            	    // InternalCBS.g:3262:5: (lv_branches_4_0= ruleBranchTransition )
            	    // InternalCBS.g:3263:6: lv_branches_4_0= ruleBranchTransition
            	    {

            	    						newCompositeNode(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_3_1_0());
            	    					
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


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalCBS.g:3289:1: entryRuleBranchTransition returns [EObject current=null] : iv_ruleBranchTransition= ruleBranchTransition EOF ;
    public final EObject entryRuleBranchTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchTransition = null;


        try {
            // InternalCBS.g:3289:57: (iv_ruleBranchTransition= ruleBranchTransition EOF )
            // InternalCBS.g:3290:2: iv_ruleBranchTransition= ruleBranchTransition EOF
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
    // InternalCBS.g:3296:1: ruleBranchTransition returns [EObject current=null] : ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
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
            // InternalCBS.g:3302:2: ( ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:3303:2: ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:3303:2: ( ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:3304:3: ( (lv_branchCondition_0_0= ruleEString ) ) otherlv_1= '?' otherlv_2= '{' ( (lv_actions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            // InternalCBS.g:3304:3: ( (lv_branchCondition_0_0= ruleEString ) )
            // InternalCBS.g:3305:4: (lv_branchCondition_0_0= ruleEString )
            {
            // InternalCBS.g:3305:4: (lv_branchCondition_0_0= ruleEString )
            // InternalCBS.g:3306:5: lv_branchCondition_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchTransitionAccess().getBranchConditionEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
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

            otherlv_1=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchTransitionAccess().getQuestionMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:3331:3: ( (lv_actions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:3332:4: (lv_actions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:3332:4: (lv_actions_3_0= ruleAbstractAction )
            // InternalCBS.g:3333:5: lv_actions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalCBS.g:3350:3: (otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==49) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalCBS.g:3351:4: otherlv_4= ';' ( (lv_actions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,49,FOLLOW_51); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBranchTransitionAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalCBS.g:3355:4: ( (lv_actions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:3356:5: (lv_actions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:3356:5: (lv_actions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:3357:6: lv_actions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
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
            	    break loop58;
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
    // InternalCBS.g:3383:1: entryRuleLoopAction returns [EObject current=null] : iv_ruleLoopAction= ruleLoopAction EOF ;
    public final EObject entryRuleLoopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopAction = null;


        try {
            // InternalCBS.g:3383:51: (iv_ruleLoopAction= ruleLoopAction EOF )
            // InternalCBS.g:3384:2: iv_ruleLoopAction= ruleLoopAction EOF
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
    // InternalCBS.g:3390:1: ruleLoopAction returns [EObject current=null] : ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) ;
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
            // InternalCBS.g:3396:2: ( ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' ) )
            // InternalCBS.g:3397:2: ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            {
            // InternalCBS.g:3397:2: ( () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}' )
            // InternalCBS.g:3398:3: () otherlv_1= 'loop' otherlv_2= '{' ( (lv_bodyActions_3_0= ruleAbstractAction ) ) (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )* otherlv_6= '}'
            {
            // InternalCBS.g:3398:3: ()
            // InternalCBS.g:3399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopActionAccess().getLoopActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopActionAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBS.g:3413:3: ( (lv_bodyActions_3_0= ruleAbstractAction ) )
            // InternalCBS.g:3414:4: (lv_bodyActions_3_0= ruleAbstractAction )
            {
            // InternalCBS.g:3414:4: (lv_bodyActions_3_0= ruleAbstractAction )
            // InternalCBS.g:3415:5: lv_bodyActions_3_0= ruleAbstractAction
            {

            					newCompositeNode(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalCBS.g:3432:3: (otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==49) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCBS.g:3433:4: otherlv_4= ';' ( (lv_bodyActions_5_0= ruleAbstractAction ) )
            	    {
            	    otherlv_4=(Token)match(input,49,FOLLOW_51); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLoopActionAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalCBS.g:3437:4: ( (lv_bodyActions_5_0= ruleAbstractAction ) )
            	    // InternalCBS.g:3438:5: (lv_bodyActions_5_0= ruleAbstractAction )
            	    {
            	    // InternalCBS.g:3438:5: (lv_bodyActions_5_0= ruleAbstractAction )
            	    // InternalCBS.g:3439:6: lv_bodyActions_5_0= ruleAbstractAction
            	    {

            	    						newCompositeNode(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
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
            	    break loop59;
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
    // InternalCBS.g:3465:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCBS.g:3465:47: (iv_ruleEString= ruleEString EOF )
            // InternalCBS.g:3466:2: iv_ruleEString= ruleEString EOF
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
    // InternalCBS.g:3472:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCBS.g:3478:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCBS.g:3479:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCBS.g:3479:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalCBS.g:3480:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCBS.g:3488:3: this_ID_1= RULE_ID
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
    // InternalCBS.g:3499:1: ruleSimpleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) ) ;
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
            // InternalCBS.g:3505:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) ) )
            // InternalCBS.g:3506:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) )
            {
            // InternalCBS.g:3506:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Char' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Long' ) )
            int alt61=8;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt61=1;
                }
                break;
            case 56:
                {
                alt61=2;
                }
                break;
            case 57:
                {
                alt61=3;
                }
                break;
            case 58:
                {
                alt61=4;
                }
                break;
            case 59:
                {
                alt61=5;
                }
                break;
            case 60:
                {
                alt61=6;
                }
                break;
            case 61:
                {
                alt61=7;
                }
                break;
            case 62:
                {
                alt61=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalCBS.g:3507:3: (enumLiteral_0= 'String' )
                    {
                    // InternalCBS.g:3507:3: (enumLiteral_0= 'String' )
                    // InternalCBS.g:3508:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:3515:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalCBS.g:3515:3: (enumLiteral_1= 'Int' )
                    // InternalCBS.g:3516:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCBS.g:3523:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalCBS.g:3523:3: (enumLiteral_2= 'Boolean' )
                    // InternalCBS.g:3524:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCBS.g:3531:3: (enumLiteral_3= 'Char' )
                    {
                    // InternalCBS.g:3531:3: (enumLiteral_3= 'Char' )
                    // InternalCBS.g:3532:4: enumLiteral_3= 'Char'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCBS.g:3539:3: (enumLiteral_4= 'Date' )
                    {
                    // InternalCBS.g:3539:3: (enumLiteral_4= 'Date' )
                    // InternalCBS.g:3540:4: enumLiteral_4= 'Date'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCBS.g:3547:3: (enumLiteral_5= 'Double' )
                    {
                    // InternalCBS.g:3547:3: (enumLiteral_5= 'Double' )
                    // InternalCBS.g:3548:4: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCBS.g:3555:3: (enumLiteral_6= 'Float' )
                    {
                    // InternalCBS.g:3555:3: (enumLiteral_6= 'Float' )
                    // InternalCBS.g:3556:4: enumLiteral_6= 'Float'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCBS.g:3563:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalCBS.g:3563:3: (enumLiteral_7= 'Long' )
                    // InternalCBS.g:3564:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,62,FOLLOW_2); 

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
    // InternalCBS.g:3574:1: ruleCollectionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) ) ;
    public final Enumerator ruleCollectionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCBS.g:3580:2: ( ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) ) )
            // InternalCBS.g:3581:2: ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) )
            {
            // InternalCBS.g:3581:2: ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'Map' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==63) ) {
                alt62=1;
            }
            else if ( (LA62_0==64) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalCBS.g:3582:3: (enumLiteral_0= 'List' )
                    {
                    // InternalCBS.g:3582:3: (enumLiteral_0= 'List' )
                    // InternalCBS.g:3583:4: enumLiteral_0= 'List'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getCollectionTypeEnumAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCollectionTypeEnumAccess().getListEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:3590:3: (enumLiteral_1= 'Map' )
                    {
                    // InternalCBS.g:3590:3: (enumLiteral_1= 'Map' )
                    // InternalCBS.g:3591:4: enumLiteral_1= 'Map'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002011000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000F2000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C007A000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000008007A000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001200008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001C000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000100000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000800C0008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080040008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x7F80000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x005C000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});

}
