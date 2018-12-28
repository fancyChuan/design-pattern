package cn.fancychuan.adapter;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        System.out.println("鸭子进行火鸡-叫");
    }

    @Override
    public void fly() {
        System.out.println("鸭子进行火鸡-飞");
    }
}
