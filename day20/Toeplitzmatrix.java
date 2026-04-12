class Solution {
    public boolean isToeplitz(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (row + 1 < n && col + 1 < m && mat[row][col] != mat[row + 1][col + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}