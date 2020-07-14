package chainofresponsibilitypattern.processor;

public class DummyOAuthProcessor extends AuthenticationProcessor {
    public DummyOAuthProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public boolean isAuthorized(String req) {
        if(req.length()>5) {
            System.out.println("Request processed by DummyOAuthProcessor.");
            return true;
        } else {
            if(this.nextProcessor!=null) {
                this.nextProcessor.isAuthorized(req);
            }
        }
        return false;
    }
}
