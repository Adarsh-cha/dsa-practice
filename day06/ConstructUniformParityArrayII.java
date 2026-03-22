class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;

        int even = 0;
        int odd = 0;
        int minOdd = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 != 0) {
                odd++;
                if (minOdd > nums1[i]) {
                    index = i;
                    minOdd = nums1[i];
                }
            }
            else {
                even++;
            }
        }

        if (odd == n || even == n) {
            return true;
        }
        
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0 && index != i && (nums1[i] - minOdd) < 0) {
                return false;
            }
        }
        return true;
    }
}