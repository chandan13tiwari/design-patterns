package org.pattern.composite.initialsol;

import org.pattern.composite.initialsol.menu.DominoMenu;
import org.pattern.composite.initialsol.menu.PizzaHutMenu;

public class RandomPizzaApplication {
    public static void main(String[] args) {
        PizzaHutMenu pizzaHutMenu = new PizzaHutMenu();
        DominoMenu dominoMenu = new DominoMenu();

        Waitress waitress = new Waitress(pizzaHutMenu, dominoMenu);

        waitress.printMenu();
    }
}
