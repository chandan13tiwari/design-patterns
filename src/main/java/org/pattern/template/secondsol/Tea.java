package org.pattern.template.secondsol;

public class Tea extends CaffeineBeverage{
    @Override
    public void prepareRecipe() {
        steepTeaBag();
        addLemon();
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }
}
