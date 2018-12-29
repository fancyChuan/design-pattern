package cn.fancychuan.template;

public class Tea extends CaffeineBeverage { // 继承抽象类，必须实现抽象方法，不然报错
    @Override
    void brew() {
        System.out.println("[x]浸泡茶...");
    }

    @Override
    void addCondiments() {
        System.out.println("[x]加入柠檬...");
    }
}
