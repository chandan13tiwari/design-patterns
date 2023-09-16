package org.pattern.composite.initialsol;


import org.pattern.composite.initialsol.menu.Menu;

import java.util.Iterator;


public class Waitress {
    Menu pizzaHutMenu;
    Menu dominoMenu;
    Menu cafeMenu;

    public Waitress(Menu pizzaHutMenu, Menu dominoMenu, Menu cafeMenu) {
        this.pizzaHutMenu = pizzaHutMenu;
        this.dominoMenu = dominoMenu;
        this.cafeMenu = cafeMenu;
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

        // printing cafe menu
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        System.out.println("~~~~ MENU - CAFE MENU ~~~~");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next();

            System.out.println(menuItem.getName() + " - " + menuItem.getDescription() + " - " + "Rs. " + menuItem.getPrice());
        }
    }
}
