package chainofresponsibilitypattern.processor;

public abstract class AuthenticationProcessor {

    public AuthenticationProcessor nextProcessor;

    public abstract boolean isAuthorized(String req);

    @Override
    public String toString() {
        return "AuthenticationProcessor{" +
                "nextProcessor=" + nextProcessor +
                '}';
    }
}
