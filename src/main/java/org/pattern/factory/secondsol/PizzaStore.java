package org.pattern.factory.secondsol;

import org.pattern.factory.secondsol.pizzas.CheesePizza;
import org.pattern.factory.secondsol.pizzas.GreekPizza;
import org.pattern.factory.secondsol.pizzas.PepperoniPizza;
import org.pattern.factory.secondsol.pizzas.Pizza;

public class PizzaStore {

    Pizza orderPizza(String pizzaType) {
        
        Pizza pizza = null;
        
        if(pizzaType.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if(pizzaType.equals("Greek")) {
            pizza = new GreekPizza();
        } else if (pizzaType.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
