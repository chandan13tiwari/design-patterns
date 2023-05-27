package org.pattern.decorator.initialsol;

import org.pattern.decorator.initialsol.beverage.Beverage;
import org.pattern.decorator.initialsol.beverage.EspressoWithSteamedMilkAndMocha;

public class StarbuzzApplication {
    public static void main(String[] args) {
        Beverage espresso = new EspressoWithSteamedMilkAndMocha();

        System.out.println("~~~~ ORDER DETAILS ~~~~");
        System.out.println(espresso.getDescription());
        System.out.println("TOTAL AMT: " + espresso.cost());
    }
}
