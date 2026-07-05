class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxAns = -1;

        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], nums[i]);
        }
        
        for (int j = 0; (j + k) < n; j++) {
            maxAns = Math.max(maxAns, nums[j] + suffix[j + k]);
        }
        return maxAns;
    }
}