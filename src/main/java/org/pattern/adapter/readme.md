ADAPTER PATTERN

The Adapter pattern converts the interfaceof a class into another interface the clients expect.
Adapter lets classes work together that couldn't otherwise because of incompatible interface.

There are two types of Adapters - 

- Object Adapters - What we have discussed in this video is basically the example of Object Adapters. And in JAVA, only object Adapter is possible.
- Class Adapters - It is also same as Object adapter, but it uses Multiple Inheritance and JAVA does not support Multiple inheritance, but that does not mean that it can't be supported by other languages. It could be used with those languages which supports multiple inheritance.

DIFFERENCE BETWEEN OBJECT & CLASS ADAPTER - 

The only difference between is that with a class adapter we subclass the Target and the Adaptee, while with an object adapter we use COMPOSITION to pass reuqests to Adaptee.

REAL WORLD ADAPTERS in JAVA

- Enumerators
- Iterators

DIFFERENCE BETWEEN DECORATOR & ADAPTER PATTERN - 

The adapter pattern is used to connect two interfaces, whereas the Decorator pattern is used to introduce additional functionality without changing the current code.