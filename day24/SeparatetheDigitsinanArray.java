class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int tem = nums[n - 1 - i];
            
            while (tem > 0) {
                arr.add(tem % 10);
                tem /= 10;
            }
        }

        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(arr.size() - 1 - i);
        }
        return ans;
    }
}