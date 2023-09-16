package org.pattern.iterator.finalsol;


import org.pattern.iterator.finalsol.menu.DominoMenu;
import org.pattern.iterator.finalsol.menu.Menu;
import org.pattern.iterator.finalsol.menu.PizzaHutMenu;

import java.util.Iterator;


public class Waitress {
    Menu pizzaHutMenu;
    Menu dominoMenu;

    public Waitress(Menu pizzaHutMenu, Menu dominoMenu) {
        this.pizzaHutMenu = pizzaHutMenu;
        this.dominoMenu = dominoMenu;
    }

    public void printMenu() {
        // printing morning menu - PizzaHut Menu
        Iterator<MenuItem> pizzaHutIterator = pizzaHutMenu.createIterator();
        System.out.println("~~~~ MENU - PIZZAHUT PIZZA ~~~~");
        printMenu(pizzaHutIterator);

        // printing evening menu - Domino's Pizza Menu
        Iterator<MenuItem> dominoPizzaIterator = dominoMenu.createIterator();
        System.out.println("~~~~ MENU - DOMINO'S PIZZA ~~~~");
        printMenu(dominoPizzaIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next();

            System.out.println(menuItem.getName() + " - " + menuItem.getDescription() + " - " + "Rs. " + menuItem.getPrice());
        }
    }
}
