package projects.RideSharingApp.FareService;

import projects.RideSharingApp.VehicleService.Vehicle;

public interface FareStrategy {
    double calculateFare(Vehicle vehicle, double distance);
}
