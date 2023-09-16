package org.pattern.composite.secondsol.menu;

import org.pattern.composite.secondsol.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PizzaHutMenu implements Menu {
    List<MenuItem> menuItems;

    public PizzaHutMenu() {
        menuItems = new ArrayList<>();

        addItem("Pepperoni Pizza", "Pizza with Pepperoni", true, 2.99);
        addItem("Pepperika Pizza", "Pizza with the spiciest Pepperika seasoning", false, 2.99);
        addItem("Waffles Pizza", "Pizza with Waffles seasoning and honey spread", false, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /* Don't need this method anymore, we'll create an Iterator for the same
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }*/

    // We'll use the ArrayList inbuilt Iterator
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
