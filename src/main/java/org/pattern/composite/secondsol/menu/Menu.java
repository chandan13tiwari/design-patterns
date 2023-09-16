package org.pattern.composite.secondsol.menu;

import org.pattern.composite.secondsol.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
