package decoratorpattern.phonemodels.decorators;

import decoratorpattern.phonemodels.phone.Phone;

public class AndroidPhone extends PhoneDecorator {

    private Phone phone;

    public AndroidPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String  getFeatures() {
        return phone.getFeatures() + " Android phone ";
    }
}
