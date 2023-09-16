package org.pattern.composite.finalsol.menu;

import org.pattern.composite.finalsol.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents; // Menu can have any number of children of type MenuComponent
    String name; // each menu has a name
    String description; // each menu has a description - this is optional, you can remove it if you don't need it

    public Menu(String name, String description) {
        menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent); // If you don't want to give remove privilages then you can avoid overriding this
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println("~~~~" + getName() + " - " + getDescription() + " ~~~~");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
