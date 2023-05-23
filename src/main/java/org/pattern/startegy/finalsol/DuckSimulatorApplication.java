package org.pattern.startegy.finalsol;

import org.pattern.startegy.finalsol.duck.DecoyDuck;
import org.pattern.startegy.finalsol.duck.MallardDuck;
import org.pattern.startegy.finalsol.duck.RedHeadDuck;
import org.pattern.startegy.finalsol.duck.RubberDuck;

public class DuckSimulatorApplication {
    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();

        System.out.println("~~~~~Mallard Duck~~~~~~");
        mallardDuck.quack();
        mallardDuck.swim();
        // Changes after new requirement come
        mallardDuck.fly();
        mallardDuck.display();


        RedHeadDuck redHeadDuck = new RedHeadDuck();
        System.out.println("~~~~~RedHead Duck~~~~~~");
        redHeadDuck.quack();
        redHeadDuck.swim();
        // Changes after new requirement come
        redHeadDuck.fly();
        redHeadDuck.display();


        // Changes after new requirement come
        RubberDuck rubberDuck = new RubberDuck();
        System.out.println("~~~~~Rubber Duck~~~~~~");
        rubberDuck.quack();
        rubberDuck.swim();
        //rubberDuck.fly(); //doing nothing
        rubberDuck.display();

        DecoyDuck decoyDuck = new DecoyDuck();
        System.out.println("~~~~~Decoy Duck~~~~~~");
        //decoyDuck.quack(); //doing nothing
        decoyDuck.swim();
        //decoyDuck.fly(); //doing nothing
        decoyDuck.display();
    }
}
