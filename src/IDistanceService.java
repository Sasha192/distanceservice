import java.util.Date;

public interface IDistanceService {

    int distanceInMeters(LatLong from, LatLong to);

    Date lastRoadNetworkUpdate();
}
