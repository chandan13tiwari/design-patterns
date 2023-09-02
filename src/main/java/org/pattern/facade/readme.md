FACADE DESIGN PATTERN


Let's start with a HOME MOVIE THEATER Example - 

![Requirement](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/facade-pattern-diagrams/1.jpg)



The Facade Pattern provides a unified interface to a set of interfaces in a subsystem.
FAcade defines a higher-level interface that makes the subsystem easier to use.

A facade not only simplifies an interface, it decouples a client from a subsystem of components.

Facades and adapters may wrap multiple classes, but a facade's intent is to simplify, while an adapter's is to convert the interface to something different.


![Facade pattern](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/facade-pattern-diagrams/2.jpg)


THE PRINCIPLE OF LEAST KNOWLEDGE

Principle of The Least knowledge: talk only to your immediate friends.

Without Principle - 

````
public float getTemp() {
    return station.getThermometer().getTemprature();
}
````

With the Principle - 
````
public float getTemp() {
    return station.getTemprature(); // we add a method to the station class that makes the request to the thermometer for us.
}
````

DISADVANTAGES OF USING PRINCIPLE OF LEAST KNOWLEDGE - 

Yes, while the principle reduces the dependencies between objects, it will increase the complexity and development time as well as decreased runtime performances.