package projects.RideSharingApp;

public class Passenger extends User{
    public Passenger(String name, Location location, String email){
        super(name, location, email);
    }

    @Override
    public void notify(String msg){
        System.out.println(msg);
    }
}
