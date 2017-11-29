package ua.training;

public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void doubleClick() {
        System.out.println("Double click");
    }

    @Override
    public void scroll(int direction) {
        if(direction > 0) {
            System.out.println("Scroll top");
        } else {
            System.out.println("Scroll down");
        }
    }
}
