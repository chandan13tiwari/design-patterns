package org.pattern.composite.secondsol.iterator;

import org.pattern.composite.secondsol.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
