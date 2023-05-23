package org.pattern.startegy.secondsol;

import org.pattern.startegy.secondsol.duck.DecoyDuck;
import org.pattern.startegy.secondsol.duck.MallardDuck;
import org.pattern.startegy.secondsol.duck.RedHeadDuck;
import org.pattern.startegy.secondsol.duck.RubberDuck;

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
        rubberDuck.fly(); //doing nothing
        rubberDuck.display();

        Duck decoyDuck = new DecoyDuck();
        System.out.println("~~~~~Decoy Duck~~~~~~");
        decoyDuck.quack(); //doing nothing
        decoyDuck.swim(); //doing nothing
        decoyDuck.fly(); //doing nothing
        decoyDuck.display();
    }
}
