package cn.fancychuan.state;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("you can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("you inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("quarter retured");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("you haven't inserted a quarter");
        } else if (state == SOLD) {
            System.out.println("sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("you can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("you turned...");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("you turned but there's no quarter");
        } else if (state == SOLD) {
            System.out.println("turning twice doesn't get you another gumball");
        } else if (state == SOLD_OUT) {
            System.out.println("you turned but there's no gumballs");
        }
    }

    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("no gumball dispensed");
        } else if (state == NO_QUARTER) {
            System.out.println("you need to pay first");
        } else if (state == SOLD) {
            System.out.println("a gumball comes rolling out the slot");
            count -= 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
            } else {
                state = NO_QUARTER;
            }
        } else if (state == SOLD_OUT) {
            System.out.println("no gumball dispensed");
        }
    }

    public void setState(int state) {
        this.state = state;
    }
}
