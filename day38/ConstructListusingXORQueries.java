class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = queries.length;
        int xorVal = 0;
        ans.add(0);
        
        for (int i = 0; i < n; i++) {
            if (queries[i][0] == 0) {
                ans.add(queries[i][1] ^ xorVal);
            }
            else {
                xorVal ^= queries[i][1];
            }
        }
        
        for (int i = 0; i < ans.size(); i++) {
            ans.set(i, ans.get(i) ^ xorVal);
        }
        
        Collections.sort(ans);
        return ans;
    }
}