package org.pattern.composite.finalsol.menu;

import org.pattern.composite.finalsol.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class DessertMenu extends Menu{
    List<MenuItem> menuItems;
    public DessertMenu(String name, String description) {
        super(name, description);

        menuItems = new ArrayList<>();

        addItem("Ice Cream", "Ice Cream with Tutty Fruity Sprinkles", true, 2.99);
        addItem("Rasogulla", "Bengal famous Rasogulla dripping with sweet water", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}
