package org.pattern.iterator.finalsol;

import org.pattern.iterator.finalsol.menu.DominoMenu;
import org.pattern.iterator.finalsol.menu.Menu;
import org.pattern.iterator.finalsol.menu.PizzaHutMenu;

public class RandomPizzaApplication {
    public static void main(String[] args) {
        Menu pizzaHutMenu = new PizzaHutMenu();
        Menu dominoMenu = new DominoMenu();

        Waitress waitress = new Waitress(pizzaHutMenu, dominoMenu);

        waitress.printMenu();
    }
}
