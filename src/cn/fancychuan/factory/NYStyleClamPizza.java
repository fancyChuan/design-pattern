package cn.fancychuan.factory;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "纽约风格clam披萨";

        toppings.add("二级奶酪");
    }

    @Override
    public void prepare() {

    }
}
