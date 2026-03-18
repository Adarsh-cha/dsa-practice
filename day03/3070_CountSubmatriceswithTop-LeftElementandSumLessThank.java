class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        // SC -> O(N * M)
        // int[][] prefix = new int[n][m];

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {

        //         int up = (i > 0) ? prefix[i - 1][j] : 0;
        //         int left = (j > 0) ? prefix[i][j - 1] : 0;
        //         int diagonal = (i > 0 && j > 0) ? prefix[i - 1][j - 1] : 0;

        //         prefix[i][j] = grid[i][j] + up + left - diagonal;
        //     }
        // }


        //  SC -> O(1)
        int answer = 0;
        if (grid[0][0] <= k) {
            answer++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                else if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                }
                else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                }
                else {
                    grid[i][j] = grid[i][j] + grid[i - 1][j] + grid[i][j - 1] - grid[i - 1][j - 1];
                }
                
                if (grid[i][j] <= k) {
                    answer++;
                } 
                else {
                    break;
                }
            }
        }
        return answer;
    }
}