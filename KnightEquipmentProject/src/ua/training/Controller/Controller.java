package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.enity.Knight;
import ua.training.view.View;
import static ua.training.model.constants.ViewConstants.*;

import java.util.Scanner;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        InputController inputController = new InputController(view);
        inputController.chooseLanguage();
        getKnights();
        getKnight(inputController.chooseKnight());
    }

    public void getKnights() {
        view.println(view.getBundle().getString(KNIGHTS));
        view.println(NEW_LINE);
        view.println(model.getKnightDao().findAll());
    }

    public void getKnight(int id) {
        Knight knight = model.getKnightDao().findById(id);
        view.println(knight);
        view.println(knight.getEquipment());
    }
}
