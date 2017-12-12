package ua.training.view;

import java.util.ResourceBundle;

public class View {

    public ResourceBundle bundle;

    public ResourceBundle getBundle() {
        return bundle;
    }

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public void printlnMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void println(Object o) {
        System.out.print(o);
    }
}
