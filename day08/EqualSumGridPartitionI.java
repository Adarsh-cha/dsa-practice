class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long totalSum = 0;
        for (int[] row : grid) {
            for (int num : row) {
                totalSum += num;
            }
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        long target = totalSum / 2;
        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < m; col++) {
                target -= grid[row][col];
            }
            if (target == 0) {
                return true;
            }
        }
        target = totalSum / 2;
        for (int col = 0; col < m - 1; col++) {
            for (int row = 0; row < n; row++) {
                target -= grid[row][col];
            }
            if (target == 0) {
                return true;
            }
        }
        return false;
    }
}