package cn.fancychuan.template;

public class Coffee extends CaffeineBeverage { // 继承抽象类，必须实现抽象方法，不然报错
    @Override
    void brew() {
        System.out.println("[*]冲洗咖啡豆...");
    }

    @Override
    void addCondiments() {
        System.out.println("[*]加入糖和牛奶...");
    }
}
