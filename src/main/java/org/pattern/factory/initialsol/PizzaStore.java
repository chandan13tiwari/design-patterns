package org.pattern.factory.initialsol;

import org.pattern.factory.initialsol.pizzas.CheesePizza;
import org.pattern.factory.initialsol.pizzas.Pizza;

public class PizzaStore {

    Pizza orderPizza() {
        Pizza pizza = new CheesePizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
