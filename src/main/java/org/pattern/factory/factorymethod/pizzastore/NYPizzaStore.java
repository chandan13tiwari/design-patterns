package org.pattern.factory.factorymethod.pizzastore;

import org.pattern.factory.factorymethod.PizzaStore;
import org.pattern.factory.factorymethod.pizzas.CheesePizza;
import org.pattern.factory.factorymethod.pizzas.GreekPizza;
import org.pattern.factory.factorymethod.pizzas.PepperoniPizza;
import org.pattern.factory.factorymethod.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        if(pizzaType.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if(pizzaType.equals("Greek")) {
            pizza = new GreekPizza();
        } else if (pizzaType.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
