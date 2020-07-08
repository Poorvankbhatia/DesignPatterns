package templatepattern.giftordering;

public abstract class OrderProcessingTemplate {

    protected abstract void doSelect();

    protected abstract void doPayment();

    private void giftWrap() {
        System.out.println("Gift Wrap done.");
    }

    protected abstract void doDelivery();

    public final void processOrder() {

        doSelect();
        doPayment();
        if(isGift()) {
            giftWrap();
        }
        doDelivery();
    }

    public boolean isGift() {
        return true;
    }

}
