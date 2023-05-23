package org.pattern.startegy.finalsol.flytypes;

import org.pattern.startegy.finalsol.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm Flying!!");
    }
}
