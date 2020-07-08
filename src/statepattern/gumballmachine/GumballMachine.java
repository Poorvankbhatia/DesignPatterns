package statepattern.gumballmachine;


import statepattern.gumballmachine.states.*;

/*
Context class.
 */
public class GumballMachine {

    State state;
    State noQuarterState;
    State hasQuarterState;
    State soldOutState;
    State soldState;
    State winnerState;
    int count = 0;

    public GumballMachine(int gumballs) {

        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);

        this.count = gumballs;
        if(this.count > 0) {
            this.state = noQuarterState;
        } else {
            this.state = soldOutState;
        }

    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense(); // We don't need a method for dispense, because its an internal action.
    }

    public void releaseBall(){
        System.out.println("ball released.");
        if(count!=0) {
            count = count-1;
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
