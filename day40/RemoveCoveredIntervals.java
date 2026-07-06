class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int ans = n;

        Arrays.sort(intervals, (a, b) -> { 
            if (a[0] == b[0]) 
                return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
            }
        );

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < n; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart >= start && currEnd <= end) {
                ans--;  
            }
            else {
                start = currStart;
                end = currEnd;
            }
        }
        return ans;
    }
}