package projects.RideSharingApp;

import lombok.Setter;
import org.springframework.security.core.parameters.P;
import projects.RideSharingApp.FareService.FareStrategy;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingSystem {
    private final List<Driver> availableDrivers = new ArrayList<>();

    public void addDriver(Driver driver){
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy) throws InterruptedException {
        if(availableDrivers.isEmpty()){
            passenger.notify("No available driver present");
            return;
        }
        //find nearest driver available
        Driver driver = findNearestDriver(passenger.getLocation());

        //Mediator
        availableDrivers.remove(driver);
        Ride ride = new Ride(fareStrategy, driver, passenger, distance);
        passenger.notify("Ride scheduled with fare : " + ride.getFare());
        driver.notify("Your have a new ride request, with amount  :" + ride.getFare());

        //After sometime
        Thread.sleep(1000);
        //Change the status of the ride
        ride.updateStatus(RideStatus.ONGOING);

        //After ride completion
        Thread.sleep(5000);
        //add the driver after the ride is complete
        ride.updateStatus(RideStatus.COMPLETED);
        availableDrivers.add(driver);
    }

    private Driver findNearestDriver(Location passengerLocation){
        Driver assignedDriver = null;
        double minDistance = Double.MAX_VALUE;
        for(Driver driver : availableDrivers){
            double currentDistance = driver.getLocation().calculateDistance(passengerLocation);
            if(currentDistance < minDistance){
                minDistance = currentDistance;
                assignedDriver = driver;
            }
        }
        return assignedDriver;
    }
}
