package org.pattern.factory.factorymethod.pizzas;

public abstract class Pizza {

    public String name;

    public void prepare() {
        System.out.println("Preparing your Pizza...");
    }

    public void bake() {
        System.out.println("Your pizza is ready and inside the Oven... ");
    }

    public void cut() {
        System.out.println("Ready to serve 6 peoples!!");
    }

    public void box() {
        System.out.println("It's out for delivery!!!");
    }

    public String getName() {
        return name;
    }
}
