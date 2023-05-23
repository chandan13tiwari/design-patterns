package org.pattern.startegy.finalsol.duck;

import org.pattern.startegy.finalsol.Duck;
import org.pattern.startegy.finalsol.behaviour.Flyable;
import org.pattern.startegy.finalsol.behaviour.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void quack() {
        System.out.println("This duck can Quack");
    }

    @Override
    public void swim() {
        System.out.println("This duck can Swim");
    }

    @Override
    public void fly() {
        System.out.println("This duck can Fly");
    }

    @Override
    public void display() {
        System.out.println("Hey There! I'm Mallard Duck!!");
    }
}
