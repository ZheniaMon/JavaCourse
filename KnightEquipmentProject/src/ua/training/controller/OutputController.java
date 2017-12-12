package ua.training.controller;

import ua.training.view.View;
import ua.training.model.Model;
import ua.training.model.enity.Knight;

import static ua.training.model.constants.ViewConstants.*;

/**
 * класс содержит методы вывода результатов функций
 */

public class OutputController {
    Model model;
    View view;

    public OutputController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public OutputController() {
    }

    public void getKnights() {
        view.println(view.getBundle().getString(KNIGHTS));
        view.println(NEW_LINE);
        view.println(model.getAllKnights());
    }

    public Knight getKnight(int id) {
        Knight knight = model.findKnightById(id);
        view.println(knight);
        return knight;
    }

    public void getEquipmentCost() {
        view.println(NEW_LINE);
        view.println(view.getBundle().getString(EQUIPMENT_COST));
        view.println(NEW_LINE);
        view.println(model.getEquipmentCost());
        view.println(NEW_LINE);
    }

    public void sortEquipment() {
        view.println(view.getBundle().getString(SORT_BY_WEIGHT));
        view.println(NEW_LINE);
        model.sortEquipment();
        view.println(model.getEquipment());
    }

}
