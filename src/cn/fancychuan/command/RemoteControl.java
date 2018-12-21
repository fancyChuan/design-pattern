package cn.fancychuan.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0; i<7; i++) {
            onCommands[i] = noCommand; // 这里的初始化有个技巧：为了防止按钮执行命令的时候出错，先全部填充为 空命令NoCommand 什么都不做
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }



    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i=0; i<onCommands.length; i++) {
            stringBuffer.append("[slot" + i + "]" + onCommands[i].getClass().getName() + "    "
                    + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
