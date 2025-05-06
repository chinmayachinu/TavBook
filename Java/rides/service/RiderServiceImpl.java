package rides.service;

import rides.models.Driver;
import rides.models.Rider;
import rides.models.RidesDetails;
import rides.repository.DriverStorage;
import rides.repository.RideStorage;

import java.util.List;

public class RiderServiceImpl implements RiderService {
    private RideStorage rideStorage;
    private DriverStorage driverStorage;
    private KnearestDriver knearestDriver;

    @Override
    public void registerRider(Rider rider) {
        System.out.println("registerRider");
        rideStorage.saveRider(rider);
    }

    @Override
    public RidesDetails book(String riderId) {
        //get rider details => location
        Rider rider = rideStorage.getRider(riderId);

        // get driver details
        List<Driver> driverList = driverStorage.getDrivers();
        // search nearest driver
        double min = Double.MAX_VALUE;
        Driver bookableDriver = null;

        for (Driver driver : driverList) {
            double value = knearestDriver.findDriver(driver.getLocation(), rider.getRiderLocation());
            boolean isAvailable = driverService.checkAvailability(driver);
            if (isAvailable && value < min) {
                // check availability

                min = value;
                bookableDriver = driver;

            }
        }

        boolean isAcceptted = driverService.book(rider, bookableDriver);
        RidesDetails rideDetails = driverService.book(rider, bookableDriver);

        PricingStategy pricingStategy = PricingFactory.getPricingStategY(PricingRule);
        pricingStategy.price(ride)
        return rideDetails;
    }

    @Override
    public void getRideDetails() {

    }

    @Override
    public void endTrip() {

    }
}
