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

//My approach..
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
    TreeNode makeTree(int i, int n, ArrayList<Integer> arr) {
        if (i > n) {
            return null;
        }

        int val = arr.get(i);
        TreeNode node = new TreeNode(val);

        node.left = null;
        node.right = makeTree(i + 1, n, arr);
        return node;
    }
}

// using using recurion without using arraylist..
class Solution {
    TreeNode prev = null;
    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.right);
        dfs(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
    public TreeNode flatten(TreeNode root) {
        dfs(root);

        return root;
    }
}

//using stack
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
    public TreeNode flatten(TreeNode root) {
        if (root == null) {
            return root;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode curr = st.peek();
            st.pop();

            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }

            if (!st.isEmpty()) {
                curr.right = st.peek();
            }
            curr.left = null;
        }
        return root;
    }
}

// Morris traverse
class Solution {
    public TreeNode flatten(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }

                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
        return root;
    }
}