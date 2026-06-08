class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;

        int[] ans = new int[n];
        int start = 0;
        int end = n - 1;
        
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            if (nums[j] > pivot) {
                ans[end--] = nums[j];
            }

            if (nums[i] < pivot) {
                ans[start++] = nums[i];
            }
        }

        while (start <= end) {
            ans[start++] = pivot;
        }
        return ans;
    }
}