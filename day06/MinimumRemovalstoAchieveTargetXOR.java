class Solution {
    static int solve(int i, int xor, int n, int[] nums, int[][] dp, int target) {
        if (i >= n) {
            if (xor == target) {
                return 0;
            }
            return Integer.MAX_VALUE;
        }

        if (dp[i][xor] != -1) {
            return dp[i][xor];
        }
        int take = solve(i+1, xor ^ nums[i], n, nums, dp,  target);
        int notTake = solve(i+1, xor, n, nums, dp, target);
        if (notTake != Integer.MAX_VALUE) {
            notTake = 1 + notTake;
        }

        return dp[i][xor] = Math.min(take, notTake);
    }
    public int minRemovals(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n][16384];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = solve(0, 0, n, nums, dp, target);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}