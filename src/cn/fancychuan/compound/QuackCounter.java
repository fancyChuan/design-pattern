package cn.fancychuan.compound;

/**
 * 统计鸭叫的次数，属于新加的功能，对于每个类来说，可以通过装饰者模式来达到目的
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack(); // 委托到这里真正执行，同时计数
        numberOfQuacks ++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
