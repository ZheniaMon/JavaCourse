package ua.training.controller;

import ua.training.view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import static ua.training.model.constants.ViewConstants.*;

/**
 * класс содержит методы считывания данных
 */

public class InputController {
    private View view;
    private Scanner scanner;

    public InputController(View view) {
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void chooseLanguage() {
        view.println(CHOOSE_LANGUAGE);
        view.println(NEW_LINE);
        view.println(USER_INPUT);
        view.setBundle(ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale(inputStringWithScanner(scanner))));
    }

    public int chooseKnight() {
        view.println(NEW_LINE);
        view.println(view.getBundle().getString(SELECT_KNIGHT));
        view.println(USER_INPUT);
        return inputIntValueWithScanner(scanner);
    }

    public int getIntRange() {
        view.println(NEW_LINE);
        view.println(USER_INPUT);
        return inputIntValueWithScanner(scanner);
    }

    public String inputStringWithScanner(Scanner scanner) {
        while(! scanner.hasNextLine()) {
            view.printMessage(view.getBundle().getString(WRONG_INPUT));
            scanner.next();
        }

        return scanner.nextLine();
    }

    public int inputIntValueWithScanner(Scanner scanner) {
            while (!scanner.hasNextInt()) {
                view.println(view.getBundle().getString(WRONG_INPUT));
                scanner.next();
            }
        return scanner.nextInt();
    }

}
