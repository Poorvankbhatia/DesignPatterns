package templatepattern.giftordering;

public class StoreOrder extends OrderProcessingTemplate {
    @Override
    public void doSelect() {
        System.out.println("Selecting offline");
    }

    @Override
    public void doPayment() {
        System.out.println("Paying offline");
    }

    @Override
    public void doDelivery() {
        System.out.println("delivery offline");
    }
}
