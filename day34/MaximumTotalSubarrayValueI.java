class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        int minGlobal = Integer.MAX_VALUE;
        int maxGlobal = -1;

        for (int i = 0; i < n; i++) {
            minGlobal = Math.min(minGlobal, nums[i]);
            maxGlobal = Math.max(maxGlobal, nums[i]);
        }

        return (long) k * (maxGlobal - minGlobal);
    }
}