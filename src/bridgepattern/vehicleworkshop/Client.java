package bridgepattern.vehicleworkshop;

import bridgepattern.vehicleworkshop.vehicle.Bike;
import bridgepattern.vehicleworkshop.vehicle.Car;
import bridgepattern.vehicleworkshop.vehicle.Vehicle;
import bridgepattern.vehicleworkshop.workshop.Assemble;
import bridgepattern.vehicleworkshop.workshop.Produce;

public class Client {

    public static void main(String[] args) {
        Vehicle car = new Car(new Produce(), new Assemble());
        car.manufacture();
        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.manufacture();
    }

}
