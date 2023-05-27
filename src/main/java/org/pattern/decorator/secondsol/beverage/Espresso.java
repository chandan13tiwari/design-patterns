package org.pattern.decorator.secondsol.beverage;

public class Espresso extends Beverage {

    public Espresso() {
        super.description = "You have ordered Espresso!!";
    }
    @Override
    public int cost() {
        return super.cost() + 120;
    }
}
