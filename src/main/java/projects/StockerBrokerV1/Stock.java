package projects.StockerBrokerV1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stock {
    String name;
    Integer quantity = 0;
    Double price;

    @Override
    public String toString() {
        return "Stock name= " + name + ", amount= " + price + " , quantity = " + quantity;
    }
}
