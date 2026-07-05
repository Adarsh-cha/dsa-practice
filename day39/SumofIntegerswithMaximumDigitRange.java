class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int maxValue = -1;
        int ans = 0;

        int[] max = new int[n];

        for (int i = 0; i < n; i++) {
            int maxDigit = -1;
            int minDigit = Integer.MAX_VALUE;
            int digit = nums[i];

            while (digit > 0) {
                int rem = digit % 10;
                maxDigit = Math.max(maxDigit, rem);
                minDigit = Math.min(minDigit, rem);
                digit /= 10;
            }

            max[i] = maxDigit - minDigit;
            maxValue = Math.max(maxValue, maxDigit - minDigit);
        }

        for (int i = 0; i < n; i++) {
            if (maxValue == max[i]) {
                ans += nums[i];
            }
        }
        return ans;
    }
}