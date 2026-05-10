// recursion
/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int ceil = Integer.MAX_VALUE;
    int findCeil(Node root, int x) {
        // code here
        if (root == null) {
            return 0;
        }
        
        if (root.data == x) {
            ceil = x;
            return ceil;
        }
        else if (root.data > x) {
            if (ceil > root.data && ceil > x) {
                ceil = root.data;
            }
            findCeil(root.left, x);
        }
        else {
            findCeil(root.right, x);
        }
        
        return ceil == Integer.MAX_VALUE ? -1 : ceil
        ;
    }
}

// iterative
/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        int ceil = -1;
        
        while (root != null) {
            if (root.data == x) {
                return x;
            }
            
            if (root.data > x) {
                ceil = root.data;
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return ceil;
    }
}