# Component-Based-Systems

## Dokumentation Aufgaben

### Setup:
- disable automatic build
- clone and open Palladio-Core-PCM in Workspace
- open all projects with Eclipse (except *-Instance)
- open ComponentBasedSystems.genmodel
  - generate Model Code
  - generate Edit Code
  - generate Editor Code
- run GenerateCBS.mwe2 workflow in project or.xtext.example.cbs
- enable automatic build
- maybe clean/refresh/restart IDE
- maybe add missing folders according to marker

- select run as eclipse application on Component-Based-Systems project
- open *-Instance projects

### Aufgabe 1
- Metamodell: [here](Component-Based-Systems/model)
- Instanz: [here](Component-Based-Systems-Instance/MediaFiles.componentbasedsystem)
- Dokumentation zu Modelländerungen: [here](#metamodel-changes)
- Dokumentation zu Constraints: [here](#metamodel-constraints)

### Aufgabe 2
- Projekt: [here](Component-Based-Systems-DSL)
- DSL: [here](Component-Based-Systems-DSL/org.xtext.example.cbs/src/org/xtext/example/mydsl/CBS.xtext)
- Code for automated save: [here](Component-Based-Systems-DSL/org.xtext.example.cbs/src/org/xtext/example/mydsl/generator/GBSToXMIGenerator.xtend)
- MediaFiles as DSL:  [here](Component-Based-System-DSL-Instance/MediaFiles.cbs)
- MediaFiles as XMI (generated from DSL): [here](Component-Based-System-DSL-Instance/MediaFiles.cbs)

### Aufgabe 3
- Transformation: [here](Component-Based-Systems-QVT-Palladio/transforms/CbsTranformation.qvto)
- MediaFiles.pcm (transformiert): [here](Component-Based-Systems-QVT-Palladio/transforms/MediaFiles.pcm)

### Aufgabe 4
- Generator: [here](Component-Based-Systems-DSL/org.xtext.example.cbs/src/org/xtext/example/mydsl/generator/CBSToJavaGenerator.xtend)
- MediaFiles as JAVA (generated from DSL): [here](Component-Based-System-DSL-Instance/src-gen/repository)

### Aufgabe 5
- Projekt: [here](Component-Based-Systems-SiriusEditor)
- Description: [here](/Component-Based-Systems-SiriusEditor/description/Component-Based-Systems-SiriusEditor.odesign)
- Services: [here](Component-Based-Systems-SiriusEditor/src/componentBasedSystems/services.java)
- Demo Project: [here](Component-Based-Systems-Sirius-Instance)
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






