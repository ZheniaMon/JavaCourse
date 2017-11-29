package ua.training;

public class View {

    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public void printNumber(int number) {
        System.out.println(number);
    }
}
