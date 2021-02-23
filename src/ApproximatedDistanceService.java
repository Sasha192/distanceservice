/*
import java.util.Date;
import java.util.Map;

public abstract class ApproximatedDistanceService implements IDistanceService {

    // cached pair of points and distance, were inputs at least once
    private Map<Pair, Integer> pairs;

    // cached point, were inputs at least once, with associated Node
    private Map<LatLong, Node> nodes;

    private IMetric metric;

    private Date lastUpdate;

    @Override
    public int distanceInMeters(LatLong from, LatLong to) {
        Date lastRoadNetworkUpdate = lastRoadNetworkUpdate();
        if (lastRoadNetworkUpdate.after(lastUpdate)) {
            pairs.clear();
            nodes.clear();
            lastUpdate = lastRoadNetworkUpdate;
        }

        Pair pair = new Pair(from, to);
        if (pairs.containsKey(pair)) {
            return pairs.get(pair);
        }
        int distance;
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if (fromNode != null && toNode != null) {
            distance = metric.dist(fromNode, toNode);
        } else {
            fromNode = fromNode == null ? new Node(from) : fromNode;
            toNode = toNode == null ? new Node(to) : toNode;
            distance = com.cloudspatialprovider.api.FetchDistanceInMeters(from, to);
            fromNode.addNode(toNode, distance);
            toNode.addNode(fromNode, distance);
            pairs.put(new Pair(from, to), distance);
        }
        return distance;
    }
}
*/
