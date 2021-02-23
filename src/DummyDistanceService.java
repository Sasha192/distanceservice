import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class DummyDistanceService implements IDistanceService {

    // cached pair of points and distance, were inputs at least once
    private Map<Pair, Integer> pairs = new ConcurrentHashMap<>();

    // cached lastRoadNetworkUpdate
    private Date lastUpdate;


    @Override
    public int distanceInMeters(LatLong from, LatLong to) {
        Date lastRoadNetworkUpdate = lastRoadNetworkUpdate();
        if (lastRoadNetworkUpdate.after(lastUpdate)) {
            pairs.clear();
            lastUpdate = lastRoadNetworkUpdate;
        }
        Pair pair = new Pair(to, from);
        if (pairs.containsKey(pair)) {
            return pairs.get(pair);
        }
        int distance = com.cloudspatialprovider.api.FetchDistanceInMeters(from, to);
        pairs.put(pair, distance);
        return distance;
    }

}
