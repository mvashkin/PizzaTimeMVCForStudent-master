package org.example;

import org.example.controller.VendingMachineController;
import org.example.entityes.Dough;
import org.example.entityes.Ingredient;
import org.example.entityes.IngredientNameEnum;
import org.example.repository.DoughRepository;
import org.example.repository.IngredientRepository;
import org.example.serviceis.DoughServices;
import org.example.serviceis.PizzaService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoughRepository doughRepository = new DoughRepository();
        IngredientRepository ingredientRepository = new IngredientRepository();

        doughRepository.addDough(new Dough(1, "1"));
        ingredientRepository.addIngredient(new Ingredient(IngredientNameEnum.CHEESE, 2));
        ingredientRepository.addIngredient(new Ingredient(IngredientNameEnum.SAUCE, 1));

        DoughServices doughServices = new DoughServices(doughRepository);
        PizzaService pizzaService = new PizzaService(ingredientRepository);

        VendingMachineController vendingMachineController = new VendingMachineController(doughServices, pizzaService);

        System.out.println(vendingMachineController.getDough("1"));
        System.out.println(Arrays.toString(vendingMachineController.getMenu()));
        System.out.println(vendingMachineController.getPizza("MARGARITA").getPrice());
        System.out.println(vendingMachineController.getPizza("MARGARITA").getError());
    }


}
