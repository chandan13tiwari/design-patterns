package org.pattern.startegy.finalsol.duck;

import org.pattern.startegy.finalsol.Duck;
import org.pattern.startegy.finalsol.flytypes.FlyNoWay;
import org.pattern.startegy.finalsol.quacktype.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duckie!!");
    }
}
