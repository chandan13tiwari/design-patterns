package org.pattern.decorator.initialsol.beverage;

public class DarkRoastWithSteamedMilk extends Beverage{

    public DarkRoastWithSteamedMilk() {
        super.description = "You have ordered Dark Roast with STEAMED MILK !!";
    }
    @Override
    public int cost() {
        return 70 + 10;
    }
}
