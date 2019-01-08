package cn.fancychuan.state;

/**
 * 20190108 状态模式
 *
 * 这个模式的特点在于，把状态机的每一种状态都作为一个类封装起来。
 * 这样的好处在于有新增状态的时候，不需要更改原有的状态，准确的说只需要增加少量的代码
 * 因为，对于本案例来说，每个状态都有固定的4种操作，写好状态的转换逻辑，只需要修改其中一个状态的一个方法即可达到添加状态的目的。
 * 比如 HasQuarterState类 新增 WinnerState
 *
 * 状态的流转是通过状态类的一个方法实现的，每个状态类又接受真正的对象gumballMachine的委托去调用不同方法
 *
 */
public class Main {

    public static void testGumballMachine() {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }

    public static void testState() {
        GumballMachine2 gumballMachine = new GumballMachine2(12);

        for (int i=0; i<10; i++){
            System.out.println(gumballMachine);

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            System.out.println(gumballMachine);
        }
    }

    public static void main(String[] args) {
        // testGumballMachine();
        testState();
    }
}
