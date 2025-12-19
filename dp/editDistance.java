// add -> str1(m)str2(n-1) + 1
// delete -> str1(m-1)str2(n) + 1
// replace -> str(m-1)str2(n-1) + 1

public class editDistance {
    public static int ed(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int add = dp[i][j - 1] + 1;
                    int del = dp[i - 1][j] + 1;
                    int replace = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(add, Math.min(del, replace));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String args[]) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(ed(word1, word2));
    }
}