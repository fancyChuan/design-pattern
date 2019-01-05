package cn.fancychuan.state;

public class SoldState implements State {
    GumballMachine2 gumballMachine;

    public SoldState(GumballMachine2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("[x]我们已经为你准备好糖果了，请稍候再投硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("[x]抱歉，你已经转动把柄了");
    }

    @Override
    public void turnCrank() {
        System.out.println("[x]已转过把柄了");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("[x]没有糖果啦");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
