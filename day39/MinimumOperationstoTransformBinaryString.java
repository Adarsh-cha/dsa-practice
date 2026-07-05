class Solution {
    public int minOperations(String s1, String s2) {
        int n = s1.length();
        int ans = 0;
        
        if (n == 1 && s1.charAt(0) == '1' && s2.charAt(0) == '0') {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (ch1 == '0' && ch2 == '1') {
                ans++;
            }
            else if (ch1 == '1' && ch2 == '0') {
                if ((i + 1) < n && s1.charAt(i + 1) == '1' && s2.charAt(i + 1) == '0') {
                    ans++;
                    i++;
                }
                else {
                    ans += 2;
                }
            }
        }
        return ans;
    }
}