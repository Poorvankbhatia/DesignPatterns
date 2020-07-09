package statepattern.courierdelivery.states;

import statepattern.courierdelivery.DeliveryContext;

public class OutForDelivery implements PackageState {

    private static OutForDelivery instance;

    public OutForDelivery() {
    }

    public static OutForDelivery getInstance() {
        if(instance==null) {
            synchronized (OutForDelivery.class) {
                if(instance==null) {
                    instance = new OutForDelivery();
                }
            }
        }
        return instance;
    }

    @Override
    public void updateState(String packageId, DeliveryContext deliveryContext) {
        System.out.println("Out for delivery - " + packageId);
        deliveryContext.setCurrentState(Delivered.getInstance());
    }
}
