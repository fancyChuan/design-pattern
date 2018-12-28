package cn.fancychuan.facade;

/**
 * 20181228 外观模式：
 *      提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用
 *
 * 目的：提供一个简化的接口
 *
 * 使用到了：“最小知识”原则 -> 减少对象之间的交互，不要让太多的类耦合在一起
 *      案例见方法： miniKnow()
 *
 */
public class Main {
    HomeTheaterFacade homeTheater; // 对象的一个组件

    public Main(HomeTheaterFacade homeTheater) {
        this.homeTheater = homeTheater;
    }

    public static void testHomeTheater() {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        TheaterLight light = new TheaterLight();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, light, screen);

        homeTheater.watchMovie("《我是一只小小鸟》");
    }

    // “最小知识”说明
    public void miniKnow(TheaterLight light) {
        testHomeTheater(); // 1. 对象本身的方法可以调用
        light.on(); // 2.被当成参数传进来的对象，其方法可以调用

        Amplifier amp = new Amplifier();
        amp.on(); // 3. 方法本身创建的对象，其方法可以调用
        homeTheater.watchMovie("xx"); // 4. 可以调用对象任何一个组件的任意方法

    }

    public static void main(String[] args) {
        testHomeTheater();
    }

}
