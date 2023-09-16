package org.pattern.iterator.secondsol.iterator;

import org.pattern.iterator.secondsol.MenuItem;
import org.pattern.iterator.secondsol.menu.PizzaHutMenu;

import java.util.*;

public class PizzaHutIterator implements Iterator{

    List<MenuItem> items;
    java.util.Iterator iterator;

    public PizzaHutIterator(List<MenuItem> items) {
        this.items = items;
        iterator = this.items.iterator();
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return (MenuItem) iterator.next();
    }
}
