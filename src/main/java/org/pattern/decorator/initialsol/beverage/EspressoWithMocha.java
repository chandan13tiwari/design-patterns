package org.pattern.decorator.initialsol.beverage;

public class EspressoWithMocha extends Beverage{

    public EspressoWithMocha() {
        super.description = "You have ordered Espresso with MOCHA !!";
    }
    @Override
    public int cost() {
        return 120 + 20;
    }
}
