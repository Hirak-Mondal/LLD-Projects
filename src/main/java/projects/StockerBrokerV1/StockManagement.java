package projects.StockerBrokerV1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class StockManagement {
    HashMap<String, Stock> allStocks = new HashMap<>();

    public void addStocks(Stock stock){
        allStocks.put(stock.getName(), stock);
    }
    public void removeStock(Stock stock){
        allStocks.remove(stock.getName());
    }
    public void getAllStockData(){
        System.out.println(allStocks);
    }
    public void changePrice(Stock stock){
        Stock stock1 = allStocks.get(stock.getName());
        stock1.setPrice(stock.getPrice());
    }
    public Stock getStockData(String name){
        return allStocks.get(name);
    }
}
