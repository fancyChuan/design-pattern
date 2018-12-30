package cn.fancychuan.template;

/**
 * 20181230： 模版方法模式
 *
 * 钩子：声明在抽象类中的方法，但只有空的活着默认的实现。钩子的存在，允许子类有能力对算法的不同点进行挂钩。
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
