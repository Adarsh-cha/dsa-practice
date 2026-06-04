// TC -> O(num2 - num1 + 1 * (num of digit i.e, (d)))
// SC -> O(d) but d is max 10^5 that is O(5) so practically O(1)

class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            String s = String.valueOf(i);

            if (s.length() < 3) {
                continue;
            }

            for (int j = 1; j < s.length() - 1; j++) {
                if (s.charAt(j - 1) > s.charAt(j) && s.charAt(j) < s.charAt(j + 1)) {
                    count++;
                }
                else if (s.charAt(j - 1) < s.charAt(j) && s.charAt(j) > s.charAt(j + 1)) {
                    count++;
                }
            }
        }
        return count;
    }
}