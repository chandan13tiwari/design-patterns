package org.pattern.composite.finalsol;

import org.pattern.composite.finalsol.menu.*;


public class RandomPizzaApplication {
    public static void main(String[] args) {
        MenuComponent pizzaHutMenu = new Menu("PIZZAHUT MENU", "Morning");
        MenuComponent dominoMenu = new Menu("DOMINO'S PIZZA MENU", "Evening");
        MenuComponent cafeMenu = new Menu("STARBUZZ CAFE MENU", "All Time");
        MenuComponent dessertMenu = new Menu("STARBUZZ DESSERT MENU", "All Time");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pizzaHutMenu);
        allMenus.add(dominoMenu);
        allMenus.add(cafeMenu);

        // add menu items here
        dominoMenu.add(new MenuItem(
                "Farmhouse Pizza",
                "Pizza with Vegetables topping and oregano seasoning",
                true,
                2.99));

        dominoMenu.add(new MenuItem(
                "Achari Do Pyaza Pizza",
                "Pizza with Achari Taste with Onion toppings",
                true,
                3.49));



        pizzaHutMenu.add(new MenuItem(
                "Pepperoni Pizza",
                "Pizza with Pepperoni",
                true,
                2.99));

        pizzaHutMenu.add(new MenuItem(
                "Pepperika Pizza",
                "Pizza with the spiciest Pepperika seasoning",
                false,
                3.49));

        pizzaHutMenu.add(new MenuItem(
                "Waffles Pizza",
                "Pizza with Waffles seasoning and honey spread",
                true,
                3.49));




        cafeMenu.add(new MenuItem(
                "Veggie Burger",
                "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99));

        cafeMenu.add(new MenuItem(
                "Soup of the Day",
                "A Cup of the soup of the day, with a side salad",
                false,
                3.69));

        cafeMenu.add(new MenuItem(
                "Burrito",
                "A large burrito with whole pint benas, salsa, guacamole",
                true,
                4.29));

        cafeMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));

        cafeMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59));

        dessertMenu.add(new MenuItem(
                "Ice Cream",
                "Ice cream with tutty frutty sprinkles on it",
                true,
                2.59));



        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
