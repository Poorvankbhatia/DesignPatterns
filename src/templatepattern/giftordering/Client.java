package templatepattern.giftordering;

public class Client {

    public static void main(String[] args) {
        OrderProcessingTemplate processingTemplate = new NetOrder();
        processingTemplate.processOrder();
        processingTemplate = new StoreOrder();
        processingTemplate.processOrder();
    }

}
