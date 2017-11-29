package ua.training;

public class Main {
    public static void main(String[] args) {


        Singleton array[] = new Singleton[1000];
        for(int i = 0; i < 1000; i++) {
            array[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);

    }
}
