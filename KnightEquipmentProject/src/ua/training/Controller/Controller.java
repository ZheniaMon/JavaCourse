package ua.training.controller;

import ua.training.model.Equipment;
import ua.training.model.Model;
import ua.training.model.enity.Knight;
import ua.training.view.View;

import java.awt.image.Kernel;
import java.util.Scanner;

import static ua.training.model.constants.ViewConstants.ENTER_MAX_COST;
import static ua.training.model.constants.ViewConstants.ENTER_MIN_COST;
import static ua.training.model.constants.ViewConstants.NEW_LINE;

/**
 * Класс служит для установления связи между пользователем и моделью
 */

public class Controller {

    Model model;
    View view;

    private InputController inputController;
    private OutputController outputController;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        inputController = new InputController(view);
        outputController = new OutputController(model,view);
    }

    public void processUser() {
        inputController.chooseLanguage();
        outputController.getKnights();
        model.getKnightUtil().setKnight(outputController.getKnight(findKnight()));
        model.setEquipment(new Equipment(model.getKnightUtil().getKnightEquipment(model.getItemDao())));
        outputController.getEquipmentCost();
        outputController.sortEquipment();
        getItemsInRange();
    }

    public void getItemsInRange() {
        view.println(view.getBundle().getString(ENTER_MIN_COST));
        view.println(NEW_LINE);
        int min = inputController.getIntRange();
        view.println(view.getBundle().getString(ENTER_MAX_COST));
        view.println(NEW_LINE);
        int max = inputController.getIntRange();
        view.println(model.getEquipment().findEquipmentByCost(min, max));
    }

    public boolean checkKnight(int id) {
        for(Knight k : model.getAllKnights()) {
            if(id == k.getKnightId()) {
                return true;
            }
        }
        return false;
    }

    public int findKnight() {
        int id = inputController.chooseKnight();
        if(checkKnight(id)) {
            return id;
        }
        return inputController.chooseKnight();
    }

}
