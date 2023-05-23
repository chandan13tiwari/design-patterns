package org.pattern.startegy.finalsol.duck;

import org.pattern.startegy.finalsol.Duck;
import org.pattern.startegy.finalsol.flytypes.FlyNoWay;
import org.pattern.startegy.finalsol.quacktype.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Hey There! I'm Decoy Duck!!");
    }
}
