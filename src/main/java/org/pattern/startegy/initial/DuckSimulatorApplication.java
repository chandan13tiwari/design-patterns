package org.pattern.startegy.initial;

import org.pattern.startegy.initial.duck.MallardDuck;
import org.pattern.startegy.initial.duck.RedHeadDuck;
import org.pattern.startegy.initial.duck.RubberDuck;

public class DuckSimulatorApplication {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        System.out.println("~~~~~Mallard Duck~~~~~~");
        mallardDuck.quack();
        mallardDuck.swim();
        // Changes after new requirement come
        mallardDuck.fly();
        mallardDuck.display();


        Duck redHeadDuck = new RedHeadDuck();
        System.out.println("~~~~~RedHead Duck~~~~~~");
        redHeadDuck.quack();
        redHeadDuck.swim();
        // Changes after new requirement come
        redHeadDuck.fly();
        redHeadDuck.display();


        // Changes after new requirement come
        Duck rubberDuck = new RubberDuck();
        System.out.println("~~~~~Rubber Duck~~~~~~");
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();
        rubberDuck.display();
    }
}
