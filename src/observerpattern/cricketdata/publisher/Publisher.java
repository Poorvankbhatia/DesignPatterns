package observerpattern.cricketdata.publisher;

import observerpattern.cricketdata.CricketMessage;
import observerpattern.cricketdata.subscriber.Subscriber;

public interface Publisher {

    void addSubscriber(Subscriber s);

    void removeSubscriber(Subscriber s);

    void notifySubscribers(CricketMessage m);

    void notifySubscribers();

    void update(CricketMessage m);

    CricketMessage getMessage();

}
