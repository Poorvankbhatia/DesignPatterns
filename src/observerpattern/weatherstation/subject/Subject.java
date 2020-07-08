package observerpattern.weatherstation.subject;

import observerpattern.weatherstation.display.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(Object arg); // Push objects to observers/ subscribers/ listeners.

    void notifyObservers(); // observers/ subscribers/ listeners will only be told if something is changed and then they would pull.

    /**
     * This gives more flexibility in how to update observers by allowing to optimize notifications.
     * For example if we only need to send updates when a particular condition is met and not always we can use this
     * flag
     */
    void setChanged();

}
