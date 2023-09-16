package org.pattern.composite.finalsol;


import org.pattern.composite.finalsol.menu.Menu;

import java.util.Iterator;
import java.util.List;


public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print(); // now waitress just need to call the print method and that's it. Nothing to worry about
    }
}
