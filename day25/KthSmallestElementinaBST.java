//Brute one
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void dfs(TreeNode root, ArrayList<Integer> s) {
        if (root == null) {
            return;
        }

        dfs(root.left, s);
        s.add(root.val);
        dfs(root.right, s);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> s = new ArrayList<>();

        dfs(root, s);
        Collections.sort(s);

        for (int i = 0; i < s.size(); i++) {
            if (i + 1 == k) {
                return s.get(i);
            }
        }
        return -1;
    }
}

//optimal one
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    int ans = 0;
    
    void dfs(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        dfs(root.left, k);
        count++;
        
        if (count == k) {
            ans = root.val;
            return ;
        }
        dfs(root.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);

        return ans;
    }
}