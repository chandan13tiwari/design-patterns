package org.pattern.decorator.initialsol.beverage;

public class DarkRoastWithSoy extends Beverage{

    public DarkRoastWithSoy() {
        super.description = "You have ordered Dark Roast with SOY !!";
    }
    @Override
    public int cost() {
        return 70 + 30;
    }
}
