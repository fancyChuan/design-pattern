package cn.fancychuan.adapter;

/**
 * 20181228 适配器模式 & 外观模式
 *
 * 火鸡-鸭案例：
 *      火鸡Turkey不能直接调用鸭MallardDuck的方法，写一个适配器实现接口Duck，那么该适配器就具有了Duck的行为。
 *      而该适配器通过构造器接受火鸡对象。
 *
 * * 适配器的本质是：让类A具有能够调用另一个类B的方法x的能力【通过接口实现，接口让一个类拥有另一个类的行为】，
 *      至于方法x里面具体实现了什么，由开发者自己决定
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
        Duck turkeyAdapter = new TurkeyAdapter(turkey); // 把火鸡传进适配器，就具备了调用鸭方法的能力
        Turkey duckAdapter = new DuckAdapter(duck); // 把鸭子传进去，具备了调用火鸡行为的能力

        System.out.println("===the turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("===the duck says...");
        testDuck(duck);

        System.out.println("===the turkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("===the duckAdapter says...");
        duckAdapter.gobble();
        duckAdapter.fly();

    }

    public static void main(String[] args) {
        testDuckDrive();
    }
}
