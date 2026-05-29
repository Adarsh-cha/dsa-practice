class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;

        int globalMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int ans = 0;

            while (nums[i] > 0) {
                ans += (nums[i] % 10);
                nums[i] /= 10;
            }

            globalMin = Math.min(globalMin, ans);
        }
        return globalMin;
    }
}

// TC -> O(n * log(D))
// SC -> O(1)