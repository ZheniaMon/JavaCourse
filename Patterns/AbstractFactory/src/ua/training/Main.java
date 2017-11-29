package ua.training;

public class Main {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = new EnDeviceFactory();
        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.doubleClick();
        keyboard.print();
        touchpad.track(0, 0);
    }
}
