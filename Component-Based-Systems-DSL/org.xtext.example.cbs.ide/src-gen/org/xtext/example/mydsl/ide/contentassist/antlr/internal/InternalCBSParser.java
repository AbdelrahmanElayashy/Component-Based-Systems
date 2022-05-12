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
import org.xtext.example.mydsl.services.CBSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCBSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'Long'", "'System'", "'{'", "'allocation'", "'}'", "'childContexts'", "','", "'assemblyConnectors'", "'requiredDelegationConnectors'", "'providedDelegationConnectors'", "'AssemblyContext'", "'instantiates'", "'providedRoles'", "'requiredRoles'", "'AssemblyConnector'", "'requiringRole'", "'providingRole'", "'RequiredDelegationConnector'", "'ProvidedDelegationConnector'", "'Allocation'", "'environment'", "'allocationContexts'", "'ProvidedRole'", "'interface'", "'RequiredRole'", "'AtomicComponent'", "'requires'", "'('", "')'", "'provides'", "'services'", "'Signature'", "'returnType'", "'parameters'", "'Parameter'", "'type'", "'SimpleType'", "'ComplexType'", "'members'", "'ComplexMember'", "'Void'", "'Service'", "'implements'", "'actions'", "'InternalAction'", "'ExternalCallAction'", "'requiredService'", "'BranchAction'", "'branches'", "'LoopAction'", "'bodyActions'", "'BranchTransition'", "'action'", "'branchCondition'", "'AllocationContext'", "'container'", "'allocates'", "'Container'", "'Linker'", "'links'"
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

    	public void setGrammarAccess(CBSGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystem"
    // InternalCBS.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalCBS.g:54:1: ( ruleSystem EOF )
            // InternalCBS.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalCBS.g:62:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:66:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalCBS.g:67:2: ( ( rule__System__Group__0 ) )
            {
            // InternalCBS.g:67:2: ( ( rule__System__Group__0 ) )
            // InternalCBS.g:68:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalCBS.g:69:3: ( rule__System__Group__0 )
            // InternalCBS.g:69:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleAbstractAction"
    // InternalCBS.g:78:1: entryRuleAbstractAction : ruleAbstractAction EOF ;
    public final void entryRuleAbstractAction() throws RecognitionException {
        try {
            // InternalCBS.g:79:1: ( ruleAbstractAction EOF )
            // InternalCBS.g:80:1: ruleAbstractAction EOF
            {
             before(grammarAccess.getAbstractActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getAbstractActionRule()); 
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
    // $ANTLR end "entryRuleAbstractAction"


    // $ANTLR start "ruleAbstractAction"
    // InternalCBS.g:87:1: ruleAbstractAction : ( ( rule__AbstractAction__Alternatives ) ) ;
    public final void ruleAbstractAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:91:2: ( ( ( rule__AbstractAction__Alternatives ) ) )
            // InternalCBS.g:92:2: ( ( rule__AbstractAction__Alternatives ) )
            {
            // InternalCBS.g:92:2: ( ( rule__AbstractAction__Alternatives ) )
            // InternalCBS.g:93:3: ( rule__AbstractAction__Alternatives )
            {
             before(grammarAccess.getAbstractActionAccess().getAlternatives()); 
            // InternalCBS.g:94:3: ( rule__AbstractAction__Alternatives )
            // InternalCBS.g:94:4: rule__AbstractAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractAction"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalCBS.g:103:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalCBS.g:104:1: ( ruleAssemblyContext EOF )
            // InternalCBS.g:105:1: ruleAssemblyContext EOF
            {
             before(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getAssemblyContextRule()); 
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
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalCBS.g:112:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:116:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalCBS.g:117:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalCBS.g:117:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalCBS.g:118:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalCBS.g:119:3: ( rule__AssemblyContext__Group__0 )
            // InternalCBS.g:119:4: rule__AssemblyContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getGroup()); 

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
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalCBS.g:128:1: entryRuleAssemblyConnector : ruleAssemblyConnector EOF ;
    public final void entryRuleAssemblyConnector() throws RecognitionException {
        try {
            // InternalCBS.g:129:1: ( ruleAssemblyConnector EOF )
            // InternalCBS.g:130:1: ruleAssemblyConnector EOF
            {
             before(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorRule()); 
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
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalCBS.g:137:1: ruleAssemblyConnector : ( ( rule__AssemblyConnector__Group__0 ) ) ;
    public final void ruleAssemblyConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:141:2: ( ( ( rule__AssemblyConnector__Group__0 ) ) )
            // InternalCBS.g:142:2: ( ( rule__AssemblyConnector__Group__0 ) )
            {
            // InternalCBS.g:142:2: ( ( rule__AssemblyConnector__Group__0 ) )
            // InternalCBS.g:143:3: ( rule__AssemblyConnector__Group__0 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getGroup()); 
            // InternalCBS.g:144:3: ( rule__AssemblyConnector__Group__0 )
            // InternalCBS.g:144:4: rule__AssemblyConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getGroup()); 

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
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleRequiredDelegationConnector"
    // InternalCBS.g:153:1: entryRuleRequiredDelegationConnector : ruleRequiredDelegationConnector EOF ;
    public final void entryRuleRequiredDelegationConnector() throws RecognitionException {
        try {
            // InternalCBS.g:154:1: ( ruleRequiredDelegationConnector EOF )
            // InternalCBS.g:155:1: ruleRequiredDelegationConnector EOF
            {
             before(grammarAccess.getRequiredDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredDelegationConnector();

            state._fsp--;

             after(grammarAccess.getRequiredDelegationConnectorRule()); 
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
    // $ANTLR end "entryRuleRequiredDelegationConnector"


    // $ANTLR start "ruleRequiredDelegationConnector"
    // InternalCBS.g:162:1: ruleRequiredDelegationConnector : ( ( rule__RequiredDelegationConnector__Group__0 ) ) ;
    public final void ruleRequiredDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:166:2: ( ( ( rule__RequiredDelegationConnector__Group__0 ) ) )
            // InternalCBS.g:167:2: ( ( rule__RequiredDelegationConnector__Group__0 ) )
            {
            // InternalCBS.g:167:2: ( ( rule__RequiredDelegationConnector__Group__0 ) )
            // InternalCBS.g:168:3: ( rule__RequiredDelegationConnector__Group__0 )
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getGroup()); 
            // InternalCBS.g:169:3: ( rule__RequiredDelegationConnector__Group__0 )
            // InternalCBS.g:169:4: rule__RequiredDelegationConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredDelegationConnectorAccess().getGroup()); 

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
    // $ANTLR end "ruleRequiredDelegationConnector"


    // $ANTLR start "entryRuleProvidedDelegationConnector"
    // InternalCBS.g:178:1: entryRuleProvidedDelegationConnector : ruleProvidedDelegationConnector EOF ;
    public final void entryRuleProvidedDelegationConnector() throws RecognitionException {
        try {
            // InternalCBS.g:179:1: ( ruleProvidedDelegationConnector EOF )
            // InternalCBS.g:180:1: ruleProvidedDelegationConnector EOF
            {
             before(grammarAccess.getProvidedDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedDelegationConnector();

            state._fsp--;

             after(grammarAccess.getProvidedDelegationConnectorRule()); 
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
    // $ANTLR end "entryRuleProvidedDelegationConnector"


    // $ANTLR start "ruleProvidedDelegationConnector"
    // InternalCBS.g:187:1: ruleProvidedDelegationConnector : ( ( rule__ProvidedDelegationConnector__Group__0 ) ) ;
    public final void ruleProvidedDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:191:2: ( ( ( rule__ProvidedDelegationConnector__Group__0 ) ) )
            // InternalCBS.g:192:2: ( ( rule__ProvidedDelegationConnector__Group__0 ) )
            {
            // InternalCBS.g:192:2: ( ( rule__ProvidedDelegationConnector__Group__0 ) )
            // InternalCBS.g:193:3: ( rule__ProvidedDelegationConnector__Group__0 )
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getGroup()); 
            // InternalCBS.g:194:3: ( rule__ProvidedDelegationConnector__Group__0 )
            // InternalCBS.g:194:4: rule__ProvidedDelegationConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedDelegationConnectorAccess().getGroup()); 

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
    // $ANTLR end "ruleProvidedDelegationConnector"


    // $ANTLR start "entryRuleEString"
    // InternalCBS.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCBS.g:204:1: ( ruleEString EOF )
            // InternalCBS.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCBS.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCBS.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCBS.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalCBS.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCBS.g:219:3: ( rule__EString__Alternatives )
            // InternalCBS.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAllocation"
    // InternalCBS.g:228:1: entryRuleAllocation : ruleAllocation EOF ;
    public final void entryRuleAllocation() throws RecognitionException {
        try {
            // InternalCBS.g:229:1: ( ruleAllocation EOF )
            // InternalCBS.g:230:1: ruleAllocation EOF
            {
             before(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocation();

            state._fsp--;

             after(grammarAccess.getAllocationRule()); 
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
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // InternalCBS.g:237:1: ruleAllocation : ( ( rule__Allocation__Group__0 ) ) ;
    public final void ruleAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:241:2: ( ( ( rule__Allocation__Group__0 ) ) )
            // InternalCBS.g:242:2: ( ( rule__Allocation__Group__0 ) )
            {
            // InternalCBS.g:242:2: ( ( rule__Allocation__Group__0 ) )
            // InternalCBS.g:243:3: ( rule__Allocation__Group__0 )
            {
             before(grammarAccess.getAllocationAccess().getGroup()); 
            // InternalCBS.g:244:3: ( rule__Allocation__Group__0 )
            // InternalCBS.g:244:4: rule__Allocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getGroup()); 

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
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalCBS.g:253:1: entryRuleProvidedRole : ruleProvidedRole EOF ;
    public final void entryRuleProvidedRole() throws RecognitionException {
        try {
            // InternalCBS.g:254:1: ( ruleProvidedRole EOF )
            // InternalCBS.g:255:1: ruleProvidedRole EOF
            {
             before(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getProvidedRoleRule()); 
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
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalCBS.g:262:1: ruleProvidedRole : ( ( rule__ProvidedRole__Group__0 ) ) ;
    public final void ruleProvidedRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:266:2: ( ( ( rule__ProvidedRole__Group__0 ) ) )
            // InternalCBS.g:267:2: ( ( rule__ProvidedRole__Group__0 ) )
            {
            // InternalCBS.g:267:2: ( ( rule__ProvidedRole__Group__0 ) )
            // InternalCBS.g:268:3: ( rule__ProvidedRole__Group__0 )
            {
             before(grammarAccess.getProvidedRoleAccess().getGroup()); 
            // InternalCBS.g:269:3: ( rule__ProvidedRole__Group__0 )
            // InternalCBS.g:269:4: rule__ProvidedRole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getGroup()); 

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
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalCBS.g:278:1: entryRuleRequiredRole : ruleRequiredRole EOF ;
    public final void entryRuleRequiredRole() throws RecognitionException {
        try {
            // InternalCBS.g:279:1: ( ruleRequiredRole EOF )
            // InternalCBS.g:280:1: ruleRequiredRole EOF
            {
             before(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getRequiredRoleRule()); 
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
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalCBS.g:287:1: ruleRequiredRole : ( ( rule__RequiredRole__Group__0 ) ) ;
    public final void ruleRequiredRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:291:2: ( ( ( rule__RequiredRole__Group__0 ) ) )
            // InternalCBS.g:292:2: ( ( rule__RequiredRole__Group__0 ) )
            {
            // InternalCBS.g:292:2: ( ( rule__RequiredRole__Group__0 ) )
            // InternalCBS.g:293:3: ( rule__RequiredRole__Group__0 )
            {
             before(grammarAccess.getRequiredRoleAccess().getGroup()); 
            // InternalCBS.g:294:3: ( rule__RequiredRole__Group__0 )
            // InternalCBS.g:294:4: rule__RequiredRole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getGroup()); 

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
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleAtomicComponent"
    // InternalCBS.g:303:1: entryRuleAtomicComponent : ruleAtomicComponent EOF ;
    public final void entryRuleAtomicComponent() throws RecognitionException {
        try {
            // InternalCBS.g:304:1: ( ruleAtomicComponent EOF )
            // InternalCBS.g:305:1: ruleAtomicComponent EOF
            {
             before(grammarAccess.getAtomicComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicComponent();

            state._fsp--;

             after(grammarAccess.getAtomicComponentRule()); 
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
    // $ANTLR end "entryRuleAtomicComponent"


    // $ANTLR start "ruleAtomicComponent"
    // InternalCBS.g:312:1: ruleAtomicComponent : ( ( rule__AtomicComponent__Group__0 ) ) ;
    public final void ruleAtomicComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:316:2: ( ( ( rule__AtomicComponent__Group__0 ) ) )
            // InternalCBS.g:317:2: ( ( rule__AtomicComponent__Group__0 ) )
            {
            // InternalCBS.g:317:2: ( ( rule__AtomicComponent__Group__0 ) )
            // InternalCBS.g:318:3: ( rule__AtomicComponent__Group__0 )
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup()); 
            // InternalCBS.g:319:3: ( rule__AtomicComponent__Group__0 )
            // InternalCBS.g:319:4: rule__AtomicComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleAtomicComponent"


    // $ANTLR start "entryRuleSignature"
    // InternalCBS.g:328:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalCBS.g:329:1: ( ruleSignature EOF )
            // InternalCBS.g:330:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalCBS.g:337:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:341:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalCBS.g:342:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalCBS.g:342:2: ( ( rule__Signature__Group__0 ) )
            // InternalCBS.g:343:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalCBS.g:344:3: ( rule__Signature__Group__0 )
            // InternalCBS.g:344:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalCBS.g:353:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalCBS.g:354:1: ( ruleParameter EOF )
            // InternalCBS.g:355:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCBS.g:362:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:366:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalCBS.g:367:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalCBS.g:367:2: ( ( rule__Parameter__Group__0 ) )
            // InternalCBS.g:368:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalCBS.g:369:3: ( rule__Parameter__Group__0 )
            // InternalCBS.g:369:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSimpleType"
    // InternalCBS.g:378:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // InternalCBS.g:379:1: ( ruleSimpleType EOF )
            // InternalCBS.g:380:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalCBS.g:387:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:391:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // InternalCBS.g:392:2: ( ( rule__SimpleType__Group__0 ) )
            {
            // InternalCBS.g:392:2: ( ( rule__SimpleType__Group__0 ) )
            // InternalCBS.g:393:3: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // InternalCBS.g:394:3: ( rule__SimpleType__Group__0 )
            // InternalCBS.g:394:4: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleComplexType"
    // InternalCBS.g:403:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalCBS.g:404:1: ( ruleComplexType EOF )
            // InternalCBS.g:405:1: ruleComplexType EOF
            {
             before(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getComplexTypeRule()); 
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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalCBS.g:412:1: ruleComplexType : ( ( rule__ComplexType__Group__0 ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:416:2: ( ( ( rule__ComplexType__Group__0 ) ) )
            // InternalCBS.g:417:2: ( ( rule__ComplexType__Group__0 ) )
            {
            // InternalCBS.g:417:2: ( ( rule__ComplexType__Group__0 ) )
            // InternalCBS.g:418:3: ( rule__ComplexType__Group__0 )
            {
             before(grammarAccess.getComplexTypeAccess().getGroup()); 
            // InternalCBS.g:419:3: ( rule__ComplexType__Group__0 )
            // InternalCBS.g:419:4: rule__ComplexType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleComplexMember"
    // InternalCBS.g:428:1: entryRuleComplexMember : ruleComplexMember EOF ;
    public final void entryRuleComplexMember() throws RecognitionException {
        try {
            // InternalCBS.g:429:1: ( ruleComplexMember EOF )
            // InternalCBS.g:430:1: ruleComplexMember EOF
            {
             before(grammarAccess.getComplexMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexMember();

            state._fsp--;

             after(grammarAccess.getComplexMemberRule()); 
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
    // $ANTLR end "entryRuleComplexMember"


    // $ANTLR start "ruleComplexMember"
    // InternalCBS.g:437:1: ruleComplexMember : ( ( rule__ComplexMember__Group__0 ) ) ;
    public final void ruleComplexMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:441:2: ( ( ( rule__ComplexMember__Group__0 ) ) )
            // InternalCBS.g:442:2: ( ( rule__ComplexMember__Group__0 ) )
            {
            // InternalCBS.g:442:2: ( ( rule__ComplexMember__Group__0 ) )
            // InternalCBS.g:443:3: ( rule__ComplexMember__Group__0 )
            {
             before(grammarAccess.getComplexMemberAccess().getGroup()); 
            // InternalCBS.g:444:3: ( rule__ComplexMember__Group__0 )
            // InternalCBS.g:444:4: rule__ComplexMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleComplexMember"


    // $ANTLR start "entryRuleVoid"
    // InternalCBS.g:453:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // InternalCBS.g:454:1: ( ruleVoid EOF )
            // InternalCBS.g:455:1: ruleVoid EOF
            {
             before(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            ruleVoid();

            state._fsp--;

             after(grammarAccess.getVoidRule()); 
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
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalCBS.g:462:1: ruleVoid : ( ( rule__Void__Group__0 ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:466:2: ( ( ( rule__Void__Group__0 ) ) )
            // InternalCBS.g:467:2: ( ( rule__Void__Group__0 ) )
            {
            // InternalCBS.g:467:2: ( ( rule__Void__Group__0 ) )
            // InternalCBS.g:468:3: ( rule__Void__Group__0 )
            {
             before(grammarAccess.getVoidAccess().getGroup()); 
            // InternalCBS.g:469:3: ( rule__Void__Group__0 )
            // InternalCBS.g:469:4: rule__Void__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Void__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoidAccess().getGroup()); 

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
    // $ANTLR end "ruleVoid"


    // $ANTLR start "entryRuleService"
    // InternalCBS.g:478:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalCBS.g:479:1: ( ruleService EOF )
            // InternalCBS.g:480:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalCBS.g:487:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:491:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalCBS.g:492:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalCBS.g:492:2: ( ( rule__Service__Group__0 ) )
            // InternalCBS.g:493:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalCBS.g:494:3: ( rule__Service__Group__0 )
            // InternalCBS.g:494:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleInternalAction"
    // InternalCBS.g:503:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalCBS.g:504:1: ( ruleInternalAction EOF )
            // InternalCBS.g:505:1: ruleInternalAction EOF
            {
             before(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalAction();

            state._fsp--;

             after(grammarAccess.getInternalActionRule()); 
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
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalCBS.g:512:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:516:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalCBS.g:517:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalCBS.g:517:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalCBS.g:518:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalCBS.g:519:3: ( rule__InternalAction__Group__0 )
            // InternalCBS.g:519:4: rule__InternalAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalActionAccess().getGroup()); 

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
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCallAction"
    // InternalCBS.g:528:1: entryRuleExternalCallAction : ruleExternalCallAction EOF ;
    public final void entryRuleExternalCallAction() throws RecognitionException {
        try {
            // InternalCBS.g:529:1: ( ruleExternalCallAction EOF )
            // InternalCBS.g:530:1: ruleExternalCallAction EOF
            {
             before(grammarAccess.getExternalCallActionRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalCallAction();

            state._fsp--;

             after(grammarAccess.getExternalCallActionRule()); 
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
    // $ANTLR end "entryRuleExternalCallAction"


    // $ANTLR start "ruleExternalCallAction"
    // InternalCBS.g:537:1: ruleExternalCallAction : ( ( rule__ExternalCallAction__Group__0 ) ) ;
    public final void ruleExternalCallAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:541:2: ( ( ( rule__ExternalCallAction__Group__0 ) ) )
            // InternalCBS.g:542:2: ( ( rule__ExternalCallAction__Group__0 ) )
            {
            // InternalCBS.g:542:2: ( ( rule__ExternalCallAction__Group__0 ) )
            // InternalCBS.g:543:3: ( rule__ExternalCallAction__Group__0 )
            {
             before(grammarAccess.getExternalCallActionAccess().getGroup()); 
            // InternalCBS.g:544:3: ( rule__ExternalCallAction__Group__0 )
            // InternalCBS.g:544:4: rule__ExternalCallAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalCallActionAccess().getGroup()); 

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
    // $ANTLR end "ruleExternalCallAction"


    // $ANTLR start "entryRuleBranchAction"
    // InternalCBS.g:553:1: entryRuleBranchAction : ruleBranchAction EOF ;
    public final void entryRuleBranchAction() throws RecognitionException {
        try {
            // InternalCBS.g:554:1: ( ruleBranchAction EOF )
            // InternalCBS.g:555:1: ruleBranchAction EOF
            {
             before(grammarAccess.getBranchActionRule()); 
            pushFollow(FOLLOW_1);
            ruleBranchAction();

            state._fsp--;

             after(grammarAccess.getBranchActionRule()); 
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
    // $ANTLR end "entryRuleBranchAction"


    // $ANTLR start "ruleBranchAction"
    // InternalCBS.g:562:1: ruleBranchAction : ( ( rule__BranchAction__Group__0 ) ) ;
    public final void ruleBranchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:566:2: ( ( ( rule__BranchAction__Group__0 ) ) )
            // InternalCBS.g:567:2: ( ( rule__BranchAction__Group__0 ) )
            {
            // InternalCBS.g:567:2: ( ( rule__BranchAction__Group__0 ) )
            // InternalCBS.g:568:3: ( rule__BranchAction__Group__0 )
            {
             before(grammarAccess.getBranchActionAccess().getGroup()); 
            // InternalCBS.g:569:3: ( rule__BranchAction__Group__0 )
            // InternalCBS.g:569:4: rule__BranchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchActionAccess().getGroup()); 

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
    // $ANTLR end "ruleBranchAction"


    // $ANTLR start "entryRuleLoopAction"
    // InternalCBS.g:578:1: entryRuleLoopAction : ruleLoopAction EOF ;
    public final void entryRuleLoopAction() throws RecognitionException {
        try {
            // InternalCBS.g:579:1: ( ruleLoopAction EOF )
            // InternalCBS.g:580:1: ruleLoopAction EOF
            {
             before(grammarAccess.getLoopActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopAction();

            state._fsp--;

             after(grammarAccess.getLoopActionRule()); 
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
    // $ANTLR end "entryRuleLoopAction"


    // $ANTLR start "ruleLoopAction"
    // InternalCBS.g:587:1: ruleLoopAction : ( ( rule__LoopAction__Group__0 ) ) ;
    public final void ruleLoopAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:591:2: ( ( ( rule__LoopAction__Group__0 ) ) )
            // InternalCBS.g:592:2: ( ( rule__LoopAction__Group__0 ) )
            {
            // InternalCBS.g:592:2: ( ( rule__LoopAction__Group__0 ) )
            // InternalCBS.g:593:3: ( rule__LoopAction__Group__0 )
            {
             before(grammarAccess.getLoopActionAccess().getGroup()); 
            // InternalCBS.g:594:3: ( rule__LoopAction__Group__0 )
            // InternalCBS.g:594:4: rule__LoopAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopActionAccess().getGroup()); 

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
    // $ANTLR end "ruleLoopAction"


    // $ANTLR start "entryRuleBranchTransition"
    // InternalCBS.g:603:1: entryRuleBranchTransition : ruleBranchTransition EOF ;
    public final void entryRuleBranchTransition() throws RecognitionException {
        try {
            // InternalCBS.g:604:1: ( ruleBranchTransition EOF )
            // InternalCBS.g:605:1: ruleBranchTransition EOF
            {
             before(grammarAccess.getBranchTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleBranchTransition();

            state._fsp--;

             after(grammarAccess.getBranchTransitionRule()); 
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
    // $ANTLR end "entryRuleBranchTransition"


    // $ANTLR start "ruleBranchTransition"
    // InternalCBS.g:612:1: ruleBranchTransition : ( ( rule__BranchTransition__Group__0 ) ) ;
    public final void ruleBranchTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:616:2: ( ( ( rule__BranchTransition__Group__0 ) ) )
            // InternalCBS.g:617:2: ( ( rule__BranchTransition__Group__0 ) )
            {
            // InternalCBS.g:617:2: ( ( rule__BranchTransition__Group__0 ) )
            // InternalCBS.g:618:3: ( rule__BranchTransition__Group__0 )
            {
             before(grammarAccess.getBranchTransitionAccess().getGroup()); 
            // InternalCBS.g:619:3: ( rule__BranchTransition__Group__0 )
            // InternalCBS.g:619:4: rule__BranchTransition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleBranchTransition"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalCBS.g:628:1: entryRuleAllocationContext : ruleAllocationContext EOF ;
    public final void entryRuleAllocationContext() throws RecognitionException {
        try {
            // InternalCBS.g:629:1: ( ruleAllocationContext EOF )
            // InternalCBS.g:630:1: ruleAllocationContext EOF
            {
             before(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationContextRule()); 
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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalCBS.g:637:1: ruleAllocationContext : ( ( rule__AllocationContext__Group__0 ) ) ;
    public final void ruleAllocationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:641:2: ( ( ( rule__AllocationContext__Group__0 ) ) )
            // InternalCBS.g:642:2: ( ( rule__AllocationContext__Group__0 ) )
            {
            // InternalCBS.g:642:2: ( ( rule__AllocationContext__Group__0 ) )
            // InternalCBS.g:643:3: ( rule__AllocationContext__Group__0 )
            {
             before(grammarAccess.getAllocationContextAccess().getGroup()); 
            // InternalCBS.g:644:3: ( rule__AllocationContext__Group__0 )
            // InternalCBS.g:644:4: rule__AllocationContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getGroup()); 

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
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleContainer"
    // InternalCBS.g:653:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalCBS.g:654:1: ( ruleContainer EOF )
            // InternalCBS.g:655:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalCBS.g:662:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:666:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalCBS.g:667:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalCBS.g:667:2: ( ( rule__Container__Group__0 ) )
            // InternalCBS.g:668:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalCBS.g:669:3: ( rule__Container__Group__0 )
            // InternalCBS.g:669:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLinker"
    // InternalCBS.g:678:1: entryRuleLinker : ruleLinker EOF ;
    public final void entryRuleLinker() throws RecognitionException {
        try {
            // InternalCBS.g:679:1: ( ruleLinker EOF )
            // InternalCBS.g:680:1: ruleLinker EOF
            {
             before(grammarAccess.getLinkerRule()); 
            pushFollow(FOLLOW_1);
            ruleLinker();

            state._fsp--;

             after(grammarAccess.getLinkerRule()); 
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
    // $ANTLR end "entryRuleLinker"


    // $ANTLR start "ruleLinker"
    // InternalCBS.g:687:1: ruleLinker : ( ( rule__Linker__Group__0 ) ) ;
    public final void ruleLinker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:691:2: ( ( ( rule__Linker__Group__0 ) ) )
            // InternalCBS.g:692:2: ( ( rule__Linker__Group__0 ) )
            {
            // InternalCBS.g:692:2: ( ( rule__Linker__Group__0 ) )
            // InternalCBS.g:693:3: ( rule__Linker__Group__0 )
            {
             before(grammarAccess.getLinkerAccess().getGroup()); 
            // InternalCBS.g:694:3: ( rule__Linker__Group__0 )
            // InternalCBS.g:694:4: rule__Linker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Linker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkerAccess().getGroup()); 

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
    // $ANTLR end "ruleLinker"


    // $ANTLR start "ruleSimpleTypeEnum"
    // InternalCBS.g:703:1: ruleSimpleTypeEnum : ( ( rule__SimpleTypeEnum__Alternatives ) ) ;
    public final void ruleSimpleTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:707:1: ( ( ( rule__SimpleTypeEnum__Alternatives ) ) )
            // InternalCBS.g:708:2: ( ( rule__SimpleTypeEnum__Alternatives ) )
            {
            // InternalCBS.g:708:2: ( ( rule__SimpleTypeEnum__Alternatives ) )
            // InternalCBS.g:709:3: ( rule__SimpleTypeEnum__Alternatives )
            {
             before(grammarAccess.getSimpleTypeEnumAccess().getAlternatives()); 
            // InternalCBS.g:710:3: ( rule__SimpleTypeEnum__Alternatives )
            // InternalCBS.g:710:4: rule__SimpleTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimpleTypeEnum"


    // $ANTLR start "rule__AbstractAction__Alternatives"
    // InternalCBS.g:718:1: rule__AbstractAction__Alternatives : ( ( ruleInternalAction ) | ( ruleExternalCallAction ) | ( ruleBranchAction ) | ( ruleLoopAction ) );
    public final void rule__AbstractAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:722:1: ( ( ruleInternalAction ) | ( ruleExternalCallAction ) | ( ruleBranchAction ) | ( ruleLoopAction ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt1=1;
                }
                break;
            case 63:
                {
                alt1=2;
                }
                break;
            case 65:
                {
                alt1=3;
                }
                break;
            case 67:
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
                    // InternalCBS.g:723:2: ( ruleInternalAction )
                    {
                    // InternalCBS.g:723:2: ( ruleInternalAction )
                    // InternalCBS.g:724:3: ruleInternalAction
                    {
                     before(grammarAccess.getAbstractActionAccess().getInternalActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInternalAction();

                    state._fsp--;

                     after(grammarAccess.getAbstractActionAccess().getInternalActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:729:2: ( ruleExternalCallAction )
                    {
                    // InternalCBS.g:729:2: ( ruleExternalCallAction )
                    // InternalCBS.g:730:3: ruleExternalCallAction
                    {
                     before(grammarAccess.getAbstractActionAccess().getExternalCallActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalCallAction();

                    state._fsp--;

                     after(grammarAccess.getAbstractActionAccess().getExternalCallActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCBS.g:735:2: ( ruleBranchAction )
                    {
                    // InternalCBS.g:735:2: ( ruleBranchAction )
                    // InternalCBS.g:736:3: ruleBranchAction
                    {
                     before(grammarAccess.getAbstractActionAccess().getBranchActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBranchAction();

                    state._fsp--;

                     after(grammarAccess.getAbstractActionAccess().getBranchActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCBS.g:741:2: ( ruleLoopAction )
                    {
                    // InternalCBS.g:741:2: ( ruleLoopAction )
                    // InternalCBS.g:742:3: ruleLoopAction
                    {
                     before(grammarAccess.getAbstractActionAccess().getLoopActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopAction();

                    state._fsp--;

                     after(grammarAccess.getAbstractActionAccess().getLoopActionParserRuleCall_3()); 

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
    // $ANTLR end "rule__AbstractAction__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCBS.g:751:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:755:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCBS.g:756:2: ( RULE_STRING )
                    {
                    // InternalCBS.g:756:2: ( RULE_STRING )
                    // InternalCBS.g:757:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:762:2: ( RULE_ID )
                    {
                    // InternalCBS.g:762:2: ( RULE_ID )
                    // InternalCBS.g:763:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SimpleTypeEnum__Alternatives"
    // InternalCBS.g:772:1: rule__SimpleTypeEnum__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Char' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) );
    public final void rule__SimpleTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:776:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Char' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCBS.g:777:2: ( ( 'String' ) )
                    {
                    // InternalCBS.g:777:2: ( ( 'String' ) )
                    // InternalCBS.g:778:3: ( 'String' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalCBS.g:779:3: ( 'String' )
                    // InternalCBS.g:779:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:783:2: ( ( 'Int' ) )
                    {
                    // InternalCBS.g:783:2: ( ( 'Int' ) )
                    // InternalCBS.g:784:3: ( 'Int' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalCBS.g:785:3: ( 'Int' )
                    // InternalCBS.g:785:4: 'Int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCBS.g:789:2: ( ( 'Boolean' ) )
                    {
                    // InternalCBS.g:789:2: ( ( 'Boolean' ) )
                    // InternalCBS.g:790:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalCBS.g:791:3: ( 'Boolean' )
                    // InternalCBS.g:791:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCBS.g:795:2: ( ( 'Char' ) )
                    {
                    // InternalCBS.g:795:2: ( ( 'Char' ) )
                    // InternalCBS.g:796:3: ( 'Char' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3()); 
                    // InternalCBS.g:797:3: ( 'Char' )
                    // InternalCBS.g:797:4: 'Char'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCBS.g:801:2: ( ( 'Date' ) )
                    {
                    // InternalCBS.g:801:2: ( ( 'Date' ) )
                    // InternalCBS.g:802:3: ( 'Date' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalCBS.g:803:3: ( 'Date' )
                    // InternalCBS.g:803:4: 'Date'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCBS.g:807:2: ( ( 'Double' ) )
                    {
                    // InternalCBS.g:807:2: ( ( 'Double' ) )
                    // InternalCBS.g:808:3: ( 'Double' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // InternalCBS.g:809:3: ( 'Double' )
                    // InternalCBS.g:809:4: 'Double'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCBS.g:813:2: ( ( 'Float' ) )
                    {
                    // InternalCBS.g:813:2: ( ( 'Float' ) )
                    // InternalCBS.g:814:3: ( 'Float' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6()); 
                    // InternalCBS.g:815:3: ( 'Float' )
                    // InternalCBS.g:815:4: 'Float'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCBS.g:819:2: ( ( 'Long' ) )
                    {
                    // InternalCBS.g:819:2: ( ( 'Long' ) )
                    // InternalCBS.g:820:3: ( 'Long' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7()); 
                    // InternalCBS.g:821:3: ( 'Long' )
                    // InternalCBS.g:821:4: 'Long'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__SimpleTypeEnum__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalCBS.g:829:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:833:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalCBS.g:834:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalCBS.g:841:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:845:1: ( ( 'System' ) )
            // InternalCBS.g:846:1: ( 'System' )
            {
            // InternalCBS.g:846:1: ( 'System' )
            // InternalCBS.g:847:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalCBS.g:856:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:860:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalCBS.g:861:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalCBS.g:868:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:872:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalCBS.g:873:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalCBS.g:873:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalCBS.g:874:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalCBS.g:875:2: ( rule__System__NameAssignment_1 )
            // InternalCBS.g:875:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalCBS.g:883:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:887:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalCBS.g:888:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalCBS.g:895:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:899:1: ( ( '{' ) )
            // InternalCBS.g:900:1: ( '{' )
            {
            // InternalCBS.g:900:1: ( '{' )
            // InternalCBS.g:901:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalCBS.g:910:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:914:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalCBS.g:915:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalCBS.g:922:1: rule__System__Group__3__Impl : ( ( rule__System__Group_3__0 )? ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:926:1: ( ( ( rule__System__Group_3__0 )? ) )
            // InternalCBS.g:927:1: ( ( rule__System__Group_3__0 )? )
            {
            // InternalCBS.g:927:1: ( ( rule__System__Group_3__0 )? )
            // InternalCBS.g:928:2: ( rule__System__Group_3__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_3()); 
            // InternalCBS.g:929:2: ( rule__System__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCBS.g:929:3: rule__System__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalCBS.g:937:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:941:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalCBS.g:942:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__5();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalCBS.g:949:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )? ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:953:1: ( ( ( rule__System__Group_4__0 )? ) )
            // InternalCBS.g:954:1: ( ( rule__System__Group_4__0 )? )
            {
            // InternalCBS.g:954:1: ( ( rule__System__Group_4__0 )? )
            // InternalCBS.g:955:2: ( rule__System__Group_4__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // InternalCBS.g:956:2: ( rule__System__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCBS.g:956:3: rule__System__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalCBS.g:964:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:968:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalCBS.g:969:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__6();

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
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalCBS.g:976:1: rule__System__Group__5__Impl : ( ( rule__System__Group_5__0 )? ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:980:1: ( ( ( rule__System__Group_5__0 )? ) )
            // InternalCBS.g:981:1: ( ( rule__System__Group_5__0 )? )
            {
            // InternalCBS.g:981:1: ( ( rule__System__Group_5__0 )? )
            // InternalCBS.g:982:2: ( rule__System__Group_5__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_5()); 
            // InternalCBS.g:983:2: ( rule__System__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCBS.g:983:3: rule__System__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_5()); 

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
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // InternalCBS.g:991:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:995:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalCBS.g:996:2: rule__System__Group__6__Impl rule__System__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__7();

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
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // InternalCBS.g:1003:1: rule__System__Group__6__Impl : ( ( rule__System__Group_6__0 )? ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1007:1: ( ( ( rule__System__Group_6__0 )? ) )
            // InternalCBS.g:1008:1: ( ( rule__System__Group_6__0 )? )
            {
            // InternalCBS.g:1008:1: ( ( rule__System__Group_6__0 )? )
            // InternalCBS.g:1009:2: ( rule__System__Group_6__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_6()); 
            // InternalCBS.g:1010:2: ( rule__System__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCBS.g:1010:3: rule__System__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_6()); 

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
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group__7"
    // InternalCBS.g:1018:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1022:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalCBS.g:1023:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__System__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__8();

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
    // $ANTLR end "rule__System__Group__7"


    // $ANTLR start "rule__System__Group__7__Impl"
    // InternalCBS.g:1030:1: rule__System__Group__7__Impl : ( 'allocation' ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1034:1: ( ( 'allocation' ) )
            // InternalCBS.g:1035:1: ( 'allocation' )
            {
            // InternalCBS.g:1035:1: ( 'allocation' )
            // InternalCBS.g:1036:2: 'allocation'
            {
             before(grammarAccess.getSystemAccess().getAllocationKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getAllocationKeyword_7()); 

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
    // $ANTLR end "rule__System__Group__7__Impl"


    // $ANTLR start "rule__System__Group__8"
    // InternalCBS.g:1045:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1049:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalCBS.g:1050:2: rule__System__Group__8__Impl rule__System__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__System__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__9();

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
    // $ANTLR end "rule__System__Group__8"


    // $ANTLR start "rule__System__Group__8__Impl"
    // InternalCBS.g:1057:1: rule__System__Group__8__Impl : ( ( rule__System__AllocationAssignment_8 ) ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1061:1: ( ( ( rule__System__AllocationAssignment_8 ) ) )
            // InternalCBS.g:1062:1: ( ( rule__System__AllocationAssignment_8 ) )
            {
            // InternalCBS.g:1062:1: ( ( rule__System__AllocationAssignment_8 ) )
            // InternalCBS.g:1063:2: ( rule__System__AllocationAssignment_8 )
            {
             before(grammarAccess.getSystemAccess().getAllocationAssignment_8()); 
            // InternalCBS.g:1064:2: ( rule__System__AllocationAssignment_8 )
            // InternalCBS.g:1064:3: rule__System__AllocationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__System__AllocationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getAllocationAssignment_8()); 

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
    // $ANTLR end "rule__System__Group__8__Impl"


    // $ANTLR start "rule__System__Group__9"
    // InternalCBS.g:1072:1: rule__System__Group__9 : rule__System__Group__9__Impl ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1076:1: ( rule__System__Group__9__Impl )
            // InternalCBS.g:1077:2: rule__System__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__9__Impl();

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
    // $ANTLR end "rule__System__Group__9"


    // $ANTLR start "rule__System__Group__9__Impl"
    // InternalCBS.g:1083:1: rule__System__Group__9__Impl : ( '}' ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1087:1: ( ( '}' ) )
            // InternalCBS.g:1088:1: ( '}' )
            {
            // InternalCBS.g:1088:1: ( '}' )
            // InternalCBS.g:1089:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__System__Group__9__Impl"


    // $ANTLR start "rule__System__Group_3__0"
    // InternalCBS.g:1099:1: rule__System__Group_3__0 : rule__System__Group_3__0__Impl rule__System__Group_3__1 ;
    public final void rule__System__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1103:1: ( rule__System__Group_3__0__Impl rule__System__Group_3__1 )
            // InternalCBS.g:1104:2: rule__System__Group_3__0__Impl rule__System__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__1();

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
    // $ANTLR end "rule__System__Group_3__0"


    // $ANTLR start "rule__System__Group_3__0__Impl"
    // InternalCBS.g:1111:1: rule__System__Group_3__0__Impl : ( 'childContexts' ) ;
    public final void rule__System__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1115:1: ( ( 'childContexts' ) )
            // InternalCBS.g:1116:1: ( 'childContexts' )
            {
            // InternalCBS.g:1116:1: ( 'childContexts' )
            // InternalCBS.g:1117:2: 'childContexts'
            {
             before(grammarAccess.getSystemAccess().getChildContextsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getChildContextsKeyword_3_0()); 

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
    // $ANTLR end "rule__System__Group_3__0__Impl"


    // $ANTLR start "rule__System__Group_3__1"
    // InternalCBS.g:1126:1: rule__System__Group_3__1 : rule__System__Group_3__1__Impl rule__System__Group_3__2 ;
    public final void rule__System__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1130:1: ( rule__System__Group_3__1__Impl rule__System__Group_3__2 )
            // InternalCBS.g:1131:2: rule__System__Group_3__1__Impl rule__System__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__System__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__2();

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
    // $ANTLR end "rule__System__Group_3__1"


    // $ANTLR start "rule__System__Group_3__1__Impl"
    // InternalCBS.g:1138:1: rule__System__Group_3__1__Impl : ( '{' ) ;
    public final void rule__System__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1142:1: ( ( '{' ) )
            // InternalCBS.g:1143:1: ( '{' )
            {
            // InternalCBS.g:1143:1: ( '{' )
            // InternalCBS.g:1144:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__System__Group_3__1__Impl"


    // $ANTLR start "rule__System__Group_3__2"
    // InternalCBS.g:1153:1: rule__System__Group_3__2 : rule__System__Group_3__2__Impl rule__System__Group_3__3 ;
    public final void rule__System__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1157:1: ( rule__System__Group_3__2__Impl rule__System__Group_3__3 )
            // InternalCBS.g:1158:2: rule__System__Group_3__2__Impl rule__System__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__3();

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
    // $ANTLR end "rule__System__Group_3__2"


    // $ANTLR start "rule__System__Group_3__2__Impl"
    // InternalCBS.g:1165:1: rule__System__Group_3__2__Impl : ( ( rule__System__ChildContextsAssignment_3_2 ) ) ;
    public final void rule__System__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1169:1: ( ( ( rule__System__ChildContextsAssignment_3_2 ) ) )
            // InternalCBS.g:1170:1: ( ( rule__System__ChildContextsAssignment_3_2 ) )
            {
            // InternalCBS.g:1170:1: ( ( rule__System__ChildContextsAssignment_3_2 ) )
            // InternalCBS.g:1171:2: ( rule__System__ChildContextsAssignment_3_2 )
            {
             before(grammarAccess.getSystemAccess().getChildContextsAssignment_3_2()); 
            // InternalCBS.g:1172:2: ( rule__System__ChildContextsAssignment_3_2 )
            // InternalCBS.g:1172:3: rule__System__ChildContextsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__System__ChildContextsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getChildContextsAssignment_3_2()); 

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
    // $ANTLR end "rule__System__Group_3__2__Impl"


    // $ANTLR start "rule__System__Group_3__3"
    // InternalCBS.g:1180:1: rule__System__Group_3__3 : rule__System__Group_3__3__Impl rule__System__Group_3__4 ;
    public final void rule__System__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1184:1: ( rule__System__Group_3__3__Impl rule__System__Group_3__4 )
            // InternalCBS.g:1185:2: rule__System__Group_3__3__Impl rule__System__Group_3__4
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__4();

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
    // $ANTLR end "rule__System__Group_3__3"


    // $ANTLR start "rule__System__Group_3__3__Impl"
    // InternalCBS.g:1192:1: rule__System__Group_3__3__Impl : ( ( rule__System__Group_3_3__0 )* ) ;
    public final void rule__System__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1196:1: ( ( ( rule__System__Group_3_3__0 )* ) )
            // InternalCBS.g:1197:1: ( ( rule__System__Group_3_3__0 )* )
            {
            // InternalCBS.g:1197:1: ( ( rule__System__Group_3_3__0 )* )
            // InternalCBS.g:1198:2: ( rule__System__Group_3_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_3_3()); 
            // InternalCBS.g:1199:2: ( rule__System__Group_3_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCBS.g:1199:3: rule__System__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__System__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__System__Group_3__3__Impl"


    // $ANTLR start "rule__System__Group_3__4"
    // InternalCBS.g:1207:1: rule__System__Group_3__4 : rule__System__Group_3__4__Impl ;
    public final void rule__System__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1211:1: ( rule__System__Group_3__4__Impl )
            // InternalCBS.g:1212:2: rule__System__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_3__4__Impl();

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
    // $ANTLR end "rule__System__Group_3__4"


    // $ANTLR start "rule__System__Group_3__4__Impl"
    // InternalCBS.g:1218:1: rule__System__Group_3__4__Impl : ( '}' ) ;
    public final void rule__System__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1222:1: ( ( '}' ) )
            // InternalCBS.g:1223:1: ( '}' )
            {
            // InternalCBS.g:1223:1: ( '}' )
            // InternalCBS.g:1224:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__System__Group_3__4__Impl"


    // $ANTLR start "rule__System__Group_3_3__0"
    // InternalCBS.g:1234:1: rule__System__Group_3_3__0 : rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1 ;
    public final void rule__System__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1238:1: ( rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1 )
            // InternalCBS.g:1239:2: rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1
            {
            pushFollow(FOLLOW_8);
            rule__System__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3_3__1();

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
    // $ANTLR end "rule__System__Group_3_3__0"


    // $ANTLR start "rule__System__Group_3_3__0__Impl"
    // InternalCBS.g:1246:1: rule__System__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1250:1: ( ( ',' ) )
            // InternalCBS.g:1251:1: ( ',' )
            {
            // InternalCBS.g:1251:1: ( ',' )
            // InternalCBS.g:1252:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__System__Group_3_3__0__Impl"


    // $ANTLR start "rule__System__Group_3_3__1"
    // InternalCBS.g:1261:1: rule__System__Group_3_3__1 : rule__System__Group_3_3__1__Impl ;
    public final void rule__System__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1265:1: ( rule__System__Group_3_3__1__Impl )
            // InternalCBS.g:1266:2: rule__System__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__System__Group_3_3__1"


    // $ANTLR start "rule__System__Group_3_3__1__Impl"
    // InternalCBS.g:1272:1: rule__System__Group_3_3__1__Impl : ( ( rule__System__ChildContextsAssignment_3_3_1 ) ) ;
    public final void rule__System__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1276:1: ( ( ( rule__System__ChildContextsAssignment_3_3_1 ) ) )
            // InternalCBS.g:1277:1: ( ( rule__System__ChildContextsAssignment_3_3_1 ) )
            {
            // InternalCBS.g:1277:1: ( ( rule__System__ChildContextsAssignment_3_3_1 ) )
            // InternalCBS.g:1278:2: ( rule__System__ChildContextsAssignment_3_3_1 )
            {
             before(grammarAccess.getSystemAccess().getChildContextsAssignment_3_3_1()); 
            // InternalCBS.g:1279:2: ( rule__System__ChildContextsAssignment_3_3_1 )
            // InternalCBS.g:1279:3: rule__System__ChildContextsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__System__ChildContextsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getChildContextsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__System__Group_3_3__1__Impl"


    // $ANTLR start "rule__System__Group_4__0"
    // InternalCBS.g:1288:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1292:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // InternalCBS.g:1293:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_4__1();

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
    // $ANTLR end "rule__System__Group_4__0"


    // $ANTLR start "rule__System__Group_4__0__Impl"
    // InternalCBS.g:1300:1: rule__System__Group_4__0__Impl : ( 'assemblyConnectors' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1304:1: ( ( 'assemblyConnectors' ) )
            // InternalCBS.g:1305:1: ( 'assemblyConnectors' )
            {
            // InternalCBS.g:1305:1: ( 'assemblyConnectors' )
            // InternalCBS.g:1306:2: 'assemblyConnectors'
            {
             before(grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_4_0()); 

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
    // $ANTLR end "rule__System__Group_4__0__Impl"


    // $ANTLR start "rule__System__Group_4__1"
    // InternalCBS.g:1315:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl rule__System__Group_4__2 ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1319:1: ( rule__System__Group_4__1__Impl rule__System__Group_4__2 )
            // InternalCBS.g:1320:2: rule__System__Group_4__1__Impl rule__System__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__System__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_4__2();

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
    // $ANTLR end "rule__System__Group_4__1"


    // $ANTLR start "rule__System__Group_4__1__Impl"
    // InternalCBS.g:1327:1: rule__System__Group_4__1__Impl : ( '{' ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1331:1: ( ( '{' ) )
            // InternalCBS.g:1332:1: ( '{' )
            {
            // InternalCBS.g:1332:1: ( '{' )
            // InternalCBS.g:1333:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__System__Group_4__1__Impl"


    // $ANTLR start "rule__System__Group_4__2"
    // InternalCBS.g:1342:1: rule__System__Group_4__2 : rule__System__Group_4__2__Impl rule__System__Group_4__3 ;
    public final void rule__System__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1346:1: ( rule__System__Group_4__2__Impl rule__System__Group_4__3 )
            // InternalCBS.g:1347:2: rule__System__Group_4__2__Impl rule__System__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_4__3();

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
    // $ANTLR end "rule__System__Group_4__2"


    // $ANTLR start "rule__System__Group_4__2__Impl"
    // InternalCBS.g:1354:1: rule__System__Group_4__2__Impl : ( ( rule__System__AssemblyConnectorsAssignment_4_2 ) ) ;
    public final void rule__System__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1358:1: ( ( ( rule__System__AssemblyConnectorsAssignment_4_2 ) ) )
            // InternalCBS.g:1359:1: ( ( rule__System__AssemblyConnectorsAssignment_4_2 ) )
            {
            // InternalCBS.g:1359:1: ( ( rule__System__AssemblyConnectorsAssignment_4_2 ) )
            // InternalCBS.g:1360:2: ( rule__System__AssemblyConnectorsAssignment_4_2 )
            {
             before(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_4_2()); 
            // InternalCBS.g:1361:2: ( rule__System__AssemblyConnectorsAssignment_4_2 )
            // InternalCBS.g:1361:3: rule__System__AssemblyConnectorsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__System__AssemblyConnectorsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_4_2()); 

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
    // $ANTLR end "rule__System__Group_4__2__Impl"


    // $ANTLR start "rule__System__Group_4__3"
    // InternalCBS.g:1369:1: rule__System__Group_4__3 : rule__System__Group_4__3__Impl rule__System__Group_4__4 ;
    public final void rule__System__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1373:1: ( rule__System__Group_4__3__Impl rule__System__Group_4__4 )
            // InternalCBS.g:1374:2: rule__System__Group_4__3__Impl rule__System__Group_4__4
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_4__4();

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
    // $ANTLR end "rule__System__Group_4__3"


    // $ANTLR start "rule__System__Group_4__3__Impl"
    // InternalCBS.g:1381:1: rule__System__Group_4__3__Impl : ( ( rule__System__Group_4_3__0 )* ) ;
    public final void rule__System__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1385:1: ( ( ( rule__System__Group_4_3__0 )* ) )
            // InternalCBS.g:1386:1: ( ( rule__System__Group_4_3__0 )* )
            {
            // InternalCBS.g:1386:1: ( ( rule__System__Group_4_3__0 )* )
            // InternalCBS.g:1387:2: ( rule__System__Group_4_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_4_3()); 
            // InternalCBS.g:1388:2: ( rule__System__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCBS.g:1388:3: rule__System__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__System__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__System__Group_4__3__Impl"


    // $ANTLR start "rule__System__Group_4__4"
    // InternalCBS.g:1396:1: rule__System__Group_4__4 : rule__System__Group_4__4__Impl ;
    public final void rule__System__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1400:1: ( rule__System__Group_4__4__Impl )
            // InternalCBS.g:1401:2: rule__System__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_4__4__Impl();

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
    // $ANTLR end "rule__System__Group_4__4"


    // $ANTLR start "rule__System__Group_4__4__Impl"
    // InternalCBS.g:1407:1: rule__System__Group_4__4__Impl : ( '}' ) ;
    public final void rule__System__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1411:1: ( ( '}' ) )
            // InternalCBS.g:1412:1: ( '}' )
            {
            // InternalCBS.g:1412:1: ( '}' )
            // InternalCBS.g:1413:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__System__Group_4__4__Impl"


    // $ANTLR start "rule__System__Group_4_3__0"
    // InternalCBS.g:1423:1: rule__System__Group_4_3__0 : rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1 ;
    public final void rule__System__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1427:1: ( rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1 )
            // InternalCBS.g:1428:2: rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__System__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_4_3__1();

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
    // $ANTLR end "rule__System__Group_4_3__0"


    // $ANTLR start "rule__System__Group_4_3__0__Impl"
    // InternalCBS.g:1435:1: rule__System__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1439:1: ( ( ',' ) )
            // InternalCBS.g:1440:1: ( ',' )
            {
            // InternalCBS.g:1440:1: ( ',' )
            // InternalCBS.g:1441:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__System__Group_4_3__0__Impl"


    // $ANTLR start "rule__System__Group_4_3__1"
    // InternalCBS.g:1450:1: rule__System__Group_4_3__1 : rule__System__Group_4_3__1__Impl ;
    public final void rule__System__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1454:1: ( rule__System__Group_4_3__1__Impl )
            // InternalCBS.g:1455:2: rule__System__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__System__Group_4_3__1"


    // $ANTLR start "rule__System__Group_4_3__1__Impl"
    // InternalCBS.g:1461:1: rule__System__Group_4_3__1__Impl : ( ( rule__System__AssemblyConnectorsAssignment_4_3_1 ) ) ;
    public final void rule__System__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1465:1: ( ( ( rule__System__AssemblyConnectorsAssignment_4_3_1 ) ) )
            // InternalCBS.g:1466:1: ( ( rule__System__AssemblyConnectorsAssignment_4_3_1 ) )
            {
            // InternalCBS.g:1466:1: ( ( rule__System__AssemblyConnectorsAssignment_4_3_1 ) )
            // InternalCBS.g:1467:2: ( rule__System__AssemblyConnectorsAssignment_4_3_1 )
            {
             before(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_4_3_1()); 
            // InternalCBS.g:1468:2: ( rule__System__AssemblyConnectorsAssignment_4_3_1 )
            // InternalCBS.g:1468:3: rule__System__AssemblyConnectorsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__System__AssemblyConnectorsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__System__Group_4_3__1__Impl"


    // $ANTLR start "rule__System__Group_5__0"
    // InternalCBS.g:1477:1: rule__System__Group_5__0 : rule__System__Group_5__0__Impl rule__System__Group_5__1 ;
    public final void rule__System__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1481:1: ( rule__System__Group_5__0__Impl rule__System__Group_5__1 )
            // InternalCBS.g:1482:2: rule__System__Group_5__0__Impl rule__System__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_5__1();

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
    // $ANTLR end "rule__System__Group_5__0"


    // $ANTLR start "rule__System__Group_5__0__Impl"
    // InternalCBS.g:1489:1: rule__System__Group_5__0__Impl : ( 'requiredDelegationConnectors' ) ;
    public final void rule__System__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1493:1: ( ( 'requiredDelegationConnectors' ) )
            // InternalCBS.g:1494:1: ( 'requiredDelegationConnectors' )
            {
            // InternalCBS.g:1494:1: ( 'requiredDelegationConnectors' )
            // InternalCBS.g:1495:2: 'requiredDelegationConnectors'
            {
             before(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsKeyword_5_0()); 

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
    // $ANTLR end "rule__System__Group_5__0__Impl"


    // $ANTLR start "rule__System__Group_5__1"
    // InternalCBS.g:1504:1: rule__System__Group_5__1 : rule__System__Group_5__1__Impl rule__System__Group_5__2 ;
    public final void rule__System__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1508:1: ( rule__System__Group_5__1__Impl rule__System__Group_5__2 )
            // InternalCBS.g:1509:2: rule__System__Group_5__1__Impl rule__System__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__System__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_5__2();

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
    // $ANTLR end "rule__System__Group_5__1"


    // $ANTLR start "rule__System__Group_5__1__Impl"
    // InternalCBS.g:1516:1: rule__System__Group_5__1__Impl : ( '{' ) ;
    public final void rule__System__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1520:1: ( ( '{' ) )
            // InternalCBS.g:1521:1: ( '{' )
            {
            // InternalCBS.g:1521:1: ( '{' )
            // InternalCBS.g:1522:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__System__Group_5__1__Impl"


    // $ANTLR start "rule__System__Group_5__2"
    // InternalCBS.g:1531:1: rule__System__Group_5__2 : rule__System__Group_5__2__Impl rule__System__Group_5__3 ;
    public final void rule__System__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1535:1: ( rule__System__Group_5__2__Impl rule__System__Group_5__3 )
            // InternalCBS.g:1536:2: rule__System__Group_5__2__Impl rule__System__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_5__3();

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
    // $ANTLR end "rule__System__Group_5__2"


    // $ANTLR start "rule__System__Group_5__2__Impl"
    // InternalCBS.g:1543:1: rule__System__Group_5__2__Impl : ( ( rule__System__RequiredDelegationConnectorsAssignment_5_2 ) ) ;
    public final void rule__System__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1547:1: ( ( ( rule__System__RequiredDelegationConnectorsAssignment_5_2 ) ) )
            // InternalCBS.g:1548:1: ( ( rule__System__RequiredDelegationConnectorsAssignment_5_2 ) )
            {
            // InternalCBS.g:1548:1: ( ( rule__System__RequiredDelegationConnectorsAssignment_5_2 ) )
            // InternalCBS.g:1549:2: ( rule__System__RequiredDelegationConnectorsAssignment_5_2 )
            {
             before(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsAssignment_5_2()); 
            // InternalCBS.g:1550:2: ( rule__System__RequiredDelegationConnectorsAssignment_5_2 )
            // InternalCBS.g:1550:3: rule__System__RequiredDelegationConnectorsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__System__RequiredDelegationConnectorsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsAssignment_5_2()); 

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
    // $ANTLR end "rule__System__Group_5__2__Impl"


    // $ANTLR start "rule__System__Group_5__3"
    // InternalCBS.g:1558:1: rule__System__Group_5__3 : rule__System__Group_5__3__Impl rule__System__Group_5__4 ;
    public final void rule__System__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1562:1: ( rule__System__Group_5__3__Impl rule__System__Group_5__4 )
            // InternalCBS.g:1563:2: rule__System__Group_5__3__Impl rule__System__Group_5__4
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_5__4();

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
    // $ANTLR end "rule__System__Group_5__3"


    // $ANTLR start "rule__System__Group_5__3__Impl"
    // InternalCBS.g:1570:1: rule__System__Group_5__3__Impl : ( ( rule__System__Group_5_3__0 )* ) ;
    public final void rule__System__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1574:1: ( ( ( rule__System__Group_5_3__0 )* ) )
            // InternalCBS.g:1575:1: ( ( rule__System__Group_5_3__0 )* )
            {
            // InternalCBS.g:1575:1: ( ( rule__System__Group_5_3__0 )* )
            // InternalCBS.g:1576:2: ( rule__System__Group_5_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_5_3()); 
            // InternalCBS.g:1577:2: ( rule__System__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCBS.g:1577:3: rule__System__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__System__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__System__Group_5__3__Impl"


    // $ANTLR start "rule__System__Group_5__4"
    // InternalCBS.g:1585:1: rule__System__Group_5__4 : rule__System__Group_5__4__Impl ;
    public final void rule__System__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1589:1: ( rule__System__Group_5__4__Impl )
            // InternalCBS.g:1590:2: rule__System__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_5__4__Impl();

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
    // $ANTLR end "rule__System__Group_5__4"


    // $ANTLR start "rule__System__Group_5__4__Impl"
    // InternalCBS.g:1596:1: rule__System__Group_5__4__Impl : ( '}' ) ;
    public final void rule__System__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1600:1: ( ( '}' ) )
            // InternalCBS.g:1601:1: ( '}' )
            {
            // InternalCBS.g:1601:1: ( '}' )
            // InternalCBS.g:1602:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__System__Group_5__4__Impl"


    // $ANTLR start "rule__System__Group_5_3__0"
    // InternalCBS.g:1612:1: rule__System__Group_5_3__0 : rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1 ;
    public final void rule__System__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1616:1: ( rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1 )
            // InternalCBS.g:1617:2: rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
            rule__System__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_5_3__1();

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
    // $ANTLR end "rule__System__Group_5_3__0"


    // $ANTLR start "rule__System__Group_5_3__0__Impl"
    // InternalCBS.g:1624:1: rule__System__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1628:1: ( ( ',' ) )
            // InternalCBS.g:1629:1: ( ',' )
            {
            // InternalCBS.g:1629:1: ( ',' )
            // InternalCBS.g:1630:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__System__Group_5_3__0__Impl"


    // $ANTLR start "rule__System__Group_5_3__1"
    // InternalCBS.g:1639:1: rule__System__Group_5_3__1 : rule__System__Group_5_3__1__Impl ;
    public final void rule__System__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1643:1: ( rule__System__Group_5_3__1__Impl )
            // InternalCBS.g:1644:2: rule__System__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__System__Group_5_3__1"


    // $ANTLR start "rule__System__Group_5_3__1__Impl"
    // InternalCBS.g:1650:1: rule__System__Group_5_3__1__Impl : ( ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 ) ) ;
    public final void rule__System__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1654:1: ( ( ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 ) ) )
            // InternalCBS.g:1655:1: ( ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 ) )
            {
            // InternalCBS.g:1655:1: ( ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 ) )
            // InternalCBS.g:1656:2: ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 )
            {
             before(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsAssignment_5_3_1()); 
            // InternalCBS.g:1657:2: ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 )
            // InternalCBS.g:1657:3: rule__System__RequiredDelegationConnectorsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__System__RequiredDelegationConnectorsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__System__Group_5_3__1__Impl"


    // $ANTLR start "rule__System__Group_6__0"
    // InternalCBS.g:1666:1: rule__System__Group_6__0 : rule__System__Group_6__0__Impl rule__System__Group_6__1 ;
    public final void rule__System__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1670:1: ( rule__System__Group_6__0__Impl rule__System__Group_6__1 )
            // InternalCBS.g:1671:2: rule__System__Group_6__0__Impl rule__System__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__1();

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
    // $ANTLR end "rule__System__Group_6__0"


    // $ANTLR start "rule__System__Group_6__0__Impl"
    // InternalCBS.g:1678:1: rule__System__Group_6__0__Impl : ( 'providedDelegationConnectors' ) ;
    public final void rule__System__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1682:1: ( ( 'providedDelegationConnectors' ) )
            // InternalCBS.g:1683:1: ( 'providedDelegationConnectors' )
            {
            // InternalCBS.g:1683:1: ( 'providedDelegationConnectors' )
            // InternalCBS.g:1684:2: 'providedDelegationConnectors'
            {
             before(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsKeyword_6_0()); 

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
    // $ANTLR end "rule__System__Group_6__0__Impl"


    // $ANTLR start "rule__System__Group_6__1"
    // InternalCBS.g:1693:1: rule__System__Group_6__1 : rule__System__Group_6__1__Impl rule__System__Group_6__2 ;
    public final void rule__System__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1697:1: ( rule__System__Group_6__1__Impl rule__System__Group_6__2 )
            // InternalCBS.g:1698:2: rule__System__Group_6__1__Impl rule__System__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__2();

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
    // $ANTLR end "rule__System__Group_6__1"


    // $ANTLR start "rule__System__Group_6__1__Impl"
    // InternalCBS.g:1705:1: rule__System__Group_6__1__Impl : ( '{' ) ;
    public final void rule__System__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1709:1: ( ( '{' ) )
            // InternalCBS.g:1710:1: ( '{' )
            {
            // InternalCBS.g:1710:1: ( '{' )
            // InternalCBS.g:1711:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__System__Group_6__1__Impl"


    // $ANTLR start "rule__System__Group_6__2"
    // InternalCBS.g:1720:1: rule__System__Group_6__2 : rule__System__Group_6__2__Impl rule__System__Group_6__3 ;
    public final void rule__System__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1724:1: ( rule__System__Group_6__2__Impl rule__System__Group_6__3 )
            // InternalCBS.g:1725:2: rule__System__Group_6__2__Impl rule__System__Group_6__3
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__3();

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
    // $ANTLR end "rule__System__Group_6__2"


    // $ANTLR start "rule__System__Group_6__2__Impl"
    // InternalCBS.g:1732:1: rule__System__Group_6__2__Impl : ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 ) ) ;
    public final void rule__System__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1736:1: ( ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 ) ) )
            // InternalCBS.g:1737:1: ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 ) )
            {
            // InternalCBS.g:1737:1: ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 ) )
            // InternalCBS.g:1738:2: ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 )
            {
             before(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsAssignment_6_2()); 
            // InternalCBS.g:1739:2: ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 )
            // InternalCBS.g:1739:3: rule__System__ProvidedDelegationConnectorsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__System__ProvidedDelegationConnectorsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsAssignment_6_2()); 

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
    // $ANTLR end "rule__System__Group_6__2__Impl"


    // $ANTLR start "rule__System__Group_6__3"
    // InternalCBS.g:1747:1: rule__System__Group_6__3 : rule__System__Group_6__3__Impl rule__System__Group_6__4 ;
    public final void rule__System__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1751:1: ( rule__System__Group_6__3__Impl rule__System__Group_6__4 )
            // InternalCBS.g:1752:2: rule__System__Group_6__3__Impl rule__System__Group_6__4
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__4();

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
    // $ANTLR end "rule__System__Group_6__3"


    // $ANTLR start "rule__System__Group_6__3__Impl"
    // InternalCBS.g:1759:1: rule__System__Group_6__3__Impl : ( ( rule__System__Group_6_3__0 )* ) ;
    public final void rule__System__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1763:1: ( ( ( rule__System__Group_6_3__0 )* ) )
            // InternalCBS.g:1764:1: ( ( rule__System__Group_6_3__0 )* )
            {
            // InternalCBS.g:1764:1: ( ( rule__System__Group_6_3__0 )* )
            // InternalCBS.g:1765:2: ( rule__System__Group_6_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_6_3()); 
            // InternalCBS.g:1766:2: ( rule__System__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCBS.g:1766:3: rule__System__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__System__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__System__Group_6__3__Impl"


    // $ANTLR start "rule__System__Group_6__4"
    // InternalCBS.g:1774:1: rule__System__Group_6__4 : rule__System__Group_6__4__Impl ;
    public final void rule__System__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1778:1: ( rule__System__Group_6__4__Impl )
            // InternalCBS.g:1779:2: rule__System__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_6__4__Impl();

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
    // $ANTLR end "rule__System__Group_6__4"


    // $ANTLR start "rule__System__Group_6__4__Impl"
    // InternalCBS.g:1785:1: rule__System__Group_6__4__Impl : ( '}' ) ;
    public final void rule__System__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1789:1: ( ( '}' ) )
            // InternalCBS.g:1790:1: ( '}' )
            {
            // InternalCBS.g:1790:1: ( '}' )
            // InternalCBS.g:1791:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__System__Group_6__4__Impl"


    // $ANTLR start "rule__System__Group_6_3__0"
    // InternalCBS.g:1801:1: rule__System__Group_6_3__0 : rule__System__Group_6_3__0__Impl rule__System__Group_6_3__1 ;
    public final void rule__System__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1805:1: ( rule__System__Group_6_3__0__Impl rule__System__Group_6_3__1 )
            // InternalCBS.g:1806:2: rule__System__Group_6_3__0__Impl rule__System__Group_6_3__1
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6_3__1();

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
    // $ANTLR end "rule__System__Group_6_3__0"


    // $ANTLR start "rule__System__Group_6_3__0__Impl"
    // InternalCBS.g:1813:1: rule__System__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1817:1: ( ( ',' ) )
            // InternalCBS.g:1818:1: ( ',' )
            {
            // InternalCBS.g:1818:1: ( ',' )
            // InternalCBS.g:1819:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_6_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__System__Group_6_3__0__Impl"


    // $ANTLR start "rule__System__Group_6_3__1"
    // InternalCBS.g:1828:1: rule__System__Group_6_3__1 : rule__System__Group_6_3__1__Impl ;
    public final void rule__System__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1832:1: ( rule__System__Group_6_3__1__Impl )
            // InternalCBS.g:1833:2: rule__System__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__System__Group_6_3__1"


    // $ANTLR start "rule__System__Group_6_3__1__Impl"
    // InternalCBS.g:1839:1: rule__System__Group_6_3__1__Impl : ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 ) ) ;
    public final void rule__System__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1843:1: ( ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 ) ) )
            // InternalCBS.g:1844:1: ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 ) )
            {
            // InternalCBS.g:1844:1: ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 ) )
            // InternalCBS.g:1845:2: ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 )
            {
             before(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsAssignment_6_3_1()); 
            // InternalCBS.g:1846:2: ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 )
            // InternalCBS.g:1846:3: rule__System__ProvidedDelegationConnectorsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__System__ProvidedDelegationConnectorsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__System__Group_6_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalCBS.g:1855:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1859:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalCBS.g:1860:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__1();

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
    // $ANTLR end "rule__AssemblyContext__Group__0"


    // $ANTLR start "rule__AssemblyContext__Group__0__Impl"
    // InternalCBS.g:1867:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1871:1: ( ( 'AssemblyContext' ) )
            // InternalCBS.g:1872:1: ( 'AssemblyContext' )
            {
            // InternalCBS.g:1872:1: ( 'AssemblyContext' )
            // InternalCBS.g:1873:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 

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
    // $ANTLR end "rule__AssemblyContext__Group__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__1"
    // InternalCBS.g:1882:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1886:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalCBS.g:1887:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AssemblyContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__2();

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
    // $ANTLR end "rule__AssemblyContext__Group__1"


    // $ANTLR start "rule__AssemblyContext__Group__1__Impl"
    // InternalCBS.g:1894:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1898:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalCBS.g:1899:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalCBS.g:1899:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalCBS.g:1900:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalCBS.g:1901:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalCBS.g:1901:3: rule__AssemblyContext__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AssemblyContext__Group__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__2"
    // InternalCBS.g:1909:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1913:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalCBS.g:1914:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__AssemblyContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__3();

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
    // $ANTLR end "rule__AssemblyContext__Group__2"


    // $ANTLR start "rule__AssemblyContext__Group__2__Impl"
    // InternalCBS.g:1921:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1925:1: ( ( '{' ) )
            // InternalCBS.g:1926:1: ( '{' )
            {
            // InternalCBS.g:1926:1: ( '{' )
            // InternalCBS.g:1927:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AssemblyContext__Group__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__3"
    // InternalCBS.g:1936:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1940:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalCBS.g:1941:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__4();

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
    // $ANTLR end "rule__AssemblyContext__Group__3"


    // $ANTLR start "rule__AssemblyContext__Group__3__Impl"
    // InternalCBS.g:1948:1: rule__AssemblyContext__Group__3__Impl : ( 'instantiates' ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1952:1: ( ( 'instantiates' ) )
            // InternalCBS.g:1953:1: ( 'instantiates' )
            {
            // InternalCBS.g:1953:1: ( 'instantiates' )
            // InternalCBS.g:1954:2: 'instantiates'
            {
             before(grammarAccess.getAssemblyContextAccess().getInstantiatesKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getInstantiatesKeyword_3()); 

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
    // $ANTLR end "rule__AssemblyContext__Group__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__4"
    // InternalCBS.g:1963:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1967:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalCBS.g:1968:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__AssemblyContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__5();

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
    // $ANTLR end "rule__AssemblyContext__Group__4"


    // $ANTLR start "rule__AssemblyContext__Group__4__Impl"
    // InternalCBS.g:1975:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__InstantiatesAssignment_4 ) ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1979:1: ( ( ( rule__AssemblyContext__InstantiatesAssignment_4 ) ) )
            // InternalCBS.g:1980:1: ( ( rule__AssemblyContext__InstantiatesAssignment_4 ) )
            {
            // InternalCBS.g:1980:1: ( ( rule__AssemblyContext__InstantiatesAssignment_4 ) )
            // InternalCBS.g:1981:2: ( rule__AssemblyContext__InstantiatesAssignment_4 )
            {
             before(grammarAccess.getAssemblyContextAccess().getInstantiatesAssignment_4()); 
            // InternalCBS.g:1982:2: ( rule__AssemblyContext__InstantiatesAssignment_4 )
            // InternalCBS.g:1982:3: rule__AssemblyContext__InstantiatesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__InstantiatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getInstantiatesAssignment_4()); 

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
    // $ANTLR end "rule__AssemblyContext__Group__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__5"
    // InternalCBS.g:1990:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1994:1: ( rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 )
            // InternalCBS.g:1995:2: rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__AssemblyContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__6();

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
    // $ANTLR end "rule__AssemblyContext__Group__5"


    // $ANTLR start "rule__AssemblyContext__Group__5__Impl"
    // InternalCBS.g:2002:1: rule__AssemblyContext__Group__5__Impl : ( ( rule__AssemblyContext__Group_5__0 )? ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2006:1: ( ( ( rule__AssemblyContext__Group_5__0 )? ) )
            // InternalCBS.g:2007:1: ( ( rule__AssemblyContext__Group_5__0 )? )
            {
            // InternalCBS.g:2007:1: ( ( rule__AssemblyContext__Group_5__0 )? )
            // InternalCBS.g:2008:2: ( rule__AssemblyContext__Group_5__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_5()); 
            // InternalCBS.g:2009:2: ( rule__AssemblyContext__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCBS.g:2009:3: rule__AssemblyContext__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssemblyContext__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyContextAccess().getGroup_5()); 

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
    // $ANTLR end "rule__AssemblyContext__Group__5__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__6"
    // InternalCBS.g:2017:1: rule__AssemblyContext__Group__6 : rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 ;
    public final void rule__AssemblyContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2021:1: ( rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 )
            // InternalCBS.g:2022:2: rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__AssemblyContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__7();

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
    // $ANTLR end "rule__AssemblyContext__Group__6"


    // $ANTLR start "rule__AssemblyContext__Group__6__Impl"
    // InternalCBS.g:2029:1: rule__AssemblyContext__Group__6__Impl : ( ( rule__AssemblyContext__Group_6__0 )? ) ;
    public final void rule__AssemblyContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2033:1: ( ( ( rule__AssemblyContext__Group_6__0 )? ) )
            // InternalCBS.g:2034:1: ( ( rule__AssemblyContext__Group_6__0 )? )
            {
            // InternalCBS.g:2034:1: ( ( rule__AssemblyContext__Group_6__0 )? )
            // InternalCBS.g:2035:2: ( rule__AssemblyContext__Group_6__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_6()); 
            // InternalCBS.g:2036:2: ( rule__AssemblyContext__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCBS.g:2036:3: rule__AssemblyContext__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssemblyContext__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyContextAccess().getGroup_6()); 

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
    // $ANTLR end "rule__AssemblyContext__Group__6__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__7"
    // InternalCBS.g:2044:1: rule__AssemblyContext__Group__7 : rule__AssemblyContext__Group__7__Impl ;
    public final void rule__AssemblyContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2048:1: ( rule__AssemblyContext__Group__7__Impl )
            // InternalCBS.g:2049:2: rule__AssemblyContext__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__7__Impl();

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
    // $ANTLR end "rule__AssemblyContext__Group__7"


    // $ANTLR start "rule__AssemblyContext__Group__7__Impl"
    // InternalCBS.g:2055:1: rule__AssemblyContext__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2059:1: ( ( '}' ) )
            // InternalCBS.g:2060:1: ( '}' )
            {
            // InternalCBS.g:2060:1: ( '}' )
            // InternalCBS.g:2061:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__AssemblyContext__Group__7__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__0"
    // InternalCBS.g:2071:1: rule__AssemblyContext__Group_5__0 : rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1 ;
    public final void rule__AssemblyContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2075:1: ( rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1 )
            // InternalCBS.g:2076:2: rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__AssemblyContext__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__1();

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
    // $ANTLR end "rule__AssemblyContext__Group_5__0"


    // $ANTLR start "rule__AssemblyContext__Group_5__0__Impl"
    // InternalCBS.g:2083:1: rule__AssemblyContext__Group_5__0__Impl : ( 'providedRoles' ) ;
    public final void rule__AssemblyContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2087:1: ( ( 'providedRoles' ) )
            // InternalCBS.g:2088:1: ( 'providedRoles' )
            {
            // InternalCBS.g:2088:1: ( 'providedRoles' )
            // InternalCBS.g:2089:2: 'providedRoles'
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5_0()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_5__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__1"
    // InternalCBS.g:2098:1: rule__AssemblyContext__Group_5__1 : rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2 ;
    public final void rule__AssemblyContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2102:1: ( rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2 )
            // InternalCBS.g:2103:2: rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyContext__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__2();

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
    // $ANTLR end "rule__AssemblyContext__Group_5__1"


    // $ANTLR start "rule__AssemblyContext__Group_5__1__Impl"
    // InternalCBS.g:2110:1: rule__AssemblyContext__Group_5__1__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2114:1: ( ( '{' ) )
            // InternalCBS.g:2115:1: ( '{' )
            {
            // InternalCBS.g:2115:1: ( '{' )
            // InternalCBS.g:2116:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_5__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__2"
    // InternalCBS.g:2125:1: rule__AssemblyContext__Group_5__2 : rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3 ;
    public final void rule__AssemblyContext__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2129:1: ( rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3 )
            // InternalCBS.g:2130:2: rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__AssemblyContext__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__3();

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
    // $ANTLR end "rule__AssemblyContext__Group_5__2"


    // $ANTLR start "rule__AssemblyContext__Group_5__2__Impl"
    // InternalCBS.g:2137:1: rule__AssemblyContext__Group_5__2__Impl : ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 ) ) ;
    public final void rule__AssemblyContext__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2141:1: ( ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 ) ) )
            // InternalCBS.g:2142:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 ) )
            {
            // InternalCBS.g:2142:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 ) )
            // InternalCBS.g:2143:2: ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_5_2()); 
            // InternalCBS.g:2144:2: ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 )
            // InternalCBS.g:2144:3: rule__AssemblyContext__ProvidedRolesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ProvidedRolesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_5_2()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_5__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__3"
    // InternalCBS.g:2152:1: rule__AssemblyContext__Group_5__3 : rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4 ;
    public final void rule__AssemblyContext__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2156:1: ( rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4 )
            // InternalCBS.g:2157:2: rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4
            {
            pushFollow(FOLLOW_9);
            rule__AssemblyContext__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__4();

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
    // $ANTLR end "rule__AssemblyContext__Group_5__3"


    // $ANTLR start "rule__AssemblyContext__Group_5__3__Impl"
    // InternalCBS.g:2164:1: rule__AssemblyContext__Group_5__3__Impl : ( ( rule__AssemblyContext__Group_5_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2168:1: ( ( ( rule__AssemblyContext__Group_5_3__0 )* ) )
            // InternalCBS.g:2169:1: ( ( rule__AssemblyContext__Group_5_3__0 )* )
            {
            // InternalCBS.g:2169:1: ( ( rule__AssemblyContext__Group_5_3__0 )* )
            // InternalCBS.g:2170:2: ( rule__AssemblyContext__Group_5_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_5_3()); 
            // InternalCBS.g:2171:2: ( rule__AssemblyContext__Group_5_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCBS.g:2171:3: rule__AssemblyContext__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AssemblyContext__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAssemblyContextAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_5__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__4"
    // InternalCBS.g:2179:1: rule__AssemblyContext__Group_5__4 : rule__AssemblyContext__Group_5__4__Impl ;
    public final void rule__AssemblyContext__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2183:1: ( rule__AssemblyContext__Group_5__4__Impl )
            // InternalCBS.g:2184:2: rule__AssemblyContext__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__4__Impl();

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
    // $ANTLR end "rule__AssemblyContext__Group_5__4"


    // $ANTLR start "rule__AssemblyContext__Group_5__4__Impl"
    // InternalCBS.g:2190:1: rule__AssemblyContext__Group_5__4__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2194:1: ( ( '}' ) )
            // InternalCBS.g:2195:1: ( '}' )
            {
            // InternalCBS.g:2195:1: ( '}' )
            // InternalCBS.g:2196:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_5__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5_3__0"
    // InternalCBS.g:2206:1: rule__AssemblyContext__Group_5_3__0 : rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1 ;
    public final void rule__AssemblyContext__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2210:1: ( rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1 )
            // InternalCBS.g:2211:2: rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyContext__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5_3__1();

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
    // $ANTLR end "rule__AssemblyContext__Group_5_3__0"


    // $ANTLR start "rule__AssemblyContext__Group_5_3__0__Impl"
    // InternalCBS.g:2218:1: rule__AssemblyContext__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2222:1: ( ( ',' ) )
            // InternalCBS.g:2223:1: ( ',' )
            {
            // InternalCBS.g:2223:1: ( ',' )
            // InternalCBS.g:2224:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_5_3__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5_3__1"
    // InternalCBS.g:2233:1: rule__AssemblyContext__Group_5_3__1 : rule__AssemblyContext__Group_5_3__1__Impl ;
    public final void rule__AssemblyContext__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2237:1: ( rule__AssemblyContext__Group_5_3__1__Impl )
            // InternalCBS.g:2238:2: rule__AssemblyContext__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__AssemblyContext__Group_5_3__1"


    // $ANTLR start "rule__AssemblyContext__Group_5_3__1__Impl"
    // InternalCBS.g:2244:1: rule__AssemblyContext__Group_5_3__1__Impl : ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2248:1: ( ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 ) ) )
            // InternalCBS.g:2249:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 ) )
            {
            // InternalCBS.g:2249:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 ) )
            // InternalCBS.g:2250:2: ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_5_3_1()); 
            // InternalCBS.g:2251:2: ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 )
            // InternalCBS.g:2251:3: rule__AssemblyContext__ProvidedRolesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ProvidedRolesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_5_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__0"
    // InternalCBS.g:2260:1: rule__AssemblyContext__Group_6__0 : rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1 ;
    public final void rule__AssemblyContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2264:1: ( rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1 )
            // InternalCBS.g:2265:2: rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__AssemblyContext__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__1();

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
    // $ANTLR end "rule__AssemblyContext__Group_6__0"


    // $ANTLR start "rule__AssemblyContext__Group_6__0__Impl"
    // InternalCBS.g:2272:1: rule__AssemblyContext__Group_6__0__Impl : ( 'requiredRoles' ) ;
    public final void rule__AssemblyContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2276:1: ( ( 'requiredRoles' ) )
            // InternalCBS.g:2277:1: ( 'requiredRoles' )
            {
            // InternalCBS.g:2277:1: ( 'requiredRoles' )
            // InternalCBS.g:2278:2: 'requiredRoles'
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_6_0()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_6__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__1"
    // InternalCBS.g:2287:1: rule__AssemblyContext__Group_6__1 : rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2 ;
    public final void rule__AssemblyContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2291:1: ( rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2 )
            // InternalCBS.g:2292:2: rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2
            {
            pushFollow(FOLLOW_17);
            rule__AssemblyContext__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__2();

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
    // $ANTLR end "rule__AssemblyContext__Group_6__1"


    // $ANTLR start "rule__AssemblyContext__Group_6__1__Impl"
    // InternalCBS.g:2299:1: rule__AssemblyContext__Group_6__1__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2303:1: ( ( '{' ) )
            // InternalCBS.g:2304:1: ( '{' )
            {
            // InternalCBS.g:2304:1: ( '{' )
            // InternalCBS.g:2305:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_6__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__2"
    // InternalCBS.g:2314:1: rule__AssemblyContext__Group_6__2 : rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3 ;
    public final void rule__AssemblyContext__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2318:1: ( rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3 )
            // InternalCBS.g:2319:2: rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3
            {
            pushFollow(FOLLOW_9);
            rule__AssemblyContext__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__3();

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
    // $ANTLR end "rule__AssemblyContext__Group_6__2"


    // $ANTLR start "rule__AssemblyContext__Group_6__2__Impl"
    // InternalCBS.g:2326:1: rule__AssemblyContext__Group_6__2__Impl : ( ( rule__AssemblyContext__RequiredRolesAssignment_6_2 ) ) ;
    public final void rule__AssemblyContext__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2330:1: ( ( ( rule__AssemblyContext__RequiredRolesAssignment_6_2 ) ) )
            // InternalCBS.g:2331:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_6_2 ) )
            {
            // InternalCBS.g:2331:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_6_2 ) )
            // InternalCBS.g:2332:2: ( rule__AssemblyContext__RequiredRolesAssignment_6_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_6_2()); 
            // InternalCBS.g:2333:2: ( rule__AssemblyContext__RequiredRolesAssignment_6_2 )
            // InternalCBS.g:2333:3: rule__AssemblyContext__RequiredRolesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__RequiredRolesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_6_2()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_6__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__3"
    // InternalCBS.g:2341:1: rule__AssemblyContext__Group_6__3 : rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4 ;
    public final void rule__AssemblyContext__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2345:1: ( rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4 )
            // InternalCBS.g:2346:2: rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4
            {
            pushFollow(FOLLOW_9);
            rule__AssemblyContext__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__4();

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
    // $ANTLR end "rule__AssemblyContext__Group_6__3"


    // $ANTLR start "rule__AssemblyContext__Group_6__3__Impl"
    // InternalCBS.g:2353:1: rule__AssemblyContext__Group_6__3__Impl : ( ( rule__AssemblyContext__Group_6_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2357:1: ( ( ( rule__AssemblyContext__Group_6_3__0 )* ) )
            // InternalCBS.g:2358:1: ( ( rule__AssemblyContext__Group_6_3__0 )* )
            {
            // InternalCBS.g:2358:1: ( ( rule__AssemblyContext__Group_6_3__0 )* )
            // InternalCBS.g:2359:2: ( rule__AssemblyContext__Group_6_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_6_3()); 
            // InternalCBS.g:2360:2: ( rule__AssemblyContext__Group_6_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCBS.g:2360:3: rule__AssemblyContext__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AssemblyContext__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAssemblyContextAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_6__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__4"
    // InternalCBS.g:2368:1: rule__AssemblyContext__Group_6__4 : rule__AssemblyContext__Group_6__4__Impl ;
    public final void rule__AssemblyContext__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2372:1: ( rule__AssemblyContext__Group_6__4__Impl )
            // InternalCBS.g:2373:2: rule__AssemblyContext__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__4__Impl();

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
    // $ANTLR end "rule__AssemblyContext__Group_6__4"


    // $ANTLR start "rule__AssemblyContext__Group_6__4__Impl"
    // InternalCBS.g:2379:1: rule__AssemblyContext__Group_6__4__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2383:1: ( ( '}' ) )
            // InternalCBS.g:2384:1: ( '}' )
            {
            // InternalCBS.g:2384:1: ( '}' )
            // InternalCBS.g:2385:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_6__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6_3__0"
    // InternalCBS.g:2395:1: rule__AssemblyContext__Group_6_3__0 : rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1 ;
    public final void rule__AssemblyContext__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2399:1: ( rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1 )
            // InternalCBS.g:2400:2: rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1
            {
            pushFollow(FOLLOW_17);
            rule__AssemblyContext__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6_3__1();

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
    // $ANTLR end "rule__AssemblyContext__Group_6_3__0"


    // $ANTLR start "rule__AssemblyContext__Group_6_3__0__Impl"
    // InternalCBS.g:2407:1: rule__AssemblyContext__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2411:1: ( ( ',' ) )
            // InternalCBS.g:2412:1: ( ',' )
            {
            // InternalCBS.g:2412:1: ( ',' )
            // InternalCBS.g:2413:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_6_3__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6_3__1"
    // InternalCBS.g:2422:1: rule__AssemblyContext__Group_6_3__1 : rule__AssemblyContext__Group_6_3__1__Impl ;
    public final void rule__AssemblyContext__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2426:1: ( rule__AssemblyContext__Group_6_3__1__Impl )
            // InternalCBS.g:2427:2: rule__AssemblyContext__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__AssemblyContext__Group_6_3__1"


    // $ANTLR start "rule__AssemblyContext__Group_6_3__1__Impl"
    // InternalCBS.g:2433:1: rule__AssemblyContext__Group_6_3__1__Impl : ( ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2437:1: ( ( ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 ) ) )
            // InternalCBS.g:2438:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 ) )
            {
            // InternalCBS.g:2438:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 ) )
            // InternalCBS.g:2439:2: ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_6_3_1()); 
            // InternalCBS.g:2440:2: ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 )
            // InternalCBS.g:2440:3: rule__AssemblyContext__RequiredRolesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__RequiredRolesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_6_3_1()); 

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
    // $ANTLR end "rule__AssemblyContext__Group_6_3__1__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__0"
    // InternalCBS.g:2449:1: rule__AssemblyConnector__Group__0 : rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 ;
    public final void rule__AssemblyConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2453:1: ( rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 )
            // InternalCBS.g:2454:2: rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__1();

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
    // $ANTLR end "rule__AssemblyConnector__Group__0"


    // $ANTLR start "rule__AssemblyConnector__Group__0__Impl"
    // InternalCBS.g:2461:1: rule__AssemblyConnector__Group__0__Impl : ( 'AssemblyConnector' ) ;
    public final void rule__AssemblyConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2465:1: ( ( 'AssemblyConnector' ) )
            // InternalCBS.g:2466:1: ( 'AssemblyConnector' )
            {
            // InternalCBS.g:2466:1: ( 'AssemblyConnector' )
            // InternalCBS.g:2467:2: 'AssemblyConnector'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 

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
    // $ANTLR end "rule__AssemblyConnector__Group__0__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__1"
    // InternalCBS.g:2476:1: rule__AssemblyConnector__Group__1 : rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 ;
    public final void rule__AssemblyConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2480:1: ( rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 )
            // InternalCBS.g:2481:2: rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AssemblyConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__2();

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
    // $ANTLR end "rule__AssemblyConnector__Group__1"


    // $ANTLR start "rule__AssemblyConnector__Group__1__Impl"
    // InternalCBS.g:2488:1: rule__AssemblyConnector__Group__1__Impl : ( ( rule__AssemblyConnector__NameAssignment_1 ) ) ;
    public final void rule__AssemblyConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2492:1: ( ( ( rule__AssemblyConnector__NameAssignment_1 ) ) )
            // InternalCBS.g:2493:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            {
            // InternalCBS.g:2493:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            // InternalCBS.g:2494:2: ( rule__AssemblyConnector__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 
            // InternalCBS.g:2495:2: ( rule__AssemblyConnector__NameAssignment_1 )
            // InternalCBS.g:2495:3: rule__AssemblyConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AssemblyConnector__Group__1__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__2"
    // InternalCBS.g:2503:1: rule__AssemblyConnector__Group__2 : rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 ;
    public final void rule__AssemblyConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2507:1: ( rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 )
            // InternalCBS.g:2508:2: rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AssemblyConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__3();

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
    // $ANTLR end "rule__AssemblyConnector__Group__2"


    // $ANTLR start "rule__AssemblyConnector__Group__2__Impl"
    // InternalCBS.g:2515:1: rule__AssemblyConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2519:1: ( ( '{' ) )
            // InternalCBS.g:2520:1: ( '{' )
            {
            // InternalCBS.g:2520:1: ( '{' )
            // InternalCBS.g:2521:2: '{'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AssemblyConnector__Group__2__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__3"
    // InternalCBS.g:2530:1: rule__AssemblyConnector__Group__3 : rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 ;
    public final void rule__AssemblyConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2534:1: ( rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 )
            // InternalCBS.g:2535:2: rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__4();

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
    // $ANTLR end "rule__AssemblyConnector__Group__3"


    // $ANTLR start "rule__AssemblyConnector__Group__3__Impl"
    // InternalCBS.g:2542:1: rule__AssemblyConnector__Group__3__Impl : ( 'requiringRole' ) ;
    public final void rule__AssemblyConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2546:1: ( ( 'requiringRole' ) )
            // InternalCBS.g:2547:1: ( 'requiringRole' )
            {
            // InternalCBS.g:2547:1: ( 'requiringRole' )
            // InternalCBS.g:2548:2: 'requiringRole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleKeyword_3()); 

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
    // $ANTLR end "rule__AssemblyConnector__Group__3__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__4"
    // InternalCBS.g:2557:1: rule__AssemblyConnector__Group__4 : rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 ;
    public final void rule__AssemblyConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2561:1: ( rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 )
            // InternalCBS.g:2562:2: rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__AssemblyConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__5();

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
    // $ANTLR end "rule__AssemblyConnector__Group__4"


    // $ANTLR start "rule__AssemblyConnector__Group__4__Impl"
    // InternalCBS.g:2569:1: rule__AssemblyConnector__Group__4__Impl : ( ( rule__AssemblyConnector__RequiringRoleAssignment_4 ) ) ;
    public final void rule__AssemblyConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2573:1: ( ( ( rule__AssemblyConnector__RequiringRoleAssignment_4 ) ) )
            // InternalCBS.g:2574:1: ( ( rule__AssemblyConnector__RequiringRoleAssignment_4 ) )
            {
            // InternalCBS.g:2574:1: ( ( rule__AssemblyConnector__RequiringRoleAssignment_4 ) )
            // InternalCBS.g:2575:2: ( rule__AssemblyConnector__RequiringRoleAssignment_4 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleAssignment_4()); 
            // InternalCBS.g:2576:2: ( rule__AssemblyConnector__RequiringRoleAssignment_4 )
            // InternalCBS.g:2576:3: rule__AssemblyConnector__RequiringRoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__RequiringRoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleAssignment_4()); 

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
    // $ANTLR end "rule__AssemblyConnector__Group__4__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__5"
    // InternalCBS.g:2584:1: rule__AssemblyConnector__Group__5 : rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 ;
    public final void rule__AssemblyConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2588:1: ( rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 )
            // InternalCBS.g:2589:2: rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyConnector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__6();

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
    // $ANTLR end "rule__AssemblyConnector__Group__5"


    // $ANTLR start "rule__AssemblyConnector__Group__5__Impl"
    // InternalCBS.g:2596:1: rule__AssemblyConnector__Group__5__Impl : ( 'providingRole' ) ;
    public final void rule__AssemblyConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2600:1: ( ( 'providingRole' ) )
            // InternalCBS.g:2601:1: ( 'providingRole' )
            {
            // InternalCBS.g:2601:1: ( 'providingRole' )
            // InternalCBS.g:2602:2: 'providingRole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleKeyword_5()); 

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
    // $ANTLR end "rule__AssemblyConnector__Group__5__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__6"
    // InternalCBS.g:2611:1: rule__AssemblyConnector__Group__6 : rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 ;
    public final void rule__AssemblyConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2615:1: ( rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 )
            // InternalCBS.g:2616:2: rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__AssemblyConnector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__7();

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
    // $ANTLR end "rule__AssemblyConnector__Group__6"


    // $ANTLR start "rule__AssemblyConnector__Group__6__Impl"
    // InternalCBS.g:2623:1: rule__AssemblyConnector__Group__6__Impl : ( ( rule__AssemblyConnector__ProvidingRoleAssignment_6 ) ) ;
    public final void rule__AssemblyConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2627:1: ( ( ( rule__AssemblyConnector__ProvidingRoleAssignment_6 ) ) )
            // InternalCBS.g:2628:1: ( ( rule__AssemblyConnector__ProvidingRoleAssignment_6 ) )
            {
            // InternalCBS.g:2628:1: ( ( rule__AssemblyConnector__ProvidingRoleAssignment_6 ) )
            // InternalCBS.g:2629:2: ( rule__AssemblyConnector__ProvidingRoleAssignment_6 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleAssignment_6()); 
            // InternalCBS.g:2630:2: ( rule__AssemblyConnector__ProvidingRoleAssignment_6 )
            // InternalCBS.g:2630:3: rule__AssemblyConnector__ProvidingRoleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__ProvidingRoleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleAssignment_6()); 

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
    // $ANTLR end "rule__AssemblyConnector__Group__6__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__7"
    // InternalCBS.g:2638:1: rule__AssemblyConnector__Group__7 : rule__AssemblyConnector__Group__7__Impl ;
    public final void rule__AssemblyConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2642:1: ( rule__AssemblyConnector__Group__7__Impl )
            // InternalCBS.g:2643:2: rule__AssemblyConnector__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__7__Impl();

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
    // $ANTLR end "rule__AssemblyConnector__Group__7"


    // $ANTLR start "rule__AssemblyConnector__Group__7__Impl"
    // InternalCBS.g:2649:1: rule__AssemblyConnector__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2653:1: ( ( '}' ) )
            // InternalCBS.g:2654:1: ( '}' )
            {
            // InternalCBS.g:2654:1: ( '}' )
            // InternalCBS.g:2655:2: '}'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__AssemblyConnector__Group__7__Impl"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__0"
    // InternalCBS.g:2665:1: rule__RequiredDelegationConnector__Group__0 : rule__RequiredDelegationConnector__Group__0__Impl rule__RequiredDelegationConnector__Group__1 ;
    public final void rule__RequiredDelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2669:1: ( rule__RequiredDelegationConnector__Group__0__Impl rule__RequiredDelegationConnector__Group__1 )
            // InternalCBS.g:2670:2: rule__RequiredDelegationConnector__Group__0__Impl rule__RequiredDelegationConnector__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RequiredDelegationConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__Group__1();

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__0"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__0__Impl"
    // InternalCBS.g:2677:1: rule__RequiredDelegationConnector__Group__0__Impl : ( 'RequiredDelegationConnector' ) ;
    public final void rule__RequiredDelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2681:1: ( ( 'RequiredDelegationConnector' ) )
            // InternalCBS.g:2682:1: ( 'RequiredDelegationConnector' )
            {
            // InternalCBS.g:2682:1: ( 'RequiredDelegationConnector' )
            // InternalCBS.g:2683:2: 'RequiredDelegationConnector'
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiredDelegationConnectorKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRequiredDelegationConnectorAccess().getRequiredDelegationConnectorKeyword_0()); 

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__0__Impl"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__1"
    // InternalCBS.g:2692:1: rule__RequiredDelegationConnector__Group__1 : rule__RequiredDelegationConnector__Group__1__Impl rule__RequiredDelegationConnector__Group__2 ;
    public final void rule__RequiredDelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2696:1: ( rule__RequiredDelegationConnector__Group__1__Impl rule__RequiredDelegationConnector__Group__2 )
            // InternalCBS.g:2697:2: rule__RequiredDelegationConnector__Group__1__Impl rule__RequiredDelegationConnector__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RequiredDelegationConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__Group__2();

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__1"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__1__Impl"
    // InternalCBS.g:2704:1: rule__RequiredDelegationConnector__Group__1__Impl : ( ( rule__RequiredDelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__RequiredDelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2708:1: ( ( ( rule__RequiredDelegationConnector__NameAssignment_1 ) ) )
            // InternalCBS.g:2709:1: ( ( rule__RequiredDelegationConnector__NameAssignment_1 ) )
            {
            // InternalCBS.g:2709:1: ( ( rule__RequiredDelegationConnector__NameAssignment_1 ) )
            // InternalCBS.g:2710:2: ( rule__RequiredDelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalCBS.g:2711:2: ( rule__RequiredDelegationConnector__NameAssignment_1 )
            // InternalCBS.g:2711:3: rule__RequiredDelegationConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredDelegationConnectorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__1__Impl"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__2"
    // InternalCBS.g:2719:1: rule__RequiredDelegationConnector__Group__2 : rule__RequiredDelegationConnector__Group__2__Impl rule__RequiredDelegationConnector__Group__3 ;
    public final void rule__RequiredDelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2723:1: ( rule__RequiredDelegationConnector__Group__2__Impl rule__RequiredDelegationConnector__Group__3 )
            // InternalCBS.g:2724:2: rule__RequiredDelegationConnector__Group__2__Impl rule__RequiredDelegationConnector__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__RequiredDelegationConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__Group__3();

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__2"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__2__Impl"
    // InternalCBS.g:2731:1: rule__RequiredDelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__RequiredDelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2735:1: ( ( '{' ) )
            // InternalCBS.g:2736:1: ( '{' )
            {
            // InternalCBS.g:2736:1: ( '{' )
            // InternalCBS.g:2737:2: '{'
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__2__Impl"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__3"
    // InternalCBS.g:2746:1: rule__RequiredDelegationConnector__Group__3 : rule__RequiredDelegationConnector__Group__3__Impl rule__RequiredDelegationConnector__Group__4 ;
    public final void rule__RequiredDelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2750:1: ( rule__RequiredDelegationConnector__Group__3__Impl rule__RequiredDelegationConnector__Group__4 )
            // InternalCBS.g:2751:2: rule__RequiredDelegationConnector__Group__3__Impl rule__RequiredDelegationConnector__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__RequiredDelegationConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__Group__4();

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__3"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__3__Impl"
    // InternalCBS.g:2758:1: rule__RequiredDelegationConnector__Group__3__Impl : ( 'requiringRole' ) ;
    public final void rule__RequiredDelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2762:1: ( ( 'requiringRole' ) )
            // InternalCBS.g:2763:1: ( 'requiringRole' )
            {
            // InternalCBS.g:2763:1: ( 'requiringRole' )
            // InternalCBS.g:2764:2: 'requiringRole'
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleKeyword_3()); 

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__3__Impl"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__4"
    // InternalCBS.g:2773:1: rule__RequiredDelegationConnector__Group__4 : rule__RequiredDelegationConnector__Group__4__Impl rule__RequiredDelegationConnector__Group__5 ;
    public final void rule__RequiredDelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2777:1: ( rule__RequiredDelegationConnector__Group__4__Impl rule__RequiredDelegationConnector__Group__5 )
            // InternalCBS.g:2778:2: rule__RequiredDelegationConnector__Group__4__Impl rule__RequiredDelegationConnector__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__RequiredDelegationConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__Group__5();

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__4"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__4__Impl"
    // InternalCBS.g:2785:1: rule__RequiredDelegationConnector__Group__4__Impl : ( ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 ) ) ;
    public final void rule__RequiredDelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2789:1: ( ( ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 ) ) )
            // InternalCBS.g:2790:1: ( ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 ) )
            {
            // InternalCBS.g:2790:1: ( ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 ) )
            // InternalCBS.g:2791:2: ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 )
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleAssignment_4()); 
            // InternalCBS.g:2792:2: ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 )
            // InternalCBS.g:2792:3: rule__RequiredDelegationConnector__RequiringRoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__RequiringRoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleAssignment_4()); 

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__4__Impl"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__5"
    // InternalCBS.g:2800:1: rule__RequiredDelegationConnector__Group__5 : rule__RequiredDelegationConnector__Group__5__Impl ;
    public final void rule__RequiredDelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2804:1: ( rule__RequiredDelegationConnector__Group__5__Impl )
            // InternalCBS.g:2805:2: rule__RequiredDelegationConnector__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredDelegationConnector__Group__5__Impl();

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__5"


    // $ANTLR start "rule__RequiredDelegationConnector__Group__5__Impl"
    // InternalCBS.g:2811:1: rule__RequiredDelegationConnector__Group__5__Impl : ( '}' ) ;
    public final void rule__RequiredDelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2815:1: ( ( '}' ) )
            // InternalCBS.g:2816:1: ( '}' )
            {
            // InternalCBS.g:2816:1: ( '}' )
            // InternalCBS.g:2817:2: '}'
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRequiredDelegationConnectorAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__RequiredDelegationConnector__Group__5__Impl"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__0"
    // InternalCBS.g:2827:1: rule__ProvidedDelegationConnector__Group__0 : rule__ProvidedDelegationConnector__Group__0__Impl rule__ProvidedDelegationConnector__Group__1 ;
    public final void rule__ProvidedDelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2831:1: ( rule__ProvidedDelegationConnector__Group__0__Impl rule__ProvidedDelegationConnector__Group__1 )
            // InternalCBS.g:2832:2: rule__ProvidedDelegationConnector__Group__0__Impl rule__ProvidedDelegationConnector__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedDelegationConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__Group__1();

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__0"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__0__Impl"
    // InternalCBS.g:2839:1: rule__ProvidedDelegationConnector__Group__0__Impl : ( 'ProvidedDelegationConnector' ) ;
    public final void rule__ProvidedDelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2843:1: ( ( 'ProvidedDelegationConnector' ) )
            // InternalCBS.g:2844:1: ( 'ProvidedDelegationConnector' )
            {
            // InternalCBS.g:2844:1: ( 'ProvidedDelegationConnector' )
            // InternalCBS.g:2845:2: 'ProvidedDelegationConnector'
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidedDelegationConnectorKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProvidedDelegationConnectorAccess().getProvidedDelegationConnectorKeyword_0()); 

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__0__Impl"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__1"
    // InternalCBS.g:2854:1: rule__ProvidedDelegationConnector__Group__1 : rule__ProvidedDelegationConnector__Group__1__Impl rule__ProvidedDelegationConnector__Group__2 ;
    public final void rule__ProvidedDelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2858:1: ( rule__ProvidedDelegationConnector__Group__1__Impl rule__ProvidedDelegationConnector__Group__2 )
            // InternalCBS.g:2859:2: rule__ProvidedDelegationConnector__Group__1__Impl rule__ProvidedDelegationConnector__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProvidedDelegationConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__Group__2();

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__1"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__1__Impl"
    // InternalCBS.g:2866:1: rule__ProvidedDelegationConnector__Group__1__Impl : ( ( rule__ProvidedDelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__ProvidedDelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2870:1: ( ( ( rule__ProvidedDelegationConnector__NameAssignment_1 ) ) )
            // InternalCBS.g:2871:1: ( ( rule__ProvidedDelegationConnector__NameAssignment_1 ) )
            {
            // InternalCBS.g:2871:1: ( ( rule__ProvidedDelegationConnector__NameAssignment_1 ) )
            // InternalCBS.g:2872:2: ( rule__ProvidedDelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalCBS.g:2873:2: ( rule__ProvidedDelegationConnector__NameAssignment_1 )
            // InternalCBS.g:2873:3: rule__ProvidedDelegationConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProvidedDelegationConnectorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__1__Impl"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__2"
    // InternalCBS.g:2881:1: rule__ProvidedDelegationConnector__Group__2 : rule__ProvidedDelegationConnector__Group__2__Impl rule__ProvidedDelegationConnector__Group__3 ;
    public final void rule__ProvidedDelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2885:1: ( rule__ProvidedDelegationConnector__Group__2__Impl rule__ProvidedDelegationConnector__Group__3 )
            // InternalCBS.g:2886:2: rule__ProvidedDelegationConnector__Group__2__Impl rule__ProvidedDelegationConnector__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProvidedDelegationConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__Group__3();

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__2"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__2__Impl"
    // InternalCBS.g:2893:1: rule__ProvidedDelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__ProvidedDelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2897:1: ( ( '{' ) )
            // InternalCBS.g:2898:1: ( '{' )
            {
            // InternalCBS.g:2898:1: ( '{' )
            // InternalCBS.g:2899:2: '{'
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__2__Impl"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__3"
    // InternalCBS.g:2908:1: rule__ProvidedDelegationConnector__Group__3 : rule__ProvidedDelegationConnector__Group__3__Impl rule__ProvidedDelegationConnector__Group__4 ;
    public final void rule__ProvidedDelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2912:1: ( rule__ProvidedDelegationConnector__Group__3__Impl rule__ProvidedDelegationConnector__Group__4 )
            // InternalCBS.g:2913:2: rule__ProvidedDelegationConnector__Group__3__Impl rule__ProvidedDelegationConnector__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedDelegationConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__Group__4();

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__3"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__3__Impl"
    // InternalCBS.g:2920:1: rule__ProvidedDelegationConnector__Group__3__Impl : ( 'providingRole' ) ;
    public final void rule__ProvidedDelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2924:1: ( ( 'providingRole' ) )
            // InternalCBS.g:2925:1: ( 'providingRole' )
            {
            // InternalCBS.g:2925:1: ( 'providingRole' )
            // InternalCBS.g:2926:2: 'providingRole'
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleKeyword_3()); 

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__3__Impl"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__4"
    // InternalCBS.g:2935:1: rule__ProvidedDelegationConnector__Group__4 : rule__ProvidedDelegationConnector__Group__4__Impl rule__ProvidedDelegationConnector__Group__5 ;
    public final void rule__ProvidedDelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2939:1: ( rule__ProvidedDelegationConnector__Group__4__Impl rule__ProvidedDelegationConnector__Group__5 )
            // InternalCBS.g:2940:2: rule__ProvidedDelegationConnector__Group__4__Impl rule__ProvidedDelegationConnector__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ProvidedDelegationConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__Group__5();

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__4"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__4__Impl"
    // InternalCBS.g:2947:1: rule__ProvidedDelegationConnector__Group__4__Impl : ( ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 ) ) ;
    public final void rule__ProvidedDelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2951:1: ( ( ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 ) ) )
            // InternalCBS.g:2952:1: ( ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 ) )
            {
            // InternalCBS.g:2952:1: ( ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 ) )
            // InternalCBS.g:2953:2: ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 )
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleAssignment_4()); 
            // InternalCBS.g:2954:2: ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 )
            // InternalCBS.g:2954:3: rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleAssignment_4()); 

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__4__Impl"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__5"
    // InternalCBS.g:2962:1: rule__ProvidedDelegationConnector__Group__5 : rule__ProvidedDelegationConnector__Group__5__Impl ;
    public final void rule__ProvidedDelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2966:1: ( rule__ProvidedDelegationConnector__Group__5__Impl )
            // InternalCBS.g:2967:2: rule__ProvidedDelegationConnector__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedDelegationConnector__Group__5__Impl();

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__5"


    // $ANTLR start "rule__ProvidedDelegationConnector__Group__5__Impl"
    // InternalCBS.g:2973:1: rule__ProvidedDelegationConnector__Group__5__Impl : ( '}' ) ;
    public final void rule__ProvidedDelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2977:1: ( ( '}' ) )
            // InternalCBS.g:2978:1: ( '}' )
            {
            // InternalCBS.g:2978:1: ( '}' )
            // InternalCBS.g:2979:2: '}'
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProvidedDelegationConnectorAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ProvidedDelegationConnector__Group__5__Impl"


    // $ANTLR start "rule__Allocation__Group__0"
    // InternalCBS.g:2989:1: rule__Allocation__Group__0 : rule__Allocation__Group__0__Impl rule__Allocation__Group__1 ;
    public final void rule__Allocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2993:1: ( rule__Allocation__Group__0__Impl rule__Allocation__Group__1 )
            // InternalCBS.g:2994:2: rule__Allocation__Group__0__Impl rule__Allocation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Allocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__1();

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
    // $ANTLR end "rule__Allocation__Group__0"


    // $ANTLR start "rule__Allocation__Group__0__Impl"
    // InternalCBS.g:3001:1: rule__Allocation__Group__0__Impl : ( 'Allocation' ) ;
    public final void rule__Allocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3005:1: ( ( 'Allocation' ) )
            // InternalCBS.g:3006:1: ( 'Allocation' )
            {
            // InternalCBS.g:3006:1: ( 'Allocation' )
            // InternalCBS.g:3007:2: 'Allocation'
            {
             before(grammarAccess.getAllocationAccess().getAllocationKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getAllocationKeyword_0()); 

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
    // $ANTLR end "rule__Allocation__Group__0__Impl"


    // $ANTLR start "rule__Allocation__Group__1"
    // InternalCBS.g:3016:1: rule__Allocation__Group__1 : rule__Allocation__Group__1__Impl rule__Allocation__Group__2 ;
    public final void rule__Allocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3020:1: ( rule__Allocation__Group__1__Impl rule__Allocation__Group__2 )
            // InternalCBS.g:3021:2: rule__Allocation__Group__1__Impl rule__Allocation__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Allocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__2();

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
    // $ANTLR end "rule__Allocation__Group__1"


    // $ANTLR start "rule__Allocation__Group__1__Impl"
    // InternalCBS.g:3028:1: rule__Allocation__Group__1__Impl : ( '{' ) ;
    public final void rule__Allocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3032:1: ( ( '{' ) )
            // InternalCBS.g:3033:1: ( '{' )
            {
            // InternalCBS.g:3033:1: ( '{' )
            // InternalCBS.g:3034:2: '{'
            {
             before(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Allocation__Group__1__Impl"


    // $ANTLR start "rule__Allocation__Group__2"
    // InternalCBS.g:3043:1: rule__Allocation__Group__2 : rule__Allocation__Group__2__Impl rule__Allocation__Group__3 ;
    public final void rule__Allocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3047:1: ( rule__Allocation__Group__2__Impl rule__Allocation__Group__3 )
            // InternalCBS.g:3048:2: rule__Allocation__Group__2__Impl rule__Allocation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Allocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__3();

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
    // $ANTLR end "rule__Allocation__Group__2"


    // $ANTLR start "rule__Allocation__Group__2__Impl"
    // InternalCBS.g:3055:1: rule__Allocation__Group__2__Impl : ( 'environment' ) ;
    public final void rule__Allocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3059:1: ( ( 'environment' ) )
            // InternalCBS.g:3060:1: ( 'environment' )
            {
            // InternalCBS.g:3060:1: ( 'environment' )
            // InternalCBS.g:3061:2: 'environment'
            {
             before(grammarAccess.getAllocationAccess().getEnvironmentKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getEnvironmentKeyword_2()); 

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
    // $ANTLR end "rule__Allocation__Group__2__Impl"


    // $ANTLR start "rule__Allocation__Group__3"
    // InternalCBS.g:3070:1: rule__Allocation__Group__3 : rule__Allocation__Group__3__Impl rule__Allocation__Group__4 ;
    public final void rule__Allocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3074:1: ( rule__Allocation__Group__3__Impl rule__Allocation__Group__4 )
            // InternalCBS.g:3075:2: rule__Allocation__Group__3__Impl rule__Allocation__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Allocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__4();

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
    // $ANTLR end "rule__Allocation__Group__3"


    // $ANTLR start "rule__Allocation__Group__3__Impl"
    // InternalCBS.g:3082:1: rule__Allocation__Group__3__Impl : ( ( rule__Allocation__EnvironmentAssignment_3 ) ) ;
    public final void rule__Allocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3086:1: ( ( ( rule__Allocation__EnvironmentAssignment_3 ) ) )
            // InternalCBS.g:3087:1: ( ( rule__Allocation__EnvironmentAssignment_3 ) )
            {
            // InternalCBS.g:3087:1: ( ( rule__Allocation__EnvironmentAssignment_3 ) )
            // InternalCBS.g:3088:2: ( rule__Allocation__EnvironmentAssignment_3 )
            {
             before(grammarAccess.getAllocationAccess().getEnvironmentAssignment_3()); 
            // InternalCBS.g:3089:2: ( rule__Allocation__EnvironmentAssignment_3 )
            // InternalCBS.g:3089:3: rule__Allocation__EnvironmentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__EnvironmentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getEnvironmentAssignment_3()); 

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
    // $ANTLR end "rule__Allocation__Group__3__Impl"


    // $ANTLR start "rule__Allocation__Group__4"
    // InternalCBS.g:3097:1: rule__Allocation__Group__4 : rule__Allocation__Group__4__Impl rule__Allocation__Group__5 ;
    public final void rule__Allocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3101:1: ( rule__Allocation__Group__4__Impl rule__Allocation__Group__5 )
            // InternalCBS.g:3102:2: rule__Allocation__Group__4__Impl rule__Allocation__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Allocation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__5();

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
    // $ANTLR end "rule__Allocation__Group__4"


    // $ANTLR start "rule__Allocation__Group__4__Impl"
    // InternalCBS.g:3109:1: rule__Allocation__Group__4__Impl : ( ( rule__Allocation__Group_4__0 )? ) ;
    public final void rule__Allocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3113:1: ( ( ( rule__Allocation__Group_4__0 )? ) )
            // InternalCBS.g:3114:1: ( ( rule__Allocation__Group_4__0 )? )
            {
            // InternalCBS.g:3114:1: ( ( rule__Allocation__Group_4__0 )? )
            // InternalCBS.g:3115:2: ( rule__Allocation__Group_4__0 )?
            {
             before(grammarAccess.getAllocationAccess().getGroup_4()); 
            // InternalCBS.g:3116:2: ( rule__Allocation__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCBS.g:3116:3: rule__Allocation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Allocation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllocationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Allocation__Group__4__Impl"


    // $ANTLR start "rule__Allocation__Group__5"
    // InternalCBS.g:3124:1: rule__Allocation__Group__5 : rule__Allocation__Group__5__Impl ;
    public final void rule__Allocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3128:1: ( rule__Allocation__Group__5__Impl )
            // InternalCBS.g:3129:2: rule__Allocation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group__5__Impl();

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
    // $ANTLR end "rule__Allocation__Group__5"


    // $ANTLR start "rule__Allocation__Group__5__Impl"
    // InternalCBS.g:3135:1: rule__Allocation__Group__5__Impl : ( '}' ) ;
    public final void rule__Allocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3139:1: ( ( '}' ) )
            // InternalCBS.g:3140:1: ( '}' )
            {
            // InternalCBS.g:3140:1: ( '}' )
            // InternalCBS.g:3141:2: '}'
            {
             before(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Allocation__Group__5__Impl"


    // $ANTLR start "rule__Allocation__Group_4__0"
    // InternalCBS.g:3151:1: rule__Allocation__Group_4__0 : rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1 ;
    public final void rule__Allocation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3155:1: ( rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1 )
            // InternalCBS.g:3156:2: rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Allocation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group_4__1();

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
    // $ANTLR end "rule__Allocation__Group_4__0"


    // $ANTLR start "rule__Allocation__Group_4__0__Impl"
    // InternalCBS.g:3163:1: rule__Allocation__Group_4__0__Impl : ( 'allocationContexts' ) ;
    public final void rule__Allocation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3167:1: ( ( 'allocationContexts' ) )
            // InternalCBS.g:3168:1: ( 'allocationContexts' )
            {
            // InternalCBS.g:3168:1: ( 'allocationContexts' )
            // InternalCBS.g:3169:2: 'allocationContexts'
            {
             before(grammarAccess.getAllocationAccess().getAllocationContextsKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getAllocationContextsKeyword_4_0()); 

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
    // $ANTLR end "rule__Allocation__Group_4__0__Impl"


    // $ANTLR start "rule__Allocation__Group_4__1"
    // InternalCBS.g:3178:1: rule__Allocation__Group_4__1 : rule__Allocation__Group_4__1__Impl rule__Allocation__Group_4__2 ;
    public final void rule__Allocation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3182:1: ( rule__Allocation__Group_4__1__Impl rule__Allocation__Group_4__2 )
            // InternalCBS.g:3183:2: rule__Allocation__Group_4__1__Impl rule__Allocation__Group_4__2
            {
            pushFollow(FOLLOW_22);
            rule__Allocation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group_4__2();

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
    // $ANTLR end "rule__Allocation__Group_4__1"


    // $ANTLR start "rule__Allocation__Group_4__1__Impl"
    // InternalCBS.g:3190:1: rule__Allocation__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Allocation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3194:1: ( ( '{' ) )
            // InternalCBS.g:3195:1: ( '{' )
            {
            // InternalCBS.g:3195:1: ( '{' )
            // InternalCBS.g:3196:2: '{'
            {
             before(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Allocation__Group_4__1__Impl"


    // $ANTLR start "rule__Allocation__Group_4__2"
    // InternalCBS.g:3205:1: rule__Allocation__Group_4__2 : rule__Allocation__Group_4__2__Impl rule__Allocation__Group_4__3 ;
    public final void rule__Allocation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3209:1: ( rule__Allocation__Group_4__2__Impl rule__Allocation__Group_4__3 )
            // InternalCBS.g:3210:2: rule__Allocation__Group_4__2__Impl rule__Allocation__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__Allocation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group_4__3();

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
    // $ANTLR end "rule__Allocation__Group_4__2"


    // $ANTLR start "rule__Allocation__Group_4__2__Impl"
    // InternalCBS.g:3217:1: rule__Allocation__Group_4__2__Impl : ( ( rule__Allocation__AllocationContextsAssignment_4_2 ) ) ;
    public final void rule__Allocation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3221:1: ( ( ( rule__Allocation__AllocationContextsAssignment_4_2 ) ) )
            // InternalCBS.g:3222:1: ( ( rule__Allocation__AllocationContextsAssignment_4_2 ) )
            {
            // InternalCBS.g:3222:1: ( ( rule__Allocation__AllocationContextsAssignment_4_2 ) )
            // InternalCBS.g:3223:2: ( rule__Allocation__AllocationContextsAssignment_4_2 )
            {
             before(grammarAccess.getAllocationAccess().getAllocationContextsAssignment_4_2()); 
            // InternalCBS.g:3224:2: ( rule__Allocation__AllocationContextsAssignment_4_2 )
            // InternalCBS.g:3224:3: rule__Allocation__AllocationContextsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__AllocationContextsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getAllocationContextsAssignment_4_2()); 

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
    // $ANTLR end "rule__Allocation__Group_4__2__Impl"


    // $ANTLR start "rule__Allocation__Group_4__3"
    // InternalCBS.g:3232:1: rule__Allocation__Group_4__3 : rule__Allocation__Group_4__3__Impl rule__Allocation__Group_4__4 ;
    public final void rule__Allocation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3236:1: ( rule__Allocation__Group_4__3__Impl rule__Allocation__Group_4__4 )
            // InternalCBS.g:3237:2: rule__Allocation__Group_4__3__Impl rule__Allocation__Group_4__4
            {
            pushFollow(FOLLOW_9);
            rule__Allocation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group_4__4();

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
    // $ANTLR end "rule__Allocation__Group_4__3"


    // $ANTLR start "rule__Allocation__Group_4__3__Impl"
    // InternalCBS.g:3244:1: rule__Allocation__Group_4__3__Impl : ( ( rule__Allocation__Group_4_3__0 )* ) ;
    public final void rule__Allocation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3248:1: ( ( ( rule__Allocation__Group_4_3__0 )* ) )
            // InternalCBS.g:3249:1: ( ( rule__Allocation__Group_4_3__0 )* )
            {
            // InternalCBS.g:3249:1: ( ( rule__Allocation__Group_4_3__0 )* )
            // InternalCBS.g:3250:2: ( rule__Allocation__Group_4_3__0 )*
            {
             before(grammarAccess.getAllocationAccess().getGroup_4_3()); 
            // InternalCBS.g:3251:2: ( rule__Allocation__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCBS.g:3251:3: rule__Allocation__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Allocation__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAllocationAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Allocation__Group_4__3__Impl"


    // $ANTLR start "rule__Allocation__Group_4__4"
    // InternalCBS.g:3259:1: rule__Allocation__Group_4__4 : rule__Allocation__Group_4__4__Impl ;
    public final void rule__Allocation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3263:1: ( rule__Allocation__Group_4__4__Impl )
            // InternalCBS.g:3264:2: rule__Allocation__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group_4__4__Impl();

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
    // $ANTLR end "rule__Allocation__Group_4__4"


    // $ANTLR start "rule__Allocation__Group_4__4__Impl"
    // InternalCBS.g:3270:1: rule__Allocation__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Allocation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3274:1: ( ( '}' ) )
            // InternalCBS.g:3275:1: ( '}' )
            {
            // InternalCBS.g:3275:1: ( '}' )
            // InternalCBS.g:3276:2: '}'
            {
             before(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Allocation__Group_4__4__Impl"


    // $ANTLR start "rule__Allocation__Group_4_3__0"
    // InternalCBS.g:3286:1: rule__Allocation__Group_4_3__0 : rule__Allocation__Group_4_3__0__Impl rule__Allocation__Group_4_3__1 ;
    public final void rule__Allocation__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3290:1: ( rule__Allocation__Group_4_3__0__Impl rule__Allocation__Group_4_3__1 )
            // InternalCBS.g:3291:2: rule__Allocation__Group_4_3__0__Impl rule__Allocation__Group_4_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Allocation__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group_4_3__1();

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
    // $ANTLR end "rule__Allocation__Group_4_3__0"


    // $ANTLR start "rule__Allocation__Group_4_3__0__Impl"
    // InternalCBS.g:3298:1: rule__Allocation__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Allocation__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3302:1: ( ( ',' ) )
            // InternalCBS.g:3303:1: ( ',' )
            {
            // InternalCBS.g:3303:1: ( ',' )
            // InternalCBS.g:3304:2: ','
            {
             before(grammarAccess.getAllocationAccess().getCommaKeyword_4_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Allocation__Group_4_3__0__Impl"


    // $ANTLR start "rule__Allocation__Group_4_3__1"
    // InternalCBS.g:3313:1: rule__Allocation__Group_4_3__1 : rule__Allocation__Group_4_3__1__Impl ;
    public final void rule__Allocation__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3317:1: ( rule__Allocation__Group_4_3__1__Impl )
            // InternalCBS.g:3318:2: rule__Allocation__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Allocation__Group_4_3__1"


    // $ANTLR start "rule__Allocation__Group_4_3__1__Impl"
    // InternalCBS.g:3324:1: rule__Allocation__Group_4_3__1__Impl : ( ( rule__Allocation__AllocationContextsAssignment_4_3_1 ) ) ;
    public final void rule__Allocation__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3328:1: ( ( ( rule__Allocation__AllocationContextsAssignment_4_3_1 ) ) )
            // InternalCBS.g:3329:1: ( ( rule__Allocation__AllocationContextsAssignment_4_3_1 ) )
            {
            // InternalCBS.g:3329:1: ( ( rule__Allocation__AllocationContextsAssignment_4_3_1 ) )
            // InternalCBS.g:3330:2: ( rule__Allocation__AllocationContextsAssignment_4_3_1 )
            {
             before(grammarAccess.getAllocationAccess().getAllocationContextsAssignment_4_3_1()); 
            // InternalCBS.g:3331:2: ( rule__Allocation__AllocationContextsAssignment_4_3_1 )
            // InternalCBS.g:3331:3: rule__Allocation__AllocationContextsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__AllocationContextsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getAllocationContextsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Allocation__Group_4_3__1__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__0"
    // InternalCBS.g:3340:1: rule__ProvidedRole__Group__0 : rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 ;
    public final void rule__ProvidedRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3344:1: ( rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 )
            // InternalCBS.g:3345:2: rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__1();

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
    // $ANTLR end "rule__ProvidedRole__Group__0"


    // $ANTLR start "rule__ProvidedRole__Group__0__Impl"
    // InternalCBS.g:3352:1: rule__ProvidedRole__Group__0__Impl : ( 'ProvidedRole' ) ;
    public final void rule__ProvidedRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3356:1: ( ( 'ProvidedRole' ) )
            // InternalCBS.g:3357:1: ( 'ProvidedRole' )
            {
            // InternalCBS.g:3357:1: ( 'ProvidedRole' )
            // InternalCBS.g:3358:2: 'ProvidedRole'
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 

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
    // $ANTLR end "rule__ProvidedRole__Group__0__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__1"
    // InternalCBS.g:3367:1: rule__ProvidedRole__Group__1 : rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 ;
    public final void rule__ProvidedRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3371:1: ( rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 )
            // InternalCBS.g:3372:2: rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProvidedRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__2();

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
    // $ANTLR end "rule__ProvidedRole__Group__1"


    // $ANTLR start "rule__ProvidedRole__Group__1__Impl"
    // InternalCBS.g:3379:1: rule__ProvidedRole__Group__1__Impl : ( ( rule__ProvidedRole__NameAssignment_1 ) ) ;
    public final void rule__ProvidedRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3383:1: ( ( ( rule__ProvidedRole__NameAssignment_1 ) ) )
            // InternalCBS.g:3384:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            {
            // InternalCBS.g:3384:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            // InternalCBS.g:3385:2: ( rule__ProvidedRole__NameAssignment_1 )
            {
             before(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 
            // InternalCBS.g:3386:2: ( rule__ProvidedRole__NameAssignment_1 )
            // InternalCBS.g:3386:3: rule__ProvidedRole__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ProvidedRole__Group__1__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__2"
    // InternalCBS.g:3394:1: rule__ProvidedRole__Group__2 : rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 ;
    public final void rule__ProvidedRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3398:1: ( rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 )
            // InternalCBS.g:3399:2: rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ProvidedRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__3();

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
    // $ANTLR end "rule__ProvidedRole__Group__2"


    // $ANTLR start "rule__ProvidedRole__Group__2__Impl"
    // InternalCBS.g:3406:1: rule__ProvidedRole__Group__2__Impl : ( '{' ) ;
    public final void rule__ProvidedRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3410:1: ( ( '{' ) )
            // InternalCBS.g:3411:1: ( '{' )
            {
            // InternalCBS.g:3411:1: ( '{' )
            // InternalCBS.g:3412:2: '{'
            {
             before(grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ProvidedRole__Group__2__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__3"
    // InternalCBS.g:3421:1: rule__ProvidedRole__Group__3 : rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 ;
    public final void rule__ProvidedRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3425:1: ( rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 )
            // InternalCBS.g:3426:2: rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__4();

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
    // $ANTLR end "rule__ProvidedRole__Group__3"


    // $ANTLR start "rule__ProvidedRole__Group__3__Impl"
    // InternalCBS.g:3433:1: rule__ProvidedRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__ProvidedRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3437:1: ( ( 'interface' ) )
            // InternalCBS.g:3438:1: ( 'interface' )
            {
            // InternalCBS.g:3438:1: ( 'interface' )
            // InternalCBS.g:3439:2: 'interface'
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 

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
    // $ANTLR end "rule__ProvidedRole__Group__3__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__4"
    // InternalCBS.g:3448:1: rule__ProvidedRole__Group__4 : rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 ;
    public final void rule__ProvidedRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3452:1: ( rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 )
            // InternalCBS.g:3453:2: rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ProvidedRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__5();

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
    // $ANTLR end "rule__ProvidedRole__Group__4"


    // $ANTLR start "rule__ProvidedRole__Group__4__Impl"
    // InternalCBS.g:3460:1: rule__ProvidedRole__Group__4__Impl : ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) ;
    public final void rule__ProvidedRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3464:1: ( ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) )
            // InternalCBS.g:3465:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            {
            // InternalCBS.g:3465:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            // InternalCBS.g:3466:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 
            // InternalCBS.g:3467:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            // InternalCBS.g:3467:3: rule__ProvidedRole__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 

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
    // $ANTLR end "rule__ProvidedRole__Group__4__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__5"
    // InternalCBS.g:3475:1: rule__ProvidedRole__Group__5 : rule__ProvidedRole__Group__5__Impl ;
    public final void rule__ProvidedRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3479:1: ( rule__ProvidedRole__Group__5__Impl )
            // InternalCBS.g:3480:2: rule__ProvidedRole__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__5__Impl();

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
    // $ANTLR end "rule__ProvidedRole__Group__5"


    // $ANTLR start "rule__ProvidedRole__Group__5__Impl"
    // InternalCBS.g:3486:1: rule__ProvidedRole__Group__5__Impl : ( '}' ) ;
    public final void rule__ProvidedRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3490:1: ( ( '}' ) )
            // InternalCBS.g:3491:1: ( '}' )
            {
            // InternalCBS.g:3491:1: ( '}' )
            // InternalCBS.g:3492:2: '}'
            {
             before(grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ProvidedRole__Group__5__Impl"


    // $ANTLR start "rule__RequiredRole__Group__0"
    // InternalCBS.g:3502:1: rule__RequiredRole__Group__0 : rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 ;
    public final void rule__RequiredRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3506:1: ( rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 )
            // InternalCBS.g:3507:2: rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RequiredRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__1();

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
    // $ANTLR end "rule__RequiredRole__Group__0"


    // $ANTLR start "rule__RequiredRole__Group__0__Impl"
    // InternalCBS.g:3514:1: rule__RequiredRole__Group__0__Impl : ( 'RequiredRole' ) ;
    public final void rule__RequiredRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3518:1: ( ( 'RequiredRole' ) )
            // InternalCBS.g:3519:1: ( 'RequiredRole' )
            {
            // InternalCBS.g:3519:1: ( 'RequiredRole' )
            // InternalCBS.g:3520:2: 'RequiredRole'
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 

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
    // $ANTLR end "rule__RequiredRole__Group__0__Impl"


    // $ANTLR start "rule__RequiredRole__Group__1"
    // InternalCBS.g:3529:1: rule__RequiredRole__Group__1 : rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 ;
    public final void rule__RequiredRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3533:1: ( rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 )
            // InternalCBS.g:3534:2: rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RequiredRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__2();

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
    // $ANTLR end "rule__RequiredRole__Group__1"


    // $ANTLR start "rule__RequiredRole__Group__1__Impl"
    // InternalCBS.g:3541:1: rule__RequiredRole__Group__1__Impl : ( ( rule__RequiredRole__NameAssignment_1 ) ) ;
    public final void rule__RequiredRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3545:1: ( ( ( rule__RequiredRole__NameAssignment_1 ) ) )
            // InternalCBS.g:3546:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            {
            // InternalCBS.g:3546:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            // InternalCBS.g:3547:2: ( rule__RequiredRole__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 
            // InternalCBS.g:3548:2: ( rule__RequiredRole__NameAssignment_1 )
            // InternalCBS.g:3548:3: rule__RequiredRole__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RequiredRole__Group__1__Impl"


    // $ANTLR start "rule__RequiredRole__Group__2"
    // InternalCBS.g:3556:1: rule__RequiredRole__Group__2 : rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 ;
    public final void rule__RequiredRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3560:1: ( rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 )
            // InternalCBS.g:3561:2: rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__RequiredRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__3();

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
    // $ANTLR end "rule__RequiredRole__Group__2"


    // $ANTLR start "rule__RequiredRole__Group__2__Impl"
    // InternalCBS.g:3568:1: rule__RequiredRole__Group__2__Impl : ( '{' ) ;
    public final void rule__RequiredRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3572:1: ( ( '{' ) )
            // InternalCBS.g:3573:1: ( '{' )
            {
            // InternalCBS.g:3573:1: ( '{' )
            // InternalCBS.g:3574:2: '{'
            {
             before(grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RequiredRole__Group__2__Impl"


    // $ANTLR start "rule__RequiredRole__Group__3"
    // InternalCBS.g:3583:1: rule__RequiredRole__Group__3 : rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 ;
    public final void rule__RequiredRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3587:1: ( rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 )
            // InternalCBS.g:3588:2: rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__RequiredRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__4();

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
    // $ANTLR end "rule__RequiredRole__Group__3"


    // $ANTLR start "rule__RequiredRole__Group__3__Impl"
    // InternalCBS.g:3595:1: rule__RequiredRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__RequiredRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3599:1: ( ( 'interface' ) )
            // InternalCBS.g:3600:1: ( 'interface' )
            {
            // InternalCBS.g:3600:1: ( 'interface' )
            // InternalCBS.g:3601:2: 'interface'
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 

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
    // $ANTLR end "rule__RequiredRole__Group__3__Impl"


    // $ANTLR start "rule__RequiredRole__Group__4"
    // InternalCBS.g:3610:1: rule__RequiredRole__Group__4 : rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 ;
    public final void rule__RequiredRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3614:1: ( rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 )
            // InternalCBS.g:3615:2: rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__RequiredRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__5();

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
    // $ANTLR end "rule__RequiredRole__Group__4"


    // $ANTLR start "rule__RequiredRole__Group__4__Impl"
    // InternalCBS.g:3622:1: rule__RequiredRole__Group__4__Impl : ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) ;
    public final void rule__RequiredRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3626:1: ( ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) )
            // InternalCBS.g:3627:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            {
            // InternalCBS.g:3627:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            // InternalCBS.g:3628:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 
            // InternalCBS.g:3629:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            // InternalCBS.g:3629:3: rule__RequiredRole__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 

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
    // $ANTLR end "rule__RequiredRole__Group__4__Impl"


    // $ANTLR start "rule__RequiredRole__Group__5"
    // InternalCBS.g:3637:1: rule__RequiredRole__Group__5 : rule__RequiredRole__Group__5__Impl ;
    public final void rule__RequiredRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3641:1: ( rule__RequiredRole__Group__5__Impl )
            // InternalCBS.g:3642:2: rule__RequiredRole__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__5__Impl();

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
    // $ANTLR end "rule__RequiredRole__Group__5"


    // $ANTLR start "rule__RequiredRole__Group__5__Impl"
    // InternalCBS.g:3648:1: rule__RequiredRole__Group__5__Impl : ( '}' ) ;
    public final void rule__RequiredRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3652:1: ( ( '}' ) )
            // InternalCBS.g:3653:1: ( '}' )
            {
            // InternalCBS.g:3653:1: ( '}' )
            // InternalCBS.g:3654:2: '}'
            {
             before(grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__RequiredRole__Group__5__Impl"


    // $ANTLR start "rule__AtomicComponent__Group__0"
    // InternalCBS.g:3664:1: rule__AtomicComponent__Group__0 : rule__AtomicComponent__Group__0__Impl rule__AtomicComponent__Group__1 ;
    public final void rule__AtomicComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3668:1: ( rule__AtomicComponent__Group__0__Impl rule__AtomicComponent__Group__1 )
            // InternalCBS.g:3669:2: rule__AtomicComponent__Group__0__Impl rule__AtomicComponent__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AtomicComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__1();

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
    // $ANTLR end "rule__AtomicComponent__Group__0"


    // $ANTLR start "rule__AtomicComponent__Group__0__Impl"
    // InternalCBS.g:3676:1: rule__AtomicComponent__Group__0__Impl : ( () ) ;
    public final void rule__AtomicComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3680:1: ( ( () ) )
            // InternalCBS.g:3681:1: ( () )
            {
            // InternalCBS.g:3681:1: ( () )
            // InternalCBS.g:3682:2: ()
            {
             before(grammarAccess.getAtomicComponentAccess().getAtomicComponentAction_0()); 
            // InternalCBS.g:3683:2: ()
            // InternalCBS.g:3683:3: 
            {
            }

             after(grammarAccess.getAtomicComponentAccess().getAtomicComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicComponent__Group__0__Impl"


    // $ANTLR start "rule__AtomicComponent__Group__1"
    // InternalCBS.g:3691:1: rule__AtomicComponent__Group__1 : rule__AtomicComponent__Group__1__Impl rule__AtomicComponent__Group__2 ;
    public final void rule__AtomicComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3695:1: ( rule__AtomicComponent__Group__1__Impl rule__AtomicComponent__Group__2 )
            // InternalCBS.g:3696:2: rule__AtomicComponent__Group__1__Impl rule__AtomicComponent__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AtomicComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__2();

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
    // $ANTLR end "rule__AtomicComponent__Group__1"


    // $ANTLR start "rule__AtomicComponent__Group__1__Impl"
    // InternalCBS.g:3703:1: rule__AtomicComponent__Group__1__Impl : ( 'AtomicComponent' ) ;
    public final void rule__AtomicComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3707:1: ( ( 'AtomicComponent' ) )
            // InternalCBS.g:3708:1: ( 'AtomicComponent' )
            {
            // InternalCBS.g:3708:1: ( 'AtomicComponent' )
            // InternalCBS.g:3709:2: 'AtomicComponent'
            {
             before(grammarAccess.getAtomicComponentAccess().getAtomicComponentKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getAtomicComponentKeyword_1()); 

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
    // $ANTLR end "rule__AtomicComponent__Group__1__Impl"


    // $ANTLR start "rule__AtomicComponent__Group__2"
    // InternalCBS.g:3718:1: rule__AtomicComponent__Group__2 : rule__AtomicComponent__Group__2__Impl rule__AtomicComponent__Group__3 ;
    public final void rule__AtomicComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3722:1: ( rule__AtomicComponent__Group__2__Impl rule__AtomicComponent__Group__3 )
            // InternalCBS.g:3723:2: rule__AtomicComponent__Group__2__Impl rule__AtomicComponent__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AtomicComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__3();

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
    // $ANTLR end "rule__AtomicComponent__Group__2"


    // $ANTLR start "rule__AtomicComponent__Group__2__Impl"
    // InternalCBS.g:3730:1: rule__AtomicComponent__Group__2__Impl : ( ( rule__AtomicComponent__NameAssignment_2 ) ) ;
    public final void rule__AtomicComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3734:1: ( ( ( rule__AtomicComponent__NameAssignment_2 ) ) )
            // InternalCBS.g:3735:1: ( ( rule__AtomicComponent__NameAssignment_2 ) )
            {
            // InternalCBS.g:3735:1: ( ( rule__AtomicComponent__NameAssignment_2 ) )
            // InternalCBS.g:3736:2: ( rule__AtomicComponent__NameAssignment_2 )
            {
             before(grammarAccess.getAtomicComponentAccess().getNameAssignment_2()); 
            // InternalCBS.g:3737:2: ( rule__AtomicComponent__NameAssignment_2 )
            // InternalCBS.g:3737:3: rule__AtomicComponent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicComponentAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__AtomicComponent__Group__2__Impl"


    // $ANTLR start "rule__AtomicComponent__Group__3"
    // InternalCBS.g:3745:1: rule__AtomicComponent__Group__3 : rule__AtomicComponent__Group__3__Impl rule__AtomicComponent__Group__4 ;
    public final void rule__AtomicComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3749:1: ( rule__AtomicComponent__Group__3__Impl rule__AtomicComponent__Group__4 )
            // InternalCBS.g:3750:2: rule__AtomicComponent__Group__3__Impl rule__AtomicComponent__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__AtomicComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__4();

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
    // $ANTLR end "rule__AtomicComponent__Group__3"


    // $ANTLR start "rule__AtomicComponent__Group__3__Impl"
    // InternalCBS.g:3757:1: rule__AtomicComponent__Group__3__Impl : ( '{' ) ;
    public final void rule__AtomicComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3761:1: ( ( '{' ) )
            // InternalCBS.g:3762:1: ( '{' )
            {
            // InternalCBS.g:3762:1: ( '{' )
            // InternalCBS.g:3763:2: '{'
            {
             before(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__AtomicComponent__Group__3__Impl"


    // $ANTLR start "rule__AtomicComponent__Group__4"
    // InternalCBS.g:3772:1: rule__AtomicComponent__Group__4 : rule__AtomicComponent__Group__4__Impl rule__AtomicComponent__Group__5 ;
    public final void rule__AtomicComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3776:1: ( rule__AtomicComponent__Group__4__Impl rule__AtomicComponent__Group__5 )
            // InternalCBS.g:3777:2: rule__AtomicComponent__Group__4__Impl rule__AtomicComponent__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__AtomicComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__5();

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
    // $ANTLR end "rule__AtomicComponent__Group__4"


    // $ANTLR start "rule__AtomicComponent__Group__4__Impl"
    // InternalCBS.g:3784:1: rule__AtomicComponent__Group__4__Impl : ( ( rule__AtomicComponent__Group_4__0 )? ) ;
    public final void rule__AtomicComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3788:1: ( ( ( rule__AtomicComponent__Group_4__0 )? ) )
            // InternalCBS.g:3789:1: ( ( rule__AtomicComponent__Group_4__0 )? )
            {
            // InternalCBS.g:3789:1: ( ( rule__AtomicComponent__Group_4__0 )? )
            // InternalCBS.g:3790:2: ( rule__AtomicComponent__Group_4__0 )?
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_4()); 
            // InternalCBS.g:3791:2: ( rule__AtomicComponent__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCBS.g:3791:3: rule__AtomicComponent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicComponent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicComponentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AtomicComponent__Group__4__Impl"


    // $ANTLR start "rule__AtomicComponent__Group__5"
    // InternalCBS.g:3799:1: rule__AtomicComponent__Group__5 : rule__AtomicComponent__Group__5__Impl rule__AtomicComponent__Group__6 ;
    public final void rule__AtomicComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3803:1: ( rule__AtomicComponent__Group__5__Impl rule__AtomicComponent__Group__6 )
            // InternalCBS.g:3804:2: rule__AtomicComponent__Group__5__Impl rule__AtomicComponent__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__AtomicComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__6();

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
    // $ANTLR end "rule__AtomicComponent__Group__5"


    // $ANTLR start "rule__AtomicComponent__Group__5__Impl"
    // InternalCBS.g:3811:1: rule__AtomicComponent__Group__5__Impl : ( ( rule__AtomicComponent__Group_5__0 )? ) ;
    public final void rule__AtomicComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3815:1: ( ( ( rule__AtomicComponent__Group_5__0 )? ) )
            // InternalCBS.g:3816:1: ( ( rule__AtomicComponent__Group_5__0 )? )
            {
            // InternalCBS.g:3816:1: ( ( rule__AtomicComponent__Group_5__0 )? )
            // InternalCBS.g:3817:2: ( rule__AtomicComponent__Group_5__0 )?
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_5()); 
            // InternalCBS.g:3818:2: ( rule__AtomicComponent__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCBS.g:3818:3: rule__AtomicComponent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicComponent__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicComponentAccess().getGroup_5()); 

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
    // $ANTLR end "rule__AtomicComponent__Group__5__Impl"


    // $ANTLR start "rule__AtomicComponent__Group__6"
    // InternalCBS.g:3826:1: rule__AtomicComponent__Group__6 : rule__AtomicComponent__Group__6__Impl rule__AtomicComponent__Group__7 ;
    public final void rule__AtomicComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3830:1: ( rule__AtomicComponent__Group__6__Impl rule__AtomicComponent__Group__7 )
            // InternalCBS.g:3831:2: rule__AtomicComponent__Group__6__Impl rule__AtomicComponent__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__AtomicComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__7();

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
    // $ANTLR end "rule__AtomicComponent__Group__6"


    // $ANTLR start "rule__AtomicComponent__Group__6__Impl"
    // InternalCBS.g:3838:1: rule__AtomicComponent__Group__6__Impl : ( ( rule__AtomicComponent__Group_6__0 )? ) ;
    public final void rule__AtomicComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3842:1: ( ( ( rule__AtomicComponent__Group_6__0 )? ) )
            // InternalCBS.g:3843:1: ( ( rule__AtomicComponent__Group_6__0 )? )
            {
            // InternalCBS.g:3843:1: ( ( rule__AtomicComponent__Group_6__0 )? )
            // InternalCBS.g:3844:2: ( rule__AtomicComponent__Group_6__0 )?
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_6()); 
            // InternalCBS.g:3845:2: ( rule__AtomicComponent__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCBS.g:3845:3: rule__AtomicComponent__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicComponent__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicComponentAccess().getGroup_6()); 

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
    // $ANTLR end "rule__AtomicComponent__Group__6__Impl"


    // $ANTLR start "rule__AtomicComponent__Group__7"
    // InternalCBS.g:3853:1: rule__AtomicComponent__Group__7 : rule__AtomicComponent__Group__7__Impl ;
    public final void rule__AtomicComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3857:1: ( rule__AtomicComponent__Group__7__Impl )
            // InternalCBS.g:3858:2: rule__AtomicComponent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group__7__Impl();

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
    // $ANTLR end "rule__AtomicComponent__Group__7"


    // $ANTLR start "rule__AtomicComponent__Group__7__Impl"
    // InternalCBS.g:3864:1: rule__AtomicComponent__Group__7__Impl : ( '}' ) ;
    public final void rule__AtomicComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3868:1: ( ( '}' ) )
            // InternalCBS.g:3869:1: ( '}' )
            {
            // InternalCBS.g:3869:1: ( '}' )
            // InternalCBS.g:3870:2: '}'
            {
             before(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__AtomicComponent__Group__7__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_4__0"
    // InternalCBS.g:3880:1: rule__AtomicComponent__Group_4__0 : rule__AtomicComponent__Group_4__0__Impl rule__AtomicComponent__Group_4__1 ;
    public final void rule__AtomicComponent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3884:1: ( rule__AtomicComponent__Group_4__0__Impl rule__AtomicComponent__Group_4__1 )
            // InternalCBS.g:3885:2: rule__AtomicComponent__Group_4__0__Impl rule__AtomicComponent__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__AtomicComponent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_4__1();

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
    // $ANTLR end "rule__AtomicComponent__Group_4__0"


    // $ANTLR start "rule__AtomicComponent__Group_4__0__Impl"
    // InternalCBS.g:3892:1: rule__AtomicComponent__Group_4__0__Impl : ( 'requires' ) ;
    public final void rule__AtomicComponent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3896:1: ( ( 'requires' ) )
            // InternalCBS.g:3897:1: ( 'requires' )
            {
            // InternalCBS.g:3897:1: ( 'requires' )
            // InternalCBS.g:3898:2: 'requires'
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getRequiresKeyword_4_0()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_4__0__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_4__1"
    // InternalCBS.g:3907:1: rule__AtomicComponent__Group_4__1 : rule__AtomicComponent__Group_4__1__Impl rule__AtomicComponent__Group_4__2 ;
    public final void rule__AtomicComponent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3911:1: ( rule__AtomicComponent__Group_4__1__Impl rule__AtomicComponent__Group_4__2 )
            // InternalCBS.g:3912:2: rule__AtomicComponent__Group_4__1__Impl rule__AtomicComponent__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__AtomicComponent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_4__2();

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
    // $ANTLR end "rule__AtomicComponent__Group_4__1"


    // $ANTLR start "rule__AtomicComponent__Group_4__1__Impl"
    // InternalCBS.g:3919:1: rule__AtomicComponent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__AtomicComponent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3923:1: ( ( '(' ) )
            // InternalCBS.g:3924:1: ( '(' )
            {
            // InternalCBS.g:3924:1: ( '(' )
            // InternalCBS.g:3925:2: '('
            {
             before(grammarAccess.getAtomicComponentAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_4__1__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_4__2"
    // InternalCBS.g:3934:1: rule__AtomicComponent__Group_4__2 : rule__AtomicComponent__Group_4__2__Impl rule__AtomicComponent__Group_4__3 ;
    public final void rule__AtomicComponent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3938:1: ( rule__AtomicComponent__Group_4__2__Impl rule__AtomicComponent__Group_4__3 )
            // InternalCBS.g:3939:2: rule__AtomicComponent__Group_4__2__Impl rule__AtomicComponent__Group_4__3
            {
            pushFollow(FOLLOW_27);
            rule__AtomicComponent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_4__3();

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
    // $ANTLR end "rule__AtomicComponent__Group_4__2"


    // $ANTLR start "rule__AtomicComponent__Group_4__2__Impl"
    // InternalCBS.g:3946:1: rule__AtomicComponent__Group_4__2__Impl : ( ( rule__AtomicComponent__RequiresAssignment_4_2 ) ) ;
    public final void rule__AtomicComponent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3950:1: ( ( ( rule__AtomicComponent__RequiresAssignment_4_2 ) ) )
            // InternalCBS.g:3951:1: ( ( rule__AtomicComponent__RequiresAssignment_4_2 ) )
            {
            // InternalCBS.g:3951:1: ( ( rule__AtomicComponent__RequiresAssignment_4_2 ) )
            // InternalCBS.g:3952:2: ( rule__AtomicComponent__RequiresAssignment_4_2 )
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresAssignment_4_2()); 
            // InternalCBS.g:3953:2: ( rule__AtomicComponent__RequiresAssignment_4_2 )
            // InternalCBS.g:3953:3: rule__AtomicComponent__RequiresAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__RequiresAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicComponentAccess().getRequiresAssignment_4_2()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_4__2__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_4__3"
    // InternalCBS.g:3961:1: rule__AtomicComponent__Group_4__3 : rule__AtomicComponent__Group_4__3__Impl rule__AtomicComponent__Group_4__4 ;
    public final void rule__AtomicComponent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3965:1: ( rule__AtomicComponent__Group_4__3__Impl rule__AtomicComponent__Group_4__4 )
            // InternalCBS.g:3966:2: rule__AtomicComponent__Group_4__3__Impl rule__AtomicComponent__Group_4__4
            {
            pushFollow(FOLLOW_27);
            rule__AtomicComponent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_4__4();

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
    // $ANTLR end "rule__AtomicComponent__Group_4__3"


    // $ANTLR start "rule__AtomicComponent__Group_4__3__Impl"
    // InternalCBS.g:3973:1: rule__AtomicComponent__Group_4__3__Impl : ( ( rule__AtomicComponent__Group_4_3__0 )* ) ;
    public final void rule__AtomicComponent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3977:1: ( ( ( rule__AtomicComponent__Group_4_3__0 )* ) )
            // InternalCBS.g:3978:1: ( ( rule__AtomicComponent__Group_4_3__0 )* )
            {
            // InternalCBS.g:3978:1: ( ( rule__AtomicComponent__Group_4_3__0 )* )
            // InternalCBS.g:3979:2: ( rule__AtomicComponent__Group_4_3__0 )*
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_4_3()); 
            // InternalCBS.g:3980:2: ( rule__AtomicComponent__Group_4_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCBS.g:3980:3: rule__AtomicComponent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AtomicComponent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAtomicComponentAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_4__3__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_4__4"
    // InternalCBS.g:3988:1: rule__AtomicComponent__Group_4__4 : rule__AtomicComponent__Group_4__4__Impl ;
    public final void rule__AtomicComponent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3992:1: ( rule__AtomicComponent__Group_4__4__Impl )
            // InternalCBS.g:3993:2: rule__AtomicComponent__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_4__4__Impl();

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
    // $ANTLR end "rule__AtomicComponent__Group_4__4"


    // $ANTLR start "rule__AtomicComponent__Group_4__4__Impl"
    // InternalCBS.g:3999:1: rule__AtomicComponent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__AtomicComponent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4003:1: ( ( ')' ) )
            // InternalCBS.g:4004:1: ( ')' )
            {
            // InternalCBS.g:4004:1: ( ')' )
            // InternalCBS.g:4005:2: ')'
            {
             before(grammarAccess.getAtomicComponentAccess().getRightParenthesisKeyword_4_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_4__4__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_4_3__0"
    // InternalCBS.g:4015:1: rule__AtomicComponent__Group_4_3__0 : rule__AtomicComponent__Group_4_3__0__Impl rule__AtomicComponent__Group_4_3__1 ;
    public final void rule__AtomicComponent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4019:1: ( rule__AtomicComponent__Group_4_3__0__Impl rule__AtomicComponent__Group_4_3__1 )
            // InternalCBS.g:4020:2: rule__AtomicComponent__Group_4_3__0__Impl rule__AtomicComponent__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AtomicComponent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_4_3__1();

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
    // $ANTLR end "rule__AtomicComponent__Group_4_3__0"


    // $ANTLR start "rule__AtomicComponent__Group_4_3__0__Impl"
    // InternalCBS.g:4027:1: rule__AtomicComponent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicComponent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4031:1: ( ( ',' ) )
            // InternalCBS.g:4032:1: ( ',' )
            {
            // InternalCBS.g:4032:1: ( ',' )
            // InternalCBS.g:4033:2: ','
            {
             before(grammarAccess.getAtomicComponentAccess().getCommaKeyword_4_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_4_3__0__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_4_3__1"
    // InternalCBS.g:4042:1: rule__AtomicComponent__Group_4_3__1 : rule__AtomicComponent__Group_4_3__1__Impl ;
    public final void rule__AtomicComponent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4046:1: ( rule__AtomicComponent__Group_4_3__1__Impl )
            // InternalCBS.g:4047:2: rule__AtomicComponent__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__AtomicComponent__Group_4_3__1"


    // $ANTLR start "rule__AtomicComponent__Group_4_3__1__Impl"
    // InternalCBS.g:4053:1: rule__AtomicComponent__Group_4_3__1__Impl : ( ( rule__AtomicComponent__RequiresAssignment_4_3_1 ) ) ;
    public final void rule__AtomicComponent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4057:1: ( ( ( rule__AtomicComponent__RequiresAssignment_4_3_1 ) ) )
            // InternalCBS.g:4058:1: ( ( rule__AtomicComponent__RequiresAssignment_4_3_1 ) )
            {
            // InternalCBS.g:4058:1: ( ( rule__AtomicComponent__RequiresAssignment_4_3_1 ) )
            // InternalCBS.g:4059:2: ( rule__AtomicComponent__RequiresAssignment_4_3_1 )
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresAssignment_4_3_1()); 
            // InternalCBS.g:4060:2: ( rule__AtomicComponent__RequiresAssignment_4_3_1 )
            // InternalCBS.g:4060:3: rule__AtomicComponent__RequiresAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__RequiresAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicComponentAccess().getRequiresAssignment_4_3_1()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_4_3__1__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_5__0"
    // InternalCBS.g:4069:1: rule__AtomicComponent__Group_5__0 : rule__AtomicComponent__Group_5__0__Impl rule__AtomicComponent__Group_5__1 ;
    public final void rule__AtomicComponent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4073:1: ( rule__AtomicComponent__Group_5__0__Impl rule__AtomicComponent__Group_5__1 )
            // InternalCBS.g:4074:2: rule__AtomicComponent__Group_5__0__Impl rule__AtomicComponent__Group_5__1
            {
            pushFollow(FOLLOW_26);
            rule__AtomicComponent__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_5__1();

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
    // $ANTLR end "rule__AtomicComponent__Group_5__0"


    // $ANTLR start "rule__AtomicComponent__Group_5__0__Impl"
    // InternalCBS.g:4081:1: rule__AtomicComponent__Group_5__0__Impl : ( 'provides' ) ;
    public final void rule__AtomicComponent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4085:1: ( ( 'provides' ) )
            // InternalCBS.g:4086:1: ( 'provides' )
            {
            // InternalCBS.g:4086:1: ( 'provides' )
            // InternalCBS.g:4087:2: 'provides'
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getProvidesKeyword_5_0()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_5__0__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_5__1"
    // InternalCBS.g:4096:1: rule__AtomicComponent__Group_5__1 : rule__AtomicComponent__Group_5__1__Impl rule__AtomicComponent__Group_5__2 ;
    public final void rule__AtomicComponent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4100:1: ( rule__AtomicComponent__Group_5__1__Impl rule__AtomicComponent__Group_5__2 )
            // InternalCBS.g:4101:2: rule__AtomicComponent__Group_5__1__Impl rule__AtomicComponent__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__AtomicComponent__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_5__2();

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
    // $ANTLR end "rule__AtomicComponent__Group_5__1"


    // $ANTLR start "rule__AtomicComponent__Group_5__1__Impl"
    // InternalCBS.g:4108:1: rule__AtomicComponent__Group_5__1__Impl : ( '(' ) ;
    public final void rule__AtomicComponent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4112:1: ( ( '(' ) )
            // InternalCBS.g:4113:1: ( '(' )
            {
            // InternalCBS.g:4113:1: ( '(' )
            // InternalCBS.g:4114:2: '('
            {
             before(grammarAccess.getAtomicComponentAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_5__1__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_5__2"
    // InternalCBS.g:4123:1: rule__AtomicComponent__Group_5__2 : rule__AtomicComponent__Group_5__2__Impl rule__AtomicComponent__Group_5__3 ;
    public final void rule__AtomicComponent__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4127:1: ( rule__AtomicComponent__Group_5__2__Impl rule__AtomicComponent__Group_5__3 )
            // InternalCBS.g:4128:2: rule__AtomicComponent__Group_5__2__Impl rule__AtomicComponent__Group_5__3
            {
            pushFollow(FOLLOW_27);
            rule__AtomicComponent__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_5__3();

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
    // $ANTLR end "rule__AtomicComponent__Group_5__2"


    // $ANTLR start "rule__AtomicComponent__Group_5__2__Impl"
    // InternalCBS.g:4135:1: rule__AtomicComponent__Group_5__2__Impl : ( ( rule__AtomicComponent__ProvidesAssignment_5_2 ) ) ;
    public final void rule__AtomicComponent__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4139:1: ( ( ( rule__AtomicComponent__ProvidesAssignment_5_2 ) ) )
            // InternalCBS.g:4140:1: ( ( rule__AtomicComponent__ProvidesAssignment_5_2 ) )
            {
            // InternalCBS.g:4140:1: ( ( rule__AtomicComponent__ProvidesAssignment_5_2 ) )
            // InternalCBS.g:4141:2: ( rule__AtomicComponent__ProvidesAssignment_5_2 )
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesAssignment_5_2()); 
            // InternalCBS.g:4142:2: ( rule__AtomicComponent__ProvidesAssignment_5_2 )
            // InternalCBS.g:4142:3: rule__AtomicComponent__ProvidesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__ProvidesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicComponentAccess().getProvidesAssignment_5_2()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_5__2__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_5__3"
    // InternalCBS.g:4150:1: rule__AtomicComponent__Group_5__3 : rule__AtomicComponent__Group_5__3__Impl rule__AtomicComponent__Group_5__4 ;
    public final void rule__AtomicComponent__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4154:1: ( rule__AtomicComponent__Group_5__3__Impl rule__AtomicComponent__Group_5__4 )
            // InternalCBS.g:4155:2: rule__AtomicComponent__Group_5__3__Impl rule__AtomicComponent__Group_5__4
            {
            pushFollow(FOLLOW_27);
            rule__AtomicComponent__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_5__4();

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
    // $ANTLR end "rule__AtomicComponent__Group_5__3"


    // $ANTLR start "rule__AtomicComponent__Group_5__3__Impl"
    // InternalCBS.g:4162:1: rule__AtomicComponent__Group_5__3__Impl : ( ( rule__AtomicComponent__Group_5_3__0 )* ) ;
    public final void rule__AtomicComponent__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4166:1: ( ( ( rule__AtomicComponent__Group_5_3__0 )* ) )
            // InternalCBS.g:4167:1: ( ( rule__AtomicComponent__Group_5_3__0 )* )
            {
            // InternalCBS.g:4167:1: ( ( rule__AtomicComponent__Group_5_3__0 )* )
            // InternalCBS.g:4168:2: ( rule__AtomicComponent__Group_5_3__0 )*
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_5_3()); 
            // InternalCBS.g:4169:2: ( rule__AtomicComponent__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCBS.g:4169:3: rule__AtomicComponent__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AtomicComponent__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAtomicComponentAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_5__3__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_5__4"
    // InternalCBS.g:4177:1: rule__AtomicComponent__Group_5__4 : rule__AtomicComponent__Group_5__4__Impl ;
    public final void rule__AtomicComponent__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4181:1: ( rule__AtomicComponent__Group_5__4__Impl )
            // InternalCBS.g:4182:2: rule__AtomicComponent__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_5__4__Impl();

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
    // $ANTLR end "rule__AtomicComponent__Group_5__4"


    // $ANTLR start "rule__AtomicComponent__Group_5__4__Impl"
    // InternalCBS.g:4188:1: rule__AtomicComponent__Group_5__4__Impl : ( ')' ) ;
    public final void rule__AtomicComponent__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4192:1: ( ( ')' ) )
            // InternalCBS.g:4193:1: ( ')' )
            {
            // InternalCBS.g:4193:1: ( ')' )
            // InternalCBS.g:4194:2: ')'
            {
             before(grammarAccess.getAtomicComponentAccess().getRightParenthesisKeyword_5_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_5__4__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_5_3__0"
    // InternalCBS.g:4204:1: rule__AtomicComponent__Group_5_3__0 : rule__AtomicComponent__Group_5_3__0__Impl rule__AtomicComponent__Group_5_3__1 ;
    public final void rule__AtomicComponent__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4208:1: ( rule__AtomicComponent__Group_5_3__0__Impl rule__AtomicComponent__Group_5_3__1 )
            // InternalCBS.g:4209:2: rule__AtomicComponent__Group_5_3__0__Impl rule__AtomicComponent__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AtomicComponent__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_5_3__1();

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
    // $ANTLR end "rule__AtomicComponent__Group_5_3__0"


    // $ANTLR start "rule__AtomicComponent__Group_5_3__0__Impl"
    // InternalCBS.g:4216:1: rule__AtomicComponent__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicComponent__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4220:1: ( ( ',' ) )
            // InternalCBS.g:4221:1: ( ',' )
            {
            // InternalCBS.g:4221:1: ( ',' )
            // InternalCBS.g:4222:2: ','
            {
             before(grammarAccess.getAtomicComponentAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_5_3__0__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_5_3__1"
    // InternalCBS.g:4231:1: rule__AtomicComponent__Group_5_3__1 : rule__AtomicComponent__Group_5_3__1__Impl ;
    public final void rule__AtomicComponent__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4235:1: ( rule__AtomicComponent__Group_5_3__1__Impl )
            // InternalCBS.g:4236:2: rule__AtomicComponent__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__AtomicComponent__Group_5_3__1"


    // $ANTLR start "rule__AtomicComponent__Group_5_3__1__Impl"
    // InternalCBS.g:4242:1: rule__AtomicComponent__Group_5_3__1__Impl : ( ( rule__AtomicComponent__ProvidesAssignment_5_3_1 ) ) ;
    public final void rule__AtomicComponent__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4246:1: ( ( ( rule__AtomicComponent__ProvidesAssignment_5_3_1 ) ) )
            // InternalCBS.g:4247:1: ( ( rule__AtomicComponent__ProvidesAssignment_5_3_1 ) )
            {
            // InternalCBS.g:4247:1: ( ( rule__AtomicComponent__ProvidesAssignment_5_3_1 ) )
            // InternalCBS.g:4248:2: ( rule__AtomicComponent__ProvidesAssignment_5_3_1 )
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesAssignment_5_3_1()); 
            // InternalCBS.g:4249:2: ( rule__AtomicComponent__ProvidesAssignment_5_3_1 )
            // InternalCBS.g:4249:3: rule__AtomicComponent__ProvidesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__ProvidesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicComponentAccess().getProvidesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_5_3__1__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_6__0"
    // InternalCBS.g:4258:1: rule__AtomicComponent__Group_6__0 : rule__AtomicComponent__Group_6__0__Impl rule__AtomicComponent__Group_6__1 ;
    public final void rule__AtomicComponent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4262:1: ( rule__AtomicComponent__Group_6__0__Impl rule__AtomicComponent__Group_6__1 )
            // InternalCBS.g:4263:2: rule__AtomicComponent__Group_6__0__Impl rule__AtomicComponent__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__AtomicComponent__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_6__1();

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
    // $ANTLR end "rule__AtomicComponent__Group_6__0"


    // $ANTLR start "rule__AtomicComponent__Group_6__0__Impl"
    // InternalCBS.g:4270:1: rule__AtomicComponent__Group_6__0__Impl : ( 'services' ) ;
    public final void rule__AtomicComponent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4274:1: ( ( 'services' ) )
            // InternalCBS.g:4275:1: ( 'services' )
            {
            // InternalCBS.g:4275:1: ( 'services' )
            // InternalCBS.g:4276:2: 'services'
            {
             before(grammarAccess.getAtomicComponentAccess().getServicesKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getServicesKeyword_6_0()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_6__0__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_6__1"
    // InternalCBS.g:4285:1: rule__AtomicComponent__Group_6__1 : rule__AtomicComponent__Group_6__1__Impl rule__AtomicComponent__Group_6__2 ;
    public final void rule__AtomicComponent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4289:1: ( rule__AtomicComponent__Group_6__1__Impl rule__AtomicComponent__Group_6__2 )
            // InternalCBS.g:4290:2: rule__AtomicComponent__Group_6__1__Impl rule__AtomicComponent__Group_6__2
            {
            pushFollow(FOLLOW_28);
            rule__AtomicComponent__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_6__2();

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
    // $ANTLR end "rule__AtomicComponent__Group_6__1"


    // $ANTLR start "rule__AtomicComponent__Group_6__1__Impl"
    // InternalCBS.g:4297:1: rule__AtomicComponent__Group_6__1__Impl : ( '{' ) ;
    public final void rule__AtomicComponent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4301:1: ( ( '{' ) )
            // InternalCBS.g:4302:1: ( '{' )
            {
            // InternalCBS.g:4302:1: ( '{' )
            // InternalCBS.g:4303:2: '{'
            {
             before(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_6__1__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_6__2"
    // InternalCBS.g:4312:1: rule__AtomicComponent__Group_6__2 : rule__AtomicComponent__Group_6__2__Impl rule__AtomicComponent__Group_6__3 ;
    public final void rule__AtomicComponent__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4316:1: ( rule__AtomicComponent__Group_6__2__Impl rule__AtomicComponent__Group_6__3 )
            // InternalCBS.g:4317:2: rule__AtomicComponent__Group_6__2__Impl rule__AtomicComponent__Group_6__3
            {
            pushFollow(FOLLOW_9);
            rule__AtomicComponent__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_6__3();

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
    // $ANTLR end "rule__AtomicComponent__Group_6__2"


    // $ANTLR start "rule__AtomicComponent__Group_6__2__Impl"
    // InternalCBS.g:4324:1: rule__AtomicComponent__Group_6__2__Impl : ( ( rule__AtomicComponent__ServicesAssignment_6_2 ) ) ;
    public final void rule__AtomicComponent__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4328:1: ( ( ( rule__AtomicComponent__ServicesAssignment_6_2 ) ) )
            // InternalCBS.g:4329:1: ( ( rule__AtomicComponent__ServicesAssignment_6_2 ) )
            {
            // InternalCBS.g:4329:1: ( ( rule__AtomicComponent__ServicesAssignment_6_2 ) )
            // InternalCBS.g:4330:2: ( rule__AtomicComponent__ServicesAssignment_6_2 )
            {
             before(grammarAccess.getAtomicComponentAccess().getServicesAssignment_6_2()); 
            // InternalCBS.g:4331:2: ( rule__AtomicComponent__ServicesAssignment_6_2 )
            // InternalCBS.g:4331:3: rule__AtomicComponent__ServicesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__ServicesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicComponentAccess().getServicesAssignment_6_2()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_6__2__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_6__3"
    // InternalCBS.g:4339:1: rule__AtomicComponent__Group_6__3 : rule__AtomicComponent__Group_6__3__Impl rule__AtomicComponent__Group_6__4 ;
    public final void rule__AtomicComponent__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4343:1: ( rule__AtomicComponent__Group_6__3__Impl rule__AtomicComponent__Group_6__4 )
            // InternalCBS.g:4344:2: rule__AtomicComponent__Group_6__3__Impl rule__AtomicComponent__Group_6__4
            {
            pushFollow(FOLLOW_9);
            rule__AtomicComponent__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_6__4();

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
    // $ANTLR end "rule__AtomicComponent__Group_6__3"


    // $ANTLR start "rule__AtomicComponent__Group_6__3__Impl"
    // InternalCBS.g:4351:1: rule__AtomicComponent__Group_6__3__Impl : ( ( rule__AtomicComponent__Group_6_3__0 )* ) ;
    public final void rule__AtomicComponent__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4355:1: ( ( ( rule__AtomicComponent__Group_6_3__0 )* ) )
            // InternalCBS.g:4356:1: ( ( rule__AtomicComponent__Group_6_3__0 )* )
            {
            // InternalCBS.g:4356:1: ( ( rule__AtomicComponent__Group_6_3__0 )* )
            // InternalCBS.g:4357:2: ( rule__AtomicComponent__Group_6_3__0 )*
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_6_3()); 
            // InternalCBS.g:4358:2: ( rule__AtomicComponent__Group_6_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCBS.g:4358:3: rule__AtomicComponent__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AtomicComponent__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getAtomicComponentAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_6__3__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_6__4"
    // InternalCBS.g:4366:1: rule__AtomicComponent__Group_6__4 : rule__AtomicComponent__Group_6__4__Impl ;
    public final void rule__AtomicComponent__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4370:1: ( rule__AtomicComponent__Group_6__4__Impl )
            // InternalCBS.g:4371:2: rule__AtomicComponent__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_6__4__Impl();

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
    // $ANTLR end "rule__AtomicComponent__Group_6__4"


    // $ANTLR start "rule__AtomicComponent__Group_6__4__Impl"
    // InternalCBS.g:4377:1: rule__AtomicComponent__Group_6__4__Impl : ( '}' ) ;
    public final void rule__AtomicComponent__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4381:1: ( ( '}' ) )
            // InternalCBS.g:4382:1: ( '}' )
            {
            // InternalCBS.g:4382:1: ( '}' )
            // InternalCBS.g:4383:2: '}'
            {
             before(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_6__4__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_6_3__0"
    // InternalCBS.g:4393:1: rule__AtomicComponent__Group_6_3__0 : rule__AtomicComponent__Group_6_3__0__Impl rule__AtomicComponent__Group_6_3__1 ;
    public final void rule__AtomicComponent__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4397:1: ( rule__AtomicComponent__Group_6_3__0__Impl rule__AtomicComponent__Group_6_3__1 )
            // InternalCBS.g:4398:2: rule__AtomicComponent__Group_6_3__0__Impl rule__AtomicComponent__Group_6_3__1
            {
            pushFollow(FOLLOW_28);
            rule__AtomicComponent__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_6_3__1();

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
    // $ANTLR end "rule__AtomicComponent__Group_6_3__0"


    // $ANTLR start "rule__AtomicComponent__Group_6_3__0__Impl"
    // InternalCBS.g:4405:1: rule__AtomicComponent__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicComponent__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4409:1: ( ( ',' ) )
            // InternalCBS.g:4410:1: ( ',' )
            {
            // InternalCBS.g:4410:1: ( ',' )
            // InternalCBS.g:4411:2: ','
            {
             before(grammarAccess.getAtomicComponentAccess().getCommaKeyword_6_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_6_3__0__Impl"


    // $ANTLR start "rule__AtomicComponent__Group_6_3__1"
    // InternalCBS.g:4420:1: rule__AtomicComponent__Group_6_3__1 : rule__AtomicComponent__Group_6_3__1__Impl ;
    public final void rule__AtomicComponent__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4424:1: ( rule__AtomicComponent__Group_6_3__1__Impl )
            // InternalCBS.g:4425:2: rule__AtomicComponent__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__AtomicComponent__Group_6_3__1"


    // $ANTLR start "rule__AtomicComponent__Group_6_3__1__Impl"
    // InternalCBS.g:4431:1: rule__AtomicComponent__Group_6_3__1__Impl : ( ( rule__AtomicComponent__ServicesAssignment_6_3_1 ) ) ;
    public final void rule__AtomicComponent__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4435:1: ( ( ( rule__AtomicComponent__ServicesAssignment_6_3_1 ) ) )
            // InternalCBS.g:4436:1: ( ( rule__AtomicComponent__ServicesAssignment_6_3_1 ) )
            {
            // InternalCBS.g:4436:1: ( ( rule__AtomicComponent__ServicesAssignment_6_3_1 ) )
            // InternalCBS.g:4437:2: ( rule__AtomicComponent__ServicesAssignment_6_3_1 )
            {
             before(grammarAccess.getAtomicComponentAccess().getServicesAssignment_6_3_1()); 
            // InternalCBS.g:4438:2: ( rule__AtomicComponent__ServicesAssignment_6_3_1 )
            // InternalCBS.g:4438:3: rule__AtomicComponent__ServicesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicComponent__ServicesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicComponentAccess().getServicesAssignment_6_3_1()); 

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
    // $ANTLR end "rule__AtomicComponent__Group_6_3__1__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalCBS.g:4447:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4451:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalCBS.g:4452:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

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
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalCBS.g:4459:1: rule__Signature__Group__0__Impl : ( 'Signature' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4463:1: ( ( 'Signature' ) )
            // InternalCBS.g:4464:1: ( 'Signature' )
            {
            // InternalCBS.g:4464:1: ( 'Signature' )
            // InternalCBS.g:4465:2: 'Signature'
            {
             before(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 

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
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalCBS.g:4474:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4478:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalCBS.g:4479:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Signature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__2();

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
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalCBS.g:4486:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4490:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalCBS.g:4491:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalCBS.g:4491:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalCBS.g:4492:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalCBS.g:4493:2: ( rule__Signature__NameAssignment_1 )
            // InternalCBS.g:4493:3: rule__Signature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // InternalCBS.g:4501:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4505:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalCBS.g:4506:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Signature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__3();

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
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // InternalCBS.g:4513:1: rule__Signature__Group__2__Impl : ( '{' ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4517:1: ( ( '{' ) )
            // InternalCBS.g:4518:1: ( '{' )
            {
            // InternalCBS.g:4518:1: ( '{' )
            // InternalCBS.g:4519:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group__3"
    // InternalCBS.g:4528:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4532:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // InternalCBS.g:4533:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__4();

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
    // $ANTLR end "rule__Signature__Group__3"


    // $ANTLR start "rule__Signature__Group__3__Impl"
    // InternalCBS.g:4540:1: rule__Signature__Group__3__Impl : ( 'returnType' ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4544:1: ( ( 'returnType' ) )
            // InternalCBS.g:4545:1: ( 'returnType' )
            {
            // InternalCBS.g:4545:1: ( 'returnType' )
            // InternalCBS.g:4546:2: 'returnType'
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getReturnTypeKeyword_3()); 

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
    // $ANTLR end "rule__Signature__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group__4"
    // InternalCBS.g:4555:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl rule__Signature__Group__5 ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4559:1: ( rule__Signature__Group__4__Impl rule__Signature__Group__5 )
            // InternalCBS.g:4560:2: rule__Signature__Group__4__Impl rule__Signature__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Signature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__5();

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
    // $ANTLR end "rule__Signature__Group__4"


    // $ANTLR start "rule__Signature__Group__4__Impl"
    // InternalCBS.g:4567:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4571:1: ( ( ( rule__Signature__ReturnTypeAssignment_4 ) ) )
            // InternalCBS.g:4572:1: ( ( rule__Signature__ReturnTypeAssignment_4 ) )
            {
            // InternalCBS.g:4572:1: ( ( rule__Signature__ReturnTypeAssignment_4 ) )
            // InternalCBS.g:4573:2: ( rule__Signature__ReturnTypeAssignment_4 )
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeAssignment_4()); 
            // InternalCBS.g:4574:2: ( rule__Signature__ReturnTypeAssignment_4 )
            // InternalCBS.g:4574:3: rule__Signature__ReturnTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ReturnTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getReturnTypeAssignment_4()); 

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
    // $ANTLR end "rule__Signature__Group__4__Impl"


    // $ANTLR start "rule__Signature__Group__5"
    // InternalCBS.g:4582:1: rule__Signature__Group__5 : rule__Signature__Group__5__Impl rule__Signature__Group__6 ;
    public final void rule__Signature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4586:1: ( rule__Signature__Group__5__Impl rule__Signature__Group__6 )
            // InternalCBS.g:4587:2: rule__Signature__Group__5__Impl rule__Signature__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Signature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__6();

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
    // $ANTLR end "rule__Signature__Group__5"


    // $ANTLR start "rule__Signature__Group__5__Impl"
    // InternalCBS.g:4594:1: rule__Signature__Group__5__Impl : ( ( rule__Signature__Group_5__0 )? ) ;
    public final void rule__Signature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4598:1: ( ( ( rule__Signature__Group_5__0 )? ) )
            // InternalCBS.g:4599:1: ( ( rule__Signature__Group_5__0 )? )
            {
            // InternalCBS.g:4599:1: ( ( rule__Signature__Group_5__0 )? )
            // InternalCBS.g:4600:2: ( rule__Signature__Group_5__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_5()); 
            // InternalCBS.g:4601:2: ( rule__Signature__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCBS.g:4601:3: rule__Signature__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Signature__Group__5__Impl"


    // $ANTLR start "rule__Signature__Group__6"
    // InternalCBS.g:4609:1: rule__Signature__Group__6 : rule__Signature__Group__6__Impl ;
    public final void rule__Signature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4613:1: ( rule__Signature__Group__6__Impl )
            // InternalCBS.g:4614:2: rule__Signature__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__6__Impl();

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
    // $ANTLR end "rule__Signature__Group__6"


    // $ANTLR start "rule__Signature__Group__6__Impl"
    // InternalCBS.g:4620:1: rule__Signature__Group__6__Impl : ( '}' ) ;
    public final void rule__Signature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4624:1: ( ( '}' ) )
            // InternalCBS.g:4625:1: ( '}' )
            {
            // InternalCBS.g:4625:1: ( '}' )
            // InternalCBS.g:4626:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Signature__Group__6__Impl"


    // $ANTLR start "rule__Signature__Group_5__0"
    // InternalCBS.g:4636:1: rule__Signature__Group_5__0 : rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 ;
    public final void rule__Signature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4640:1: ( rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 )
            // InternalCBS.g:4641:2: rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Signature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__1();

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
    // $ANTLR end "rule__Signature__Group_5__0"


    // $ANTLR start "rule__Signature__Group_5__0__Impl"
    // InternalCBS.g:4648:1: rule__Signature__Group_5__0__Impl : ( 'parameters' ) ;
    public final void rule__Signature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4652:1: ( ( 'parameters' ) )
            // InternalCBS.g:4653:1: ( 'parameters' )
            {
            // InternalCBS.g:4653:1: ( 'parameters' )
            // InternalCBS.g:4654:2: 'parameters'
            {
             before(grammarAccess.getSignatureAccess().getParametersKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getParametersKeyword_5_0()); 

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
    // $ANTLR end "rule__Signature__Group_5__0__Impl"


    // $ANTLR start "rule__Signature__Group_5__1"
    // InternalCBS.g:4663:1: rule__Signature__Group_5__1 : rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 ;
    public final void rule__Signature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4667:1: ( rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 )
            // InternalCBS.g:4668:2: rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2
            {
            pushFollow(FOLLOW_31);
            rule__Signature__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__2();

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
    // $ANTLR end "rule__Signature__Group_5__1"


    // $ANTLR start "rule__Signature__Group_5__1__Impl"
    // InternalCBS.g:4675:1: rule__Signature__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Signature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4679:1: ( ( '{' ) )
            // InternalCBS.g:4680:1: ( '{' )
            {
            // InternalCBS.g:4680:1: ( '{' )
            // InternalCBS.g:4681:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Signature__Group_5__1__Impl"


    // $ANTLR start "rule__Signature__Group_5__2"
    // InternalCBS.g:4690:1: rule__Signature__Group_5__2 : rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 ;
    public final void rule__Signature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4694:1: ( rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 )
            // InternalCBS.g:4695:2: rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Signature__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__3();

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
    // $ANTLR end "rule__Signature__Group_5__2"


    // $ANTLR start "rule__Signature__Group_5__2__Impl"
    // InternalCBS.g:4702:1: rule__Signature__Group_5__2__Impl : ( ( rule__Signature__ParametersAssignment_5_2 ) ) ;
    public final void rule__Signature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4706:1: ( ( ( rule__Signature__ParametersAssignment_5_2 ) ) )
            // InternalCBS.g:4707:1: ( ( rule__Signature__ParametersAssignment_5_2 ) )
            {
            // InternalCBS.g:4707:1: ( ( rule__Signature__ParametersAssignment_5_2 ) )
            // InternalCBS.g:4708:2: ( rule__Signature__ParametersAssignment_5_2 )
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_5_2()); 
            // InternalCBS.g:4709:2: ( rule__Signature__ParametersAssignment_5_2 )
            // InternalCBS.g:4709:3: rule__Signature__ParametersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParametersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_5_2()); 

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
    // $ANTLR end "rule__Signature__Group_5__2__Impl"


    // $ANTLR start "rule__Signature__Group_5__3"
    // InternalCBS.g:4717:1: rule__Signature__Group_5__3 : rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 ;
    public final void rule__Signature__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4721:1: ( rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 )
            // InternalCBS.g:4722:2: rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4
            {
            pushFollow(FOLLOW_9);
            rule__Signature__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4();

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
    // $ANTLR end "rule__Signature__Group_5__3"


    // $ANTLR start "rule__Signature__Group_5__3__Impl"
    // InternalCBS.g:4729:1: rule__Signature__Group_5__3__Impl : ( ( rule__Signature__Group_5_3__0 )* ) ;
    public final void rule__Signature__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4733:1: ( ( ( rule__Signature__Group_5_3__0 )* ) )
            // InternalCBS.g:4734:1: ( ( rule__Signature__Group_5_3__0 )* )
            {
            // InternalCBS.g:4734:1: ( ( rule__Signature__Group_5_3__0 )* )
            // InternalCBS.g:4735:2: ( rule__Signature__Group_5_3__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_5_3()); 
            // InternalCBS.g:4736:2: ( rule__Signature__Group_5_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCBS.g:4736:3: rule__Signature__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Signature__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Signature__Group_5__3__Impl"


    // $ANTLR start "rule__Signature__Group_5__4"
    // InternalCBS.g:4744:1: rule__Signature__Group_5__4 : rule__Signature__Group_5__4__Impl ;
    public final void rule__Signature__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4748:1: ( rule__Signature__Group_5__4__Impl )
            // InternalCBS.g:4749:2: rule__Signature__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4__Impl();

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
    // $ANTLR end "rule__Signature__Group_5__4"


    // $ANTLR start "rule__Signature__Group_5__4__Impl"
    // InternalCBS.g:4755:1: rule__Signature__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Signature__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4759:1: ( ( '}' ) )
            // InternalCBS.g:4760:1: ( '}' )
            {
            // InternalCBS.g:4760:1: ( '}' )
            // InternalCBS.g:4761:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Signature__Group_5__4__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__0"
    // InternalCBS.g:4771:1: rule__Signature__Group_5_3__0 : rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 ;
    public final void rule__Signature__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4775:1: ( rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 )
            // InternalCBS.g:4776:2: rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Signature__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1();

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
    // $ANTLR end "rule__Signature__Group_5_3__0"


    // $ANTLR start "rule__Signature__Group_5_3__0__Impl"
    // InternalCBS.g:4783:1: rule__Signature__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4787:1: ( ( ',' ) )
            // InternalCBS.g:4788:1: ( ',' )
            {
            // InternalCBS.g:4788:1: ( ',' )
            // InternalCBS.g:4789:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Signature__Group_5_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__1"
    // InternalCBS.g:4798:1: rule__Signature__Group_5_3__1 : rule__Signature__Group_5_3__1__Impl ;
    public final void rule__Signature__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4802:1: ( rule__Signature__Group_5_3__1__Impl )
            // InternalCBS.g:4803:2: rule__Signature__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Signature__Group_5_3__1"


    // $ANTLR start "rule__Signature__Group_5_3__1__Impl"
    // InternalCBS.g:4809:1: rule__Signature__Group_5_3__1__Impl : ( ( rule__Signature__ParametersAssignment_5_3_1 ) ) ;
    public final void rule__Signature__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4813:1: ( ( ( rule__Signature__ParametersAssignment_5_3_1 ) ) )
            // InternalCBS.g:4814:1: ( ( rule__Signature__ParametersAssignment_5_3_1 ) )
            {
            // InternalCBS.g:4814:1: ( ( rule__Signature__ParametersAssignment_5_3_1 ) )
            // InternalCBS.g:4815:2: ( rule__Signature__ParametersAssignment_5_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_5_3_1()); 
            // InternalCBS.g:4816:2: ( rule__Signature__ParametersAssignment_5_3_1 )
            // InternalCBS.g:4816:3: rule__Signature__ParametersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParametersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Signature__Group_5_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalCBS.g:4825:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4829:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCBS.g:4830:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalCBS.g:4837:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4841:1: ( ( 'Parameter' ) )
            // InternalCBS.g:4842:1: ( 'Parameter' )
            {
            // InternalCBS.g:4842:1: ( 'Parameter' )
            // InternalCBS.g:4843:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalCBS.g:4852:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4856:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCBS.g:4857:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalCBS.g:4864:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4868:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalCBS.g:4869:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalCBS.g:4869:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalCBS.g:4870:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalCBS.g:4871:2: ( rule__Parameter__NameAssignment_1 )
            // InternalCBS.g:4871:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalCBS.g:4879:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4883:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCBS.g:4884:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalCBS.g:4891:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4895:1: ( ( '{' ) )
            // InternalCBS.g:4896:1: ( '{' )
            {
            // InternalCBS.g:4896:1: ( '{' )
            // InternalCBS.g:4897:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalCBS.g:4906:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4910:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalCBS.g:4911:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalCBS.g:4918:1: rule__Parameter__Group__3__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4922:1: ( ( 'type' ) )
            // InternalCBS.g:4923:1: ( 'type' )
            {
            // InternalCBS.g:4923:1: ( 'type' )
            // InternalCBS.g:4924:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalCBS.g:4933:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4937:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalCBS.g:4938:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalCBS.g:4945:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__TypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4949:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) )
            // InternalCBS.g:4950:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            {
            // InternalCBS.g:4950:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalCBS.g:4951:2: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalCBS.g:4952:2: ( rule__Parameter__TypeAssignment_4 )
            // InternalCBS.g:4952:3: rule__Parameter__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalCBS.g:4960:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4964:1: ( rule__Parameter__Group__5__Impl )
            // InternalCBS.g:4965:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalCBS.g:4971:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4975:1: ( ( '}' ) )
            // InternalCBS.g:4976:1: ( '}' )
            {
            // InternalCBS.g:4976:1: ( '}' )
            // InternalCBS.g:4977:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__SimpleType__Group__0"
    // InternalCBS.g:4987:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4991:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // InternalCBS.g:4992:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__1();

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
    // $ANTLR end "rule__SimpleType__Group__0"


    // $ANTLR start "rule__SimpleType__Group__0__Impl"
    // InternalCBS.g:4999:1: rule__SimpleType__Group__0__Impl : ( 'SimpleType' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5003:1: ( ( 'SimpleType' ) )
            // InternalCBS.g:5004:1: ( 'SimpleType' )
            {
            // InternalCBS.g:5004:1: ( 'SimpleType' )
            // InternalCBS.g:5005:2: 'SimpleType'
            {
             before(grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0()); 

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
    // $ANTLR end "rule__SimpleType__Group__0__Impl"


    // $ANTLR start "rule__SimpleType__Group__1"
    // InternalCBS.g:5014:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5018:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // InternalCBS.g:5019:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__2();

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
    // $ANTLR end "rule__SimpleType__Group__1"


    // $ANTLR start "rule__SimpleType__Group__1__Impl"
    // InternalCBS.g:5026:1: rule__SimpleType__Group__1__Impl : ( '{' ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5030:1: ( ( '{' ) )
            // InternalCBS.g:5031:1: ( '{' )
            {
            // InternalCBS.g:5031:1: ( '{' )
            // InternalCBS.g:5032:2: '{'
            {
             before(grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__SimpleType__Group__1__Impl"


    // $ANTLR start "rule__SimpleType__Group__2"
    // InternalCBS.g:5041:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5045:1: ( rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 )
            // InternalCBS.g:5046:2: rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SimpleType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__3();

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
    // $ANTLR end "rule__SimpleType__Group__2"


    // $ANTLR start "rule__SimpleType__Group__2__Impl"
    // InternalCBS.g:5053:1: rule__SimpleType__Group__2__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5057:1: ( ( 'type' ) )
            // InternalCBS.g:5058:1: ( 'type' )
            {
            // InternalCBS.g:5058:1: ( 'type' )
            // InternalCBS.g:5059:2: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__SimpleType__Group__2__Impl"


    // $ANTLR start "rule__SimpleType__Group__3"
    // InternalCBS.g:5068:1: rule__SimpleType__Group__3 : rule__SimpleType__Group__3__Impl rule__SimpleType__Group__4 ;
    public final void rule__SimpleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5072:1: ( rule__SimpleType__Group__3__Impl rule__SimpleType__Group__4 )
            // InternalCBS.g:5073:2: rule__SimpleType__Group__3__Impl rule__SimpleType__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SimpleType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__4();

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
    // $ANTLR end "rule__SimpleType__Group__3"


    // $ANTLR start "rule__SimpleType__Group__3__Impl"
    // InternalCBS.g:5080:1: rule__SimpleType__Group__3__Impl : ( ( rule__SimpleType__TypeAssignment_3 ) ) ;
    public final void rule__SimpleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5084:1: ( ( ( rule__SimpleType__TypeAssignment_3 ) ) )
            // InternalCBS.g:5085:1: ( ( rule__SimpleType__TypeAssignment_3 ) )
            {
            // InternalCBS.g:5085:1: ( ( rule__SimpleType__TypeAssignment_3 ) )
            // InternalCBS.g:5086:2: ( rule__SimpleType__TypeAssignment_3 )
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeAssignment_3()); 
            // InternalCBS.g:5087:2: ( rule__SimpleType__TypeAssignment_3 )
            // InternalCBS.g:5087:3: rule__SimpleType__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__SimpleType__Group__3__Impl"


    // $ANTLR start "rule__SimpleType__Group__4"
    // InternalCBS.g:5095:1: rule__SimpleType__Group__4 : rule__SimpleType__Group__4__Impl ;
    public final void rule__SimpleType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5099:1: ( rule__SimpleType__Group__4__Impl )
            // InternalCBS.g:5100:2: rule__SimpleType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__4__Impl();

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
    // $ANTLR end "rule__SimpleType__Group__4"


    // $ANTLR start "rule__SimpleType__Group__4__Impl"
    // InternalCBS.g:5106:1: rule__SimpleType__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5110:1: ( ( '}' ) )
            // InternalCBS.g:5111:1: ( '}' )
            {
            // InternalCBS.g:5111:1: ( '}' )
            // InternalCBS.g:5112:2: '}'
            {
             before(grammarAccess.getSimpleTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SimpleType__Group__4__Impl"


    // $ANTLR start "rule__ComplexType__Group__0"
    // InternalCBS.g:5122:1: rule__ComplexType__Group__0 : rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 ;
    public final void rule__ComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5126:1: ( rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 )
            // InternalCBS.g:5127:2: rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ComplexType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__1();

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
    // $ANTLR end "rule__ComplexType__Group__0"


    // $ANTLR start "rule__ComplexType__Group__0__Impl"
    // InternalCBS.g:5134:1: rule__ComplexType__Group__0__Impl : ( () ) ;
    public final void rule__ComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5138:1: ( ( () ) )
            // InternalCBS.g:5139:1: ( () )
            {
            // InternalCBS.g:5139:1: ( () )
            // InternalCBS.g:5140:2: ()
            {
             before(grammarAccess.getComplexTypeAccess().getComplexTypeAction_0()); 
            // InternalCBS.g:5141:2: ()
            // InternalCBS.g:5141:3: 
            {
            }

             after(grammarAccess.getComplexTypeAccess().getComplexTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__0__Impl"


    // $ANTLR start "rule__ComplexType__Group__1"
    // InternalCBS.g:5149:1: rule__ComplexType__Group__1 : rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2 ;
    public final void rule__ComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5153:1: ( rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2 )
            // InternalCBS.g:5154:2: rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComplexType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__2();

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
    // $ANTLR end "rule__ComplexType__Group__1"


    // $ANTLR start "rule__ComplexType__Group__1__Impl"
    // InternalCBS.g:5161:1: rule__ComplexType__Group__1__Impl : ( 'ComplexType' ) ;
    public final void rule__ComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5165:1: ( ( 'ComplexType' ) )
            // InternalCBS.g:5166:1: ( 'ComplexType' )
            {
            // InternalCBS.g:5166:1: ( 'ComplexType' )
            // InternalCBS.g:5167:2: 'ComplexType'
            {
             before(grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1()); 

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
    // $ANTLR end "rule__ComplexType__Group__1__Impl"


    // $ANTLR start "rule__ComplexType__Group__2"
    // InternalCBS.g:5176:1: rule__ComplexType__Group__2 : rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3 ;
    public final void rule__ComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5180:1: ( rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3 )
            // InternalCBS.g:5181:2: rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ComplexType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__3();

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
    // $ANTLR end "rule__ComplexType__Group__2"


    // $ANTLR start "rule__ComplexType__Group__2__Impl"
    // InternalCBS.g:5188:1: rule__ComplexType__Group__2__Impl : ( '{' ) ;
    public final void rule__ComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5192:1: ( ( '{' ) )
            // InternalCBS.g:5193:1: ( '{' )
            {
            // InternalCBS.g:5193:1: ( '{' )
            // InternalCBS.g:5194:2: '{'
            {
             before(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ComplexType__Group__2__Impl"


    // $ANTLR start "rule__ComplexType__Group__3"
    // InternalCBS.g:5203:1: rule__ComplexType__Group__3 : rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4 ;
    public final void rule__ComplexType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5207:1: ( rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4 )
            // InternalCBS.g:5208:2: rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ComplexType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__4();

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
    // $ANTLR end "rule__ComplexType__Group__3"


    // $ANTLR start "rule__ComplexType__Group__3__Impl"
    // InternalCBS.g:5215:1: rule__ComplexType__Group__3__Impl : ( ( rule__ComplexType__Group_3__0 )? ) ;
    public final void rule__ComplexType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5219:1: ( ( ( rule__ComplexType__Group_3__0 )? ) )
            // InternalCBS.g:5220:1: ( ( rule__ComplexType__Group_3__0 )? )
            {
            // InternalCBS.g:5220:1: ( ( rule__ComplexType__Group_3__0 )? )
            // InternalCBS.g:5221:2: ( rule__ComplexType__Group_3__0 )?
            {
             before(grammarAccess.getComplexTypeAccess().getGroup_3()); 
            // InternalCBS.g:5222:2: ( rule__ComplexType__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==56) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCBS.g:5222:3: rule__ComplexType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ComplexType__Group__3__Impl"


    // $ANTLR start "rule__ComplexType__Group__4"
    // InternalCBS.g:5230:1: rule__ComplexType__Group__4 : rule__ComplexType__Group__4__Impl ;
    public final void rule__ComplexType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5234:1: ( rule__ComplexType__Group__4__Impl )
            // InternalCBS.g:5235:2: rule__ComplexType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__4__Impl();

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
    // $ANTLR end "rule__ComplexType__Group__4"


    // $ANTLR start "rule__ComplexType__Group__4__Impl"
    // InternalCBS.g:5241:1: rule__ComplexType__Group__4__Impl : ( '}' ) ;
    public final void rule__ComplexType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5245:1: ( ( '}' ) )
            // InternalCBS.g:5246:1: ( '}' )
            {
            // InternalCBS.g:5246:1: ( '}' )
            // InternalCBS.g:5247:2: '}'
            {
             before(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ComplexType__Group__4__Impl"


    // $ANTLR start "rule__ComplexType__Group_3__0"
    // InternalCBS.g:5257:1: rule__ComplexType__Group_3__0 : rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1 ;
    public final void rule__ComplexType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5261:1: ( rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1 )
            // InternalCBS.g:5262:2: rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ComplexType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3__1();

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
    // $ANTLR end "rule__ComplexType__Group_3__0"


    // $ANTLR start "rule__ComplexType__Group_3__0__Impl"
    // InternalCBS.g:5269:1: rule__ComplexType__Group_3__0__Impl : ( 'members' ) ;
    public final void rule__ComplexType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5273:1: ( ( 'members' ) )
            // InternalCBS.g:5274:1: ( 'members' )
            {
            // InternalCBS.g:5274:1: ( 'members' )
            // InternalCBS.g:5275:2: 'members'
            {
             before(grammarAccess.getComplexTypeAccess().getMembersKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getMembersKeyword_3_0()); 

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
    // $ANTLR end "rule__ComplexType__Group_3__0__Impl"


    // $ANTLR start "rule__ComplexType__Group_3__1"
    // InternalCBS.g:5284:1: rule__ComplexType__Group_3__1 : rule__ComplexType__Group_3__1__Impl rule__ComplexType__Group_3__2 ;
    public final void rule__ComplexType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5288:1: ( rule__ComplexType__Group_3__1__Impl rule__ComplexType__Group_3__2 )
            // InternalCBS.g:5289:2: rule__ComplexType__Group_3__1__Impl rule__ComplexType__Group_3__2
            {
            pushFollow(FOLLOW_36);
            rule__ComplexType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3__2();

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
    // $ANTLR end "rule__ComplexType__Group_3__1"


    // $ANTLR start "rule__ComplexType__Group_3__1__Impl"
    // InternalCBS.g:5296:1: rule__ComplexType__Group_3__1__Impl : ( '{' ) ;
    public final void rule__ComplexType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5300:1: ( ( '{' ) )
            // InternalCBS.g:5301:1: ( '{' )
            {
            // InternalCBS.g:5301:1: ( '{' )
            // InternalCBS.g:5302:2: '{'
            {
             before(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__ComplexType__Group_3__1__Impl"


    // $ANTLR start "rule__ComplexType__Group_3__2"
    // InternalCBS.g:5311:1: rule__ComplexType__Group_3__2 : rule__ComplexType__Group_3__2__Impl rule__ComplexType__Group_3__3 ;
    public final void rule__ComplexType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5315:1: ( rule__ComplexType__Group_3__2__Impl rule__ComplexType__Group_3__3 )
            // InternalCBS.g:5316:2: rule__ComplexType__Group_3__2__Impl rule__ComplexType__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__ComplexType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3__3();

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
    // $ANTLR end "rule__ComplexType__Group_3__2"


    // $ANTLR start "rule__ComplexType__Group_3__2__Impl"
    // InternalCBS.g:5323:1: rule__ComplexType__Group_3__2__Impl : ( ( rule__ComplexType__MembersAssignment_3_2 ) ) ;
    public final void rule__ComplexType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5327:1: ( ( ( rule__ComplexType__MembersAssignment_3_2 ) ) )
            // InternalCBS.g:5328:1: ( ( rule__ComplexType__MembersAssignment_3_2 ) )
            {
            // InternalCBS.g:5328:1: ( ( rule__ComplexType__MembersAssignment_3_2 ) )
            // InternalCBS.g:5329:2: ( rule__ComplexType__MembersAssignment_3_2 )
            {
             before(grammarAccess.getComplexTypeAccess().getMembersAssignment_3_2()); 
            // InternalCBS.g:5330:2: ( rule__ComplexType__MembersAssignment_3_2 )
            // InternalCBS.g:5330:3: rule__ComplexType__MembersAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__MembersAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getMembersAssignment_3_2()); 

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
    // $ANTLR end "rule__ComplexType__Group_3__2__Impl"


    // $ANTLR start "rule__ComplexType__Group_3__3"
    // InternalCBS.g:5338:1: rule__ComplexType__Group_3__3 : rule__ComplexType__Group_3__3__Impl rule__ComplexType__Group_3__4 ;
    public final void rule__ComplexType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5342:1: ( rule__ComplexType__Group_3__3__Impl rule__ComplexType__Group_3__4 )
            // InternalCBS.g:5343:2: rule__ComplexType__Group_3__3__Impl rule__ComplexType__Group_3__4
            {
            pushFollow(FOLLOW_9);
            rule__ComplexType__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3__4();

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
    // $ANTLR end "rule__ComplexType__Group_3__3"


    // $ANTLR start "rule__ComplexType__Group_3__3__Impl"
    // InternalCBS.g:5350:1: rule__ComplexType__Group_3__3__Impl : ( ( rule__ComplexType__Group_3_3__0 )* ) ;
    public final void rule__ComplexType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5354:1: ( ( ( rule__ComplexType__Group_3_3__0 )* ) )
            // InternalCBS.g:5355:1: ( ( rule__ComplexType__Group_3_3__0 )* )
            {
            // InternalCBS.g:5355:1: ( ( rule__ComplexType__Group_3_3__0 )* )
            // InternalCBS.g:5356:2: ( rule__ComplexType__Group_3_3__0 )*
            {
             before(grammarAccess.getComplexTypeAccess().getGroup_3_3()); 
            // InternalCBS.g:5357:2: ( rule__ComplexType__Group_3_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==24) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCBS.g:5357:3: rule__ComplexType__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComplexType__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getComplexTypeAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__ComplexType__Group_3__3__Impl"


    // $ANTLR start "rule__ComplexType__Group_3__4"
    // InternalCBS.g:5365:1: rule__ComplexType__Group_3__4 : rule__ComplexType__Group_3__4__Impl ;
    public final void rule__ComplexType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5369:1: ( rule__ComplexType__Group_3__4__Impl )
            // InternalCBS.g:5370:2: rule__ComplexType__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3__4__Impl();

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
    // $ANTLR end "rule__ComplexType__Group_3__4"


    // $ANTLR start "rule__ComplexType__Group_3__4__Impl"
    // InternalCBS.g:5376:1: rule__ComplexType__Group_3__4__Impl : ( '}' ) ;
    public final void rule__ComplexType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5380:1: ( ( '}' ) )
            // InternalCBS.g:5381:1: ( '}' )
            {
            // InternalCBS.g:5381:1: ( '}' )
            // InternalCBS.g:5382:2: '}'
            {
             before(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__ComplexType__Group_3__4__Impl"


    // $ANTLR start "rule__ComplexType__Group_3_3__0"
    // InternalCBS.g:5392:1: rule__ComplexType__Group_3_3__0 : rule__ComplexType__Group_3_3__0__Impl rule__ComplexType__Group_3_3__1 ;
    public final void rule__ComplexType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5396:1: ( rule__ComplexType__Group_3_3__0__Impl rule__ComplexType__Group_3_3__1 )
            // InternalCBS.g:5397:2: rule__ComplexType__Group_3_3__0__Impl rule__ComplexType__Group_3_3__1
            {
            pushFollow(FOLLOW_36);
            rule__ComplexType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3_3__1();

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
    // $ANTLR end "rule__ComplexType__Group_3_3__0"


    // $ANTLR start "rule__ComplexType__Group_3_3__0__Impl"
    // InternalCBS.g:5404:1: rule__ComplexType__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__ComplexType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5408:1: ( ( ',' ) )
            // InternalCBS.g:5409:1: ( ',' )
            {
            // InternalCBS.g:5409:1: ( ',' )
            // InternalCBS.g:5410:2: ','
            {
             before(grammarAccess.getComplexTypeAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__ComplexType__Group_3_3__0__Impl"


    // $ANTLR start "rule__ComplexType__Group_3_3__1"
    // InternalCBS.g:5419:1: rule__ComplexType__Group_3_3__1 : rule__ComplexType__Group_3_3__1__Impl ;
    public final void rule__ComplexType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5423:1: ( rule__ComplexType__Group_3_3__1__Impl )
            // InternalCBS.g:5424:2: rule__ComplexType__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__ComplexType__Group_3_3__1"


    // $ANTLR start "rule__ComplexType__Group_3_3__1__Impl"
    // InternalCBS.g:5430:1: rule__ComplexType__Group_3_3__1__Impl : ( ( rule__ComplexType__MembersAssignment_3_3_1 ) ) ;
    public final void rule__ComplexType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5434:1: ( ( ( rule__ComplexType__MembersAssignment_3_3_1 ) ) )
            // InternalCBS.g:5435:1: ( ( rule__ComplexType__MembersAssignment_3_3_1 ) )
            {
            // InternalCBS.g:5435:1: ( ( rule__ComplexType__MembersAssignment_3_3_1 ) )
            // InternalCBS.g:5436:2: ( rule__ComplexType__MembersAssignment_3_3_1 )
            {
             before(grammarAccess.getComplexTypeAccess().getMembersAssignment_3_3_1()); 
            // InternalCBS.g:5437:2: ( rule__ComplexType__MembersAssignment_3_3_1 )
            // InternalCBS.g:5437:3: rule__ComplexType__MembersAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__MembersAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getMembersAssignment_3_3_1()); 

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
    // $ANTLR end "rule__ComplexType__Group_3_3__1__Impl"


    // $ANTLR start "rule__ComplexMember__Group__0"
    // InternalCBS.g:5446:1: rule__ComplexMember__Group__0 : rule__ComplexMember__Group__0__Impl rule__ComplexMember__Group__1 ;
    public final void rule__ComplexMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5450:1: ( rule__ComplexMember__Group__0__Impl rule__ComplexMember__Group__1 )
            // InternalCBS.g:5451:2: rule__ComplexMember__Group__0__Impl rule__ComplexMember__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComplexMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexMember__Group__1();

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
    // $ANTLR end "rule__ComplexMember__Group__0"


    // $ANTLR start "rule__ComplexMember__Group__0__Impl"
    // InternalCBS.g:5458:1: rule__ComplexMember__Group__0__Impl : ( 'ComplexMember' ) ;
    public final void rule__ComplexMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5462:1: ( ( 'ComplexMember' ) )
            // InternalCBS.g:5463:1: ( 'ComplexMember' )
            {
            // InternalCBS.g:5463:1: ( 'ComplexMember' )
            // InternalCBS.g:5464:2: 'ComplexMember'
            {
             before(grammarAccess.getComplexMemberAccess().getComplexMemberKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getComplexMemberAccess().getComplexMemberKeyword_0()); 

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
    // $ANTLR end "rule__ComplexMember__Group__0__Impl"


    // $ANTLR start "rule__ComplexMember__Group__1"
    // InternalCBS.g:5473:1: rule__ComplexMember__Group__1 : rule__ComplexMember__Group__1__Impl rule__ComplexMember__Group__2 ;
    public final void rule__ComplexMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5477:1: ( rule__ComplexMember__Group__1__Impl rule__ComplexMember__Group__2 )
            // InternalCBS.g:5478:2: rule__ComplexMember__Group__1__Impl rule__ComplexMember__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComplexMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexMember__Group__2();

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
    // $ANTLR end "rule__ComplexMember__Group__1"


    // $ANTLR start "rule__ComplexMember__Group__1__Impl"
    // InternalCBS.g:5485:1: rule__ComplexMember__Group__1__Impl : ( ( rule__ComplexMember__NameAssignment_1 ) ) ;
    public final void rule__ComplexMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5489:1: ( ( ( rule__ComplexMember__NameAssignment_1 ) ) )
            // InternalCBS.g:5490:1: ( ( rule__ComplexMember__NameAssignment_1 ) )
            {
            // InternalCBS.g:5490:1: ( ( rule__ComplexMember__NameAssignment_1 ) )
            // InternalCBS.g:5491:2: ( rule__ComplexMember__NameAssignment_1 )
            {
             before(grammarAccess.getComplexMemberAccess().getNameAssignment_1()); 
            // InternalCBS.g:5492:2: ( rule__ComplexMember__NameAssignment_1 )
            // InternalCBS.g:5492:3: rule__ComplexMember__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexMember__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexMemberAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ComplexMember__Group__1__Impl"


    // $ANTLR start "rule__ComplexMember__Group__2"
    // InternalCBS.g:5500:1: rule__ComplexMember__Group__2 : rule__ComplexMember__Group__2__Impl rule__ComplexMember__Group__3 ;
    public final void rule__ComplexMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5504:1: ( rule__ComplexMember__Group__2__Impl rule__ComplexMember__Group__3 )
            // InternalCBS.g:5505:2: rule__ComplexMember__Group__2__Impl rule__ComplexMember__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ComplexMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexMember__Group__3();

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
    // $ANTLR end "rule__ComplexMember__Group__2"


    // $ANTLR start "rule__ComplexMember__Group__2__Impl"
    // InternalCBS.g:5512:1: rule__ComplexMember__Group__2__Impl : ( '{' ) ;
    public final void rule__ComplexMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5516:1: ( ( '{' ) )
            // InternalCBS.g:5517:1: ( '{' )
            {
            // InternalCBS.g:5517:1: ( '{' )
            // InternalCBS.g:5518:2: '{'
            {
             before(grammarAccess.getComplexMemberAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComplexMemberAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ComplexMember__Group__2__Impl"


    // $ANTLR start "rule__ComplexMember__Group__3"
    // InternalCBS.g:5527:1: rule__ComplexMember__Group__3 : rule__ComplexMember__Group__3__Impl rule__ComplexMember__Group__4 ;
    public final void rule__ComplexMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5531:1: ( rule__ComplexMember__Group__3__Impl rule__ComplexMember__Group__4 )
            // InternalCBS.g:5532:2: rule__ComplexMember__Group__3__Impl rule__ComplexMember__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ComplexMember__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexMember__Group__4();

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
    // $ANTLR end "rule__ComplexMember__Group__3"


    // $ANTLR start "rule__ComplexMember__Group__3__Impl"
    // InternalCBS.g:5539:1: rule__ComplexMember__Group__3__Impl : ( 'type' ) ;
    public final void rule__ComplexMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5543:1: ( ( 'type' ) )
            // InternalCBS.g:5544:1: ( 'type' )
            {
            // InternalCBS.g:5544:1: ( 'type' )
            // InternalCBS.g:5545:2: 'type'
            {
             before(grammarAccess.getComplexMemberAccess().getTypeKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getComplexMemberAccess().getTypeKeyword_3()); 

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
    // $ANTLR end "rule__ComplexMember__Group__3__Impl"


    // $ANTLR start "rule__ComplexMember__Group__4"
    // InternalCBS.g:5554:1: rule__ComplexMember__Group__4 : rule__ComplexMember__Group__4__Impl rule__ComplexMember__Group__5 ;
    public final void rule__ComplexMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5558:1: ( rule__ComplexMember__Group__4__Impl rule__ComplexMember__Group__5 )
            // InternalCBS.g:5559:2: rule__ComplexMember__Group__4__Impl rule__ComplexMember__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ComplexMember__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexMember__Group__5();

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
    // $ANTLR end "rule__ComplexMember__Group__4"


    // $ANTLR start "rule__ComplexMember__Group__4__Impl"
    // InternalCBS.g:5566:1: rule__ComplexMember__Group__4__Impl : ( ( rule__ComplexMember__TypeAssignment_4 ) ) ;
    public final void rule__ComplexMember__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5570:1: ( ( ( rule__ComplexMember__TypeAssignment_4 ) ) )
            // InternalCBS.g:5571:1: ( ( rule__ComplexMember__TypeAssignment_4 ) )
            {
            // InternalCBS.g:5571:1: ( ( rule__ComplexMember__TypeAssignment_4 ) )
            // InternalCBS.g:5572:2: ( rule__ComplexMember__TypeAssignment_4 )
            {
             before(grammarAccess.getComplexMemberAccess().getTypeAssignment_4()); 
            // InternalCBS.g:5573:2: ( rule__ComplexMember__TypeAssignment_4 )
            // InternalCBS.g:5573:3: rule__ComplexMember__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComplexMember__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComplexMemberAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__ComplexMember__Group__4__Impl"


    // $ANTLR start "rule__ComplexMember__Group__5"
    // InternalCBS.g:5581:1: rule__ComplexMember__Group__5 : rule__ComplexMember__Group__5__Impl ;
    public final void rule__ComplexMember__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5585:1: ( rule__ComplexMember__Group__5__Impl )
            // InternalCBS.g:5586:2: rule__ComplexMember__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexMember__Group__5__Impl();

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
    // $ANTLR end "rule__ComplexMember__Group__5"


    // $ANTLR start "rule__ComplexMember__Group__5__Impl"
    // InternalCBS.g:5592:1: rule__ComplexMember__Group__5__Impl : ( '}' ) ;
    public final void rule__ComplexMember__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5596:1: ( ( '}' ) )
            // InternalCBS.g:5597:1: ( '}' )
            {
            // InternalCBS.g:5597:1: ( '}' )
            // InternalCBS.g:5598:2: '}'
            {
             before(grammarAccess.getComplexMemberAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexMemberAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ComplexMember__Group__5__Impl"


    // $ANTLR start "rule__Void__Group__0"
    // InternalCBS.g:5608:1: rule__Void__Group__0 : rule__Void__Group__0__Impl rule__Void__Group__1 ;
    public final void rule__Void__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5612:1: ( rule__Void__Group__0__Impl rule__Void__Group__1 )
            // InternalCBS.g:5613:2: rule__Void__Group__0__Impl rule__Void__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Void__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Void__Group__1();

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
    // $ANTLR end "rule__Void__Group__0"


    // $ANTLR start "rule__Void__Group__0__Impl"
    // InternalCBS.g:5620:1: rule__Void__Group__0__Impl : ( () ) ;
    public final void rule__Void__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5624:1: ( ( () ) )
            // InternalCBS.g:5625:1: ( () )
            {
            // InternalCBS.g:5625:1: ( () )
            // InternalCBS.g:5626:2: ()
            {
             before(grammarAccess.getVoidAccess().getVoidAction_0()); 
            // InternalCBS.g:5627:2: ()
            // InternalCBS.g:5627:3: 
            {
            }

             after(grammarAccess.getVoidAccess().getVoidAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__0__Impl"


    // $ANTLR start "rule__Void__Group__1"
    // InternalCBS.g:5635:1: rule__Void__Group__1 : rule__Void__Group__1__Impl ;
    public final void rule__Void__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5639:1: ( rule__Void__Group__1__Impl )
            // InternalCBS.g:5640:2: rule__Void__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Void__Group__1__Impl();

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
    // $ANTLR end "rule__Void__Group__1"


    // $ANTLR start "rule__Void__Group__1__Impl"
    // InternalCBS.g:5646:1: rule__Void__Group__1__Impl : ( 'Void' ) ;
    public final void rule__Void__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5650:1: ( ( 'Void' ) )
            // InternalCBS.g:5651:1: ( 'Void' )
            {
            // InternalCBS.g:5651:1: ( 'Void' )
            // InternalCBS.g:5652:2: 'Void'
            {
             before(grammarAccess.getVoidAccess().getVoidKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getVoidAccess().getVoidKeyword_1()); 

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
    // $ANTLR end "rule__Void__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalCBS.g:5662:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5666:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalCBS.g:5667:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalCBS.g:5674:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5678:1: ( ( 'Service' ) )
            // InternalCBS.g:5679:1: ( 'Service' )
            {
            // InternalCBS.g:5679:1: ( 'Service' )
            // InternalCBS.g:5680:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalCBS.g:5689:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5693:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalCBS.g:5694:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalCBS.g:5701:1: rule__Service__Group__1__Impl : ( '{' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5705:1: ( ( '{' ) )
            // InternalCBS.g:5706:1: ( '{' )
            {
            // InternalCBS.g:5706:1: ( '{' )
            // InternalCBS.g:5707:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalCBS.g:5716:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5720:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalCBS.g:5721:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalCBS.g:5728:1: rule__Service__Group__2__Impl : ( 'implements' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5732:1: ( ( 'implements' ) )
            // InternalCBS.g:5733:1: ( 'implements' )
            {
            // InternalCBS.g:5733:1: ( 'implements' )
            // InternalCBS.g:5734:2: 'implements'
            {
             before(grammarAccess.getServiceAccess().getImplementsKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getImplementsKeyword_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalCBS.g:5743:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5747:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalCBS.g:5748:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalCBS.g:5755:1: rule__Service__Group__3__Impl : ( ( rule__Service__ImplementsAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5759:1: ( ( ( rule__Service__ImplementsAssignment_3 ) ) )
            // InternalCBS.g:5760:1: ( ( rule__Service__ImplementsAssignment_3 ) )
            {
            // InternalCBS.g:5760:1: ( ( rule__Service__ImplementsAssignment_3 ) )
            // InternalCBS.g:5761:2: ( rule__Service__ImplementsAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getImplementsAssignment_3()); 
            // InternalCBS.g:5762:2: ( rule__Service__ImplementsAssignment_3 )
            // InternalCBS.g:5762:3: rule__Service__ImplementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__ImplementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getImplementsAssignment_3()); 

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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalCBS.g:5770:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5774:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalCBS.g:5775:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalCBS.g:5782:1: rule__Service__Group__4__Impl : ( 'actions' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5786:1: ( ( 'actions' ) )
            // InternalCBS.g:5787:1: ( 'actions' )
            {
            // InternalCBS.g:5787:1: ( 'actions' )
            // InternalCBS.g:5788:2: 'actions'
            {
             before(grammarAccess.getServiceAccess().getActionsKeyword_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getActionsKeyword_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalCBS.g:5797:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5801:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalCBS.g:5802:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalCBS.g:5809:1: rule__Service__Group__5__Impl : ( '{' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5813:1: ( ( '{' ) )
            // InternalCBS.g:5814:1: ( '{' )
            {
            // InternalCBS.g:5814:1: ( '{' )
            // InternalCBS.g:5815:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalCBS.g:5824:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5828:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalCBS.g:5829:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

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
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalCBS.g:5836:1: rule__Service__Group__6__Impl : ( ( rule__Service__ActionsAssignment_6 ) ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5840:1: ( ( ( rule__Service__ActionsAssignment_6 ) ) )
            // InternalCBS.g:5841:1: ( ( rule__Service__ActionsAssignment_6 ) )
            {
            // InternalCBS.g:5841:1: ( ( rule__Service__ActionsAssignment_6 ) )
            // InternalCBS.g:5842:2: ( rule__Service__ActionsAssignment_6 )
            {
             before(grammarAccess.getServiceAccess().getActionsAssignment_6()); 
            // InternalCBS.g:5843:2: ( rule__Service__ActionsAssignment_6 )
            // InternalCBS.g:5843:3: rule__Service__ActionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Service__ActionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getActionsAssignment_6()); 

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
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalCBS.g:5851:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5855:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalCBS.g:5856:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

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
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalCBS.g:5863:1: rule__Service__Group__7__Impl : ( ( rule__Service__Group_7__0 )* ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5867:1: ( ( ( rule__Service__Group_7__0 )* ) )
            // InternalCBS.g:5868:1: ( ( rule__Service__Group_7__0 )* )
            {
            // InternalCBS.g:5868:1: ( ( rule__Service__Group_7__0 )* )
            // InternalCBS.g:5869:2: ( rule__Service__Group_7__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_7()); 
            // InternalCBS.g:5870:2: ( rule__Service__Group_7__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCBS.g:5870:3: rule__Service__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Service__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalCBS.g:5878:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5882:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalCBS.g:5883:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__9();

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
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalCBS.g:5890:1: rule__Service__Group__8__Impl : ( '}' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5894:1: ( ( '}' ) )
            // InternalCBS.g:5895:1: ( '}' )
            {
            // InternalCBS.g:5895:1: ( '}' )
            // InternalCBS.g:5896:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // InternalCBS.g:5905:1: rule__Service__Group__9 : rule__Service__Group__9__Impl ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5909:1: ( rule__Service__Group__9__Impl )
            // InternalCBS.g:5910:2: rule__Service__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__9__Impl();

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
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // InternalCBS.g:5916:1: rule__Service__Group__9__Impl : ( '}' ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5920:1: ( ( '}' ) )
            // InternalCBS.g:5921:1: ( '}' )
            {
            // InternalCBS.g:5921:1: ( '}' )
            // InternalCBS.g:5922:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Service__Group_7__0"
    // InternalCBS.g:5932:1: rule__Service__Group_7__0 : rule__Service__Group_7__0__Impl rule__Service__Group_7__1 ;
    public final void rule__Service__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5936:1: ( rule__Service__Group_7__0__Impl rule__Service__Group_7__1 )
            // InternalCBS.g:5937:2: rule__Service__Group_7__0__Impl rule__Service__Group_7__1
            {
            pushFollow(FOLLOW_40);
            rule__Service__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_7__1();

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
    // $ANTLR end "rule__Service__Group_7__0"


    // $ANTLR start "rule__Service__Group_7__0__Impl"
    // InternalCBS.g:5944:1: rule__Service__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5948:1: ( ( ',' ) )
            // InternalCBS.g:5949:1: ( ',' )
            {
            // InternalCBS.g:5949:1: ( ',' )
            // InternalCBS.g:5950:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Service__Group_7__0__Impl"


    // $ANTLR start "rule__Service__Group_7__1"
    // InternalCBS.g:5959:1: rule__Service__Group_7__1 : rule__Service__Group_7__1__Impl ;
    public final void rule__Service__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5963:1: ( rule__Service__Group_7__1__Impl )
            // InternalCBS.g:5964:2: rule__Service__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_7__1__Impl();

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
    // $ANTLR end "rule__Service__Group_7__1"


    // $ANTLR start "rule__Service__Group_7__1__Impl"
    // InternalCBS.g:5970:1: rule__Service__Group_7__1__Impl : ( ( rule__Service__ActionsAssignment_7_1 ) ) ;
    public final void rule__Service__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5974:1: ( ( ( rule__Service__ActionsAssignment_7_1 ) ) )
            // InternalCBS.g:5975:1: ( ( rule__Service__ActionsAssignment_7_1 ) )
            {
            // InternalCBS.g:5975:1: ( ( rule__Service__ActionsAssignment_7_1 ) )
            // InternalCBS.g:5976:2: ( rule__Service__ActionsAssignment_7_1 )
            {
             before(grammarAccess.getServiceAccess().getActionsAssignment_7_1()); 
            // InternalCBS.g:5977:2: ( rule__Service__ActionsAssignment_7_1 )
            // InternalCBS.g:5977:3: rule__Service__ActionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__ActionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getActionsAssignment_7_1()); 

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
    // $ANTLR end "rule__Service__Group_7__1__Impl"


    // $ANTLR start "rule__InternalAction__Group__0"
    // InternalCBS.g:5986:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5990:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalCBS.g:5991:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__InternalAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1();

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
    // $ANTLR end "rule__InternalAction__Group__0"


    // $ANTLR start "rule__InternalAction__Group__0__Impl"
    // InternalCBS.g:5998:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6002:1: ( ( () ) )
            // InternalCBS.g:6003:1: ( () )
            {
            // InternalCBS.g:6003:1: ( () )
            // InternalCBS.g:6004:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalCBS.g:6005:2: ()
            // InternalCBS.g:6005:3: 
            {
            }

             after(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0__Impl"


    // $ANTLR start "rule__InternalAction__Group__1"
    // InternalCBS.g:6013:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6017:1: ( rule__InternalAction__Group__1__Impl )
            // InternalCBS.g:6018:2: rule__InternalAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1__Impl();

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
    // $ANTLR end "rule__InternalAction__Group__1"


    // $ANTLR start "rule__InternalAction__Group__1__Impl"
    // InternalCBS.g:6024:1: rule__InternalAction__Group__1__Impl : ( 'InternalAction' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6028:1: ( ( 'InternalAction' ) )
            // InternalCBS.g:6029:1: ( 'InternalAction' )
            {
            // InternalCBS.g:6029:1: ( 'InternalAction' )
            // InternalCBS.g:6030:2: 'InternalAction'
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 

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
    // $ANTLR end "rule__InternalAction__Group__1__Impl"


    // $ANTLR start "rule__ExternalCallAction__Group__0"
    // InternalCBS.g:6040:1: rule__ExternalCallAction__Group__0 : rule__ExternalCallAction__Group__0__Impl rule__ExternalCallAction__Group__1 ;
    public final void rule__ExternalCallAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6044:1: ( rule__ExternalCallAction__Group__0__Impl rule__ExternalCallAction__Group__1 )
            // InternalCBS.g:6045:2: rule__ExternalCallAction__Group__0__Impl rule__ExternalCallAction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ExternalCallAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__Group__1();

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
    // $ANTLR end "rule__ExternalCallAction__Group__0"


    // $ANTLR start "rule__ExternalCallAction__Group__0__Impl"
    // InternalCBS.g:6052:1: rule__ExternalCallAction__Group__0__Impl : ( 'ExternalCallAction' ) ;
    public final void rule__ExternalCallAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6056:1: ( ( 'ExternalCallAction' ) )
            // InternalCBS.g:6057:1: ( 'ExternalCallAction' )
            {
            // InternalCBS.g:6057:1: ( 'ExternalCallAction' )
            // InternalCBS.g:6058:2: 'ExternalCallAction'
            {
             before(grammarAccess.getExternalCallActionAccess().getExternalCallActionKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getExternalCallActionAccess().getExternalCallActionKeyword_0()); 

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
    // $ANTLR end "rule__ExternalCallAction__Group__0__Impl"


    // $ANTLR start "rule__ExternalCallAction__Group__1"
    // InternalCBS.g:6067:1: rule__ExternalCallAction__Group__1 : rule__ExternalCallAction__Group__1__Impl rule__ExternalCallAction__Group__2 ;
    public final void rule__ExternalCallAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6071:1: ( rule__ExternalCallAction__Group__1__Impl rule__ExternalCallAction__Group__2 )
            // InternalCBS.g:6072:2: rule__ExternalCallAction__Group__1__Impl rule__ExternalCallAction__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__ExternalCallAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__Group__2();

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
    // $ANTLR end "rule__ExternalCallAction__Group__1"


    // $ANTLR start "rule__ExternalCallAction__Group__1__Impl"
    // InternalCBS.g:6079:1: rule__ExternalCallAction__Group__1__Impl : ( '{' ) ;
    public final void rule__ExternalCallAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6083:1: ( ( '{' ) )
            // InternalCBS.g:6084:1: ( '{' )
            {
            // InternalCBS.g:6084:1: ( '{' )
            // InternalCBS.g:6085:2: '{'
            {
             before(grammarAccess.getExternalCallActionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExternalCallActionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ExternalCallAction__Group__1__Impl"


    // $ANTLR start "rule__ExternalCallAction__Group__2"
    // InternalCBS.g:6094:1: rule__ExternalCallAction__Group__2 : rule__ExternalCallAction__Group__2__Impl rule__ExternalCallAction__Group__3 ;
    public final void rule__ExternalCallAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6098:1: ( rule__ExternalCallAction__Group__2__Impl rule__ExternalCallAction__Group__3 )
            // InternalCBS.g:6099:2: rule__ExternalCallAction__Group__2__Impl rule__ExternalCallAction__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ExternalCallAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__Group__3();

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
    // $ANTLR end "rule__ExternalCallAction__Group__2"


    // $ANTLR start "rule__ExternalCallAction__Group__2__Impl"
    // InternalCBS.g:6106:1: rule__ExternalCallAction__Group__2__Impl : ( 'requiredService' ) ;
    public final void rule__ExternalCallAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6110:1: ( ( 'requiredService' ) )
            // InternalCBS.g:6111:1: ( 'requiredService' )
            {
            // InternalCBS.g:6111:1: ( 'requiredService' )
            // InternalCBS.g:6112:2: 'requiredService'
            {
             before(grammarAccess.getExternalCallActionAccess().getRequiredServiceKeyword_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getExternalCallActionAccess().getRequiredServiceKeyword_2()); 

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
    // $ANTLR end "rule__ExternalCallAction__Group__2__Impl"


    // $ANTLR start "rule__ExternalCallAction__Group__3"
    // InternalCBS.g:6121:1: rule__ExternalCallAction__Group__3 : rule__ExternalCallAction__Group__3__Impl rule__ExternalCallAction__Group__4 ;
    public final void rule__ExternalCallAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6125:1: ( rule__ExternalCallAction__Group__3__Impl rule__ExternalCallAction__Group__4 )
            // InternalCBS.g:6126:2: rule__ExternalCallAction__Group__3__Impl rule__ExternalCallAction__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ExternalCallAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__Group__4();

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
    // $ANTLR end "rule__ExternalCallAction__Group__3"


    // $ANTLR start "rule__ExternalCallAction__Group__3__Impl"
    // InternalCBS.g:6133:1: rule__ExternalCallAction__Group__3__Impl : ( ( rule__ExternalCallAction__RequiredServiceAssignment_3 ) ) ;
    public final void rule__ExternalCallAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6137:1: ( ( ( rule__ExternalCallAction__RequiredServiceAssignment_3 ) ) )
            // InternalCBS.g:6138:1: ( ( rule__ExternalCallAction__RequiredServiceAssignment_3 ) )
            {
            // InternalCBS.g:6138:1: ( ( rule__ExternalCallAction__RequiredServiceAssignment_3 ) )
            // InternalCBS.g:6139:2: ( rule__ExternalCallAction__RequiredServiceAssignment_3 )
            {
             before(grammarAccess.getExternalCallActionAccess().getRequiredServiceAssignment_3()); 
            // InternalCBS.g:6140:2: ( rule__ExternalCallAction__RequiredServiceAssignment_3 )
            // InternalCBS.g:6140:3: rule__ExternalCallAction__RequiredServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__RequiredServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalCallActionAccess().getRequiredServiceAssignment_3()); 

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
    // $ANTLR end "rule__ExternalCallAction__Group__3__Impl"


    // $ANTLR start "rule__ExternalCallAction__Group__4"
    // InternalCBS.g:6148:1: rule__ExternalCallAction__Group__4 : rule__ExternalCallAction__Group__4__Impl ;
    public final void rule__ExternalCallAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6152:1: ( rule__ExternalCallAction__Group__4__Impl )
            // InternalCBS.g:6153:2: rule__ExternalCallAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__Group__4__Impl();

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
    // $ANTLR end "rule__ExternalCallAction__Group__4"


    // $ANTLR start "rule__ExternalCallAction__Group__4__Impl"
    // InternalCBS.g:6159:1: rule__ExternalCallAction__Group__4__Impl : ( '}' ) ;
    public final void rule__ExternalCallAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6163:1: ( ( '}' ) )
            // InternalCBS.g:6164:1: ( '}' )
            {
            // InternalCBS.g:6164:1: ( '}' )
            // InternalCBS.g:6165:2: '}'
            {
             before(grammarAccess.getExternalCallActionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExternalCallActionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ExternalCallAction__Group__4__Impl"


    // $ANTLR start "rule__BranchAction__Group__0"
    // InternalCBS.g:6175:1: rule__BranchAction__Group__0 : rule__BranchAction__Group__0__Impl rule__BranchAction__Group__1 ;
    public final void rule__BranchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6179:1: ( rule__BranchAction__Group__0__Impl rule__BranchAction__Group__1 )
            // InternalCBS.g:6180:2: rule__BranchAction__Group__0__Impl rule__BranchAction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BranchAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__1();

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
    // $ANTLR end "rule__BranchAction__Group__0"


    // $ANTLR start "rule__BranchAction__Group__0__Impl"
    // InternalCBS.g:6187:1: rule__BranchAction__Group__0__Impl : ( 'BranchAction' ) ;
    public final void rule__BranchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6191:1: ( ( 'BranchAction' ) )
            // InternalCBS.g:6192:1: ( 'BranchAction' )
            {
            // InternalCBS.g:6192:1: ( 'BranchAction' )
            // InternalCBS.g:6193:2: 'BranchAction'
            {
             before(grammarAccess.getBranchActionAccess().getBranchActionKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getBranchActionKeyword_0()); 

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
    // $ANTLR end "rule__BranchAction__Group__0__Impl"


    // $ANTLR start "rule__BranchAction__Group__1"
    // InternalCBS.g:6202:1: rule__BranchAction__Group__1 : rule__BranchAction__Group__1__Impl rule__BranchAction__Group__2 ;
    public final void rule__BranchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6206:1: ( rule__BranchAction__Group__1__Impl rule__BranchAction__Group__2 )
            // InternalCBS.g:6207:2: rule__BranchAction__Group__1__Impl rule__BranchAction__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__BranchAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__2();

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
    // $ANTLR end "rule__BranchAction__Group__1"


    // $ANTLR start "rule__BranchAction__Group__1__Impl"
    // InternalCBS.g:6214:1: rule__BranchAction__Group__1__Impl : ( '{' ) ;
    public final void rule__BranchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6218:1: ( ( '{' ) )
            // InternalCBS.g:6219:1: ( '{' )
            {
            // InternalCBS.g:6219:1: ( '{' )
            // InternalCBS.g:6220:2: '{'
            {
             before(grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__BranchAction__Group__1__Impl"


    // $ANTLR start "rule__BranchAction__Group__2"
    // InternalCBS.g:6229:1: rule__BranchAction__Group__2 : rule__BranchAction__Group__2__Impl rule__BranchAction__Group__3 ;
    public final void rule__BranchAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6233:1: ( rule__BranchAction__Group__2__Impl rule__BranchAction__Group__3 )
            // InternalCBS.g:6234:2: rule__BranchAction__Group__2__Impl rule__BranchAction__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BranchAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__3();

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
    // $ANTLR end "rule__BranchAction__Group__2"


    // $ANTLR start "rule__BranchAction__Group__2__Impl"
    // InternalCBS.g:6241:1: rule__BranchAction__Group__2__Impl : ( 'branches' ) ;
    public final void rule__BranchAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6245:1: ( ( 'branches' ) )
            // InternalCBS.g:6246:1: ( 'branches' )
            {
            // InternalCBS.g:6246:1: ( 'branches' )
            // InternalCBS.g:6247:2: 'branches'
            {
             before(grammarAccess.getBranchActionAccess().getBranchesKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getBranchesKeyword_2()); 

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
    // $ANTLR end "rule__BranchAction__Group__2__Impl"


    // $ANTLR start "rule__BranchAction__Group__3"
    // InternalCBS.g:6256:1: rule__BranchAction__Group__3 : rule__BranchAction__Group__3__Impl rule__BranchAction__Group__4 ;
    public final void rule__BranchAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6260:1: ( rule__BranchAction__Group__3__Impl rule__BranchAction__Group__4 )
            // InternalCBS.g:6261:2: rule__BranchAction__Group__3__Impl rule__BranchAction__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__BranchAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__4();

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
    // $ANTLR end "rule__BranchAction__Group__3"


    // $ANTLR start "rule__BranchAction__Group__3__Impl"
    // InternalCBS.g:6268:1: rule__BranchAction__Group__3__Impl : ( '{' ) ;
    public final void rule__BranchAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6272:1: ( ( '{' ) )
            // InternalCBS.g:6273:1: ( '{' )
            {
            // InternalCBS.g:6273:1: ( '{' )
            // InternalCBS.g:6274:2: '{'
            {
             before(grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__BranchAction__Group__3__Impl"


    // $ANTLR start "rule__BranchAction__Group__4"
    // InternalCBS.g:6283:1: rule__BranchAction__Group__4 : rule__BranchAction__Group__4__Impl rule__BranchAction__Group__5 ;
    public final void rule__BranchAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6287:1: ( rule__BranchAction__Group__4__Impl rule__BranchAction__Group__5 )
            // InternalCBS.g:6288:2: rule__BranchAction__Group__4__Impl rule__BranchAction__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__BranchAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__5();

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
    // $ANTLR end "rule__BranchAction__Group__4"


    // $ANTLR start "rule__BranchAction__Group__4__Impl"
    // InternalCBS.g:6295:1: rule__BranchAction__Group__4__Impl : ( ( rule__BranchAction__BranchesAssignment_4 ) ) ;
    public final void rule__BranchAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6299:1: ( ( ( rule__BranchAction__BranchesAssignment_4 ) ) )
            // InternalCBS.g:6300:1: ( ( rule__BranchAction__BranchesAssignment_4 ) )
            {
            // InternalCBS.g:6300:1: ( ( rule__BranchAction__BranchesAssignment_4 ) )
            // InternalCBS.g:6301:2: ( rule__BranchAction__BranchesAssignment_4 )
            {
             before(grammarAccess.getBranchActionAccess().getBranchesAssignment_4()); 
            // InternalCBS.g:6302:2: ( rule__BranchAction__BranchesAssignment_4 )
            // InternalCBS.g:6302:3: rule__BranchAction__BranchesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__BranchesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBranchActionAccess().getBranchesAssignment_4()); 

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
    // $ANTLR end "rule__BranchAction__Group__4__Impl"


    // $ANTLR start "rule__BranchAction__Group__5"
    // InternalCBS.g:6310:1: rule__BranchAction__Group__5 : rule__BranchAction__Group__5__Impl rule__BranchAction__Group__6 ;
    public final void rule__BranchAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6314:1: ( rule__BranchAction__Group__5__Impl rule__BranchAction__Group__6 )
            // InternalCBS.g:6315:2: rule__BranchAction__Group__5__Impl rule__BranchAction__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__BranchAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__6();

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
    // $ANTLR end "rule__BranchAction__Group__5"


    // $ANTLR start "rule__BranchAction__Group__5__Impl"
    // InternalCBS.g:6322:1: rule__BranchAction__Group__5__Impl : ( ( rule__BranchAction__Group_5__0 )* ) ;
    public final void rule__BranchAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6326:1: ( ( ( rule__BranchAction__Group_5__0 )* ) )
            // InternalCBS.g:6327:1: ( ( rule__BranchAction__Group_5__0 )* )
            {
            // InternalCBS.g:6327:1: ( ( rule__BranchAction__Group_5__0 )* )
            // InternalCBS.g:6328:2: ( rule__BranchAction__Group_5__0 )*
            {
             before(grammarAccess.getBranchActionAccess().getGroup_5()); 
            // InternalCBS.g:6329:2: ( rule__BranchAction__Group_5__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==24) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCBS.g:6329:3: rule__BranchAction__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BranchAction__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getBranchActionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__BranchAction__Group__5__Impl"


    // $ANTLR start "rule__BranchAction__Group__6"
    // InternalCBS.g:6337:1: rule__BranchAction__Group__6 : rule__BranchAction__Group__6__Impl rule__BranchAction__Group__7 ;
    public final void rule__BranchAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6341:1: ( rule__BranchAction__Group__6__Impl rule__BranchAction__Group__7 )
            // InternalCBS.g:6342:2: rule__BranchAction__Group__6__Impl rule__BranchAction__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__BranchAction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__7();

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
    // $ANTLR end "rule__BranchAction__Group__6"


    // $ANTLR start "rule__BranchAction__Group__6__Impl"
    // InternalCBS.g:6349:1: rule__BranchAction__Group__6__Impl : ( '}' ) ;
    public final void rule__BranchAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6353:1: ( ( '}' ) )
            // InternalCBS.g:6354:1: ( '}' )
            {
            // InternalCBS.g:6354:1: ( '}' )
            // InternalCBS.g:6355:2: '}'
            {
             before(grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__BranchAction__Group__6__Impl"


    // $ANTLR start "rule__BranchAction__Group__7"
    // InternalCBS.g:6364:1: rule__BranchAction__Group__7 : rule__BranchAction__Group__7__Impl ;
    public final void rule__BranchAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6368:1: ( rule__BranchAction__Group__7__Impl )
            // InternalCBS.g:6369:2: rule__BranchAction__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__7__Impl();

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
    // $ANTLR end "rule__BranchAction__Group__7"


    // $ANTLR start "rule__BranchAction__Group__7__Impl"
    // InternalCBS.g:6375:1: rule__BranchAction__Group__7__Impl : ( '}' ) ;
    public final void rule__BranchAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6379:1: ( ( '}' ) )
            // InternalCBS.g:6380:1: ( '}' )
            {
            // InternalCBS.g:6380:1: ( '}' )
            // InternalCBS.g:6381:2: '}'
            {
             before(grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__BranchAction__Group__7__Impl"


    // $ANTLR start "rule__BranchAction__Group_5__0"
    // InternalCBS.g:6391:1: rule__BranchAction__Group_5__0 : rule__BranchAction__Group_5__0__Impl rule__BranchAction__Group_5__1 ;
    public final void rule__BranchAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6395:1: ( rule__BranchAction__Group_5__0__Impl rule__BranchAction__Group_5__1 )
            // InternalCBS.g:6396:2: rule__BranchAction__Group_5__0__Impl rule__BranchAction__Group_5__1
            {
            pushFollow(FOLLOW_44);
            rule__BranchAction__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group_5__1();

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
    // $ANTLR end "rule__BranchAction__Group_5__0"


    // $ANTLR start "rule__BranchAction__Group_5__0__Impl"
    // InternalCBS.g:6403:1: rule__BranchAction__Group_5__0__Impl : ( ',' ) ;
    public final void rule__BranchAction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6407:1: ( ( ',' ) )
            // InternalCBS.g:6408:1: ( ',' )
            {
            // InternalCBS.g:6408:1: ( ',' )
            // InternalCBS.g:6409:2: ','
            {
             before(grammarAccess.getBranchActionAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__BranchAction__Group_5__0__Impl"


    // $ANTLR start "rule__BranchAction__Group_5__1"
    // InternalCBS.g:6418:1: rule__BranchAction__Group_5__1 : rule__BranchAction__Group_5__1__Impl ;
    public final void rule__BranchAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6422:1: ( rule__BranchAction__Group_5__1__Impl )
            // InternalCBS.g:6423:2: rule__BranchAction__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__Group_5__1__Impl();

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
    // $ANTLR end "rule__BranchAction__Group_5__1"


    // $ANTLR start "rule__BranchAction__Group_5__1__Impl"
    // InternalCBS.g:6429:1: rule__BranchAction__Group_5__1__Impl : ( ( rule__BranchAction__BranchesAssignment_5_1 ) ) ;
    public final void rule__BranchAction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6433:1: ( ( ( rule__BranchAction__BranchesAssignment_5_1 ) ) )
            // InternalCBS.g:6434:1: ( ( rule__BranchAction__BranchesAssignment_5_1 ) )
            {
            // InternalCBS.g:6434:1: ( ( rule__BranchAction__BranchesAssignment_5_1 ) )
            // InternalCBS.g:6435:2: ( rule__BranchAction__BranchesAssignment_5_1 )
            {
             before(grammarAccess.getBranchActionAccess().getBranchesAssignment_5_1()); 
            // InternalCBS.g:6436:2: ( rule__BranchAction__BranchesAssignment_5_1 )
            // InternalCBS.g:6436:3: rule__BranchAction__BranchesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__BranchesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchActionAccess().getBranchesAssignment_5_1()); 

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
    // $ANTLR end "rule__BranchAction__Group_5__1__Impl"


    // $ANTLR start "rule__LoopAction__Group__0"
    // InternalCBS.g:6445:1: rule__LoopAction__Group__0 : rule__LoopAction__Group__0__Impl rule__LoopAction__Group__1 ;
    public final void rule__LoopAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6449:1: ( rule__LoopAction__Group__0__Impl rule__LoopAction__Group__1 )
            // InternalCBS.g:6450:2: rule__LoopAction__Group__0__Impl rule__LoopAction__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__LoopAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group__1();

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
    // $ANTLR end "rule__LoopAction__Group__0"


    // $ANTLR start "rule__LoopAction__Group__0__Impl"
    // InternalCBS.g:6457:1: rule__LoopAction__Group__0__Impl : ( () ) ;
    public final void rule__LoopAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6461:1: ( ( () ) )
            // InternalCBS.g:6462:1: ( () )
            {
            // InternalCBS.g:6462:1: ( () )
            // InternalCBS.g:6463:2: ()
            {
             before(grammarAccess.getLoopActionAccess().getLoopActionAction_0()); 
            // InternalCBS.g:6464:2: ()
            // InternalCBS.g:6464:3: 
            {
            }

             after(grammarAccess.getLoopActionAccess().getLoopActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__Group__0__Impl"


    // $ANTLR start "rule__LoopAction__Group__1"
    // InternalCBS.g:6472:1: rule__LoopAction__Group__1 : rule__LoopAction__Group__1__Impl rule__LoopAction__Group__2 ;
    public final void rule__LoopAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6476:1: ( rule__LoopAction__Group__1__Impl rule__LoopAction__Group__2 )
            // InternalCBS.g:6477:2: rule__LoopAction__Group__1__Impl rule__LoopAction__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LoopAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group__2();

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
    // $ANTLR end "rule__LoopAction__Group__1"


    // $ANTLR start "rule__LoopAction__Group__1__Impl"
    // InternalCBS.g:6484:1: rule__LoopAction__Group__1__Impl : ( 'LoopAction' ) ;
    public final void rule__LoopAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6488:1: ( ( 'LoopAction' ) )
            // InternalCBS.g:6489:1: ( 'LoopAction' )
            {
            // InternalCBS.g:6489:1: ( 'LoopAction' )
            // InternalCBS.g:6490:2: 'LoopAction'
            {
             before(grammarAccess.getLoopActionAccess().getLoopActionKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getLoopActionKeyword_1()); 

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
    // $ANTLR end "rule__LoopAction__Group__1__Impl"


    // $ANTLR start "rule__LoopAction__Group__2"
    // InternalCBS.g:6499:1: rule__LoopAction__Group__2 : rule__LoopAction__Group__2__Impl rule__LoopAction__Group__3 ;
    public final void rule__LoopAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6503:1: ( rule__LoopAction__Group__2__Impl rule__LoopAction__Group__3 )
            // InternalCBS.g:6504:2: rule__LoopAction__Group__2__Impl rule__LoopAction__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__LoopAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group__3();

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
    // $ANTLR end "rule__LoopAction__Group__2"


    // $ANTLR start "rule__LoopAction__Group__2__Impl"
    // InternalCBS.g:6511:1: rule__LoopAction__Group__2__Impl : ( '{' ) ;
    public final void rule__LoopAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6515:1: ( ( '{' ) )
            // InternalCBS.g:6516:1: ( '{' )
            {
            // InternalCBS.g:6516:1: ( '{' )
            // InternalCBS.g:6517:2: '{'
            {
             before(grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LoopAction__Group__2__Impl"


    // $ANTLR start "rule__LoopAction__Group__3"
    // InternalCBS.g:6526:1: rule__LoopAction__Group__3 : rule__LoopAction__Group__3__Impl rule__LoopAction__Group__4 ;
    public final void rule__LoopAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6530:1: ( rule__LoopAction__Group__3__Impl rule__LoopAction__Group__4 )
            // InternalCBS.g:6531:2: rule__LoopAction__Group__3__Impl rule__LoopAction__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__LoopAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group__4();

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
    // $ANTLR end "rule__LoopAction__Group__3"


    // $ANTLR start "rule__LoopAction__Group__3__Impl"
    // InternalCBS.g:6538:1: rule__LoopAction__Group__3__Impl : ( ( rule__LoopAction__Group_3__0 )? ) ;
    public final void rule__LoopAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6542:1: ( ( ( rule__LoopAction__Group_3__0 )? ) )
            // InternalCBS.g:6543:1: ( ( rule__LoopAction__Group_3__0 )? )
            {
            // InternalCBS.g:6543:1: ( ( rule__LoopAction__Group_3__0 )? )
            // InternalCBS.g:6544:2: ( rule__LoopAction__Group_3__0 )?
            {
             before(grammarAccess.getLoopActionAccess().getGroup_3()); 
            // InternalCBS.g:6545:2: ( rule__LoopAction__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==68) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCBS.g:6545:3: rule__LoopAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoopAction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopActionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LoopAction__Group__3__Impl"


    // $ANTLR start "rule__LoopAction__Group__4"
    // InternalCBS.g:6553:1: rule__LoopAction__Group__4 : rule__LoopAction__Group__4__Impl ;
    public final void rule__LoopAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6557:1: ( rule__LoopAction__Group__4__Impl )
            // InternalCBS.g:6558:2: rule__LoopAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__Group__4__Impl();

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
    // $ANTLR end "rule__LoopAction__Group__4"


    // $ANTLR start "rule__LoopAction__Group__4__Impl"
    // InternalCBS.g:6564:1: rule__LoopAction__Group__4__Impl : ( '}' ) ;
    public final void rule__LoopAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6568:1: ( ( '}' ) )
            // InternalCBS.g:6569:1: ( '}' )
            {
            // InternalCBS.g:6569:1: ( '}' )
            // InternalCBS.g:6570:2: '}'
            {
             before(grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__LoopAction__Group__4__Impl"


    // $ANTLR start "rule__LoopAction__Group_3__0"
    // InternalCBS.g:6580:1: rule__LoopAction__Group_3__0 : rule__LoopAction__Group_3__0__Impl rule__LoopAction__Group_3__1 ;
    public final void rule__LoopAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6584:1: ( rule__LoopAction__Group_3__0__Impl rule__LoopAction__Group_3__1 )
            // InternalCBS.g:6585:2: rule__LoopAction__Group_3__0__Impl rule__LoopAction__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__LoopAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_3__1();

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
    // $ANTLR end "rule__LoopAction__Group_3__0"


    // $ANTLR start "rule__LoopAction__Group_3__0__Impl"
    // InternalCBS.g:6592:1: rule__LoopAction__Group_3__0__Impl : ( 'bodyActions' ) ;
    public final void rule__LoopAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6596:1: ( ( 'bodyActions' ) )
            // InternalCBS.g:6597:1: ( 'bodyActions' )
            {
            // InternalCBS.g:6597:1: ( 'bodyActions' )
            // InternalCBS.g:6598:2: 'bodyActions'
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getBodyActionsKeyword_3_0()); 

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
    // $ANTLR end "rule__LoopAction__Group_3__0__Impl"


    // $ANTLR start "rule__LoopAction__Group_3__1"
    // InternalCBS.g:6607:1: rule__LoopAction__Group_3__1 : rule__LoopAction__Group_3__1__Impl rule__LoopAction__Group_3__2 ;
    public final void rule__LoopAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6611:1: ( rule__LoopAction__Group_3__1__Impl rule__LoopAction__Group_3__2 )
            // InternalCBS.g:6612:2: rule__LoopAction__Group_3__1__Impl rule__LoopAction__Group_3__2
            {
            pushFollow(FOLLOW_40);
            rule__LoopAction__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_3__2();

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
    // $ANTLR end "rule__LoopAction__Group_3__1"


    // $ANTLR start "rule__LoopAction__Group_3__1__Impl"
    // InternalCBS.g:6619:1: rule__LoopAction__Group_3__1__Impl : ( '{' ) ;
    public final void rule__LoopAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6623:1: ( ( '{' ) )
            // InternalCBS.g:6624:1: ( '{' )
            {
            // InternalCBS.g:6624:1: ( '{' )
            // InternalCBS.g:6625:2: '{'
            {
             before(grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__LoopAction__Group_3__1__Impl"


    // $ANTLR start "rule__LoopAction__Group_3__2"
    // InternalCBS.g:6634:1: rule__LoopAction__Group_3__2 : rule__LoopAction__Group_3__2__Impl rule__LoopAction__Group_3__3 ;
    public final void rule__LoopAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6638:1: ( rule__LoopAction__Group_3__2__Impl rule__LoopAction__Group_3__3 )
            // InternalCBS.g:6639:2: rule__LoopAction__Group_3__2__Impl rule__LoopAction__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__LoopAction__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_3__3();

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
    // $ANTLR end "rule__LoopAction__Group_3__2"


    // $ANTLR start "rule__LoopAction__Group_3__2__Impl"
    // InternalCBS.g:6646:1: rule__LoopAction__Group_3__2__Impl : ( ( rule__LoopAction__BodyActionsAssignment_3_2 ) ) ;
    public final void rule__LoopAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6650:1: ( ( ( rule__LoopAction__BodyActionsAssignment_3_2 ) ) )
            // InternalCBS.g:6651:1: ( ( rule__LoopAction__BodyActionsAssignment_3_2 ) )
            {
            // InternalCBS.g:6651:1: ( ( rule__LoopAction__BodyActionsAssignment_3_2 ) )
            // InternalCBS.g:6652:2: ( rule__LoopAction__BodyActionsAssignment_3_2 )
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_3_2()); 
            // InternalCBS.g:6653:2: ( rule__LoopAction__BodyActionsAssignment_3_2 )
            // InternalCBS.g:6653:3: rule__LoopAction__BodyActionsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__BodyActionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_3_2()); 

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
    // $ANTLR end "rule__LoopAction__Group_3__2__Impl"


    // $ANTLR start "rule__LoopAction__Group_3__3"
    // InternalCBS.g:6661:1: rule__LoopAction__Group_3__3 : rule__LoopAction__Group_3__3__Impl rule__LoopAction__Group_3__4 ;
    public final void rule__LoopAction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6665:1: ( rule__LoopAction__Group_3__3__Impl rule__LoopAction__Group_3__4 )
            // InternalCBS.g:6666:2: rule__LoopAction__Group_3__3__Impl rule__LoopAction__Group_3__4
            {
            pushFollow(FOLLOW_9);
            rule__LoopAction__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_3__4();

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
    // $ANTLR end "rule__LoopAction__Group_3__3"


    // $ANTLR start "rule__LoopAction__Group_3__3__Impl"
    // InternalCBS.g:6673:1: rule__LoopAction__Group_3__3__Impl : ( ( rule__LoopAction__Group_3_3__0 )* ) ;
    public final void rule__LoopAction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6677:1: ( ( ( rule__LoopAction__Group_3_3__0 )* ) )
            // InternalCBS.g:6678:1: ( ( rule__LoopAction__Group_3_3__0 )* )
            {
            // InternalCBS.g:6678:1: ( ( rule__LoopAction__Group_3_3__0 )* )
            // InternalCBS.g:6679:2: ( rule__LoopAction__Group_3_3__0 )*
            {
             before(grammarAccess.getLoopActionAccess().getGroup_3_3()); 
            // InternalCBS.g:6680:2: ( rule__LoopAction__Group_3_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCBS.g:6680:3: rule__LoopAction__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LoopAction__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getLoopActionAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__LoopAction__Group_3__3__Impl"


    // $ANTLR start "rule__LoopAction__Group_3__4"
    // InternalCBS.g:6688:1: rule__LoopAction__Group_3__4 : rule__LoopAction__Group_3__4__Impl ;
    public final void rule__LoopAction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6692:1: ( rule__LoopAction__Group_3__4__Impl )
            // InternalCBS.g:6693:2: rule__LoopAction__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_3__4__Impl();

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
    // $ANTLR end "rule__LoopAction__Group_3__4"


    // $ANTLR start "rule__LoopAction__Group_3__4__Impl"
    // InternalCBS.g:6699:1: rule__LoopAction__Group_3__4__Impl : ( '}' ) ;
    public final void rule__LoopAction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6703:1: ( ( '}' ) )
            // InternalCBS.g:6704:1: ( '}' )
            {
            // InternalCBS.g:6704:1: ( '}' )
            // InternalCBS.g:6705:2: '}'
            {
             before(grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__LoopAction__Group_3__4__Impl"


    // $ANTLR start "rule__LoopAction__Group_3_3__0"
    // InternalCBS.g:6715:1: rule__LoopAction__Group_3_3__0 : rule__LoopAction__Group_3_3__0__Impl rule__LoopAction__Group_3_3__1 ;
    public final void rule__LoopAction__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6719:1: ( rule__LoopAction__Group_3_3__0__Impl rule__LoopAction__Group_3_3__1 )
            // InternalCBS.g:6720:2: rule__LoopAction__Group_3_3__0__Impl rule__LoopAction__Group_3_3__1
            {
            pushFollow(FOLLOW_40);
            rule__LoopAction__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_3_3__1();

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
    // $ANTLR end "rule__LoopAction__Group_3_3__0"


    // $ANTLR start "rule__LoopAction__Group_3_3__0__Impl"
    // InternalCBS.g:6727:1: rule__LoopAction__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__LoopAction__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6731:1: ( ( ',' ) )
            // InternalCBS.g:6732:1: ( ',' )
            {
            // InternalCBS.g:6732:1: ( ',' )
            // InternalCBS.g:6733:2: ','
            {
             before(grammarAccess.getLoopActionAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__LoopAction__Group_3_3__0__Impl"


    // $ANTLR start "rule__LoopAction__Group_3_3__1"
    // InternalCBS.g:6742:1: rule__LoopAction__Group_3_3__1 : rule__LoopAction__Group_3_3__1__Impl ;
    public final void rule__LoopAction__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6746:1: ( rule__LoopAction__Group_3_3__1__Impl )
            // InternalCBS.g:6747:2: rule__LoopAction__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__LoopAction__Group_3_3__1"


    // $ANTLR start "rule__LoopAction__Group_3_3__1__Impl"
    // InternalCBS.g:6753:1: rule__LoopAction__Group_3_3__1__Impl : ( ( rule__LoopAction__BodyActionsAssignment_3_3_1 ) ) ;
    public final void rule__LoopAction__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6757:1: ( ( ( rule__LoopAction__BodyActionsAssignment_3_3_1 ) ) )
            // InternalCBS.g:6758:1: ( ( rule__LoopAction__BodyActionsAssignment_3_3_1 ) )
            {
            // InternalCBS.g:6758:1: ( ( rule__LoopAction__BodyActionsAssignment_3_3_1 ) )
            // InternalCBS.g:6759:2: ( rule__LoopAction__BodyActionsAssignment_3_3_1 )
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_3_3_1()); 
            // InternalCBS.g:6760:2: ( rule__LoopAction__BodyActionsAssignment_3_3_1 )
            // InternalCBS.g:6760:3: rule__LoopAction__BodyActionsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__BodyActionsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__LoopAction__Group_3_3__1__Impl"


    // $ANTLR start "rule__BranchTransition__Group__0"
    // InternalCBS.g:6769:1: rule__BranchTransition__Group__0 : rule__BranchTransition__Group__0__Impl rule__BranchTransition__Group__1 ;
    public final void rule__BranchTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6773:1: ( rule__BranchTransition__Group__0__Impl rule__BranchTransition__Group__1 )
            // InternalCBS.g:6774:2: rule__BranchTransition__Group__0__Impl rule__BranchTransition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BranchTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group__1();

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
    // $ANTLR end "rule__BranchTransition__Group__0"


    // $ANTLR start "rule__BranchTransition__Group__0__Impl"
    // InternalCBS.g:6781:1: rule__BranchTransition__Group__0__Impl : ( 'BranchTransition' ) ;
    public final void rule__BranchTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6785:1: ( ( 'BranchTransition' ) )
            // InternalCBS.g:6786:1: ( 'BranchTransition' )
            {
            // InternalCBS.g:6786:1: ( 'BranchTransition' )
            // InternalCBS.g:6787:2: 'BranchTransition'
            {
             before(grammarAccess.getBranchTransitionAccess().getBranchTransitionKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getBranchTransitionAccess().getBranchTransitionKeyword_0()); 

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
    // $ANTLR end "rule__BranchTransition__Group__0__Impl"


    // $ANTLR start "rule__BranchTransition__Group__1"
    // InternalCBS.g:6796:1: rule__BranchTransition__Group__1 : rule__BranchTransition__Group__1__Impl rule__BranchTransition__Group__2 ;
    public final void rule__BranchTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6800:1: ( rule__BranchTransition__Group__1__Impl rule__BranchTransition__Group__2 )
            // InternalCBS.g:6801:2: rule__BranchTransition__Group__1__Impl rule__BranchTransition__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__BranchTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group__2();

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
    // $ANTLR end "rule__BranchTransition__Group__1"


    // $ANTLR start "rule__BranchTransition__Group__1__Impl"
    // InternalCBS.g:6808:1: rule__BranchTransition__Group__1__Impl : ( '{' ) ;
    public final void rule__BranchTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6812:1: ( ( '{' ) )
            // InternalCBS.g:6813:1: ( '{' )
            {
            // InternalCBS.g:6813:1: ( '{' )
            // InternalCBS.g:6814:2: '{'
            {
             before(grammarAccess.getBranchTransitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBranchTransitionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__BranchTransition__Group__1__Impl"


    // $ANTLR start "rule__BranchTransition__Group__2"
    // InternalCBS.g:6823:1: rule__BranchTransition__Group__2 : rule__BranchTransition__Group__2__Impl rule__BranchTransition__Group__3 ;
    public final void rule__BranchTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6827:1: ( rule__BranchTransition__Group__2__Impl rule__BranchTransition__Group__3 )
            // InternalCBS.g:6828:2: rule__BranchTransition__Group__2__Impl rule__BranchTransition__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__BranchTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group__3();

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
    // $ANTLR end "rule__BranchTransition__Group__2"


    // $ANTLR start "rule__BranchTransition__Group__2__Impl"
    // InternalCBS.g:6835:1: rule__BranchTransition__Group__2__Impl : ( ( rule__BranchTransition__Group_2__0 )? ) ;
    public final void rule__BranchTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6839:1: ( ( ( rule__BranchTransition__Group_2__0 )? ) )
            // InternalCBS.g:6840:1: ( ( rule__BranchTransition__Group_2__0 )? )
            {
            // InternalCBS.g:6840:1: ( ( rule__BranchTransition__Group_2__0 )? )
            // InternalCBS.g:6841:2: ( rule__BranchTransition__Group_2__0 )?
            {
             before(grammarAccess.getBranchTransitionAccess().getGroup_2()); 
            // InternalCBS.g:6842:2: ( rule__BranchTransition__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==71) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCBS.g:6842:3: rule__BranchTransition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BranchTransition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchTransitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BranchTransition__Group__2__Impl"


    // $ANTLR start "rule__BranchTransition__Group__3"
    // InternalCBS.g:6850:1: rule__BranchTransition__Group__3 : rule__BranchTransition__Group__3__Impl rule__BranchTransition__Group__4 ;
    public final void rule__BranchTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6854:1: ( rule__BranchTransition__Group__3__Impl rule__BranchTransition__Group__4 )
            // InternalCBS.g:6855:2: rule__BranchTransition__Group__3__Impl rule__BranchTransition__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__BranchTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group__4();

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
    // $ANTLR end "rule__BranchTransition__Group__3"


    // $ANTLR start "rule__BranchTransition__Group__3__Impl"
    // InternalCBS.g:6862:1: rule__BranchTransition__Group__3__Impl : ( 'action' ) ;
    public final void rule__BranchTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6866:1: ( ( 'action' ) )
            // InternalCBS.g:6867:1: ( 'action' )
            {
            // InternalCBS.g:6867:1: ( 'action' )
            // InternalCBS.g:6868:2: 'action'
            {
             before(grammarAccess.getBranchTransitionAccess().getActionKeyword_3()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getBranchTransitionAccess().getActionKeyword_3()); 

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
    // $ANTLR end "rule__BranchTransition__Group__3__Impl"


    // $ANTLR start "rule__BranchTransition__Group__4"
    // InternalCBS.g:6877:1: rule__BranchTransition__Group__4 : rule__BranchTransition__Group__4__Impl rule__BranchTransition__Group__5 ;
    public final void rule__BranchTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6881:1: ( rule__BranchTransition__Group__4__Impl rule__BranchTransition__Group__5 )
            // InternalCBS.g:6882:2: rule__BranchTransition__Group__4__Impl rule__BranchTransition__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__BranchTransition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group__5();

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
    // $ANTLR end "rule__BranchTransition__Group__4"


    // $ANTLR start "rule__BranchTransition__Group__4__Impl"
    // InternalCBS.g:6889:1: rule__BranchTransition__Group__4__Impl : ( ( rule__BranchTransition__ActionAssignment_4 ) ) ;
    public final void rule__BranchTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6893:1: ( ( ( rule__BranchTransition__ActionAssignment_4 ) ) )
            // InternalCBS.g:6894:1: ( ( rule__BranchTransition__ActionAssignment_4 ) )
            {
            // InternalCBS.g:6894:1: ( ( rule__BranchTransition__ActionAssignment_4 ) )
            // InternalCBS.g:6895:2: ( rule__BranchTransition__ActionAssignment_4 )
            {
             before(grammarAccess.getBranchTransitionAccess().getActionAssignment_4()); 
            // InternalCBS.g:6896:2: ( rule__BranchTransition__ActionAssignment_4 )
            // InternalCBS.g:6896:3: rule__BranchTransition__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBranchTransitionAccess().getActionAssignment_4()); 

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
    // $ANTLR end "rule__BranchTransition__Group__4__Impl"


    // $ANTLR start "rule__BranchTransition__Group__5"
    // InternalCBS.g:6904:1: rule__BranchTransition__Group__5 : rule__BranchTransition__Group__5__Impl ;
    public final void rule__BranchTransition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6908:1: ( rule__BranchTransition__Group__5__Impl )
            // InternalCBS.g:6909:2: rule__BranchTransition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group__5__Impl();

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
    // $ANTLR end "rule__BranchTransition__Group__5"


    // $ANTLR start "rule__BranchTransition__Group__5__Impl"
    // InternalCBS.g:6915:1: rule__BranchTransition__Group__5__Impl : ( '}' ) ;
    public final void rule__BranchTransition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6919:1: ( ( '}' ) )
            // InternalCBS.g:6920:1: ( '}' )
            {
            // InternalCBS.g:6920:1: ( '}' )
            // InternalCBS.g:6921:2: '}'
            {
             before(grammarAccess.getBranchTransitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchTransitionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__BranchTransition__Group__5__Impl"


    // $ANTLR start "rule__BranchTransition__Group_2__0"
    // InternalCBS.g:6931:1: rule__BranchTransition__Group_2__0 : rule__BranchTransition__Group_2__0__Impl rule__BranchTransition__Group_2__1 ;
    public final void rule__BranchTransition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6935:1: ( rule__BranchTransition__Group_2__0__Impl rule__BranchTransition__Group_2__1 )
            // InternalCBS.g:6936:2: rule__BranchTransition__Group_2__0__Impl rule__BranchTransition__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__BranchTransition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group_2__1();

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
    // $ANTLR end "rule__BranchTransition__Group_2__0"


    // $ANTLR start "rule__BranchTransition__Group_2__0__Impl"
    // InternalCBS.g:6943:1: rule__BranchTransition__Group_2__0__Impl : ( 'branchCondition' ) ;
    public final void rule__BranchTransition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6947:1: ( ( 'branchCondition' ) )
            // InternalCBS.g:6948:1: ( 'branchCondition' )
            {
            // InternalCBS.g:6948:1: ( 'branchCondition' )
            // InternalCBS.g:6949:2: 'branchCondition'
            {
             before(grammarAccess.getBranchTransitionAccess().getBranchConditionKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getBranchTransitionAccess().getBranchConditionKeyword_2_0()); 

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
    // $ANTLR end "rule__BranchTransition__Group_2__0__Impl"


    // $ANTLR start "rule__BranchTransition__Group_2__1"
    // InternalCBS.g:6958:1: rule__BranchTransition__Group_2__1 : rule__BranchTransition__Group_2__1__Impl ;
    public final void rule__BranchTransition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6962:1: ( rule__BranchTransition__Group_2__1__Impl )
            // InternalCBS.g:6963:2: rule__BranchTransition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group_2__1__Impl();

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
    // $ANTLR end "rule__BranchTransition__Group_2__1"


    // $ANTLR start "rule__BranchTransition__Group_2__1__Impl"
    // InternalCBS.g:6969:1: rule__BranchTransition__Group_2__1__Impl : ( ( rule__BranchTransition__BranchConditionAssignment_2_1 ) ) ;
    public final void rule__BranchTransition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6973:1: ( ( ( rule__BranchTransition__BranchConditionAssignment_2_1 ) ) )
            // InternalCBS.g:6974:1: ( ( rule__BranchTransition__BranchConditionAssignment_2_1 ) )
            {
            // InternalCBS.g:6974:1: ( ( rule__BranchTransition__BranchConditionAssignment_2_1 ) )
            // InternalCBS.g:6975:2: ( rule__BranchTransition__BranchConditionAssignment_2_1 )
            {
             before(grammarAccess.getBranchTransitionAccess().getBranchConditionAssignment_2_1()); 
            // InternalCBS.g:6976:2: ( rule__BranchTransition__BranchConditionAssignment_2_1 )
            // InternalCBS.g:6976:3: rule__BranchTransition__BranchConditionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__BranchConditionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchTransitionAccess().getBranchConditionAssignment_2_1()); 

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
    // $ANTLR end "rule__BranchTransition__Group_2__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group__0"
    // InternalCBS.g:6985:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6989:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalCBS.g:6990:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AllocationContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__1();

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
    // $ANTLR end "rule__AllocationContext__Group__0"


    // $ANTLR start "rule__AllocationContext__Group__0__Impl"
    // InternalCBS.g:6997:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7001:1: ( ( 'AllocationContext' ) )
            // InternalCBS.g:7002:1: ( 'AllocationContext' )
            {
            // InternalCBS.g:7002:1: ( 'AllocationContext' )
            // InternalCBS.g:7003:2: 'AllocationContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 

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
    // $ANTLR end "rule__AllocationContext__Group__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group__1"
    // InternalCBS.g:7012:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7016:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalCBS.g:7017:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__AllocationContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__2();

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
    // $ANTLR end "rule__AllocationContext__Group__1"


    // $ANTLR start "rule__AllocationContext__Group__1__Impl"
    // InternalCBS.g:7024:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7028:1: ( ( '{' ) )
            // InternalCBS.g:7029:1: ( '{' )
            {
            // InternalCBS.g:7029:1: ( '{' )
            // InternalCBS.g:7030:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__AllocationContext__Group__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group__2"
    // InternalCBS.g:7039:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7043:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalCBS.g:7044:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__AllocationContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__3();

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
    // $ANTLR end "rule__AllocationContext__Group__2"


    // $ANTLR start "rule__AllocationContext__Group__2__Impl"
    // InternalCBS.g:7051:1: rule__AllocationContext__Group__2__Impl : ( 'container' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7055:1: ( ( 'container' ) )
            // InternalCBS.g:7056:1: ( 'container' )
            {
            // InternalCBS.g:7056:1: ( 'container' )
            // InternalCBS.g:7057:2: 'container'
            {
             before(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 

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
    // $ANTLR end "rule__AllocationContext__Group__2__Impl"


    // $ANTLR start "rule__AllocationContext__Group__3"
    // InternalCBS.g:7066:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7070:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalCBS.g:7071:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__AllocationContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__4();

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
    // $ANTLR end "rule__AllocationContext__Group__3"


    // $ANTLR start "rule__AllocationContext__Group__3__Impl"
    // InternalCBS.g:7078:1: rule__AllocationContext__Group__3__Impl : ( ( rule__AllocationContext__ContainerAssignment_3 ) ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7082:1: ( ( ( rule__AllocationContext__ContainerAssignment_3 ) ) )
            // InternalCBS.g:7083:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            {
            // InternalCBS.g:7083:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            // InternalCBS.g:7084:2: ( rule__AllocationContext__ContainerAssignment_3 )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 
            // InternalCBS.g:7085:2: ( rule__AllocationContext__ContainerAssignment_3 )
            // InternalCBS.g:7085:3: rule__AllocationContext__ContainerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__ContainerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 

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
    // $ANTLR end "rule__AllocationContext__Group__3__Impl"


    // $ANTLR start "rule__AllocationContext__Group__4"
    // InternalCBS.g:7093:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7097:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalCBS.g:7098:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__AllocationContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__5();

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
    // $ANTLR end "rule__AllocationContext__Group__4"


    // $ANTLR start "rule__AllocationContext__Group__4__Impl"
    // InternalCBS.g:7105:1: rule__AllocationContext__Group__4__Impl : ( 'allocates' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7109:1: ( ( 'allocates' ) )
            // InternalCBS.g:7110:1: ( 'allocates' )
            {
            // InternalCBS.g:7110:1: ( 'allocates' )
            // InternalCBS.g:7111:2: 'allocates'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatesKeyword_4()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAllocatesKeyword_4()); 

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
    // $ANTLR end "rule__AllocationContext__Group__4__Impl"


    // $ANTLR start "rule__AllocationContext__Group__5"
    // InternalCBS.g:7120:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7124:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalCBS.g:7125:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__AllocationContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6();

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
    // $ANTLR end "rule__AllocationContext__Group__5"


    // $ANTLR start "rule__AllocationContext__Group__5__Impl"
    // InternalCBS.g:7132:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AllocatesAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7136:1: ( ( ( rule__AllocationContext__AllocatesAssignment_5 ) ) )
            // InternalCBS.g:7137:1: ( ( rule__AllocationContext__AllocatesAssignment_5 ) )
            {
            // InternalCBS.g:7137:1: ( ( rule__AllocationContext__AllocatesAssignment_5 ) )
            // InternalCBS.g:7138:2: ( rule__AllocationContext__AllocatesAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatesAssignment_5()); 
            // InternalCBS.g:7139:2: ( rule__AllocationContext__AllocatesAssignment_5 )
            // InternalCBS.g:7139:3: rule__AllocationContext__AllocatesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__AllocatesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getAllocatesAssignment_5()); 

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
    // $ANTLR end "rule__AllocationContext__Group__5__Impl"


    // $ANTLR start "rule__AllocationContext__Group__6"
    // InternalCBS.g:7147:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7151:1: ( rule__AllocationContext__Group__6__Impl )
            // InternalCBS.g:7152:2: rule__AllocationContext__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6__Impl();

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
    // $ANTLR end "rule__AllocationContext__Group__6"


    // $ANTLR start "rule__AllocationContext__Group__6__Impl"
    // InternalCBS.g:7158:1: rule__AllocationContext__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7162:1: ( ( '}' ) )
            // InternalCBS.g:7163:1: ( '}' )
            {
            // InternalCBS.g:7163:1: ( '}' )
            // InternalCBS.g:7164:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__AllocationContext__Group__6__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalCBS.g:7174:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7178:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalCBS.g:7179:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalCBS.g:7186:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7190:1: ( ( () ) )
            // InternalCBS.g:7191:1: ( () )
            {
            // InternalCBS.g:7191:1: ( () )
            // InternalCBS.g:7192:2: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // InternalCBS.g:7193:2: ()
            // InternalCBS.g:7193:3: 
            {
            }

             after(grammarAccess.getContainerAccess().getContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalCBS.g:7201:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7205:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalCBS.g:7206:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalCBS.g:7213:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7217:1: ( ( 'Container' ) )
            // InternalCBS.g:7218:1: ( 'Container' )
            {
            // InternalCBS.g:7218:1: ( 'Container' )
            // InternalCBS.g:7219:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

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
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalCBS.g:7228:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7232:1: ( rule__Container__Group__2__Impl )
            // InternalCBS.g:7233:2: rule__Container__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__2__Impl();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalCBS.g:7239:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7243:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalCBS.g:7244:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalCBS.g:7244:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalCBS.g:7245:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalCBS.g:7246:2: ( rule__Container__NameAssignment_2 )
            // InternalCBS.g:7246:3: rule__Container__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Linker__Group__0"
    // InternalCBS.g:7255:1: rule__Linker__Group__0 : rule__Linker__Group__0__Impl rule__Linker__Group__1 ;
    public final void rule__Linker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7259:1: ( rule__Linker__Group__0__Impl rule__Linker__Group__1 )
            // InternalCBS.g:7260:2: rule__Linker__Group__0__Impl rule__Linker__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Linker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group__1();

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
    // $ANTLR end "rule__Linker__Group__0"


    // $ANTLR start "rule__Linker__Group__0__Impl"
    // InternalCBS.g:7267:1: rule__Linker__Group__0__Impl : ( 'Linker' ) ;
    public final void rule__Linker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7271:1: ( ( 'Linker' ) )
            // InternalCBS.g:7272:1: ( 'Linker' )
            {
            // InternalCBS.g:7272:1: ( 'Linker' )
            // InternalCBS.g:7273:2: 'Linker'
            {
             before(grammarAccess.getLinkerAccess().getLinkerKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getLinkerAccess().getLinkerKeyword_0()); 

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
    // $ANTLR end "rule__Linker__Group__0__Impl"


    // $ANTLR start "rule__Linker__Group__1"
    // InternalCBS.g:7282:1: rule__Linker__Group__1 : rule__Linker__Group__1__Impl rule__Linker__Group__2 ;
    public final void rule__Linker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7286:1: ( rule__Linker__Group__1__Impl rule__Linker__Group__2 )
            // InternalCBS.g:7287:2: rule__Linker__Group__1__Impl rule__Linker__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Linker__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group__2();

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
    // $ANTLR end "rule__Linker__Group__1"


    // $ANTLR start "rule__Linker__Group__1__Impl"
    // InternalCBS.g:7294:1: rule__Linker__Group__1__Impl : ( ( rule__Linker__NameAssignment_1 ) ) ;
    public final void rule__Linker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7298:1: ( ( ( rule__Linker__NameAssignment_1 ) ) )
            // InternalCBS.g:7299:1: ( ( rule__Linker__NameAssignment_1 ) )
            {
            // InternalCBS.g:7299:1: ( ( rule__Linker__NameAssignment_1 ) )
            // InternalCBS.g:7300:2: ( rule__Linker__NameAssignment_1 )
            {
             before(grammarAccess.getLinkerAccess().getNameAssignment_1()); 
            // InternalCBS.g:7301:2: ( rule__Linker__NameAssignment_1 )
            // InternalCBS.g:7301:3: rule__Linker__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Linker__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Linker__Group__1__Impl"


    // $ANTLR start "rule__Linker__Group__2"
    // InternalCBS.g:7309:1: rule__Linker__Group__2 : rule__Linker__Group__2__Impl rule__Linker__Group__3 ;
    public final void rule__Linker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7313:1: ( rule__Linker__Group__2__Impl rule__Linker__Group__3 )
            // InternalCBS.g:7314:2: rule__Linker__Group__2__Impl rule__Linker__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__Linker__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group__3();

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
    // $ANTLR end "rule__Linker__Group__2"


    // $ANTLR start "rule__Linker__Group__2__Impl"
    // InternalCBS.g:7321:1: rule__Linker__Group__2__Impl : ( '{' ) ;
    public final void rule__Linker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7325:1: ( ( '{' ) )
            // InternalCBS.g:7326:1: ( '{' )
            {
            // InternalCBS.g:7326:1: ( '{' )
            // InternalCBS.g:7327:2: '{'
            {
             before(grammarAccess.getLinkerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLinkerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Linker__Group__2__Impl"


    // $ANTLR start "rule__Linker__Group__3"
    // InternalCBS.g:7336:1: rule__Linker__Group__3 : rule__Linker__Group__3__Impl rule__Linker__Group__4 ;
    public final void rule__Linker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7340:1: ( rule__Linker__Group__3__Impl rule__Linker__Group__4 )
            // InternalCBS.g:7341:2: rule__Linker__Group__3__Impl rule__Linker__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Linker__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group__4();

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
    // $ANTLR end "rule__Linker__Group__3"


    // $ANTLR start "rule__Linker__Group__3__Impl"
    // InternalCBS.g:7348:1: rule__Linker__Group__3__Impl : ( 'links' ) ;
    public final void rule__Linker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7352:1: ( ( 'links' ) )
            // InternalCBS.g:7353:1: ( 'links' )
            {
            // InternalCBS.g:7353:1: ( 'links' )
            // InternalCBS.g:7354:2: 'links'
            {
             before(grammarAccess.getLinkerAccess().getLinksKeyword_3()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getLinkerAccess().getLinksKeyword_3()); 

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
    // $ANTLR end "rule__Linker__Group__3__Impl"


    // $ANTLR start "rule__Linker__Group__4"
    // InternalCBS.g:7363:1: rule__Linker__Group__4 : rule__Linker__Group__4__Impl rule__Linker__Group__5 ;
    public final void rule__Linker__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7367:1: ( rule__Linker__Group__4__Impl rule__Linker__Group__5 )
            // InternalCBS.g:7368:2: rule__Linker__Group__4__Impl rule__Linker__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Linker__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group__5();

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
    // $ANTLR end "rule__Linker__Group__4"


    // $ANTLR start "rule__Linker__Group__4__Impl"
    // InternalCBS.g:7375:1: rule__Linker__Group__4__Impl : ( '(' ) ;
    public final void rule__Linker__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7379:1: ( ( '(' ) )
            // InternalCBS.g:7380:1: ( '(' )
            {
            // InternalCBS.g:7380:1: ( '(' )
            // InternalCBS.g:7381:2: '('
            {
             before(grammarAccess.getLinkerAccess().getLeftParenthesisKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLinkerAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Linker__Group__4__Impl"


    // $ANTLR start "rule__Linker__Group__5"
    // InternalCBS.g:7390:1: rule__Linker__Group__5 : rule__Linker__Group__5__Impl rule__Linker__Group__6 ;
    public final void rule__Linker__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7394:1: ( rule__Linker__Group__5__Impl rule__Linker__Group__6 )
            // InternalCBS.g:7395:2: rule__Linker__Group__5__Impl rule__Linker__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Linker__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group__6();

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
    // $ANTLR end "rule__Linker__Group__5"


    // $ANTLR start "rule__Linker__Group__5__Impl"
    // InternalCBS.g:7402:1: rule__Linker__Group__5__Impl : ( ( rule__Linker__LinksAssignment_5 ) ) ;
    public final void rule__Linker__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7406:1: ( ( ( rule__Linker__LinksAssignment_5 ) ) )
            // InternalCBS.g:7407:1: ( ( rule__Linker__LinksAssignment_5 ) )
            {
            // InternalCBS.g:7407:1: ( ( rule__Linker__LinksAssignment_5 ) )
            // InternalCBS.g:7408:2: ( rule__Linker__LinksAssignment_5 )
            {
             before(grammarAccess.getLinkerAccess().getLinksAssignment_5()); 
            // InternalCBS.g:7409:2: ( rule__Linker__LinksAssignment_5 )
            // InternalCBS.g:7409:3: rule__Linker__LinksAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Linker__LinksAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkerAccess().getLinksAssignment_5()); 

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
    // $ANTLR end "rule__Linker__Group__5__Impl"


    // $ANTLR start "rule__Linker__Group__6"
    // InternalCBS.g:7417:1: rule__Linker__Group__6 : rule__Linker__Group__6__Impl rule__Linker__Group__7 ;
    public final void rule__Linker__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7421:1: ( rule__Linker__Group__6__Impl rule__Linker__Group__7 )
            // InternalCBS.g:7422:2: rule__Linker__Group__6__Impl rule__Linker__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Linker__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group__7();

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
    // $ANTLR end "rule__Linker__Group__6"


    // $ANTLR start "rule__Linker__Group__6__Impl"
    // InternalCBS.g:7429:1: rule__Linker__Group__6__Impl : ( ( rule__Linker__Group_6__0 )* ) ;
    public final void rule__Linker__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7433:1: ( ( ( rule__Linker__Group_6__0 )* ) )
            // InternalCBS.g:7434:1: ( ( rule__Linker__Group_6__0 )* )
            {
            // InternalCBS.g:7434:1: ( ( rule__Linker__Group_6__0 )* )
            // InternalCBS.g:7435:2: ( rule__Linker__Group_6__0 )*
            {
             before(grammarAccess.getLinkerAccess().getGroup_6()); 
            // InternalCBS.g:7436:2: ( rule__Linker__Group_6__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==24) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCBS.g:7436:3: rule__Linker__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Linker__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getLinkerAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Linker__Group__6__Impl"


    // $ANTLR start "rule__Linker__Group__7"
    // InternalCBS.g:7444:1: rule__Linker__Group__7 : rule__Linker__Group__7__Impl rule__Linker__Group__8 ;
    public final void rule__Linker__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7448:1: ( rule__Linker__Group__7__Impl rule__Linker__Group__8 )
            // InternalCBS.g:7449:2: rule__Linker__Group__7__Impl rule__Linker__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Linker__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group__8();

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
    // $ANTLR end "rule__Linker__Group__7"


    // $ANTLR start "rule__Linker__Group__7__Impl"
    // InternalCBS.g:7456:1: rule__Linker__Group__7__Impl : ( ')' ) ;
    public final void rule__Linker__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7460:1: ( ( ')' ) )
            // InternalCBS.g:7461:1: ( ')' )
            {
            // InternalCBS.g:7461:1: ( ')' )
            // InternalCBS.g:7462:2: ')'
            {
             before(grammarAccess.getLinkerAccess().getRightParenthesisKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLinkerAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Linker__Group__7__Impl"


    // $ANTLR start "rule__Linker__Group__8"
    // InternalCBS.g:7471:1: rule__Linker__Group__8 : rule__Linker__Group__8__Impl ;
    public final void rule__Linker__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7475:1: ( rule__Linker__Group__8__Impl )
            // InternalCBS.g:7476:2: rule__Linker__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Linker__Group__8__Impl();

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
    // $ANTLR end "rule__Linker__Group__8"


    // $ANTLR start "rule__Linker__Group__8__Impl"
    // InternalCBS.g:7482:1: rule__Linker__Group__8__Impl : ( '}' ) ;
    public final void rule__Linker__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7486:1: ( ( '}' ) )
            // InternalCBS.g:7487:1: ( '}' )
            {
            // InternalCBS.g:7487:1: ( '}' )
            // InternalCBS.g:7488:2: '}'
            {
             before(grammarAccess.getLinkerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLinkerAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Linker__Group__8__Impl"


    // $ANTLR start "rule__Linker__Group_6__0"
    // InternalCBS.g:7498:1: rule__Linker__Group_6__0 : rule__Linker__Group_6__0__Impl rule__Linker__Group_6__1 ;
    public final void rule__Linker__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7502:1: ( rule__Linker__Group_6__0__Impl rule__Linker__Group_6__1 )
            // InternalCBS.g:7503:2: rule__Linker__Group_6__0__Impl rule__Linker__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Linker__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linker__Group_6__1();

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
    // $ANTLR end "rule__Linker__Group_6__0"


    // $ANTLR start "rule__Linker__Group_6__0__Impl"
    // InternalCBS.g:7510:1: rule__Linker__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Linker__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7514:1: ( ( ',' ) )
            // InternalCBS.g:7515:1: ( ',' )
            {
            // InternalCBS.g:7515:1: ( ',' )
            // InternalCBS.g:7516:2: ','
            {
             before(grammarAccess.getLinkerAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLinkerAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Linker__Group_6__0__Impl"


    // $ANTLR start "rule__Linker__Group_6__1"
    // InternalCBS.g:7525:1: rule__Linker__Group_6__1 : rule__Linker__Group_6__1__Impl ;
    public final void rule__Linker__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7529:1: ( rule__Linker__Group_6__1__Impl )
            // InternalCBS.g:7530:2: rule__Linker__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Linker__Group_6__1__Impl();

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
    // $ANTLR end "rule__Linker__Group_6__1"


    // $ANTLR start "rule__Linker__Group_6__1__Impl"
    // InternalCBS.g:7536:1: rule__Linker__Group_6__1__Impl : ( ( rule__Linker__LinksAssignment_6_1 ) ) ;
    public final void rule__Linker__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7540:1: ( ( ( rule__Linker__LinksAssignment_6_1 ) ) )
            // InternalCBS.g:7541:1: ( ( rule__Linker__LinksAssignment_6_1 ) )
            {
            // InternalCBS.g:7541:1: ( ( rule__Linker__LinksAssignment_6_1 ) )
            // InternalCBS.g:7542:2: ( rule__Linker__LinksAssignment_6_1 )
            {
             before(grammarAccess.getLinkerAccess().getLinksAssignment_6_1()); 
            // InternalCBS.g:7543:2: ( rule__Linker__LinksAssignment_6_1 )
            // InternalCBS.g:7543:3: rule__Linker__LinksAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Linker__LinksAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkerAccess().getLinksAssignment_6_1()); 

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
    // $ANTLR end "rule__Linker__Group_6__1__Impl"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalCBS.g:7552:1: rule__System__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7556:1: ( ( ruleEString ) )
            // InternalCBS.g:7557:2: ( ruleEString )
            {
            // InternalCBS.g:7557:2: ( ruleEString )
            // InternalCBS.g:7558:3: ruleEString
            {
             before(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ChildContextsAssignment_3_2"
    // InternalCBS.g:7567:1: rule__System__ChildContextsAssignment_3_2 : ( ruleAssemblyContext ) ;
    public final void rule__System__ChildContextsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7571:1: ( ( ruleAssemblyContext ) )
            // InternalCBS.g:7572:2: ( ruleAssemblyContext )
            {
            // InternalCBS.g:7572:2: ( ruleAssemblyContext )
            // InternalCBS.g:7573:3: ruleAssemblyContext
            {
             before(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__System__ChildContextsAssignment_3_2"


    // $ANTLR start "rule__System__ChildContextsAssignment_3_3_1"
    // InternalCBS.g:7582:1: rule__System__ChildContextsAssignment_3_3_1 : ( ruleAssemblyContext ) ;
    public final void rule__System__ChildContextsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7586:1: ( ( ruleAssemblyContext ) )
            // InternalCBS.g:7587:2: ( ruleAssemblyContext )
            {
            // InternalCBS.g:7587:2: ( ruleAssemblyContext )
            // InternalCBS.g:7588:3: ruleAssemblyContext
            {
             before(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getChildContextsAssemblyContextParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__System__ChildContextsAssignment_3_3_1"


    // $ANTLR start "rule__System__AssemblyConnectorsAssignment_4_2"
    // InternalCBS.g:7597:1: rule__System__AssemblyConnectorsAssignment_4_2 : ( ruleAssemblyConnector ) ;
    public final void rule__System__AssemblyConnectorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7601:1: ( ( ruleAssemblyConnector ) )
            // InternalCBS.g:7602:2: ( ruleAssemblyConnector )
            {
            // InternalCBS.g:7602:2: ( ruleAssemblyConnector )
            // InternalCBS.g:7603:3: ruleAssemblyConnector
            {
             before(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__System__AssemblyConnectorsAssignment_4_2"


    // $ANTLR start "rule__System__AssemblyConnectorsAssignment_4_3_1"
    // InternalCBS.g:7612:1: rule__System__AssemblyConnectorsAssignment_4_3_1 : ( ruleAssemblyConnector ) ;
    public final void rule__System__AssemblyConnectorsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7616:1: ( ( ruleAssemblyConnector ) )
            // InternalCBS.g:7617:2: ( ruleAssemblyConnector )
            {
            // InternalCBS.g:7617:2: ( ruleAssemblyConnector )
            // InternalCBS.g:7618:3: ruleAssemblyConnector
            {
             before(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__System__AssemblyConnectorsAssignment_4_3_1"


    // $ANTLR start "rule__System__RequiredDelegationConnectorsAssignment_5_2"
    // InternalCBS.g:7627:1: rule__System__RequiredDelegationConnectorsAssignment_5_2 : ( ruleRequiredDelegationConnector ) ;
    public final void rule__System__RequiredDelegationConnectorsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7631:1: ( ( ruleRequiredDelegationConnector ) )
            // InternalCBS.g:7632:2: ( ruleRequiredDelegationConnector )
            {
            // InternalCBS.g:7632:2: ( ruleRequiredDelegationConnector )
            // InternalCBS.g:7633:3: ruleRequiredDelegationConnector
            {
             before(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredDelegationConnector();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__System__RequiredDelegationConnectorsAssignment_5_2"


    // $ANTLR start "rule__System__RequiredDelegationConnectorsAssignment_5_3_1"
    // InternalCBS.g:7642:1: rule__System__RequiredDelegationConnectorsAssignment_5_3_1 : ( ruleRequiredDelegationConnector ) ;
    public final void rule__System__RequiredDelegationConnectorsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7646:1: ( ( ruleRequiredDelegationConnector ) )
            // InternalCBS.g:7647:2: ( ruleRequiredDelegationConnector )
            {
            // InternalCBS.g:7647:2: ( ruleRequiredDelegationConnector )
            // InternalCBS.g:7648:3: ruleRequiredDelegationConnector
            {
             before(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredDelegationConnector();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsRequiredDelegationConnectorParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__System__RequiredDelegationConnectorsAssignment_5_3_1"


    // $ANTLR start "rule__System__ProvidedDelegationConnectorsAssignment_6_2"
    // InternalCBS.g:7657:1: rule__System__ProvidedDelegationConnectorsAssignment_6_2 : ( ruleProvidedDelegationConnector ) ;
    public final void rule__System__ProvidedDelegationConnectorsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7661:1: ( ( ruleProvidedDelegationConnector ) )
            // InternalCBS.g:7662:2: ( ruleProvidedDelegationConnector )
            {
            // InternalCBS.g:7662:2: ( ruleProvidedDelegationConnector )
            // InternalCBS.g:7663:3: ruleProvidedDelegationConnector
            {
             before(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedDelegationConnector();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__System__ProvidedDelegationConnectorsAssignment_6_2"


    // $ANTLR start "rule__System__ProvidedDelegationConnectorsAssignment_6_3_1"
    // InternalCBS.g:7672:1: rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 : ( ruleProvidedDelegationConnector ) ;
    public final void rule__System__ProvidedDelegationConnectorsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7676:1: ( ( ruleProvidedDelegationConnector ) )
            // InternalCBS.g:7677:2: ( ruleProvidedDelegationConnector )
            {
            // InternalCBS.g:7677:2: ( ruleProvidedDelegationConnector )
            // InternalCBS.g:7678:3: ruleProvidedDelegationConnector
            {
             before(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedDelegationConnector();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsProvidedDelegationConnectorParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__System__ProvidedDelegationConnectorsAssignment_6_3_1"


    // $ANTLR start "rule__System__AllocationAssignment_8"
    // InternalCBS.g:7687:1: rule__System__AllocationAssignment_8 : ( ruleAllocation ) ;
    public final void rule__System__AllocationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7691:1: ( ( ruleAllocation ) )
            // InternalCBS.g:7692:2: ( ruleAllocation )
            {
            // InternalCBS.g:7692:2: ( ruleAllocation )
            // InternalCBS.g:7693:3: ruleAllocation
            {
             before(grammarAccess.getSystemAccess().getAllocationAllocationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocation();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getAllocationAllocationParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__System__AllocationAssignment_8"


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalCBS.g:7702:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7706:1: ( ( ruleEString ) )
            // InternalCBS.g:7707:2: ( ruleEString )
            {
            // InternalCBS.g:7707:2: ( ruleEString )
            // InternalCBS.g:7708:3: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AssemblyContext__NameAssignment_1"


    // $ANTLR start "rule__AssemblyContext__InstantiatesAssignment_4"
    // InternalCBS.g:7717:1: rule__AssemblyContext__InstantiatesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__InstantiatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7721:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7722:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7722:2: ( ( ruleEString ) )
            // InternalCBS.g:7723:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentCrossReference_4_0()); 
            // InternalCBS.g:7724:3: ( ruleEString )
            // InternalCBS.g:7725:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentCrossReference_4_0()); 

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
    // $ANTLR end "rule__AssemblyContext__InstantiatesAssignment_4"


    // $ANTLR start "rule__AssemblyContext__ProvidedRolesAssignment_5_2"
    // InternalCBS.g:7736:1: rule__AssemblyContext__ProvidedRolesAssignment_5_2 : ( ruleProvidedRole ) ;
    public final void rule__AssemblyContext__ProvidedRolesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7740:1: ( ( ruleProvidedRole ) )
            // InternalCBS.g:7741:2: ( ruleProvidedRole )
            {
            // InternalCBS.g:7741:2: ( ruleProvidedRole )
            // InternalCBS.g:7742:3: ruleProvidedRole
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__AssemblyContext__ProvidedRolesAssignment_5_2"


    // $ANTLR start "rule__AssemblyContext__ProvidedRolesAssignment_5_3_1"
    // InternalCBS.g:7751:1: rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 : ( ruleProvidedRole ) ;
    public final void rule__AssemblyContext__ProvidedRolesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7755:1: ( ( ruleProvidedRole ) )
            // InternalCBS.g:7756:2: ( ruleProvidedRole )
            {
            // InternalCBS.g:7756:2: ( ruleProvidedRole )
            // InternalCBS.g:7757:3: ruleProvidedRole
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesProvidedRoleParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__AssemblyContext__ProvidedRolesAssignment_5_3_1"


    // $ANTLR start "rule__AssemblyContext__RequiredRolesAssignment_6_2"
    // InternalCBS.g:7766:1: rule__AssemblyContext__RequiredRolesAssignment_6_2 : ( ruleRequiredRole ) ;
    public final void rule__AssemblyContext__RequiredRolesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7770:1: ( ( ruleRequiredRole ) )
            // InternalCBS.g:7771:2: ( ruleRequiredRole )
            {
            // InternalCBS.g:7771:2: ( ruleRequiredRole )
            // InternalCBS.g:7772:3: ruleRequiredRole
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__AssemblyContext__RequiredRolesAssignment_6_2"


    // $ANTLR start "rule__AssemblyContext__RequiredRolesAssignment_6_3_1"
    // InternalCBS.g:7781:1: rule__AssemblyContext__RequiredRolesAssignment_6_3_1 : ( ruleRequiredRole ) ;
    public final void rule__AssemblyContext__RequiredRolesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7785:1: ( ( ruleRequiredRole ) )
            // InternalCBS.g:7786:2: ( ruleRequiredRole )
            {
            // InternalCBS.g:7786:2: ( ruleRequiredRole )
            // InternalCBS.g:7787:3: ruleRequiredRole
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesRequiredRoleParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__AssemblyContext__RequiredRolesAssignment_6_3_1"


    // $ANTLR start "rule__AssemblyConnector__NameAssignment_1"
    // InternalCBS.g:7796:1: rule__AssemblyConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7800:1: ( ( ruleEString ) )
            // InternalCBS.g:7801:2: ( ruleEString )
            {
            // InternalCBS.g:7801:2: ( ruleEString )
            // InternalCBS.g:7802:3: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AssemblyConnector__NameAssignment_1"


    // $ANTLR start "rule__AssemblyConnector__RequiringRoleAssignment_4"
    // InternalCBS.g:7811:1: rule__AssemblyConnector__RequiringRoleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__RequiringRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7815:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7816:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7816:2: ( ( ruleEString ) )
            // InternalCBS.g:7817:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleCrossReference_4_0()); 
            // InternalCBS.g:7818:3: ( ruleEString )
            // InternalCBS.g:7819:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleCrossReference_4_0()); 

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
    // $ANTLR end "rule__AssemblyConnector__RequiringRoleAssignment_4"


    // $ANTLR start "rule__AssemblyConnector__ProvidingRoleAssignment_6"
    // InternalCBS.g:7830:1: rule__AssemblyConnector__ProvidingRoleAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__ProvidingRoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7834:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7835:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7835:2: ( ( ruleEString ) )
            // InternalCBS.g:7836:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleCrossReference_6_0()); 
            // InternalCBS.g:7837:3: ( ruleEString )
            // InternalCBS.g:7838:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleCrossReference_6_0()); 

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
    // $ANTLR end "rule__AssemblyConnector__ProvidingRoleAssignment_6"


    // $ANTLR start "rule__RequiredDelegationConnector__NameAssignment_1"
    // InternalCBS.g:7849:1: rule__RequiredDelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequiredDelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7853:1: ( ( ruleEString ) )
            // InternalCBS.g:7854:2: ( ruleEString )
            {
            // InternalCBS.g:7854:2: ( ruleEString )
            // InternalCBS.g:7855:3: ruleEString
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RequiredDelegationConnector__NameAssignment_1"


    // $ANTLR start "rule__RequiredDelegationConnector__RequiringRoleAssignment_4"
    // InternalCBS.g:7864:1: rule__RequiredDelegationConnector__RequiringRoleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RequiredDelegationConnector__RequiringRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7868:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7869:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7869:2: ( ( ruleEString ) )
            // InternalCBS.g:7870:3: ( ruleEString )
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleRequiredRoleCrossReference_4_0()); 
            // InternalCBS.g:7871:3: ( ruleEString )
            // InternalCBS.g:7872:4: ruleEString
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleRequiredRoleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleRequiredRoleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleRequiredRoleCrossReference_4_0()); 

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
    // $ANTLR end "rule__RequiredDelegationConnector__RequiringRoleAssignment_4"


    // $ANTLR start "rule__ProvidedDelegationConnector__NameAssignment_1"
    // InternalCBS.g:7883:1: rule__ProvidedDelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProvidedDelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7887:1: ( ( ruleEString ) )
            // InternalCBS.g:7888:2: ( ruleEString )
            {
            // InternalCBS.g:7888:2: ( ruleEString )
            // InternalCBS.g:7889:3: ruleEString
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProvidedDelegationConnector__NameAssignment_1"


    // $ANTLR start "rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4"
    // InternalCBS.g:7898:1: rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7902:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7903:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7903:2: ( ( ruleEString ) )
            // InternalCBS.g:7904:3: ( ruleEString )
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleProvidedRoleCrossReference_4_0()); 
            // InternalCBS.g:7905:3: ( ruleEString )
            // InternalCBS.g:7906:4: ruleEString
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleProvidedRoleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleProvidedRoleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleProvidedRoleCrossReference_4_0()); 

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
    // $ANTLR end "rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4"


    // $ANTLR start "rule__Allocation__EnvironmentAssignment_3"
    // InternalCBS.g:7917:1: rule__Allocation__EnvironmentAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Allocation__EnvironmentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7921:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7922:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7922:2: ( ( ruleEString ) )
            // InternalCBS.g:7923:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentCrossReference_3_0()); 
            // InternalCBS.g:7924:3: ( ruleEString )
            // InternalCBS.g:7925:4: ruleEString
            {
             before(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentCrossReference_3_0()); 

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
    // $ANTLR end "rule__Allocation__EnvironmentAssignment_3"


    // $ANTLR start "rule__Allocation__AllocationContextsAssignment_4_2"
    // InternalCBS.g:7936:1: rule__Allocation__AllocationContextsAssignment_4_2 : ( ruleAllocationContext ) ;
    public final void rule__Allocation__AllocationContextsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7940:1: ( ( ruleAllocationContext ) )
            // InternalCBS.g:7941:2: ( ruleAllocationContext )
            {
            // InternalCBS.g:7941:2: ( ruleAllocationContext )
            // InternalCBS.g:7942:3: ruleAllocationContext
            {
             before(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Allocation__AllocationContextsAssignment_4_2"


    // $ANTLR start "rule__Allocation__AllocationContextsAssignment_4_3_1"
    // InternalCBS.g:7951:1: rule__Allocation__AllocationContextsAssignment_4_3_1 : ( ruleAllocationContext ) ;
    public final void rule__Allocation__AllocationContextsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7955:1: ( ( ruleAllocationContext ) )
            // InternalCBS.g:7956:2: ( ruleAllocationContext )
            {
            // InternalCBS.g:7956:2: ( ruleAllocationContext )
            // InternalCBS.g:7957:3: ruleAllocationContext
            {
             before(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Allocation__AllocationContextsAssignment_4_3_1"


    // $ANTLR start "rule__ProvidedRole__NameAssignment_1"
    // InternalCBS.g:7966:1: rule__ProvidedRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProvidedRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7970:1: ( ( ruleEString ) )
            // InternalCBS.g:7971:2: ( ruleEString )
            {
            // InternalCBS.g:7971:2: ( ruleEString )
            // InternalCBS.g:7972:3: ruleEString
            {
             before(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProvidedRole__NameAssignment_1"


    // $ANTLR start "rule__ProvidedRole__InterfaceAssignment_4"
    // InternalCBS.g:7981:1: rule__ProvidedRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProvidedRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7985:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7986:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7986:2: ( ( ruleEString ) )
            // InternalCBS.g:7987:3: ( ruleEString )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalCBS.g:7988:3: ( ruleEString )
            // InternalCBS.g:7989:4: ruleEString
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 

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
    // $ANTLR end "rule__ProvidedRole__InterfaceAssignment_4"


    // $ANTLR start "rule__RequiredRole__NameAssignment_1"
    // InternalCBS.g:8000:1: rule__RequiredRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequiredRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8004:1: ( ( ruleEString ) )
            // InternalCBS.g:8005:2: ( ruleEString )
            {
            // InternalCBS.g:8005:2: ( ruleEString )
            // InternalCBS.g:8006:3: ruleEString
            {
             before(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RequiredRole__NameAssignment_1"


    // $ANTLR start "rule__RequiredRole__InterfaceAssignment_4"
    // InternalCBS.g:8015:1: rule__RequiredRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RequiredRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8019:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8020:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8020:2: ( ( ruleEString ) )
            // InternalCBS.g:8021:3: ( ruleEString )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalCBS.g:8022:3: ( ruleEString )
            // InternalCBS.g:8023:4: ruleEString
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 

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
    // $ANTLR end "rule__RequiredRole__InterfaceAssignment_4"


    // $ANTLR start "rule__AtomicComponent__NameAssignment_2"
    // InternalCBS.g:8034:1: rule__AtomicComponent__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AtomicComponent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8038:1: ( ( ruleEString ) )
            // InternalCBS.g:8039:2: ( ruleEString )
            {
            // InternalCBS.g:8039:2: ( ruleEString )
            // InternalCBS.g:8040:3: ruleEString
            {
             before(grammarAccess.getAtomicComponentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicComponentAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AtomicComponent__NameAssignment_2"


    // $ANTLR start "rule__AtomicComponent__RequiresAssignment_4_2"
    // InternalCBS.g:8049:1: rule__AtomicComponent__RequiresAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicComponent__RequiresAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8053:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8054:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8054:2: ( ( ruleEString ) )
            // InternalCBS.g:8055:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_2_0()); 
            // InternalCBS.g:8056:3: ( ruleEString )
            // InternalCBS.g:8057:4: ruleEString
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__AtomicComponent__RequiresAssignment_4_2"


    // $ANTLR start "rule__AtomicComponent__RequiresAssignment_4_3_1"
    // InternalCBS.g:8068:1: rule__AtomicComponent__RequiresAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicComponent__RequiresAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8072:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8073:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8073:2: ( ( ruleEString ) )
            // InternalCBS.g:8074:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0()); 
            // InternalCBS.g:8075:3: ( ruleEString )
            // InternalCBS.g:8076:4: ruleEString
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__AtomicComponent__RequiresAssignment_4_3_1"


    // $ANTLR start "rule__AtomicComponent__ProvidesAssignment_5_2"
    // InternalCBS.g:8087:1: rule__AtomicComponent__ProvidesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicComponent__ProvidesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8091:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8092:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8092:2: ( ( ruleEString ) )
            // InternalCBS.g:8093:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_2_0()); 
            // InternalCBS.g:8094:3: ( ruleEString )
            // InternalCBS.g:8095:4: ruleEString
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__AtomicComponent__ProvidesAssignment_5_2"


    // $ANTLR start "rule__AtomicComponent__ProvidesAssignment_5_3_1"
    // InternalCBS.g:8106:1: rule__AtomicComponent__ProvidesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicComponent__ProvidesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8110:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8111:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8111:2: ( ( ruleEString ) )
            // InternalCBS.g:8112:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0()); 
            // InternalCBS.g:8113:3: ( ruleEString )
            // InternalCBS.g:8114:4: ruleEString
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__AtomicComponent__ProvidesAssignment_5_3_1"


    // $ANTLR start "rule__AtomicComponent__ServicesAssignment_6_2"
    // InternalCBS.g:8125:1: rule__AtomicComponent__ServicesAssignment_6_2 : ( ruleService ) ;
    public final void rule__AtomicComponent__ServicesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8129:1: ( ( ruleService ) )
            // InternalCBS.g:8130:2: ( ruleService )
            {
            // InternalCBS.g:8130:2: ( ruleService )
            // InternalCBS.g:8131:3: ruleService
            {
             before(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__AtomicComponent__ServicesAssignment_6_2"


    // $ANTLR start "rule__AtomicComponent__ServicesAssignment_6_3_1"
    // InternalCBS.g:8140:1: rule__AtomicComponent__ServicesAssignment_6_3_1 : ( ruleService ) ;
    public final void rule__AtomicComponent__ServicesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8144:1: ( ( ruleService ) )
            // InternalCBS.g:8145:2: ( ruleService )
            {
            // InternalCBS.g:8145:2: ( ruleService )
            // InternalCBS.g:8146:3: ruleService
            {
             before(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getAtomicComponentAccess().getServicesServiceParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__AtomicComponent__ServicesAssignment_6_3_1"


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalCBS.g:8155:1: rule__Signature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8159:1: ( ( ruleEString ) )
            // InternalCBS.g:8160:2: ( ruleEString )
            {
            // InternalCBS.g:8160:2: ( ruleEString )
            // InternalCBS.g:8161:3: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Signature__NameAssignment_1"


    // $ANTLR start "rule__Signature__ReturnTypeAssignment_4"
    // InternalCBS.g:8170:1: rule__Signature__ReturnTypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8174:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8175:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8175:2: ( ( ruleEString ) )
            // InternalCBS.g:8176:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_4_0()); 
            // InternalCBS.g:8177:3: ( ruleEString )
            // InternalCBS.g:8178:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getReturnTypeTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__Signature__ReturnTypeAssignment_4"


    // $ANTLR start "rule__Signature__ParametersAssignment_5_2"
    // InternalCBS.g:8189:1: rule__Signature__ParametersAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__Signature__ParametersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8193:1: ( ( ruleParameter ) )
            // InternalCBS.g:8194:2: ( ruleParameter )
            {
            // InternalCBS.g:8194:2: ( ruleParameter )
            // InternalCBS.g:8195:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Signature__ParametersAssignment_5_2"


    // $ANTLR start "rule__Signature__ParametersAssignment_5_3_1"
    // InternalCBS.g:8204:1: rule__Signature__ParametersAssignment_5_3_1 : ( ruleParameter ) ;
    public final void rule__Signature__ParametersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8208:1: ( ( ruleParameter ) )
            // InternalCBS.g:8209:2: ( ruleParameter )
            {
            // InternalCBS.g:8209:2: ( ruleParameter )
            // InternalCBS.g:8210:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Signature__ParametersAssignment_5_3_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalCBS.g:8219:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8223:1: ( ( ruleEString ) )
            // InternalCBS.g:8224:2: ( ruleEString )
            {
            // InternalCBS.g:8224:2: ( ruleEString )
            // InternalCBS.g:8225:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_4"
    // InternalCBS.g:8234:1: rule__Parameter__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8238:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8239:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8239:2: ( ( ruleEString ) )
            // InternalCBS.g:8240:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeCrossReference_4_0()); 
            // InternalCBS.g:8241:3: ( ruleEString )
            // InternalCBS.g:8242:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParameterTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeParameterTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_4"


    // $ANTLR start "rule__SimpleType__TypeAssignment_3"
    // InternalCBS.g:8253:1: rule__SimpleType__TypeAssignment_3 : ( ruleSimpleTypeEnum ) ;
    public final void rule__SimpleType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8257:1: ( ( ruleSimpleTypeEnum ) )
            // InternalCBS.g:8258:2: ( ruleSimpleTypeEnum )
            {
            // InternalCBS.g:8258:2: ( ruleSimpleTypeEnum )
            // InternalCBS.g:8259:3: ruleSimpleTypeEnum
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeEnum();

            state._fsp--;

             after(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__SimpleType__TypeAssignment_3"


    // $ANTLR start "rule__ComplexType__MembersAssignment_3_2"
    // InternalCBS.g:8268:1: rule__ComplexType__MembersAssignment_3_2 : ( ruleComplexMember ) ;
    public final void rule__ComplexType__MembersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8272:1: ( ( ruleComplexMember ) )
            // InternalCBS.g:8273:2: ( ruleComplexMember )
            {
            // InternalCBS.g:8273:2: ( ruleComplexMember )
            // InternalCBS.g:8274:3: ruleComplexMember
            {
             before(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexMember();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__ComplexType__MembersAssignment_3_2"


    // $ANTLR start "rule__ComplexType__MembersAssignment_3_3_1"
    // InternalCBS.g:8283:1: rule__ComplexType__MembersAssignment_3_3_1 : ( ruleComplexMember ) ;
    public final void rule__ComplexType__MembersAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8287:1: ( ( ruleComplexMember ) )
            // InternalCBS.g:8288:2: ( ruleComplexMember )
            {
            // InternalCBS.g:8288:2: ( ruleComplexMember )
            // InternalCBS.g:8289:3: ruleComplexMember
            {
             before(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexMember();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__ComplexType__MembersAssignment_3_3_1"


    // $ANTLR start "rule__ComplexMember__NameAssignment_1"
    // InternalCBS.g:8298:1: rule__ComplexMember__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ComplexMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8302:1: ( ( ruleEString ) )
            // InternalCBS.g:8303:2: ( ruleEString )
            {
            // InternalCBS.g:8303:2: ( ruleEString )
            // InternalCBS.g:8304:3: ruleEString
            {
             before(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComplexMember__NameAssignment_1"


    // $ANTLR start "rule__ComplexMember__TypeAssignment_4"
    // InternalCBS.g:8313:1: rule__ComplexMember__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ComplexMember__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8317:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8318:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8318:2: ( ( ruleEString ) )
            // InternalCBS.g:8319:3: ( ruleEString )
            {
             before(grammarAccess.getComplexMemberAccess().getTypeParameterTypeCrossReference_4_0()); 
            // InternalCBS.g:8320:3: ( ruleEString )
            // InternalCBS.g:8321:4: ruleEString
            {
             before(grammarAccess.getComplexMemberAccess().getTypeParameterTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexMemberAccess().getTypeParameterTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getComplexMemberAccess().getTypeParameterTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__ComplexMember__TypeAssignment_4"


    // $ANTLR start "rule__Service__ImplementsAssignment_3"
    // InternalCBS.g:8332:1: rule__Service__ImplementsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Service__ImplementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8336:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8337:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8337:2: ( ( ruleEString ) )
            // InternalCBS.g:8338:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getImplementsSignatureCrossReference_3_0()); 
            // InternalCBS.g:8339:3: ( ruleEString )
            // InternalCBS.g:8340:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getImplementsSignatureEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getImplementsSignatureEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getImplementsSignatureCrossReference_3_0()); 

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
    // $ANTLR end "rule__Service__ImplementsAssignment_3"


    // $ANTLR start "rule__Service__ActionsAssignment_6"
    // InternalCBS.g:8351:1: rule__Service__ActionsAssignment_6 : ( ruleAbstractAction ) ;
    public final void rule__Service__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8355:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:8356:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:8356:2: ( ruleAbstractAction )
            // InternalCBS.g:8357:3: ruleAbstractAction
            {
             before(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Service__ActionsAssignment_6"


    // $ANTLR start "rule__Service__ActionsAssignment_7_1"
    // InternalCBS.g:8366:1: rule__Service__ActionsAssignment_7_1 : ( ruleAbstractAction ) ;
    public final void rule__Service__ActionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8370:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:8371:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:8371:2: ( ruleAbstractAction )
            // InternalCBS.g:8372:3: ruleAbstractAction
            {
             before(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Service__ActionsAssignment_7_1"


    // $ANTLR start "rule__ExternalCallAction__RequiredServiceAssignment_3"
    // InternalCBS.g:8381:1: rule__ExternalCallAction__RequiredServiceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExternalCallAction__RequiredServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8385:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8386:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8386:2: ( ( ruleEString ) )
            // InternalCBS.g:8387:3: ( ruleEString )
            {
             before(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureCrossReference_3_0()); 
            // InternalCBS.g:8388:3: ( ruleEString )
            // InternalCBS.g:8389:4: ruleEString
            {
             before(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureCrossReference_3_0()); 

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
    // $ANTLR end "rule__ExternalCallAction__RequiredServiceAssignment_3"


    // $ANTLR start "rule__BranchAction__BranchesAssignment_4"
    // InternalCBS.g:8400:1: rule__BranchAction__BranchesAssignment_4 : ( ruleBranchTransition ) ;
    public final void rule__BranchAction__BranchesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8404:1: ( ( ruleBranchTransition ) )
            // InternalCBS.g:8405:2: ( ruleBranchTransition )
            {
            // InternalCBS.g:8405:2: ( ruleBranchTransition )
            // InternalCBS.g:8406:3: ruleBranchTransition
            {
             before(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchTransition();

            state._fsp--;

             after(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__BranchAction__BranchesAssignment_4"


    // $ANTLR start "rule__BranchAction__BranchesAssignment_5_1"
    // InternalCBS.g:8415:1: rule__BranchAction__BranchesAssignment_5_1 : ( ruleBranchTransition ) ;
    public final void rule__BranchAction__BranchesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8419:1: ( ( ruleBranchTransition ) )
            // InternalCBS.g:8420:2: ( ruleBranchTransition )
            {
            // InternalCBS.g:8420:2: ( ruleBranchTransition )
            // InternalCBS.g:8421:3: ruleBranchTransition
            {
             before(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchTransition();

            state._fsp--;

             after(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__BranchAction__BranchesAssignment_5_1"


    // $ANTLR start "rule__LoopAction__BodyActionsAssignment_3_2"
    // InternalCBS.g:8430:1: rule__LoopAction__BodyActionsAssignment_3_2 : ( ruleAbstractAction ) ;
    public final void rule__LoopAction__BodyActionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8434:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:8435:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:8435:2: ( ruleAbstractAction )
            // InternalCBS.g:8436:3: ruleAbstractAction
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__LoopAction__BodyActionsAssignment_3_2"


    // $ANTLR start "rule__LoopAction__BodyActionsAssignment_3_3_1"
    // InternalCBS.g:8445:1: rule__LoopAction__BodyActionsAssignment_3_3_1 : ( ruleAbstractAction ) ;
    public final void rule__LoopAction__BodyActionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8449:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:8450:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:8450:2: ( ruleAbstractAction )
            // InternalCBS.g:8451:3: ruleAbstractAction
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__LoopAction__BodyActionsAssignment_3_3_1"


    // $ANTLR start "rule__BranchTransition__BranchConditionAssignment_2_1"
    // InternalCBS.g:8460:1: rule__BranchTransition__BranchConditionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__BranchTransition__BranchConditionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8464:1: ( ( ruleEString ) )
            // InternalCBS.g:8465:2: ( ruleEString )
            {
            // InternalCBS.g:8465:2: ( ruleEString )
            // InternalCBS.g:8466:3: ruleEString
            {
             before(grammarAccess.getBranchTransitionAccess().getBranchConditionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBranchTransitionAccess().getBranchConditionEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__BranchTransition__BranchConditionAssignment_2_1"


    // $ANTLR start "rule__BranchTransition__ActionAssignment_4"
    // InternalCBS.g:8475:1: rule__BranchTransition__ActionAssignment_4 : ( ruleAbstractAction ) ;
    public final void rule__BranchTransition__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8479:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:8480:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:8480:2: ( ruleAbstractAction )
            // InternalCBS.g:8481:3: ruleAbstractAction
            {
             before(grammarAccess.getBranchTransitionAccess().getActionAbstractActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getBranchTransitionAccess().getActionAbstractActionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__BranchTransition__ActionAssignment_4"


    // $ANTLR start "rule__AllocationContext__ContainerAssignment_3"
    // InternalCBS.g:8490:1: rule__AllocationContext__ContainerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8494:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8495:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8495:2: ( ( ruleEString ) )
            // InternalCBS.g:8496:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 
            // InternalCBS.g:8497:3: ( ruleEString )
            // InternalCBS.g:8498:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 

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
    // $ANTLR end "rule__AllocationContext__ContainerAssignment_3"


    // $ANTLR start "rule__AllocationContext__AllocatesAssignment_5"
    // InternalCBS.g:8509:1: rule__AllocationContext__AllocatesAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AllocatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8513:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8514:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8514:2: ( ( ruleEString ) )
            // InternalCBS.g:8515:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextCrossReference_5_0()); 
            // InternalCBS.g:8516:3: ( ruleEString )
            // InternalCBS.g:8517:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextCrossReference_5_0()); 

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
    // $ANTLR end "rule__AllocationContext__AllocatesAssignment_5"


    // $ANTLR start "rule__Container__NameAssignment_2"
    // InternalCBS.g:8528:1: rule__Container__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8532:1: ( ( ruleEString ) )
            // InternalCBS.g:8533:2: ( ruleEString )
            {
            // InternalCBS.g:8533:2: ( ruleEString )
            // InternalCBS.g:8534:3: ruleEString
            {
             before(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_2"


    // $ANTLR start "rule__Linker__NameAssignment_1"
    // InternalCBS.g:8543:1: rule__Linker__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Linker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8547:1: ( ( ruleEString ) )
            // InternalCBS.g:8548:2: ( ruleEString )
            {
            // InternalCBS.g:8548:2: ( ruleEString )
            // InternalCBS.g:8549:3: ruleEString
            {
             before(grammarAccess.getLinkerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkerAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Linker__NameAssignment_1"


    // $ANTLR start "rule__Linker__LinksAssignment_5"
    // InternalCBS.g:8558:1: rule__Linker__LinksAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Linker__LinksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8562:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8563:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8563:2: ( ( ruleEString ) )
            // InternalCBS.g:8564:3: ( ruleEString )
            {
             before(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_5_0()); 
            // InternalCBS.g:8565:3: ( ruleEString )
            // InternalCBS.g:8566:4: ruleEString
            {
             before(grammarAccess.getLinkerAccess().getLinksContainerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkerAccess().getLinksContainerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_5_0()); 

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
    // $ANTLR end "rule__Linker__LinksAssignment_5"


    // $ANTLR start "rule__Linker__LinksAssignment_6_1"
    // InternalCBS.g:8577:1: rule__Linker__LinksAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Linker__LinksAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:8581:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:8582:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:8582:2: ( ( ruleEString ) )
            // InternalCBS.g:8583:3: ( ruleEString )
            {
             before(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_6_1_0()); 
            // InternalCBS.g:8584:3: ( ruleEString )
            // InternalCBS.g:8585:4: ruleEString
            {
             before(grammarAccess.getLinkerAccess().getLinksContainerEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkerAccess().getLinksContainerEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Linker__LinksAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000EA00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C0400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001900000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});

}