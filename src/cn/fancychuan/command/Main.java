package cn.fancychuan.command;

/**
 * 20181226 命令模式
 *
 *      执行者只负责调用执行的命令，并不在乎要要调用的具体命令是啥
 *
 * 命令对象(接口)：execute() 负责执行请求、命令
 *
 * 每一个真实的命令对象实现接口的 execute() 并在方法体里面执行委托过来的真实对象，
 * 再让真实对象去执行他本身的各种命令。 相当于真实对象
 *
 * 最后再把真是的命令对象传递给遥控器，由遥控器发起请求，执行命令。
 *
 * 核心思想其实就是把真实的对象层层封装，然后不断传到下一层。
 * eg:
 *          通过构造器              通过setCommand方法
 *      Light -----> LightOnCommand --------> RemoteControl
 *
 * 更多用途：
 *      1. 工作队列：队列类与对象完全解耦，比如上一秒做财务计算，下一秒读取网络数据
 *      2. 日志记录：
 */
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

    public static void testMacroCommand() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("living room");
        Stereo stereo = new Stereo();

        // 配置功能到命令对象
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

        Command[] partOn = {lightOnCommand, stereoOn};
        // 创建宏命令
        MacroCommand partOnMacro = new MacroCommand(partOn);

        // 绑定到遥控器
        remoteControl.setCommand(0, partOnMacro, new NoCommand());

        // 按下遥控器 按钮0
        remoteControl.onButtonWasPressed(0);
    }

    public static void main(String[] args) {
        // testSimpleControl();
        // testRemoteControl();
        testMacroCommand();
    }
}
