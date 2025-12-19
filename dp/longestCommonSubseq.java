public class longestCommonSubseq {
    public static int lcsRec(String str1, String str2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return lcsRec(str1, str2, m - 1, n - 1) + 1;
        } else {
            int ans1 = lcsRec(str1, str2, m - 1, n);
            int ans2 = lcsRec(str1, str2, m, n - 1);
            return Math.max(ans1, ans2);
        }
    }

    public static int lcsTab(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String args[]) {
        String str1 = "abcdge";
        String str2 = "abedg";

        System.out.println(lcsRec(str1, str2, str1.length(), str2.length()));
        System.out.println(lcsTab(str1, str2));
    }
}
