class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int n = arr.length;
        int ans = 0;
        int max = -1;
        
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            if (max <= arr[i]) {
                ans++;
            }
        }
        return ans;
    }
}