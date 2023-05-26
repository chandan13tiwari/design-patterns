package org.pattern.observer.finalsol;

import org.pattern.observer.finalsol.observers.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
