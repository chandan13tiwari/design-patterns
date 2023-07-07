package org.pattern.factory.initialsol.pizzas;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Your cheese pizza is ready and inside the Oven... ");
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
