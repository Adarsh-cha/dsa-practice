class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = healths.length;
        int s = directions.length();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(positions[a], positions[b]));

        List<Integer> answer = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i : arr) {

            if (directions.charAt(i) == 'R') {
                st.push(i);
            }
            else {
                while (!st.isEmpty() && healths[i] > 0) {
                    int prev = st.pop();
                    if (healths[prev] == healths[i]) {
                        healths[prev] = 0;
                        healths[i] = 0;
                        break;
                    }
                    else if (healths[prev] < healths[i]) {
                        healths[i] -= 1;
                        healths[prev] = 0;
                    }
                    else {
                        healths[prev] -= 1;
                        healths[i] = 0;
                        st.push(prev);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                answer.add(healths[i]);
            }
        }
        return answer;
    }
}