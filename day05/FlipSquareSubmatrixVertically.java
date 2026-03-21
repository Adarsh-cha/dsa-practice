class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int row1 = x + k - 1;
        for (int row = x; row < row1; row++) {
            for (int col = y; col <= (y + k -1); col++) {
                swap(grid, row, col, row1, col);
            }
            row1--;
        }
        return grid;
    }
    static void swap(int[][] grid, int row , int col, int row1, int col1) {
        int tem = grid[row][col];
        grid[row][col] = grid[row1][col1];
        grid[row1][col1] = tem;
    }
}