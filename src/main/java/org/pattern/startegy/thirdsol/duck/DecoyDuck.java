package org.pattern.startegy.thirdsol.duck;

import org.pattern.startegy.thirdsol.Duck;

public class DecoyDuck extends Duck {
    @Override
    public void swim() {
        System.out.println("This duck can Swim");
    }

    @Override
    public void display() {
        System.out.println("Hey There! I'm Decoy Duck!!");
    }
}
