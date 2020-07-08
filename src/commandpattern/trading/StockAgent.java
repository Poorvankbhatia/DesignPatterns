package commandpattern.trading;

import commandpattern.trading.commands.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker.
 */
public class StockAgent {

    List<Order> list;

    public StockAgent() {
        list = new ArrayList<>();
    }

    public void setOrder(Order order) {
        list.add(order);
    }

    public void placeOrder(Order order) {
        int index = list.indexOf(order);
        if(index>=0) {
            order.execute();
            list.remove(index);
        }
    }

    public void placeOrder() {
        for (Order o : list) {
            o.execute();
        }
    }
}
