package org.pattern.composite.finalsol.menu;

import org.pattern.composite.finalsol.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
