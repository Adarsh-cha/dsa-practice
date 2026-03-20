class Solution {
    // Function to calculate the number of subsets with a given sum
    static int solve(int i, int currSum, int[] arr, int target, int[][] dp) {
        if (i < 0) {
            if (currSum == target) {
                return 1;
            }
            return 0;
        }

        if (dp[i][currSum] != -1) {
            return dp[i][currSum];
        }
        int notTake = solve(i - 1, currSum, arr, target, dp);
        int take = 0;
        if (currSum + arr[i] <= target) {
            take = solve(i - 1, currSum + arr[i], arr, target, dp);
        }
        
        return dp[i][currSum] = notTake + take;
    }
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int[][] dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n-1, 0, nums, target, dp);
    }
}