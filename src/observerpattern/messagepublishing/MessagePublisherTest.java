package observerpattern.messagepublishing;

import observerpattern.messagepublishing.observers.MessageSubscriber1;
import observerpattern.messagepublishing.observers.MessageSubscriber2;
import observerpattern.messagepublishing.subject.MessagePublisher;

public class MessagePublisherTest {

    public static void main(String[] args) {
        MessagePublisher messagePublisher = new MessagePublisher();
        MessageSubscriber1 messageSubscriber1 = new MessageSubscriber1();
        MessageSubscriber2 messageSubscriber2 = new MessageSubscriber2();
        messagePublisher.addObserver(messageSubscriber1);
        messagePublisher.addObserver(messageSubscriber2);
        messagePublisher.update(new Message("Hello"));

        messagePublisher.removeObserver(messageSubscriber1);
        messagePublisher.update(new Message("Hello Again"));
    }

}
