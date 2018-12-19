package cn.fancychuan.factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Veggies veggies[];
    Cheese cheese;
    Clams clam;
    ArrayList toppings = new ArrayList();

//    public void prepare() {
//        System.out.println("=============");
//        System.out.println("准备做披萨啦：" + name);
//        System.out.print("要加东西了：");
//        for (int i=0; i<toppings.size(); i++) {
//            System.out.println(" " + toppings.get(i));
//        }
//    }

    public abstract void prepare();

    public void bake() {
        System.out.println("bake for 25 min at 350");
    }
    public void box() {
        System.out.println("please in box~ 打包啦");
    }

    public String getName() {
        return name;
    }
}
