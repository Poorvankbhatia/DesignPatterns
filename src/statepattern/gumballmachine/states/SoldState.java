package statepattern.gumballmachine.states;

import statepattern.gumballmachine.GumballMachine;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Gumball dispense in progress.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Already turned the crank. can't eject.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice. No effect.");
    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Out of gumballs.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
