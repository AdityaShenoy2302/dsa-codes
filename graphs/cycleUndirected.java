// case 1: if vis neighbor and neighbor not parent -> always true
// case 3: if not vis neighbor then check for other nodes
// case 2: if vis neighbor and neighbor is parent -> do nothing

import java.util.ArrayList;

public class cycleUndirected {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                    // cycle exists in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int parent) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            int neigh = e.dest;
            // case 1
            if (vis[neigh] && neigh != parent) {
                return true;
            }
            // case 3
            else if (!vis[neigh] && detectCycleUtil(graph, vis, neigh, curr)) {
                return true;
            }
            // case 2 -> do nothing -> continue
        }

        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
