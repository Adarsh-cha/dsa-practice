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
    public TreeNode createBinaryTree(int[][] descriptions) {
        int n = descriptions.length;
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++ ) {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            int isLeft = descriptions[i][2];

            set.add(child);
            TreeNode node = null;
            TreeNode ch = null;
            if (!map.containsKey(parent)) {
                node = new TreeNode(parent);
                map.putIfAbsent(parent, node);
            }
            if (!map.containsKey(child)) {
                ch = new TreeNode(child);
                map.putIfAbsent(child, ch);
            }

            TreeNode currParent = map.get(parent);
            if (isLeft == 1) {
                currParent.left = map.get(child);
            }
            else {
                currParent.right = map.get(child);
            }
        }

        for (int i = 0; i < n; i++ ) {
            int parent = descriptions[i][0];

            if (!set.contains(parent)) {
                return map.get(parent);
            }
        }
        return null;
    }
}