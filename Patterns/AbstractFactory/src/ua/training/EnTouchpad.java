package ua.training;

public class EnTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("X: " + deltaX + " Y: " + deltaY);
    }
}
