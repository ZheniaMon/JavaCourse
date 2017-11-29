package ua.training.human;

public class Work implements Activity {
    @Override
    public void doSomething(Human human) {
        System.out.println("Work");
        human.setState(new Rest());
    }
}
