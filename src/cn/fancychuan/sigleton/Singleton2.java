package cn.fancychuan.sigleton;

/**
 * 3. 使用“双重检查加锁”，在getInstance()中减少使用同步
 */
public class Singleton2 {
    private volatile static Singleton2 uniqueInstance; // volatile 确保共享对象uniqueInstance的可见性

    private Singleton2() {}

    private static Singleton2 getInstance() {
        if (uniqueInstance == null) { // 不存在实例才进入同步区块
            synchronized (Singleton2.class) {
                if (uniqueInstance == null) { // 进入区块后，再检查一次，为null才创建实例
                    uniqueInstance = new Singleton2();
                }

            }
        }
        return uniqueInstance;
    }
}
