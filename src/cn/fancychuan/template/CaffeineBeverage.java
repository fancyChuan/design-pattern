package cn.fancychuan.template;

public abstract class CaffeineBeverage { // 使用抽象类，让子类更自由的决定抽象方法所实现的功能

    final void prepareRecipe() { // 模板方法：把步骤做了封装规定，同时允许子类实现各自的细节
        boilWater();
        brew();
        pourIncup();
        addCondiments();
    }

    abstract void brew(); // 抽象方法，延迟到子类中去实现

    abstract void addCondiments();

    void boilWater() {
        System.out.println("正在煮水...");
    }

    void pourIncup() {
        System.out.println("倒进杯子...");
    }

}
