package org.pattern.iterator.secondsol.iterator;

import org.pattern.iterator.secondsol.MenuItem;

public class DominoPizzaIterator implements Iterator{

    MenuItem[] items;
    int position = 0;

    public DominoPizzaIterator(MenuItem[] items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        } else
            return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return  menuItem;
    }
}
