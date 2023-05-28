INITIAL REQUIREMENT

We need to create a StarBuzz Application where customer can order coffee of their choices like - DarkRoast, Espresso, etc.

Beverage class should have one description variable and a cost() method.

![](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/decorator-pattern-diagrams/1.jpg)

In Addition to your coffee, you can also ask for several condiments like - Steamed Milk, Mocha, Soy, etc and that too have some cost associated with them.

So, for that you need to create a subclass for each condiment with a cost() associated with that.

![](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/decorator-pattern-diagrams/2.jpg)



PROBLEM WITH THIS APPROACH - 

If you see, their could be many combinations of condiments with Beverages. That could probably ends up with a maintenance nightmare because if we need to update the cost, we need to track all the associated beverages and condiments. Also, we are hardcoding the condiments with Beverages, so we can't add a new condiment in runtime.