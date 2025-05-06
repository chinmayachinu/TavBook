package rides.repository;

import rides.models.Rider;

import java.util.Map;

public class RideStorage {
    private Map<String, Rider> riderMap;

    public void saveRider(Rider rider) {
        if (riderMap.containsKey(rider.getRiderId())) {
            throw new RuntimeException("Rider already exists");
        }

        riderMap.put(rider.getRiderId(), rider);
    }

    public Rider getRider(String riderId) {
        return riderMap.get(riderId);
    }

}
