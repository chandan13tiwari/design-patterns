package org.pattern.iterator.secondsol;

import org.pattern.iterator.secondsol.iterator.Iterator;
import org.pattern.iterator.secondsol.menu.DominoMenu;
import org.pattern.iterator.secondsol.menu.PizzaHutMenu;


public class Waitress {
    PizzaHutMenu pizzaHutMenu;
    DominoMenu dominoMenu;

    public Waitress(PizzaHutMenu pizzaHutMenu, DominoMenu dominoMenu) {
        this.pizzaHutMenu = pizzaHutMenu;
        this.dominoMenu = dominoMenu;
    }

    public void printMenu() {
        // printing morning menu - PizzaHut Menu
        Iterator pizzaHutIterator = pizzaHutMenu.createIterator();
        System.out.println("~~~~ MENU - PIZZAHUT PIZZA ~~~~");
        printMenu(pizzaHutIterator);

        // printing evening menu - Domino's Pizza Menu
        Iterator dominoPizzaIterator = dominoMenu.createIterator();
        System.out.println("~~~~ MENU - DOMINO'S PIZZA ~~~~");
        printMenu(dominoPizzaIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next();

            System.out.println(menuItem.getName() + " - " + menuItem.getDescription() + " - " + "Rs. " + menuItem.getPrice());
        }
    }
}
