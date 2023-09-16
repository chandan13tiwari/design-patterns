package org.pattern.composite.finalsolforveg.menu;

import org.pattern.composite.finalsolforveg.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class PizzaHutMenu extends Menu {
    List<MenuItem> menuItems;

    public PizzaHutMenu(String name, String description) {
        super(name, description);
        menuItems = new ArrayList<>();

        addItem("Pepperoni Pizza", "Pizza with Pepperoni", true, 2.99);
        addItem("Pepperika Pizza", "Pizza with the spiciest Pepperika seasoning", false, 2.99);
        addItem("Waffles Pizza", "Pizza with Waffles seasoning and honey spread", false, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}
