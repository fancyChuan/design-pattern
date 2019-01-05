package cn.fancychuan.state;

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

    public static void main(String[] args) {
        testGumballMachine();
    }
}
