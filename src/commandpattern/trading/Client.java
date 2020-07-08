package commandpattern.trading;

import commandpattern.trading.commands.StockBuyCommand;
import commandpattern.trading.commands.StockSellCommand;
import commandpattern.trading.stockfunctions.StockTrader;

public class Client {

    public static void main(String[] args) {
        StockAgent stockAgent = new StockAgent();
        StockTrader stockTrader = new StockTrader();
        StockBuyCommand stockBuyCommand = new StockBuyCommand(stockTrader);
        StockSellCommand stockSellCommand = new StockSellCommand(stockTrader);
        stockAgent.setOrder(stockBuyCommand);
        stockAgent.setOrder(stockSellCommand);
        stockAgent.placeOrder();
    }

}
