package chainofresponsibilitypattern;

import chainofresponsibilitypattern.processor.AuthenticationProcessor;
import chainofresponsibilitypattern.processor.DummyOAuthProcessor;
import chainofresponsibilitypattern.processor.DummyUsernamePasswordProcessor;

public class Client {

    public static void main(String[] args) {
        AuthenticationProcessor authenticationProcessor = new DummyOAuthProcessor(null);
        new DummyUsernamePasswordProcessor(authenticationProcessor).isAuthorized("abcdefg");
    }

}
