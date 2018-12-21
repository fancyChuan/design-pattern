package cn.fancychuan.command;

public class Main {

    public static void testSimpleControl() {
        SimpleControlTest remote = new SimpleControlTest();
        Light light = new Light("bedroom");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }


    public static void testRemoteControl() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("living room");
        Stereo stereo = new Stereo();

        // 配置功能到命令对象
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

        // 把命令对象匹配到插槽开关上
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOn, new NoCommand());

        System.out.println(remoteControl);

        // 模拟打开开关
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
    }

    public static void main(String[] args) {
        // testSimpleControl();
        testRemoteControl();
    }
}
