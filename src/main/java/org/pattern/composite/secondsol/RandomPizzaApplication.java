package org.pattern.composite.secondsol;

import org.pattern.composite.secondsol.menu.CafeMenu;
import org.pattern.composite.secondsol.menu.DominoMenu;
import org.pattern.composite.secondsol.menu.Menu;
import org.pattern.composite.secondsol.menu.PizzaHutMenu;

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
