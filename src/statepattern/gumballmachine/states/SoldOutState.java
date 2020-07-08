package statepattern.gumballmachine.states;

import statepattern.gumballmachine.GumballMachine;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        if (gumballMachine.getCount()==0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            System.out.println("You get 2 gumballs.");
            this.gumballMachine.releaseBall();
            if(gumballMachine.getCount()>0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Out of gumballs.");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
