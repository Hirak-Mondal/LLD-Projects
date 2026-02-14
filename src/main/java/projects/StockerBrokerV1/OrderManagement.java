package projects.StockerBrokerV1;

import java.util.HashMap;
import java.util.SimpleTimeZone;

public class OrderManagement {
    HashMap<Stock, String> orderHistory = new HashMap<>();
    StockManagement stockManagement = new StockManagement();

    public void buyStock(Stock stock, User user){
        Stock data = stockManagement.getStockData(stock.getName());
        if(data.getQuantity() >= stock.getQuantity() && data.getPrice() <= stock.getPrice()){

        }
    }
    public void sellStock(Stock stock, User user){
        Stock data = stockManagement.getStockData(stock.getName());

    }
}
