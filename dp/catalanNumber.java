// same soln for count BSTs and mountain ranges(- number of downstrokes cannot be more than number of upstrokes) problem

public class catalanNumber {
    public static int catalanTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1]; // Ci = Cj * Ci-j-1
            }
        }

        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(catalanTab(n));
    }
}