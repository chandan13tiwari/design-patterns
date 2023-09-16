package org.pattern.composite.finalsol;

import org.pattern.composite.finalsol.menu.CafeMenu;
import org.pattern.composite.finalsol.menu.DominoMenu;
import org.pattern.composite.finalsol.menu.Menu;
import org.pattern.composite.finalsol.menu.PizzaHutMenu;

import java.util.List;

public class RandomPizzaApplication {
    public static void main(String[] args) {
        Menu pizzaHutMenu = new PizzaHutMenu();
        Menu dominoMenu = new DominoMenu();
        Menu cafeMenu = new CafeMenu();

        List<Menu> menuList = List.of(pizzaHutMenu, dominoMenu, cafeMenu);


        Waitress waitress = new Waitress(menuList);

        waitress.printMenu();
    }
}
