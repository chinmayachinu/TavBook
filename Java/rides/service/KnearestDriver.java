package rides.service;

import rides.models.Location;

public class KnearestDriver {

    public double findDriver (Location driverLocation, Location riderLocation) {
        return Math.sqrt((riderLocation.getX() - driverLocation.getX())*
                (riderLocation.getX() - driverLocation.getX()));

    }

}
