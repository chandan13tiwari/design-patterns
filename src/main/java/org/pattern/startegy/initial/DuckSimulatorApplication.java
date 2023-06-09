package org.pattern.startegy.initial;

import org.pattern.startegy.initial.duck.MallardDuck;
import org.pattern.startegy.initial.duck.RedHeadDuck;

public class DuckSimulatorApplication {
    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();

        System.out.println("~~~~~Mallard Duck~~~~~~");
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();


        RedHeadDuck redHeadDuck = new RedHeadDuck();
        System.out.println("~~~~~RedHead Duck~~~~~~");
        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.display();

    }
}
