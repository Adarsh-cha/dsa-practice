class Solution {
    public List<Integer> findGoodIntegers(int n) {
        double limit = (int) Math.cbrt(n);

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Long, Integer> map = new HashMap<>();

        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                long sum = (a * a * a) + (b * b * b);

                if (sum <= n) {
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                answer.add(entry.getKey().intValue());
            }
        }
        Collections.sort(answer);

        return answer;
    }
}