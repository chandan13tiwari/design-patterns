package org.pattern.iterator.initialsol;

import org.pattern.iterator.initialsol.menu.DominoMenu;
import org.pattern.iterator.initialsol.menu.PizzaHutMenu;

public class RandomPizzaApplication {
    public static void main(String[] args) {
        PizzaHutMenu pizzaHutMenu = new PizzaHutMenu();
        DominoMenu dominoMenu = new DominoMenu();

        Waitress waitress = new Waitress(pizzaHutMenu, dominoMenu);

        waitress.printMenu();
    }
}
