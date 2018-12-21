package cn.fancychuan.command;


public class CeilingFan {
    public static final int HIGHT = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public void hight() {
        speed = HIGHT;
    }
    public void medium() {
        speed = MEDIUM;
    }
    public void low() {
        speed = LOW;
    }
    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }


}
