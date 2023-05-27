package org.pattern.decorator.initialsol.beverage;

public class EspressoWithSteamedMilk extends Beverage{

    public EspressoWithSteamedMilk() {
        super.description = "You have ordered Espresso with STEAMED MILK !!";
    }
    @Override
    public int cost() {
        return 120 + 10;
    }
}
