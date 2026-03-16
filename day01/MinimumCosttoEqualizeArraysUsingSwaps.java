class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int miss = 0;
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        HashMap<Integer, Integer> diff  = new HashMap<>();
        
        for (int i = 0; i < n1; i++) {
            freqMap.put(nums1[i], freqMap.getOrDefault(nums1[i], 0) + 1);
            freqMap.put(nums2[i], freqMap.getOrDefault(nums2[i], 0) + 1);

            diff.put(nums1[i], diff.getOrDefault(nums1[i], 0) + 1);
            diff.put(nums2[i], diff.getOrDefault(nums2[i], 0) - 1);
        }

        boolean found = false;
        for (int value : freqMap.values()) {
            if (value % 2 == 1) {
                found = true;
                break;
            }
        }

        if (found) {
            return -1;
        }
        
        long totalDiff = 0;

        for (int v : diff.values()) {
            totalDiff += Math.abs(v);
        }

        return (int)(totalDiff / 4);
    }
}