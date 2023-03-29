package org.example.serviceis;

import org.example.entityes.Dough;
import org.example.repository.DoughRepository;
import org.example.view.GetDoughByNameResponse;

/*Этот код соответствует ООП и SOLID принципам */
public class DoughServices {
    private final DoughRepository doughRepository;

    public DoughServices(DoughRepository doughRepository) {
        this.doughRepository = doughRepository;
    }

    public GetDoughByNameResponse getDoughByName(String name) {
        Dough dough = doughRepository.getDoughByName(name);
        if(dough == null) {
            return new GetDoughByNameResponse(true, "Такой вид теста не найден", null);
        }
        return new GetDoughByNameResponse(false, null, dough);
    }

    public Boolean addDough(Dough dough) {
        return doughRepository.addDough(dough);
    }
}
