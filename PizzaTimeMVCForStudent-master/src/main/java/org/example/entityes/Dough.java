package org.example.entityes;

public class Dough {
// Этот код, соответствует основным принципам ООП и SOLID.
    private String name;
    private int price;

    public Dough(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
