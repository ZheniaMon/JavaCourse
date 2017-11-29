package ua.training;

public class View {

    public static final String OPEN_SQUARE_BRACKET = "[";
    public static final String CLOSE_SQUARE_BRACKET = "]";
    public static final String SPACE = " ";
    //public static final String EQUAL = "=";

    public static final String GUESSED_MESSAGE = "Guessed";
    public static final String NUMBER_MORE = "Number more";
    public static final String NUMBER_LESS = "Number less";
    public static  final String INPUT_NUMBER = "Enter number";
    public static  final String TOTAL_ATTEMPTS = "Total attempts:";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWin(Model model) {
        printMessage(GUESSED_MESSAGE + SPACE + model.getNumber());
    }

    public void printRange(Model model) {
        printMessage(OPEN_SQUARE_BRACKET + model.getMinNumber() + SPACE + model.getMaxNumber() + CLOSE_SQUARE_BRACKET);
    }

    public void printWrongInput() {
        printMessage(WRONG_INPUT_INT_DATA);
    }
}
