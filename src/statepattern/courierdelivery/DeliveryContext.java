package statepattern.courierdelivery;

import statepattern.courierdelivery.states.Acknowledged;
import statepattern.courierdelivery.states.PackageState;

public class DeliveryContext {

    private String packageId;
    private PackageState currentState;

    public DeliveryContext(String packageId, PackageState packageState) {

        this.packageId = packageId;
        if (packageState==null) {
            this.currentState = Acknowledged.getInstance();
        } else {
            this.currentState = packageState;
        }
    }

    public String getPackageId() {
        return packageId;
    }

    public PackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public void update() {
        this.currentState.updateState(packageId, this);
    }
}
