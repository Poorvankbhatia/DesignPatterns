package observerpattern.cricketdata.subscriber;

import observerpattern.cricketdata.CricketMessage;
import observerpattern.cricketdata.Display;
import observerpattern.cricketdata.publisher.Publisher;

public class AverageScoreDisplay implements Subscriber, Display {

    private double runRate;
    private int predictedScore;

    @Override
    public void update(Publisher p, CricketMessage m) {
        if(m==null) {
            m=p.getMessage();
        }
        this.runRate = m.getRuns()/m.getOvers();
        this.predictedScore =(int) (this.runRate*50);
        display();
    }

    @Override
    public void display() {
        System.out.println("\nAverage Score Display: \n"
                + "Run Rate: " + runRate +
                "\nPredictedScore: " +
                predictedScore);
    }
}
