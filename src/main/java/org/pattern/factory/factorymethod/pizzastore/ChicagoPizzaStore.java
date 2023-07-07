package org.pattern.factory.factorymethod.pizzastore;

import org.pattern.factory.factorymethod.PizzaStore;
import org.pattern.factory.factorymethod.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        if(pizzaType.equals("Veggie")) {
            pizza = new VeggiePizza();
        } else if(pizzaType.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if (pizzaType.equals("Yogurt")) {
            pizza = new YogurtPizza();
        }

        return pizza;
    }
}
