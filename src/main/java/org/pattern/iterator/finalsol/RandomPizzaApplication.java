package org.pattern.iterator.finalsol;

import org.pattern.iterator.finalsol.menu.DominoMenu;
import org.pattern.iterator.finalsol.menu.PizzaHutMenu;

public class RandomPizzaApplication {
    public static void main(String[] args) {
        PizzaHutMenu pizzaHutMenu = new PizzaHutMenu();
        DominoMenu dominoMenu = new DominoMenu();

        Waitress waitress = new Waitress(pizzaHutMenu, dominoMenu);

        waitress.printMenu();
    }
}
