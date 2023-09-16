package org.pattern.iterator.secondsol;

import org.pattern.iterator.secondsol.menu.DominoMenu;
import org.pattern.iterator.secondsol.menu.PizzaHutMenu;

public class RandomPizzaApplication {
    public static void main(String[] args) {
        PizzaHutMenu pizzaHutMenu = new PizzaHutMenu();
        DominoMenu dominoMenu = new DominoMenu();

        Waitress waitress = new Waitress(pizzaHutMenu, dominoMenu);

        waitress.printMenu();
    }
}
