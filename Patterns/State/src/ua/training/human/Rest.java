package ua.training.human;

public class Rest implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human human) {
        if(count < 3) {
            System.out.println("Zzzz");
            count++;
        } else {
            human.setState(new Work());
        }
    }
}
