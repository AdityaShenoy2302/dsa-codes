public class coinChange {
    public static int ways(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];

        // initialise - sum is 0
        // i - coins; j - sum/change
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int j = 1; j < dp.length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                int c = coins[i - 1];
                if (c <= j) {
                    dp[i][j] = dp[i][j - c] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String args[]) {
        int coins[] = { 1, 2, 3 };
        int sum = 4;
        System.out.println(ways(coins, sum));
    }
}
