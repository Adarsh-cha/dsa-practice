class Solution {
    public static int f(int[] wt, int[] val, int w, int n, int[][] arr) {
        if (n == 0 || w == 0) {
            return 0;
        }
        
        if (arr[n][w] != -1) {
            return arr[n][w];
        }
        
        int take = 0;
        
        if (wt[n-1] <= w) {
            take = val[n - 1] + f(wt, val, w - wt[n-1], n - 1, arr);
        } 
        
        int notTake = f(wt, val, w, n - 1, arr);
        
        return arr[n][w] = Math.max(take, notTake);
        
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int[][] arr = new int[n+1][W+1];
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                arr[i][j] = -1;
            }
        }
        return f(wt, val, W, n, arr);
    }
}