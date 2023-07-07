package org.pattern.factory.factorymethod.pizzas;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super.name = "Pepperoni Pizza";
    }

    @Override
    public void box() {
        System.out.println("Its out for delivery with Peppy Pizza team!!");
    }
}
