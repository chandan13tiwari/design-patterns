package org.pattern.factory.thirdsol;

import org.pattern.factory.thirdsol.pizzas.CheesePizza;
import org.pattern.factory.thirdsol.pizzas.GreekPizza;
import org.pattern.factory.thirdsol.pizzas.PepperoniPizza;
import org.pattern.factory.thirdsol.pizzas.Pizza;

public class SimplePizzaFactory {
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
