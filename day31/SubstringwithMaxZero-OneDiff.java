// TC -> O(n) as it iterate till length of string
// SC -> O(1) as there are no auxilary space only constant maxAns and currSum.
class Solution {
    int maxSubstring(String s) {
        // code here
        int n = s.length();
        
        int maxAns = -1;
        int currSum = 0;
        
        for (int i = 0; i < n; i++) {
            
            currSum += (s.charAt(i) - '0' == 1) ? -1 : 1;
            
            if (currSum < 0) {
                currSum = 0;
            }
            
            maxAns = Math.max(maxAns, currSum);
        }
        return maxAns == 0 ? -1 : maxAns;
    }
}