package org.pattern.startegy.finalsol;

import org.pattern.startegy.finalsol.behaviour.FlyBehaviour;
import org.pattern.startegy.finalsol.behaviour.QuackBehaviour;

public abstract class Duck {

    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public Duck(){}

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All Ducks float, even decoy!");
    }

    // All Ducks have their different appearance
    public abstract void display();


    //To set the behaviours dynamically, we can use these methods
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
