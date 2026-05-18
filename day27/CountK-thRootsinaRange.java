class Solution {
    public int countKthRoots(int l, int r, int k) {
        if (k == 1) {
            return r - l + 1;
        }
        int count = 0;

        int limit = (int)Math.pow(r, 1.0 / k);

        for (int i = 0; i <= limit + 1; i++) {
            long power = 1;
            for (int j = 0; j < k; j++) {
                power *= i;

                if (power > r)
                    break;
            }

            if (power > r) {
                break;
            }

            if (power >= l && power <= r)
                count++;
        }

        return count;
    }
}