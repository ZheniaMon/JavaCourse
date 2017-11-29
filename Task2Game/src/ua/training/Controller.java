package ua.training;

import java.util.Scanner;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setNumber();

        while(!model.checkValue(inputNumberWithScanner(sc))) {}
      //  inputNumberWithScanner(sc);
        view.printWin(model);

    }
    public int inputNumberWithScanner(Scanner sc) {
        int result = 0;

        view.printRange(model);
        while(true) {
            while(! sc.hasNextInt()) {
                view.printWrongInput();
                sc.next();
            }
            if( (result = sc.nextInt()) <= model.getMinNumber() || result >= model.getMaxNumber() ) {
                view.printWrongInput();
                continue;
            }
            break;
        }

        return result;
    }
   /* public void inputNumberWithScanner(Scanner sc) {

        int attempts = 0;
        int min = Model.RAND_MIN;
        int max = Model.RAND_MAX;
        boolean process= true;
        while(process) {
            view.printMessage(View.INPUT_NUMBER);
            view.printRange(min, max);
            int input = sc.nextInt();
            while(input < Model.RAND_MIN | input > Model.RAND_MAX) {
                view.printMessage(View.WRONG_INPUT_INT_DATA);
                input = sc.nextInt();
            }
            if(model.getNumber() == input) {
                attempts++;
                view.printMessage(View.GUESSED_MESSAGE);
                view.printMessage(View.TOTAL_ATTEMPTS);
                view.printInt(attempts);
                process = false;
            } else if(model.getNumber() > input) {
                attempts++;
                view.printMessage(View.NUMBER_MORE);
                min = input;
            } else if(model.getNumber() < input) {
                attempts++;
                view.printMessage(View.NUMBER_LESS);
                max = input;
            }
        }
    }*/

}
