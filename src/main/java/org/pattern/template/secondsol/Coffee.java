package org.pattern.template.secondsol;

public class Coffee extends CaffeineBeverage{

    @Override
    public void prepareRecipe() {
        brewCoffeeGrinds();
        addSugarAndMilk();
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

}
