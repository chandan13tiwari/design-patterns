package org.pattern.startegy.finalsol;

import org.pattern.startegy.finalsol.duck.DecoyDuck;
import org.pattern.startegy.finalsol.duck.MallardDuck;
import org.pattern.startegy.finalsol.duck.RedHeadDuck;
import org.pattern.startegy.finalsol.duck.RubberDuck;
import org.pattern.startegy.finalsol.flytypes.FlyWithWings;

public class DuckSimulatorApplication {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        System.out.println("~~~~~Mallard Duck~~~~~~");
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.display();


        Duck redHeadDuck = new RedHeadDuck();
        System.out.println("~~~~~RedHead Duck~~~~~~");
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.swim();
        redHeadDuck.display();


        // Changes after new requirement come
        Duck rubberDuck = new RubberDuck();
        System.out.println("~~~~~Rubber Duck~~~~~~");
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.display();

        DecoyDuck decoyDuck = new DecoyDuck();
        System.out.println("~~~~~Decoy Duck~~~~~~");
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.swim();
        decoyDuck.display();

        System.out.println("Dynamically changing FlyBehaviour of Decoy Ducks");
        decoyDuck.setFlyBehaviour(new FlyWithWings());
        decoyDuck.performFly();
    }
}
