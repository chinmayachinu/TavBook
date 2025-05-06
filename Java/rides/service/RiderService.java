package rides.service;

import rides.models.Rider;
import rides.models.RidesDetails;

public interface RiderService {
    void registerRider(Rider rider);
    RidesDetails book(String riderId);
    void getRideDetails();
    void endTrip();
}
