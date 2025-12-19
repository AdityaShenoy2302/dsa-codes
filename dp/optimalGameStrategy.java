public class optimalGameStrategy {
    public static int optimalStrategy(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++, j++) {
                if (gap == 0) {
                    dp[i][j] = arr[i];
                } else if (gap == 1) {
                    dp[i][j] = Math.max(arr[i], arr[j]);
                } else {
                    int val1 = arr[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]);
                    int val2 = arr[j] + Math.min(dp[i][j - 2], dp[i + 1][j - 1]);
                    dp[i][j] = Math.max(val1, val2);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 7, 10 };
        System.out.print(optimalStrategy(arr));
    }
}
