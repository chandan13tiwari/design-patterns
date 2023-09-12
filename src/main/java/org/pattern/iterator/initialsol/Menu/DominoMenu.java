package org.pattern.iterator.initialsol.Menu;

import org.pattern.iterator.initialsol.MenuItem;

public class DominoMenu {
    static final int MAX_ITEMS = 6;
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

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
