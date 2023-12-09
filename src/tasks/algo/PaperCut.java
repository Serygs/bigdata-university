package tasks.algo;

public class PaperCut {
    public int execute(int n, int m) {
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = 1; k < i; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - k][j] + dp[k][j]);
                    }
                    for (int k = 1; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j - k] + dp[i][k]);
                    }
                }
            }
        }
        return dp[n][m];
    }
}
