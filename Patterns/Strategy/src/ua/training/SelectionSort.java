package ua.training;

import java.util.Arrays;

public class SelectionSort implements Sorting {
    @Override
    public void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
