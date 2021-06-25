BOOK: Design Patterns - Elements of Reusable Object-Oriented Software

Types of Design Patterns:
1) creational patterns
create objects while hiding creation logic, rather than instantiating objects directly using new operator.
factory; abstract factory; singleton; builder; prototype
2) structural patterns
compose interfaces and define ways to compose objects to obtain new functionalities
adapter; bridge; filter, criteria; composite; decorator; facade; flyweight; proxy
3) behavioral patterns
communication between objects
chain of responsibility; command; interpreter; iterator; mediator; memento; observer; state; Null object; strategy; template; visitor
4) J2EE pattern
MVC; business delegate; composite entity; DAO; front controller; intercepting filter; service locator; transfer object
1. Factory Pattern
create object without exposing the creation logic to the client and refer to newly created object <u>using a common interface</u>.

![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/FactoryPattern.png?raw=true)

2. Abstract Factory Pattern

![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/AbstractFactoryPattern.png?raw=true)

3. Singleton Pattern

![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/SingletonPattern.png?raw=true)

4. Builder Pattern
builds a complex object <u>using simple objects and using a step by step approach</u>.

![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/BuilderPattern.png?raw=true)

5. Prototype Pattern  careful about deep  vs shallow copy

![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/PrototypePattern.png?raw=true)

6. Adapter Pattern // combine 2 imcompatible implement (children use children)

![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/AdapterPattern.png?raw=true)

7. Bridge Patter // seperate 2 too large compatible components (abstract use interface)
![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/BridgePattern1.png?raw=true)

![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/BridgePattern2.png?raw=true)

8. Filter Pattern
![Image of Facade pattern](https://github.com/KevinXu17/DesignPattern/blob/master/Img/FilterPattern.png?raw=true)