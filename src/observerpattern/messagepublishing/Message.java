package observerpattern.messagepublishing;

/**
 * Immutable object so that no Object can modify its content.
 */
public class Message {

    private final String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessageContent() {
        return message;
    }
}
