class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();

        int l = 0;
        int r = 0;
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            if (moves.charAt(i) == 'R') {
                r++;
            }
            else if (moves.charAt(i) == 'L') {
                l++;
            }
            else {
                spaces++;
            }
        }
        return Math.abs(r - l) + spaces;
    }
}