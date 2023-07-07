package org.pattern.factory.factorymethod;

import org.pattern.factory.factorymethod.pizzas.Pizza;
import org.pattern.factory.factorymethod.pizzastore.IndiaPizzaStore;
import org.pattern.factory.factorymethod.pizzastore.NYPizzaStore;

public class PizzaApplication {
    public static void main(String[] args) {

        PizzaStore indiaPizzaStore = new IndiaPizzaStore();

        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza pizza = indiaPizzaStore.orderPizza("AchariDoPyaza");
        System.out.println("You've ordered " + pizza.getName());

        pizza = nyPizzaStore.orderPizza("Pepperoni");
        System.out.println("You've ordered " + pizza.getName());
    }
}
