package projects.RideSharingApp;

import projects.RideSharingApp.FareService.StandardFare;
import projects.RideSharingApp.VehicleService.Bike;
import projects.RideSharingApp.VehicleService.Car;
import projects.RideSharingApp.VehicleService.Vehicle;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        Location loc1 = new Location(12.3434, 10.233);
        Location loc2 = new Location(34.654, 43.23);
        Location loc3 = new Location(1.432, 23.543);

        Vehicle car = new Car("CAR-123");
        Vehicle bike = new Bike("BIKE-987");

        Driver alice = new Driver(loc1, "Alice.123@test", "Alice", car);
        Driver bob = new Driver(loc2, "bob@123", "Bob", bike);

        Passenger john = new Passenger("John", loc3, "john@test");

        RideMatchingSystem rideMatchingSystem = new RideMatchingSystem();
        rideMatchingSystem.addDriver(alice);
        rideMatchingSystem.addDriver(bob);

        rideMatchingSystem.requestRide(john, 25, new StandardFare());
    }
}
