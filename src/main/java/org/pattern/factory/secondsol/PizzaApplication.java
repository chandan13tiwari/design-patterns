package org.pattern.factory.secondsol;

public class PizzaApplication {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();

        pizzaStore.orderPizza("Cheese");

        pizzaStore.orderPizza("Greek");
    }
}
