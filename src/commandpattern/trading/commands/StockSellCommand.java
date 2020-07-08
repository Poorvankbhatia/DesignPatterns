package commandpattern.trading.commands;

import commandpattern.trading.stockfunctions.StockTrader;

public class StockSellCommand implements Order {

    StockTrader stockTrader;

    public StockSellCommand(StockTrader stockTrader) {
        this.stockTrader = stockTrader;
    }

    @Override
    public void execute() {
        stockTrader.sell();
    }
}
