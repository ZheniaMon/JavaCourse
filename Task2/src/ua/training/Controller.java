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

        model.setIndex(getIndexWithScanner(sc));
        model.setIndexList(getIndexList(model.getArray(), model.getIndex()));

        view.printArray(model.getIndexList());
        view.printNumber(model.getIndex());
    }

    public int getIndexWithScanner(Scanner sc) {
        while( ! sc.hasNextInt() ) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int[] getIndexList(int[] array, int index) {

        int k = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == index) {
                k++;
            }
        }

        int[] indexArray = new int[k];
        k = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == index) {
                indexArray[k] = i;
                k++;
            }
        }

        return indexArray;
    }
}
