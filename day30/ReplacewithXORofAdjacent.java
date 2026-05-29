// TC -> O(n)
// SC -> O(1)
class Solution {
    public void replaceElements(int[] arr) {
        // code here
        int n = arr.length;
        
        int last = arr[n - 1] ^ arr[ n - 2];
        int prev = arr[0] ^ arr[1];
        
        for (int i = 1; i < n - 1; i++) {
            int temp = arr[i - 1] ^ arr[i + 1];
            arr[i - 1] = prev;
            prev = temp;
        }
        
        arr[n - 2] = prev;
        arr[n - 1] = last;
    }
}