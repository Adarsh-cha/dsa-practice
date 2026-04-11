class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> ls = entry.getValue();

            if (ls.size() < 3) {
                continue;
            }

            for (int i = 0; i <= ls.size() - 3; i++) {
                int first = ls.get(i);
                int third = ls.get(i + 2);

                int abs = 2 * (third - first);
                ans = Math.min(ans, abs);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}