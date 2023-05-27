package org.pattern.decorator.initialsol.beverage;

public class Espresso extends Beverage{

    public Espresso() {
        super.description = "You have ordered Espresso!!";
    }
    @Override
    public int cost() {
        return 120;
    }
}
