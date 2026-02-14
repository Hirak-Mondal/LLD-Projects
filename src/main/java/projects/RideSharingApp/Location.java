package projects.RideSharingApp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private double latitude; //x
    private double longitude;//y

    public Location(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double calculateDistance(Location location){
        double dx = this.latitude - location.getLatitude();
        double dy = this.longitude - location.getLongitude();
        return Math.sqrt(dx*dx + dy*dy);
    }
}
