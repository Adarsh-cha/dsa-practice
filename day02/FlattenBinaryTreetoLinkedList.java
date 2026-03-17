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
    void dfs(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        arr.add(root.val);
        dfs(root.left, arr);
        dfs(root.right, arr);
    }
    public TreeNode flatten(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr);

        TreeNode curr = root;
        for (int i = 0; i < arr.size(); i++) {
            curr.val = arr.get(i);
            curr.left = null;

            if (i + 1 < arr.size()) {
                curr.right = new TreeNode(arr.get(i + 1));
            } 
            else {
                curr.right = null;
            }

            curr = curr.right;
        }
        return root;
    }
}