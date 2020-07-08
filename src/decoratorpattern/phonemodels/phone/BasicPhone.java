package decoratorpattern.phonemodels.phone;

public class BasicPhone implements Phone {
    @Override
    public String getFeatures() {
        return "Basic Features.";
    }
}
