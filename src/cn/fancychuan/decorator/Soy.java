package cn.fancychuan.decorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .25;
    }
}
