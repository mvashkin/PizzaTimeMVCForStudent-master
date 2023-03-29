package org.example.view;

import org.example.entityes.Menu;
import org.example.entityes.Pizza;

/*Этот код соответствует ООП и SOLID принципам */
public class GetPizzaResponse {
    private String error;
    private String name;
    private Integer price;

    public GetPizzaResponse(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    public GetPizzaResponse(String error) {
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
