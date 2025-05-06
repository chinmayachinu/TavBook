package rides.models;

public class Driver {
    private String driverId;
    private boolean isAvailable;
    private Location driverLocation;

    public Driver(String driverId, boolean isAvailable) {
        this.driverId = driverId;
        this.isAvailable = isAvailable;
    }


}
