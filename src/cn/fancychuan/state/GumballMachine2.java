package cn.fancychuan.state;

public class GumballMachine2 implements State {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine2(int numberGumball) {
        this.count = numberGumball;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        if (numberGumball > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void dispense() {
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("[x]糖果正在从卡槽中滚出...");
        if (count != 0) {
            count -= 1;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
