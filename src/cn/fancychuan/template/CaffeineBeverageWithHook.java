package cn.fancychuan.template;

public abstract class CaffeineBeverageWithHook { // 高级组件，控制这算法，在需要的时候调用子类方法，也就是由子类实现的抽象方法

    final void prepareRecipe() {
        boilWater();
        brew();
        pourIncup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        System.out.println("制作完毕");

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("正在煮水...");
    }

    void pourIncup() {
        System.out.println("倒进杯子...");
    }

    boolean customerWantsCondiments() {
        return true; // 钩子函数，默认实现
    }

}
