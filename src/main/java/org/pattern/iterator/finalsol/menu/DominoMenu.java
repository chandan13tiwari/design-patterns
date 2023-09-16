package org.pattern.iterator.finalsol.menu;

import org.pattern.iterator.finalsol.MenuItem;
import org.pattern.iterator.finalsol.iterator.DominoPizzaIterator;

import java.util.Iterator;

public class DominoMenu implements Menu{
    static final int MAX_ITEMS = 2;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DominoMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Farmhouse Pizza", "Pizza with Vegetables topping and oregano seasoning", true, 2.99);
        addItem("Achari Do Pyaza Pizza", "Pizza with Achari Taste with Onion toppings", true, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if(numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full!! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    /* Don't need this method as we need to create an Iterator for the same
    public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DominoPizzaIterator(menuItems);
    }
}
