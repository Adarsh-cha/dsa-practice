class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        int len = intervals.length;
        long ans = 0;

        int bulbs = (brightness + 2) / 3;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < len; i++) {
            if (end >= intervals[i][0]) {
                end = Math.max(end, intervals[i][1]);
            }
            else {
                ans += (long)(end - start + 1) * bulbs;

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans += (long)(end - start + 1) * bulbs;
        return ans;
    }
}