package org.pattern.iterator.initialsol;

import org.pattern.iterator.initialsol.Menu.DominoMenu;
import org.pattern.iterator.initialsol.Menu.PizzaHutMenu;

import java.util.ArrayList;
import java.util.List;

public class Waitress {
    PizzaHutMenu pizzaHutMenu;
    DominoMenu dominoMenu;

    public Waitress(PizzaHutMenu pizzaHutMenu, DominoMenu dominoMenu) {
        this.pizzaHutMenu = pizzaHutMenu;
        this.dominoMenu = dominoMenu;
    }

    public void printMenu() {
        // printing morning menu - PizzaHut Menu
        List<MenuItem> dayMenu = pizzaHutMenu.getMenuItems();
        for(int i=0; i<dayMenu.size(); i++) {
            MenuItem menuItem = dayMenu.get(i);

            System.out.println(menuItem.getName() + " - " + menuItem.getDescription() + " - " + "Rs. " + menuItem.getPrice());
        }

        // printing evening menu - Domino's Pizza Menu
        MenuItem[] eveningMenu = dominoMenu.getMenuItems();
        for (int i=0; i<eveningMenu.length-1; i++) {
            MenuItem menuItem = eveningMenu[i];

            System.out.println(menuItem.getName() + " - " + menuItem.getDescription() + " - " + "Rs. " + menuItem.getPrice());
        }
    }
}
