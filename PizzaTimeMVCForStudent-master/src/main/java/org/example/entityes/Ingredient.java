package org.example.entityes;

/*Этот код соответствует ООП и SOLID принципам */
public class Ingredient {
    private IngredientNameEnum name;
    private int price;

    public Ingredient(IngredientNameEnum name, int price) {
        this.name = name;
        this.price = price;
    }

    public IngredientNameEnum getName() {
        return name;
    }

    public void setName(IngredientNameEnum name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
