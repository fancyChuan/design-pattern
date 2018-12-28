package cn.fancychuan.adapter;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("=-我是mallard鸭");
    }

    @Override
    public void fly() {
        System.out.println("=-我在飞");
    }
}
