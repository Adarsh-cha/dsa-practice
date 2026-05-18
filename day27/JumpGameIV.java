class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;
        int step = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {
                int curr = q.poll();

                int left = curr - 1;
                int right = curr + 1;

                if (curr == n - 1) {
                    return step;
                }
                if (left >= 0 && !vis[left]) {
                    vis[left] = true;
                    q.offer(left);
                }

                if (right <= n - 1 && !vis[right]) {
                    vis[right] = true;
                    q.offer(right);
                }
                
                if(map.containsKey(arr[curr])) {
                    for (int val : map.get(arr[curr])) {
                        if (!vis[val]){
                            q.offer(val);
                            vis[val] = true;
                        }
                    }

                    map.remove(arr[curr]);
                }
            }
            step++;
        }
        return -1;
    }
}