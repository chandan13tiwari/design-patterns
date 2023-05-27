package org.pattern.decorator.finalsol.beverages;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        super.description = "you have ordered DARK ROAST";
    }
    @Override
    public double cost() {
        return 70;
    }
}
