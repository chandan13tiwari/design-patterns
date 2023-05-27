package org.pattern.decorator.secondsol;

import org.pattern.decorator.secondsol.beverage.Beverage;
import org.pattern.decorator.secondsol.beverage.Espresso;

public class StarbuzzApplication {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.setMilk(true);
        espresso.setMocha(true);
        espresso.setWhip(true);

        System.out.println("~~~~ ORDER DETAILS ~~~~");
        System.out.println(espresso.getDescription());
        System.out.println("TOTAL AMT: " + espresso.cost());
    }
}
