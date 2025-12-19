// comparison with knapsack
// price = val
// length = wt
// rod length = W
// if length array is not given then it is number of elements in price array respectively

public class rodCutting {
    public static int rodCut(int length[], int price[], int totRod) {
        int n = length.length;
        int dp[][] = new int[n + 1][totRod + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < totRod + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < totRod + 1; j++) {
                int l = length[i - 1];
                int p = price[i - 1];
                if (l <= j) {
                    dp[i][j] = Math.max(p + dp[i][j - l], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][totRod];
    }

    public static void main(String args[]) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; // pieces length
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int totRod = 8;

        System.out.println(rodCut(length, price, totRod));
    }
}