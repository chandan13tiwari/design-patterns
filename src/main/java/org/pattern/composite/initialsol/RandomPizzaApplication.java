package org.pattern.composite.initialsol;

import org.pattern.composite.initialsol.menu.CafeMenu;
import org.pattern.composite.initialsol.menu.DominoMenu;
import org.pattern.composite.initialsol.menu.Menu;
import org.pattern.composite.initialsol.menu.PizzaHutMenu;

public class RandomPizzaApplication {
    public static void main(String[] args) {
        Menu pizzaHutMenu = new PizzaHutMenu();
        Menu dominoMenu = new DominoMenu();
        Menu cafeMenu = new CafeMenu();


        Waitress waitress = new Waitress(pizzaHutMenu, dominoMenu, cafeMenu);

        waitress.printMenu();
    }
}
