package observerpattern.weatherstation.display;

import observerpattern.weatherstation.subject.Subject;

/**
 * All the weather components implements the Observer interface. It gives subject a common interface to talk to when
 * it comes to updating the observers.
 */
public interface Observer {

    /**
     *
     * @param s : Subject that sent the notification is passed as an argument. (For pulling data.)
     * @param o : Date Object passed to notifyObservers . Its null if empty.
     */
    void update(Subject s, Object o);

    void stopSubscription();

}
