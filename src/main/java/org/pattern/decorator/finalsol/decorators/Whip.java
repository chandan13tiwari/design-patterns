package org.pattern.decorator.finalsol.decorators;

import org.pattern.decorator.finalsol.beverages.Beverage;

public class Whip extends CondimentDecorator{
    public  Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with WHIP !!";
    }
}
