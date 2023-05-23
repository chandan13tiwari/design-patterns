package org.pattern.startegy.secondsol.duck;

import org.pattern.startegy.secondsol.Duck;

public class DecoyDuck extends Duck {
    @Override
    public void quack() {
        //do nothing - decoy duck can't quack
    }

    @Override
    public void swim() {
        //do nothing - decoy duck can't swim
    }

    @Override
    public void fly() {
        //do nothing - decoy duck can't fly
    }

    @Override
    public void display() {
        System.out.println("Hey There! I'm Decoy Duck!!");
    }
}
