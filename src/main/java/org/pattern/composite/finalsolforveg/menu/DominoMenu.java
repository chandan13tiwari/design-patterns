package org.pattern.composite.finalsolforveg.menu;

import org.pattern.composite.finalsolforveg.MenuItem;

public class DominoMenu extends Menu {
    static final int MAX_ITEMS = 2;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DominoMenu(String name, String description) {
        super(name, description);
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
}
