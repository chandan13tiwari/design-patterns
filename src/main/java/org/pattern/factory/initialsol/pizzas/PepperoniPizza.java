package org.pattern.factory.initialsol.pizzas;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing your Pepperoni Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Your pepperoni pizza is ready and inside the Oven... ");
    }

    @Override
    public void cut() {
        System.out.println("Ready to serve 6 peoples!!");
    }

    @Override
    public void box() {
        System.out.println("It's out for delivery!!!");
    }
}
