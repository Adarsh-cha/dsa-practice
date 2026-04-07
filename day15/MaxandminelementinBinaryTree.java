/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    int max = Integer.MIN_VALUE;
    public int findMax(Node root) {
        // code here
        if (root == null) {
            return 0;
        }
        
        if (max < root.data) {
            max = root.data;
        }
        findMax(root.left);
        findMax(root.right);
        return max;
        
    }

    int min = Integer.MAX_VALUE;
    public int findMin(Node root) {
        // code here
        if (root == null) {
            return 0;
        }
        
        if (min > root.data) {
            min = root.data;
        }
        findMin(root.left);
        findMin(root.right);
        return min;
    }
}/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    int max = Integer.MIN_VALUE;
    public int findMax(Node root) {
        // code here
        if (root == null) {
            return 0;
        }
        
        if (max < root.data) {
            max = root.data;
        }
        findMax(root.left);
        findMax(root.right);
        return max;
        
    }

    int min = Integer.MAX_VALUE;
    public int findMin(Node root) {
        // code here
        if (root == null) {
            return 0;
        }
        
        if (min > root.data) {
            min = root.data;
        }
        findMin(root.left);
        findMin(root.right);
        return min;
    }
}