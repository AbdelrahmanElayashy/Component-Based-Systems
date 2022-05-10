# Component-Based-Systems
Developing a metamodel that can one day be used to design, illustrate and generate code for component-based system architectures


## History of Metamodel Changes


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





