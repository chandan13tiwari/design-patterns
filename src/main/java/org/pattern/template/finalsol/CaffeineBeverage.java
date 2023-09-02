package org.pattern.template.finalsol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverage {

    // this method is a template - because the algorithm is common
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiment()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public abstract void addCondiments();

    // this method is a hook - a default method
    /*public boolean customerWantsCondiment() {
        return true;
    }*/

    public boolean customerWantsCondiment() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like to add Lemon in your Tea (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO Error trying to read your answer");
        }

        if(answer == null) {
            return "no";
        }

        return answer;
    }
}
