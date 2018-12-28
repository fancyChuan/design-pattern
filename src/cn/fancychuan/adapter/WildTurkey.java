package cn.fancychuan.adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("--golle golle 叫");
    }

    @Override
    public void fly() {
        System.out.println("-- 飞一小段距离");
    }
}
