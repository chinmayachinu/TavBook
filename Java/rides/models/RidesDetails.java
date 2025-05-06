package rides.models;

public class RidesDetails {
    private String riderId;
    private String driverId;
    private String priceId;
    private RidesStatus status;

    public RidesDetails(String riderId, String driverId, String priceId, RidesStatus status) {
        this.riderId = riderId;
        this.driverId = driverId;
        this.priceId = priceId;
        this.status = status;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    public RidesStatus getStatus() {
        return status;
    }

    public void setStatus(RidesStatus status) {
        this.status = status;
    }
}
