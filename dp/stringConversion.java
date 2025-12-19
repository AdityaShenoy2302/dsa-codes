public class stringConversion {
    public static int stringConv(String str1, String str2) {
        int lcs = lcs(str1, str2);
        int op1 = str1.length() - lcs;
        int op2 = str2.length() - op1;

        return op1 + op2;
    }

    public static int lcs(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i][j - 1];
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String args[]) {
        String str1 = "abcdef";
        String str2 = "aceg";

        System.out.println(stringConv(str1, str2));
    }
}