package ua.training.human;

import ua.training.human.Activity;

public class Human {
    private Activity state;

    public void setState(Activity state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}
