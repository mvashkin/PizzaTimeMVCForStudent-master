package org.example.serviceis;

import org.example.entityes.Ingredient;
import org.example.entityes.Menu;
import org.example.entityes.Pizza;
import org.example.repository.IngredientRepository;

import java.util.List;

public class PizzaService {
    private IngredientRepository repository;

    public PizzaService(IngredientRepository repository) {
        this.repository = repository;
    }

/*
 * Нарушением SOLID принципов:
 * 
 * Принцип единственной ответственности не соблюдается, так как метод getPizzaPrice 
 * выполняет сразу две задачи:
 *  1. получение ингредиентов из хранилища 
 *  2. вычисление цены пиццы. 
 * Это усложняет поддержку кода и увеличивает вероятность ошибок.
 * 
 * Идеи по улучшению кода:
 * Разбить метод на два более мелких метода, каждый из которых будет отвечать за
 * конкретную задачу. Например, метод getIngredientsByNames может быть вынесен в
 * отдельный сервис.
 * 
 * Добавить проверку наличия ингредиентов на складе, чтобы улучшить
 * читабельность кода и соблюсти принцип SRP.
 */
    public Integer getPizzaPrice(Pizza pizza) {
        int price = 0;
        List<Ingredient> ingredients = repository.getAndDeleteIngredientsByNames(pizza.getListOfIngredients());
        if (ingredients.isEmpty()) return null;
        for (Ingredient i : ingredients) {
            price += i.getPrice();
        }
        return price;
    }

    public Pizza getPizzaByName(String name) {
        return Menu.valueOf(name).getPizza();
    }
}
