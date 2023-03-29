package org.example.entityes;

public enum Menu {
    PEPERONI(new Peperoni(), "Пеперони"),
    BARBECUE(new Barbecue(), "Барбекю"),
    MARGARITA(new Margarita(), "Маргарита");

    private final Pizza pizza;
    private final String name;

    Menu(Pizza pizza, String name) {
        this.pizza = pizza;
        this.name = name;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getName() {
        return name;
    }
}
