package cn.fancychuan.template;

/**
 * 20181230： 模版方法模式
 *
 * 钩子：声明在抽象类中的方法，但只有空的或者默认的实现。钩子的存在，允许子类有能力对算法的不同点进行挂钩。（子类可以覆盖也可以不实现）
 *      一般钩子函数用在模版方法中，只是更灵活的让子类去自定义
 *
 * 这个模式用到了：
 *      好莱坞原则：别调用高级组件（父类）、让高级组件调用低级组件（子类） 见 CaffeineBeverageWithHook
 *                子类只是用来提供一些实现细节
 *
 *
 */
public class Main {

    public static void testTeaCoffee() {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

    public static void testHook() {
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }

    public static void main(String[] args) {
        // testTeaCoffee();
        testHook();
    }
}
