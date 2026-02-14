package projects.RideSharingApp;

import lombok.Getter;
import lombok.Setter;
import projects.RideSharingApp.VehicleService.Vehicle;

@Getter
@Setter
public class Driver  extends User {
    private Vehicle vehicle;

    public Driver(Location location, String email, String name, Vehicle vehicle) {
        super(name, location, email);
        this.vehicle = vehicle;
    }
    @Override
    public void notify(String msg){
        System.out.println(msg);
    }
}
