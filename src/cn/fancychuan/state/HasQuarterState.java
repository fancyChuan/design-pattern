package cn.fancychuan.state;

public class HasQuarterState implements State {
    GumballMachine2 gumballMachine;

    public HasQuarterState(GumballMachine2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("[x]已投入硬币，不允许再次投入");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("[x]正在退换硬币");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("[x]已转动把柄");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("[x]No gumball dispensed");
    }
}
