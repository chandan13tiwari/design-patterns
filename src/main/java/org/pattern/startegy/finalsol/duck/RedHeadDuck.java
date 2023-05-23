package org.pattern.startegy.finalsol.duck;

import org.pattern.startegy.finalsol.Duck;
import org.pattern.startegy.finalsol.flytypes.FlyWithWings;
import org.pattern.startegy.finalsol.quacktype.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real RedHead Duck!!");
    }
}
