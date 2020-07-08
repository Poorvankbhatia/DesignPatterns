package observerpattern.cricketdata.publisher;

import observerpattern.cricketdata.CricketMessage;
import observerpattern.cricketdata.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class CricketDataPublisher implements Publisher {

    private final List<Subscriber> subscribers;
    private CricketMessage message;

    public CricketDataPublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        System.out.println("Removing - " + s.toString());
        int index = subscribers.indexOf(s);
        if (index>=0) {
            subscribers.remove(s);
        }
    }

    @Override
    public void notifySubscribers(CricketMessage m) {
        for (Subscriber s : subscribers) {
            s.update(this, m);
        }
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(this, null);
        }
    }

    @Override
    public void update(CricketMessage m) {
        this.message = m;
        notifySubscribers(m);
    }

    public CricketMessage getMessage() {
        return message;
    }
}
