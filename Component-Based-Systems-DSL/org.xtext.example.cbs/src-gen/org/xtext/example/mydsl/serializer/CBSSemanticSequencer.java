/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import componentbasedsystem.ComponentBasedSystemContainer;
import componentbasedsystem.ComponentbasedsystemPackage;
import componentbasedsystem.allocation.Allocation;
import componentbasedsystem.allocation.AllocationContext;
import componentbasedsystem.allocation.AllocationPackage;
import componentbasedsystem.assembly.Assembly;
import componentbasedsystem.assembly.AssemblyConnector;
import componentbasedsystem.assembly.AssemblyContext;
import componentbasedsystem.assembly.AssemblyPackage;
import componentbasedsystem.assembly.CompositeComponent;
import componentbasedsystem.assembly.ProvidedDelegationConnector;
import componentbasedsystem.assembly.ProvidedRole;
import componentbasedsystem.assembly.RequiredDelegationConnector;
import componentbasedsystem.assembly.RequiredRole;
import componentbasedsystem.environment.Container;
import componentbasedsystem.environment.Environment;
import componentbasedsystem.environment.EnvironmentPackage;
import componentbasedsystem.environment.Linker;
import componentbasedsystem.repository.AtomicComponent;
import componentbasedsystem.repository.Interface;
import componentbasedsystem.repository.Repository;
import componentbasedsystem.repository.RepositoryPackage;
import componentbasedsystem.repository.Signature;
import componentbasedsystem.repository.behavioraldescription.BehavioraldescriptionPackage;
import componentbasedsystem.repository.behavioraldescription.BranchAction;
import componentbasedsystem.repository.behavioraldescription.BranchTransition;
import componentbasedsystem.repository.behavioraldescription.ExternalCallAction;
import componentbasedsystem.repository.behavioraldescription.InternalAction;
import componentbasedsystem.repository.behavioraldescription.LoopAction;
import componentbasedsystem.repository.behavioraldescription.Service;
import componentbasedsystem.repository.types.CollectionType;
import componentbasedsystem.repository.types.ComplexMember;
import componentbasedsystem.repository.types.ComplexType;
import componentbasedsystem.repository.types.SimpleType;
import componentbasedsystem.repository.types.TypesPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.CBSGrammarAccess;

