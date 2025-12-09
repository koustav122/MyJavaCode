import java.util.*;

public class HighFreqTrade {
    static class Node implements Comparable<Node> {
        int id;
        int time;
        public Node(int id, int time) {
            this.id = id;
            this.time = time;
        }
@Override
public int compareTo(Node other) {
    return Integer.compare(this.id, other.time);
}
    }
    public static int minLatency(int n, int[][] connections, int delays, int src, int dest) {
        Map<Integer, List<Node>> graph = new HashMap<>();
        for (int[] conn : connections) {
            int u = conn[0];
            int v = conn[1];
            int w = conn[2];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new Node(v, w));
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(src, 0));
        int[] minTime = new int[n+1];
        Arrays.fill(minTime, Integer.MAX_VALUE);
        minTime[src] = 0;
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.id;
            int currTime = current.time;
            if (u == dest) return currTime;
            if (currTime > minTime[u]) continue;
            for (Node neighbor : graph.getOrDefault(u, new ArrayList<>())) {
                int v = neighbor.id;
                int time = neighbor.time;
                int newTime = currTime + time + delays;
                if (newTime < minTime[v]) {
                    minTime[v] = newTime;
                    pq.offer(new Node(v, newTime));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] connections = {
            {1, 2, 10},
            {1, 3, 5},
            {2, 3, 2},
            {3, 2, 3},
            {2, 4, 1},
            {3, 4, 9},
            {4, 5, 2}
        };
        int delays = 1;
        int src = 1;
        int dest = 5;
        int result = minLatency(n, connections, delays, src, dest);
        System.out.println("Minimum latency from " + src + " to " + dest + " is: " + result);
    }
}