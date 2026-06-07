class Solution {
    public boolean consecutiveSetBits(int n) {
        int setBits = 0;
        int ans = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                setBits++;
                if (setBits >= 2) {
                    ans++;
                }
            }
            else {
                setBits = 0;
            }
            n >>= 1;
        }

        return ans == 1;
    }
}