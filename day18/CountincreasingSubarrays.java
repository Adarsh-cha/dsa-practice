class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int n = arr.length;
        int ans = 0;
        
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (right > 0 && arr[right] <= arr[right - 1]) {
                left = right;
            }
            
            if ((right - left + 1) >= 2) {
                ans += (right - left);
            }
        }
        return ans;
    }
}