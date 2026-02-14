package projects.RideSharingApp.VehicleService;

public abstract class Vehicle {
    String numberPlater;

    public Vehicle(String numberPlater) {
        this.numberPlater = numberPlater;
    }

    public abstract double getFarePerKm();
}
