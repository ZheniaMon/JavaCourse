package ua.training;

import java.util.Scanner;

public class Controller {

    Model model;
    View view;

    /**
     * <p>конструктор класса Controller</p>
     * @param model объект класса Model
     * @param view объект класса View
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * <p>метод поочередно вызывает методы считывания фамилии, логина, почты и телефона</p>
     */
    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        readSurname(scanner);
        readLogin(scanner);
        readEmail(scanner);
        readPhoneNumber(scanner);

        view.printMessage(View.DATA_SAVED);
    }

    /**
     * <p>метод считывает и проверяет фамилию, если все правильно сохраняет её </p>
     * @param scanner объект класса Scanner
     */
    public void readSurname(Scanner scanner) {
        String surname;
        view.printMessage(View.ENTER_SURNAME);
        while(!model.checkSurname(surname = inputStringWithScanner(scanner))) {}
        model.setSurname(surname);
    }

    /**
     * <p>метод считывает и проверяет логин, если все правильно сохраняет её </p>
     * @param scanner объект класса Scanner
     */
    public void readLogin(Scanner scanner) {
        String login;
        view.printMessage(View.ENTER_LOGIN);
        try {
            while (!model.checkLogin(login = inputStringWithScanner(scanner))) { }
            model.setUserLogin(login);
        } catch(IllegalArgumentException e) {
            System.err.println(View.WRONG_INPUT_LOGIN);
            readLogin(scanner);
        }
    }

    /**
     * <p>метод считывает и проверяет введенный имейл, если все правильно сохраняет её </p>
     * @param scanner объект класса Scanner
     */
    public void readEmail(Scanner scanner) {
        String email;
        view.printMessage(View.ENTER_EMAIL);
        while(!model.checkEmail(email = inputStringWithScanner(scanner))) {}
        model.setUserEmail(email);
    }

    /**
     * <p>метод считывает и проверяет введенный номер телефона, если все правильно сохраняет её </p>
     * @param scanner объект класса Scanner
     */
    public void readPhoneNumber(Scanner scanner) {
        String phoneNumber;
        view.printMessage(View.ENTER_PHONE_NUMBER);
        while(!model.checkPhoneNumber(phoneNumber = inputStringWithScanner(scanner))) {}
        model.setUserPhoneNumber(phoneNumber);
    }

    /**
     * <p>метод считывает строку</p>
     * @param scanner объект класса Scanner
     * @return введеную строку
     */
    public String inputStringWithScanner(Scanner scanner) {
        while(! scanner.hasNextLine()) {
            view.printMessage(View.WRONG_INPUT);
            scanner.next();
        }

        return scanner.nextLine();
    }
}
