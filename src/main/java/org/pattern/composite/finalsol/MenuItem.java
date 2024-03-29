package org.pattern.composite.finalsol;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print(getName() + " ");
        if(isVegetarian()) {
            System.out.print("(Veg)");
        } else {
            System.out.print("(Non-Veg)");
        }

        System.out.print(" - " + getDescription());
        System.out.println(" - Rs " + getPrice());
    }
}
