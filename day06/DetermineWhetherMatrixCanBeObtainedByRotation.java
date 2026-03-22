class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int m = mat[0].length;

        for (int k = 0; k < 4; k++) {

            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (m + 1) / 2; j++) {
                    int tem = mat[i][j];
                    mat[i][j] = mat[n - 1 - j][i];
                    mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
                    mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
                    mat[j][n - 1 - i] = tem;
                }
            }
            if (check(mat, target)) {
                return true;
            }
        }
        return false;
    }
    static boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            } 
        }
        return true;
    }
}