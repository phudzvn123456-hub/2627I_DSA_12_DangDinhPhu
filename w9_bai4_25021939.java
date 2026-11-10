class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class BSTLCA {
    public Node lowestCommonAncestor(Node root, Node n1, Node n2) {
        if (root == null)
            return null;
        if (root.data > n1.data && root.data > n2.data) {
            return lowestCommonAncestor(root.left, n1, n2);
        }
        if (root.data < n1.data && root.data < n2.data) {
            return lowestCommonAncestor(root.right, n1, n2);
        }
        return root;
    }
}