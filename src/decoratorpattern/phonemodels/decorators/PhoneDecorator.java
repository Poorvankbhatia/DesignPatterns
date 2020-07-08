package decoratorpattern.phonemodels.decorators;

import decoratorpattern.phonemodels.phone.Phone;

/**
 * It has a HAS-A relationship with the interface Phone as the Phone object must be accessible to all the child
 * decorators.
 */
public abstract class PhoneDecorator implements Phone {

}
