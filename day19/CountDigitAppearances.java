class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int tem = nums[i];
            while (tem > 0) {
                if ((tem % 10) == digit) {
                    ans++;
                }
                tem /= 10;
            }
        }
        return ans;
    }
}