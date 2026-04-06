class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        
        int totalSum = 0;
        int target = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        
        target = totalSum + diff;
        if ((target) % 2 != 0) {
            return 0;
        }
        target = target / 2;
        int[][] a = new int[n + 1][target + 1];
        a[0][0] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                int notTake = a[i - 1][j];
                
                int take = 0;
                if (arr[i - 1] <= j) {
                    take = a[i - 1][j - arr[i - 1]];
                }
                
                a[i][j] = notTake + take;
            }
        }
        return a[n][target];
    }
}


// 1 -> dp
class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        
        int totalSum = 0;
        int target = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        
        target = totalSum + diff;
        if ((target) % 2 != 0) {
            return 0;
        }
        target = target / 2;
        int[] a = new int[target + 1];
        a[0] = 1;
        
        for (int i = 0; i < n; i++) {
            int[] tem = new int[target + 1];
            for (int j = 0; j <= target; j++) {
                int notTake = a[j];
                
                int take = 0;
                if (arr[i] <= j) {
                    take = a[j - arr[i]];
                }
                
                tem[j] = notTake + take;
            }
            a = tem;
        }
        return a[target];
    }
}
