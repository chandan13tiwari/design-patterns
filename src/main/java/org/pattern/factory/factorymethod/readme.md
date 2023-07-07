INITIAL REQUIREMENT - 

We need to create a Pizza Application, where we can order any kind of Pizza. We just need to order our favourite pizza from the main application.


PROBLEM WITH THIS APPROACH - 

We can't select pizza in Runtime.
No code reuse.
We need to update the PizzaStore everytime whenever we got a new order of different kind of pizza.



FIX - 

We can pass the type of pizza to PizzaStore and then according to our choice, it will return pizza object.


PROBLEM WITH THIS APPROACH - 

What if we want to add more type of pizza?? class is not CLOSED for modification
Also, can we follow the 1st design principle - Identify the aspect of your application that vary and seperate them from what stays same.
So can we extract the if-else part because it vary if in future we will add new type of pizza

FIX - 

Simple Factory - Using Simple factory, we have created a simple factory. It not a design pattern (some developers think it of a design pattern but its not)

SIMPLE FACTORY is different from FACTORY METHOD

NEW REQUIREMENT - 

We are getting famous in various countries, so they want to open our franchise with a touch of their choices.

FACTORY METHOD PATTERN - defines an interface for creating an object, but lets subclass decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.