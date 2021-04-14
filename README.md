# pattern

OOAD Principle
  
-Prefer composition over inheritance: More flexible, lower coupling  
  
-Program to interface rather than implementation: Easier to test, Change and replace implementation as needed  

  
S - Single Responsibility Principle  
  
O - Open/Closed Principle  
  
L - Liskov Substitution Principle  
  
I - Interface Segregation Principle  
  
D - Dependency Inversion Principle  

Benefit of SOLID principles  
- Principle dependencies management  
- Solid foundation for OOAD to build complicated design patterns  
- Result in following codes: (Robust, Reusable, Flexible)  
- Solid base for designing and defining design patterns  
   
   
Design Pattern example  
  
* Creational Design Patterns : Deal with how an object need to be created 
  
- Factory Method:   Define an interface for creating an object, but let subclasses decide which class
to instantiate. Factory Method lets a class defer instantiation to subclasses.   

Abstract Creator  
Concrete Creator  
Static Method Creator  
  
- Abstract Factory Method : Provide an interface for creating families of related or dependent objects without specifying their concrete classes.   
  
- Singleton : Ensure a class only has one instance, and provide a global point of access to it.
Lazy Evaluation
Synchronized Method  
Double Checked Locking  
Eager evaluation  
Bill pugh  
  
- Builder : Separate the construction of a complex object from its representation so that the same construction process can create different representations.  
  
- Prototype :  Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.  
  
* Structural Design Paterns : The objective to simplify the structure of different object participant - 
                              enhancing decoupling and isolation of the entire subsystem. More into communication between internal class 
  
- Adapter : Convert the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.   
Object Adapter  
Class Adapter  
  
- Bridge : Decouple an abstraction from its implementation so that the two can vary independently.    
   
- Facade :  Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.  
  
- Decorator : Attach additional responsibilities to an object dynamically keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality.  
  
- Proxy : Provide a surrogate or placeholder for another object to control access to it.  
  
- Composite : Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.  
  
- Flyweight :  Use sharing to support large numbers of similar objects / fine-grained objects efficiently.
  
Behavioral Design Patterns : direct how behaviors can be fine-tune, made clear and robust and 
                             it also specifies how behaviors can be made incremental in nature which allows 
                             new behaviors to be implemented in the same code design whenever new behaviors needed to be added.
                             More into communication with external
   
- Chain of Responsibility : Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.  
  
- Command : Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.  
  
- Interpreter : Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.  
  
- Iterator : Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.  
  
- Mediator : Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it allows their interaction to vary independently.  
  
- Memento : Without violating encapsulation, capture and externalize an object's internal state allowing the object to be restored to this state later.  
  
- Observer : Define a one-to-many dependency between objects where a state change in one object results in all its dependents being notified and updated automatically.  
  
- State : Allow an object to alter its behaviour when its internal state changes. The object will appear to change its class.  
  
- Strategy : Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.  
  
- Template method : Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.  
  
- Visitor : Represent an operation to be performed on the elements of an object structure. Visitor lets a new operation be defined without changing the classes of the elements on which it operates.  
  
