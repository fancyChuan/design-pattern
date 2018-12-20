package cn.fancychuan.sigleton;

/**
 * 2. 立马创建实例，不使用延迟实例化的做法
 */
public class Singleton1 {
    // 在静态初始化器中创建单例，利用JVM在加载这个类时马上创建一个实例。
    // 下面这行代码可以保证线程安全。
    private static Singleton1 uniqueInstance = new Singleton1();

    private Singleton1() {}

    private static Singleton1 getInstance() {
        return uniqueInstance;
    }
}
