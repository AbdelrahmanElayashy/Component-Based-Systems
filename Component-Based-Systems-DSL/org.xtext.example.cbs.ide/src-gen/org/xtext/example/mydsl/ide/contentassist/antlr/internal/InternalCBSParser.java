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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'Long'", "'List'", "'Map'", "'System'", "'{'", "'allocation'", "'}'", "'childContexts'", "','", "'assemblyConnectors'", "'requiredDelegationConnectors'", "'providedDelegationConnectors'", "'Allocation'", "'environment'", "'allocationContexts'", "'AllocationContext'", "'container'", "'allocates'", "'Container'", "'Linker'", "'links'", "'('", "')'", "'AssemblyContext'", "'instantiates'", "'providedRoles'", "'requiredRoles'", "'AssemblyConnector'", "'requiringRole'", "'providingRole'", "'RequiredDelegationConnector'", "'ProvidedDelegationConnector'", "'ProvidedRole'", "'interface'", "'RequiredRole'", "'AtomicComponent'", "'requires'", "'provides'", "'services'", "'type'", "':'", "'Void'", "'<'", "'>'", "'Service'", "';'", "'internalCall'", "'externalCall'", "'branch'", "'?'", "'loop'"
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


    // $ANTLR start "entryRuleAllocation"
    // InternalCBS.g:78:1: entryRuleAllocation : ruleAllocation EOF ;
    public final void entryRuleAllocation() throws RecognitionException {
        try {
            // InternalCBS.g:79:1: ( ruleAllocation EOF )
            // InternalCBS.g:80:1: ruleAllocation EOF
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
    // InternalCBS.g:87:1: ruleAllocation : ( ( rule__Allocation__Group__0 ) ) ;
    public final void ruleAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:91:2: ( ( ( rule__Allocation__Group__0 ) ) )
            // InternalCBS.g:92:2: ( ( rule__Allocation__Group__0 ) )
            {
            // InternalCBS.g:92:2: ( ( rule__Allocation__Group__0 ) )
            // InternalCBS.g:93:3: ( rule__Allocation__Group__0 )
            {
             before(grammarAccess.getAllocationAccess().getGroup()); 
            // InternalCBS.g:94:3: ( rule__Allocation__Group__0 )
            // InternalCBS.g:94:4: rule__Allocation__Group__0
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


    // $ANTLR start "entryRuleAllocationContext"
    // InternalCBS.g:103:1: entryRuleAllocationContext : ruleAllocationContext EOF ;
    public final void entryRuleAllocationContext() throws RecognitionException {
        try {
            // InternalCBS.g:104:1: ( ruleAllocationContext EOF )
            // InternalCBS.g:105:1: ruleAllocationContext EOF
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
    // InternalCBS.g:112:1: ruleAllocationContext : ( ( rule__AllocationContext__Group__0 ) ) ;
    public final void ruleAllocationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:116:2: ( ( ( rule__AllocationContext__Group__0 ) ) )
            // InternalCBS.g:117:2: ( ( rule__AllocationContext__Group__0 ) )
            {
            // InternalCBS.g:117:2: ( ( rule__AllocationContext__Group__0 ) )
            // InternalCBS.g:118:3: ( rule__AllocationContext__Group__0 )
            {
             before(grammarAccess.getAllocationContextAccess().getGroup()); 
            // InternalCBS.g:119:3: ( rule__AllocationContext__Group__0 )
            // InternalCBS.g:119:4: rule__AllocationContext__Group__0
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
    // InternalCBS.g:128:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalCBS.g:129:1: ( ruleContainer EOF )
            // InternalCBS.g:130:1: ruleContainer EOF
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
    // InternalCBS.g:137:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:141:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalCBS.g:142:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalCBS.g:142:2: ( ( rule__Container__Group__0 ) )
            // InternalCBS.g:143:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalCBS.g:144:3: ( rule__Container__Group__0 )
            // InternalCBS.g:144:4: rule__Container__Group__0
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
    // InternalCBS.g:153:1: entryRuleLinker : ruleLinker EOF ;
    public final void entryRuleLinker() throws RecognitionException {
        try {
            // InternalCBS.g:154:1: ( ruleLinker EOF )
            // InternalCBS.g:155:1: ruleLinker EOF
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
    // InternalCBS.g:162:1: ruleLinker : ( ( rule__Linker__Group__0 ) ) ;
    public final void ruleLinker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:166:2: ( ( ( rule__Linker__Group__0 ) ) )
            // InternalCBS.g:167:2: ( ( rule__Linker__Group__0 ) )
            {
            // InternalCBS.g:167:2: ( ( rule__Linker__Group__0 ) )
            // InternalCBS.g:168:3: ( rule__Linker__Group__0 )
            {
             before(grammarAccess.getLinkerAccess().getGroup()); 
            // InternalCBS.g:169:3: ( rule__Linker__Group__0 )
            // InternalCBS.g:169:4: rule__Linker__Group__0
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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalCBS.g:178:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalCBS.g:179:1: ( ruleAssemblyContext EOF )
            // InternalCBS.g:180:1: ruleAssemblyContext EOF
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
    // InternalCBS.g:187:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:191:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalCBS.g:192:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalCBS.g:192:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalCBS.g:193:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalCBS.g:194:3: ( rule__AssemblyContext__Group__0 )
            // InternalCBS.g:194:4: rule__AssemblyContext__Group__0
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
    // InternalCBS.g:203:1: entryRuleAssemblyConnector : ruleAssemblyConnector EOF ;
    public final void entryRuleAssemblyConnector() throws RecognitionException {
        try {
            // InternalCBS.g:204:1: ( ruleAssemblyConnector EOF )
            // InternalCBS.g:205:1: ruleAssemblyConnector EOF
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
    // InternalCBS.g:212:1: ruleAssemblyConnector : ( ( rule__AssemblyConnector__Group__0 ) ) ;
    public final void ruleAssemblyConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:216:2: ( ( ( rule__AssemblyConnector__Group__0 ) ) )
            // InternalCBS.g:217:2: ( ( rule__AssemblyConnector__Group__0 ) )
            {
            // InternalCBS.g:217:2: ( ( rule__AssemblyConnector__Group__0 ) )
            // InternalCBS.g:218:3: ( rule__AssemblyConnector__Group__0 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getGroup()); 
            // InternalCBS.g:219:3: ( rule__AssemblyConnector__Group__0 )
            // InternalCBS.g:219:4: rule__AssemblyConnector__Group__0
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
    // InternalCBS.g:228:1: entryRuleRequiredDelegationConnector : ruleRequiredDelegationConnector EOF ;
    public final void entryRuleRequiredDelegationConnector() throws RecognitionException {
        try {
            // InternalCBS.g:229:1: ( ruleRequiredDelegationConnector EOF )
            // InternalCBS.g:230:1: ruleRequiredDelegationConnector EOF
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
    // InternalCBS.g:237:1: ruleRequiredDelegationConnector : ( ( rule__RequiredDelegationConnector__Group__0 ) ) ;
    public final void ruleRequiredDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:241:2: ( ( ( rule__RequiredDelegationConnector__Group__0 ) ) )
            // InternalCBS.g:242:2: ( ( rule__RequiredDelegationConnector__Group__0 ) )
            {
            // InternalCBS.g:242:2: ( ( rule__RequiredDelegationConnector__Group__0 ) )
            // InternalCBS.g:243:3: ( rule__RequiredDelegationConnector__Group__0 )
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getGroup()); 
            // InternalCBS.g:244:3: ( rule__RequiredDelegationConnector__Group__0 )
            // InternalCBS.g:244:4: rule__RequiredDelegationConnector__Group__0
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
    // InternalCBS.g:253:1: entryRuleProvidedDelegationConnector : ruleProvidedDelegationConnector EOF ;
    public final void entryRuleProvidedDelegationConnector() throws RecognitionException {
        try {
            // InternalCBS.g:254:1: ( ruleProvidedDelegationConnector EOF )
            // InternalCBS.g:255:1: ruleProvidedDelegationConnector EOF
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
    // InternalCBS.g:262:1: ruleProvidedDelegationConnector : ( ( rule__ProvidedDelegationConnector__Group__0 ) ) ;
    public final void ruleProvidedDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:266:2: ( ( ( rule__ProvidedDelegationConnector__Group__0 ) ) )
            // InternalCBS.g:267:2: ( ( rule__ProvidedDelegationConnector__Group__0 ) )
            {
            // InternalCBS.g:267:2: ( ( rule__ProvidedDelegationConnector__Group__0 ) )
            // InternalCBS.g:268:3: ( rule__ProvidedDelegationConnector__Group__0 )
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getGroup()); 
            // InternalCBS.g:269:3: ( rule__ProvidedDelegationConnector__Group__0 )
            // InternalCBS.g:269:4: rule__ProvidedDelegationConnector__Group__0
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


    // $ANTLR start "entryRuleProvidedRole"
    // InternalCBS.g:278:1: entryRuleProvidedRole : ruleProvidedRole EOF ;
    public final void entryRuleProvidedRole() throws RecognitionException {
        try {
            // InternalCBS.g:279:1: ( ruleProvidedRole EOF )
            // InternalCBS.g:280:1: ruleProvidedRole EOF
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
    // InternalCBS.g:287:1: ruleProvidedRole : ( ( rule__ProvidedRole__Group__0 ) ) ;
    public final void ruleProvidedRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:291:2: ( ( ( rule__ProvidedRole__Group__0 ) ) )
            // InternalCBS.g:292:2: ( ( rule__ProvidedRole__Group__0 ) )
            {
            // InternalCBS.g:292:2: ( ( rule__ProvidedRole__Group__0 ) )
            // InternalCBS.g:293:3: ( rule__ProvidedRole__Group__0 )
            {
             before(grammarAccess.getProvidedRoleAccess().getGroup()); 
            // InternalCBS.g:294:3: ( rule__ProvidedRole__Group__0 )
            // InternalCBS.g:294:4: rule__ProvidedRole__Group__0
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
    // InternalCBS.g:303:1: entryRuleRequiredRole : ruleRequiredRole EOF ;
    public final void entryRuleRequiredRole() throws RecognitionException {
        try {
            // InternalCBS.g:304:1: ( ruleRequiredRole EOF )
            // InternalCBS.g:305:1: ruleRequiredRole EOF
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
    // InternalCBS.g:312:1: ruleRequiredRole : ( ( rule__RequiredRole__Group__0 ) ) ;
    public final void ruleRequiredRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:316:2: ( ( ( rule__RequiredRole__Group__0 ) ) )
            // InternalCBS.g:317:2: ( ( rule__RequiredRole__Group__0 ) )
            {
            // InternalCBS.g:317:2: ( ( rule__RequiredRole__Group__0 ) )
            // InternalCBS.g:318:3: ( rule__RequiredRole__Group__0 )
            {
             before(grammarAccess.getRequiredRoleAccess().getGroup()); 
            // InternalCBS.g:319:3: ( rule__RequiredRole__Group__0 )
            // InternalCBS.g:319:4: rule__RequiredRole__Group__0
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
    // InternalCBS.g:328:1: entryRuleAtomicComponent : ruleAtomicComponent EOF ;
    public final void entryRuleAtomicComponent() throws RecognitionException {
        try {
            // InternalCBS.g:329:1: ( ruleAtomicComponent EOF )
            // InternalCBS.g:330:1: ruleAtomicComponent EOF
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
    // InternalCBS.g:337:1: ruleAtomicComponent : ( ( rule__AtomicComponent__Group__0 ) ) ;
    public final void ruleAtomicComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:341:2: ( ( ( rule__AtomicComponent__Group__0 ) ) )
            // InternalCBS.g:342:2: ( ( rule__AtomicComponent__Group__0 ) )
            {
            // InternalCBS.g:342:2: ( ( rule__AtomicComponent__Group__0 ) )
            // InternalCBS.g:343:3: ( rule__AtomicComponent__Group__0 )
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup()); 
            // InternalCBS.g:344:3: ( rule__AtomicComponent__Group__0 )
            // InternalCBS.g:344:4: rule__AtomicComponent__Group__0
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
    // InternalCBS.g:353:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalCBS.g:354:1: ( ruleSignature EOF )
            // InternalCBS.g:355:1: ruleSignature EOF
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
    // InternalCBS.g:362:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:366:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalCBS.g:367:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalCBS.g:367:2: ( ( rule__Signature__Group__0 ) )
            // InternalCBS.g:368:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalCBS.g:369:3: ( rule__Signature__Group__0 )
            // InternalCBS.g:369:4: rule__Signature__Group__0
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
    // InternalCBS.g:378:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalCBS.g:379:1: ( ruleParameter EOF )
            // InternalCBS.g:380:1: ruleParameter EOF
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
    // InternalCBS.g:387:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:391:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalCBS.g:392:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalCBS.g:392:2: ( ( rule__Parameter__Group__0 ) )
            // InternalCBS.g:393:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalCBS.g:394:3: ( rule__Parameter__Group__0 )
            // InternalCBS.g:394:4: rule__Parameter__Group__0
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
    // InternalCBS.g:403:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // InternalCBS.g:404:1: ( ruleSimpleType EOF )
            // InternalCBS.g:405:1: ruleSimpleType EOF
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
    // InternalCBS.g:412:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:416:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // InternalCBS.g:417:2: ( ( rule__SimpleType__Group__0 ) )
            {
            // InternalCBS.g:417:2: ( ( rule__SimpleType__Group__0 ) )
            // InternalCBS.g:418:3: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // InternalCBS.g:419:3: ( rule__SimpleType__Group__0 )
            // InternalCBS.g:419:4: rule__SimpleType__Group__0
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
    // InternalCBS.g:428:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalCBS.g:429:1: ( ruleComplexType EOF )
            // InternalCBS.g:430:1: ruleComplexType EOF
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
    // InternalCBS.g:437:1: ruleComplexType : ( ( rule__ComplexType__Group__0 ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:441:2: ( ( ( rule__ComplexType__Group__0 ) ) )
            // InternalCBS.g:442:2: ( ( rule__ComplexType__Group__0 ) )
            {
            // InternalCBS.g:442:2: ( ( rule__ComplexType__Group__0 ) )
            // InternalCBS.g:443:3: ( rule__ComplexType__Group__0 )
            {
             before(grammarAccess.getComplexTypeAccess().getGroup()); 
            // InternalCBS.g:444:3: ( rule__ComplexType__Group__0 )
            // InternalCBS.g:444:4: rule__ComplexType__Group__0
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
    // InternalCBS.g:453:1: entryRuleComplexMember : ruleComplexMember EOF ;
    public final void entryRuleComplexMember() throws RecognitionException {
        try {
            // InternalCBS.g:454:1: ( ruleComplexMember EOF )
            // InternalCBS.g:455:1: ruleComplexMember EOF
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
    // InternalCBS.g:462:1: ruleComplexMember : ( ( rule__ComplexMember__Group__0 ) ) ;
    public final void ruleComplexMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:466:2: ( ( ( rule__ComplexMember__Group__0 ) ) )
            // InternalCBS.g:467:2: ( ( rule__ComplexMember__Group__0 ) )
            {
            // InternalCBS.g:467:2: ( ( rule__ComplexMember__Group__0 ) )
            // InternalCBS.g:468:3: ( rule__ComplexMember__Group__0 )
            {
             before(grammarAccess.getComplexMemberAccess().getGroup()); 
            // InternalCBS.g:469:3: ( rule__ComplexMember__Group__0 )
            // InternalCBS.g:469:4: rule__ComplexMember__Group__0
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
    // InternalCBS.g:478:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // InternalCBS.g:479:1: ( ruleVoid EOF )
            // InternalCBS.g:480:1: ruleVoid EOF
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
    // InternalCBS.g:487:1: ruleVoid : ( ( rule__Void__Group__0 ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:491:2: ( ( ( rule__Void__Group__0 ) ) )
            // InternalCBS.g:492:2: ( ( rule__Void__Group__0 ) )
            {
            // InternalCBS.g:492:2: ( ( rule__Void__Group__0 ) )
            // InternalCBS.g:493:3: ( rule__Void__Group__0 )
            {
             before(grammarAccess.getVoidAccess().getGroup()); 
            // InternalCBS.g:494:3: ( rule__Void__Group__0 )
            // InternalCBS.g:494:4: rule__Void__Group__0
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


    // $ANTLR start "entryRuleCollectionType"
    // InternalCBS.g:503:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // InternalCBS.g:504:1: ( ruleCollectionType EOF )
            // InternalCBS.g:505:1: ruleCollectionType EOF
            {
             before(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionType();

            state._fsp--;

             after(grammarAccess.getCollectionTypeRule()); 
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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalCBS.g:512:1: ruleCollectionType : ( ( rule__CollectionType__Group__0 ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:516:2: ( ( ( rule__CollectionType__Group__0 ) ) )
            // InternalCBS.g:517:2: ( ( rule__CollectionType__Group__0 ) )
            {
            // InternalCBS.g:517:2: ( ( rule__CollectionType__Group__0 ) )
            // InternalCBS.g:518:3: ( rule__CollectionType__Group__0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getGroup()); 
            // InternalCBS.g:519:3: ( rule__CollectionType__Group__0 )
            // InternalCBS.g:519:4: rule__CollectionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleAbstractAction"
    // InternalCBS.g:528:1: entryRuleAbstractAction : ruleAbstractAction EOF ;
    public final void entryRuleAbstractAction() throws RecognitionException {
        try {
            // InternalCBS.g:529:1: ( ruleAbstractAction EOF )
            // InternalCBS.g:530:1: ruleAbstractAction EOF
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
    // InternalCBS.g:537:1: ruleAbstractAction : ( ( rule__AbstractAction__Alternatives ) ) ;
    public final void ruleAbstractAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:541:2: ( ( ( rule__AbstractAction__Alternatives ) ) )
            // InternalCBS.g:542:2: ( ( rule__AbstractAction__Alternatives ) )
            {
            // InternalCBS.g:542:2: ( ( rule__AbstractAction__Alternatives ) )
            // InternalCBS.g:543:3: ( rule__AbstractAction__Alternatives )
            {
             before(grammarAccess.getAbstractActionAccess().getAlternatives()); 
            // InternalCBS.g:544:3: ( rule__AbstractAction__Alternatives )
            // InternalCBS.g:544:4: rule__AbstractAction__Alternatives
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


    // $ANTLR start "entryRuleService"
    // InternalCBS.g:553:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalCBS.g:554:1: ( ruleService EOF )
            // InternalCBS.g:555:1: ruleService EOF
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
    // InternalCBS.g:562:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:566:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalCBS.g:567:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalCBS.g:567:2: ( ( rule__Service__Group__0 ) )
            // InternalCBS.g:568:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalCBS.g:569:3: ( rule__Service__Group__0 )
            // InternalCBS.g:569:4: rule__Service__Group__0
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
    // InternalCBS.g:578:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalCBS.g:579:1: ( ruleInternalAction EOF )
            // InternalCBS.g:580:1: ruleInternalAction EOF
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
    // InternalCBS.g:587:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:591:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalCBS.g:592:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalCBS.g:592:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalCBS.g:593:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalCBS.g:594:3: ( rule__InternalAction__Group__0 )
            // InternalCBS.g:594:4: rule__InternalAction__Group__0
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
    // InternalCBS.g:603:1: entryRuleExternalCallAction : ruleExternalCallAction EOF ;
    public final void entryRuleExternalCallAction() throws RecognitionException {
        try {
            // InternalCBS.g:604:1: ( ruleExternalCallAction EOF )
            // InternalCBS.g:605:1: ruleExternalCallAction EOF
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
    // InternalCBS.g:612:1: ruleExternalCallAction : ( ( rule__ExternalCallAction__Group__0 ) ) ;
    public final void ruleExternalCallAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:616:2: ( ( ( rule__ExternalCallAction__Group__0 ) ) )
            // InternalCBS.g:617:2: ( ( rule__ExternalCallAction__Group__0 ) )
            {
            // InternalCBS.g:617:2: ( ( rule__ExternalCallAction__Group__0 ) )
            // InternalCBS.g:618:3: ( rule__ExternalCallAction__Group__0 )
            {
             before(grammarAccess.getExternalCallActionAccess().getGroup()); 
            // InternalCBS.g:619:3: ( rule__ExternalCallAction__Group__0 )
            // InternalCBS.g:619:4: rule__ExternalCallAction__Group__0
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
    // InternalCBS.g:628:1: entryRuleBranchAction : ruleBranchAction EOF ;
    public final void entryRuleBranchAction() throws RecognitionException {
        try {
            // InternalCBS.g:629:1: ( ruleBranchAction EOF )
            // InternalCBS.g:630:1: ruleBranchAction EOF
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
    // InternalCBS.g:637:1: ruleBranchAction : ( ( rule__BranchAction__Group__0 ) ) ;
    public final void ruleBranchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:641:2: ( ( ( rule__BranchAction__Group__0 ) ) )
            // InternalCBS.g:642:2: ( ( rule__BranchAction__Group__0 ) )
            {
            // InternalCBS.g:642:2: ( ( rule__BranchAction__Group__0 ) )
            // InternalCBS.g:643:3: ( rule__BranchAction__Group__0 )
            {
             before(grammarAccess.getBranchActionAccess().getGroup()); 
            // InternalCBS.g:644:3: ( rule__BranchAction__Group__0 )
            // InternalCBS.g:644:4: rule__BranchAction__Group__0
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


    // $ANTLR start "entryRuleBranchTransition"
    // InternalCBS.g:653:1: entryRuleBranchTransition : ruleBranchTransition EOF ;
    public final void entryRuleBranchTransition() throws RecognitionException {
        try {
            // InternalCBS.g:654:1: ( ruleBranchTransition EOF )
            // InternalCBS.g:655:1: ruleBranchTransition EOF
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
    // InternalCBS.g:662:1: ruleBranchTransition : ( ( rule__BranchTransition__Group__0 ) ) ;
    public final void ruleBranchTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:666:2: ( ( ( rule__BranchTransition__Group__0 ) ) )
            // InternalCBS.g:667:2: ( ( rule__BranchTransition__Group__0 ) )
            {
            // InternalCBS.g:667:2: ( ( rule__BranchTransition__Group__0 ) )
            // InternalCBS.g:668:3: ( rule__BranchTransition__Group__0 )
            {
             before(grammarAccess.getBranchTransitionAccess().getGroup()); 
            // InternalCBS.g:669:3: ( rule__BranchTransition__Group__0 )
            // InternalCBS.g:669:4: rule__BranchTransition__Group__0
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


    // $ANTLR start "entryRuleLoopAction"
    // InternalCBS.g:678:1: entryRuleLoopAction : ruleLoopAction EOF ;
    public final void entryRuleLoopAction() throws RecognitionException {
        try {
            // InternalCBS.g:679:1: ( ruleLoopAction EOF )
            // InternalCBS.g:680:1: ruleLoopAction EOF
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
    // InternalCBS.g:687:1: ruleLoopAction : ( ( rule__LoopAction__Group__0 ) ) ;
    public final void ruleLoopAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:691:2: ( ( ( rule__LoopAction__Group__0 ) ) )
            // InternalCBS.g:692:2: ( ( rule__LoopAction__Group__0 ) )
            {
            // InternalCBS.g:692:2: ( ( rule__LoopAction__Group__0 ) )
            // InternalCBS.g:693:3: ( rule__LoopAction__Group__0 )
            {
             before(grammarAccess.getLoopActionAccess().getGroup()); 
            // InternalCBS.g:694:3: ( rule__LoopAction__Group__0 )
            // InternalCBS.g:694:4: rule__LoopAction__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalCBS.g:703:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCBS.g:704:1: ( ruleEString EOF )
            // InternalCBS.g:705:1: ruleEString EOF
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
    // InternalCBS.g:712:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:716:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCBS.g:717:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCBS.g:717:2: ( ( rule__EString__Alternatives ) )
            // InternalCBS.g:718:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCBS.g:719:3: ( rule__EString__Alternatives )
            // InternalCBS.g:719:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleSimpleTypeEnum"
    // InternalCBS.g:728:1: ruleSimpleTypeEnum : ( ( rule__SimpleTypeEnum__Alternatives ) ) ;
    public final void ruleSimpleTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:732:1: ( ( ( rule__SimpleTypeEnum__Alternatives ) ) )
            // InternalCBS.g:733:2: ( ( rule__SimpleTypeEnum__Alternatives ) )
            {
            // InternalCBS.g:733:2: ( ( rule__SimpleTypeEnum__Alternatives ) )
            // InternalCBS.g:734:3: ( rule__SimpleTypeEnum__Alternatives )
            {
             before(grammarAccess.getSimpleTypeEnumAccess().getAlternatives()); 
            // InternalCBS.g:735:3: ( rule__SimpleTypeEnum__Alternatives )
            // InternalCBS.g:735:4: rule__SimpleTypeEnum__Alternatives
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


    // $ANTLR start "ruleCollectionTypeEnum"
    // InternalCBS.g:744:1: ruleCollectionTypeEnum : ( ( rule__CollectionTypeEnum__Alternatives ) ) ;
    public final void ruleCollectionTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:748:1: ( ( ( rule__CollectionTypeEnum__Alternatives ) ) )
            // InternalCBS.g:749:2: ( ( rule__CollectionTypeEnum__Alternatives ) )
            {
            // InternalCBS.g:749:2: ( ( rule__CollectionTypeEnum__Alternatives ) )
            // InternalCBS.g:750:3: ( rule__CollectionTypeEnum__Alternatives )
            {
             before(grammarAccess.getCollectionTypeEnumAccess().getAlternatives()); 
            // InternalCBS.g:751:3: ( rule__CollectionTypeEnum__Alternatives )
            // InternalCBS.g:751:4: rule__CollectionTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CollectionTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionTypeEnum"


    // $ANTLR start "rule__AbstractAction__Alternatives"
    // InternalCBS.g:759:1: rule__AbstractAction__Alternatives : ( ( ruleInternalAction ) | ( ruleExternalCallAction ) | ( ruleBranchAction ) | ( ruleLoopAction ) );
    public final void rule__AbstractAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:763:1: ( ( ruleInternalAction ) | ( ruleExternalCallAction ) | ( ruleBranchAction ) | ( ruleLoopAction ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt1=1;
                }
                break;
            case 65:
                {
                alt1=2;
                }
                break;
            case 66:
                {
                alt1=3;
                }
                break;
            case 68:
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
                    // InternalCBS.g:764:2: ( ruleInternalAction )
                    {
                    // InternalCBS.g:764:2: ( ruleInternalAction )
                    // InternalCBS.g:765:3: ruleInternalAction
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
                    // InternalCBS.g:770:2: ( ruleExternalCallAction )
                    {
                    // InternalCBS.g:770:2: ( ruleExternalCallAction )
                    // InternalCBS.g:771:3: ruleExternalCallAction
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
                    // InternalCBS.g:776:2: ( ruleBranchAction )
                    {
                    // InternalCBS.g:776:2: ( ruleBranchAction )
                    // InternalCBS.g:777:3: ruleBranchAction
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
                    // InternalCBS.g:782:2: ( ruleLoopAction )
                    {
                    // InternalCBS.g:782:2: ( ruleLoopAction )
                    // InternalCBS.g:783:3: ruleLoopAction
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
    // InternalCBS.g:792:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:796:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCBS.g:797:2: ( RULE_STRING )
                    {
                    // InternalCBS.g:797:2: ( RULE_STRING )
                    // InternalCBS.g:798:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:803:2: ( RULE_ID )
                    {
                    // InternalCBS.g:803:2: ( RULE_ID )
                    // InternalCBS.g:804:3: RULE_ID
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
    // InternalCBS.g:813:1: rule__SimpleTypeEnum__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Char' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) );
    public final void rule__SimpleTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:817:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Char' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Long' ) ) )
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
                    // InternalCBS.g:818:2: ( ( 'String' ) )
                    {
                    // InternalCBS.g:818:2: ( ( 'String' ) )
                    // InternalCBS.g:819:3: ( 'String' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalCBS.g:820:3: ( 'String' )
                    // InternalCBS.g:820:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:824:2: ( ( 'Int' ) )
                    {
                    // InternalCBS.g:824:2: ( ( 'Int' ) )
                    // InternalCBS.g:825:3: ( 'Int' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalCBS.g:826:3: ( 'Int' )
                    // InternalCBS.g:826:4: 'Int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCBS.g:830:2: ( ( 'Boolean' ) )
                    {
                    // InternalCBS.g:830:2: ( ( 'Boolean' ) )
                    // InternalCBS.g:831:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalCBS.g:832:3: ( 'Boolean' )
                    // InternalCBS.g:832:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCBS.g:836:2: ( ( 'Char' ) )
                    {
                    // InternalCBS.g:836:2: ( ( 'Char' ) )
                    // InternalCBS.g:837:3: ( 'Char' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3()); 
                    // InternalCBS.g:838:3: ( 'Char' )
                    // InternalCBS.g:838:4: 'Char'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCBS.g:842:2: ( ( 'Date' ) )
                    {
                    // InternalCBS.g:842:2: ( ( 'Date' ) )
                    // InternalCBS.g:843:3: ( 'Date' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalCBS.g:844:3: ( 'Date' )
                    // InternalCBS.g:844:4: 'Date'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCBS.g:848:2: ( ( 'Double' ) )
                    {
                    // InternalCBS.g:848:2: ( ( 'Double' ) )
                    // InternalCBS.g:849:3: ( 'Double' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // InternalCBS.g:850:3: ( 'Double' )
                    // InternalCBS.g:850:4: 'Double'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCBS.g:854:2: ( ( 'Float' ) )
                    {
                    // InternalCBS.g:854:2: ( ( 'Float' ) )
                    // InternalCBS.g:855:3: ( 'Float' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6()); 
                    // InternalCBS.g:856:3: ( 'Float' )
                    // InternalCBS.g:856:4: 'Float'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCBS.g:860:2: ( ( 'Long' ) )
                    {
                    // InternalCBS.g:860:2: ( ( 'Long' ) )
                    // InternalCBS.g:861:3: ( 'Long' )
                    {
                     before(grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7()); 
                    // InternalCBS.g:862:3: ( 'Long' )
                    // InternalCBS.g:862:4: 'Long'
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


    // $ANTLR start "rule__CollectionTypeEnum__Alternatives"
    // InternalCBS.g:870:1: rule__CollectionTypeEnum__Alternatives : ( ( ( 'List' ) ) | ( ( 'Map' ) ) );
    public final void rule__CollectionTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:874:1: ( ( ( 'List' ) ) | ( ( 'Map' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCBS.g:875:2: ( ( 'List' ) )
                    {
                    // InternalCBS.g:875:2: ( ( 'List' ) )
                    // InternalCBS.g:876:3: ( 'List' )
                    {
                     before(grammarAccess.getCollectionTypeEnumAccess().getListEnumLiteralDeclaration_0()); 
                    // InternalCBS.g:877:3: ( 'List' )
                    // InternalCBS.g:877:4: 'List'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCollectionTypeEnumAccess().getListEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCBS.g:881:2: ( ( 'Map' ) )
                    {
                    // InternalCBS.g:881:2: ( ( 'Map' ) )
                    // InternalCBS.g:882:3: ( 'Map' )
                    {
                     before(grammarAccess.getCollectionTypeEnumAccess().getMapEnumLiteralDeclaration_1()); 
                    // InternalCBS.g:883:3: ( 'Map' )
                    // InternalCBS.g:883:4: 'Map'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getCollectionTypeEnumAccess().getMapEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CollectionTypeEnum__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalCBS.g:891:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:895:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalCBS.g:896:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalCBS.g:903:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:907:1: ( ( 'System' ) )
            // InternalCBS.g:908:1: ( 'System' )
            {
            // InternalCBS.g:908:1: ( 'System' )
            // InternalCBS.g:909:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCBS.g:918:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:922:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalCBS.g:923:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalCBS.g:930:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:934:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalCBS.g:935:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalCBS.g:935:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalCBS.g:936:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalCBS.g:937:2: ( rule__System__NameAssignment_1 )
            // InternalCBS.g:937:3: rule__System__NameAssignment_1
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
    // InternalCBS.g:945:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:949:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalCBS.g:950:2: rule__System__Group__2__Impl rule__System__Group__3
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
    // InternalCBS.g:957:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:961:1: ( ( '{' ) )
            // InternalCBS.g:962:1: ( '{' )
            {
            // InternalCBS.g:962:1: ( '{' )
            // InternalCBS.g:963:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:972:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:976:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalCBS.g:977:2: rule__System__Group__3__Impl rule__System__Group__4
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
    // InternalCBS.g:984:1: rule__System__Group__3__Impl : ( ( rule__System__Group_3__0 )? ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:988:1: ( ( ( rule__System__Group_3__0 )? ) )
            // InternalCBS.g:989:1: ( ( rule__System__Group_3__0 )? )
            {
            // InternalCBS.g:989:1: ( ( rule__System__Group_3__0 )? )
            // InternalCBS.g:990:2: ( rule__System__Group_3__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_3()); 
            // InternalCBS.g:991:2: ( rule__System__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCBS.g:991:3: rule__System__Group_3__0
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
    // InternalCBS.g:999:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1003:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalCBS.g:1004:2: rule__System__Group__4__Impl rule__System__Group__5
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
    // InternalCBS.g:1011:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )? ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1015:1: ( ( ( rule__System__Group_4__0 )? ) )
            // InternalCBS.g:1016:1: ( ( rule__System__Group_4__0 )? )
            {
            // InternalCBS.g:1016:1: ( ( rule__System__Group_4__0 )? )
            // InternalCBS.g:1017:2: ( rule__System__Group_4__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // InternalCBS.g:1018:2: ( rule__System__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCBS.g:1018:3: rule__System__Group_4__0
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
    // InternalCBS.g:1026:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1030:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalCBS.g:1031:2: rule__System__Group__5__Impl rule__System__Group__6
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
    // InternalCBS.g:1038:1: rule__System__Group__5__Impl : ( ( rule__System__Group_5__0 )? ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1042:1: ( ( ( rule__System__Group_5__0 )? ) )
            // InternalCBS.g:1043:1: ( ( rule__System__Group_5__0 )? )
            {
            // InternalCBS.g:1043:1: ( ( rule__System__Group_5__0 )? )
            // InternalCBS.g:1044:2: ( rule__System__Group_5__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_5()); 
            // InternalCBS.g:1045:2: ( rule__System__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCBS.g:1045:3: rule__System__Group_5__0
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
    // InternalCBS.g:1053:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1057:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalCBS.g:1058:2: rule__System__Group__6__Impl rule__System__Group__7
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
    // InternalCBS.g:1065:1: rule__System__Group__6__Impl : ( ( rule__System__Group_6__0 )? ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1069:1: ( ( ( rule__System__Group_6__0 )? ) )
            // InternalCBS.g:1070:1: ( ( rule__System__Group_6__0 )? )
            {
            // InternalCBS.g:1070:1: ( ( rule__System__Group_6__0 )? )
            // InternalCBS.g:1071:2: ( rule__System__Group_6__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_6()); 
            // InternalCBS.g:1072:2: ( rule__System__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCBS.g:1072:3: rule__System__Group_6__0
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
    // InternalCBS.g:1080:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1084:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalCBS.g:1085:2: rule__System__Group__7__Impl rule__System__Group__8
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
    // InternalCBS.g:1092:1: rule__System__Group__7__Impl : ( 'allocation' ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1096:1: ( ( 'allocation' ) )
            // InternalCBS.g:1097:1: ( 'allocation' )
            {
            // InternalCBS.g:1097:1: ( 'allocation' )
            // InternalCBS.g:1098:2: 'allocation'
            {
             before(grammarAccess.getSystemAccess().getAllocationKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCBS.g:1107:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1111:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalCBS.g:1112:2: rule__System__Group__8__Impl rule__System__Group__9
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
    // InternalCBS.g:1119:1: rule__System__Group__8__Impl : ( ( rule__System__AllocationAssignment_8 ) ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1123:1: ( ( ( rule__System__AllocationAssignment_8 ) ) )
            // InternalCBS.g:1124:1: ( ( rule__System__AllocationAssignment_8 ) )
            {
            // InternalCBS.g:1124:1: ( ( rule__System__AllocationAssignment_8 ) )
            // InternalCBS.g:1125:2: ( rule__System__AllocationAssignment_8 )
            {
             before(grammarAccess.getSystemAccess().getAllocationAssignment_8()); 
            // InternalCBS.g:1126:2: ( rule__System__AllocationAssignment_8 )
            // InternalCBS.g:1126:3: rule__System__AllocationAssignment_8
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
    // InternalCBS.g:1134:1: rule__System__Group__9 : rule__System__Group__9__Impl ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1138:1: ( rule__System__Group__9__Impl )
            // InternalCBS.g:1139:2: rule__System__Group__9__Impl
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
    // InternalCBS.g:1145:1: rule__System__Group__9__Impl : ( '}' ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1149:1: ( ( '}' ) )
            // InternalCBS.g:1150:1: ( '}' )
            {
            // InternalCBS.g:1150:1: ( '}' )
            // InternalCBS.g:1151:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:1161:1: rule__System__Group_3__0 : rule__System__Group_3__0__Impl rule__System__Group_3__1 ;
    public final void rule__System__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1165:1: ( rule__System__Group_3__0__Impl rule__System__Group_3__1 )
            // InternalCBS.g:1166:2: rule__System__Group_3__0__Impl rule__System__Group_3__1
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
    // InternalCBS.g:1173:1: rule__System__Group_3__0__Impl : ( 'childContexts' ) ;
    public final void rule__System__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1177:1: ( ( 'childContexts' ) )
            // InternalCBS.g:1178:1: ( 'childContexts' )
            {
            // InternalCBS.g:1178:1: ( 'childContexts' )
            // InternalCBS.g:1179:2: 'childContexts'
            {
             before(grammarAccess.getSystemAccess().getChildContextsKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCBS.g:1188:1: rule__System__Group_3__1 : rule__System__Group_3__1__Impl rule__System__Group_3__2 ;
    public final void rule__System__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1192:1: ( rule__System__Group_3__1__Impl rule__System__Group_3__2 )
            // InternalCBS.g:1193:2: rule__System__Group_3__1__Impl rule__System__Group_3__2
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
    // InternalCBS.g:1200:1: rule__System__Group_3__1__Impl : ( '{' ) ;
    public final void rule__System__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1204:1: ( ( '{' ) )
            // InternalCBS.g:1205:1: ( '{' )
            {
            // InternalCBS.g:1205:1: ( '{' )
            // InternalCBS.g:1206:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:1215:1: rule__System__Group_3__2 : rule__System__Group_3__2__Impl rule__System__Group_3__3 ;
    public final void rule__System__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1219:1: ( rule__System__Group_3__2__Impl rule__System__Group_3__3 )
            // InternalCBS.g:1220:2: rule__System__Group_3__2__Impl rule__System__Group_3__3
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
    // InternalCBS.g:1227:1: rule__System__Group_3__2__Impl : ( ( rule__System__ChildContextsAssignment_3_2 ) ) ;
    public final void rule__System__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1231:1: ( ( ( rule__System__ChildContextsAssignment_3_2 ) ) )
            // InternalCBS.g:1232:1: ( ( rule__System__ChildContextsAssignment_3_2 ) )
            {
            // InternalCBS.g:1232:1: ( ( rule__System__ChildContextsAssignment_3_2 ) )
            // InternalCBS.g:1233:2: ( rule__System__ChildContextsAssignment_3_2 )
            {
             before(grammarAccess.getSystemAccess().getChildContextsAssignment_3_2()); 
            // InternalCBS.g:1234:2: ( rule__System__ChildContextsAssignment_3_2 )
            // InternalCBS.g:1234:3: rule__System__ChildContextsAssignment_3_2
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
    // InternalCBS.g:1242:1: rule__System__Group_3__3 : rule__System__Group_3__3__Impl rule__System__Group_3__4 ;
    public final void rule__System__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1246:1: ( rule__System__Group_3__3__Impl rule__System__Group_3__4 )
            // InternalCBS.g:1247:2: rule__System__Group_3__3__Impl rule__System__Group_3__4
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
    // InternalCBS.g:1254:1: rule__System__Group_3__3__Impl : ( ( rule__System__Group_3_3__0 )* ) ;
    public final void rule__System__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1258:1: ( ( ( rule__System__Group_3_3__0 )* ) )
            // InternalCBS.g:1259:1: ( ( rule__System__Group_3_3__0 )* )
            {
            // InternalCBS.g:1259:1: ( ( rule__System__Group_3_3__0 )* )
            // InternalCBS.g:1260:2: ( rule__System__Group_3_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_3_3()); 
            // InternalCBS.g:1261:2: ( rule__System__Group_3_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCBS.g:1261:3: rule__System__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__System__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCBS.g:1269:1: rule__System__Group_3__4 : rule__System__Group_3__4__Impl ;
    public final void rule__System__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1273:1: ( rule__System__Group_3__4__Impl )
            // InternalCBS.g:1274:2: rule__System__Group_3__4__Impl
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
    // InternalCBS.g:1280:1: rule__System__Group_3__4__Impl : ( '}' ) ;
    public final void rule__System__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1284:1: ( ( '}' ) )
            // InternalCBS.g:1285:1: ( '}' )
            {
            // InternalCBS.g:1285:1: ( '}' )
            // InternalCBS.g:1286:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:1296:1: rule__System__Group_3_3__0 : rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1 ;
    public final void rule__System__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1300:1: ( rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1 )
            // InternalCBS.g:1301:2: rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1
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
    // InternalCBS.g:1308:1: rule__System__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1312:1: ( ( ',' ) )
            // InternalCBS.g:1313:1: ( ',' )
            {
            // InternalCBS.g:1313:1: ( ',' )
            // InternalCBS.g:1314:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:1323:1: rule__System__Group_3_3__1 : rule__System__Group_3_3__1__Impl ;
    public final void rule__System__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1327:1: ( rule__System__Group_3_3__1__Impl )
            // InternalCBS.g:1328:2: rule__System__Group_3_3__1__Impl
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
    // InternalCBS.g:1334:1: rule__System__Group_3_3__1__Impl : ( ( rule__System__ChildContextsAssignment_3_3_1 ) ) ;
    public final void rule__System__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1338:1: ( ( ( rule__System__ChildContextsAssignment_3_3_1 ) ) )
            // InternalCBS.g:1339:1: ( ( rule__System__ChildContextsAssignment_3_3_1 ) )
            {
            // InternalCBS.g:1339:1: ( ( rule__System__ChildContextsAssignment_3_3_1 ) )
            // InternalCBS.g:1340:2: ( rule__System__ChildContextsAssignment_3_3_1 )
            {
             before(grammarAccess.getSystemAccess().getChildContextsAssignment_3_3_1()); 
            // InternalCBS.g:1341:2: ( rule__System__ChildContextsAssignment_3_3_1 )
            // InternalCBS.g:1341:3: rule__System__ChildContextsAssignment_3_3_1
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
    // InternalCBS.g:1350:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1354:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // InternalCBS.g:1355:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
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
    // InternalCBS.g:1362:1: rule__System__Group_4__0__Impl : ( 'assemblyConnectors' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1366:1: ( ( 'assemblyConnectors' ) )
            // InternalCBS.g:1367:1: ( 'assemblyConnectors' )
            {
            // InternalCBS.g:1367:1: ( 'assemblyConnectors' )
            // InternalCBS.g:1368:2: 'assemblyConnectors'
            {
             before(grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCBS.g:1377:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl rule__System__Group_4__2 ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1381:1: ( rule__System__Group_4__1__Impl rule__System__Group_4__2 )
            // InternalCBS.g:1382:2: rule__System__Group_4__1__Impl rule__System__Group_4__2
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
    // InternalCBS.g:1389:1: rule__System__Group_4__1__Impl : ( '{' ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1393:1: ( ( '{' ) )
            // InternalCBS.g:1394:1: ( '{' )
            {
            // InternalCBS.g:1394:1: ( '{' )
            // InternalCBS.g:1395:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:1404:1: rule__System__Group_4__2 : rule__System__Group_4__2__Impl rule__System__Group_4__3 ;
    public final void rule__System__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1408:1: ( rule__System__Group_4__2__Impl rule__System__Group_4__3 )
            // InternalCBS.g:1409:2: rule__System__Group_4__2__Impl rule__System__Group_4__3
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
    // InternalCBS.g:1416:1: rule__System__Group_4__2__Impl : ( ( rule__System__AssemblyConnectorsAssignment_4_2 ) ) ;
    public final void rule__System__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1420:1: ( ( ( rule__System__AssemblyConnectorsAssignment_4_2 ) ) )
            // InternalCBS.g:1421:1: ( ( rule__System__AssemblyConnectorsAssignment_4_2 ) )
            {
            // InternalCBS.g:1421:1: ( ( rule__System__AssemblyConnectorsAssignment_4_2 ) )
            // InternalCBS.g:1422:2: ( rule__System__AssemblyConnectorsAssignment_4_2 )
            {
             before(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_4_2()); 
            // InternalCBS.g:1423:2: ( rule__System__AssemblyConnectorsAssignment_4_2 )
            // InternalCBS.g:1423:3: rule__System__AssemblyConnectorsAssignment_4_2
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
    // InternalCBS.g:1431:1: rule__System__Group_4__3 : rule__System__Group_4__3__Impl rule__System__Group_4__4 ;
    public final void rule__System__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1435:1: ( rule__System__Group_4__3__Impl rule__System__Group_4__4 )
            // InternalCBS.g:1436:2: rule__System__Group_4__3__Impl rule__System__Group_4__4
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
    // InternalCBS.g:1443:1: rule__System__Group_4__3__Impl : ( ( rule__System__Group_4_3__0 )* ) ;
    public final void rule__System__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1447:1: ( ( ( rule__System__Group_4_3__0 )* ) )
            // InternalCBS.g:1448:1: ( ( rule__System__Group_4_3__0 )* )
            {
            // InternalCBS.g:1448:1: ( ( rule__System__Group_4_3__0 )* )
            // InternalCBS.g:1449:2: ( rule__System__Group_4_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_4_3()); 
            // InternalCBS.g:1450:2: ( rule__System__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCBS.g:1450:3: rule__System__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__System__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCBS.g:1458:1: rule__System__Group_4__4 : rule__System__Group_4__4__Impl ;
    public final void rule__System__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1462:1: ( rule__System__Group_4__4__Impl )
            // InternalCBS.g:1463:2: rule__System__Group_4__4__Impl
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
    // InternalCBS.g:1469:1: rule__System__Group_4__4__Impl : ( '}' ) ;
    public final void rule__System__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1473:1: ( ( '}' ) )
            // InternalCBS.g:1474:1: ( '}' )
            {
            // InternalCBS.g:1474:1: ( '}' )
            // InternalCBS.g:1475:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:1485:1: rule__System__Group_4_3__0 : rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1 ;
    public final void rule__System__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1489:1: ( rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1 )
            // InternalCBS.g:1490:2: rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1
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
    // InternalCBS.g:1497:1: rule__System__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1501:1: ( ( ',' ) )
            // InternalCBS.g:1502:1: ( ',' )
            {
            // InternalCBS.g:1502:1: ( ',' )
            // InternalCBS.g:1503:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:1512:1: rule__System__Group_4_3__1 : rule__System__Group_4_3__1__Impl ;
    public final void rule__System__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1516:1: ( rule__System__Group_4_3__1__Impl )
            // InternalCBS.g:1517:2: rule__System__Group_4_3__1__Impl
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
    // InternalCBS.g:1523:1: rule__System__Group_4_3__1__Impl : ( ( rule__System__AssemblyConnectorsAssignment_4_3_1 ) ) ;
    public final void rule__System__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1527:1: ( ( ( rule__System__AssemblyConnectorsAssignment_4_3_1 ) ) )
            // InternalCBS.g:1528:1: ( ( rule__System__AssemblyConnectorsAssignment_4_3_1 ) )
            {
            // InternalCBS.g:1528:1: ( ( rule__System__AssemblyConnectorsAssignment_4_3_1 ) )
            // InternalCBS.g:1529:2: ( rule__System__AssemblyConnectorsAssignment_4_3_1 )
            {
             before(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_4_3_1()); 
            // InternalCBS.g:1530:2: ( rule__System__AssemblyConnectorsAssignment_4_3_1 )
            // InternalCBS.g:1530:3: rule__System__AssemblyConnectorsAssignment_4_3_1
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
    // InternalCBS.g:1539:1: rule__System__Group_5__0 : rule__System__Group_5__0__Impl rule__System__Group_5__1 ;
    public final void rule__System__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1543:1: ( rule__System__Group_5__0__Impl rule__System__Group_5__1 )
            // InternalCBS.g:1544:2: rule__System__Group_5__0__Impl rule__System__Group_5__1
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
    // InternalCBS.g:1551:1: rule__System__Group_5__0__Impl : ( 'requiredDelegationConnectors' ) ;
    public final void rule__System__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1555:1: ( ( 'requiredDelegationConnectors' ) )
            // InternalCBS.g:1556:1: ( 'requiredDelegationConnectors' )
            {
            // InternalCBS.g:1556:1: ( 'requiredDelegationConnectors' )
            // InternalCBS.g:1557:2: 'requiredDelegationConnectors'
            {
             before(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCBS.g:1566:1: rule__System__Group_5__1 : rule__System__Group_5__1__Impl rule__System__Group_5__2 ;
    public final void rule__System__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1570:1: ( rule__System__Group_5__1__Impl rule__System__Group_5__2 )
            // InternalCBS.g:1571:2: rule__System__Group_5__1__Impl rule__System__Group_5__2
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
    // InternalCBS.g:1578:1: rule__System__Group_5__1__Impl : ( '{' ) ;
    public final void rule__System__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1582:1: ( ( '{' ) )
            // InternalCBS.g:1583:1: ( '{' )
            {
            // InternalCBS.g:1583:1: ( '{' )
            // InternalCBS.g:1584:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:1593:1: rule__System__Group_5__2 : rule__System__Group_5__2__Impl rule__System__Group_5__3 ;
    public final void rule__System__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1597:1: ( rule__System__Group_5__2__Impl rule__System__Group_5__3 )
            // InternalCBS.g:1598:2: rule__System__Group_5__2__Impl rule__System__Group_5__3
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
    // InternalCBS.g:1605:1: rule__System__Group_5__2__Impl : ( ( rule__System__RequiredDelegationConnectorsAssignment_5_2 ) ) ;
    public final void rule__System__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1609:1: ( ( ( rule__System__RequiredDelegationConnectorsAssignment_5_2 ) ) )
            // InternalCBS.g:1610:1: ( ( rule__System__RequiredDelegationConnectorsAssignment_5_2 ) )
            {
            // InternalCBS.g:1610:1: ( ( rule__System__RequiredDelegationConnectorsAssignment_5_2 ) )
            // InternalCBS.g:1611:2: ( rule__System__RequiredDelegationConnectorsAssignment_5_2 )
            {
             before(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsAssignment_5_2()); 
            // InternalCBS.g:1612:2: ( rule__System__RequiredDelegationConnectorsAssignment_5_2 )
            // InternalCBS.g:1612:3: rule__System__RequiredDelegationConnectorsAssignment_5_2
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
    // InternalCBS.g:1620:1: rule__System__Group_5__3 : rule__System__Group_5__3__Impl rule__System__Group_5__4 ;
    public final void rule__System__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1624:1: ( rule__System__Group_5__3__Impl rule__System__Group_5__4 )
            // InternalCBS.g:1625:2: rule__System__Group_5__3__Impl rule__System__Group_5__4
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
    // InternalCBS.g:1632:1: rule__System__Group_5__3__Impl : ( ( rule__System__Group_5_3__0 )* ) ;
    public final void rule__System__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1636:1: ( ( ( rule__System__Group_5_3__0 )* ) )
            // InternalCBS.g:1637:1: ( ( rule__System__Group_5_3__0 )* )
            {
            // InternalCBS.g:1637:1: ( ( rule__System__Group_5_3__0 )* )
            // InternalCBS.g:1638:2: ( rule__System__Group_5_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_5_3()); 
            // InternalCBS.g:1639:2: ( rule__System__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCBS.g:1639:3: rule__System__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__System__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCBS.g:1647:1: rule__System__Group_5__4 : rule__System__Group_5__4__Impl ;
    public final void rule__System__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1651:1: ( rule__System__Group_5__4__Impl )
            // InternalCBS.g:1652:2: rule__System__Group_5__4__Impl
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
    // InternalCBS.g:1658:1: rule__System__Group_5__4__Impl : ( '}' ) ;
    public final void rule__System__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1662:1: ( ( '}' ) )
            // InternalCBS.g:1663:1: ( '}' )
            {
            // InternalCBS.g:1663:1: ( '}' )
            // InternalCBS.g:1664:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:1674:1: rule__System__Group_5_3__0 : rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1 ;
    public final void rule__System__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1678:1: ( rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1 )
            // InternalCBS.g:1679:2: rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1
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
    // InternalCBS.g:1686:1: rule__System__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1690:1: ( ( ',' ) )
            // InternalCBS.g:1691:1: ( ',' )
            {
            // InternalCBS.g:1691:1: ( ',' )
            // InternalCBS.g:1692:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:1701:1: rule__System__Group_5_3__1 : rule__System__Group_5_3__1__Impl ;
    public final void rule__System__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1705:1: ( rule__System__Group_5_3__1__Impl )
            // InternalCBS.g:1706:2: rule__System__Group_5_3__1__Impl
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
    // InternalCBS.g:1712:1: rule__System__Group_5_3__1__Impl : ( ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 ) ) ;
    public final void rule__System__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1716:1: ( ( ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 ) ) )
            // InternalCBS.g:1717:1: ( ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 ) )
            {
            // InternalCBS.g:1717:1: ( ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 ) )
            // InternalCBS.g:1718:2: ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 )
            {
             before(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsAssignment_5_3_1()); 
            // InternalCBS.g:1719:2: ( rule__System__RequiredDelegationConnectorsAssignment_5_3_1 )
            // InternalCBS.g:1719:3: rule__System__RequiredDelegationConnectorsAssignment_5_3_1
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
    // InternalCBS.g:1728:1: rule__System__Group_6__0 : rule__System__Group_6__0__Impl rule__System__Group_6__1 ;
    public final void rule__System__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1732:1: ( rule__System__Group_6__0__Impl rule__System__Group_6__1 )
            // InternalCBS.g:1733:2: rule__System__Group_6__0__Impl rule__System__Group_6__1
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
    // InternalCBS.g:1740:1: rule__System__Group_6__0__Impl : ( 'providedDelegationConnectors' ) ;
    public final void rule__System__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1744:1: ( ( 'providedDelegationConnectors' ) )
            // InternalCBS.g:1745:1: ( 'providedDelegationConnectors' )
            {
            // InternalCBS.g:1745:1: ( 'providedDelegationConnectors' )
            // InternalCBS.g:1746:2: 'providedDelegationConnectors'
            {
             before(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCBS.g:1755:1: rule__System__Group_6__1 : rule__System__Group_6__1__Impl rule__System__Group_6__2 ;
    public final void rule__System__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1759:1: ( rule__System__Group_6__1__Impl rule__System__Group_6__2 )
            // InternalCBS.g:1760:2: rule__System__Group_6__1__Impl rule__System__Group_6__2
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
    // InternalCBS.g:1767:1: rule__System__Group_6__1__Impl : ( '{' ) ;
    public final void rule__System__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1771:1: ( ( '{' ) )
            // InternalCBS.g:1772:1: ( '{' )
            {
            // InternalCBS.g:1772:1: ( '{' )
            // InternalCBS.g:1773:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:1782:1: rule__System__Group_6__2 : rule__System__Group_6__2__Impl rule__System__Group_6__3 ;
    public final void rule__System__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1786:1: ( rule__System__Group_6__2__Impl rule__System__Group_6__3 )
            // InternalCBS.g:1787:2: rule__System__Group_6__2__Impl rule__System__Group_6__3
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
    // InternalCBS.g:1794:1: rule__System__Group_6__2__Impl : ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 ) ) ;
    public final void rule__System__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1798:1: ( ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 ) ) )
            // InternalCBS.g:1799:1: ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 ) )
            {
            // InternalCBS.g:1799:1: ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 ) )
            // InternalCBS.g:1800:2: ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 )
            {
             before(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsAssignment_6_2()); 
            // InternalCBS.g:1801:2: ( rule__System__ProvidedDelegationConnectorsAssignment_6_2 )
            // InternalCBS.g:1801:3: rule__System__ProvidedDelegationConnectorsAssignment_6_2
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
    // InternalCBS.g:1809:1: rule__System__Group_6__3 : rule__System__Group_6__3__Impl rule__System__Group_6__4 ;
    public final void rule__System__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1813:1: ( rule__System__Group_6__3__Impl rule__System__Group_6__4 )
            // InternalCBS.g:1814:2: rule__System__Group_6__3__Impl rule__System__Group_6__4
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
    // InternalCBS.g:1821:1: rule__System__Group_6__3__Impl : ( ( rule__System__Group_6_3__0 )* ) ;
    public final void rule__System__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1825:1: ( ( ( rule__System__Group_6_3__0 )* ) )
            // InternalCBS.g:1826:1: ( ( rule__System__Group_6_3__0 )* )
            {
            // InternalCBS.g:1826:1: ( ( rule__System__Group_6_3__0 )* )
            // InternalCBS.g:1827:2: ( rule__System__Group_6_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_6_3()); 
            // InternalCBS.g:1828:2: ( rule__System__Group_6_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCBS.g:1828:3: rule__System__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__System__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCBS.g:1836:1: rule__System__Group_6__4 : rule__System__Group_6__4__Impl ;
    public final void rule__System__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1840:1: ( rule__System__Group_6__4__Impl )
            // InternalCBS.g:1841:2: rule__System__Group_6__4__Impl
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
    // InternalCBS.g:1847:1: rule__System__Group_6__4__Impl : ( '}' ) ;
    public final void rule__System__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1851:1: ( ( '}' ) )
            // InternalCBS.g:1852:1: ( '}' )
            {
            // InternalCBS.g:1852:1: ( '}' )
            // InternalCBS.g:1853:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:1863:1: rule__System__Group_6_3__0 : rule__System__Group_6_3__0__Impl rule__System__Group_6_3__1 ;
    public final void rule__System__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1867:1: ( rule__System__Group_6_3__0__Impl rule__System__Group_6_3__1 )
            // InternalCBS.g:1868:2: rule__System__Group_6_3__0__Impl rule__System__Group_6_3__1
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
    // InternalCBS.g:1875:1: rule__System__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1879:1: ( ( ',' ) )
            // InternalCBS.g:1880:1: ( ',' )
            {
            // InternalCBS.g:1880:1: ( ',' )
            // InternalCBS.g:1881:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_6_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:1890:1: rule__System__Group_6_3__1 : rule__System__Group_6_3__1__Impl ;
    public final void rule__System__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1894:1: ( rule__System__Group_6_3__1__Impl )
            // InternalCBS.g:1895:2: rule__System__Group_6_3__1__Impl
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
    // InternalCBS.g:1901:1: rule__System__Group_6_3__1__Impl : ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 ) ) ;
    public final void rule__System__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1905:1: ( ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 ) ) )
            // InternalCBS.g:1906:1: ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 ) )
            {
            // InternalCBS.g:1906:1: ( ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 ) )
            // InternalCBS.g:1907:2: ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 )
            {
             before(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsAssignment_6_3_1()); 
            // InternalCBS.g:1908:2: ( rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 )
            // InternalCBS.g:1908:3: rule__System__ProvidedDelegationConnectorsAssignment_6_3_1
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


    // $ANTLR start "rule__Allocation__Group__0"
    // InternalCBS.g:1917:1: rule__Allocation__Group__0 : rule__Allocation__Group__0__Impl rule__Allocation__Group__1 ;
    public final void rule__Allocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1921:1: ( rule__Allocation__Group__0__Impl rule__Allocation__Group__1 )
            // InternalCBS.g:1922:2: rule__Allocation__Group__0__Impl rule__Allocation__Group__1
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
    // InternalCBS.g:1929:1: rule__Allocation__Group__0__Impl : ( 'Allocation' ) ;
    public final void rule__Allocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1933:1: ( ( 'Allocation' ) )
            // InternalCBS.g:1934:1: ( 'Allocation' )
            {
            // InternalCBS.g:1934:1: ( 'Allocation' )
            // InternalCBS.g:1935:2: 'Allocation'
            {
             before(grammarAccess.getAllocationAccess().getAllocationKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCBS.g:1944:1: rule__Allocation__Group__1 : rule__Allocation__Group__1__Impl rule__Allocation__Group__2 ;
    public final void rule__Allocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1948:1: ( rule__Allocation__Group__1__Impl rule__Allocation__Group__2 )
            // InternalCBS.g:1949:2: rule__Allocation__Group__1__Impl rule__Allocation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCBS.g:1956:1: rule__Allocation__Group__1__Impl : ( '{' ) ;
    public final void rule__Allocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1960:1: ( ( '{' ) )
            // InternalCBS.g:1961:1: ( '{' )
            {
            // InternalCBS.g:1961:1: ( '{' )
            // InternalCBS.g:1962:2: '{'
            {
             before(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:1971:1: rule__Allocation__Group__2 : rule__Allocation__Group__2__Impl rule__Allocation__Group__3 ;
    public final void rule__Allocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1975:1: ( rule__Allocation__Group__2__Impl rule__Allocation__Group__3 )
            // InternalCBS.g:1976:2: rule__Allocation__Group__2__Impl rule__Allocation__Group__3
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
    // InternalCBS.g:1983:1: rule__Allocation__Group__2__Impl : ( 'environment' ) ;
    public final void rule__Allocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:1987:1: ( ( 'environment' ) )
            // InternalCBS.g:1988:1: ( 'environment' )
            {
            // InternalCBS.g:1988:1: ( 'environment' )
            // InternalCBS.g:1989:2: 'environment'
            {
             before(grammarAccess.getAllocationAccess().getEnvironmentKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCBS.g:1998:1: rule__Allocation__Group__3 : rule__Allocation__Group__3__Impl rule__Allocation__Group__4 ;
    public final void rule__Allocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2002:1: ( rule__Allocation__Group__3__Impl rule__Allocation__Group__4 )
            // InternalCBS.g:2003:2: rule__Allocation__Group__3__Impl rule__Allocation__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCBS.g:2010:1: rule__Allocation__Group__3__Impl : ( ( rule__Allocation__EnvironmentAssignment_3 ) ) ;
    public final void rule__Allocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2014:1: ( ( ( rule__Allocation__EnvironmentAssignment_3 ) ) )
            // InternalCBS.g:2015:1: ( ( rule__Allocation__EnvironmentAssignment_3 ) )
            {
            // InternalCBS.g:2015:1: ( ( rule__Allocation__EnvironmentAssignment_3 ) )
            // InternalCBS.g:2016:2: ( rule__Allocation__EnvironmentAssignment_3 )
            {
             before(grammarAccess.getAllocationAccess().getEnvironmentAssignment_3()); 
            // InternalCBS.g:2017:2: ( rule__Allocation__EnvironmentAssignment_3 )
            // InternalCBS.g:2017:3: rule__Allocation__EnvironmentAssignment_3
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
    // InternalCBS.g:2025:1: rule__Allocation__Group__4 : rule__Allocation__Group__4__Impl rule__Allocation__Group__5 ;
    public final void rule__Allocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2029:1: ( rule__Allocation__Group__4__Impl rule__Allocation__Group__5 )
            // InternalCBS.g:2030:2: rule__Allocation__Group__4__Impl rule__Allocation__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalCBS.g:2037:1: rule__Allocation__Group__4__Impl : ( ( rule__Allocation__Group_4__0 )? ) ;
    public final void rule__Allocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2041:1: ( ( ( rule__Allocation__Group_4__0 )? ) )
            // InternalCBS.g:2042:1: ( ( rule__Allocation__Group_4__0 )? )
            {
            // InternalCBS.g:2042:1: ( ( rule__Allocation__Group_4__0 )? )
            // InternalCBS.g:2043:2: ( rule__Allocation__Group_4__0 )?
            {
             before(grammarAccess.getAllocationAccess().getGroup_4()); 
            // InternalCBS.g:2044:2: ( rule__Allocation__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCBS.g:2044:3: rule__Allocation__Group_4__0
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
    // InternalCBS.g:2052:1: rule__Allocation__Group__5 : rule__Allocation__Group__5__Impl ;
    public final void rule__Allocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2056:1: ( rule__Allocation__Group__5__Impl )
            // InternalCBS.g:2057:2: rule__Allocation__Group__5__Impl
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
    // InternalCBS.g:2063:1: rule__Allocation__Group__5__Impl : ( '}' ) ;
    public final void rule__Allocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2067:1: ( ( '}' ) )
            // InternalCBS.g:2068:1: ( '}' )
            {
            // InternalCBS.g:2068:1: ( '}' )
            // InternalCBS.g:2069:2: '}'
            {
             before(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:2079:1: rule__Allocation__Group_4__0 : rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1 ;
    public final void rule__Allocation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2083:1: ( rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1 )
            // InternalCBS.g:2084:2: rule__Allocation__Group_4__0__Impl rule__Allocation__Group_4__1
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
    // InternalCBS.g:2091:1: rule__Allocation__Group_4__0__Impl : ( 'allocationContexts' ) ;
    public final void rule__Allocation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2095:1: ( ( 'allocationContexts' ) )
            // InternalCBS.g:2096:1: ( 'allocationContexts' )
            {
            // InternalCBS.g:2096:1: ( 'allocationContexts' )
            // InternalCBS.g:2097:2: 'allocationContexts'
            {
             before(grammarAccess.getAllocationAccess().getAllocationContextsKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCBS.g:2106:1: rule__Allocation__Group_4__1 : rule__Allocation__Group_4__1__Impl rule__Allocation__Group_4__2 ;
    public final void rule__Allocation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2110:1: ( rule__Allocation__Group_4__1__Impl rule__Allocation__Group_4__2 )
            // InternalCBS.g:2111:2: rule__Allocation__Group_4__1__Impl rule__Allocation__Group_4__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCBS.g:2118:1: rule__Allocation__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Allocation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2122:1: ( ( '{' ) )
            // InternalCBS.g:2123:1: ( '{' )
            {
            // InternalCBS.g:2123:1: ( '{' )
            // InternalCBS.g:2124:2: '{'
            {
             before(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:2133:1: rule__Allocation__Group_4__2 : rule__Allocation__Group_4__2__Impl rule__Allocation__Group_4__3 ;
    public final void rule__Allocation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2137:1: ( rule__Allocation__Group_4__2__Impl rule__Allocation__Group_4__3 )
            // InternalCBS.g:2138:2: rule__Allocation__Group_4__2__Impl rule__Allocation__Group_4__3
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
    // InternalCBS.g:2145:1: rule__Allocation__Group_4__2__Impl : ( ( rule__Allocation__AllocationContextsAssignment_4_2 ) ) ;
    public final void rule__Allocation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2149:1: ( ( ( rule__Allocation__AllocationContextsAssignment_4_2 ) ) )
            // InternalCBS.g:2150:1: ( ( rule__Allocation__AllocationContextsAssignment_4_2 ) )
            {
            // InternalCBS.g:2150:1: ( ( rule__Allocation__AllocationContextsAssignment_4_2 ) )
            // InternalCBS.g:2151:2: ( rule__Allocation__AllocationContextsAssignment_4_2 )
            {
             before(grammarAccess.getAllocationAccess().getAllocationContextsAssignment_4_2()); 
            // InternalCBS.g:2152:2: ( rule__Allocation__AllocationContextsAssignment_4_2 )
            // InternalCBS.g:2152:3: rule__Allocation__AllocationContextsAssignment_4_2
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
    // InternalCBS.g:2160:1: rule__Allocation__Group_4__3 : rule__Allocation__Group_4__3__Impl rule__Allocation__Group_4__4 ;
    public final void rule__Allocation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2164:1: ( rule__Allocation__Group_4__3__Impl rule__Allocation__Group_4__4 )
            // InternalCBS.g:2165:2: rule__Allocation__Group_4__3__Impl rule__Allocation__Group_4__4
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
    // InternalCBS.g:2172:1: rule__Allocation__Group_4__3__Impl : ( ( rule__Allocation__Group_4_3__0 )* ) ;
    public final void rule__Allocation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2176:1: ( ( ( rule__Allocation__Group_4_3__0 )* ) )
            // InternalCBS.g:2177:1: ( ( rule__Allocation__Group_4_3__0 )* )
            {
            // InternalCBS.g:2177:1: ( ( rule__Allocation__Group_4_3__0 )* )
            // InternalCBS.g:2178:2: ( rule__Allocation__Group_4_3__0 )*
            {
             before(grammarAccess.getAllocationAccess().getGroup_4_3()); 
            // InternalCBS.g:2179:2: ( rule__Allocation__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCBS.g:2179:3: rule__Allocation__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Allocation__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCBS.g:2187:1: rule__Allocation__Group_4__4 : rule__Allocation__Group_4__4__Impl ;
    public final void rule__Allocation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2191:1: ( rule__Allocation__Group_4__4__Impl )
            // InternalCBS.g:2192:2: rule__Allocation__Group_4__4__Impl
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
    // InternalCBS.g:2198:1: rule__Allocation__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Allocation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2202:1: ( ( '}' ) )
            // InternalCBS.g:2203:1: ( '}' )
            {
            // InternalCBS.g:2203:1: ( '}' )
            // InternalCBS.g:2204:2: '}'
            {
             before(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:2214:1: rule__Allocation__Group_4_3__0 : rule__Allocation__Group_4_3__0__Impl rule__Allocation__Group_4_3__1 ;
    public final void rule__Allocation__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2218:1: ( rule__Allocation__Group_4_3__0__Impl rule__Allocation__Group_4_3__1 )
            // InternalCBS.g:2219:2: rule__Allocation__Group_4_3__0__Impl rule__Allocation__Group_4_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCBS.g:2226:1: rule__Allocation__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Allocation__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2230:1: ( ( ',' ) )
            // InternalCBS.g:2231:1: ( ',' )
            {
            // InternalCBS.g:2231:1: ( ',' )
            // InternalCBS.g:2232:2: ','
            {
             before(grammarAccess.getAllocationAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:2241:1: rule__Allocation__Group_4_3__1 : rule__Allocation__Group_4_3__1__Impl ;
    public final void rule__Allocation__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2245:1: ( rule__Allocation__Group_4_3__1__Impl )
            // InternalCBS.g:2246:2: rule__Allocation__Group_4_3__1__Impl
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
    // InternalCBS.g:2252:1: rule__Allocation__Group_4_3__1__Impl : ( ( rule__Allocation__AllocationContextsAssignment_4_3_1 ) ) ;
    public final void rule__Allocation__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2256:1: ( ( ( rule__Allocation__AllocationContextsAssignment_4_3_1 ) ) )
            // InternalCBS.g:2257:1: ( ( rule__Allocation__AllocationContextsAssignment_4_3_1 ) )
            {
            // InternalCBS.g:2257:1: ( ( rule__Allocation__AllocationContextsAssignment_4_3_1 ) )
            // InternalCBS.g:2258:2: ( rule__Allocation__AllocationContextsAssignment_4_3_1 )
            {
             before(grammarAccess.getAllocationAccess().getAllocationContextsAssignment_4_3_1()); 
            // InternalCBS.g:2259:2: ( rule__Allocation__AllocationContextsAssignment_4_3_1 )
            // InternalCBS.g:2259:3: rule__Allocation__AllocationContextsAssignment_4_3_1
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


    // $ANTLR start "rule__AllocationContext__Group__0"
    // InternalCBS.g:2268:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2272:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalCBS.g:2273:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
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
    // InternalCBS.g:2280:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2284:1: ( ( 'AllocationContext' ) )
            // InternalCBS.g:2285:1: ( 'AllocationContext' )
            {
            // InternalCBS.g:2285:1: ( 'AllocationContext' )
            // InternalCBS.g:2286:2: 'AllocationContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCBS.g:2295:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2299:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalCBS.g:2300:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCBS.g:2307:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2311:1: ( ( '{' ) )
            // InternalCBS.g:2312:1: ( '{' )
            {
            // InternalCBS.g:2312:1: ( '{' )
            // InternalCBS.g:2313:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:2322:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2326:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalCBS.g:2327:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
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
    // InternalCBS.g:2334:1: rule__AllocationContext__Group__2__Impl : ( 'container' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2338:1: ( ( 'container' ) )
            // InternalCBS.g:2339:1: ( 'container' )
            {
            // InternalCBS.g:2339:1: ( 'container' )
            // InternalCBS.g:2340:2: 'container'
            {
             before(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCBS.g:2349:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2353:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalCBS.g:2354:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalCBS.g:2361:1: rule__AllocationContext__Group__3__Impl : ( ( rule__AllocationContext__ContainerAssignment_3 ) ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2365:1: ( ( ( rule__AllocationContext__ContainerAssignment_3 ) ) )
            // InternalCBS.g:2366:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            {
            // InternalCBS.g:2366:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            // InternalCBS.g:2367:2: ( rule__AllocationContext__ContainerAssignment_3 )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 
            // InternalCBS.g:2368:2: ( rule__AllocationContext__ContainerAssignment_3 )
            // InternalCBS.g:2368:3: rule__AllocationContext__ContainerAssignment_3
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
    // InternalCBS.g:2376:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2380:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalCBS.g:2381:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
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
    // InternalCBS.g:2388:1: rule__AllocationContext__Group__4__Impl : ( 'allocates' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2392:1: ( ( 'allocates' ) )
            // InternalCBS.g:2393:1: ( 'allocates' )
            {
            // InternalCBS.g:2393:1: ( 'allocates' )
            // InternalCBS.g:2394:2: 'allocates'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatesKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCBS.g:2403:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2407:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalCBS.g:2408:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
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
    // InternalCBS.g:2415:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AllocatesAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2419:1: ( ( ( rule__AllocationContext__AllocatesAssignment_5 ) ) )
            // InternalCBS.g:2420:1: ( ( rule__AllocationContext__AllocatesAssignment_5 ) )
            {
            // InternalCBS.g:2420:1: ( ( rule__AllocationContext__AllocatesAssignment_5 ) )
            // InternalCBS.g:2421:2: ( rule__AllocationContext__AllocatesAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatesAssignment_5()); 
            // InternalCBS.g:2422:2: ( rule__AllocationContext__AllocatesAssignment_5 )
            // InternalCBS.g:2422:3: rule__AllocationContext__AllocatesAssignment_5
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
    // InternalCBS.g:2430:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2434:1: ( rule__AllocationContext__Group__6__Impl )
            // InternalCBS.g:2435:2: rule__AllocationContext__Group__6__Impl
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
    // InternalCBS.g:2441:1: rule__AllocationContext__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2445:1: ( ( '}' ) )
            // InternalCBS.g:2446:1: ( '}' )
            {
            // InternalCBS.g:2446:1: ( '}' )
            // InternalCBS.g:2447:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:2457:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2461:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalCBS.g:2462:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCBS.g:2469:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2473:1: ( ( () ) )
            // InternalCBS.g:2474:1: ( () )
            {
            // InternalCBS.g:2474:1: ( () )
            // InternalCBS.g:2475:2: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // InternalCBS.g:2476:2: ()
            // InternalCBS.g:2476:3: 
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
    // InternalCBS.g:2484:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2488:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalCBS.g:2489:2: rule__Container__Group__1__Impl rule__Container__Group__2
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
    // InternalCBS.g:2496:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2500:1: ( ( 'Container' ) )
            // InternalCBS.g:2501:1: ( 'Container' )
            {
            // InternalCBS.g:2501:1: ( 'Container' )
            // InternalCBS.g:2502:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCBS.g:2511:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2515:1: ( rule__Container__Group__2__Impl )
            // InternalCBS.g:2516:2: rule__Container__Group__2__Impl
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
    // InternalCBS.g:2522:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2526:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalCBS.g:2527:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalCBS.g:2527:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalCBS.g:2528:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalCBS.g:2529:2: ( rule__Container__NameAssignment_2 )
            // InternalCBS.g:2529:3: rule__Container__NameAssignment_2
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
    // InternalCBS.g:2538:1: rule__Linker__Group__0 : rule__Linker__Group__0__Impl rule__Linker__Group__1 ;
    public final void rule__Linker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2542:1: ( rule__Linker__Group__0__Impl rule__Linker__Group__1 )
            // InternalCBS.g:2543:2: rule__Linker__Group__0__Impl rule__Linker__Group__1
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
    // InternalCBS.g:2550:1: rule__Linker__Group__0__Impl : ( 'Linker' ) ;
    public final void rule__Linker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2554:1: ( ( 'Linker' ) )
            // InternalCBS.g:2555:1: ( 'Linker' )
            {
            // InternalCBS.g:2555:1: ( 'Linker' )
            // InternalCBS.g:2556:2: 'Linker'
            {
             before(grammarAccess.getLinkerAccess().getLinkerKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCBS.g:2565:1: rule__Linker__Group__1 : rule__Linker__Group__1__Impl rule__Linker__Group__2 ;
    public final void rule__Linker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2569:1: ( rule__Linker__Group__1__Impl rule__Linker__Group__2 )
            // InternalCBS.g:2570:2: rule__Linker__Group__1__Impl rule__Linker__Group__2
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
    // InternalCBS.g:2577:1: rule__Linker__Group__1__Impl : ( ( rule__Linker__NameAssignment_1 ) ) ;
    public final void rule__Linker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2581:1: ( ( ( rule__Linker__NameAssignment_1 ) ) )
            // InternalCBS.g:2582:1: ( ( rule__Linker__NameAssignment_1 ) )
            {
            // InternalCBS.g:2582:1: ( ( rule__Linker__NameAssignment_1 ) )
            // InternalCBS.g:2583:2: ( rule__Linker__NameAssignment_1 )
            {
             before(grammarAccess.getLinkerAccess().getNameAssignment_1()); 
            // InternalCBS.g:2584:2: ( rule__Linker__NameAssignment_1 )
            // InternalCBS.g:2584:3: rule__Linker__NameAssignment_1
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
    // InternalCBS.g:2592:1: rule__Linker__Group__2 : rule__Linker__Group__2__Impl rule__Linker__Group__3 ;
    public final void rule__Linker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2596:1: ( rule__Linker__Group__2__Impl rule__Linker__Group__3 )
            // InternalCBS.g:2597:2: rule__Linker__Group__2__Impl rule__Linker__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCBS.g:2604:1: rule__Linker__Group__2__Impl : ( '{' ) ;
    public final void rule__Linker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2608:1: ( ( '{' ) )
            // InternalCBS.g:2609:1: ( '{' )
            {
            // InternalCBS.g:2609:1: ( '{' )
            // InternalCBS.g:2610:2: '{'
            {
             before(grammarAccess.getLinkerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:2619:1: rule__Linker__Group__3 : rule__Linker__Group__3__Impl rule__Linker__Group__4 ;
    public final void rule__Linker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2623:1: ( rule__Linker__Group__3__Impl rule__Linker__Group__4 )
            // InternalCBS.g:2624:2: rule__Linker__Group__3__Impl rule__Linker__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalCBS.g:2631:1: rule__Linker__Group__3__Impl : ( 'links' ) ;
    public final void rule__Linker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2635:1: ( ( 'links' ) )
            // InternalCBS.g:2636:1: ( 'links' )
            {
            // InternalCBS.g:2636:1: ( 'links' )
            // InternalCBS.g:2637:2: 'links'
            {
             before(grammarAccess.getLinkerAccess().getLinksKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCBS.g:2646:1: rule__Linker__Group__4 : rule__Linker__Group__4__Impl rule__Linker__Group__5 ;
    public final void rule__Linker__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2650:1: ( rule__Linker__Group__4__Impl rule__Linker__Group__5 )
            // InternalCBS.g:2651:2: rule__Linker__Group__4__Impl rule__Linker__Group__5
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
    // InternalCBS.g:2658:1: rule__Linker__Group__4__Impl : ( '(' ) ;
    public final void rule__Linker__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2662:1: ( ( '(' ) )
            // InternalCBS.g:2663:1: ( '(' )
            {
            // InternalCBS.g:2663:1: ( '(' )
            // InternalCBS.g:2664:2: '('
            {
             before(grammarAccess.getLinkerAccess().getLeftParenthesisKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCBS.g:2673:1: rule__Linker__Group__5 : rule__Linker__Group__5__Impl rule__Linker__Group__6 ;
    public final void rule__Linker__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2677:1: ( rule__Linker__Group__5__Impl rule__Linker__Group__6 )
            // InternalCBS.g:2678:2: rule__Linker__Group__5__Impl rule__Linker__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalCBS.g:2685:1: rule__Linker__Group__5__Impl : ( ( rule__Linker__LinksAssignment_5 ) ) ;
    public final void rule__Linker__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2689:1: ( ( ( rule__Linker__LinksAssignment_5 ) ) )
            // InternalCBS.g:2690:1: ( ( rule__Linker__LinksAssignment_5 ) )
            {
            // InternalCBS.g:2690:1: ( ( rule__Linker__LinksAssignment_5 ) )
            // InternalCBS.g:2691:2: ( rule__Linker__LinksAssignment_5 )
            {
             before(grammarAccess.getLinkerAccess().getLinksAssignment_5()); 
            // InternalCBS.g:2692:2: ( rule__Linker__LinksAssignment_5 )
            // InternalCBS.g:2692:3: rule__Linker__LinksAssignment_5
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
    // InternalCBS.g:2700:1: rule__Linker__Group__6 : rule__Linker__Group__6__Impl rule__Linker__Group__7 ;
    public final void rule__Linker__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2704:1: ( rule__Linker__Group__6__Impl rule__Linker__Group__7 )
            // InternalCBS.g:2705:2: rule__Linker__Group__6__Impl rule__Linker__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalCBS.g:2712:1: rule__Linker__Group__6__Impl : ( ( rule__Linker__Group_6__0 )* ) ;
    public final void rule__Linker__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2716:1: ( ( ( rule__Linker__Group_6__0 )* ) )
            // InternalCBS.g:2717:1: ( ( rule__Linker__Group_6__0 )* )
            {
            // InternalCBS.g:2717:1: ( ( rule__Linker__Group_6__0 )* )
            // InternalCBS.g:2718:2: ( rule__Linker__Group_6__0 )*
            {
             before(grammarAccess.getLinkerAccess().getGroup_6()); 
            // InternalCBS.g:2719:2: ( rule__Linker__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCBS.g:2719:3: rule__Linker__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Linker__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCBS.g:2727:1: rule__Linker__Group__7 : rule__Linker__Group__7__Impl rule__Linker__Group__8 ;
    public final void rule__Linker__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2731:1: ( rule__Linker__Group__7__Impl rule__Linker__Group__8 )
            // InternalCBS.g:2732:2: rule__Linker__Group__7__Impl rule__Linker__Group__8
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
    // InternalCBS.g:2739:1: rule__Linker__Group__7__Impl : ( ')' ) ;
    public final void rule__Linker__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2743:1: ( ( ')' ) )
            // InternalCBS.g:2744:1: ( ')' )
            {
            // InternalCBS.g:2744:1: ( ')' )
            // InternalCBS.g:2745:2: ')'
            {
             before(grammarAccess.getLinkerAccess().getRightParenthesisKeyword_7()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCBS.g:2754:1: rule__Linker__Group__8 : rule__Linker__Group__8__Impl ;
    public final void rule__Linker__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2758:1: ( rule__Linker__Group__8__Impl )
            // InternalCBS.g:2759:2: rule__Linker__Group__8__Impl
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
    // InternalCBS.g:2765:1: rule__Linker__Group__8__Impl : ( '}' ) ;
    public final void rule__Linker__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2769:1: ( ( '}' ) )
            // InternalCBS.g:2770:1: ( '}' )
            {
            // InternalCBS.g:2770:1: ( '}' )
            // InternalCBS.g:2771:2: '}'
            {
             before(grammarAccess.getLinkerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:2781:1: rule__Linker__Group_6__0 : rule__Linker__Group_6__0__Impl rule__Linker__Group_6__1 ;
    public final void rule__Linker__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2785:1: ( rule__Linker__Group_6__0__Impl rule__Linker__Group_6__1 )
            // InternalCBS.g:2786:2: rule__Linker__Group_6__0__Impl rule__Linker__Group_6__1
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
    // InternalCBS.g:2793:1: rule__Linker__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Linker__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2797:1: ( ( ',' ) )
            // InternalCBS.g:2798:1: ( ',' )
            {
            // InternalCBS.g:2798:1: ( ',' )
            // InternalCBS.g:2799:2: ','
            {
             before(grammarAccess.getLinkerAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:2808:1: rule__Linker__Group_6__1 : rule__Linker__Group_6__1__Impl ;
    public final void rule__Linker__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2812:1: ( rule__Linker__Group_6__1__Impl )
            // InternalCBS.g:2813:2: rule__Linker__Group_6__1__Impl
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
    // InternalCBS.g:2819:1: rule__Linker__Group_6__1__Impl : ( ( rule__Linker__LinksAssignment_6_1 ) ) ;
    public final void rule__Linker__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2823:1: ( ( ( rule__Linker__LinksAssignment_6_1 ) ) )
            // InternalCBS.g:2824:1: ( ( rule__Linker__LinksAssignment_6_1 ) )
            {
            // InternalCBS.g:2824:1: ( ( rule__Linker__LinksAssignment_6_1 ) )
            // InternalCBS.g:2825:2: ( rule__Linker__LinksAssignment_6_1 )
            {
             before(grammarAccess.getLinkerAccess().getLinksAssignment_6_1()); 
            // InternalCBS.g:2826:2: ( rule__Linker__LinksAssignment_6_1 )
            // InternalCBS.g:2826:3: rule__Linker__LinksAssignment_6_1
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


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalCBS.g:2835:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2839:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalCBS.g:2840:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
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
    // InternalCBS.g:2847:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2851:1: ( ( 'AssemblyContext' ) )
            // InternalCBS.g:2852:1: ( 'AssemblyContext' )
            {
            // InternalCBS.g:2852:1: ( 'AssemblyContext' )
            // InternalCBS.g:2853:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCBS.g:2862:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2866:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalCBS.g:2867:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
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
    // InternalCBS.g:2874:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2878:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalCBS.g:2879:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalCBS.g:2879:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalCBS.g:2880:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalCBS.g:2881:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalCBS.g:2881:3: rule__AssemblyContext__NameAssignment_1
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
    // InternalCBS.g:2889:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2893:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalCBS.g:2894:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCBS.g:2901:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2905:1: ( ( '{' ) )
            // InternalCBS.g:2906:1: ( '{' )
            {
            // InternalCBS.g:2906:1: ( '{' )
            // InternalCBS.g:2907:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:2916:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2920:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalCBS.g:2921:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
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
    // InternalCBS.g:2928:1: rule__AssemblyContext__Group__3__Impl : ( 'instantiates' ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2932:1: ( ( 'instantiates' ) )
            // InternalCBS.g:2933:1: ( 'instantiates' )
            {
            // InternalCBS.g:2933:1: ( 'instantiates' )
            // InternalCBS.g:2934:2: 'instantiates'
            {
             before(grammarAccess.getAssemblyContextAccess().getInstantiatesKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCBS.g:2943:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2947:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalCBS.g:2948:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalCBS.g:2955:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__InstantiatesAssignment_4 ) ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2959:1: ( ( ( rule__AssemblyContext__InstantiatesAssignment_4 ) ) )
            // InternalCBS.g:2960:1: ( ( rule__AssemblyContext__InstantiatesAssignment_4 ) )
            {
            // InternalCBS.g:2960:1: ( ( rule__AssemblyContext__InstantiatesAssignment_4 ) )
            // InternalCBS.g:2961:2: ( rule__AssemblyContext__InstantiatesAssignment_4 )
            {
             before(grammarAccess.getAssemblyContextAccess().getInstantiatesAssignment_4()); 
            // InternalCBS.g:2962:2: ( rule__AssemblyContext__InstantiatesAssignment_4 )
            // InternalCBS.g:2962:3: rule__AssemblyContext__InstantiatesAssignment_4
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
    // InternalCBS.g:2970:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2974:1: ( rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 )
            // InternalCBS.g:2975:2: rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalCBS.g:2982:1: rule__AssemblyContext__Group__5__Impl : ( ( rule__AssemblyContext__Group_5__0 )? ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:2986:1: ( ( ( rule__AssemblyContext__Group_5__0 )? ) )
            // InternalCBS.g:2987:1: ( ( rule__AssemblyContext__Group_5__0 )? )
            {
            // InternalCBS.g:2987:1: ( ( rule__AssemblyContext__Group_5__0 )? )
            // InternalCBS.g:2988:2: ( rule__AssemblyContext__Group_5__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_5()); 
            // InternalCBS.g:2989:2: ( rule__AssemblyContext__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCBS.g:2989:3: rule__AssemblyContext__Group_5__0
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
    // InternalCBS.g:2997:1: rule__AssemblyContext__Group__6 : rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 ;
    public final void rule__AssemblyContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3001:1: ( rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 )
            // InternalCBS.g:3002:2: rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalCBS.g:3009:1: rule__AssemblyContext__Group__6__Impl : ( ( rule__AssemblyContext__Group_6__0 )? ) ;
    public final void rule__AssemblyContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3013:1: ( ( ( rule__AssemblyContext__Group_6__0 )? ) )
            // InternalCBS.g:3014:1: ( ( rule__AssemblyContext__Group_6__0 )? )
            {
            // InternalCBS.g:3014:1: ( ( rule__AssemblyContext__Group_6__0 )? )
            // InternalCBS.g:3015:2: ( rule__AssemblyContext__Group_6__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_6()); 
            // InternalCBS.g:3016:2: ( rule__AssemblyContext__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCBS.g:3016:3: rule__AssemblyContext__Group_6__0
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
    // InternalCBS.g:3024:1: rule__AssemblyContext__Group__7 : rule__AssemblyContext__Group__7__Impl ;
    public final void rule__AssemblyContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3028:1: ( rule__AssemblyContext__Group__7__Impl )
            // InternalCBS.g:3029:2: rule__AssemblyContext__Group__7__Impl
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
    // InternalCBS.g:3035:1: rule__AssemblyContext__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3039:1: ( ( '}' ) )
            // InternalCBS.g:3040:1: ( '}' )
            {
            // InternalCBS.g:3040:1: ( '}' )
            // InternalCBS.g:3041:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:3051:1: rule__AssemblyContext__Group_5__0 : rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1 ;
    public final void rule__AssemblyContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3055:1: ( rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1 )
            // InternalCBS.g:3056:2: rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1
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
    // InternalCBS.g:3063:1: rule__AssemblyContext__Group_5__0__Impl : ( 'providedRoles' ) ;
    public final void rule__AssemblyContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3067:1: ( ( 'providedRoles' ) )
            // InternalCBS.g:3068:1: ( 'providedRoles' )
            {
            // InternalCBS.g:3068:1: ( 'providedRoles' )
            // InternalCBS.g:3069:2: 'providedRoles'
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCBS.g:3078:1: rule__AssemblyContext__Group_5__1 : rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2 ;
    public final void rule__AssemblyContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3082:1: ( rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2 )
            // InternalCBS.g:3083:2: rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalCBS.g:3090:1: rule__AssemblyContext__Group_5__1__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3094:1: ( ( '{' ) )
            // InternalCBS.g:3095:1: ( '{' )
            {
            // InternalCBS.g:3095:1: ( '{' )
            // InternalCBS.g:3096:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:3105:1: rule__AssemblyContext__Group_5__2 : rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3 ;
    public final void rule__AssemblyContext__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3109:1: ( rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3 )
            // InternalCBS.g:3110:2: rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3
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
    // InternalCBS.g:3117:1: rule__AssemblyContext__Group_5__2__Impl : ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 ) ) ;
    public final void rule__AssemblyContext__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3121:1: ( ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 ) ) )
            // InternalCBS.g:3122:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 ) )
            {
            // InternalCBS.g:3122:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 ) )
            // InternalCBS.g:3123:2: ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_5_2()); 
            // InternalCBS.g:3124:2: ( rule__AssemblyContext__ProvidedRolesAssignment_5_2 )
            // InternalCBS.g:3124:3: rule__AssemblyContext__ProvidedRolesAssignment_5_2
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
    // InternalCBS.g:3132:1: rule__AssemblyContext__Group_5__3 : rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4 ;
    public final void rule__AssemblyContext__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3136:1: ( rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4 )
            // InternalCBS.g:3137:2: rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4
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
    // InternalCBS.g:3144:1: rule__AssemblyContext__Group_5__3__Impl : ( ( rule__AssemblyContext__Group_5_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3148:1: ( ( ( rule__AssemblyContext__Group_5_3__0 )* ) )
            // InternalCBS.g:3149:1: ( ( rule__AssemblyContext__Group_5_3__0 )* )
            {
            // InternalCBS.g:3149:1: ( ( rule__AssemblyContext__Group_5_3__0 )* )
            // InternalCBS.g:3150:2: ( rule__AssemblyContext__Group_5_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_5_3()); 
            // InternalCBS.g:3151:2: ( rule__AssemblyContext__Group_5_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCBS.g:3151:3: rule__AssemblyContext__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AssemblyContext__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalCBS.g:3159:1: rule__AssemblyContext__Group_5__4 : rule__AssemblyContext__Group_5__4__Impl ;
    public final void rule__AssemblyContext__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3163:1: ( rule__AssemblyContext__Group_5__4__Impl )
            // InternalCBS.g:3164:2: rule__AssemblyContext__Group_5__4__Impl
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
    // InternalCBS.g:3170:1: rule__AssemblyContext__Group_5__4__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3174:1: ( ( '}' ) )
            // InternalCBS.g:3175:1: ( '}' )
            {
            // InternalCBS.g:3175:1: ( '}' )
            // InternalCBS.g:3176:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:3186:1: rule__AssemblyContext__Group_5_3__0 : rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1 ;
    public final void rule__AssemblyContext__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3190:1: ( rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1 )
            // InternalCBS.g:3191:2: rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCBS.g:3198:1: rule__AssemblyContext__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3202:1: ( ( ',' ) )
            // InternalCBS.g:3203:1: ( ',' )
            {
            // InternalCBS.g:3203:1: ( ',' )
            // InternalCBS.g:3204:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:3213:1: rule__AssemblyContext__Group_5_3__1 : rule__AssemblyContext__Group_5_3__1__Impl ;
    public final void rule__AssemblyContext__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3217:1: ( rule__AssemblyContext__Group_5_3__1__Impl )
            // InternalCBS.g:3218:2: rule__AssemblyContext__Group_5_3__1__Impl
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
    // InternalCBS.g:3224:1: rule__AssemblyContext__Group_5_3__1__Impl : ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3228:1: ( ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 ) ) )
            // InternalCBS.g:3229:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 ) )
            {
            // InternalCBS.g:3229:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 ) )
            // InternalCBS.g:3230:2: ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_5_3_1()); 
            // InternalCBS.g:3231:2: ( rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 )
            // InternalCBS.g:3231:3: rule__AssemblyContext__ProvidedRolesAssignment_5_3_1
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
    // InternalCBS.g:3240:1: rule__AssemblyContext__Group_6__0 : rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1 ;
    public final void rule__AssemblyContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3244:1: ( rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1 )
            // InternalCBS.g:3245:2: rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1
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
    // InternalCBS.g:3252:1: rule__AssemblyContext__Group_6__0__Impl : ( 'requiredRoles' ) ;
    public final void rule__AssemblyContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3256:1: ( ( 'requiredRoles' ) )
            // InternalCBS.g:3257:1: ( 'requiredRoles' )
            {
            // InternalCBS.g:3257:1: ( 'requiredRoles' )
            // InternalCBS.g:3258:2: 'requiredRoles'
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCBS.g:3267:1: rule__AssemblyContext__Group_6__1 : rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2 ;
    public final void rule__AssemblyContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3271:1: ( rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2 )
            // InternalCBS.g:3272:2: rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalCBS.g:3279:1: rule__AssemblyContext__Group_6__1__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3283:1: ( ( '{' ) )
            // InternalCBS.g:3284:1: ( '{' )
            {
            // InternalCBS.g:3284:1: ( '{' )
            // InternalCBS.g:3285:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:3294:1: rule__AssemblyContext__Group_6__2 : rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3 ;
    public final void rule__AssemblyContext__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3298:1: ( rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3 )
            // InternalCBS.g:3299:2: rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3
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
    // InternalCBS.g:3306:1: rule__AssemblyContext__Group_6__2__Impl : ( ( rule__AssemblyContext__RequiredRolesAssignment_6_2 ) ) ;
    public final void rule__AssemblyContext__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3310:1: ( ( ( rule__AssemblyContext__RequiredRolesAssignment_6_2 ) ) )
            // InternalCBS.g:3311:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_6_2 ) )
            {
            // InternalCBS.g:3311:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_6_2 ) )
            // InternalCBS.g:3312:2: ( rule__AssemblyContext__RequiredRolesAssignment_6_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_6_2()); 
            // InternalCBS.g:3313:2: ( rule__AssemblyContext__RequiredRolesAssignment_6_2 )
            // InternalCBS.g:3313:3: rule__AssemblyContext__RequiredRolesAssignment_6_2
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
    // InternalCBS.g:3321:1: rule__AssemblyContext__Group_6__3 : rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4 ;
    public final void rule__AssemblyContext__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3325:1: ( rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4 )
            // InternalCBS.g:3326:2: rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4
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
    // InternalCBS.g:3333:1: rule__AssemblyContext__Group_6__3__Impl : ( ( rule__AssemblyContext__Group_6_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3337:1: ( ( ( rule__AssemblyContext__Group_6_3__0 )* ) )
            // InternalCBS.g:3338:1: ( ( rule__AssemblyContext__Group_6_3__0 )* )
            {
            // InternalCBS.g:3338:1: ( ( rule__AssemblyContext__Group_6_3__0 )* )
            // InternalCBS.g:3339:2: ( rule__AssemblyContext__Group_6_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_6_3()); 
            // InternalCBS.g:3340:2: ( rule__AssemblyContext__Group_6_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCBS.g:3340:3: rule__AssemblyContext__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AssemblyContext__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalCBS.g:3348:1: rule__AssemblyContext__Group_6__4 : rule__AssemblyContext__Group_6__4__Impl ;
    public final void rule__AssemblyContext__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3352:1: ( rule__AssemblyContext__Group_6__4__Impl )
            // InternalCBS.g:3353:2: rule__AssemblyContext__Group_6__4__Impl
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
    // InternalCBS.g:3359:1: rule__AssemblyContext__Group_6__4__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3363:1: ( ( '}' ) )
            // InternalCBS.g:3364:1: ( '}' )
            {
            // InternalCBS.g:3364:1: ( '}' )
            // InternalCBS.g:3365:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:3375:1: rule__AssemblyContext__Group_6_3__0 : rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1 ;
    public final void rule__AssemblyContext__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3379:1: ( rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1 )
            // InternalCBS.g:3380:2: rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCBS.g:3387:1: rule__AssemblyContext__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3391:1: ( ( ',' ) )
            // InternalCBS.g:3392:1: ( ',' )
            {
            // InternalCBS.g:3392:1: ( ',' )
            // InternalCBS.g:3393:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:3402:1: rule__AssemblyContext__Group_6_3__1 : rule__AssemblyContext__Group_6_3__1__Impl ;
    public final void rule__AssemblyContext__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3406:1: ( rule__AssemblyContext__Group_6_3__1__Impl )
            // InternalCBS.g:3407:2: rule__AssemblyContext__Group_6_3__1__Impl
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
    // InternalCBS.g:3413:1: rule__AssemblyContext__Group_6_3__1__Impl : ( ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3417:1: ( ( ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 ) ) )
            // InternalCBS.g:3418:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 ) )
            {
            // InternalCBS.g:3418:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 ) )
            // InternalCBS.g:3419:2: ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_6_3_1()); 
            // InternalCBS.g:3420:2: ( rule__AssemblyContext__RequiredRolesAssignment_6_3_1 )
            // InternalCBS.g:3420:3: rule__AssemblyContext__RequiredRolesAssignment_6_3_1
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
    // InternalCBS.g:3429:1: rule__AssemblyConnector__Group__0 : rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 ;
    public final void rule__AssemblyConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3433:1: ( rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 )
            // InternalCBS.g:3434:2: rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1
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
    // InternalCBS.g:3441:1: rule__AssemblyConnector__Group__0__Impl : ( 'AssemblyConnector' ) ;
    public final void rule__AssemblyConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3445:1: ( ( 'AssemblyConnector' ) )
            // InternalCBS.g:3446:1: ( 'AssemblyConnector' )
            {
            // InternalCBS.g:3446:1: ( 'AssemblyConnector' )
            // InternalCBS.g:3447:2: 'AssemblyConnector'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCBS.g:3456:1: rule__AssemblyConnector__Group__1 : rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 ;
    public final void rule__AssemblyConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3460:1: ( rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 )
            // InternalCBS.g:3461:2: rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2
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
    // InternalCBS.g:3468:1: rule__AssemblyConnector__Group__1__Impl : ( ( rule__AssemblyConnector__NameAssignment_1 ) ) ;
    public final void rule__AssemblyConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3472:1: ( ( ( rule__AssemblyConnector__NameAssignment_1 ) ) )
            // InternalCBS.g:3473:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            {
            // InternalCBS.g:3473:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            // InternalCBS.g:3474:2: ( rule__AssemblyConnector__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 
            // InternalCBS.g:3475:2: ( rule__AssemblyConnector__NameAssignment_1 )
            // InternalCBS.g:3475:3: rule__AssemblyConnector__NameAssignment_1
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
    // InternalCBS.g:3483:1: rule__AssemblyConnector__Group__2 : rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 ;
    public final void rule__AssemblyConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3487:1: ( rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 )
            // InternalCBS.g:3488:2: rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalCBS.g:3495:1: rule__AssemblyConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3499:1: ( ( '{' ) )
            // InternalCBS.g:3500:1: ( '{' )
            {
            // InternalCBS.g:3500:1: ( '{' )
            // InternalCBS.g:3501:2: '{'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:3510:1: rule__AssemblyConnector__Group__3 : rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 ;
    public final void rule__AssemblyConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3514:1: ( rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 )
            // InternalCBS.g:3515:2: rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4
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
    // InternalCBS.g:3522:1: rule__AssemblyConnector__Group__3__Impl : ( 'requiringRole' ) ;
    public final void rule__AssemblyConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3526:1: ( ( 'requiringRole' ) )
            // InternalCBS.g:3527:1: ( 'requiringRole' )
            {
            // InternalCBS.g:3527:1: ( 'requiringRole' )
            // InternalCBS.g:3528:2: 'requiringRole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCBS.g:3537:1: rule__AssemblyConnector__Group__4 : rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 ;
    public final void rule__AssemblyConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3541:1: ( rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 )
            // InternalCBS.g:3542:2: rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalCBS.g:3549:1: rule__AssemblyConnector__Group__4__Impl : ( ( rule__AssemblyConnector__RequiringRoleAssignment_4 ) ) ;
    public final void rule__AssemblyConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3553:1: ( ( ( rule__AssemblyConnector__RequiringRoleAssignment_4 ) ) )
            // InternalCBS.g:3554:1: ( ( rule__AssemblyConnector__RequiringRoleAssignment_4 ) )
            {
            // InternalCBS.g:3554:1: ( ( rule__AssemblyConnector__RequiringRoleAssignment_4 ) )
            // InternalCBS.g:3555:2: ( rule__AssemblyConnector__RequiringRoleAssignment_4 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleAssignment_4()); 
            // InternalCBS.g:3556:2: ( rule__AssemblyConnector__RequiringRoleAssignment_4 )
            // InternalCBS.g:3556:3: rule__AssemblyConnector__RequiringRoleAssignment_4
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
    // InternalCBS.g:3564:1: rule__AssemblyConnector__Group__5 : rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 ;
    public final void rule__AssemblyConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3568:1: ( rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 )
            // InternalCBS.g:3569:2: rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6
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
    // InternalCBS.g:3576:1: rule__AssemblyConnector__Group__5__Impl : ( 'providingRole' ) ;
    public final void rule__AssemblyConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3580:1: ( ( 'providingRole' ) )
            // InternalCBS.g:3581:1: ( 'providingRole' )
            {
            // InternalCBS.g:3581:1: ( 'providingRole' )
            // InternalCBS.g:3582:2: 'providingRole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleKeyword_5()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCBS.g:3591:1: rule__AssemblyConnector__Group__6 : rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 ;
    public final void rule__AssemblyConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3595:1: ( rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 )
            // InternalCBS.g:3596:2: rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7
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
    // InternalCBS.g:3603:1: rule__AssemblyConnector__Group__6__Impl : ( ( rule__AssemblyConnector__ProvidingRoleAssignment_6 ) ) ;
    public final void rule__AssemblyConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3607:1: ( ( ( rule__AssemblyConnector__ProvidingRoleAssignment_6 ) ) )
            // InternalCBS.g:3608:1: ( ( rule__AssemblyConnector__ProvidingRoleAssignment_6 ) )
            {
            // InternalCBS.g:3608:1: ( ( rule__AssemblyConnector__ProvidingRoleAssignment_6 ) )
            // InternalCBS.g:3609:2: ( rule__AssemblyConnector__ProvidingRoleAssignment_6 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleAssignment_6()); 
            // InternalCBS.g:3610:2: ( rule__AssemblyConnector__ProvidingRoleAssignment_6 )
            // InternalCBS.g:3610:3: rule__AssemblyConnector__ProvidingRoleAssignment_6
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
    // InternalCBS.g:3618:1: rule__AssemblyConnector__Group__7 : rule__AssemblyConnector__Group__7__Impl ;
    public final void rule__AssemblyConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3622:1: ( rule__AssemblyConnector__Group__7__Impl )
            // InternalCBS.g:3623:2: rule__AssemblyConnector__Group__7__Impl
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
    // InternalCBS.g:3629:1: rule__AssemblyConnector__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3633:1: ( ( '}' ) )
            // InternalCBS.g:3634:1: ( '}' )
            {
            // InternalCBS.g:3634:1: ( '}' )
            // InternalCBS.g:3635:2: '}'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:3645:1: rule__RequiredDelegationConnector__Group__0 : rule__RequiredDelegationConnector__Group__0__Impl rule__RequiredDelegationConnector__Group__1 ;
    public final void rule__RequiredDelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3649:1: ( rule__RequiredDelegationConnector__Group__0__Impl rule__RequiredDelegationConnector__Group__1 )
            // InternalCBS.g:3650:2: rule__RequiredDelegationConnector__Group__0__Impl rule__RequiredDelegationConnector__Group__1
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
    // InternalCBS.g:3657:1: rule__RequiredDelegationConnector__Group__0__Impl : ( 'RequiredDelegationConnector' ) ;
    public final void rule__RequiredDelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3661:1: ( ( 'RequiredDelegationConnector' ) )
            // InternalCBS.g:3662:1: ( 'RequiredDelegationConnector' )
            {
            // InternalCBS.g:3662:1: ( 'RequiredDelegationConnector' )
            // InternalCBS.g:3663:2: 'RequiredDelegationConnector'
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiredDelegationConnectorKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCBS.g:3672:1: rule__RequiredDelegationConnector__Group__1 : rule__RequiredDelegationConnector__Group__1__Impl rule__RequiredDelegationConnector__Group__2 ;
    public final void rule__RequiredDelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3676:1: ( rule__RequiredDelegationConnector__Group__1__Impl rule__RequiredDelegationConnector__Group__2 )
            // InternalCBS.g:3677:2: rule__RequiredDelegationConnector__Group__1__Impl rule__RequiredDelegationConnector__Group__2
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
    // InternalCBS.g:3684:1: rule__RequiredDelegationConnector__Group__1__Impl : ( ( rule__RequiredDelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__RequiredDelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3688:1: ( ( ( rule__RequiredDelegationConnector__NameAssignment_1 ) ) )
            // InternalCBS.g:3689:1: ( ( rule__RequiredDelegationConnector__NameAssignment_1 ) )
            {
            // InternalCBS.g:3689:1: ( ( rule__RequiredDelegationConnector__NameAssignment_1 ) )
            // InternalCBS.g:3690:2: ( rule__RequiredDelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalCBS.g:3691:2: ( rule__RequiredDelegationConnector__NameAssignment_1 )
            // InternalCBS.g:3691:3: rule__RequiredDelegationConnector__NameAssignment_1
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
    // InternalCBS.g:3699:1: rule__RequiredDelegationConnector__Group__2 : rule__RequiredDelegationConnector__Group__2__Impl rule__RequiredDelegationConnector__Group__3 ;
    public final void rule__RequiredDelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3703:1: ( rule__RequiredDelegationConnector__Group__2__Impl rule__RequiredDelegationConnector__Group__3 )
            // InternalCBS.g:3704:2: rule__RequiredDelegationConnector__Group__2__Impl rule__RequiredDelegationConnector__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalCBS.g:3711:1: rule__RequiredDelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__RequiredDelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3715:1: ( ( '{' ) )
            // InternalCBS.g:3716:1: ( '{' )
            {
            // InternalCBS.g:3716:1: ( '{' )
            // InternalCBS.g:3717:2: '{'
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:3726:1: rule__RequiredDelegationConnector__Group__3 : rule__RequiredDelegationConnector__Group__3__Impl rule__RequiredDelegationConnector__Group__4 ;
    public final void rule__RequiredDelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3730:1: ( rule__RequiredDelegationConnector__Group__3__Impl rule__RequiredDelegationConnector__Group__4 )
            // InternalCBS.g:3731:2: rule__RequiredDelegationConnector__Group__3__Impl rule__RequiredDelegationConnector__Group__4
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
    // InternalCBS.g:3738:1: rule__RequiredDelegationConnector__Group__3__Impl : ( 'requiringRole' ) ;
    public final void rule__RequiredDelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3742:1: ( ( 'requiringRole' ) )
            // InternalCBS.g:3743:1: ( 'requiringRole' )
            {
            // InternalCBS.g:3743:1: ( 'requiringRole' )
            // InternalCBS.g:3744:2: 'requiringRole'
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCBS.g:3753:1: rule__RequiredDelegationConnector__Group__4 : rule__RequiredDelegationConnector__Group__4__Impl rule__RequiredDelegationConnector__Group__5 ;
    public final void rule__RequiredDelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3757:1: ( rule__RequiredDelegationConnector__Group__4__Impl rule__RequiredDelegationConnector__Group__5 )
            // InternalCBS.g:3758:2: rule__RequiredDelegationConnector__Group__4__Impl rule__RequiredDelegationConnector__Group__5
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
    // InternalCBS.g:3765:1: rule__RequiredDelegationConnector__Group__4__Impl : ( ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 ) ) ;
    public final void rule__RequiredDelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3769:1: ( ( ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 ) ) )
            // InternalCBS.g:3770:1: ( ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 ) )
            {
            // InternalCBS.g:3770:1: ( ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 ) )
            // InternalCBS.g:3771:2: ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 )
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleAssignment_4()); 
            // InternalCBS.g:3772:2: ( rule__RequiredDelegationConnector__RequiringRoleAssignment_4 )
            // InternalCBS.g:3772:3: rule__RequiredDelegationConnector__RequiringRoleAssignment_4
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
    // InternalCBS.g:3780:1: rule__RequiredDelegationConnector__Group__5 : rule__RequiredDelegationConnector__Group__5__Impl ;
    public final void rule__RequiredDelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3784:1: ( rule__RequiredDelegationConnector__Group__5__Impl )
            // InternalCBS.g:3785:2: rule__RequiredDelegationConnector__Group__5__Impl
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
    // InternalCBS.g:3791:1: rule__RequiredDelegationConnector__Group__5__Impl : ( '}' ) ;
    public final void rule__RequiredDelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3795:1: ( ( '}' ) )
            // InternalCBS.g:3796:1: ( '}' )
            {
            // InternalCBS.g:3796:1: ( '}' )
            // InternalCBS.g:3797:2: '}'
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:3807:1: rule__ProvidedDelegationConnector__Group__0 : rule__ProvidedDelegationConnector__Group__0__Impl rule__ProvidedDelegationConnector__Group__1 ;
    public final void rule__ProvidedDelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3811:1: ( rule__ProvidedDelegationConnector__Group__0__Impl rule__ProvidedDelegationConnector__Group__1 )
            // InternalCBS.g:3812:2: rule__ProvidedDelegationConnector__Group__0__Impl rule__ProvidedDelegationConnector__Group__1
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
    // InternalCBS.g:3819:1: rule__ProvidedDelegationConnector__Group__0__Impl : ( 'ProvidedDelegationConnector' ) ;
    public final void rule__ProvidedDelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3823:1: ( ( 'ProvidedDelegationConnector' ) )
            // InternalCBS.g:3824:1: ( 'ProvidedDelegationConnector' )
            {
            // InternalCBS.g:3824:1: ( 'ProvidedDelegationConnector' )
            // InternalCBS.g:3825:2: 'ProvidedDelegationConnector'
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidedDelegationConnectorKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCBS.g:3834:1: rule__ProvidedDelegationConnector__Group__1 : rule__ProvidedDelegationConnector__Group__1__Impl rule__ProvidedDelegationConnector__Group__2 ;
    public final void rule__ProvidedDelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3838:1: ( rule__ProvidedDelegationConnector__Group__1__Impl rule__ProvidedDelegationConnector__Group__2 )
            // InternalCBS.g:3839:2: rule__ProvidedDelegationConnector__Group__1__Impl rule__ProvidedDelegationConnector__Group__2
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
    // InternalCBS.g:3846:1: rule__ProvidedDelegationConnector__Group__1__Impl : ( ( rule__ProvidedDelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__ProvidedDelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3850:1: ( ( ( rule__ProvidedDelegationConnector__NameAssignment_1 ) ) )
            // InternalCBS.g:3851:1: ( ( rule__ProvidedDelegationConnector__NameAssignment_1 ) )
            {
            // InternalCBS.g:3851:1: ( ( rule__ProvidedDelegationConnector__NameAssignment_1 ) )
            // InternalCBS.g:3852:2: ( rule__ProvidedDelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalCBS.g:3853:2: ( rule__ProvidedDelegationConnector__NameAssignment_1 )
            // InternalCBS.g:3853:3: rule__ProvidedDelegationConnector__NameAssignment_1
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
    // InternalCBS.g:3861:1: rule__ProvidedDelegationConnector__Group__2 : rule__ProvidedDelegationConnector__Group__2__Impl rule__ProvidedDelegationConnector__Group__3 ;
    public final void rule__ProvidedDelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3865:1: ( rule__ProvidedDelegationConnector__Group__2__Impl rule__ProvidedDelegationConnector__Group__3 )
            // InternalCBS.g:3866:2: rule__ProvidedDelegationConnector__Group__2__Impl rule__ProvidedDelegationConnector__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalCBS.g:3873:1: rule__ProvidedDelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__ProvidedDelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3877:1: ( ( '{' ) )
            // InternalCBS.g:3878:1: ( '{' )
            {
            // InternalCBS.g:3878:1: ( '{' )
            // InternalCBS.g:3879:2: '{'
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:3888:1: rule__ProvidedDelegationConnector__Group__3 : rule__ProvidedDelegationConnector__Group__3__Impl rule__ProvidedDelegationConnector__Group__4 ;
    public final void rule__ProvidedDelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3892:1: ( rule__ProvidedDelegationConnector__Group__3__Impl rule__ProvidedDelegationConnector__Group__4 )
            // InternalCBS.g:3893:2: rule__ProvidedDelegationConnector__Group__3__Impl rule__ProvidedDelegationConnector__Group__4
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
    // InternalCBS.g:3900:1: rule__ProvidedDelegationConnector__Group__3__Impl : ( 'providingRole' ) ;
    public final void rule__ProvidedDelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3904:1: ( ( 'providingRole' ) )
            // InternalCBS.g:3905:1: ( 'providingRole' )
            {
            // InternalCBS.g:3905:1: ( 'providingRole' )
            // InternalCBS.g:3906:2: 'providingRole'
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCBS.g:3915:1: rule__ProvidedDelegationConnector__Group__4 : rule__ProvidedDelegationConnector__Group__4__Impl rule__ProvidedDelegationConnector__Group__5 ;
    public final void rule__ProvidedDelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3919:1: ( rule__ProvidedDelegationConnector__Group__4__Impl rule__ProvidedDelegationConnector__Group__5 )
            // InternalCBS.g:3920:2: rule__ProvidedDelegationConnector__Group__4__Impl rule__ProvidedDelegationConnector__Group__5
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
    // InternalCBS.g:3927:1: rule__ProvidedDelegationConnector__Group__4__Impl : ( ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 ) ) ;
    public final void rule__ProvidedDelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3931:1: ( ( ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 ) ) )
            // InternalCBS.g:3932:1: ( ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 ) )
            {
            // InternalCBS.g:3932:1: ( ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 ) )
            // InternalCBS.g:3933:2: ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 )
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleAssignment_4()); 
            // InternalCBS.g:3934:2: ( rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 )
            // InternalCBS.g:3934:3: rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4
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
    // InternalCBS.g:3942:1: rule__ProvidedDelegationConnector__Group__5 : rule__ProvidedDelegationConnector__Group__5__Impl ;
    public final void rule__ProvidedDelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3946:1: ( rule__ProvidedDelegationConnector__Group__5__Impl )
            // InternalCBS.g:3947:2: rule__ProvidedDelegationConnector__Group__5__Impl
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
    // InternalCBS.g:3953:1: rule__ProvidedDelegationConnector__Group__5__Impl : ( '}' ) ;
    public final void rule__ProvidedDelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3957:1: ( ( '}' ) )
            // InternalCBS.g:3958:1: ( '}' )
            {
            // InternalCBS.g:3958:1: ( '}' )
            // InternalCBS.g:3959:2: '}'
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__ProvidedRole__Group__0"
    // InternalCBS.g:3969:1: rule__ProvidedRole__Group__0 : rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 ;
    public final void rule__ProvidedRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3973:1: ( rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 )
            // InternalCBS.g:3974:2: rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1
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
    // InternalCBS.g:3981:1: rule__ProvidedRole__Group__0__Impl : ( 'ProvidedRole' ) ;
    public final void rule__ProvidedRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:3985:1: ( ( 'ProvidedRole' ) )
            // InternalCBS.g:3986:1: ( 'ProvidedRole' )
            {
            // InternalCBS.g:3986:1: ( 'ProvidedRole' )
            // InternalCBS.g:3987:2: 'ProvidedRole'
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCBS.g:3996:1: rule__ProvidedRole__Group__1 : rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 ;
    public final void rule__ProvidedRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4000:1: ( rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 )
            // InternalCBS.g:4001:2: rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2
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
    // InternalCBS.g:4008:1: rule__ProvidedRole__Group__1__Impl : ( ( rule__ProvidedRole__NameAssignment_1 ) ) ;
    public final void rule__ProvidedRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4012:1: ( ( ( rule__ProvidedRole__NameAssignment_1 ) ) )
            // InternalCBS.g:4013:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            {
            // InternalCBS.g:4013:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            // InternalCBS.g:4014:2: ( rule__ProvidedRole__NameAssignment_1 )
            {
             before(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 
            // InternalCBS.g:4015:2: ( rule__ProvidedRole__NameAssignment_1 )
            // InternalCBS.g:4015:3: rule__ProvidedRole__NameAssignment_1
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
    // InternalCBS.g:4023:1: rule__ProvidedRole__Group__2 : rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 ;
    public final void rule__ProvidedRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4027:1: ( rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 )
            // InternalCBS.g:4028:2: rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalCBS.g:4035:1: rule__ProvidedRole__Group__2__Impl : ( '{' ) ;
    public final void rule__ProvidedRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4039:1: ( ( '{' ) )
            // InternalCBS.g:4040:1: ( '{' )
            {
            // InternalCBS.g:4040:1: ( '{' )
            // InternalCBS.g:4041:2: '{'
            {
             before(grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:4050:1: rule__ProvidedRole__Group__3 : rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 ;
    public final void rule__ProvidedRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4054:1: ( rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 )
            // InternalCBS.g:4055:2: rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4
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
    // InternalCBS.g:4062:1: rule__ProvidedRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__ProvidedRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4066:1: ( ( 'interface' ) )
            // InternalCBS.g:4067:1: ( 'interface' )
            {
            // InternalCBS.g:4067:1: ( 'interface' )
            // InternalCBS.g:4068:2: 'interface'
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCBS.g:4077:1: rule__ProvidedRole__Group__4 : rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 ;
    public final void rule__ProvidedRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4081:1: ( rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 )
            // InternalCBS.g:4082:2: rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5
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
    // InternalCBS.g:4089:1: rule__ProvidedRole__Group__4__Impl : ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) ;
    public final void rule__ProvidedRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4093:1: ( ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) )
            // InternalCBS.g:4094:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            {
            // InternalCBS.g:4094:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            // InternalCBS.g:4095:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 
            // InternalCBS.g:4096:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            // InternalCBS.g:4096:3: rule__ProvidedRole__InterfaceAssignment_4
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
    // InternalCBS.g:4104:1: rule__ProvidedRole__Group__5 : rule__ProvidedRole__Group__5__Impl ;
    public final void rule__ProvidedRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4108:1: ( rule__ProvidedRole__Group__5__Impl )
            // InternalCBS.g:4109:2: rule__ProvidedRole__Group__5__Impl
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
    // InternalCBS.g:4115:1: rule__ProvidedRole__Group__5__Impl : ( '}' ) ;
    public final void rule__ProvidedRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4119:1: ( ( '}' ) )
            // InternalCBS.g:4120:1: ( '}' )
            {
            // InternalCBS.g:4120:1: ( '}' )
            // InternalCBS.g:4121:2: '}'
            {
             before(grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:4131:1: rule__RequiredRole__Group__0 : rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 ;
    public final void rule__RequiredRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4135:1: ( rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 )
            // InternalCBS.g:4136:2: rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1
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
    // InternalCBS.g:4143:1: rule__RequiredRole__Group__0__Impl : ( 'RequiredRole' ) ;
    public final void rule__RequiredRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4147:1: ( ( 'RequiredRole' ) )
            // InternalCBS.g:4148:1: ( 'RequiredRole' )
            {
            // InternalCBS.g:4148:1: ( 'RequiredRole' )
            // InternalCBS.g:4149:2: 'RequiredRole'
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCBS.g:4158:1: rule__RequiredRole__Group__1 : rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 ;
    public final void rule__RequiredRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4162:1: ( rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 )
            // InternalCBS.g:4163:2: rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2
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
    // InternalCBS.g:4170:1: rule__RequiredRole__Group__1__Impl : ( ( rule__RequiredRole__NameAssignment_1 ) ) ;
    public final void rule__RequiredRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4174:1: ( ( ( rule__RequiredRole__NameAssignment_1 ) ) )
            // InternalCBS.g:4175:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            {
            // InternalCBS.g:4175:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            // InternalCBS.g:4176:2: ( rule__RequiredRole__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 
            // InternalCBS.g:4177:2: ( rule__RequiredRole__NameAssignment_1 )
            // InternalCBS.g:4177:3: rule__RequiredRole__NameAssignment_1
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
    // InternalCBS.g:4185:1: rule__RequiredRole__Group__2 : rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 ;
    public final void rule__RequiredRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4189:1: ( rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 )
            // InternalCBS.g:4190:2: rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalCBS.g:4197:1: rule__RequiredRole__Group__2__Impl : ( '{' ) ;
    public final void rule__RequiredRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4201:1: ( ( '{' ) )
            // InternalCBS.g:4202:1: ( '{' )
            {
            // InternalCBS.g:4202:1: ( '{' )
            // InternalCBS.g:4203:2: '{'
            {
             before(grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:4212:1: rule__RequiredRole__Group__3 : rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 ;
    public final void rule__RequiredRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4216:1: ( rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 )
            // InternalCBS.g:4217:2: rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4
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
    // InternalCBS.g:4224:1: rule__RequiredRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__RequiredRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4228:1: ( ( 'interface' ) )
            // InternalCBS.g:4229:1: ( 'interface' )
            {
            // InternalCBS.g:4229:1: ( 'interface' )
            // InternalCBS.g:4230:2: 'interface'
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCBS.g:4239:1: rule__RequiredRole__Group__4 : rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 ;
    public final void rule__RequiredRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4243:1: ( rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 )
            // InternalCBS.g:4244:2: rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5
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
    // InternalCBS.g:4251:1: rule__RequiredRole__Group__4__Impl : ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) ;
    public final void rule__RequiredRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4255:1: ( ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) )
            // InternalCBS.g:4256:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            {
            // InternalCBS.g:4256:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            // InternalCBS.g:4257:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 
            // InternalCBS.g:4258:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            // InternalCBS.g:4258:3: rule__RequiredRole__InterfaceAssignment_4
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
    // InternalCBS.g:4266:1: rule__RequiredRole__Group__5 : rule__RequiredRole__Group__5__Impl ;
    public final void rule__RequiredRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4270:1: ( rule__RequiredRole__Group__5__Impl )
            // InternalCBS.g:4271:2: rule__RequiredRole__Group__5__Impl
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
    // InternalCBS.g:4277:1: rule__RequiredRole__Group__5__Impl : ( '}' ) ;
    public final void rule__RequiredRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4281:1: ( ( '}' ) )
            // InternalCBS.g:4282:1: ( '}' )
            {
            // InternalCBS.g:4282:1: ( '}' )
            // InternalCBS.g:4283:2: '}'
            {
             before(grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:4293:1: rule__AtomicComponent__Group__0 : rule__AtomicComponent__Group__0__Impl rule__AtomicComponent__Group__1 ;
    public final void rule__AtomicComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4297:1: ( rule__AtomicComponent__Group__0__Impl rule__AtomicComponent__Group__1 )
            // InternalCBS.g:4298:2: rule__AtomicComponent__Group__0__Impl rule__AtomicComponent__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCBS.g:4305:1: rule__AtomicComponent__Group__0__Impl : ( () ) ;
    public final void rule__AtomicComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4309:1: ( ( () ) )
            // InternalCBS.g:4310:1: ( () )
            {
            // InternalCBS.g:4310:1: ( () )
            // InternalCBS.g:4311:2: ()
            {
             before(grammarAccess.getAtomicComponentAccess().getAtomicComponentAction_0()); 
            // InternalCBS.g:4312:2: ()
            // InternalCBS.g:4312:3: 
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
    // InternalCBS.g:4320:1: rule__AtomicComponent__Group__1 : rule__AtomicComponent__Group__1__Impl rule__AtomicComponent__Group__2 ;
    public final void rule__AtomicComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4324:1: ( rule__AtomicComponent__Group__1__Impl rule__AtomicComponent__Group__2 )
            // InternalCBS.g:4325:2: rule__AtomicComponent__Group__1__Impl rule__AtomicComponent__Group__2
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
    // InternalCBS.g:4332:1: rule__AtomicComponent__Group__1__Impl : ( 'AtomicComponent' ) ;
    public final void rule__AtomicComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4336:1: ( ( 'AtomicComponent' ) )
            // InternalCBS.g:4337:1: ( 'AtomicComponent' )
            {
            // InternalCBS.g:4337:1: ( 'AtomicComponent' )
            // InternalCBS.g:4338:2: 'AtomicComponent'
            {
             before(grammarAccess.getAtomicComponentAccess().getAtomicComponentKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalCBS.g:4347:1: rule__AtomicComponent__Group__2 : rule__AtomicComponent__Group__2__Impl rule__AtomicComponent__Group__3 ;
    public final void rule__AtomicComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4351:1: ( rule__AtomicComponent__Group__2__Impl rule__AtomicComponent__Group__3 )
            // InternalCBS.g:4352:2: rule__AtomicComponent__Group__2__Impl rule__AtomicComponent__Group__3
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
    // InternalCBS.g:4359:1: rule__AtomicComponent__Group__2__Impl : ( ( rule__AtomicComponent__NameAssignment_2 ) ) ;
    public final void rule__AtomicComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4363:1: ( ( ( rule__AtomicComponent__NameAssignment_2 ) ) )
            // InternalCBS.g:4364:1: ( ( rule__AtomicComponent__NameAssignment_2 ) )
            {
            // InternalCBS.g:4364:1: ( ( rule__AtomicComponent__NameAssignment_2 ) )
            // InternalCBS.g:4365:2: ( rule__AtomicComponent__NameAssignment_2 )
            {
             before(grammarAccess.getAtomicComponentAccess().getNameAssignment_2()); 
            // InternalCBS.g:4366:2: ( rule__AtomicComponent__NameAssignment_2 )
            // InternalCBS.g:4366:3: rule__AtomicComponent__NameAssignment_2
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
    // InternalCBS.g:4374:1: rule__AtomicComponent__Group__3 : rule__AtomicComponent__Group__3__Impl rule__AtomicComponent__Group__4 ;
    public final void rule__AtomicComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4378:1: ( rule__AtomicComponent__Group__3__Impl rule__AtomicComponent__Group__4 )
            // InternalCBS.g:4379:2: rule__AtomicComponent__Group__3__Impl rule__AtomicComponent__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalCBS.g:4386:1: rule__AtomicComponent__Group__3__Impl : ( '{' ) ;
    public final void rule__AtomicComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4390:1: ( ( '{' ) )
            // InternalCBS.g:4391:1: ( '{' )
            {
            // InternalCBS.g:4391:1: ( '{' )
            // InternalCBS.g:4392:2: '{'
            {
             before(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:4401:1: rule__AtomicComponent__Group__4 : rule__AtomicComponent__Group__4__Impl rule__AtomicComponent__Group__5 ;
    public final void rule__AtomicComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4405:1: ( rule__AtomicComponent__Group__4__Impl rule__AtomicComponent__Group__5 )
            // InternalCBS.g:4406:2: rule__AtomicComponent__Group__4__Impl rule__AtomicComponent__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalCBS.g:4413:1: rule__AtomicComponent__Group__4__Impl : ( ( rule__AtomicComponent__Group_4__0 )? ) ;
    public final void rule__AtomicComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4417:1: ( ( ( rule__AtomicComponent__Group_4__0 )? ) )
            // InternalCBS.g:4418:1: ( ( rule__AtomicComponent__Group_4__0 )? )
            {
            // InternalCBS.g:4418:1: ( ( rule__AtomicComponent__Group_4__0 )? )
            // InternalCBS.g:4419:2: ( rule__AtomicComponent__Group_4__0 )?
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_4()); 
            // InternalCBS.g:4420:2: ( rule__AtomicComponent__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCBS.g:4420:3: rule__AtomicComponent__Group_4__0
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
    // InternalCBS.g:4428:1: rule__AtomicComponent__Group__5 : rule__AtomicComponent__Group__5__Impl rule__AtomicComponent__Group__6 ;
    public final void rule__AtomicComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4432:1: ( rule__AtomicComponent__Group__5__Impl rule__AtomicComponent__Group__6 )
            // InternalCBS.g:4433:2: rule__AtomicComponent__Group__5__Impl rule__AtomicComponent__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalCBS.g:4440:1: rule__AtomicComponent__Group__5__Impl : ( ( rule__AtomicComponent__Group_5__0 )? ) ;
    public final void rule__AtomicComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4444:1: ( ( ( rule__AtomicComponent__Group_5__0 )? ) )
            // InternalCBS.g:4445:1: ( ( rule__AtomicComponent__Group_5__0 )? )
            {
            // InternalCBS.g:4445:1: ( ( rule__AtomicComponent__Group_5__0 )? )
            // InternalCBS.g:4446:2: ( rule__AtomicComponent__Group_5__0 )?
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_5()); 
            // InternalCBS.g:4447:2: ( rule__AtomicComponent__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==55) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCBS.g:4447:3: rule__AtomicComponent__Group_5__0
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
    // InternalCBS.g:4455:1: rule__AtomicComponent__Group__6 : rule__AtomicComponent__Group__6__Impl rule__AtomicComponent__Group__7 ;
    public final void rule__AtomicComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4459:1: ( rule__AtomicComponent__Group__6__Impl rule__AtomicComponent__Group__7 )
            // InternalCBS.g:4460:2: rule__AtomicComponent__Group__6__Impl rule__AtomicComponent__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalCBS.g:4467:1: rule__AtomicComponent__Group__6__Impl : ( ( rule__AtomicComponent__Group_6__0 )? ) ;
    public final void rule__AtomicComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4471:1: ( ( ( rule__AtomicComponent__Group_6__0 )? ) )
            // InternalCBS.g:4472:1: ( ( rule__AtomicComponent__Group_6__0 )? )
            {
            // InternalCBS.g:4472:1: ( ( rule__AtomicComponent__Group_6__0 )? )
            // InternalCBS.g:4473:2: ( rule__AtomicComponent__Group_6__0 )?
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_6()); 
            // InternalCBS.g:4474:2: ( rule__AtomicComponent__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==56) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCBS.g:4474:3: rule__AtomicComponent__Group_6__0
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
    // InternalCBS.g:4482:1: rule__AtomicComponent__Group__7 : rule__AtomicComponent__Group__7__Impl ;
    public final void rule__AtomicComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4486:1: ( rule__AtomicComponent__Group__7__Impl )
            // InternalCBS.g:4487:2: rule__AtomicComponent__Group__7__Impl
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
    // InternalCBS.g:4493:1: rule__AtomicComponent__Group__7__Impl : ( '}' ) ;
    public final void rule__AtomicComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4497:1: ( ( '}' ) )
            // InternalCBS.g:4498:1: ( '}' )
            {
            // InternalCBS.g:4498:1: ( '}' )
            // InternalCBS.g:4499:2: '}'
            {
             before(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:4509:1: rule__AtomicComponent__Group_4__0 : rule__AtomicComponent__Group_4__0__Impl rule__AtomicComponent__Group_4__1 ;
    public final void rule__AtomicComponent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4513:1: ( rule__AtomicComponent__Group_4__0__Impl rule__AtomicComponent__Group_4__1 )
            // InternalCBS.g:4514:2: rule__AtomicComponent__Group_4__0__Impl rule__AtomicComponent__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCBS.g:4521:1: rule__AtomicComponent__Group_4__0__Impl : ( 'requires' ) ;
    public final void rule__AtomicComponent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4525:1: ( ( 'requires' ) )
            // InternalCBS.g:4526:1: ( 'requires' )
            {
            // InternalCBS.g:4526:1: ( 'requires' )
            // InternalCBS.g:4527:2: 'requires'
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalCBS.g:4536:1: rule__AtomicComponent__Group_4__1 : rule__AtomicComponent__Group_4__1__Impl rule__AtomicComponent__Group_4__2 ;
    public final void rule__AtomicComponent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4540:1: ( rule__AtomicComponent__Group_4__1__Impl rule__AtomicComponent__Group_4__2 )
            // InternalCBS.g:4541:2: rule__AtomicComponent__Group_4__1__Impl rule__AtomicComponent__Group_4__2
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
    // InternalCBS.g:4548:1: rule__AtomicComponent__Group_4__1__Impl : ( '{' ) ;
    public final void rule__AtomicComponent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4552:1: ( ( '{' ) )
            // InternalCBS.g:4553:1: ( '{' )
            {
            // InternalCBS.g:4553:1: ( '{' )
            // InternalCBS.g:4554:2: '{'
            {
             before(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
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
    // InternalCBS.g:4563:1: rule__AtomicComponent__Group_4__2 : rule__AtomicComponent__Group_4__2__Impl rule__AtomicComponent__Group_4__3 ;
    public final void rule__AtomicComponent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4567:1: ( rule__AtomicComponent__Group_4__2__Impl rule__AtomicComponent__Group_4__3 )
            // InternalCBS.g:4568:2: rule__AtomicComponent__Group_4__2__Impl rule__AtomicComponent__Group_4__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:4575:1: rule__AtomicComponent__Group_4__2__Impl : ( ( rule__AtomicComponent__RequiresAssignment_4_2 ) ) ;
    public final void rule__AtomicComponent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4579:1: ( ( ( rule__AtomicComponent__RequiresAssignment_4_2 ) ) )
            // InternalCBS.g:4580:1: ( ( rule__AtomicComponent__RequiresAssignment_4_2 ) )
            {
            // InternalCBS.g:4580:1: ( ( rule__AtomicComponent__RequiresAssignment_4_2 ) )
            // InternalCBS.g:4581:2: ( rule__AtomicComponent__RequiresAssignment_4_2 )
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresAssignment_4_2()); 
            // InternalCBS.g:4582:2: ( rule__AtomicComponent__RequiresAssignment_4_2 )
            // InternalCBS.g:4582:3: rule__AtomicComponent__RequiresAssignment_4_2
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
    // InternalCBS.g:4590:1: rule__AtomicComponent__Group_4__3 : rule__AtomicComponent__Group_4__3__Impl rule__AtomicComponent__Group_4__4 ;
    public final void rule__AtomicComponent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4594:1: ( rule__AtomicComponent__Group_4__3__Impl rule__AtomicComponent__Group_4__4 )
            // InternalCBS.g:4595:2: rule__AtomicComponent__Group_4__3__Impl rule__AtomicComponent__Group_4__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:4602:1: rule__AtomicComponent__Group_4__3__Impl : ( ( rule__AtomicComponent__Group_4_3__0 )* ) ;
    public final void rule__AtomicComponent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4606:1: ( ( ( rule__AtomicComponent__Group_4_3__0 )* ) )
            // InternalCBS.g:4607:1: ( ( rule__AtomicComponent__Group_4_3__0 )* )
            {
            // InternalCBS.g:4607:1: ( ( rule__AtomicComponent__Group_4_3__0 )* )
            // InternalCBS.g:4608:2: ( rule__AtomicComponent__Group_4_3__0 )*
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_4_3()); 
            // InternalCBS.g:4609:2: ( rule__AtomicComponent__Group_4_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCBS.g:4609:3: rule__AtomicComponent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AtomicComponent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalCBS.g:4617:1: rule__AtomicComponent__Group_4__4 : rule__AtomicComponent__Group_4__4__Impl ;
    public final void rule__AtomicComponent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4621:1: ( rule__AtomicComponent__Group_4__4__Impl )
            // InternalCBS.g:4622:2: rule__AtomicComponent__Group_4__4__Impl
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
    // InternalCBS.g:4628:1: rule__AtomicComponent__Group_4__4__Impl : ( '}' ) ;
    public final void rule__AtomicComponent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4632:1: ( ( '}' ) )
            // InternalCBS.g:4633:1: ( '}' )
            {
            // InternalCBS.g:4633:1: ( '}' )
            // InternalCBS.g:4634:2: '}'
            {
             before(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
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
    // InternalCBS.g:4644:1: rule__AtomicComponent__Group_4_3__0 : rule__AtomicComponent__Group_4_3__0__Impl rule__AtomicComponent__Group_4_3__1 ;
    public final void rule__AtomicComponent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4648:1: ( rule__AtomicComponent__Group_4_3__0__Impl rule__AtomicComponent__Group_4_3__1 )
            // InternalCBS.g:4649:2: rule__AtomicComponent__Group_4_3__0__Impl rule__AtomicComponent__Group_4_3__1
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
    // InternalCBS.g:4656:1: rule__AtomicComponent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicComponent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4660:1: ( ( ',' ) )
            // InternalCBS.g:4661:1: ( ',' )
            {
            // InternalCBS.g:4661:1: ( ',' )
            // InternalCBS.g:4662:2: ','
            {
             before(grammarAccess.getAtomicComponentAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:4671:1: rule__AtomicComponent__Group_4_3__1 : rule__AtomicComponent__Group_4_3__1__Impl ;
    public final void rule__AtomicComponent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4675:1: ( rule__AtomicComponent__Group_4_3__1__Impl )
            // InternalCBS.g:4676:2: rule__AtomicComponent__Group_4_3__1__Impl
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
    // InternalCBS.g:4682:1: rule__AtomicComponent__Group_4_3__1__Impl : ( ( rule__AtomicComponent__RequiresAssignment_4_3_1 ) ) ;
    public final void rule__AtomicComponent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4686:1: ( ( ( rule__AtomicComponent__RequiresAssignment_4_3_1 ) ) )
            // InternalCBS.g:4687:1: ( ( rule__AtomicComponent__RequiresAssignment_4_3_1 ) )
            {
            // InternalCBS.g:4687:1: ( ( rule__AtomicComponent__RequiresAssignment_4_3_1 ) )
            // InternalCBS.g:4688:2: ( rule__AtomicComponent__RequiresAssignment_4_3_1 )
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresAssignment_4_3_1()); 
            // InternalCBS.g:4689:2: ( rule__AtomicComponent__RequiresAssignment_4_3_1 )
            // InternalCBS.g:4689:3: rule__AtomicComponent__RequiresAssignment_4_3_1
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
    // InternalCBS.g:4698:1: rule__AtomicComponent__Group_5__0 : rule__AtomicComponent__Group_5__0__Impl rule__AtomicComponent__Group_5__1 ;
    public final void rule__AtomicComponent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4702:1: ( rule__AtomicComponent__Group_5__0__Impl rule__AtomicComponent__Group_5__1 )
            // InternalCBS.g:4703:2: rule__AtomicComponent__Group_5__0__Impl rule__AtomicComponent__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCBS.g:4710:1: rule__AtomicComponent__Group_5__0__Impl : ( 'provides' ) ;
    public final void rule__AtomicComponent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4714:1: ( ( 'provides' ) )
            // InternalCBS.g:4715:1: ( 'provides' )
            {
            // InternalCBS.g:4715:1: ( 'provides' )
            // InternalCBS.g:4716:2: 'provides'
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalCBS.g:4725:1: rule__AtomicComponent__Group_5__1 : rule__AtomicComponent__Group_5__1__Impl rule__AtomicComponent__Group_5__2 ;
    public final void rule__AtomicComponent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4729:1: ( rule__AtomicComponent__Group_5__1__Impl rule__AtomicComponent__Group_5__2 )
            // InternalCBS.g:4730:2: rule__AtomicComponent__Group_5__1__Impl rule__AtomicComponent__Group_5__2
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
    // InternalCBS.g:4737:1: rule__AtomicComponent__Group_5__1__Impl : ( '{' ) ;
    public final void rule__AtomicComponent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4741:1: ( ( '{' ) )
            // InternalCBS.g:4742:1: ( '{' )
            {
            // InternalCBS.g:4742:1: ( '{' )
            // InternalCBS.g:4743:2: '{'
            {
             before(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
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
    // InternalCBS.g:4752:1: rule__AtomicComponent__Group_5__2 : rule__AtomicComponent__Group_5__2__Impl rule__AtomicComponent__Group_5__3 ;
    public final void rule__AtomicComponent__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4756:1: ( rule__AtomicComponent__Group_5__2__Impl rule__AtomicComponent__Group_5__3 )
            // InternalCBS.g:4757:2: rule__AtomicComponent__Group_5__2__Impl rule__AtomicComponent__Group_5__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:4764:1: rule__AtomicComponent__Group_5__2__Impl : ( ( rule__AtomicComponent__ProvidesAssignment_5_2 ) ) ;
    public final void rule__AtomicComponent__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4768:1: ( ( ( rule__AtomicComponent__ProvidesAssignment_5_2 ) ) )
            // InternalCBS.g:4769:1: ( ( rule__AtomicComponent__ProvidesAssignment_5_2 ) )
            {
            // InternalCBS.g:4769:1: ( ( rule__AtomicComponent__ProvidesAssignment_5_2 ) )
            // InternalCBS.g:4770:2: ( rule__AtomicComponent__ProvidesAssignment_5_2 )
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesAssignment_5_2()); 
            // InternalCBS.g:4771:2: ( rule__AtomicComponent__ProvidesAssignment_5_2 )
            // InternalCBS.g:4771:3: rule__AtomicComponent__ProvidesAssignment_5_2
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
    // InternalCBS.g:4779:1: rule__AtomicComponent__Group_5__3 : rule__AtomicComponent__Group_5__3__Impl rule__AtomicComponent__Group_5__4 ;
    public final void rule__AtomicComponent__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4783:1: ( rule__AtomicComponent__Group_5__3__Impl rule__AtomicComponent__Group_5__4 )
            // InternalCBS.g:4784:2: rule__AtomicComponent__Group_5__3__Impl rule__AtomicComponent__Group_5__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:4791:1: rule__AtomicComponent__Group_5__3__Impl : ( ( rule__AtomicComponent__Group_5_3__0 )* ) ;
    public final void rule__AtomicComponent__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4795:1: ( ( ( rule__AtomicComponent__Group_5_3__0 )* ) )
            // InternalCBS.g:4796:1: ( ( rule__AtomicComponent__Group_5_3__0 )* )
            {
            // InternalCBS.g:4796:1: ( ( rule__AtomicComponent__Group_5_3__0 )* )
            // InternalCBS.g:4797:2: ( rule__AtomicComponent__Group_5_3__0 )*
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_5_3()); 
            // InternalCBS.g:4798:2: ( rule__AtomicComponent__Group_5_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCBS.g:4798:3: rule__AtomicComponent__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AtomicComponent__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalCBS.g:4806:1: rule__AtomicComponent__Group_5__4 : rule__AtomicComponent__Group_5__4__Impl ;
    public final void rule__AtomicComponent__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4810:1: ( rule__AtomicComponent__Group_5__4__Impl )
            // InternalCBS.g:4811:2: rule__AtomicComponent__Group_5__4__Impl
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
    // InternalCBS.g:4817:1: rule__AtomicComponent__Group_5__4__Impl : ( '}' ) ;
    public final void rule__AtomicComponent__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4821:1: ( ( '}' ) )
            // InternalCBS.g:4822:1: ( '}' )
            {
            // InternalCBS.g:4822:1: ( '}' )
            // InternalCBS.g:4823:2: '}'
            {
             before(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
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
    // InternalCBS.g:4833:1: rule__AtomicComponent__Group_5_3__0 : rule__AtomicComponent__Group_5_3__0__Impl rule__AtomicComponent__Group_5_3__1 ;
    public final void rule__AtomicComponent__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4837:1: ( rule__AtomicComponent__Group_5_3__0__Impl rule__AtomicComponent__Group_5_3__1 )
            // InternalCBS.g:4838:2: rule__AtomicComponent__Group_5_3__0__Impl rule__AtomicComponent__Group_5_3__1
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
    // InternalCBS.g:4845:1: rule__AtomicComponent__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicComponent__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4849:1: ( ( ',' ) )
            // InternalCBS.g:4850:1: ( ',' )
            {
            // InternalCBS.g:4850:1: ( ',' )
            // InternalCBS.g:4851:2: ','
            {
             before(grammarAccess.getAtomicComponentAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:4860:1: rule__AtomicComponent__Group_5_3__1 : rule__AtomicComponent__Group_5_3__1__Impl ;
    public final void rule__AtomicComponent__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4864:1: ( rule__AtomicComponent__Group_5_3__1__Impl )
            // InternalCBS.g:4865:2: rule__AtomicComponent__Group_5_3__1__Impl
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
    // InternalCBS.g:4871:1: rule__AtomicComponent__Group_5_3__1__Impl : ( ( rule__AtomicComponent__ProvidesAssignment_5_3_1 ) ) ;
    public final void rule__AtomicComponent__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4875:1: ( ( ( rule__AtomicComponent__ProvidesAssignment_5_3_1 ) ) )
            // InternalCBS.g:4876:1: ( ( rule__AtomicComponent__ProvidesAssignment_5_3_1 ) )
            {
            // InternalCBS.g:4876:1: ( ( rule__AtomicComponent__ProvidesAssignment_5_3_1 ) )
            // InternalCBS.g:4877:2: ( rule__AtomicComponent__ProvidesAssignment_5_3_1 )
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesAssignment_5_3_1()); 
            // InternalCBS.g:4878:2: ( rule__AtomicComponent__ProvidesAssignment_5_3_1 )
            // InternalCBS.g:4878:3: rule__AtomicComponent__ProvidesAssignment_5_3_1
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
    // InternalCBS.g:4887:1: rule__AtomicComponent__Group_6__0 : rule__AtomicComponent__Group_6__0__Impl rule__AtomicComponent__Group_6__1 ;
    public final void rule__AtomicComponent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4891:1: ( rule__AtomicComponent__Group_6__0__Impl rule__AtomicComponent__Group_6__1 )
            // InternalCBS.g:4892:2: rule__AtomicComponent__Group_6__0__Impl rule__AtomicComponent__Group_6__1
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
    // InternalCBS.g:4899:1: rule__AtomicComponent__Group_6__0__Impl : ( 'services' ) ;
    public final void rule__AtomicComponent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4903:1: ( ( 'services' ) )
            // InternalCBS.g:4904:1: ( 'services' )
            {
            // InternalCBS.g:4904:1: ( 'services' )
            // InternalCBS.g:4905:2: 'services'
            {
             before(grammarAccess.getAtomicComponentAccess().getServicesKeyword_6_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalCBS.g:4914:1: rule__AtomicComponent__Group_6__1 : rule__AtomicComponent__Group_6__1__Impl rule__AtomicComponent__Group_6__2 ;
    public final void rule__AtomicComponent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4918:1: ( rule__AtomicComponent__Group_6__1__Impl rule__AtomicComponent__Group_6__2 )
            // InternalCBS.g:4919:2: rule__AtomicComponent__Group_6__1__Impl rule__AtomicComponent__Group_6__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalCBS.g:4926:1: rule__AtomicComponent__Group_6__1__Impl : ( '{' ) ;
    public final void rule__AtomicComponent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4930:1: ( ( '{' ) )
            // InternalCBS.g:4931:1: ( '{' )
            {
            // InternalCBS.g:4931:1: ( '{' )
            // InternalCBS.g:4932:2: '{'
            {
             before(grammarAccess.getAtomicComponentAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:4941:1: rule__AtomicComponent__Group_6__2 : rule__AtomicComponent__Group_6__2__Impl rule__AtomicComponent__Group_6__3 ;
    public final void rule__AtomicComponent__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4945:1: ( rule__AtomicComponent__Group_6__2__Impl rule__AtomicComponent__Group_6__3 )
            // InternalCBS.g:4946:2: rule__AtomicComponent__Group_6__2__Impl rule__AtomicComponent__Group_6__3
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
    // InternalCBS.g:4953:1: rule__AtomicComponent__Group_6__2__Impl : ( ( rule__AtomicComponent__ServicesAssignment_6_2 ) ) ;
    public final void rule__AtomicComponent__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4957:1: ( ( ( rule__AtomicComponent__ServicesAssignment_6_2 ) ) )
            // InternalCBS.g:4958:1: ( ( rule__AtomicComponent__ServicesAssignment_6_2 ) )
            {
            // InternalCBS.g:4958:1: ( ( rule__AtomicComponent__ServicesAssignment_6_2 ) )
            // InternalCBS.g:4959:2: ( rule__AtomicComponent__ServicesAssignment_6_2 )
            {
             before(grammarAccess.getAtomicComponentAccess().getServicesAssignment_6_2()); 
            // InternalCBS.g:4960:2: ( rule__AtomicComponent__ServicesAssignment_6_2 )
            // InternalCBS.g:4960:3: rule__AtomicComponent__ServicesAssignment_6_2
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
    // InternalCBS.g:4968:1: rule__AtomicComponent__Group_6__3 : rule__AtomicComponent__Group_6__3__Impl rule__AtomicComponent__Group_6__4 ;
    public final void rule__AtomicComponent__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4972:1: ( rule__AtomicComponent__Group_6__3__Impl rule__AtomicComponent__Group_6__4 )
            // InternalCBS.g:4973:2: rule__AtomicComponent__Group_6__3__Impl rule__AtomicComponent__Group_6__4
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
    // InternalCBS.g:4980:1: rule__AtomicComponent__Group_6__3__Impl : ( ( rule__AtomicComponent__Group_6_3__0 )* ) ;
    public final void rule__AtomicComponent__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4984:1: ( ( ( rule__AtomicComponent__Group_6_3__0 )* ) )
            // InternalCBS.g:4985:1: ( ( rule__AtomicComponent__Group_6_3__0 )* )
            {
            // InternalCBS.g:4985:1: ( ( rule__AtomicComponent__Group_6_3__0 )* )
            // InternalCBS.g:4986:2: ( rule__AtomicComponent__Group_6_3__0 )*
            {
             before(grammarAccess.getAtomicComponentAccess().getGroup_6_3()); 
            // InternalCBS.g:4987:2: ( rule__AtomicComponent__Group_6_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==26) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCBS.g:4987:3: rule__AtomicComponent__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AtomicComponent__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCBS.g:4995:1: rule__AtomicComponent__Group_6__4 : rule__AtomicComponent__Group_6__4__Impl ;
    public final void rule__AtomicComponent__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:4999:1: ( rule__AtomicComponent__Group_6__4__Impl )
            // InternalCBS.g:5000:2: rule__AtomicComponent__Group_6__4__Impl
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
    // InternalCBS.g:5006:1: rule__AtomicComponent__Group_6__4__Impl : ( '}' ) ;
    public final void rule__AtomicComponent__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5010:1: ( ( '}' ) )
            // InternalCBS.g:5011:1: ( '}' )
            {
            // InternalCBS.g:5011:1: ( '}' )
            // InternalCBS.g:5012:2: '}'
            {
             before(grammarAccess.getAtomicComponentAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:5022:1: rule__AtomicComponent__Group_6_3__0 : rule__AtomicComponent__Group_6_3__0__Impl rule__AtomicComponent__Group_6_3__1 ;
    public final void rule__AtomicComponent__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5026:1: ( rule__AtomicComponent__Group_6_3__0__Impl rule__AtomicComponent__Group_6_3__1 )
            // InternalCBS.g:5027:2: rule__AtomicComponent__Group_6_3__0__Impl rule__AtomicComponent__Group_6_3__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCBS.g:5034:1: rule__AtomicComponent__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__AtomicComponent__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5038:1: ( ( ',' ) )
            // InternalCBS.g:5039:1: ( ',' )
            {
            // InternalCBS.g:5039:1: ( ',' )
            // InternalCBS.g:5040:2: ','
            {
             before(grammarAccess.getAtomicComponentAccess().getCommaKeyword_6_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCBS.g:5049:1: rule__AtomicComponent__Group_6_3__1 : rule__AtomicComponent__Group_6_3__1__Impl ;
    public final void rule__AtomicComponent__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5053:1: ( rule__AtomicComponent__Group_6_3__1__Impl )
            // InternalCBS.g:5054:2: rule__AtomicComponent__Group_6_3__1__Impl
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
    // InternalCBS.g:5060:1: rule__AtomicComponent__Group_6_3__1__Impl : ( ( rule__AtomicComponent__ServicesAssignment_6_3_1 ) ) ;
    public final void rule__AtomicComponent__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5064:1: ( ( ( rule__AtomicComponent__ServicesAssignment_6_3_1 ) ) )
            // InternalCBS.g:5065:1: ( ( rule__AtomicComponent__ServicesAssignment_6_3_1 ) )
            {
            // InternalCBS.g:5065:1: ( ( rule__AtomicComponent__ServicesAssignment_6_3_1 ) )
            // InternalCBS.g:5066:2: ( rule__AtomicComponent__ServicesAssignment_6_3_1 )
            {
             before(grammarAccess.getAtomicComponentAccess().getServicesAssignment_6_3_1()); 
            // InternalCBS.g:5067:2: ( rule__AtomicComponent__ServicesAssignment_6_3_1 )
            // InternalCBS.g:5067:3: rule__AtomicComponent__ServicesAssignment_6_3_1
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
    // InternalCBS.g:5076:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5080:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalCBS.g:5081:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalCBS.g:5088:1: rule__Signature__Group__0__Impl : ( ( rule__Signature__ReturnTypeAssignment_0 ) ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5092:1: ( ( ( rule__Signature__ReturnTypeAssignment_0 ) ) )
            // InternalCBS.g:5093:1: ( ( rule__Signature__ReturnTypeAssignment_0 ) )
            {
            // InternalCBS.g:5093:1: ( ( rule__Signature__ReturnTypeAssignment_0 ) )
            // InternalCBS.g:5094:2: ( rule__Signature__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeAssignment_0()); 
            // InternalCBS.g:5095:2: ( rule__Signature__ReturnTypeAssignment_0 )
            // InternalCBS.g:5095:3: rule__Signature__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getReturnTypeAssignment_0()); 

            }


            }

        }
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
    // InternalCBS.g:5103:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5107:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalCBS.g:5108:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCBS.g:5115:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5119:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalCBS.g:5120:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalCBS.g:5120:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalCBS.g:5121:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalCBS.g:5122:2: ( rule__Signature__NameAssignment_1 )
            // InternalCBS.g:5122:3: rule__Signature__NameAssignment_1
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
    // InternalCBS.g:5130:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5134:1: ( rule__Signature__Group__2__Impl )
            // InternalCBS.g:5135:2: rule__Signature__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:5141:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )? ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5145:1: ( ( ( rule__Signature__Group_2__0 )? ) )
            // InternalCBS.g:5146:1: ( ( rule__Signature__Group_2__0 )? )
            {
            // InternalCBS.g:5146:1: ( ( rule__Signature__Group_2__0 )? )
            // InternalCBS.g:5147:2: ( rule__Signature__Group_2__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_2()); 
            // InternalCBS.g:5148:2: ( rule__Signature__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCBS.g:5148:3: rule__Signature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Signature__Group_2__0"
    // InternalCBS.g:5157:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5161:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // InternalCBS.g:5162:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__0"


    // $ANTLR start "rule__Signature__Group_2__0__Impl"
    // InternalCBS.g:5169:1: rule__Signature__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5173:1: ( ( '(' ) )
            // InternalCBS.g:5174:1: ( '(' )
            {
            // InternalCBS.g:5174:1: ( '(' )
            // InternalCBS.g:5175:2: '('
            {
             before(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__0__Impl"


    // $ANTLR start "rule__Signature__Group_2__1"
    // InternalCBS.g:5184:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl rule__Signature__Group_2__2 ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5188:1: ( rule__Signature__Group_2__1__Impl rule__Signature__Group_2__2 )
            // InternalCBS.g:5189:2: rule__Signature__Group_2__1__Impl rule__Signature__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__Signature__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__1"


    // $ANTLR start "rule__Signature__Group_2__1__Impl"
    // InternalCBS.g:5196:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__ParametersAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5200:1: ( ( ( rule__Signature__ParametersAssignment_2_1 ) ) )
            // InternalCBS.g:5201:1: ( ( rule__Signature__ParametersAssignment_2_1 ) )
            {
            // InternalCBS.g:5201:1: ( ( rule__Signature__ParametersAssignment_2_1 ) )
            // InternalCBS.g:5202:2: ( rule__Signature__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_2_1()); 
            // InternalCBS.g:5203:2: ( rule__Signature__ParametersAssignment_2_1 )
            // InternalCBS.g:5203:3: rule__Signature__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__1__Impl"


    // $ANTLR start "rule__Signature__Group_2__2"
    // InternalCBS.g:5211:1: rule__Signature__Group_2__2 : rule__Signature__Group_2__2__Impl rule__Signature__Group_2__3 ;
    public final void rule__Signature__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5215:1: ( rule__Signature__Group_2__2__Impl rule__Signature__Group_2__3 )
            // InternalCBS.g:5216:2: rule__Signature__Group_2__2__Impl rule__Signature__Group_2__3
            {
            pushFollow(FOLLOW_22);
            rule__Signature__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__2"


    // $ANTLR start "rule__Signature__Group_2__2__Impl"
    // InternalCBS.g:5223:1: rule__Signature__Group_2__2__Impl : ( ( rule__Signature__Group_2_2__0 )* ) ;
    public final void rule__Signature__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5227:1: ( ( ( rule__Signature__Group_2_2__0 )* ) )
            // InternalCBS.g:5228:1: ( ( rule__Signature__Group_2_2__0 )* )
            {
            // InternalCBS.g:5228:1: ( ( rule__Signature__Group_2_2__0 )* )
            // InternalCBS.g:5229:2: ( rule__Signature__Group_2_2__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_2_2()); 
            // InternalCBS.g:5230:2: ( rule__Signature__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCBS.g:5230:3: rule__Signature__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Signature__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__2__Impl"


    // $ANTLR start "rule__Signature__Group_2__3"
    // InternalCBS.g:5238:1: rule__Signature__Group_2__3 : rule__Signature__Group_2__3__Impl ;
    public final void rule__Signature__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5242:1: ( rule__Signature__Group_2__3__Impl )
            // InternalCBS.g:5243:2: rule__Signature__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__3"


    // $ANTLR start "rule__Signature__Group_2__3__Impl"
    // InternalCBS.g:5249:1: rule__Signature__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Signature__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5253:1: ( ( ')' ) )
            // InternalCBS.g:5254:1: ( ')' )
            {
            // InternalCBS.g:5254:1: ( ')' )
            // InternalCBS.g:5255:2: ')'
            {
             before(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_2_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__3__Impl"


    // $ANTLR start "rule__Signature__Group_2_2__0"
    // InternalCBS.g:5265:1: rule__Signature__Group_2_2__0 : rule__Signature__Group_2_2__0__Impl rule__Signature__Group_2_2__1 ;
    public final void rule__Signature__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5269:1: ( rule__Signature__Group_2_2__0__Impl rule__Signature__Group_2_2__1 )
            // InternalCBS.g:5270:2: rule__Signature__Group_2_2__0__Impl rule__Signature__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2_2__0"


    // $ANTLR start "rule__Signature__Group_2_2__0__Impl"
    // InternalCBS.g:5277:1: rule__Signature__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5281:1: ( ( ',' ) )
            // InternalCBS.g:5282:1: ( ',' )
            {
            // InternalCBS.g:5282:1: ( ',' )
            // InternalCBS.g:5283:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2_2__0__Impl"


    // $ANTLR start "rule__Signature__Group_2_2__1"
    // InternalCBS.g:5292:1: rule__Signature__Group_2_2__1 : rule__Signature__Group_2_2__1__Impl ;
    public final void rule__Signature__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5296:1: ( rule__Signature__Group_2_2__1__Impl )
            // InternalCBS.g:5297:2: rule__Signature__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2_2__1"


    // $ANTLR start "rule__Signature__Group_2_2__1__Impl"
    // InternalCBS.g:5303:1: rule__Signature__Group_2_2__1__Impl : ( ( rule__Signature__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Signature__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5307:1: ( ( ( rule__Signature__ParametersAssignment_2_2_1 ) ) )
            // InternalCBS.g:5308:1: ( ( rule__Signature__ParametersAssignment_2_2_1 ) )
            {
            // InternalCBS.g:5308:1: ( ( rule__Signature__ParametersAssignment_2_2_1 ) )
            // InternalCBS.g:5309:2: ( rule__Signature__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_2_2_1()); 
            // InternalCBS.g:5310:2: ( rule__Signature__ParametersAssignment_2_2_1 )
            // InternalCBS.g:5310:3: rule__Signature__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParametersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalCBS.g:5319:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5323:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCBS.g:5324:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalCBS.g:5331:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5335:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalCBS.g:5336:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalCBS.g:5336:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalCBS.g:5337:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalCBS.g:5338:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalCBS.g:5338:3: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalCBS.g:5346:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5350:1: ( rule__Parameter__Group__1__Impl )
            // InternalCBS.g:5351:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:5357:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5361:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalCBS.g:5362:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalCBS.g:5362:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalCBS.g:5363:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalCBS.g:5364:2: ( rule__Parameter__NameAssignment_1 )
            // InternalCBS.g:5364:3: rule__Parameter__NameAssignment_1
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


    // $ANTLR start "rule__SimpleType__Group__0"
    // InternalCBS.g:5373:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5377:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // InternalCBS.g:5378:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCBS.g:5385:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5389:1: ( ( 'type' ) )
            // InternalCBS.g:5390:1: ( 'type' )
            {
            // InternalCBS.g:5390:1: ( 'type' )
            // InternalCBS.g:5391:2: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
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
    // InternalCBS.g:5400:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5404:1: ( rule__SimpleType__Group__1__Impl )
            // InternalCBS.g:5405:2: rule__SimpleType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:5411:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__TypeAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5415:1: ( ( ( rule__SimpleType__TypeAssignment_1 ) ) )
            // InternalCBS.g:5416:1: ( ( rule__SimpleType__TypeAssignment_1 ) )
            {
            // InternalCBS.g:5416:1: ( ( rule__SimpleType__TypeAssignment_1 ) )
            // InternalCBS.g:5417:2: ( rule__SimpleType__TypeAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeAssignment_1()); 
            // InternalCBS.g:5418:2: ( rule__SimpleType__TypeAssignment_1 )
            // InternalCBS.g:5418:3: rule__SimpleType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComplexType__Group__0"
    // InternalCBS.g:5427:1: rule__ComplexType__Group__0 : rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 ;
    public final void rule__ComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5431:1: ( rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 )
            // InternalCBS.g:5432:2: rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1
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
    // InternalCBS.g:5439:1: rule__ComplexType__Group__0__Impl : ( () ) ;
    public final void rule__ComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5443:1: ( ( () ) )
            // InternalCBS.g:5444:1: ( () )
            {
            // InternalCBS.g:5444:1: ( () )
            // InternalCBS.g:5445:2: ()
            {
             before(grammarAccess.getComplexTypeAccess().getComplexTypeAction_0()); 
            // InternalCBS.g:5446:2: ()
            // InternalCBS.g:5446:3: 
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
    // InternalCBS.g:5454:1: rule__ComplexType__Group__1 : rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2 ;
    public final void rule__ComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5458:1: ( rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2 )
            // InternalCBS.g:5459:2: rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2
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
    // InternalCBS.g:5466:1: rule__ComplexType__Group__1__Impl : ( 'type' ) ;
    public final void rule__ComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5470:1: ( ( 'type' ) )
            // InternalCBS.g:5471:1: ( 'type' )
            {
            // InternalCBS.g:5471:1: ( 'type' )
            // InternalCBS.g:5472:2: 'type'
            {
             before(grammarAccess.getComplexTypeAccess().getTypeKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
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
    // InternalCBS.g:5481:1: rule__ComplexType__Group__2 : rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3 ;
    public final void rule__ComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5485:1: ( rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3 )
            // InternalCBS.g:5486:2: rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3
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
    // InternalCBS.g:5493:1: rule__ComplexType__Group__2__Impl : ( '{' ) ;
    public final void rule__ComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5497:1: ( ( '{' ) )
            // InternalCBS.g:5498:1: ( '{' )
            {
            // InternalCBS.g:5498:1: ( '{' )
            // InternalCBS.g:5499:2: '{'
            {
             before(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:5508:1: rule__ComplexType__Group__3 : rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4 ;
    public final void rule__ComplexType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5512:1: ( rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4 )
            // InternalCBS.g:5513:2: rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4
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
    // InternalCBS.g:5520:1: rule__ComplexType__Group__3__Impl : ( ( rule__ComplexType__Group_3__0 )? ) ;
    public final void rule__ComplexType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5524:1: ( ( ( rule__ComplexType__Group_3__0 )? ) )
            // InternalCBS.g:5525:1: ( ( rule__ComplexType__Group_3__0 )? )
            {
            // InternalCBS.g:5525:1: ( ( rule__ComplexType__Group_3__0 )? )
            // InternalCBS.g:5526:2: ( rule__ComplexType__Group_3__0 )?
            {
             before(grammarAccess.getComplexTypeAccess().getGroup_3()); 
            // InternalCBS.g:5527:2: ( rule__ComplexType__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCBS.g:5527:3: rule__ComplexType__Group_3__0
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
    // InternalCBS.g:5535:1: rule__ComplexType__Group__4 : rule__ComplexType__Group__4__Impl ;
    public final void rule__ComplexType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5539:1: ( rule__ComplexType__Group__4__Impl )
            // InternalCBS.g:5540:2: rule__ComplexType__Group__4__Impl
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
    // InternalCBS.g:5546:1: rule__ComplexType__Group__4__Impl : ( '}' ) ;
    public final void rule__ComplexType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5550:1: ( ( '}' ) )
            // InternalCBS.g:5551:1: ( '}' )
            {
            // InternalCBS.g:5551:1: ( '}' )
            // InternalCBS.g:5552:2: '}'
            {
             before(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCBS.g:5562:1: rule__ComplexType__Group_3__0 : rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1 ;
    public final void rule__ComplexType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5566:1: ( rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1 )
            // InternalCBS.g:5567:2: rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCBS.g:5574:1: rule__ComplexType__Group_3__0__Impl : ( ( rule__ComplexType__MembersAssignment_3_0 ) ) ;
    public final void rule__ComplexType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5578:1: ( ( ( rule__ComplexType__MembersAssignment_3_0 ) ) )
            // InternalCBS.g:5579:1: ( ( rule__ComplexType__MembersAssignment_3_0 ) )
            {
            // InternalCBS.g:5579:1: ( ( rule__ComplexType__MembersAssignment_3_0 ) )
            // InternalCBS.g:5580:2: ( rule__ComplexType__MembersAssignment_3_0 )
            {
             before(grammarAccess.getComplexTypeAccess().getMembersAssignment_3_0()); 
            // InternalCBS.g:5581:2: ( rule__ComplexType__MembersAssignment_3_0 )
            // InternalCBS.g:5581:3: rule__ComplexType__MembersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__MembersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getMembersAssignment_3_0()); 

            }


            }

        }
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
    // InternalCBS.g:5589:1: rule__ComplexType__Group_3__1 : rule__ComplexType__Group_3__1__Impl ;
    public final void rule__ComplexType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5593:1: ( rule__ComplexType__Group_3__1__Impl )
            // InternalCBS.g:5594:2: rule__ComplexType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:5600:1: rule__ComplexType__Group_3__1__Impl : ( ( rule__ComplexType__Group_3_1__0 )* ) ;
    public final void rule__ComplexType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5604:1: ( ( ( rule__ComplexType__Group_3_1__0 )* ) )
            // InternalCBS.g:5605:1: ( ( rule__ComplexType__Group_3_1__0 )* )
            {
            // InternalCBS.g:5605:1: ( ( rule__ComplexType__Group_3_1__0 )* )
            // InternalCBS.g:5606:2: ( rule__ComplexType__Group_3_1__0 )*
            {
             before(grammarAccess.getComplexTypeAccess().getGroup_3_1()); 
            // InternalCBS.g:5607:2: ( rule__ComplexType__Group_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCBS.g:5607:3: rule__ComplexType__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComplexType__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getComplexTypeAccess().getGroup_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComplexType__Group_3_1__0"
    // InternalCBS.g:5616:1: rule__ComplexType__Group_3_1__0 : rule__ComplexType__Group_3_1__0__Impl rule__ComplexType__Group_3_1__1 ;
    public final void rule__ComplexType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5620:1: ( rule__ComplexType__Group_3_1__0__Impl rule__ComplexType__Group_3_1__1 )
            // InternalCBS.g:5621:2: rule__ComplexType__Group_3_1__0__Impl rule__ComplexType__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ComplexType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_3_1__0"


    // $ANTLR start "rule__ComplexType__Group_3_1__0__Impl"
    // InternalCBS.g:5628:1: rule__ComplexType__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ComplexType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5632:1: ( ( ',' ) )
            // InternalCBS.g:5633:1: ( ',' )
            {
            // InternalCBS.g:5633:1: ( ',' )
            // InternalCBS.g:5634:2: ','
            {
             before(grammarAccess.getComplexTypeAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_3_1__0__Impl"


    // $ANTLR start "rule__ComplexType__Group_3_1__1"
    // InternalCBS.g:5643:1: rule__ComplexType__Group_3_1__1 : rule__ComplexType__Group_3_1__1__Impl ;
    public final void rule__ComplexType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5647:1: ( rule__ComplexType__Group_3_1__1__Impl )
            // InternalCBS.g:5648:2: rule__ComplexType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_3_1__1"


    // $ANTLR start "rule__ComplexType__Group_3_1__1__Impl"
    // InternalCBS.g:5654:1: rule__ComplexType__Group_3_1__1__Impl : ( ( rule__ComplexType__MembersAssignment_3_1_1 ) ) ;
    public final void rule__ComplexType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5658:1: ( ( ( rule__ComplexType__MembersAssignment_3_1_1 ) ) )
            // InternalCBS.g:5659:1: ( ( rule__ComplexType__MembersAssignment_3_1_1 ) )
            {
            // InternalCBS.g:5659:1: ( ( rule__ComplexType__MembersAssignment_3_1_1 ) )
            // InternalCBS.g:5660:2: ( rule__ComplexType__MembersAssignment_3_1_1 )
            {
             before(grammarAccess.getComplexTypeAccess().getMembersAssignment_3_1_1()); 
            // InternalCBS.g:5661:2: ( rule__ComplexType__MembersAssignment_3_1_1 )
            // InternalCBS.g:5661:3: rule__ComplexType__MembersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__MembersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getMembersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_3_1__1__Impl"


    // $ANTLR start "rule__ComplexMember__Group__0"
    // InternalCBS.g:5670:1: rule__ComplexMember__Group__0 : rule__ComplexMember__Group__0__Impl rule__ComplexMember__Group__1 ;
    public final void rule__ComplexMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5674:1: ( rule__ComplexMember__Group__0__Impl rule__ComplexMember__Group__1 )
            // InternalCBS.g:5675:2: rule__ComplexMember__Group__0__Impl rule__ComplexMember__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalCBS.g:5682:1: rule__ComplexMember__Group__0__Impl : ( ( rule__ComplexMember__NameAssignment_0 ) ) ;
    public final void rule__ComplexMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5686:1: ( ( ( rule__ComplexMember__NameAssignment_0 ) ) )
            // InternalCBS.g:5687:1: ( ( rule__ComplexMember__NameAssignment_0 ) )
            {
            // InternalCBS.g:5687:1: ( ( rule__ComplexMember__NameAssignment_0 ) )
            // InternalCBS.g:5688:2: ( rule__ComplexMember__NameAssignment_0 )
            {
             before(grammarAccess.getComplexMemberAccess().getNameAssignment_0()); 
            // InternalCBS.g:5689:2: ( rule__ComplexMember__NameAssignment_0 )
            // InternalCBS.g:5689:3: rule__ComplexMember__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexMemberAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalCBS.g:5697:1: rule__ComplexMember__Group__1 : rule__ComplexMember__Group__1__Impl rule__ComplexMember__Group__2 ;
    public final void rule__ComplexMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5701:1: ( rule__ComplexMember__Group__1__Impl rule__ComplexMember__Group__2 )
            // InternalCBS.g:5702:2: rule__ComplexMember__Group__1__Impl rule__ComplexMember__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalCBS.g:5709:1: rule__ComplexMember__Group__1__Impl : ( ':' ) ;
    public final void rule__ComplexMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5713:1: ( ( ':' ) )
            // InternalCBS.g:5714:1: ( ':' )
            {
            // InternalCBS.g:5714:1: ( ':' )
            // InternalCBS.g:5715:2: ':'
            {
             before(grammarAccess.getComplexMemberAccess().getColonKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getComplexMemberAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalCBS.g:5724:1: rule__ComplexMember__Group__2 : rule__ComplexMember__Group__2__Impl ;
    public final void rule__ComplexMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5728:1: ( rule__ComplexMember__Group__2__Impl )
            // InternalCBS.g:5729:2: rule__ComplexMember__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexMember__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:5735:1: rule__ComplexMember__Group__2__Impl : ( ( rule__ComplexMember__TypeAssignment_2 ) ) ;
    public final void rule__ComplexMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5739:1: ( ( ( rule__ComplexMember__TypeAssignment_2 ) ) )
            // InternalCBS.g:5740:1: ( ( rule__ComplexMember__TypeAssignment_2 ) )
            {
            // InternalCBS.g:5740:1: ( ( rule__ComplexMember__TypeAssignment_2 ) )
            // InternalCBS.g:5741:2: ( rule__ComplexMember__TypeAssignment_2 )
            {
             before(grammarAccess.getComplexMemberAccess().getTypeAssignment_2()); 
            // InternalCBS.g:5742:2: ( rule__ComplexMember__TypeAssignment_2 )
            // InternalCBS.g:5742:3: rule__ComplexMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexMember__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexMemberAccess().getTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Void__Group__0"
    // InternalCBS.g:5751:1: rule__Void__Group__0 : rule__Void__Group__0__Impl rule__Void__Group__1 ;
    public final void rule__Void__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5755:1: ( rule__Void__Group__0__Impl rule__Void__Group__1 )
            // InternalCBS.g:5756:2: rule__Void__Group__0__Impl rule__Void__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalCBS.g:5763:1: rule__Void__Group__0__Impl : ( () ) ;
    public final void rule__Void__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5767:1: ( ( () ) )
            // InternalCBS.g:5768:1: ( () )
            {
            // InternalCBS.g:5768:1: ( () )
            // InternalCBS.g:5769:2: ()
            {
             before(grammarAccess.getVoidAccess().getVoidAction_0()); 
            // InternalCBS.g:5770:2: ()
            // InternalCBS.g:5770:3: 
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
    // InternalCBS.g:5778:1: rule__Void__Group__1 : rule__Void__Group__1__Impl ;
    public final void rule__Void__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5782:1: ( rule__Void__Group__1__Impl )
            // InternalCBS.g:5783:2: rule__Void__Group__1__Impl
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
    // InternalCBS.g:5789:1: rule__Void__Group__1__Impl : ( 'Void' ) ;
    public final void rule__Void__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5793:1: ( ( 'Void' ) )
            // InternalCBS.g:5794:1: ( 'Void' )
            {
            // InternalCBS.g:5794:1: ( 'Void' )
            // InternalCBS.g:5795:2: 'Void'
            {
             before(grammarAccess.getVoidAccess().getVoidKeyword_1()); 
            match(input,59,FOLLOW_2); 
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


    // $ANTLR start "rule__CollectionType__Group__0"
    // InternalCBS.g:5805:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5809:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalCBS.g:5810:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__CollectionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__0"


    // $ANTLR start "rule__CollectionType__Group__0__Impl"
    // InternalCBS.g:5817:1: rule__CollectionType__Group__0__Impl : ( ( rule__CollectionType__TypeAssignment_0 ) ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5821:1: ( ( ( rule__CollectionType__TypeAssignment_0 ) ) )
            // InternalCBS.g:5822:1: ( ( rule__CollectionType__TypeAssignment_0 ) )
            {
            // InternalCBS.g:5822:1: ( ( rule__CollectionType__TypeAssignment_0 ) )
            // InternalCBS.g:5823:2: ( rule__CollectionType__TypeAssignment_0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getTypeAssignment_0()); 
            // InternalCBS.g:5824:2: ( rule__CollectionType__TypeAssignment_0 )
            // InternalCBS.g:5824:3: rule__CollectionType__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__0__Impl"


    // $ANTLR start "rule__CollectionType__Group__1"
    // InternalCBS.g:5832:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5836:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalCBS.g:5837:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CollectionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__1"


    // $ANTLR start "rule__CollectionType__Group__1__Impl"
    // InternalCBS.g:5844:1: rule__CollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5848:1: ( ( '<' ) )
            // InternalCBS.g:5849:1: ( '<' )
            {
            // InternalCBS.g:5849:1: ( '<' )
            // InternalCBS.g:5850:2: '<'
            {
             before(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__1__Impl"


    // $ANTLR start "rule__CollectionType__Group__2"
    // InternalCBS.g:5859:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5863:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalCBS.g:5864:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__CollectionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__2"


    // $ANTLR start "rule__CollectionType__Group__2__Impl"
    // InternalCBS.g:5871:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__InnerTypeAssignment_2 ) ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5875:1: ( ( ( rule__CollectionType__InnerTypeAssignment_2 ) ) )
            // InternalCBS.g:5876:1: ( ( rule__CollectionType__InnerTypeAssignment_2 ) )
            {
            // InternalCBS.g:5876:1: ( ( rule__CollectionType__InnerTypeAssignment_2 ) )
            // InternalCBS.g:5877:2: ( rule__CollectionType__InnerTypeAssignment_2 )
            {
             before(grammarAccess.getCollectionTypeAccess().getInnerTypeAssignment_2()); 
            // InternalCBS.g:5878:2: ( rule__CollectionType__InnerTypeAssignment_2 )
            // InternalCBS.g:5878:3: rule__CollectionType__InnerTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__InnerTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getInnerTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__2__Impl"


    // $ANTLR start "rule__CollectionType__Group__3"
    // InternalCBS.g:5886:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5890:1: ( rule__CollectionType__Group__3__Impl )
            // InternalCBS.g:5891:2: rule__CollectionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__3"


    // $ANTLR start "rule__CollectionType__Group__3__Impl"
    // InternalCBS.g:5897:1: rule__CollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5901:1: ( ( '>' ) )
            // InternalCBS.g:5902:1: ( '>' )
            {
            // InternalCBS.g:5902:1: ( '>' )
            // InternalCBS.g:5903:2: '>'
            {
             before(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalCBS.g:5913:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5917:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalCBS.g:5918:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCBS.g:5925:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5929:1: ( ( 'Service' ) )
            // InternalCBS.g:5930:1: ( 'Service' )
            {
            // InternalCBS.g:5930:1: ( 'Service' )
            // InternalCBS.g:5931:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalCBS.g:5940:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5944:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalCBS.g:5945:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCBS.g:5952:1: rule__Service__Group__1__Impl : ( ( rule__Service__ImplementsAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5956:1: ( ( ( rule__Service__ImplementsAssignment_1 ) ) )
            // InternalCBS.g:5957:1: ( ( rule__Service__ImplementsAssignment_1 ) )
            {
            // InternalCBS.g:5957:1: ( ( rule__Service__ImplementsAssignment_1 ) )
            // InternalCBS.g:5958:2: ( rule__Service__ImplementsAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getImplementsAssignment_1()); 
            // InternalCBS.g:5959:2: ( rule__Service__ImplementsAssignment_1 )
            // InternalCBS.g:5959:3: rule__Service__ImplementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__ImplementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getImplementsAssignment_1()); 

            }


            }

        }
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
    // InternalCBS.g:5967:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5971:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalCBS.g:5972:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalCBS.g:5979:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5983:1: ( ( '{' ) )
            // InternalCBS.g:5984:1: ( '{' )
            {
            // InternalCBS.g:5984:1: ( '{' )
            // InternalCBS.g:5985:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalCBS.g:5994:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:5998:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalCBS.g:5999:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalCBS.g:6006:1: rule__Service__Group__3__Impl : ( ( rule__Service__ActionsAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6010:1: ( ( ( rule__Service__ActionsAssignment_3 ) ) )
            // InternalCBS.g:6011:1: ( ( rule__Service__ActionsAssignment_3 ) )
            {
            // InternalCBS.g:6011:1: ( ( rule__Service__ActionsAssignment_3 ) )
            // InternalCBS.g:6012:2: ( rule__Service__ActionsAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getActionsAssignment_3()); 
            // InternalCBS.g:6013:2: ( rule__Service__ActionsAssignment_3 )
            // InternalCBS.g:6013:3: rule__Service__ActionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__ActionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getActionsAssignment_3()); 

            }


            }

        }
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
    // InternalCBS.g:6021:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6025:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalCBS.g:6026:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalCBS.g:6033:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6037:1: ( ( ( rule__Service__Group_4__0 )* ) )
            // InternalCBS.g:6038:1: ( ( rule__Service__Group_4__0 )* )
            {
            // InternalCBS.g:6038:1: ( ( rule__Service__Group_4__0 )* )
            // InternalCBS.g:6039:2: ( rule__Service__Group_4__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // InternalCBS.g:6040:2: ( rule__Service__Group_4__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==63) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCBS.g:6040:3: rule__Service__Group_4__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Service__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalCBS.g:6048:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6052:1: ( rule__Service__Group__5__Impl )
            // InternalCBS.g:6053:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:6059:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6063:1: ( ( '}' ) )
            // InternalCBS.g:6064:1: ( '}' )
            {
            // InternalCBS.g:6064:1: ( '}' )
            // InternalCBS.g:6065:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Service__Group_4__0"
    // InternalCBS.g:6075:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6079:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // InternalCBS.g:6080:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // InternalCBS.g:6087:1: rule__Service__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6091:1: ( ( ';' ) )
            // InternalCBS.g:6092:1: ( ';' )
            {
            // InternalCBS.g:6092:1: ( ';' )
            // InternalCBS.g:6093:2: ';'
            {
             before(grammarAccess.getServiceAccess().getSemicolonKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // InternalCBS.g:6102:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6106:1: ( rule__Service__Group_4__1__Impl )
            // InternalCBS.g:6107:2: rule__Service__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // InternalCBS.g:6113:1: rule__Service__Group_4__1__Impl : ( ( rule__Service__ActionsAssignment_4_1 ) ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6117:1: ( ( ( rule__Service__ActionsAssignment_4_1 ) ) )
            // InternalCBS.g:6118:1: ( ( rule__Service__ActionsAssignment_4_1 ) )
            {
            // InternalCBS.g:6118:1: ( ( rule__Service__ActionsAssignment_4_1 ) )
            // InternalCBS.g:6119:2: ( rule__Service__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getServiceAccess().getActionsAssignment_4_1()); 
            // InternalCBS.g:6120:2: ( rule__Service__ActionsAssignment_4_1 )
            // InternalCBS.g:6120:3: rule__Service__ActionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__ActionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getActionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__InternalAction__Group__0"
    // InternalCBS.g:6129:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6133:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalCBS.g:6134:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalCBS.g:6141:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6145:1: ( ( () ) )
            // InternalCBS.g:6146:1: ( () )
            {
            // InternalCBS.g:6146:1: ( () )
            // InternalCBS.g:6147:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalCBS.g:6148:2: ()
            // InternalCBS.g:6148:3: 
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
    // InternalCBS.g:6156:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6160:1: ( rule__InternalAction__Group__1__Impl )
            // InternalCBS.g:6161:2: rule__InternalAction__Group__1__Impl
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
    // InternalCBS.g:6167:1: rule__InternalAction__Group__1__Impl : ( 'internalCall' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6171:1: ( ( 'internalCall' ) )
            // InternalCBS.g:6172:1: ( 'internalCall' )
            {
            // InternalCBS.g:6172:1: ( 'internalCall' )
            // InternalCBS.g:6173:2: 'internalCall'
            {
             before(grammarAccess.getInternalActionAccess().getInternalCallKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getInternalActionAccess().getInternalCallKeyword_1()); 

            }


            }

        }
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
    // InternalCBS.g:6183:1: rule__ExternalCallAction__Group__0 : rule__ExternalCallAction__Group__0__Impl rule__ExternalCallAction__Group__1 ;
    public final void rule__ExternalCallAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6187:1: ( rule__ExternalCallAction__Group__0__Impl rule__ExternalCallAction__Group__1 )
            // InternalCBS.g:6188:2: rule__ExternalCallAction__Group__0__Impl rule__ExternalCallAction__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCBS.g:6195:1: rule__ExternalCallAction__Group__0__Impl : ( 'externalCall' ) ;
    public final void rule__ExternalCallAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6199:1: ( ( 'externalCall' ) )
            // InternalCBS.g:6200:1: ( 'externalCall' )
            {
            // InternalCBS.g:6200:1: ( 'externalCall' )
            // InternalCBS.g:6201:2: 'externalCall'
            {
             before(grammarAccess.getExternalCallActionAccess().getExternalCallKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getExternalCallActionAccess().getExternalCallKeyword_0()); 

            }


            }

        }
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
    // InternalCBS.g:6210:1: rule__ExternalCallAction__Group__1 : rule__ExternalCallAction__Group__1__Impl ;
    public final void rule__ExternalCallAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6214:1: ( rule__ExternalCallAction__Group__1__Impl )
            // InternalCBS.g:6215:2: rule__ExternalCallAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:6221:1: rule__ExternalCallAction__Group__1__Impl : ( ( rule__ExternalCallAction__RequiredServiceAssignment_1 ) ) ;
    public final void rule__ExternalCallAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6225:1: ( ( ( rule__ExternalCallAction__RequiredServiceAssignment_1 ) ) )
            // InternalCBS.g:6226:1: ( ( rule__ExternalCallAction__RequiredServiceAssignment_1 ) )
            {
            // InternalCBS.g:6226:1: ( ( rule__ExternalCallAction__RequiredServiceAssignment_1 ) )
            // InternalCBS.g:6227:2: ( rule__ExternalCallAction__RequiredServiceAssignment_1 )
            {
             before(grammarAccess.getExternalCallActionAccess().getRequiredServiceAssignment_1()); 
            // InternalCBS.g:6228:2: ( rule__ExternalCallAction__RequiredServiceAssignment_1 )
            // InternalCBS.g:6228:3: rule__ExternalCallAction__RequiredServiceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCallAction__RequiredServiceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalCallActionAccess().getRequiredServiceAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BranchAction__Group__0"
    // InternalCBS.g:6237:1: rule__BranchAction__Group__0 : rule__BranchAction__Group__0__Impl rule__BranchAction__Group__1 ;
    public final void rule__BranchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6241:1: ( rule__BranchAction__Group__0__Impl rule__BranchAction__Group__1 )
            // InternalCBS.g:6242:2: rule__BranchAction__Group__0__Impl rule__BranchAction__Group__1
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
    // InternalCBS.g:6249:1: rule__BranchAction__Group__0__Impl : ( 'branch' ) ;
    public final void rule__BranchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6253:1: ( ( 'branch' ) )
            // InternalCBS.g:6254:1: ( 'branch' )
            {
            // InternalCBS.g:6254:1: ( 'branch' )
            // InternalCBS.g:6255:2: 'branch'
            {
             before(grammarAccess.getBranchActionAccess().getBranchKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getBranchKeyword_0()); 

            }


            }

        }
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
    // InternalCBS.g:6264:1: rule__BranchAction__Group__1 : rule__BranchAction__Group__1__Impl rule__BranchAction__Group__2 ;
    public final void rule__BranchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6268:1: ( rule__BranchAction__Group__1__Impl rule__BranchAction__Group__2 )
            // InternalCBS.g:6269:2: rule__BranchAction__Group__1__Impl rule__BranchAction__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalCBS.g:6276:1: rule__BranchAction__Group__1__Impl : ( '{' ) ;
    public final void rule__BranchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6280:1: ( ( '{' ) )
            // InternalCBS.g:6281:1: ( '{' )
            {
            // InternalCBS.g:6281:1: ( '{' )
            // InternalCBS.g:6282:2: '{'
            {
             before(grammarAccess.getBranchActionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:6291:1: rule__BranchAction__Group__2 : rule__BranchAction__Group__2__Impl rule__BranchAction__Group__3 ;
    public final void rule__BranchAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6295:1: ( rule__BranchAction__Group__2__Impl rule__BranchAction__Group__3 )
            // InternalCBS.g:6296:2: rule__BranchAction__Group__2__Impl rule__BranchAction__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:6303:1: rule__BranchAction__Group__2__Impl : ( ( rule__BranchAction__BranchesAssignment_2 ) ) ;
    public final void rule__BranchAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6307:1: ( ( ( rule__BranchAction__BranchesAssignment_2 ) ) )
            // InternalCBS.g:6308:1: ( ( rule__BranchAction__BranchesAssignment_2 ) )
            {
            // InternalCBS.g:6308:1: ( ( rule__BranchAction__BranchesAssignment_2 ) )
            // InternalCBS.g:6309:2: ( rule__BranchAction__BranchesAssignment_2 )
            {
             before(grammarAccess.getBranchActionAccess().getBranchesAssignment_2()); 
            // InternalCBS.g:6310:2: ( rule__BranchAction__BranchesAssignment_2 )
            // InternalCBS.g:6310:3: rule__BranchAction__BranchesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__BranchesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBranchActionAccess().getBranchesAssignment_2()); 

            }


            }

        }
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
    // InternalCBS.g:6318:1: rule__BranchAction__Group__3 : rule__BranchAction__Group__3__Impl rule__BranchAction__Group__4 ;
    public final void rule__BranchAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6322:1: ( rule__BranchAction__Group__3__Impl rule__BranchAction__Group__4 )
            // InternalCBS.g:6323:2: rule__BranchAction__Group__3__Impl rule__BranchAction__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:6330:1: rule__BranchAction__Group__3__Impl : ( ( rule__BranchAction__Group_3__0 )* ) ;
    public final void rule__BranchAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6334:1: ( ( ( rule__BranchAction__Group_3__0 )* ) )
            // InternalCBS.g:6335:1: ( ( rule__BranchAction__Group_3__0 )* )
            {
            // InternalCBS.g:6335:1: ( ( rule__BranchAction__Group_3__0 )* )
            // InternalCBS.g:6336:2: ( rule__BranchAction__Group_3__0 )*
            {
             before(grammarAccess.getBranchActionAccess().getGroup_3()); 
            // InternalCBS.g:6337:2: ( rule__BranchAction__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCBS.g:6337:3: rule__BranchAction__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BranchAction__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getBranchActionAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalCBS.g:6345:1: rule__BranchAction__Group__4 : rule__BranchAction__Group__4__Impl ;
    public final void rule__BranchAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6349:1: ( rule__BranchAction__Group__4__Impl )
            // InternalCBS.g:6350:2: rule__BranchAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:6356:1: rule__BranchAction__Group__4__Impl : ( '}' ) ;
    public final void rule__BranchAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6360:1: ( ( '}' ) )
            // InternalCBS.g:6361:1: ( '}' )
            {
            // InternalCBS.g:6361:1: ( '}' )
            // InternalCBS.g:6362:2: '}'
            {
             before(grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__BranchAction__Group_3__0"
    // InternalCBS.g:6372:1: rule__BranchAction__Group_3__0 : rule__BranchAction__Group_3__0__Impl rule__BranchAction__Group_3__1 ;
    public final void rule__BranchAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6376:1: ( rule__BranchAction__Group_3__0__Impl rule__BranchAction__Group_3__1 )
            // InternalCBS.g:6377:2: rule__BranchAction__Group_3__0__Impl rule__BranchAction__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BranchAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchAction__Group_3__0"


    // $ANTLR start "rule__BranchAction__Group_3__0__Impl"
    // InternalCBS.g:6384:1: rule__BranchAction__Group_3__0__Impl : ( ',' ) ;
    public final void rule__BranchAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6388:1: ( ( ',' ) )
            // InternalCBS.g:6389:1: ( ',' )
            {
            // InternalCBS.g:6389:1: ( ',' )
            // InternalCBS.g:6390:2: ','
            {
             before(grammarAccess.getBranchActionAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBranchActionAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchAction__Group_3__0__Impl"


    // $ANTLR start "rule__BranchAction__Group_3__1"
    // InternalCBS.g:6399:1: rule__BranchAction__Group_3__1 : rule__BranchAction__Group_3__1__Impl ;
    public final void rule__BranchAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6403:1: ( rule__BranchAction__Group_3__1__Impl )
            // InternalCBS.g:6404:2: rule__BranchAction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchAction__Group_3__1"


    // $ANTLR start "rule__BranchAction__Group_3__1__Impl"
    // InternalCBS.g:6410:1: rule__BranchAction__Group_3__1__Impl : ( ( rule__BranchAction__BranchesAssignment_3_1 ) ) ;
    public final void rule__BranchAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6414:1: ( ( ( rule__BranchAction__BranchesAssignment_3_1 ) ) )
            // InternalCBS.g:6415:1: ( ( rule__BranchAction__BranchesAssignment_3_1 ) )
            {
            // InternalCBS.g:6415:1: ( ( rule__BranchAction__BranchesAssignment_3_1 ) )
            // InternalCBS.g:6416:2: ( rule__BranchAction__BranchesAssignment_3_1 )
            {
             before(grammarAccess.getBranchActionAccess().getBranchesAssignment_3_1()); 
            // InternalCBS.g:6417:2: ( rule__BranchAction__BranchesAssignment_3_1 )
            // InternalCBS.g:6417:3: rule__BranchAction__BranchesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchAction__BranchesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchActionAccess().getBranchesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchAction__Group_3__1__Impl"


    // $ANTLR start "rule__BranchTransition__Group__0"
    // InternalCBS.g:6426:1: rule__BranchTransition__Group__0 : rule__BranchTransition__Group__0__Impl rule__BranchTransition__Group__1 ;
    public final void rule__BranchTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6430:1: ( rule__BranchTransition__Group__0__Impl rule__BranchTransition__Group__1 )
            // InternalCBS.g:6431:2: rule__BranchTransition__Group__0__Impl rule__BranchTransition__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalCBS.g:6438:1: rule__BranchTransition__Group__0__Impl : ( ( rule__BranchTransition__BranchConditionAssignment_0 ) ) ;
    public final void rule__BranchTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6442:1: ( ( ( rule__BranchTransition__BranchConditionAssignment_0 ) ) )
            // InternalCBS.g:6443:1: ( ( rule__BranchTransition__BranchConditionAssignment_0 ) )
            {
            // InternalCBS.g:6443:1: ( ( rule__BranchTransition__BranchConditionAssignment_0 ) )
            // InternalCBS.g:6444:2: ( rule__BranchTransition__BranchConditionAssignment_0 )
            {
             before(grammarAccess.getBranchTransitionAccess().getBranchConditionAssignment_0()); 
            // InternalCBS.g:6445:2: ( rule__BranchTransition__BranchConditionAssignment_0 )
            // InternalCBS.g:6445:3: rule__BranchTransition__BranchConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__BranchConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBranchTransitionAccess().getBranchConditionAssignment_0()); 

            }


            }

        }
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
    // InternalCBS.g:6453:1: rule__BranchTransition__Group__1 : rule__BranchTransition__Group__1__Impl rule__BranchTransition__Group__2 ;
    public final void rule__BranchTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6457:1: ( rule__BranchTransition__Group__1__Impl rule__BranchTransition__Group__2 )
            // InternalCBS.g:6458:2: rule__BranchTransition__Group__1__Impl rule__BranchTransition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCBS.g:6465:1: rule__BranchTransition__Group__1__Impl : ( '?' ) ;
    public final void rule__BranchTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6469:1: ( ( '?' ) )
            // InternalCBS.g:6470:1: ( '?' )
            {
            // InternalCBS.g:6470:1: ( '?' )
            // InternalCBS.g:6471:2: '?'
            {
             before(grammarAccess.getBranchTransitionAccess().getQuestionMarkKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getBranchTransitionAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
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
    // InternalCBS.g:6480:1: rule__BranchTransition__Group__2 : rule__BranchTransition__Group__2__Impl rule__BranchTransition__Group__3 ;
    public final void rule__BranchTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6484:1: ( rule__BranchTransition__Group__2__Impl rule__BranchTransition__Group__3 )
            // InternalCBS.g:6485:2: rule__BranchTransition__Group__2__Impl rule__BranchTransition__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalCBS.g:6492:1: rule__BranchTransition__Group__2__Impl : ( '{' ) ;
    public final void rule__BranchTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6496:1: ( ( '{' ) )
            // InternalCBS.g:6497:1: ( '{' )
            {
            // InternalCBS.g:6497:1: ( '{' )
            // InternalCBS.g:6498:2: '{'
            {
             before(grammarAccess.getBranchTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchTransitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalCBS.g:6507:1: rule__BranchTransition__Group__3 : rule__BranchTransition__Group__3__Impl rule__BranchTransition__Group__4 ;
    public final void rule__BranchTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6511:1: ( rule__BranchTransition__Group__3__Impl rule__BranchTransition__Group__4 )
            // InternalCBS.g:6512:2: rule__BranchTransition__Group__3__Impl rule__BranchTransition__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:6519:1: rule__BranchTransition__Group__3__Impl : ( ( rule__BranchTransition__ActionsAssignment_3 ) ) ;
    public final void rule__BranchTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6523:1: ( ( ( rule__BranchTransition__ActionsAssignment_3 ) ) )
            // InternalCBS.g:6524:1: ( ( rule__BranchTransition__ActionsAssignment_3 ) )
            {
            // InternalCBS.g:6524:1: ( ( rule__BranchTransition__ActionsAssignment_3 ) )
            // InternalCBS.g:6525:2: ( rule__BranchTransition__ActionsAssignment_3 )
            {
             before(grammarAccess.getBranchTransitionAccess().getActionsAssignment_3()); 
            // InternalCBS.g:6526:2: ( rule__BranchTransition__ActionsAssignment_3 )
            // InternalCBS.g:6526:3: rule__BranchTransition__ActionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__ActionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBranchTransitionAccess().getActionsAssignment_3()); 

            }


            }

        }
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
    // InternalCBS.g:6534:1: rule__BranchTransition__Group__4 : rule__BranchTransition__Group__4__Impl rule__BranchTransition__Group__5 ;
    public final void rule__BranchTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6538:1: ( rule__BranchTransition__Group__4__Impl rule__BranchTransition__Group__5 )
            // InternalCBS.g:6539:2: rule__BranchTransition__Group__4__Impl rule__BranchTransition__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:6546:1: rule__BranchTransition__Group__4__Impl : ( ( rule__BranchTransition__Group_4__0 )* ) ;
    public final void rule__BranchTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6550:1: ( ( ( rule__BranchTransition__Group_4__0 )* ) )
            // InternalCBS.g:6551:1: ( ( rule__BranchTransition__Group_4__0 )* )
            {
            // InternalCBS.g:6551:1: ( ( rule__BranchTransition__Group_4__0 )* )
            // InternalCBS.g:6552:2: ( rule__BranchTransition__Group_4__0 )*
            {
             before(grammarAccess.getBranchTransitionAccess().getGroup_4()); 
            // InternalCBS.g:6553:2: ( rule__BranchTransition__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCBS.g:6553:3: rule__BranchTransition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BranchTransition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getBranchTransitionAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalCBS.g:6561:1: rule__BranchTransition__Group__5 : rule__BranchTransition__Group__5__Impl ;
    public final void rule__BranchTransition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6565:1: ( rule__BranchTransition__Group__5__Impl )
            // InternalCBS.g:6566:2: rule__BranchTransition__Group__5__Impl
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
    // InternalCBS.g:6572:1: rule__BranchTransition__Group__5__Impl : ( '}' ) ;
    public final void rule__BranchTransition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6576:1: ( ( '}' ) )
            // InternalCBS.g:6577:1: ( '}' )
            {
            // InternalCBS.g:6577:1: ( '}' )
            // InternalCBS.g:6578:2: '}'
            {
             before(grammarAccess.getBranchTransitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__BranchTransition__Group_4__0"
    // InternalCBS.g:6588:1: rule__BranchTransition__Group_4__0 : rule__BranchTransition__Group_4__0__Impl rule__BranchTransition__Group_4__1 ;
    public final void rule__BranchTransition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6592:1: ( rule__BranchTransition__Group_4__0__Impl rule__BranchTransition__Group_4__1 )
            // InternalCBS.g:6593:2: rule__BranchTransition__Group_4__0__Impl rule__BranchTransition__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__BranchTransition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchTransition__Group_4__0"


    // $ANTLR start "rule__BranchTransition__Group_4__0__Impl"
    // InternalCBS.g:6600:1: rule__BranchTransition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BranchTransition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6604:1: ( ( ',' ) )
            // InternalCBS.g:6605:1: ( ',' )
            {
            // InternalCBS.g:6605:1: ( ',' )
            // InternalCBS.g:6606:2: ','
            {
             before(grammarAccess.getBranchTransitionAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBranchTransitionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchTransition__Group_4__0__Impl"


    // $ANTLR start "rule__BranchTransition__Group_4__1"
    // InternalCBS.g:6615:1: rule__BranchTransition__Group_4__1 : rule__BranchTransition__Group_4__1__Impl ;
    public final void rule__BranchTransition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6619:1: ( rule__BranchTransition__Group_4__1__Impl )
            // InternalCBS.g:6620:2: rule__BranchTransition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchTransition__Group_4__1"


    // $ANTLR start "rule__BranchTransition__Group_4__1__Impl"
    // InternalCBS.g:6626:1: rule__BranchTransition__Group_4__1__Impl : ( ( rule__BranchTransition__ActionsAssignment_4_1 ) ) ;
    public final void rule__BranchTransition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6630:1: ( ( ( rule__BranchTransition__ActionsAssignment_4_1 ) ) )
            // InternalCBS.g:6631:1: ( ( rule__BranchTransition__ActionsAssignment_4_1 ) )
            {
            // InternalCBS.g:6631:1: ( ( rule__BranchTransition__ActionsAssignment_4_1 ) )
            // InternalCBS.g:6632:2: ( rule__BranchTransition__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getBranchTransitionAccess().getActionsAssignment_4_1()); 
            // InternalCBS.g:6633:2: ( rule__BranchTransition__ActionsAssignment_4_1 )
            // InternalCBS.g:6633:3: rule__BranchTransition__ActionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchTransition__ActionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchTransitionAccess().getActionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchTransition__Group_4__1__Impl"


    // $ANTLR start "rule__LoopAction__Group__0"
    // InternalCBS.g:6642:1: rule__LoopAction__Group__0 : rule__LoopAction__Group__0__Impl rule__LoopAction__Group__1 ;
    public final void rule__LoopAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6646:1: ( rule__LoopAction__Group__0__Impl rule__LoopAction__Group__1 )
            // InternalCBS.g:6647:2: rule__LoopAction__Group__0__Impl rule__LoopAction__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCBS.g:6654:1: rule__LoopAction__Group__0__Impl : ( () ) ;
    public final void rule__LoopAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6658:1: ( ( () ) )
            // InternalCBS.g:6659:1: ( () )
            {
            // InternalCBS.g:6659:1: ( () )
            // InternalCBS.g:6660:2: ()
            {
             before(grammarAccess.getLoopActionAccess().getLoopActionAction_0()); 
            // InternalCBS.g:6661:2: ()
            // InternalCBS.g:6661:3: 
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
    // InternalCBS.g:6669:1: rule__LoopAction__Group__1 : rule__LoopAction__Group__1__Impl rule__LoopAction__Group__2 ;
    public final void rule__LoopAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6673:1: ( rule__LoopAction__Group__1__Impl rule__LoopAction__Group__2 )
            // InternalCBS.g:6674:2: rule__LoopAction__Group__1__Impl rule__LoopAction__Group__2
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
    // InternalCBS.g:6681:1: rule__LoopAction__Group__1__Impl : ( 'loop' ) ;
    public final void rule__LoopAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6685:1: ( ( 'loop' ) )
            // InternalCBS.g:6686:1: ( 'loop' )
            {
            // InternalCBS.g:6686:1: ( 'loop' )
            // InternalCBS.g:6687:2: 'loop'
            {
             before(grammarAccess.getLoopActionAccess().getLoopKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getLoopKeyword_1()); 

            }


            }

        }
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
    // InternalCBS.g:6696:1: rule__LoopAction__Group__2 : rule__LoopAction__Group__2__Impl rule__LoopAction__Group__3 ;
    public final void rule__LoopAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6700:1: ( rule__LoopAction__Group__2__Impl rule__LoopAction__Group__3 )
            // InternalCBS.g:6701:2: rule__LoopAction__Group__2__Impl rule__LoopAction__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalCBS.g:6708:1: rule__LoopAction__Group__2__Impl : ( '{' ) ;
    public final void rule__LoopAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6712:1: ( ( '{' ) )
            // InternalCBS.g:6713:1: ( '{' )
            {
            // InternalCBS.g:6713:1: ( '{' )
            // InternalCBS.g:6714:2: '{'
            {
             before(grammarAccess.getLoopActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCBS.g:6723:1: rule__LoopAction__Group__3 : rule__LoopAction__Group__3__Impl rule__LoopAction__Group__4 ;
    public final void rule__LoopAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6727:1: ( rule__LoopAction__Group__3__Impl rule__LoopAction__Group__4 )
            // InternalCBS.g:6728:2: rule__LoopAction__Group__3__Impl rule__LoopAction__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCBS.g:6735:1: rule__LoopAction__Group__3__Impl : ( ( rule__LoopAction__BodyActionsAssignment_3 ) ) ;
    public final void rule__LoopAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6739:1: ( ( ( rule__LoopAction__BodyActionsAssignment_3 ) ) )
            // InternalCBS.g:6740:1: ( ( rule__LoopAction__BodyActionsAssignment_3 ) )
            {
            // InternalCBS.g:6740:1: ( ( rule__LoopAction__BodyActionsAssignment_3 ) )
            // InternalCBS.g:6741:2: ( rule__LoopAction__BodyActionsAssignment_3 )
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_3()); 
            // InternalCBS.g:6742:2: ( rule__LoopAction__BodyActionsAssignment_3 )
            // InternalCBS.g:6742:3: rule__LoopAction__BodyActionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__BodyActionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_3()); 

            }


            }

        }
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
    // InternalCBS.g:6750:1: rule__LoopAction__Group__4 : rule__LoopAction__Group__4__Impl rule__LoopAction__Group__5 ;
    public final void rule__LoopAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6754:1: ( rule__LoopAction__Group__4__Impl rule__LoopAction__Group__5 )
            // InternalCBS.g:6755:2: rule__LoopAction__Group__4__Impl rule__LoopAction__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__LoopAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCBS.g:6762:1: rule__LoopAction__Group__4__Impl : ( ( rule__LoopAction__Group_4__0 )* ) ;
    public final void rule__LoopAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6766:1: ( ( ( rule__LoopAction__Group_4__0 )* ) )
            // InternalCBS.g:6767:1: ( ( rule__LoopAction__Group_4__0 )* )
            {
            // InternalCBS.g:6767:1: ( ( rule__LoopAction__Group_4__0 )* )
            // InternalCBS.g:6768:2: ( rule__LoopAction__Group_4__0 )*
            {
             before(grammarAccess.getLoopActionAccess().getGroup_4()); 
            // InternalCBS.g:6769:2: ( rule__LoopAction__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCBS.g:6769:3: rule__LoopAction__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LoopAction__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getLoopActionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__LoopAction__Group__5"
    // InternalCBS.g:6777:1: rule__LoopAction__Group__5 : rule__LoopAction__Group__5__Impl ;
    public final void rule__LoopAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6781:1: ( rule__LoopAction__Group__5__Impl )
            // InternalCBS.g:6782:2: rule__LoopAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__Group__5"


    // $ANTLR start "rule__LoopAction__Group__5__Impl"
    // InternalCBS.g:6788:1: rule__LoopAction__Group__5__Impl : ( '}' ) ;
    public final void rule__LoopAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6792:1: ( ( '}' ) )
            // InternalCBS.g:6793:1: ( '}' )
            {
            // InternalCBS.g:6793:1: ( '}' )
            // InternalCBS.g:6794:2: '}'
            {
             before(grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__Group__5__Impl"


    // $ANTLR start "rule__LoopAction__Group_4__0"
    // InternalCBS.g:6804:1: rule__LoopAction__Group_4__0 : rule__LoopAction__Group_4__0__Impl rule__LoopAction__Group_4__1 ;
    public final void rule__LoopAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6808:1: ( rule__LoopAction__Group_4__0__Impl rule__LoopAction__Group_4__1 )
            // InternalCBS.g:6809:2: rule__LoopAction__Group_4__0__Impl rule__LoopAction__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__LoopAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__Group_4__0"


    // $ANTLR start "rule__LoopAction__Group_4__0__Impl"
    // InternalCBS.g:6816:1: rule__LoopAction__Group_4__0__Impl : ( ',' ) ;
    public final void rule__LoopAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6820:1: ( ( ',' ) )
            // InternalCBS.g:6821:1: ( ',' )
            {
            // InternalCBS.g:6821:1: ( ',' )
            // InternalCBS.g:6822:2: ','
            {
             before(grammarAccess.getLoopActionAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopActionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__Group_4__0__Impl"


    // $ANTLR start "rule__LoopAction__Group_4__1"
    // InternalCBS.g:6831:1: rule__LoopAction__Group_4__1 : rule__LoopAction__Group_4__1__Impl ;
    public final void rule__LoopAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6835:1: ( rule__LoopAction__Group_4__1__Impl )
            // InternalCBS.g:6836:2: rule__LoopAction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__Group_4__1"


    // $ANTLR start "rule__LoopAction__Group_4__1__Impl"
    // InternalCBS.g:6842:1: rule__LoopAction__Group_4__1__Impl : ( ( rule__LoopAction__BodyActionsAssignment_4_1 ) ) ;
    public final void rule__LoopAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6846:1: ( ( ( rule__LoopAction__BodyActionsAssignment_4_1 ) ) )
            // InternalCBS.g:6847:1: ( ( rule__LoopAction__BodyActionsAssignment_4_1 ) )
            {
            // InternalCBS.g:6847:1: ( ( rule__LoopAction__BodyActionsAssignment_4_1 ) )
            // InternalCBS.g:6848:2: ( rule__LoopAction__BodyActionsAssignment_4_1 )
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_4_1()); 
            // InternalCBS.g:6849:2: ( rule__LoopAction__BodyActionsAssignment_4_1 )
            // InternalCBS.g:6849:3: rule__LoopAction__BodyActionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LoopAction__BodyActionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__Group_4__1__Impl"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalCBS.g:6858:1: rule__System__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6862:1: ( ( ruleEString ) )
            // InternalCBS.g:6863:2: ( ruleEString )
            {
            // InternalCBS.g:6863:2: ( ruleEString )
            // InternalCBS.g:6864:3: ruleEString
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
    // InternalCBS.g:6873:1: rule__System__ChildContextsAssignment_3_2 : ( ruleAssemblyContext ) ;
    public final void rule__System__ChildContextsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6877:1: ( ( ruleAssemblyContext ) )
            // InternalCBS.g:6878:2: ( ruleAssemblyContext )
            {
            // InternalCBS.g:6878:2: ( ruleAssemblyContext )
            // InternalCBS.g:6879:3: ruleAssemblyContext
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
    // InternalCBS.g:6888:1: rule__System__ChildContextsAssignment_3_3_1 : ( ruleAssemblyContext ) ;
    public final void rule__System__ChildContextsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6892:1: ( ( ruleAssemblyContext ) )
            // InternalCBS.g:6893:2: ( ruleAssemblyContext )
            {
            // InternalCBS.g:6893:2: ( ruleAssemblyContext )
            // InternalCBS.g:6894:3: ruleAssemblyContext
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
    // InternalCBS.g:6903:1: rule__System__AssemblyConnectorsAssignment_4_2 : ( ruleAssemblyConnector ) ;
    public final void rule__System__AssemblyConnectorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6907:1: ( ( ruleAssemblyConnector ) )
            // InternalCBS.g:6908:2: ( ruleAssemblyConnector )
            {
            // InternalCBS.g:6908:2: ( ruleAssemblyConnector )
            // InternalCBS.g:6909:3: ruleAssemblyConnector
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
    // InternalCBS.g:6918:1: rule__System__AssemblyConnectorsAssignment_4_3_1 : ( ruleAssemblyConnector ) ;
    public final void rule__System__AssemblyConnectorsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6922:1: ( ( ruleAssemblyConnector ) )
            // InternalCBS.g:6923:2: ( ruleAssemblyConnector )
            {
            // InternalCBS.g:6923:2: ( ruleAssemblyConnector )
            // InternalCBS.g:6924:3: ruleAssemblyConnector
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
    // InternalCBS.g:6933:1: rule__System__RequiredDelegationConnectorsAssignment_5_2 : ( ruleRequiredDelegationConnector ) ;
    public final void rule__System__RequiredDelegationConnectorsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6937:1: ( ( ruleRequiredDelegationConnector ) )
            // InternalCBS.g:6938:2: ( ruleRequiredDelegationConnector )
            {
            // InternalCBS.g:6938:2: ( ruleRequiredDelegationConnector )
            // InternalCBS.g:6939:3: ruleRequiredDelegationConnector
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
    // InternalCBS.g:6948:1: rule__System__RequiredDelegationConnectorsAssignment_5_3_1 : ( ruleRequiredDelegationConnector ) ;
    public final void rule__System__RequiredDelegationConnectorsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6952:1: ( ( ruleRequiredDelegationConnector ) )
            // InternalCBS.g:6953:2: ( ruleRequiredDelegationConnector )
            {
            // InternalCBS.g:6953:2: ( ruleRequiredDelegationConnector )
            // InternalCBS.g:6954:3: ruleRequiredDelegationConnector
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
    // InternalCBS.g:6963:1: rule__System__ProvidedDelegationConnectorsAssignment_6_2 : ( ruleProvidedDelegationConnector ) ;
    public final void rule__System__ProvidedDelegationConnectorsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6967:1: ( ( ruleProvidedDelegationConnector ) )
            // InternalCBS.g:6968:2: ( ruleProvidedDelegationConnector )
            {
            // InternalCBS.g:6968:2: ( ruleProvidedDelegationConnector )
            // InternalCBS.g:6969:3: ruleProvidedDelegationConnector
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
    // InternalCBS.g:6978:1: rule__System__ProvidedDelegationConnectorsAssignment_6_3_1 : ( ruleProvidedDelegationConnector ) ;
    public final void rule__System__ProvidedDelegationConnectorsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6982:1: ( ( ruleProvidedDelegationConnector ) )
            // InternalCBS.g:6983:2: ( ruleProvidedDelegationConnector )
            {
            // InternalCBS.g:6983:2: ( ruleProvidedDelegationConnector )
            // InternalCBS.g:6984:3: ruleProvidedDelegationConnector
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
    // InternalCBS.g:6993:1: rule__System__AllocationAssignment_8 : ( ruleAllocation ) ;
    public final void rule__System__AllocationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:6997:1: ( ( ruleAllocation ) )
            // InternalCBS.g:6998:2: ( ruleAllocation )
            {
            // InternalCBS.g:6998:2: ( ruleAllocation )
            // InternalCBS.g:6999:3: ruleAllocation
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


    // $ANTLR start "rule__Allocation__EnvironmentAssignment_3"
    // InternalCBS.g:7008:1: rule__Allocation__EnvironmentAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Allocation__EnvironmentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7012:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7013:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7013:2: ( ( ruleEString ) )
            // InternalCBS.g:7014:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationAccess().getEnvironmentEnvironmentCrossReference_3_0()); 
            // InternalCBS.g:7015:3: ( ruleEString )
            // InternalCBS.g:7016:4: ruleEString
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
    // InternalCBS.g:7027:1: rule__Allocation__AllocationContextsAssignment_4_2 : ( ruleAllocationContext ) ;
    public final void rule__Allocation__AllocationContextsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7031:1: ( ( ruleAllocationContext ) )
            // InternalCBS.g:7032:2: ( ruleAllocationContext )
            {
            // InternalCBS.g:7032:2: ( ruleAllocationContext )
            // InternalCBS.g:7033:3: ruleAllocationContext
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
    // InternalCBS.g:7042:1: rule__Allocation__AllocationContextsAssignment_4_3_1 : ( ruleAllocationContext ) ;
    public final void rule__Allocation__AllocationContextsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7046:1: ( ( ruleAllocationContext ) )
            // InternalCBS.g:7047:2: ( ruleAllocationContext )
            {
            // InternalCBS.g:7047:2: ( ruleAllocationContext )
            // InternalCBS.g:7048:3: ruleAllocationContext
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


    // $ANTLR start "rule__AllocationContext__ContainerAssignment_3"
    // InternalCBS.g:7057:1: rule__AllocationContext__ContainerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7061:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7062:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7062:2: ( ( ruleEString ) )
            // InternalCBS.g:7063:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 
            // InternalCBS.g:7064:3: ( ruleEString )
            // InternalCBS.g:7065:4: ruleEString
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
    // InternalCBS.g:7076:1: rule__AllocationContext__AllocatesAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AllocatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7080:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7081:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7081:2: ( ( ruleEString ) )
            // InternalCBS.g:7082:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextCrossReference_5_0()); 
            // InternalCBS.g:7083:3: ( ruleEString )
            // InternalCBS.g:7084:4: ruleEString
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
    // InternalCBS.g:7095:1: rule__Container__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7099:1: ( ( ruleEString ) )
            // InternalCBS.g:7100:2: ( ruleEString )
            {
            // InternalCBS.g:7100:2: ( ruleEString )
            // InternalCBS.g:7101:3: ruleEString
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
    // InternalCBS.g:7110:1: rule__Linker__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Linker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7114:1: ( ( ruleEString ) )
            // InternalCBS.g:7115:2: ( ruleEString )
            {
            // InternalCBS.g:7115:2: ( ruleEString )
            // InternalCBS.g:7116:3: ruleEString
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
    // InternalCBS.g:7125:1: rule__Linker__LinksAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Linker__LinksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7129:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7130:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7130:2: ( ( ruleEString ) )
            // InternalCBS.g:7131:3: ( ruleEString )
            {
             before(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_5_0()); 
            // InternalCBS.g:7132:3: ( ruleEString )
            // InternalCBS.g:7133:4: ruleEString
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
    // InternalCBS.g:7144:1: rule__Linker__LinksAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Linker__LinksAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7148:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7149:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7149:2: ( ( ruleEString ) )
            // InternalCBS.g:7150:3: ( ruleEString )
            {
             before(grammarAccess.getLinkerAccess().getLinksContainerCrossReference_6_1_0()); 
            // InternalCBS.g:7151:3: ( ruleEString )
            // InternalCBS.g:7152:4: ruleEString
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


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalCBS.g:7163:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7167:1: ( ( ruleEString ) )
            // InternalCBS.g:7168:2: ( ruleEString )
            {
            // InternalCBS.g:7168:2: ( ruleEString )
            // InternalCBS.g:7169:3: ruleEString
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
    // InternalCBS.g:7178:1: rule__AssemblyContext__InstantiatesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__InstantiatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7182:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7183:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7183:2: ( ( ruleEString ) )
            // InternalCBS.g:7184:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getInstantiatesComponentCrossReference_4_0()); 
            // InternalCBS.g:7185:3: ( ruleEString )
            // InternalCBS.g:7186:4: ruleEString
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
    // InternalCBS.g:7197:1: rule__AssemblyContext__ProvidedRolesAssignment_5_2 : ( ruleProvidedRole ) ;
    public final void rule__AssemblyContext__ProvidedRolesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7201:1: ( ( ruleProvidedRole ) )
            // InternalCBS.g:7202:2: ( ruleProvidedRole )
            {
            // InternalCBS.g:7202:2: ( ruleProvidedRole )
            // InternalCBS.g:7203:3: ruleProvidedRole
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
    // InternalCBS.g:7212:1: rule__AssemblyContext__ProvidedRolesAssignment_5_3_1 : ( ruleProvidedRole ) ;
    public final void rule__AssemblyContext__ProvidedRolesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7216:1: ( ( ruleProvidedRole ) )
            // InternalCBS.g:7217:2: ( ruleProvidedRole )
            {
            // InternalCBS.g:7217:2: ( ruleProvidedRole )
            // InternalCBS.g:7218:3: ruleProvidedRole
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
    // InternalCBS.g:7227:1: rule__AssemblyContext__RequiredRolesAssignment_6_2 : ( ruleRequiredRole ) ;
    public final void rule__AssemblyContext__RequiredRolesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7231:1: ( ( ruleRequiredRole ) )
            // InternalCBS.g:7232:2: ( ruleRequiredRole )
            {
            // InternalCBS.g:7232:2: ( ruleRequiredRole )
            // InternalCBS.g:7233:3: ruleRequiredRole
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
    // InternalCBS.g:7242:1: rule__AssemblyContext__RequiredRolesAssignment_6_3_1 : ( ruleRequiredRole ) ;
    public final void rule__AssemblyContext__RequiredRolesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7246:1: ( ( ruleRequiredRole ) )
            // InternalCBS.g:7247:2: ( ruleRequiredRole )
            {
            // InternalCBS.g:7247:2: ( ruleRequiredRole )
            // InternalCBS.g:7248:3: ruleRequiredRole
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
    // InternalCBS.g:7257:1: rule__AssemblyConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7261:1: ( ( ruleEString ) )
            // InternalCBS.g:7262:2: ( ruleEString )
            {
            // InternalCBS.g:7262:2: ( ruleEString )
            // InternalCBS.g:7263:3: ruleEString
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
    // InternalCBS.g:7272:1: rule__AssemblyConnector__RequiringRoleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__RequiringRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7276:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7277:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7277:2: ( ( ruleEString ) )
            // InternalCBS.g:7278:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleCrossReference_4_0()); 
            // InternalCBS.g:7279:3: ( ruleEString )
            // InternalCBS.g:7280:4: ruleEString
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
    // InternalCBS.g:7291:1: rule__AssemblyConnector__ProvidingRoleAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__ProvidingRoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7295:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7296:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7296:2: ( ( ruleEString ) )
            // InternalCBS.g:7297:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleCrossReference_6_0()); 
            // InternalCBS.g:7298:3: ( ruleEString )
            // InternalCBS.g:7299:4: ruleEString
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
    // InternalCBS.g:7310:1: rule__RequiredDelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequiredDelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7314:1: ( ( ruleEString ) )
            // InternalCBS.g:7315:2: ( ruleEString )
            {
            // InternalCBS.g:7315:2: ( ruleEString )
            // InternalCBS.g:7316:3: ruleEString
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
    // InternalCBS.g:7325:1: rule__RequiredDelegationConnector__RequiringRoleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RequiredDelegationConnector__RequiringRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7329:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7330:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7330:2: ( ( ruleEString ) )
            // InternalCBS.g:7331:3: ( ruleEString )
            {
             before(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleRequiredRoleCrossReference_4_0()); 
            // InternalCBS.g:7332:3: ( ruleEString )
            // InternalCBS.g:7333:4: ruleEString
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
    // InternalCBS.g:7344:1: rule__ProvidedDelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProvidedDelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7348:1: ( ( ruleEString ) )
            // InternalCBS.g:7349:2: ( ruleEString )
            {
            // InternalCBS.g:7349:2: ( ruleEString )
            // InternalCBS.g:7350:3: ruleEString
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
    // InternalCBS.g:7359:1: rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProvidedDelegationConnector__ProvidingRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7363:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7364:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7364:2: ( ( ruleEString ) )
            // InternalCBS.g:7365:3: ( ruleEString )
            {
             before(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleProvidedRoleCrossReference_4_0()); 
            // InternalCBS.g:7366:3: ( ruleEString )
            // InternalCBS.g:7367:4: ruleEString
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


    // $ANTLR start "rule__ProvidedRole__NameAssignment_1"
    // InternalCBS.g:7378:1: rule__ProvidedRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProvidedRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7382:1: ( ( ruleEString ) )
            // InternalCBS.g:7383:2: ( ruleEString )
            {
            // InternalCBS.g:7383:2: ( ruleEString )
            // InternalCBS.g:7384:3: ruleEString
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
    // InternalCBS.g:7393:1: rule__ProvidedRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProvidedRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7397:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7398:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7398:2: ( ( ruleEString ) )
            // InternalCBS.g:7399:3: ( ruleEString )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalCBS.g:7400:3: ( ruleEString )
            // InternalCBS.g:7401:4: ruleEString
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
    // InternalCBS.g:7412:1: rule__RequiredRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequiredRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7416:1: ( ( ruleEString ) )
            // InternalCBS.g:7417:2: ( ruleEString )
            {
            // InternalCBS.g:7417:2: ( ruleEString )
            // InternalCBS.g:7418:3: ruleEString
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
    // InternalCBS.g:7427:1: rule__RequiredRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RequiredRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7431:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7432:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7432:2: ( ( ruleEString ) )
            // InternalCBS.g:7433:3: ( ruleEString )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalCBS.g:7434:3: ( ruleEString )
            // InternalCBS.g:7435:4: ruleEString
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
    // InternalCBS.g:7446:1: rule__AtomicComponent__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AtomicComponent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7450:1: ( ( ruleEString ) )
            // InternalCBS.g:7451:2: ( ruleEString )
            {
            // InternalCBS.g:7451:2: ( ruleEString )
            // InternalCBS.g:7452:3: ruleEString
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
    // InternalCBS.g:7461:1: rule__AtomicComponent__RequiresAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicComponent__RequiresAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7465:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7466:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7466:2: ( ( ruleEString ) )
            // InternalCBS.g:7467:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_2_0()); 
            // InternalCBS.g:7468:3: ( ruleEString )
            // InternalCBS.g:7469:4: ruleEString
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
    // InternalCBS.g:7480:1: rule__AtomicComponent__RequiresAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicComponent__RequiresAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7484:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7485:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7485:2: ( ( ruleEString ) )
            // InternalCBS.g:7486:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0()); 
            // InternalCBS.g:7487:3: ( ruleEString )
            // InternalCBS.g:7488:4: ruleEString
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
    // InternalCBS.g:7499:1: rule__AtomicComponent__ProvidesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicComponent__ProvidesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7503:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7504:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7504:2: ( ( ruleEString ) )
            // InternalCBS.g:7505:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_2_0()); 
            // InternalCBS.g:7506:3: ( ruleEString )
            // InternalCBS.g:7507:4: ruleEString
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
    // InternalCBS.g:7518:1: rule__AtomicComponent__ProvidesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AtomicComponent__ProvidesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7522:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7523:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7523:2: ( ( ruleEString ) )
            // InternalCBS.g:7524:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0()); 
            // InternalCBS.g:7525:3: ( ruleEString )
            // InternalCBS.g:7526:4: ruleEString
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
    // InternalCBS.g:7537:1: rule__AtomicComponent__ServicesAssignment_6_2 : ( ruleService ) ;
    public final void rule__AtomicComponent__ServicesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7541:1: ( ( ruleService ) )
            // InternalCBS.g:7542:2: ( ruleService )
            {
            // InternalCBS.g:7542:2: ( ruleService )
            // InternalCBS.g:7543:3: ruleService
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
    // InternalCBS.g:7552:1: rule__AtomicComponent__ServicesAssignment_6_3_1 : ( ruleService ) ;
    public final void rule__AtomicComponent__ServicesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7556:1: ( ( ruleService ) )
            // InternalCBS.g:7557:2: ( ruleService )
            {
            // InternalCBS.g:7557:2: ( ruleService )
            // InternalCBS.g:7558:3: ruleService
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


    // $ANTLR start "rule__Signature__ReturnTypeAssignment_0"
    // InternalCBS.g:7567:1: rule__Signature__ReturnTypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7571:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7572:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7572:2: ( ( ruleEString ) )
            // InternalCBS.g:7573:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_0_0()); 
            // InternalCBS.g:7574:3: ( ruleEString )
            // InternalCBS.g:7575:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getReturnTypeTypeEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ReturnTypeAssignment_0"


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalCBS.g:7586:1: rule__Signature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7590:1: ( ( ruleEString ) )
            // InternalCBS.g:7591:2: ( ruleEString )
            {
            // InternalCBS.g:7591:2: ( ruleEString )
            // InternalCBS.g:7592:3: ruleEString
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


    // $ANTLR start "rule__Signature__ParametersAssignment_2_1"
    // InternalCBS.g:7601:1: rule__Signature__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Signature__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7605:1: ( ( ruleParameter ) )
            // InternalCBS.g:7606:2: ( ruleParameter )
            {
            // InternalCBS.g:7606:2: ( ruleParameter )
            // InternalCBS.g:7607:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParametersAssignment_2_1"


    // $ANTLR start "rule__Signature__ParametersAssignment_2_2_1"
    // InternalCBS.g:7616:1: rule__Signature__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Signature__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7620:1: ( ( ruleParameter ) )
            // InternalCBS.g:7621:2: ( ruleParameter )
            {
            // InternalCBS.g:7621:2: ( ruleParameter )
            // InternalCBS.g:7622:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // InternalCBS.g:7631:1: rule__Parameter__TypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7635:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7636:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7636:2: ( ( ruleEString ) )
            // InternalCBS.g:7637:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeCrossReference_0_0()); 
            // InternalCBS.g:7638:3: ( ruleEString )
            // InternalCBS.g:7639:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParameterTypeEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeParameterTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalCBS.g:7650:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7654:1: ( ( ruleEString ) )
            // InternalCBS.g:7655:2: ( ruleEString )
            {
            // InternalCBS.g:7655:2: ( ruleEString )
            // InternalCBS.g:7656:3: ruleEString
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


    // $ANTLR start "rule__SimpleType__TypeAssignment_1"
    // InternalCBS.g:7665:1: rule__SimpleType__TypeAssignment_1 : ( ruleSimpleTypeEnum ) ;
    public final void rule__SimpleType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7669:1: ( ( ruleSimpleTypeEnum ) )
            // InternalCBS.g:7670:2: ( ruleSimpleTypeEnum )
            {
            // InternalCBS.g:7670:2: ( ruleSimpleTypeEnum )
            // InternalCBS.g:7671:3: ruleSimpleTypeEnum
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeEnum();

            state._fsp--;

             after(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__TypeAssignment_1"


    // $ANTLR start "rule__ComplexType__MembersAssignment_3_0"
    // InternalCBS.g:7680:1: rule__ComplexType__MembersAssignment_3_0 : ( ruleComplexMember ) ;
    public final void rule__ComplexType__MembersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7684:1: ( ( ruleComplexMember ) )
            // InternalCBS.g:7685:2: ( ruleComplexMember )
            {
            // InternalCBS.g:7685:2: ( ruleComplexMember )
            // InternalCBS.g:7686:3: ruleComplexMember
            {
             before(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexMember();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__MembersAssignment_3_0"


    // $ANTLR start "rule__ComplexType__MembersAssignment_3_1_1"
    // InternalCBS.g:7695:1: rule__ComplexType__MembersAssignment_3_1_1 : ( ruleComplexMember ) ;
    public final void rule__ComplexType__MembersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7699:1: ( ( ruleComplexMember ) )
            // InternalCBS.g:7700:2: ( ruleComplexMember )
            {
            // InternalCBS.g:7700:2: ( ruleComplexMember )
            // InternalCBS.g:7701:3: ruleComplexMember
            {
             before(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexMember();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getMembersComplexMemberParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__MembersAssignment_3_1_1"


    // $ANTLR start "rule__ComplexMember__NameAssignment_0"
    // InternalCBS.g:7710:1: rule__ComplexMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ComplexMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7714:1: ( ( ruleEString ) )
            // InternalCBS.g:7715:2: ( ruleEString )
            {
            // InternalCBS.g:7715:2: ( ruleEString )
            // InternalCBS.g:7716:3: ruleEString
            {
             before(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexMember__NameAssignment_0"


    // $ANTLR start "rule__ComplexMember__TypeAssignment_2"
    // InternalCBS.g:7725:1: rule__ComplexMember__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ComplexMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7729:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7730:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7730:2: ( ( ruleEString ) )
            // InternalCBS.g:7731:3: ( ruleEString )
            {
             before(grammarAccess.getComplexMemberAccess().getTypeParameterTypeCrossReference_2_0()); 
            // InternalCBS.g:7732:3: ( ruleEString )
            // InternalCBS.g:7733:4: ruleEString
            {
             before(grammarAccess.getComplexMemberAccess().getTypeParameterTypeEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexMemberAccess().getTypeParameterTypeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getComplexMemberAccess().getTypeParameterTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexMember__TypeAssignment_2"


    // $ANTLR start "rule__CollectionType__TypeAssignment_0"
    // InternalCBS.g:7744:1: rule__CollectionType__TypeAssignment_0 : ( ruleCollectionTypeEnum ) ;
    public final void rule__CollectionType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7748:1: ( ( ruleCollectionTypeEnum ) )
            // InternalCBS.g:7749:2: ( ruleCollectionTypeEnum )
            {
            // InternalCBS.g:7749:2: ( ruleCollectionTypeEnum )
            // InternalCBS.g:7750:3: ruleCollectionTypeEnum
            {
             before(grammarAccess.getCollectionTypeAccess().getTypeCollectionTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionTypeEnum();

            state._fsp--;

             after(grammarAccess.getCollectionTypeAccess().getTypeCollectionTypeEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__TypeAssignment_0"


    // $ANTLR start "rule__CollectionType__InnerTypeAssignment_2"
    // InternalCBS.g:7759:1: rule__CollectionType__InnerTypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__CollectionType__InnerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7763:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7764:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7764:2: ( ( ruleEString ) )
            // InternalCBS.g:7765:3: ( ruleEString )
            {
             before(grammarAccess.getCollectionTypeAccess().getInnerTypeParameterTypeCrossReference_2_0()); 
            // InternalCBS.g:7766:3: ( ruleEString )
            // InternalCBS.g:7767:4: ruleEString
            {
             before(grammarAccess.getCollectionTypeAccess().getInnerTypeParameterTypeEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollectionTypeAccess().getInnerTypeParameterTypeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCollectionTypeAccess().getInnerTypeParameterTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__InnerTypeAssignment_2"


    // $ANTLR start "rule__Service__ImplementsAssignment_1"
    // InternalCBS.g:7778:1: rule__Service__ImplementsAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__ImplementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7782:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7783:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7783:2: ( ( ruleEString ) )
            // InternalCBS.g:7784:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getImplementsSignatureCrossReference_1_0()); 
            // InternalCBS.g:7785:3: ( ruleEString )
            // InternalCBS.g:7786:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getImplementsSignatureEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getImplementsSignatureEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getImplementsSignatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ImplementsAssignment_1"


    // $ANTLR start "rule__Service__ActionsAssignment_3"
    // InternalCBS.g:7797:1: rule__Service__ActionsAssignment_3 : ( ruleAbstractAction ) ;
    public final void rule__Service__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7801:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:7802:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:7802:2: ( ruleAbstractAction )
            // InternalCBS.g:7803:3: ruleAbstractAction
            {
             before(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ActionsAssignment_3"


    // $ANTLR start "rule__Service__ActionsAssignment_4_1"
    // InternalCBS.g:7812:1: rule__Service__ActionsAssignment_4_1 : ( ruleAbstractAction ) ;
    public final void rule__Service__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7816:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:7817:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:7817:2: ( ruleAbstractAction )
            // InternalCBS.g:7818:3: ruleAbstractAction
            {
             before(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getActionsAbstractActionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ActionsAssignment_4_1"


    // $ANTLR start "rule__ExternalCallAction__RequiredServiceAssignment_1"
    // InternalCBS.g:7827:1: rule__ExternalCallAction__RequiredServiceAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ExternalCallAction__RequiredServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7831:1: ( ( ( ruleEString ) ) )
            // InternalCBS.g:7832:2: ( ( ruleEString ) )
            {
            // InternalCBS.g:7832:2: ( ( ruleEString ) )
            // InternalCBS.g:7833:3: ( ruleEString )
            {
             before(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureCrossReference_1_0()); 
            // InternalCBS.g:7834:3: ( ruleEString )
            // InternalCBS.g:7835:4: ruleEString
            {
             before(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCallAction__RequiredServiceAssignment_1"


    // $ANTLR start "rule__BranchAction__BranchesAssignment_2"
    // InternalCBS.g:7846:1: rule__BranchAction__BranchesAssignment_2 : ( ruleBranchTransition ) ;
    public final void rule__BranchAction__BranchesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7850:1: ( ( ruleBranchTransition ) )
            // InternalCBS.g:7851:2: ( ruleBranchTransition )
            {
            // InternalCBS.g:7851:2: ( ruleBranchTransition )
            // InternalCBS.g:7852:3: ruleBranchTransition
            {
             before(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchTransition();

            state._fsp--;

             after(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchAction__BranchesAssignment_2"


    // $ANTLR start "rule__BranchAction__BranchesAssignment_3_1"
    // InternalCBS.g:7861:1: rule__BranchAction__BranchesAssignment_3_1 : ( ruleBranchTransition ) ;
    public final void rule__BranchAction__BranchesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7865:1: ( ( ruleBranchTransition ) )
            // InternalCBS.g:7866:2: ( ruleBranchTransition )
            {
            // InternalCBS.g:7866:2: ( ruleBranchTransition )
            // InternalCBS.g:7867:3: ruleBranchTransition
            {
             before(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchTransition();

            state._fsp--;

             after(grammarAccess.getBranchActionAccess().getBranchesBranchTransitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchAction__BranchesAssignment_3_1"


    // $ANTLR start "rule__BranchTransition__BranchConditionAssignment_0"
    // InternalCBS.g:7876:1: rule__BranchTransition__BranchConditionAssignment_0 : ( ruleEString ) ;
    public final void rule__BranchTransition__BranchConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7880:1: ( ( ruleEString ) )
            // InternalCBS.g:7881:2: ( ruleEString )
            {
            // InternalCBS.g:7881:2: ( ruleEString )
            // InternalCBS.g:7882:3: ruleEString
            {
             before(grammarAccess.getBranchTransitionAccess().getBranchConditionEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBranchTransitionAccess().getBranchConditionEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchTransition__BranchConditionAssignment_0"


    // $ANTLR start "rule__BranchTransition__ActionsAssignment_3"
    // InternalCBS.g:7891:1: rule__BranchTransition__ActionsAssignment_3 : ( ruleAbstractAction ) ;
    public final void rule__BranchTransition__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7895:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:7896:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:7896:2: ( ruleAbstractAction )
            // InternalCBS.g:7897:3: ruleAbstractAction
            {
             before(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchTransition__ActionsAssignment_3"


    // $ANTLR start "rule__BranchTransition__ActionsAssignment_4_1"
    // InternalCBS.g:7906:1: rule__BranchTransition__ActionsAssignment_4_1 : ( ruleAbstractAction ) ;
    public final void rule__BranchTransition__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7910:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:7911:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:7911:2: ( ruleAbstractAction )
            // InternalCBS.g:7912:3: ruleAbstractAction
            {
             before(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getBranchTransitionAccess().getActionsAbstractActionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchTransition__ActionsAssignment_4_1"


    // $ANTLR start "rule__LoopAction__BodyActionsAssignment_3"
    // InternalCBS.g:7921:1: rule__LoopAction__BodyActionsAssignment_3 : ( ruleAbstractAction ) ;
    public final void rule__LoopAction__BodyActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7925:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:7926:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:7926:2: ( ruleAbstractAction )
            // InternalCBS.g:7927:3: ruleAbstractAction
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__BodyActionsAssignment_3"


    // $ANTLR start "rule__LoopAction__BodyActionsAssignment_4_1"
    // InternalCBS.g:7936:1: rule__LoopAction__BodyActionsAssignment_4_1 : ( ruleAbstractAction ) ;
    public final void rule__LoopAction__BodyActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBS.g:7940:1: ( ( ruleAbstractAction ) )
            // InternalCBS.g:7941:2: ( ruleAbstractAction )
            {
            // InternalCBS.g:7941:2: ( ruleAbstractAction )
            // InternalCBS.g:7942:3: ruleAbstractAction
            {
             before(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAction();

            state._fsp--;

             after(grammarAccess.getLoopActionAccess().getBodyActionsAbstractActionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopAction__BodyActionsAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000003A800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x01C0000001000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000001000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});

}