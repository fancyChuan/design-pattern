package cn.fancychuan.decorator;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso(); // 订了一杯Espresso，还没有加调料
        System.out.println(beverage.getDesc() + ": $" + beverage.cost());

        // 装饰器模式说白了其实就是把订单对象传到一个类中做计算，返回的对象类型也不改变。
        beverage = new Mocha(beverage); // 加了Mocha
        beverage = new Mocha(beverage); // 双倍摩卡
        beverage = new Whip(beverage);
        beverage = new Soy(beverage);
        System.out.println("最后的订单：\n" + beverage.getDesc() + ": $" + beverage.cost());

    }
}
