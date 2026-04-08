class Solution {
    static final int MOD = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int ansXor = 0;

        for (int i = 0; i < n; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            int ki = queries[i][2];
            int vi = queries[i][3];

            while (li <= ri) {
                nums[li] = (int) (((long)nums[li] * vi) % MOD);
                li += ki;
            }
        }

        for (int num : nums) {
            ansXor ^= num;
        }
        return ansXor;
    }
}