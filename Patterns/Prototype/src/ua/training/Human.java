package ua.training;

public class Human implements Copyable {
    int age;

    @Override
    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }

    String name;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human " + name + " age = " + age ;
    }


}
