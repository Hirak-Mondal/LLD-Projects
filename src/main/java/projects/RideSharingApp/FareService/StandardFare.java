package projects.RideSharingApp.FareService;

import projects.RideSharingApp.VehicleService.Vehicle;

public class StandardFare implements FareStrategy{

    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance;
    }
}
