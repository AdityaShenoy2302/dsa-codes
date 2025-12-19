// all pair shortest path
// multi source shortest path algorithm
// for a negative cycle -> matrix[i][i] < 0
public class floydWarshall {
    static class Pair {
        int v;
        int w;

        Pair(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int[][] edges = { { 0, 1, 3 }, { 0, 2, 5 }, { 1, 2, 1 }, { 2, 3, 2 }, { 1, 3, 7 } };

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = (int) 1e9;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            matrix[u][v] = w;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][k] != (int) 1e9 && matrix[k][j] != (int) 1e9) {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == (int) 1e9) {
                    System.out.print("INF ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
