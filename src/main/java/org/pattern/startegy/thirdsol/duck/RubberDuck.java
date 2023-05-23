package org.pattern.startegy.thirdsol.duck;

import org.pattern.startegy.thirdsol.Duck;
import org.pattern.startegy.thirdsol.behaviour.Quackable;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("This duck can Squeak (override quack())");
    }

    @Override
    public void swim() {
        System.out.println("This duck can Swim");
    }

    @Override
    public void display() {
        System.out.println("Hey There! I'm Rubber Duck!!");
    }
}
