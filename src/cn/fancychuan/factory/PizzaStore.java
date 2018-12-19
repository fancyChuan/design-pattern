package cn.fancychuan.factory;

public abstract class PizzaStore {
    // SimplePizzaFactory factory;

//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }

    public Pizza orderPizza(String type) { // 每个加盟店都会使用这个方法，甚至我们可以定位final类型，以防止子类覆盖
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
    // 抽象类可以包含抽象方法、普通方法
    // abstract修饰定义方法，只声明不实现
    abstract Pizza createPizza(String type); // 这是个抽象方法，所有继承这个类的子类都必须实现这个方法
}
