/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalCBSParser;
import org.xtext.example.mydsl.services.CBSGrammarAccess;

public class CBSParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CBSGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CBSGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getAbstractActionAccess().getAlternatives(), "rule__AbstractAction__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getSimpleTypeEnumAccess().getAlternatives(), "rule__SimpleTypeEnum__Alternatives");
			builder.put(grammarAccess.getCollectionTypeEnumAccess().getAlternatives(), "rule__CollectionTypeEnum__Alternatives");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_3(), "rule__System__Group_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_3_3(), "rule__System__Group_3_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_4(), "rule__System__Group_4__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_4_3(), "rule__System__Group_4_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_5(), "rule__System__Group_5__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_5_3(), "rule__System__Group_5_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_6(), "rule__System__Group_6__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_6_3(), "rule__System__Group_6_3__0");
			builder.put(grammarAccess.getAllocationAccess().getGroup(), "rule__Allocation__Group__0");
			builder.put(grammarAccess.getAllocationAccess().getGroup_2(), "rule__Allocation__Group_2__0");
			builder.put(grammarAccess.getAllocationAccess().getGroup_2_3(), "rule__Allocation__Group_2_3__0");
			builder.put(grammarAccess.getAllocationContextAccess().getGroup(), "rule__AllocationContext__Group__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_4(), "rule__Environment__Group_4__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_4_3(), "rule__Environment__Group_4_3__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_5(), "rule__Environment__Group_5__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_5_3(), "rule__Environment__Group_5_3__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getLinkerAccess().getGroup(), "rule__Linker__Group__0");
			builder.put(grammarAccess.getLinkerAccess().getGroup_1(), "rule__Linker__Group_1__0");
			builder.put(grammarAccess.getAssemblyAccess().getGroup(), "rule__Assembly__Group__0");
			builder.put(grammarAccess.getAssemblyAccess().getGroup_4(), "rule__Assembly__Group_4__0");
			builder.put(grammarAccess.getAssemblyAccess().getGroup_4_1(), "rule__Assembly__Group_4_1__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup(), "rule__CompositeComponent__Group__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_4(), "rule__CompositeComponent__Group_4__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_4_3(), "rule__CompositeComponent__Group_4_3__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_5(), "rule__CompositeComponent__Group_5__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_5_3(), "rule__CompositeComponent__Group_5_3__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_6(), "rule__CompositeComponent__Group_6__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_6_3(), "rule__CompositeComponent__Group_6_3__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_7(), "rule__CompositeComponent__Group_7__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_7_3(), "rule__CompositeComponent__Group_7_3__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_8(), "rule__CompositeComponent__Group_8__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_8_3(), "rule__CompositeComponent__Group_8_3__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_9(), "rule__CompositeComponent__Group_9__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_9_3(), "rule__CompositeComponent__Group_9_3__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup(), "rule__AssemblyContext__Group__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_4(), "rule__AssemblyContext__Group_4__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_4_3(), "rule__AssemblyContext__Group_4_3__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_5(), "rule__AssemblyContext__Group_5__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_5_3(), "rule__AssemblyContext__Group_5_3__0");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getGroup(), "rule__AssemblyConnector__Group__0");
			builder.put(grammarAccess.getProvidedRoleAccess().getGroup(), "rule__ProvidedRole__Group__0");
			builder.put(grammarAccess.getRequiredRoleAccess().getGroup(), "rule__RequiredRole__Group__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_3(), "rule__Repository__Group_3__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_3_3(), "rule__Repository__Group_3_3__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_4(), "rule__Repository__Group_4__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_4_3(), "rule__Repository__Group_4_3__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_5(), "rule__Repository__Group_5__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_5_3(), "rule__Repository__Group_5_3__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup_4(), "rule__Interface__Group_4__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup_4_1(), "rule__Interface__Group_4_1__0");
			builder.put(grammarAccess.getAtomicComponentAccess().getGroup(), "rule__AtomicComponent__Group__0");
			builder.put(grammarAccess.getAtomicComponentAccess().getGroup_4(), "rule__AtomicComponent__Group_4__0");
			builder.put(grammarAccess.getAtomicComponentAccess().getGroup_4_3(), "rule__AtomicComponent__Group_4_3__0");
			builder.put(grammarAccess.getAtomicComponentAccess().getGroup_5(), "rule__AtomicComponent__Group_5__0");
			builder.put(grammarAccess.getAtomicComponentAccess().getGroup_5_3(), "rule__AtomicComponent__Group_5_3__0");
			builder.put(grammarAccess.getAtomicComponentAccess().getGroup_6(), "rule__AtomicComponent__Group_6__0");
			builder.put(grammarAccess.getAtomicComponentAccess().getGroup_6_3(), "rule__AtomicComponent__Group_6_3__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_3(), "rule__Signature__Group_3__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_3_1(), "rule__Signature__Group_3_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getSimpleTypeAccess().getGroup(), "rule__SimpleType__Group__0");
			builder.put(grammarAccess.getComplexTypeAccess().getGroup(), "rule__ComplexType__Group__0");
			builder.put(grammarAccess.getComplexTypeAccess().getGroup_4(), "rule__ComplexType__Group_4__0");
			builder.put(grammarAccess.getComplexTypeAccess().getGroup_4_1(), "rule__ComplexType__Group_4_1__0");
			builder.put(grammarAccess.getComplexMemberAccess().getGroup(), "rule__ComplexMember__Group__0");
			builder.put(grammarAccess.getVoidAccess().getGroup(), "rule__Void__Group__0");
			builder.put(grammarAccess.getCollectionTypeAccess().getGroup(), "rule__CollectionType__Group__0");
			builder.put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_4(), "rule__Service__Group_4__0");
			builder.put(grammarAccess.getInternalActionAccess().getGroup(), "rule__InternalAction__Group__0");
			builder.put(grammarAccess.getExternalCallActionAccess().getGroup(), "rule__ExternalCallAction__Group__0");
			builder.put(grammarAccess.getBranchActionAccess().getGroup(), "rule__BranchAction__Group__0");
			builder.put(grammarAccess.getBranchActionAccess().getGroup_3(), "rule__BranchAction__Group_3__0");
			builder.put(grammarAccess.getBranchTransitionAccess().getGroup(), "rule__BranchTransition__Group__0");
			builder.put(grammarAccess.getBranchTransitionAccess().getGroup_4(), "rule__BranchTransition__Group_4__0");
			builder.put(grammarAccess.getLoopActionAccess().getGroup(), "rule__LoopAction__Group__0");
			builder.put(grammarAccess.getLoopActionAccess().getGroup_4(), "rule__LoopAction__Group_4__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getComponentBasedSystemContainerAccess().getRepositoryAssignment_0(), "rule__ComponentBasedSystemContainer__RepositoryAssignment_0");
			builder.put(grammarAccess.getComponentBasedSystemContainerAccess().getAssemblyAssignment_1(), "rule__ComponentBasedSystemContainer__AssemblyAssignment_1");
			builder.put(grammarAccess.getComponentBasedSystemContainerAccess().getEnvironmentAssignment_2(), "rule__ComponentBasedSystemContainer__EnvironmentAssignment_2");
			builder.put(grammarAccess.getComponentBasedSystemContainerAccess().getSystemAssignment_3(), "rule__ComponentBasedSystemContainer__SystemAssignment_3");
			builder.put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
			builder.put(grammarAccess.getSystemAccess().getChildContextsAssignment_3_2(), "rule__System__ChildContextsAssignment_3_2");
			builder.put(grammarAccess.getSystemAccess().getChildContextsAssignment_3_3_1(), "rule__System__ChildContextsAssignment_3_3_1");
			builder.put(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_4_2(), "rule__System__AssemblyConnectorsAssignment_4_2");
			builder.put(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_4_3_1(), "rule__System__AssemblyConnectorsAssignment_4_3_1");
			builder.put(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsAssignment_5_2(), "rule__System__RequiredDelegationConnectorsAssignment_5_2");
			builder.put(grammarAccess.getSystemAccess().getRequiredDelegationConnectorsAssignment_5_3_1(), "rule__System__RequiredDelegationConnectorsAssignment_5_3_1");
			builder.put(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsAssignment_6_2(), "rule__System__ProvidedDelegationConnectorsAssignment_6_2");
			builder.put(grammarAccess.getSystemAccess().getProvidedDelegationConnectorsAssignment_6_3_1(), "rule__System__ProvidedDelegationConnectorsAssignment_6_3_1");
			builder.put(grammarAccess.getSystemAccess().getAllocationAssignment_9(), "rule__System__AllocationAssignment_9");
			builder.put(grammarAccess.getAllocationAccess().getEnvironmentAssignment_1(), "rule__Allocation__EnvironmentAssignment_1");
			builder.put(grammarAccess.getAllocationAccess().getAllocationContextsAssignment_2_2(), "rule__Allocation__AllocationContextsAssignment_2_2");
			builder.put(grammarAccess.getAllocationAccess().getAllocationContextsAssignment_2_3_1(), "rule__Allocation__AllocationContextsAssignment_2_3_1");
			builder.put(grammarAccess.getAllocationContextAccess().getContainerAssignment_2(), "rule__AllocationContext__ContainerAssignment_2");
			builder.put(grammarAccess.getAllocationContextAccess().getAllocatesAssignment_4(), "rule__AllocationContext__AllocatesAssignment_4");
			builder.put(grammarAccess.getEnvironmentAccess().getNameAssignment_2(), "rule__Environment__NameAssignment_2");
			builder.put(grammarAccess.getEnvironmentAccess().getContainerAssignment_4_2(), "rule__Environment__ContainerAssignment_4_2");
			builder.put(grammarAccess.getEnvironmentAccess().getContainerAssignment_4_3_1(), "rule__Environment__ContainerAssignment_4_3_1");
			builder.put(grammarAccess.getEnvironmentAccess().getLinkerAssignment_5_2(), "rule__Environment__LinkerAssignment_5_2");
			builder.put(grammarAccess.getEnvironmentAccess().getLinkerAssignment_5_3_1(), "rule__Environment__LinkerAssignment_5_3_1");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_1(), "rule__Container__NameAssignment_1");
			builder.put(grammarAccess.getLinkerAccess().getLinksAssignment_0(), "rule__Linker__LinksAssignment_0");
			builder.put(grammarAccess.getLinkerAccess().getLinksAssignment_1_1(), "rule__Linker__LinksAssignment_1_1");
			builder.put(grammarAccess.getAssemblyAccess().getNameAssignment_2(), "rule__Assembly__NameAssignment_2");
			builder.put(grammarAccess.getAssemblyAccess().getCompositeComponentsAssignment_4_0(), "rule__Assembly__CompositeComponentsAssignment_4_0");
			builder.put(grammarAccess.getAssemblyAccess().getCompositeComponentsAssignment_4_1_1(), "rule__Assembly__CompositeComponentsAssignment_4_1_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getNameAssignment_2(), "rule__CompositeComponent__NameAssignment_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getRequiresAssignment_4_2(), "rule__CompositeComponent__RequiresAssignment_4_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getRequiresAssignment_4_3_1(), "rule__CompositeComponent__RequiresAssignment_4_3_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getProvidesAssignment_5_2(), "rule__CompositeComponent__ProvidesAssignment_5_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getProvidesAssignment_5_3_1(), "rule__CompositeComponent__ProvidesAssignment_5_3_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getChildContextsAssignment_6_2(), "rule__CompositeComponent__ChildContextsAssignment_6_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getChildContextsAssignment_6_3_1(), "rule__CompositeComponent__ChildContextsAssignment_6_3_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsAssignment_7_2(), "rule__CompositeComponent__AssemblyConnectorsAssignment_7_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsAssignment_7_3_1(), "rule__CompositeComponent__AssemblyConnectorsAssignment_7_3_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getRequiredDelegationConnectorsAssignment_8_2(), "rule__CompositeComponent__RequiredDelegationConnectorsAssignment_8_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getRequiredDelegationConnectorsAssignment_8_3_1(), "rule__CompositeComponent__RequiredDelegationConnectorsAssignment_8_3_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getProvidedDelegationConnectorsAssignment_9_2(), "rule__CompositeComponent__ProvidedDelegationConnectorsAssignment_9_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getProvidedDelegationConnectorsAssignment_9_3_1(), "rule__CompositeComponent__ProvidedDelegationConnectorsAssignment_9_3_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getNameAssignment_0(), "rule__AssemblyContext__NameAssignment_0");
			builder.put(grammarAccess.getAssemblyContextAccess().getInstantiatesAssignment_3(), "rule__AssemblyContext__InstantiatesAssignment_3");
			builder.put(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_4_2(), "rule__AssemblyContext__ProvidedRolesAssignment_4_2");
			builder.put(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_4_3_1(), "rule__AssemblyContext__ProvidedRolesAssignment_4_3_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_5_2(), "rule__AssemblyContext__RequiredRolesAssignment_5_2");
			builder.put(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_5_3_1(), "rule__AssemblyContext__RequiredRolesAssignment_5_3_1");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleAssignment_1(), "rule__AssemblyConnector__RequiringRoleAssignment_1");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleAssignment_3(), "rule__AssemblyConnector__ProvidingRoleAssignment_3");
			builder.put(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleAssignment(), "rule__RequiredDelegationConnector__RequiringRoleAssignment");
			builder.put(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleAssignment(), "rule__ProvidedDelegationConnector__ProvidingRoleAssignment");
			builder.put(grammarAccess.getProvidedRoleAccess().getNameAssignment_0(), "rule__ProvidedRole__NameAssignment_0");
			builder.put(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_1(), "rule__ProvidedRole__InterfaceAssignment_1");
			builder.put(grammarAccess.getRequiredRoleAccess().getNameAssignment_0(), "rule__RequiredRole__NameAssignment_0");
			builder.put(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_1(), "rule__RequiredRole__InterfaceAssignment_1");
			builder.put(grammarAccess.getRepositoryAccess().getInterfacesAssignment_3_2(), "rule__Repository__InterfacesAssignment_3_2");
			builder.put(grammarAccess.getRepositoryAccess().getInterfacesAssignment_3_3_1(), "rule__Repository__InterfacesAssignment_3_3_1");
			builder.put(grammarAccess.getRepositoryAccess().getComponentsAssignment_4_2(), "rule__Repository__ComponentsAssignment_4_2");
			builder.put(grammarAccess.getRepositoryAccess().getComponentsAssignment_4_3_1(), "rule__Repository__ComponentsAssignment_4_3_1");
			builder.put(grammarAccess.getRepositoryAccess().getTypesAssignment_5_2(), "rule__Repository__TypesAssignment_5_2");
			builder.put(grammarAccess.getRepositoryAccess().getTypesAssignment_5_3_1(), "rule__Repository__TypesAssignment_5_3_1");
			builder.put(grammarAccess.getInterfaceAccess().getNameAssignment_2(), "rule__Interface__NameAssignment_2");
			builder.put(grammarAccess.getInterfaceAccess().getSignaturesAssignment_4_0(), "rule__Interface__SignaturesAssignment_4_0");
			builder.put(grammarAccess.getInterfaceAccess().getSignaturesAssignment_4_1_1(), "rule__Interface__SignaturesAssignment_4_1_1");
			builder.put(grammarAccess.getAtomicComponentAccess().getNameAssignment_2(), "rule__AtomicComponent__NameAssignment_2");
			builder.put(grammarAccess.getAtomicComponentAccess().getProvidesAssignment_4_2(), "rule__AtomicComponent__ProvidesAssignment_4_2");
			builder.put(grammarAccess.getAtomicComponentAccess().getProvidesAssignment_4_3_1(), "rule__AtomicComponent__ProvidesAssignment_4_3_1");
			builder.put(grammarAccess.getAtomicComponentAccess().getRequiresAssignment_5_2(), "rule__AtomicComponent__RequiresAssignment_5_2");
			builder.put(grammarAccess.getAtomicComponentAccess().getRequiresAssignment_5_3_1(), "rule__AtomicComponent__RequiresAssignment_5_3_1");
			builder.put(grammarAccess.getAtomicComponentAccess().getServicesAssignment_6_2(), "rule__AtomicComponent__ServicesAssignment_6_2");
			builder.put(grammarAccess.getAtomicComponentAccess().getServicesAssignment_6_3_1(), "rule__AtomicComponent__ServicesAssignment_6_3_1");
			builder.put(grammarAccess.getSignatureAccess().getReturnTypeAssignment_0(), "rule__Signature__ReturnTypeAssignment_0");
			builder.put(grammarAccess.getSignatureAccess().getNameAssignment_1(), "rule__Signature__NameAssignment_1");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_3_0(), "rule__Signature__ParametersAssignment_3_0");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_3_1_1(), "rule__Signature__ParametersAssignment_3_1_1");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_0(), "rule__Parameter__TypeAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getSimpleTypeAccess().getNameAssignment_1(), "rule__SimpleType__NameAssignment_1");
			builder.put(grammarAccess.getSimpleTypeAccess().getTypeAssignment_2(), "rule__SimpleType__TypeAssignment_2");
			builder.put(grammarAccess.getComplexTypeAccess().getNameAssignment_2(), "rule__ComplexType__NameAssignment_2");
			builder.put(grammarAccess.getComplexTypeAccess().getMembersAssignment_4_0(), "rule__ComplexType__MembersAssignment_4_0");
			builder.put(grammarAccess.getComplexTypeAccess().getMembersAssignment_4_1_1(), "rule__ComplexType__MembersAssignment_4_1_1");
			builder.put(grammarAccess.getComplexMemberAccess().getNameAssignment_0(), "rule__ComplexMember__NameAssignment_0");
			builder.put(grammarAccess.getComplexMemberAccess().getTypeAssignment_2(), "rule__ComplexMember__TypeAssignment_2");
			builder.put(grammarAccess.getVoidAccess().getNameAssignment_1(), "rule__Void__NameAssignment_1");
			builder.put(grammarAccess.getCollectionTypeAccess().getTypeAssignment_0(), "rule__CollectionType__TypeAssignment_0");
			builder.put(grammarAccess.getCollectionTypeAccess().getInnerTypeAssignment_2(), "rule__CollectionType__InnerTypeAssignment_2");
			builder.put(grammarAccess.getCollectionTypeAccess().getNameAssignment_4(), "rule__CollectionType__NameAssignment_4");
			builder.put(grammarAccess.getServiceAccess().getImplementsAssignment_1(), "rule__Service__ImplementsAssignment_1");
			builder.put(grammarAccess.getServiceAccess().getActionsAssignment_3(), "rule__Service__ActionsAssignment_3");
			builder.put(grammarAccess.getServiceAccess().getActionsAssignment_4_1(), "rule__Service__ActionsAssignment_4_1");
			builder.put(grammarAccess.getExternalCallActionAccess().getRequiredServiceAssignment_1(), "rule__ExternalCallAction__RequiredServiceAssignment_1");
			builder.put(grammarAccess.getBranchActionAccess().getBranchesAssignment_2(), "rule__BranchAction__BranchesAssignment_2");
			builder.put(grammarAccess.getBranchActionAccess().getBranchesAssignment_3_1(), "rule__BranchAction__BranchesAssignment_3_1");
			builder.put(grammarAccess.getBranchTransitionAccess().getBranchConditionAssignment_0(), "rule__BranchTransition__BranchConditionAssignment_0");
			builder.put(grammarAccess.getBranchTransitionAccess().getActionsAssignment_3(), "rule__BranchTransition__ActionsAssignment_3");
			builder.put(grammarAccess.getBranchTransitionAccess().getActionsAssignment_4_1(), "rule__BranchTransition__ActionsAssignment_4_1");
			builder.put(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_3(), "rule__LoopAction__BodyActionsAssignment_3");
			builder.put(grammarAccess.getLoopActionAccess().getBodyActionsAssignment_4_1(), "rule__LoopAction__BodyActionsAssignment_4_1");
			builder.put(grammarAccess.getComponentBasedSystemContainerAccess().getUnorderedGroup(), "rule__ComponentBasedSystemContainer__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CBSGrammarAccess grammarAccess;

	@Override
	protected InternalCBSParser createParser() {
		InternalCBSParser result = new InternalCBSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CBSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CBSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
