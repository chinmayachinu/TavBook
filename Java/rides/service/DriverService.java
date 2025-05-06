package rides.service;

public interface DriverService {
    void registerDriver();
    void updateDriverLocation();
    void checkDriverAvailability();
    void endTrip();
}
