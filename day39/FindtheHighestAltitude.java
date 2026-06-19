class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans = 0;
        int currGain = 0;

        for (int i = 0; i < n; i++) {
            currGain += gain[i];
            ans = Math.max(ans, currGain);
        }
        return ans;
    }
}