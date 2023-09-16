package org.pattern.iterator.secondsol.iterator;

import org.pattern.iterator.secondsol.MenuItem;
import org.pattern.iterator.secondsol.menu.PizzaHutMenu;

import java.util.*;

public class PizzaHutIterator implements Iterator{

    List<MenuItem> items;
    int position = 0;

    public PizzaHutIterator(List<MenuItem> items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if(position >= items.size()) {
            return false;
        } else
            return true;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position = position + 1;

        return item;
    }
}
