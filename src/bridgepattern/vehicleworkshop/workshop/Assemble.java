package bridgepattern.vehicleworkshop.workshop;

public class Assemble implements WorkShop {
    @Override
    public void work() {
        System.out.println("Assembled.");
    }
}
