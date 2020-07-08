package decoratorpattern.phonemodels.decorators;

import decoratorpattern.phonemodels.phone.Phone;

public class IPhoneDecorator extends PhoneDecorator {

    private Phone phone;

    public IPhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String getFeatures() {
        return phone.getFeatures()+" iphone features.";
    }
}
