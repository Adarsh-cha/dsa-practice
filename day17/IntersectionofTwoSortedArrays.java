class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = a.length;
        int m = b.length;
        
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (i > 0 && a[i -1] == a[i]) {
                i++;
                continue;
            }
            
            if (a[i] < b[j]) {
                i++;
            }
            else if (a[i] > b[j]) {
                j++;
            }
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}