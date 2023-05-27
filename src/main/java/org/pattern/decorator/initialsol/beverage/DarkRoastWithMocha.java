package org.pattern.decorator.initialsol.beverage;

public class DarkRoastWithMocha extends Beverage{

    public DarkRoastWithMocha() {
        super.description = "You have ordered Dark Roast with MOCHA !!";
    }
    @Override
    public int cost() {
        return 70 + 20;
    }
}
