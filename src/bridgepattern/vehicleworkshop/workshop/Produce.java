package bridgepattern.vehicleworkshop.workshop;

public class Produce implements WorkShop {
    @Override
    public void work() {
        System.out.println("Produced.");
    }
}
