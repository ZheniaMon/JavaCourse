package ua.training.main;

import ua.training.controller.Controller;
import ua.training.model.Model;
import ua.training.view.View;

/**
 * клаас запуска приложения
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}

