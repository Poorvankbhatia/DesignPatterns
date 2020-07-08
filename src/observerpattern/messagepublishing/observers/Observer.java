package observerpattern.messagepublishing.observers;

import observerpattern.messagepublishing.Message;
import observerpattern.messagepublishing.subject.Subject;

public interface Observer {

    void update(Subject subject, Message m);

}
