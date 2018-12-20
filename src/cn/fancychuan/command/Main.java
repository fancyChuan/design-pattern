package cn.fancychuan.command;

public class Main {

    public static void testSimpleControl() {
        SimpleControlTest remote = new SimpleControlTest();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }

    public static void main(String[] args) {
        testSimpleControl();
    }
}
