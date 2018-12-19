package cn.fancychuan.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        // 抽象类、接口、父类在这个地方的作用就显现出来了 NYStyleCheesePizza、NYStyleClamPizza是两个不同的类，而函数最后又需要返回一个pizza对象
        // 唯一能够做到的就是新建一个对象的时候把该对象向上转型为超类。这里是使用了 Pizza 这个抽象类
        // 抽象类不能直接新建对象，但能通过定义一个引用变量指向子类
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }

}
