// a substring is a contiguous sequence of characters within a string

public class longestCommonSubstring {
    public static int lcSubstring(String str1, String str2) {
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

        int ans = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        System.out.println(lcSubstring(str1, str2));
    }
}
