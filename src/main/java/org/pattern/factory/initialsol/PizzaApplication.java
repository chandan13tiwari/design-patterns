package org.pattern.factory.initialsol;

import org.pattern.factory.initialsol.pizzas.Pizza;

public class PizzaApplication {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();

        Pizza pizza = pizzaStore.orderPizza();
    }
}
