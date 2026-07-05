class Solution {
    public int maxCharGap(String s) {
        // code here
        int n = s.length();
        
        int[] freq = new int[26];
        int maxAns = -1;
        
        for (int i = 0; i < 26; i++) {
            freq[i] = -1;
        }
        
        for (int j = 0; j < n; j++) {
            if (freq[s.charAt(j) - 'a'] == -1) {
                freq[s.charAt(j) - 'a'] = j;
            }
            else {
                maxAns = Math.max(maxAns, j - freq[s.charAt(j) - 'a'] - 1);
            }
        }
        return maxAns;
    }
}
