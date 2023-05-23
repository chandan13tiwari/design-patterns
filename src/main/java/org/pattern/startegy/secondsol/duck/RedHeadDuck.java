package org.pattern.startegy.secondsol.duck;

import org.pattern.startegy.secondsol.Duck;

public class RedHeadDuck extends Duck {
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
        System.out.println("Hey There! I'm Redhead Duck!!");
    }
}
