// single source shortest path algorithm

import java.util.*;

public class dijkstrasAlgo {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Info implements Comparable<Info> {
        int v;
        int cost;

        public Info(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Info p2) {
            return this.cost - p2.cost; // path based sorting for my pairs
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // dist[i] -> src to i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // +infinity
            }
        }

        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Info> pq = new PriorityQueue<>();
        pq.add(new Info(src, 0));
        // loop
        while (!pq.isEmpty()) {
            Info curr = pq.remove();
            int currVertex = curr.v;
            int currCost = curr.cost;

            if (vis[currVertex])
                continue; // skip if already finalized
            vis[currVertex] = true;

            for (Edge e : graph[currVertex]) {
                int newCost = currCost + e.wt;

                // relaxation
                if (newCost < dist[e.dest]) {
                    dist[e.dest] = newCost;
                    pq.add(new Info(e.dest, newCost));
                }
            }
        }

        // print all src to vertices shortest dist
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        dijkstra(graph, src);
    }
}
