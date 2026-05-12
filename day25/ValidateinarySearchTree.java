//Brute
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
    void dfs(TreeNode root, ArrayList<Integer> s ) {
        if (root == null) {
            return;
        }

        dfs(root.left, s);
        s.add(root.val);
        dfs(root.right, s);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> s = new ArrayList<>();

        dfs(root, s);

        for (int i = 1; i < s.size(); i++) {
            if (s.get(i - 1) >= s.get(i)) {
                return false;
            }
        }
        return true;
    }
}

// Opti
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
    boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.val <= min) {
            return false;
        }
        if (max != null && root.val >= max) {
            return false;
        }

        return dfs(root.left, min, root.val) &&
        dfs(root.right, root.val, max);
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }
}