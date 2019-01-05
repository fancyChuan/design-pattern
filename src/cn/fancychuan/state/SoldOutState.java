package cn.fancychuan.state;

public class SoldOutState implements State {
    GumballMachine2 gumballMachine;

    public SoldOutState(GumballMachine2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("[x]没有糖果了，请等待工作人员填充后再投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("[x]你并未投币，暂无法退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("[x]转动把柄，但没有糖果了");
    }

    @Override
    public void dispense() {
        System.out.println("[x]没有糖果可以发放");
    }
}
