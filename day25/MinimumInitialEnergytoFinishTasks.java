class Solution {
    public int minimumEffort(int[][] tasks) {
        int n = tasks.length;

        Arrays.sort(tasks, (a, b) -> {
            return (b[1] - b[0]) - (a[1] - a[0]);
        });

        int max = -1;
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, tasks[i][1]);
            sum += tasks[i][0];
        }

        if (max > sum) {
            sum = max;
        }
        
        temp = sum;
        for (int i = 0; i < n; i++) {
            if (temp >= tasks[i][1]) {
                temp -= tasks[i][0];
            }
            else {
                sum += (tasks[i][1] - temp);
                temp += (tasks[i][1] - temp);
                temp -= tasks[i][0];
            }
        }
        return sum;
    }
}