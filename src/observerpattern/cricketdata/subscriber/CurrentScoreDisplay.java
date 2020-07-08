package observerpattern.cricketdata.subscriber;

import observerpattern.cricketdata.CricketMessage;
import observerpattern.cricketdata.Display;
import observerpattern.cricketdata.publisher.Publisher;

public class CurrentScoreDisplay implements Subscriber, Display {

    private int runs;
    private int wickets;
    private double overs;

    @Override
    public void display() {
        System.out.println("\nCurrent Score Display:\n"
                + "Runs: " + runs +
                "\nWickets:" + wickets +
                "\nOvers: " + overs );
    }

    @Override
    public void update(Publisher p, CricketMessage m) {
        if(m==null) {
            m=p.getMessage();
        }
        this.runs = m.getRuns();
        this.overs = m.getOvers();
        this.wickets = m.getWickets();
        display();
    }
}
