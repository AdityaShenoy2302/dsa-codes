// if graph does not have a cycle then it is always a bipartite graph
// case 1: neigh -> color -> same -> not bipartite
// case 2: neigh -> color -> diff -> continue
// case 3: neigh -> no color -> color with opp color and continue

import java.util.*;

public class bipartiteGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
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
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int color[] = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1; // no color
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) { // BFS
                q.add(i);
                color[i] = 0; // color with 0
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (Edge e : graph[curr]) {
                        int neigh = e.dest;
                        // case 1
                        if (color[neigh] == color[curr]) {
                            return false;
                        }
                        // case 3
                        else if (color[neigh] == -1) {
                            int oppColor = color[curr] == 0 ? 1 : 0;
                            color[neigh] = oppColor;
                            q.add(neigh);
                        }
                    }
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph)); // false
    }
}
