package org.pattern.startegy.finalsol.flytypes;

import org.pattern.startegy.finalsol.behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't Fly!!");
    }
}
