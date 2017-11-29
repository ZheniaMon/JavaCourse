package ua.training;

import java.util.Random;

public class Model {

    private int number;
    private int maxNumber = 100;
    private int minNumber = 0;

    public boolean checkValue(int value) {
        if(value == getNumber()) {
            return true;
        } else if(value > getNumber()) {
            maxNumber = value;
        } else {
            minNumber = value;
        }
        return false;
    }

    public void setMaxAndMin(int maxNumber, int minNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setNumber() {

        this.number = rand(minNumber, maxNumber);

    }

    public int getNumber() {

        return number;
    }

    public int rand(int min, int max) {
        Random random = new Random();
        return min+random.nextInt(max - min + 1);
    }
}
