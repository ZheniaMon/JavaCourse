package oa.training;

import java.util.Scanner;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new  Scanner(System.in);

        model.setLine(inputStringValueWithScanner(sc));
        model.addLine(inputStringValueWithScanner(sc));

        view.printMessage(model.getLine());
    }

    public String inputStringValueWithScanner(Scanner sc) {

        String s = sc.nextLine();
        while( !(s.equals("Hello")  | s.equals("world!")) ) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            s = sc.next();
        }
        return s;
    }
}
