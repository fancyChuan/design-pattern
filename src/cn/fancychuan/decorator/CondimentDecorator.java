package cn.fancychuan.decorator;

public abstract class CondimentDecorator extends Beverage { // 这里用到继承是为了装饰者和被装饰者是同一种类型，继承的是类型，而不是行为

    // 所以也需要用抽象类型，并且需要覆盖掉超类的getDesc方法，因为我们不需要继承行为
    public abstract String getDesc();
}