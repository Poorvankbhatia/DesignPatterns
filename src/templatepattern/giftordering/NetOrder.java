package templatepattern.giftordering;

public class NetOrder extends OrderProcessingTemplate {
    @Override
    public void doSelect() {
        System.out.println("Selecting online");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment online");
    }

    @Override
    public void doDelivery() {
        System.out.println("delivery online");
    }

    @Override
    public boolean isGift() {
        System.out.println("Gift option not available online.");
        return false;
    }
}
