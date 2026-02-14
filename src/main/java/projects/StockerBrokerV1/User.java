package projects.StockerBrokerV1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class User {
    String name;
    List<Stock> stocks;
    List<Stock> orderHistory;
    Double balance = 0.0;
    public User(String name){
        this.name = name;
        this.orderHistory = new ArrayList<>();
        this.stocks = new ArrayList<>();
    }
}
