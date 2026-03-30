class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int n = s1.length();

        for (int i = 0; i < 2; i++) {
            if (!
                ((s1.charAt(i) == s2.charAt(i) && s1.charAt(i + 2) == s2.charAt(i + 2)) || 
                (s1.charAt(i) == s2.charAt(i + 2) && s1.charAt(i + 2) == s2.charAt(i)))) 
            {
                return false;
            }
        }
        return true;
    }
}