@SuppressWarnings("all")
public class CBSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CBSGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AllocationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AllocationPackage.ALLOCATION:
				sequence_Allocation(context, (Allocation) semanticObject); 
				return; 
			case AllocationPackage.ALLOCATION_CONTEXT:
				sequence_AllocationContext(context, (AllocationContext) semanticObject); 
				return; 
			case AllocationPackage.SYSTEM:
				sequence_System(context, (componentbasedsystem.allocation.System) semanticObject); 
				return; 
			}
		else if (epackage == AssemblyPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AssemblyPackage.ASSEMBLY:
				sequence_Assembly(context, (Assembly) semanticObject); 
				return; 
			case AssemblyPackage.ASSEMBLY_CONNECTOR:
				sequence_AssemblyConnector(context, (AssemblyConnector) semanticObject); 
				return; 
			case AssemblyPackage.ASSEMBLY_CONTEXT:
				sequence_AssemblyContext(context, (AssemblyContext) semanticObject); 
				return; 
			case AssemblyPackage.COMPOSITE_COMPONENT:
				sequence_CompositeComponent(context, (CompositeComponent) semanticObject); 
				return; 
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR:
				sequence_ProvidedDelegationConnector(context, (ProvidedDelegationConnector) semanticObject); 
				return; 
			case AssemblyPackage.PROVIDED_ROLE:
				sequence_ProvidedRole(context, (ProvidedRole) semanticObject); 
				return; 
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR:
				sequence_RequiredDelegationConnector(context, (RequiredDelegationConnector) semanticObject); 
				return; 
			case AssemblyPackage.REQUIRED_ROLE:
				sequence_RequiredRole(context, (RequiredRole) semanticObject); 
				return; 
			}
		else if (epackage == BehavioraldescriptionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BehavioraldescriptionPackage.BRANCH_ACTION:
				sequence_BranchAction(context, (BranchAction) semanticObject); 
				return; 
			case BehavioraldescriptionPackage.BRANCH_TRANSITION:
				sequence_BranchTransition(context, (BranchTransition) semanticObject); 
				return; 
			case BehavioraldescriptionPackage.EXTERNAL_CALL_ACTION:
				sequence_ExternalCallAction(context, (ExternalCallAction) semanticObject); 
				return; 
			case BehavioraldescriptionPackage.INTERNAL_ACTION:
				sequence_InternalAction(context, (InternalAction) semanticObject); 
				return; 
			case BehavioraldescriptionPackage.LOOP_ACTION:
				sequence_LoopAction(context, (LoopAction) semanticObject); 
				return; 
			case BehavioraldescriptionPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			}
		else if (epackage == ComponentbasedsystemPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentbasedsystemPackage.COMPONENT_BASED_SYSTEM_CONTAINER:
				sequence_ComponentBasedSystemContainer(context, (ComponentBasedSystemContainer) semanticObject); 
				return; 
			}
		else if (epackage == EnvironmentPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EnvironmentPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case EnvironmentPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case EnvironmentPackage.LINKER:
				sequence_Linker(context, (Linker) semanticObject); 
				return; 
			}
		else if (epackage == RepositoryPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RepositoryPackage.ATOMIC_COMPONENT:
				sequence_AtomicComponent(context, (AtomicComponent) semanticObject); 
				return; 
			case RepositoryPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case RepositoryPackage.PARAMETER:
				sequence_Parameter(context, (componentbasedsystem.repository.Parameter) semanticObject); 
				return; 
			case RepositoryPackage.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case RepositoryPackage.SIGNATURE:
				sequence_Signature(context, (Signature) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.COLLECTION_TYPE:
				sequence_CollectionType(context, (CollectionType) semanticObject); 
				return; 
			case TypesPackage.COMPLEX_MEMBER:
				sequence_ComplexMember(context, (ComplexMember) semanticObject); 
				return; 
			case TypesPackage.COMPLEX_TYPE:
				sequence_ComplexType(context, (ComplexType) semanticObject); 
				return; 
			case TypesPackage.SIMPLE_TYPE:
				sequence_SimpleType(context, (SimpleType) semanticObject); 
				return; 
			case TypesPackage.VOID:
				sequence_Void(context, (componentbasedsystem.repository.types.Void) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AllocationContext returns AllocationContext
	 *
	 * Constraint:
	 *     (container=[Container|EString] allocates=[AssemblyContext|EString])
	 * </pre>
	 */
	protected void sequence_AllocationContext(ISerializationContext context, AllocationContext semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AllocationPackage.Literals.ALLOCATION_CONTEXT__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AllocationPackage.Literals.ALLOCATION_CONTEXT__CONTAINER));
			if (transientValues.isValueTransient(semanticObject, AllocationPackage.Literals.ALLOCATION_CONTEXT__ALLOCATES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AllocationPackage.Literals.ALLOCATION_CONTEXT__ALLOCATES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_2_0_1(), semanticObject.eGet(AllocationPackage.Literals.ALLOCATION_CONTEXT__CONTAINER, false));
		feeder.accept(grammarAccess.getAllocationContextAccess().getAllocatesAssemblyContextEStringParserRuleCall_4_0_1(), semanticObject.eGet(AllocationPackage.Literals.ALLOCATION_CONTEXT__ALLOCATES, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Allocation returns Allocation
	 *
	 * Constraint:
	 *     (environment=[Environment|EString] (allocationContexts+=AllocationContext allocationContexts+=AllocationContext*)?)
	 * </pre>
	 */
	protected void sequence_Allocation(ISerializationContext context, Allocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AssemblyConnector returns AssemblyConnector
	 *
	 * Constraint:
	 *     (requiringRole=[RequiredRole|EString] providingRole=[ProvidedRole|EString])
	 * </pre>
	 */
	protected void sequence_AssemblyConnector(ISerializationContext context, AssemblyConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRING_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRING_ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDING_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDING_ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getRequiringRoleRequiredRoleEStringParserRuleCall_1_0_1(), semanticObject.eGet(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRING_ROLE, false));
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getProvidingRoleProvidedRoleEStringParserRuleCall_3_0_1(), semanticObject.eGet(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDING_ROLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AssemblyContext returns AssemblyContext
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instantiates=[Component|EString] 
	 *         (providedRoles+=ProvidedRole providedRoles+=ProvidedRole*)? 
	 *         (requiredRoles+=RequiredRole requiredRoles+=RequiredRole*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_AssemblyContext(ISerializationContext context, AssemblyContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Assembly returns Assembly
	 *
	 * Constraint:
	 *     (name=EString (compositeComponents+=CompositeComponent compositeComponents+=CompositeComponent*)?)
	 * </pre>
	 */
	protected void sequence_Assembly(ISerializationContext context, Assembly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Component returns AtomicComponent
	 *     AtomicComponent returns AtomicComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (provides+=[Interface|EString] provides+=[Interface|EString]*)? 
	 *         (requires+=[Interface|EString] requires+=[Interface|EString]*)? 
	 *         (services+=Service services+=Service*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_AtomicComponent(ISerializationContext context, AtomicComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractAction returns BranchAction
	 *     BranchAction returns BranchAction
	 *
	 * Constraint:
	 *     (branches+=BranchTransition branches+=BranchTransition*)
	 * </pre>
	 */
	protected void sequence_BranchAction(ISerializationContext context, BranchAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BranchTransition returns BranchTransition
	 *
	 * Constraint:
	 *     (branchCondition=EString actions+=AbstractAction actions+=AbstractAction*)
	 * </pre>
	 */
	protected void sequence_BranchTransition(ISerializationContext context, BranchTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns CollectionType
	 *     ParameterType returns CollectionType
	 *     CollectionType returns CollectionType
	 *
	 * Constraint:
	 *     (type=CollectionTypeEnum innerType=[ParameterType|EString] name=EString)
	 * </pre>
	 */
	protected void sequence_CollectionType(ISerializationContext context, CollectionType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TypesPackage.Literals.COLLECTION_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.COLLECTION_TYPE__TYPE));
			if (transientValues.isValueTransient(semanticObject, TypesPackage.Literals.COLLECTION_TYPE__INNER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.COLLECTION_TYPE__INNER_TYPE));
			if (transientValues.isValueTransient(semanticObject, TypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCollectionTypeAccess().getTypeCollectionTypeEnumEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCollectionTypeAccess().getInnerTypeParameterTypeEStringParserRuleCall_2_0_1(), semanticObject.eGet(TypesPackage.Literals.COLLECTION_TYPE__INNER_TYPE, false));
		feeder.accept(grammarAccess.getCollectionTypeAccess().getNameEStringParserRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ComplexMember returns ComplexMember
	 *
	 * Constraint:
	 *     (name=EString type=[ParameterType|EString])
	 * </pre>
	 */
	protected void sequence_ComplexMember(ISerializationContext context, ComplexMember semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TypesPackage.Literals.COMPLEX_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.COMPLEX_MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, TypesPackage.Literals.COMPLEX_MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.COMPLEX_MEMBER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComplexMemberAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComplexMemberAccess().getTypeParameterTypeEStringParserRuleCall_2_0_1(), semanticObject.eGet(TypesPackage.Literals.COMPLEX_MEMBER__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns ComplexType
	 *     ParameterType returns ComplexType
	 *     ComplexType returns ComplexType
	 *
	 * Constraint:
	 *     (name=EString (members+=ComplexMember members+=ComplexMember*)?)
	 * </pre>
	 */
	protected void sequence_ComplexType(ISerializationContext context, ComplexType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ComponentBasedSystemContainer returns ComponentBasedSystemContainer
	 *
	 * Constraint:
	 *     (repository=Repository | assembly=Assembly | environment=Environment | system=System)+
	 * </pre>
	 */
	protected void sequence_ComponentBasedSystemContainer(ISerializationContext context, ComponentBasedSystemContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Component returns CompositeComponent
	 *     CompositeComponent returns CompositeComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (requires+=[Interface|EString] requires+=[Interface|EString]*)? 
	 *         (provides+=[Interface|EString] provides+=[Interface|EString]*)? 
	 *         (childContexts+=AssemblyContext childContexts+=AssemblyContext*)? 
	 *         (assemblyConnectors+=AssemblyConnector assemblyConnectors+=AssemblyConnector*)? 
	 *         (requiredDelegationConnectors+=RequiredDelegationConnector requiredDelegationConnectors+=RequiredDelegationConnector*)? 
	 *         (providedDelegationConnectors+=ProvidedDelegationConnector providedDelegationConnectors+=ProvidedDelegationConnector*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CompositeComponent(ISerializationContext context, CompositeComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     name=EString
	 * </pre>
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EnvironmentPackage.Literals.CONTAINER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EnvironmentPackage.Literals.CONTAINER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (name=EString (container+=Container container+=Container*)? (linker+=Linker linker+=Linker*)?)
	 * </pre>
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractAction returns ExternalCallAction
	 *     ExternalCallAction returns ExternalCallAction
	 *
	 * Constraint:
	 *     requiredService=[Signature|EString]
	 * </pre>
	 */
	protected void sequence_ExternalCallAction(ISerializationContext context, ExternalCallAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BehavioraldescriptionPackage.Literals.EXTERNAL_CALL_ACTION__REQUIRED_SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehavioraldescriptionPackage.Literals.EXTERNAL_CALL_ACTION__REQUIRED_SERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalCallActionAccess().getRequiredServiceSignatureEStringParserRuleCall_1_0_1(), semanticObject.eGet(BehavioraldescriptionPackage.Literals.EXTERNAL_CALL_ACTION__REQUIRED_SERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (name=EString (signatures+=Signature signatures+=Signature*)?)
	 * </pre>
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractAction returns InternalAction
	 *     InternalAction returns InternalAction
	 *
	 * Constraint:
	 *     {InternalAction}
	 * </pre>
	 */
	protected void sequence_InternalAction(ISerializationContext context, InternalAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Linker returns Linker
	 *
	 * Constraint:
	 *     (links+=[Container|EString] links+=[Container|EString]*)
	 * </pre>
	 */
	protected void sequence_Linker(ISerializationContext context, Linker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractAction returns LoopAction
	 *     LoopAction returns LoopAction
	 *
	 * Constraint:
	 *     (bodyActions+=AbstractAction bodyActions+=AbstractAction*)
	 * </pre>
	 */
	protected void sequence_LoopAction(ISerializationContext context, LoopAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (type=[ParameterType|EString] name=EString)
	 * </pre>
	 */
	protected void sequence_Parameter(ISerializationContext context, componentbasedsystem.repository.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RepositoryPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RepositoryPackage.Literals.PARAMETER__TYPE));
			if (transientValues.isValueTransient(semanticObject, RepositoryPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RepositoryPackage.Literals.PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getTypeParameterTypeEStringParserRuleCall_0_0_1(), semanticObject.eGet(RepositoryPackage.Literals.PARAMETER__TYPE, false));
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProvidedDelegationConnector returns ProvidedDelegationConnector
	 *
	 * Constraint:
	 *     providingRole=[ProvidedRole|EString]
	 * </pre>
	 */
	protected void sequence_ProvidedDelegationConnector(ISerializationContext context, ProvidedDelegationConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR__PROVIDING_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR__PROVIDING_ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedDelegationConnectorAccess().getProvidingRoleProvidedRoleEStringParserRuleCall_0_1(), semanticObject.eGet(AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR__PROVIDING_ROLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProvidedRole returns ProvidedRole
	 *
	 * Constraint:
	 *     (name=EString interface=[Interface|EString])
	 * </pre>
	 */
	protected void sequence_ProvidedRole(ISerializationContext context, ProvidedRole semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.PROVIDED_ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.PROVIDED_ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.PROVIDED_ROLE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.PROVIDED_ROLE__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceEStringParserRuleCall_1_0_1(), semanticObject.eGet(AssemblyPackage.Literals.PROVIDED_ROLE__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Repository returns Repository
	 *
	 * Constraint:
	 *     ((interfaces+=Interface interfaces+=Interface*)? (components+=AtomicComponent components+=AtomicComponent*)? (types+=Type types+=Type*)?)
	 * </pre>
	 */
	protected void sequence_Repository(ISerializationContext context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RequiredDelegationConnector returns RequiredDelegationConnector
	 *
	 * Constraint:
	 *     requiringRole=[RequiredRole|EString]
	 * </pre>
	 */
	protected void sequence_RequiredDelegationConnector(ISerializationContext context, RequiredDelegationConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR__REQUIRING_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR__REQUIRING_ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredDelegationConnectorAccess().getRequiringRoleRequiredRoleEStringParserRuleCall_0_1(), semanticObject.eGet(AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR__REQUIRING_ROLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RequiredRole returns RequiredRole
	 *
	 * Constraint:
	 *     (name=EString interface=[Interface|EString])
	 * </pre>
	 */
	protected void sequence_RequiredRole(ISerializationContext context, RequiredRole semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.REQUIRED_ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.REQUIRED_ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyPackage.Literals.REQUIRED_ROLE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyPackage.Literals.REQUIRED_ROLE__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceEStringParserRuleCall_1_0_1(), semanticObject.eGet(AssemblyPackage.Literals.REQUIRED_ROLE__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (implements=[Signature|EString] actions+=AbstractAction actions+=AbstractAction*)
	 * </pre>
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Signature returns Signature
	 *
	 * Constraint:
	 *     (returnType=[Type|EString] name=EString (parameters+=Parameter parameters+=Parameter*)?)
	 * </pre>
	 */
	protected void sequence_Signature(ISerializationContext context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns SimpleType
	 *     ParameterType returns SimpleType
	 *     SimpleType returns SimpleType
	 *
	 * Constraint:
	 *     (name=EString type=SimpleTypeEnum)
	 * </pre>
	 */
	protected void sequence_SimpleType(ISerializationContext context, SimpleType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, TypesPackage.Literals.SIMPLE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.SIMPLE_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     System returns System
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (childContexts+=AssemblyContext childContexts+=AssemblyContext*)? 
	 *         (assemblyConnectors+=AssemblyConnector assemblyConnectors+=AssemblyConnector*)? 
	 *         (requiredDelegationConnectors+=RequiredDelegationConnector requiredDelegationConnectors+=RequiredDelegationConnector*)? 
	 *         (providedDelegationConnectors+=ProvidedDelegationConnector providedDelegationConnectors+=ProvidedDelegationConnector*)? 
	 *         allocation=Allocation
	 *     )
	 * </pre>
	 */
	protected void sequence_System(ISerializationContext context, componentbasedsystem.allocation.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns Void
	 *     Void returns Void
	 *
	 * Constraint:
	 *     name=EString
	 * </pre>
	 */
	protected void sequence_Void(ISerializationContext context, componentbasedsystem.repository.types.Void semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TypesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
