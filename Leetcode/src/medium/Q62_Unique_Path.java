package medium;

public class Q62_Unique_Path {
	public static int uniquePaths(int m, int n) {
		int[][] dp = new int[m][n];
		dp[0][0] = 1;
		for(int i = 1; i < m; i++) {
			dp[i][0] = dp[i - 1][0];
		}
		for(int j = 1; j < n; j++) {
			dp[0][j] = dp[0][j - 1];
		}
		for(int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++) {
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			}
		}
		return dp[m - 1][n - 1];
	}
	
	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 3));
	}
}
