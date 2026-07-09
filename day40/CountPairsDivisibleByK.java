class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        int n = arr.length;
        int ans = 0;
        
        int[] freq = new int[k];
        
        for (int i = 0; i < n; i++) {
            int rem = arr[i] % k;
            
            int need = (k - rem) % k;
            
            ans += freq[need];
            
            freq[rem]++;
        }
        return ans;
    }
}