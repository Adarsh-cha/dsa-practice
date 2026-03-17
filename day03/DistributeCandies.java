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
    int move = 0;
    int dfs(Node root) {
        if (root == null) {
            return 0;
        }
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        int val = root.data + left + right - 1;
        move += Math.abs(left) + Math.abs(right);
        return val;
    }
    public int distCandy(Node root) {
        // code here
        dfs(root);
        return move;
    }
}