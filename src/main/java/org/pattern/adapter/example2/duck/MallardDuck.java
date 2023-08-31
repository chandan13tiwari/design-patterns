package org.pattern.adapter.example2.duck;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("I'm flying");
    }

    @Override
    public void fly() {
        System.out.println("I'm quacking");
    }
}
