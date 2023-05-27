package org.pattern.decorator.finalsol;

import org.pattern.decorator.finalsol.beverages.Beverage;
import org.pattern.decorator.finalsol.beverages.DarkRoast;
import org.pattern.decorator.finalsol.beverages.Espresso;
import org.pattern.decorator.finalsol.decorators.Mocha;
import org.pattern.decorator.finalsol.decorators.Whip;

public class StarbuzzApplication {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        System.out.println("~~~~ ORDER DETAILS ~~~~");
        System.out.println(espresso.getDescription());
        System.out.println("TOTAL AMT: " + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        darkRoast = new Mocha(darkRoast);

        System.out.println("~~~~ ORDER DETAILS ~~~~");
        System.out.println(darkRoast.getDescription());
        System.out.println("TOTAL AMT: " + darkRoast.cost());
    }
}
