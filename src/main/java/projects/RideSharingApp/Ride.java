package projects.RideSharingApp;

import lombok.Getter;
import lombok.Setter;
import projects.RideSharingApp.FareService.FareStrategy;

@Getter
@Setter
public class Ride {
    private Passenger passenger;
    private Driver driver;
    private double distance;
    private double fare;
    private FareStrategy fareStrategy;
    private RideStatus status;

    public Ride(FareStrategy fareStrategy, Driver driver, Passenger passenger, double distance) {
        this.status = RideStatus.SCHEDULED;
        this.fareStrategy = fareStrategy;
        this.driver = driver;
        this.passenger = passenger;
        this.distance = distance;
        this.fare = getFare();
    }

    public double getFare(){
        return fareStrategy.calculateFare(driver.getVehicle(), distance);
    }

    public void updateStatus(RideStatus status){
        this.status = status;
        notifyUsers();
    }
    public void notifyUsers(){
        passenger.notify("Your ride is : " + status.toString());
        driver.notify("Ride status is : " + status.toString());
    }

}
