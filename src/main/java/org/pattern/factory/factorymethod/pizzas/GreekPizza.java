package org.pattern.factory.factorymethod.pizzas;

public class GreekPizza extends Pizza {
    public GreekPizza() {
        super.name = "Greek Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Ready to serve 4 peoples!!");
    }
}
