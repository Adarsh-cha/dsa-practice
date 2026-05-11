class Solution {
    public int minDifference(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        boolean[][] dp = new boolean[n + 1][sum + 1];
        dp[0][0] = true;
        
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s <= sum; s++) {
                dp[i][s] = dp[i - 1][s];
                
                if (s >= arr[i - 1]) {
                    dp[i][s] = dp[i][s] || dp[i - 1][s - arr[i - 1]];
                }
            }
        }
        
        int mi = Integer.MAX_VALUE;
        for (int i = 0; i <= sum / 2; i++) {
            if (dp[n][i]) {
                mi = Math.min(mi, Math.abs((sum - i) - i));
            }
        }
        return mi;
    }
}
