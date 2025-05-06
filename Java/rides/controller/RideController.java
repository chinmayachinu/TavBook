package rides.controller;

import rides.models.Driver;
import rides.models.Rider;
import rides.models.RidesDetails;
import rides.service.RiderService;

public class RideController {
    private RiderService riderService;

    public void registerRider(Rider rider) {
        riderService.registerRider(rider);
    }

    public RidesDetails book(String riderId) {
        riderService.book();
    }
}

