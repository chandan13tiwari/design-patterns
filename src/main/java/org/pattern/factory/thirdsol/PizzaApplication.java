package org.pattern.factory.thirdsol;

import org.pattern.factory.thirdsol.pizzas.Pizza;

public class PizzaApplication {
    public static void main(String[] args) {

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);


        Pizza pizza = pizzaStore.orderPizza("Cheese");
        System.out.println("You've ordered " + pizza.name);

        pizza = pizzaStore.orderPizza("Greek");
        System.out.println("You've ordered " + pizza.name);
    }
}
