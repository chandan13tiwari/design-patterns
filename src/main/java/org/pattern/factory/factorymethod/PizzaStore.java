package org.pattern.factory.factorymethod;

import org.pattern.factory.factorymethod.pizzas.Pizza;

public abstract class PizzaStore {

    Pizza orderPizza(String pizzaType) {
        
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String pizzaType); // this is our factory method
}
