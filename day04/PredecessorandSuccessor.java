/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    Node smaller = null;
    Node greater = null;
    void solve(Node root, int key) {
        if (root == null) {
            return;
        }
        
        solve(root.left, key);
        solve(root.right, key);
        if ((smaller == null || smaller.data < root.data) && root.data < key) {
            smaller = root;
        }
        
        if ((greater == null || greater.data > root.data) && root.data > key) {
            greater = root;
        }
    } 
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> result = new ArrayList<>();
        
        solve(root, key);
        result.add(smaller);
        result.add(greater);
        return result;
    }
}