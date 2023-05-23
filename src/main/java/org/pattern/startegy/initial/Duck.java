package org.pattern.startegy.initial;

public abstract class Duck {

    public void quack() {
        System.out.println("Duck can Quacks");
    }
    public void swim() {
        System.out.println("Duck can Swims");
    }

    // All Ducks have their different appearance
    public abstract void display();
}
