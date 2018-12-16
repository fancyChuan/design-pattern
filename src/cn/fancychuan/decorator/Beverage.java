package cn.fancychuan.decorator;

public abstract class Beverage {
    String desc = "不知道什么是饮料";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}
