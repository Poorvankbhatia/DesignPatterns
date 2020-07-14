package chainofresponsibilitypattern.processor;

public class DummyUsernamePasswordProcessor extends AuthenticationProcessor {

    public DummyUsernamePasswordProcessor(AuthenticationProcessor authenticationProcessor) {
        this.nextProcessor = authenticationProcessor;
    }

    @Override
    public boolean isAuthorized(String req) {
        if(req.length()>10) {
            System.out.println("Request processed by DummyUsernamePasswordProcessor.");
            return true;
        } else {
            if(this.nextProcessor!=null) {
                this.nextProcessor.isAuthorized(req);
            }
        }
        return false;
    }
}
