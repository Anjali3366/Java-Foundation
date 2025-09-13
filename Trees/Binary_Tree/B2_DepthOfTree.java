public class B2_DepthOfTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int key) {
            val = key;
            left = null;
            right = null;
        }

    }

    public static Node buildTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(7);

        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(8);

        return root;
    }

    public static int depthOfTree(Node root) {
        if (root == null)
            return 0;

        int lh = depthOfTree(root.left);
        int rh = depthOfTree(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("PreOrder Traversal ");
        preOrder(root);
        System.out.println();
        System.out.println("Depth of tree : " + depthOfTree(root));

    }
}
