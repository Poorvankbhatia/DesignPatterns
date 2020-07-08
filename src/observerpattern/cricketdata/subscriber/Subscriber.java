package observerpattern.cricketdata.subscriber;

import observerpattern.cricketdata.CricketMessage;
import observerpattern.cricketdata.publisher.Publisher;

public interface Subscriber {

    void update(Publisher p, CricketMessage m);

}
