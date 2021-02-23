/*
import java.util.HashMap;
import java.util.Map;

public class Node {

    // point of interest
    private LatLong point;

    // Nodes that are associated with this Node
    // There is at least one Pair (LatLong, LatLong), where LatLong point was presented
    private Map<Node, Integer> nodes;

    public Node(final LatLong from) {
        point = from;
        nodes = new HashMap<>();
    }

    public LatLong getPoint() {
        return this.point;
    }

    public Map<Node, Integer> getNodes() {
        return this.nodes;
    }

    public void addNode(Node node, int dist) {
        nodes.put(node, dist);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        final Node node = (Node) o;

        return this.point.equals(node.point);
    }

    @Override
    public int hashCode() {
        return this.point.hashCode();
    }
}
*/
