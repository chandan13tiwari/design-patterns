package org.pattern.composite.secondsol.iterator;

import org.pattern.composite.secondsol.MenuItem;

import java.util.List;

public class PizzaHutIterator implements Iterator {

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
