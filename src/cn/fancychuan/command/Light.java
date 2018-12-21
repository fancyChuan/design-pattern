package cn.fancychuan.command;

public class Light {
    String location;

    public Light(String where) {
        this.location = where;
    }

    public void on() {
        System.out.println(location + " 灯亮啦~");
    }

    public void off() {
        System.out.println(location + " 关灯，我要睡觉哦饿了...");
    }
}
