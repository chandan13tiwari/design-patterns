TEMPLATE METHOD PATTERN

Also known as Encapsulating Algorithm

Let's take an example of Starbuzz Coffee

![Requirement](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/template-method-pattern-diagrams/1.jpg)

Now, extracting the common algorithm - 

![Requirement](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/template-method-pattern-diagrams/2.jpg)

The Template Method Pattern defines the skeleton of an algorithm in a method, differing some steps to subclasses.

Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.


HOOKS - 

It is like the default methods in interface

A Hook is a method that is declared in the abstract class, but only given an empty or default implementation.

HOLLYWOOD DESIGN PRINCIPLE - Don't call us, we'll call you

Template Method pattern uses the Hollywood principle. When we design with the template method pattern, we're telling subclass, "don't call us, we'll call you".

*_ The Factory Method and Observer Design Patterns also uses this Hollywood Principle. _*


DIFFERENCE BETWEEN STRATEGY & TEMPLATE PATTERN - 

Both patterns encapsulates algorithms, Template Method pattern does it through inheritance whereas Strategy Pattern does it through composition.


In inheritance, the child class is dependent upon parent class. Whereas in composition, both child class and parent class are independent.