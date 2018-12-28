package cn.fancychuan.adapter;

/**
 * 20181228 适配器模式 & 外观模式
 *
 *
 */
public class Main {

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
    public static void testDuckDrive() {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("===the turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("===the duck says...");
        testDuck(duck);

        System.out.println("===the turkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    public static void main(String[] args) {
        testDuckDrive();
    }
}
