package ua.training;

public class Main {
    public static void main(String[] args) {
        Tasks concreteAggregate = new Tasks();
        Iterator iterator = concreteAggregate.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(iterator.first());

    }
}
