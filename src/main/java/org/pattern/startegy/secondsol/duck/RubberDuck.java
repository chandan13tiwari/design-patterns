package org.pattern.startegy.secondsol.duck;

import org.pattern.startegy.secondsol.Duck;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("This duck can Squeak (override quack())");
    }

    @Override
    public void swim() {
        System.out.println("This duck can Swim");
    }

    @Override
    public void fly() {
        //do nothing - Rubber duck can't fly
    }

    @Override
    public void display() {
        System.out.println("Hey There! I'm Rubber Duck!!");
    }
}
