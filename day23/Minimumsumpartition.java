class Solution {
    int solve(int i, int runSum, int sum, int[] arr, int[][] dp) {
        if (i >= arr.length - 1) {
            return Math.abs(runSum - sum);
        }
        
        if (dp[i][runSum] != -1) {
            return dp[i][runSum];
        }
        int take = solve(i + 1, runSum + arr[i], sum - arr[i], arr, dp);
        
        int notTake = solve(i + 1, runSum, sum, arr, dp);
        
        return dp[i][runSum] = Math.min(take, notTake);
    }
    public int minDifference(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        int[][] dp = new int[n][sum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return solve(0, 0, sum, arr, dp);
    }
}
