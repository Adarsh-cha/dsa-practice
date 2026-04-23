class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;

        HashMap<Integer, List<Integer>> freq = new HashMap<>();
        long[] arr = new long[n];
        
        for (int i = 0; i < n; i++) {
            freq.putIfAbsent(nums[i], new ArrayList<>());
            freq.get(nums[i]).add(i);
        }

        for (List<Integer> idx : freq.values()) {
            int size = idx.size();

            long[] prefix = new long[size];
            prefix[0] = idx.get(0);
            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] + idx.get(i);
            }

            for (int i = 0; i < size; i++) {
                int currIndex = idx.get(i);

                long sumLeft = (i > 0) ? prefix[i - 1] : 0;
                long left = (long)i * currIndex - sumLeft;

                long sumRight = prefix[size - 1] - prefix[i];
                long right = sumRight - (long)(size - 1 - i) * currIndex;

                arr[currIndex] = left + right;
            }
        }
        return arr;
    }
}