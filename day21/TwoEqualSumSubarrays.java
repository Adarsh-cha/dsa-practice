
class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        int prefix = 0;
        
        for (int ele : arr) {
            sum += ele;
        }
        
        for (int e : arr) {
            sum -= e;
            prefix += e;
            if (sum == prefix) {
                return true;
            }
        }
        return false;
    }
}