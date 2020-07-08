package observerpattern.messagepublishing.observers;

import observerpattern.messagepublishing.Message;
import observerpattern.messagepublishing.subject.Subject;

public class MessageSubscriber2 implements Observer {
    @Override
    public void update(Subject subject, Message m) {
        if(m!=null) {
            System.out.println("MessagePublisher2 " + m.getMessageContent());
        } else {
            System.out.println("MessagePublisher2 " + subject.getMessage().getMessageContent());
        }
    }
}
