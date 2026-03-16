/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static int countPath = 0;
    
    static void dfs(Node root, long currSum, int k, HashMap<Long, Integer> map) {
        if (root == null) {
            return;
        }
        
        currSum += root.data;
        
        if (map.containsKey(currSum - k)) {
            countPath += map.get(currSum - k);
        }
        
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        
        dfs(root.left, currSum, k, map);
        dfs(root.right, currSum, k, map);
        
        map.put(currSum, map.get(currSum) - 1);
    }
    public int countAllPaths(Node root, int k) {
        // code here
        HashMap<Long, Integer> map = new HashMap<>();
        countPath = 0;
        map.put(0l, 1);
        dfs(root, 0l, k, map);
        return countPath;
    }
}