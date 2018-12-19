package cn.fancychuan.factory;

/**
 * 20181219-工厂模式：通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的。也就是把要创建类的工作交给工厂
 *
 * 1. 披萨连锁店需要有两个类：披萨类、披萨店类
 * 2. 披萨类的职责是：封装定义生成各种风格的披萨
 * 3. 披萨店类的职责是：生成各个披萨分店，并实现各自的创建披萨对象工厂方法，由该工厂方法决定生成什么类型的披萨对象
 *
 * 工厂模式用到了“倒置原则”：以往的OO设计都是从上到下，而工厂模式是从具体类思考，从下往上，高层类只需要提供工厂方法取出具体类
 *
 * 【这种原则倒置了思考方式，需要细细品味！】
 */
public class Main {

    public static void testNYPizzaStore() { // 要在main函数中调用，而main函数是静态方法，所以这里也必须是静态方法

        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("-----");
        System.out.println("我拿到披萨咯: " + pizza.getName());
    }

    public static void main(String[] args) {
        testNYPizzaStore();
    }
}
