package cn.fancychuan.command;

public class SimpleControlTest {
    Command slot;

    public SimpleControlTest() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
