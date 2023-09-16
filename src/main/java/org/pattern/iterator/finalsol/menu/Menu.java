package org.pattern.iterator.finalsol.menu;

import org.pattern.iterator.finalsol.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
