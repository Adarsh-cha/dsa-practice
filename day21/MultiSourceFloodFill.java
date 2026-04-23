class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int sn = sources.length;

        int[][] matrix = new int[n][m];

        for (int i = 0; i < sn; i++) {
            int r = sources[i][0];
            int c = sources[i][1];
            int color = sources[i][2];

            matrix[r][c] = color;
            if (r + 1 < n && matrix[r + 1][c] == 0) {
                matrix[r + 1][c] = color;
            }

            if (r - 1 >= 0 && matrix[r - 1][c] == 0) {
                matrix[r - 1][c] = color;
            }

            if (c + 1 < m && matrix[r][c + 1] == 0) {
                matrix[r][c + 1] = color;
            }

            if (c - 1 >= 0 && matrix[r][c - 1] == 0) {
                matrix[r][c - 1] = color;
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == 0) {
                    int max = -1;
                    if (row + 1 < n) {
                        max = Math.max(max, matrix[row + 1][col]);
                    }

                    if (row - 1 >= 0) {
                        max = Math.max(max, matrix[row - 1][col]);
                    }

                    if (col + 1 < m) {
                        max = Math.max(max, matrix[row][col + 1]);
                    }

                    if (col - 1 >= 0) {
                        max = Math.max(max, matrix[row][col - 1]);
                    }
                    matrix[row][col] = max;
                }
            }
        }
        return matrix;
    }
}