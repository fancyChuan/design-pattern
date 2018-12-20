package cn.fancychuan.sigleton;

public class Singleton {
    private static Singleton uniqueInstance; // TODO:因为uniqueInstance被声明为 static，所以是全局共享的？

    private Singleton() { // 构造器被声明为私有的
        getInstance();
    }
    public static synchronized Singleton getInstance() { // 方法也是静态的，可以在任何地方通过 Singleton.getInstance() 得到实例，跟全局变量一样
        // synchronized可以保证在同一个时刻，只有一个线程可以执行某个方法或者某个代码块.从而避免多线程对单例模式造成的影响。
        // 但会造成性能下降，其实只有第一次实例化的时候需要避免
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
