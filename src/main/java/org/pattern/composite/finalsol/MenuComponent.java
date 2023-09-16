package org.pattern.composite.finalsol;

public abstract class MenuComponent {

    // creating all default implementation - to avoid failures or unnecessary modifications
    public void add(MenuComponent menuComponent) { // composite method
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) { // composite method
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) { // composite method
        throw new UnsupportedOperationException();
    }

    public String getName() { // operation method
        throw new UnsupportedOperationException();
    }

    public String getDescription() { // operation method
        throw new UnsupportedOperationException();
    }

    public double getPrice() { // operation method
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() { // operation method
        throw new UnsupportedOperationException();
    }

    public void print() { // operation method
        throw new UnsupportedOperationException();
    }
}
