package commandpattern.trading.commands;
import commandpattern.trading.stockfunctions.StockTrader;

public class StockBuyCommand implements Order {

    StockTrader stockTrader;

    public StockBuyCommand(StockTrader stockTrader) {
        this.stockTrader = stockTrader;
    }

    @Override
    public void execute() {
        stockTrader.buy();
    }
}
