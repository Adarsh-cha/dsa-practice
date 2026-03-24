//Recursion
class Solution {
    static int solve(int i, int s1, int[] arr, int target) {
        if (i >= arr.length) {
            return s1 == target ? 1 : 0;
        }
        
        int take = 0;
        if (arr[i] <= target) {
            take = solve(i+1, s1 + arr[i], arr, target);
        }
        int notTake = solve(i+1, s1, arr, target);
        return take + notTake;
    }
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        if ((totalSum + diff) % 2 == 1) {
            return 0;
        }
        return solve(0, 0, arr, (totalSum + diff) / 2);
    }
}


//MEMO
class Solution {
    static int solve(int i, int s1, int[] arr, int[][] dp, int target) {
        if (i >= arr.length) {
            return s1 == target ? 1 : 0;
        }
        
        if (dp[i][s1] != -1) {
            return dp[i][s1];
        }
        int take = 0;
        if (arr[i] + s1 <= target) {
            take = solve(i+1, s1 + arr[i], arr, dp, target);
        }
        int notTake = solve(i+1, s1, arr, dp, target);
        return dp[i][s1] = take + notTake;
    }
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        if ((totalSum + diff) % 2 == 1) {
            return 0;
        }
        
        int[][] dp = new int[n][((totalSum + diff) / 2) + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, 0, arr, dp, (totalSum + diff) / 2);
    }
}

//Tabulation
class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        int target = (totalSum + diff) / 2;
        if ((totalSum + diff) % 2 == 1) {
            return 0;
        }
        
        int[][] dp = new int[n + 1][target + 1];
        dp[n][target] = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= target; j++) {
                int notTake = dp[i+1][j];
                
                int take = 0;
                if (j + arr[i] <= target) {
                    take = dp[i+1][j + arr[i]];
                }
                
                dp[i][j] = notTake + take;
            }
        }
        return dp[0][0];
    }
}
