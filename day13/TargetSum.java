class Solution {
    int solve(int i, int sum, int[] arr, int[][] dp, int target, int totalSum) {
        if (i >= arr.length) {
            return sum == target ? 1 : 0;
        }
        
        if (dp[i][sum + totalSum] != -1) {
            return dp[i][sum + totalSum];
        }
        
        int takePos = solve(i+1, sum + arr[i], arr, dp, target, totalSum);
        int takeNeg = solve(i+1, sum - arr[i], arr, dp, target, totalSum);
        
        return dp[i][sum + totalSum] = takePos + takeNeg;
    }
    public int totalWays(int[] arr, int target) {
        // code here
        int totalSum = 0;
        for (int r : arr) {
            totalSum += r;
        }
        int[][] dp = new int[arr.length][2 * totalSum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, 0, arr, dp, target, totalSum);
    }
}