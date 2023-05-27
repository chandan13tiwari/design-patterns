package org.pattern.decorator.initialsol.beverage;

public class EspressoWithSteamedMilkAndMocha extends Beverage{

    public EspressoWithSteamedMilkAndMocha() {
        super.description = "You have ordered Espresso with STEAMED MILK and MOCHA !!";
    }
    @Override
    public int cost() {
        return 120 + 10 + 20;
    }
}
