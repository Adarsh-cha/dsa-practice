class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        int max = -1;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, costs[i]);
        }
        int[] count = new int[max + 1];
        
        for (int i = 0; i < n; i++) {
            count[costs[i]]++;
        }

        int ans = 0;
        for (int i = 1; i < max + 1; i++) {
            int tem = Math.min(count[i], coins / i);
            ans += tem;
            coins -= tem * i;
        }
        return ans;
    }
}