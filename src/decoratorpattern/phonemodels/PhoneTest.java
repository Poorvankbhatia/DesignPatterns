package decoratorpattern.phonemodels;

import decoratorpattern.phonemodels.decorators.AndroidPhone;
import decoratorpattern.phonemodels.decorators.IPhoneDecorator;
import decoratorpattern.phonemodels.phone.BasicPhone;
import decoratorpattern.phonemodels.phone.Phone;

public class PhoneTest {

    public static void main(String[] args) {

        Phone bp = new BasicPhone();
        bp = new IPhoneDecorator(bp);
        bp = new AndroidPhone(bp);
        System.out.println(bp.getFeatures());

    }

}
