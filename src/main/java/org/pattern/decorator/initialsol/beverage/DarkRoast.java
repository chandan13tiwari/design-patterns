package org.pattern.decorator.initialsol.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        super.description = "You have ordered Dark Roast !!";
    }
    @Override
    public int cost() {
        return 70;
    }
}
