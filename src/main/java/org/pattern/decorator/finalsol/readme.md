INITIAL REQUIREMENT

We need to create a StarBuzz Application where customer can order coffee of their choices like - DarkRoast, Espresso, etc.

Beverage class should have one description variable and a cost() method.

In Addition to your coffee, you can also ask for several condiments like - Steamed Milk, Mocha, Soy, etc and that too have some cost associated with them.

So, for that you need to create a subclass for each condiment with a cost() associated with that.


PROBLEM WITH THIS APPROACH - 

If you see, their could be many combinations of condiments with Beverages. That could probably ends up with a maintanince nightmare because if we need to update the cost, we need to track all the associated beverages and condiments. Also, we are hardcoding the condiments with Beverages, so we can't add a new condiment in runtime.


SOLUTION?

Now, most of you think about this approach - <br />
Can't we have just use instance variable (of type boolean) and inheritance in the superclass to keep track of condiments.

OK, Let's give it a try...


IS THAT A GOOD SOLUTION??
<br />
That approach is not an ideal solution. WHY??

i. Price change for a condiments will force us to alter existing code.

ii. New condiments will force us to add new methods and alter that cost method in the superclass Beverages

iii. We may have new beverages. For some of these beverages like "ice tea", the condiment may not be appropriate, and yet the Tea subclass will still inherit methods like hasWhip()

iv. What if customer wants double Mocha??


So, to overcome these problem, Here's our new Design Principle - 

> Classes should be open for extension, but closed for modification

In simple words, our goal is to allow classes to be easily extended to incorporate new behaviours without modifying existing code.

This above Design principle is also known as **Open/Close Principle**.


Decorator Pattern also follows the above design principle - 

> *Decorator Pattern* attaches additional responsibilities to an object dynamically. Decorators provides a flexible alternative to subclassing for extending functionality.


###### Some Key points for Decorators - 

* Decorators have the same supertype as the objects they decorate.
* You acn use one or more decorators to wrap an object.
* Given that the decorators has the same supertype as the object its decorates, we can pass around a decorated object in place of the original (wrapped) object.
* Decorator *adds its own behaviour* before and/or after delegating to the object it decorates to do the rest of the job.
* Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators we want.