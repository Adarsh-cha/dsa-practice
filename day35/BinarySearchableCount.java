class Solution {
    public int binarySearchable(int[] arr) {
        // code here
        int n = arr.length;
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            
            int l = 0;
            int r = n - 1;
            
            while (l <= r) {
                int mid = l + (r - l) / 2;
                
                if (arr[mid] == arr[i]) {
                    count++;
                    break;
                }
                
                if (arr[mid] < arr[i]) {
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
            }
        }
        return count;
    }
};