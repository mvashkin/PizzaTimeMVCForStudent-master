package org.example.controller;

import org.example.entityes.Menu;
import org.example.entityes.Pizza;
import org.example.serviceis.DoughServices;
import org.example.serviceis.PizzaService;
import org.example.view.GetDoughByNameResponse;
import org.example.view.GetPizzaResponse;

public class VendingMachineController {

    private final DoughServices doughServices;
    private final PizzaService pizzaService;

    public VendingMachineController(DoughServices doughServices, PizzaService pizzaService) {
        this.doughServices = doughServices;
        this.pizzaService = pizzaService;
    }

    public GetDoughByNameResponse getDough(String name) {
        return doughServices.getDoughByName(name);
    }

    public Menu[] getMenu() {
        return Menu.values();
    }

    // Принцип единственной ответственности нарушается в методе getPizza,
    // так как он выполняет сразу несколько задач. Это
    // усложняет поддержку кода и делает его менее читабельным.
    /*
     * Идеи по улучшению кода:
     * Вынести методы получения пиццы по имени и получения цены пиццы в отдельные
     * сервисы, чтобы у каждого была только одна ответственность.
     */
    public GetPizzaResponse getPizza(String pizzaName) {
        Pizza pizza = pizzaService.getPizzaByName(pizzaName);
        Integer price = pizzaService.getPizzaPrice(pizza);
        if (price == null) return new GetPizzaResponse("Нет необходимых ингридиентов на складе");
        return new GetPizzaResponse(pizzaName, price);
    }
}
