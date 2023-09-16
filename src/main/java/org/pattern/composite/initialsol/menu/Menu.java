package org.pattern.composite.initialsol.menu;

import org.pattern.composite.initialsol.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
