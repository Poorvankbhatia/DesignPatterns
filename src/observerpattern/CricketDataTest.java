package observerpattern;

import observerpattern.cricketdata.CricketMessage;
import observerpattern.cricketdata.publisher.CricketDataPublisher;
import observerpattern.cricketdata.subscriber.AverageScoreDisplay;
import observerpattern.cricketdata.subscriber.CurrentScoreDisplay;

public class CricketDataTest {

    public static void main(String[] args) {
        CricketDataPublisher publisher = new CricketDataPublisher();
        publisher.addSubscriber(new AverageScoreDisplay());
        publisher.addSubscriber(new CurrentScoreDisplay());
        publisher.update(new CricketMessage(56,3,2.8));
    }

}
