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

PROBLEMS WITH SIMPLE FACTORY - 

There is as such no problem with Simple factory as per Client requirement as of now..
BUT, using Simple Factory we are still not doing justification with Open/Close principle.
HOW?? 
Because, let say if in future we need to add more and more pizza based on different location (means now Pizza Store has franchise opened in different countries, 
then if we use Simple Factory, we need to update the factory class again and again for a simple change), so to increase the EFFICIENCY - 
we need to use FACTORY METHOD.