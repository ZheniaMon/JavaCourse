package ua.training;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(1200, "Dude");
        System.out.println(human);

        Human copy = (Human) human.copy();
        System.out.println(copy);
        System.out.println(human == copy);
        System.out.println(human.equals(copy));

        HumanFactory humanFactory = new HumanFactory(human);
        Human human1 = humanFactory.makeCopy();
        System.out.println(human1);

        humanFactory.setPrototype(new Human(-10, "A"));
        Human human2 = humanFactory.makeCopy();
        System.out.println(human2);

    }
}
