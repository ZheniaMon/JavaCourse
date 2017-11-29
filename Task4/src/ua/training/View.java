package ua.training;

public class View {
    public static final String WRONG_INPUT = "Wrong input!";
    public static final String DATA_SAVED = "Data saved";
    public static final String ENTER_SURNAME = "Enter surname";
    public static final String ENTER_LOGIN = "Enter login";
    public static final String ENTER_EMAIL = "Enter email";
    public static final String ENTER_PHONE_NUMBER = "Enter phone number(xxx-xxx-xxxx)";
    public static final String WRONG_INPUT_LOGIN = "Login is already exist, please enter another login";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
