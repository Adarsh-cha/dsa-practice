class Solution {
    public int minFlips(String s) {
        int n = s.length();

        if (n < 3){
            return 0;
        }
        
        int zero = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zero++;
            }
            else {
                one++;
            }
        }

        if (s.charAt(0) == '1' && s.charAt(n - 1) == '1') {
            return Math.min(zero, (one - 2));
        }
        else if (zero >= one && one > 1) {
            return one - 1;
        }
        else if (one > zero) {
            return zero;
        }
        else {
            return 0;
        }
    }
}