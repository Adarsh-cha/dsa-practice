class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;

        int[] ans = new int[n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 1) {
                    ans[row]++;
                }
            }
        }
        return ans;
    }
}