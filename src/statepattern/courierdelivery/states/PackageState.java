package statepattern.courierdelivery.states;

import statepattern.courierdelivery.DeliveryContext;

public interface PackageState {

    void updateState(String packageId, DeliveryContext ctx);

}
