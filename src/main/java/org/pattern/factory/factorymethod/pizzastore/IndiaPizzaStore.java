package org.pattern.factory.factorymethod.pizzastore;

import org.pattern.factory.factorymethod.PizzaStore;
import org.pattern.factory.factorymethod.pizzas.*;

public class IndiaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        if(pizzaType.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if(pizzaType.equals("AchariDoPyaza")) {
            pizza = new AchariDoPyazaPizza();
        } else if (pizzaType.equals("Farmhouse")) {
            pizza = new FarmhousePizza();
        }

        return pizza;
    }
}
