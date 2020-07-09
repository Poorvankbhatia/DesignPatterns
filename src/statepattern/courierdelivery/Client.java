package statepattern.courierdelivery;

public class Client {

    public static void main(String[] args) {
        DeliveryContext ctx = new DeliveryContext("PACKAGE_ID", null);

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }

}
