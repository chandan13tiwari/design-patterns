package org.pattern.adapter.example2.adapter;

import org.pattern.adapter.example2.duck.Duck;
import org.pattern.adapter.example2.turkey.Turkey;

// We want to use Turkey as a Mallard Duck
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble(); // Turkey behaviour wrapped inside Duck behaviour
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
