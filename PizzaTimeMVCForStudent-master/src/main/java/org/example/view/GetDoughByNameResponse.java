package org.example.view;

import org.example.entityes.Dough;

/*Этот код соответствует ООП и SOLID принципам */
public class GetDoughByNameResponse {
    private final boolean error;
    private final String errorMessage;
    private final int price;

    public GetDoughByNameResponse(boolean error, String errorMessage, Dough dough) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.price = dough.getPrice();
    }

    @Override
    public String toString() {
        return "GetDoughByNameResponse{" +
                "error=" + error +
                ", errorMessage='" + errorMessage + '\'' +
                ", price=" + price +
                '}';
    }
}
