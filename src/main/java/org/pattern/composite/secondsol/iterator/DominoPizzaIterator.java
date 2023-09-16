package org.pattern.composite.secondsol.iterator;

import org.pattern.composite.secondsol.MenuItem;

import java.util.Iterator;

public class DominoPizzaIterator implements Iterator<MenuItem> {

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

    // this method is OPTIONAL in Iterator interface. So, here we are not removing anything so just throwing exception
    // if anyone tries
    @Override
    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove MenuItems!!");
    }
}
