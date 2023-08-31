package org.pattern.adapter.example2;

import org.pattern.adapter.example2.adapter.TurkeyAdapter;
import org.pattern.adapter.example2.duck.Duck;
import org.pattern.adapter.example2.duck.MallardDuck;
import org.pattern.adapter.example2.turkey.Turkey;
import org.pattern.adapter.example2.turkey.WildTurkey;

public class MainApplication {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("~~Turkey Says~~");
        turkey.gobble();
        turkey.fly();

        System.out.println("~~Duck Says~~");
        duck.quack();
        duck.fly();

        System.out.println("~~Turkey Adapter Says~~");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
