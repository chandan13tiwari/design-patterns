package org.pattern.decorator.initialsol.beverage;

public abstract class Beverage {

    public String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
