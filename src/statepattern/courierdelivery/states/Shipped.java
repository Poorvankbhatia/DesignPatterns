package statepattern.courierdelivery.states;

import statepattern.courierdelivery.DeliveryContext;

public class Shipped implements PackageState {

    private static Shipped instance;

    private Shipped() {
    }

    public static Shipped getInstance() {
        if(instance==null) {
            synchronized (Shipped.class) {
                if(instance==null) {
                    instance = new Shipped();
                }
            }
        }
        return instance;
    }

    @Override
    public void updateState(String packageId, DeliveryContext deliveryContext) {
        System.out.println("Shipped " + packageId);
        deliveryContext.setCurrentState(InTransition.getInstance());
    }
}
