package org.pattern.template.finalsol;

public class StarBuzzApplication {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("~~~ Making Coffee...");
        coffee.prepareRecipe();

        System.out.println("~~~ Making Tea...");
        tea.prepareRecipe();
    }
}
