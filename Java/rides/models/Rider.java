package rides.models;

public class Rider {

    private String riderId;
    private String riderName;
    private Location riderLocation;

    public Location getRiderLocation() {
        return riderLocation;
    }

    public void setRiderLocation(Location riderLocation) {
        this.riderLocation = riderLocation;
    }

    public Rider(String riderId, String riderName) {
        this.riderId = riderId;
        this.riderName = riderName;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }
}
