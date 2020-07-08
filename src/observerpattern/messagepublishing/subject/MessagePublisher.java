package observerpattern.messagepublishing.subject;

import observerpattern.messagepublishing.Message;
import observerpattern.messagepublishing.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    List<Observer> observers;
    Message message;

    public MessagePublisher() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        System.out.println("Removing -" + o.toString());
        int index = observers.indexOf(o);
        if (index>=0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers(Message m) {
        for (Observer o : observers) {
            o.update(this, m);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this, null);
        }
    }

    public void update(Message m) {
        this.message = m;
        notifyObservers(m);
        /**
         * For pull: notifyObservers()
         */
    }

    public Message getMessage() {
        return message;
    }
}
