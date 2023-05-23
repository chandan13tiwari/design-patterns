package org.pattern.startegy.finalsol.quacktype;

import org.pattern.startegy.finalsol.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
