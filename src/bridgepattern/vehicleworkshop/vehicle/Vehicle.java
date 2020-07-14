package bridgepattern.vehicleworkshop.vehicle;

import bridgepattern.vehicleworkshop.workshop.WorkShop;

public abstract class Vehicle {

    protected WorkShop workShop1;
    protected WorkShop workShop2;

    protected Vehicle(WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    public abstract void manufacture();
}

