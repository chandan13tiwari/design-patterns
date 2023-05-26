package org.pattern.observer.secondsol;

import org.pattern.observer.secondsol.observers.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
