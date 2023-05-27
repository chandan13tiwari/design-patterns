package org.pattern.decorator.finalsol.beverages;

public class Espresso extends Beverage {

    public Espresso() {
        super.description = "You have ordered ESPRESSO";
    }
    @Override
    public double cost() {
        return 120;
    }
}
