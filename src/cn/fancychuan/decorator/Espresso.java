package cn.fancychuan.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        desc = "Espresso"; // desc实例变量继承自父类Beverage
    }

    public double cost() {
        return 1.99;
    }
}
