class Solution {
    boolean[] prime = new boolean[2000001];
    
    public Solution() {
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= 200000; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 200000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && !prime[nums[i]]) {
                int tem = nums[i];
                while (!prime[tem]) {
                    tem++;
                }
                ans += tem - nums[i];
            }
            else if (i % 2 == 1 && prime[nums[i]]) {
                int tem = nums[i];
                while (prime[tem]) {
                    tem++;
                }
                ans += tem - nums[i];
            }
        }
        return ans;
    }
}©leetcode