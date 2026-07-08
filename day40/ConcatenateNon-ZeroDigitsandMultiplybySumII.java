class Solution {
    private static final int MOD = 1_000_000_007;
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int m = queries.length;
        int index = 0;
        int pow = 1;

        int[] ans = new int[m];
        long[] sum = new long[n + 1];
        long[] x = new long[n + 1];
        int[] countNonZero = new int[n + 1];
        long[] pow10 = new long[n + 1];

        pow10[0] = 1;
        
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            sum[i + 1] = sum[i] + digit;
            x[i + 1] = digit > 0 ? (x[i] * 10 + digit) % MOD : x[i];
            countNonZero[i + 1] = countNonZero[i] + (digit > 0 ? 1 : 0);
            pow10[i + 1] = (pow10[i] * 10) % MOD;
        }

        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int power = countNonZero[r + 1] - countNonZero[l];
            long valSum = sum[r + 1] - sum[l];
            long valX = (x[r + 1] - ((x[l] * pow10[power]) % MOD) + MOD) % MOD;
            ans[i] = (int) ((valX * valSum) % MOD);
        }
        return ans;
    }
}