package statepattern.courierdelivery.states;

import statepattern.courierdelivery.DeliveryContext;

public class InTransition implements PackageState {

    private static InTransition instance;

    private InTransition() {
    }

    public static InTransition getInstance() {
        if(instance==null) {
            synchronized (InTransition.class) {
                if(instance==null) {
                    instance = new InTransition();
                }
            }
        }
        return instance;
    }

    @Override
    public void updateState(String packageId, DeliveryContext deliveryContext) {
        System.out.println("In transition - " + packageId);
        deliveryContext.setCurrentState(OutForDelivery.getInstance());
    }
}
