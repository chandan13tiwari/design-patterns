package org.pattern.decorator.finalsol.decorators;

import org.pattern.decorator.finalsol.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
