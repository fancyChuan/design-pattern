package cn.fancychuan.factory;

public class SimplePizzaFactory { // 把这些封装了以后，该工厂就可以有很多客户，订单系统、菜单系统都可以用

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
