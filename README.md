# Component-Based-Systems

## Dokumentation Aufgaben
### Aufgabe 1
- Metamodell: [a relative link](Component-Based-Systems\model)
- Instanz: [a relative link](Component-Based-Systems-Instance\MediaFiles.componentbasedsystem)
- Dokumentation zu Modelländerungen: [Link to Header](#metamodel-changes)
- Dokumentation zu Constraints: [Link to Header](#metamodel-constraints)

### Aufgabe 2
- Projekt: [a relative link](Component-Based-Systems-DSL)
- DSL: [a relative link](Component-Based-Systems-DSL\org.xtext.example.cbs\src\org\xtext\example\mydsl\CBS.xtext)
- Code for automated save: [a relative link](Component-Based-Systems-DSL\org.xtext.example.cbs\src\org\xtext\example\mydsl\generator\GBSToXMIGenerator.xtend)
- MediaFiles as DSL:  [a relative link](Component-Based-System-DSL-Instance\MediaFiles.cbs)
- MediaFiles as XMI (generated from DSL): [a relative link](Component-Based-System-DSL-Instance\MediaFiles.cbs)

### Aufgabe 3
- Transformation: [a relative link](Component-Based-Systems-QVT-Palladio\transforms\CbsTranformation.qvto)
- MediaFiles.pcm (transformiert): [a relative link](Component-Based-Systems-QVT-Palladio\transforms\MediaFiles.pcm)

### Aufgabe 4
- Generator: [a relative link](Component-Based-Systems-DSL\org.xtext.example.cbs\src\org\xtext\example\mydsl\generator\CBSToJavaGenerator.xtend)
- MediaFiles as JAVA (generated from DSL): [a relative link](Component-Based-System-DSL-Instance\src-gen\repository)

### Aufgabe 5
- Projekt: [a relative link](Component-Based-Systems-SiriusEditor)
- Description: [a relative link](\Component-Based-Systems-SiriusEditor\description\Component-Based-Systems-SiriusEditor.odesign)
- Services: [a relative link](Component-Based-Systems-SiriusEditor\src\componentBasedSystems\services.java)
- Demo Project: [a relative link](Component-Based-Systems-Sirius-Instance)
  - Diagramm "ComponentsAndInterfaces" which is a child of MediaFiles.componentbasedsystem/ComponentBasedSystemContainer

## Metamodel constraints
| Package | Type | Name | Description | Status
| --- | --- | --- | --- | --- |
| repository | AtomicComponent | providedInterfacesAreImplemented | If a component provides an interface it provides services corresponding to the signatures of the provided interface.| done |
| repository | AtomicComponent | signaturesUsedByExternalCallsAreRequired | If a service requires an interface, the component should require this interfacee. | done |
|  |  |  |  |  |
|assembly|AssemblyConnector|interfacesConsistent|ensure requiringRole = providingRole|done|
|assembly|AssemblyContext|providedInterfaceLeadsToProvidedRole| If an instantiated component provides an interface, this should lead to a corresponding ProvidedRole | done |
|assembly|AssemblyContext|requiredInterfaceLeadsToRequiredRole| If an instantiated component requires an interface, this should lead to a corresponding RequiredRole | done |
|assembly|ComposedStructure|allRequiredRolesConnected|ensure that each required role (of assemblyContexts) is connected with assembly connector or required delegation connector| done |
|assembly|ComposedStructure|allProvidedRolesConnected|ensure that each provided role (of assemblyContexts) is connected with assembly connector or provided delegation connector| done |
|assembly|CompositeComponent|requiredDelegationConnectorsConsistentToRequiredInterfaces| A required delegation connector should lead to a corresponding required interface of the connected component | done |
|assembly|CompositeComponent|providedDelegationConnectorsConsistentToProvidedInterfaces| A provided delegation connector should lead to a corresponding provided interface of the connected component | done |
|  |  |  |  |  |
|allocation | System | atLeastOnInterfaceProvided | ensure that a system provides at least one interface | done |
|allocation | System | assemblyContextsIsExactlyOnceAllocated| ensure that each assembly context ist allocated exactly at one container | done |
|allocation | System | onlyTopLevelContextsAllocated| Ensure that assembly contexts that are not a direct part of a system but reside within a composite component cannot be allocated on containers| done |
|allocation | System | connectedContextsAreOnSameContainerOrLinked| If the roles of two assembly contexts are connected by an assembly connector they either have to be allocated on the same container or the containers on which they are allocated have to be linked.| done |

## Metamodel Changes

| Commit | Previous Design | New Desing | Reason
| -- | -- | -- | -- |
| 3c9d5df | six packages which are types, repository, behaviroulDescription, assembly, enviroment and allocation | four packages with subpackages which are (repository, assembly, enviroment, allocation) | Because we have four view types. each package is considerd as view type |
| ca369cd | change CompositeComponent location  | move CompositeComponent into assembly package | separate elements of different view types |
| abd5b51 | Component concept with modeled only as Component class | Create AtomicComponent class and set it as derived class to Component class | To be enable modeling atomic component and composite component. |
| 35c4d84 | Repository has containment to Component class | Change containment to AtomicComponent class | Repositery should contain only atomicComponent |
| cd1d72a | System class was only for introducing the name of the hole system | System class is considerd as composite component to include assembly contexts | To make system providing at least one interface. |
| 35c4d84 | Simple,Collection,Complex was derived class from type as void class | Set Type as abstract class, Create ParamaterType class and set it and void as derived class to Type class | To ensure that the parameter of signature cannot have void as type |
| 35c4d84 | parameter type class has only complexType and simpleType as child classes | create collectionType class as child class & move map,list from simplyType to collectionType | map, list should modeled as collectionType not as SimplyType  |
| cd1d72a | AllocationContext has Enviroment reference | move enviroment reference to Allocation | AllocationContexts of one allocation should refere to same enviroment |
| c4fe087 | System and CompositeComponent have no shared base class | Abstract class ComposedStructure as base class for System and Composite Component | System and CompositeComponent are both composed structures and share many references and invariants |
| 1bfe12b | there was no any root element | create ComponentBasedSystem to create 4 view types | To be able to create dsl instance |
| facce77|  Space class in env | delete space class from env | Space was root for env view type which we don't need it any more because we have another root element |






