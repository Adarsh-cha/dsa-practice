//recur
class Solution {
    int solve(int i, int amount, int[] nums) {
        if (amount == 0) {
            return 0;
        }

        if (i == nums.length - 1) {
            return amount % nums[i] == 0 ? amount / nums[i] : (int)1e9;
        }

        int notTake =  solve(i + 1, amount, nums);
        
        int take = Integer.MAX_VALUE;
        if (nums[i] <= amount) {
            take = 1 + solve(i, amount - nums[i], nums);
        }

        return Math.min(take, notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int ans = solve(0, amount, coins);
        return ans == 1e9 ? -1 : ans;
    }
}

//memo
class Solution {
    int solve(int i, int amount, int[] nums, int[][] dp) {
        if (amount == 0) {
            return 0;
        }

        if (i == nums.length - 1) {
            return amount % nums[i] == 0 ? amount / nums[i] : (int)1e9;
        }

        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }
        int notTake =  solve(i + 1, amount, nums, dp);
        
        int take = Integer.MAX_VALUE;
        if (nums[i] <= amount) {
            take = 1 + solve(i, amount - nums[i], nums, dp);
        }

        return dp[i][amount] = Math.min(take, notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount  + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = solve(0, amount, coins, dp);
        return ans == 1e9 ? -1 : ans;
    }
}

//tab
class Solution { 
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount  + 1];

        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0) {
                dp[0][i] = i / coins[0];
            }
            else {
                dp[0][i] = (int)1e9;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                int notTake = dp[i - 1][j];

                int take = (int) 1e9;
                if (j >= coins[i]) {
                    take = 1 + dp[i][j - coins[i]]; 
                }

                dp[i][j] = Math.min(take, notTake);
            }
        }
        int ans = dp[n - 1][amount];
        return ans >= 1e9 ? -1 : ans;
    }
}