package org.pattern.startegy.finalsol.duck;

import org.pattern.startegy.finalsol.Duck;
import org.pattern.startegy.finalsol.flytypes.FlyWithWings;
import org.pattern.startegy.finalsol.quacktype.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!!");
    }
}
