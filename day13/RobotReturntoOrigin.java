class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();

        int U = 0;
        int D = 0;
        int L = 0;
        int R = 0;

        for (int i = 0; i < n; i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                U++;
            }
            else if (ch == 'D') {
                D++;
            }
            else if (ch == 'R') {
                R++;
            }
            else {
                L++;
            }
        }

        return (L == R && U == D); 
    }
}