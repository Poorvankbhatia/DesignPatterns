package observerpattern.messagepublishing.subject;

import observerpattern.messagepublishing.Message;
import observerpattern.messagepublishing.observers.Observer;

public interface Subject {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    /**
     * Push method.(Publisher pushes to subscriber.)
     */
    void notifyObservers(Message m);

    /**
     * Pull method.(Subscribers pull from publisher)
     */
    void notifyObservers();

    Message getMessage();
}
