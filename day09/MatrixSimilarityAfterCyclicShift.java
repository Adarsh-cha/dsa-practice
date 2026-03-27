class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        int swap = k % m;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != mat[i][(j + swap) % m]) {
                    return false;
                }
            }
        }
        return true;
    }
}