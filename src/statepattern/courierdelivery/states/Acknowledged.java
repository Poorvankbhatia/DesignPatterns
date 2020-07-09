package statepattern.courierdelivery.states;

import statepattern.courierdelivery.DeliveryContext;

public class Acknowledged implements PackageState {

    private static Acknowledged instance;

    private Acknowledged() {
    }

    public static Acknowledged getInstance() {
        if(instance==null) {
            synchronized (Acknowledged.class) {
                if(instance==null) {
                    instance = new Acknowledged();
                }
            }
        }
        return instance;
    }

    @Override
    public void updateState(String packageId, DeliveryContext deliveryContext) {
        System.out.println("Acknowledged - " + packageId);
        deliveryContext.setCurrentState(Shipped.getInstance());
    }
}
