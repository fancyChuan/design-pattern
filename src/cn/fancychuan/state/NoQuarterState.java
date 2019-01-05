package cn.fancychuan.state;

public class NoQuarterState implements State {
    GumballMachine2 gumballMachine;

    public NoQuarterState(GumballMachine2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("[x]投入硬币");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("[x]你还没投入硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("[x]没有硬币，转动把柄无效");
    }

    @Override
    public void dispense() {
        System.out.println("[x]请先投入硬币");
    }
}
