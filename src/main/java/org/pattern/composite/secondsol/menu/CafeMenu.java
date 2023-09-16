package org.pattern.composite.secondsol.menu;

import org.pattern.composite.secondsol.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    Map<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new HashMap<>();

        addItem("Veggie Burger", "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the Day", "A Cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito with whole pint benas, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
