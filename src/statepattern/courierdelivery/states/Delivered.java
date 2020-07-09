package statepattern.courierdelivery.states;

import statepattern.courierdelivery.DeliveryContext;

public class Delivered implements PackageState {

    private static Delivered instance;

    private Delivered() {
    }

    public static Delivered getInstance() {
        if(instance==null) {
            synchronized (InTransition.class) {
                if(instance==null) {
                    instance = new Delivered();
                }
            }
        }
        return instance;
    }


    @Override
    public void updateState(String packageId, DeliveryContext deliveryContext) {
        System.out.println("Delivered - " + packageId);
    }
}
