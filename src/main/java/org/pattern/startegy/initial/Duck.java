package org.pattern.startegy.initial;

public abstract class Duck {

    public void quack() {
        System.out.println("Duck can Quacks");
    }
    public void swim() {
        System.out.println("Duck can Swims");
    }

    // New Requirement - they want ducks to fly
    public void fly() {
        System.out.println("Duck can fly");
    }

    // All Ducks have their different appearance
    public abstract void display();
}
