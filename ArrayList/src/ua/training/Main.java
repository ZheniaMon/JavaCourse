package ua.training;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> numbers = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        System.out.println(arrayList.get(0));

        for(Integer i : arrayList) {
            Integer temp = i;

            if(!numbers.containsKey(temp)) {
                numbers.put(temp,1);
            } else {
                numbers.put(temp, numbers.get(temp)+1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
