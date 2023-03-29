package org.example.repository;

import org.example.entityes.Dough;

import java.util.ArrayList;

public class DoughRepository {
    private ArrayList<Dough> doughs = new ArrayList<>();

/*
 * Принцип единственной ответственности нарушается в методе getDoughByName,
 * который выполняет несколько задач:
 * 1. нахождение теста по имени
 * 2. удаление этого теста из списка.
 *  Это усложняет поддержку кода и увеличивает вероятность ошибок.
 * 
 * Идеи по улучшению кода:
 * 
 * Вынести метод удаления теста из списка в отдельный метод, чтобы метод
 * getDoughByName выполнял только одну задачу.
 */
    public Dough getDoughByName(String name) {
        for (Dough dough : doughs) {
            if (dough.getName().equals(name)) {
                doughs.remove(dough);
                return dough;
            }
        }
        return null;
    }

    public boolean addDough(Dough dough) {
        for(Dough d : doughs) {
            if(d.getName().equals(dough.getName())) return false;
        }
        doughs.add(dough);
        return true;
    }
}
