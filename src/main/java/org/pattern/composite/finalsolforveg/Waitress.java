package org.pattern.composite.finalsolforveg;


public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print(); // now waitress just need to call the print method and that's it. Nothing to worry about
    }

    public void printVegMenu() {
        allMenus.printVeg();
    }
}
