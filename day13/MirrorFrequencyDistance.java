class Solution {
    public int mirrorFrequency(String s) {
        int[] freqChar = new int[26];
        int[] freqNum = new int[10];

        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freqChar[ch - 'a']++;
            }
            else {
                freqNum[ch - '0']++;
            }
        }
        
        for (int i = 0; i < 13; i++) {
            ans += Math.abs(freqChar[i] - freqChar[25 - i]);
            if (i < 5) {
                ans += Math.abs(freqNum[i] - freqNum[9 - i]);
            }
        }
        return ans;
    }
}