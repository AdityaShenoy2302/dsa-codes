// Amazon
// Given a 2xn board and tiles of size 2x1, count the number of ways to tile the given board using the 2x1 tiles.(A tile can be placed either horizontally or vertically).

public class tilingProblem {
    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical
        int fnm1 = tiling(n - 1);
        // horizontal
        int fnm2 = tiling(n - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(tiling(3));
    }
}
