package statepattern.gumballmachine.states;

import statepattern.gumballmachine.GumballMachine;

public class NoQuarterState implements State {

    GumballMachine gumballMachine;


    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter inserted.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned but no quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("Pay First.");
    }
}
