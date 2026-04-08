class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int left = 0;
        
       for (int right = 0; right < n; right++) {
            if (arr[right] == 0 && arr[left] == 1) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
            else if (arr[right] == 0) {
                left++;
            }
            
        }
    }
}
