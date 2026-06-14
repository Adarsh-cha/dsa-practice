class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int sqrSum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            digitSum += lastDigit;
            sqrSum += (lastDigit * lastDigit);
            n /= 10;
        }
        
        return sqrSum - digitSum >= 50;
    }
}