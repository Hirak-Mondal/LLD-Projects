package projects.StockerBrokerV1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class UserManagement {
    HashMap<String, User> userHashMap = new HashMap<>();

    public void addUser(User user){
        if(userHashMap.containsKey(user.getName()))
            throw new IllegalArgumentException("User with same name exists");
        userHashMap.put(user.getName(), user);
    }
    public void depositMoney(User user, double amount){
        deposit(user.getName(), amount);
    }
    public void deposit(String name, double amount){
        if(!userHashMap.containsKey(name))
            throw new IllegalArgumentException("User doesn't exists");
        User user = userHashMap.get(name);
        user.setBalance(user.getBalance()+amount);
    }
    public void withdrawalMoney(User user, double amount){
        withdrawal(user.getName(), amount);
    }
    public void withdrawal(String name, double amount){
        if(!userHashMap.containsKey(name))
            throw new IllegalArgumentException("User doesn't exists");
        User user = userHashMap.get(name);
        if(user.getBalance() < amount)
            throw new IllegalArgumentException("User doesn't have enough balance");
        user.setBalance(user.getBalance()-amount);
    }
    public boolean checkUserHaveStock(User user, Stock stock){
        return false;
    }

}
