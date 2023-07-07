package org.pattern.factory.thirdsol;

import org.pattern.factory.thirdsol.pizzas.CheesePizza;
import org.pattern.factory.thirdsol.pizzas.GreekPizza;
import org.pattern.factory.thirdsol.pizzas.PepperoniPizza;
import org.pattern.factory.thirdsol.pizzas.Pizza;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String pizzaType) {
        
        Pizza pizza = factory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
