
public class B0_basic {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int key) {
            data = key;
            left = null;
            right = null;
        }

    }

    // PreOrder traversal in Binary tree
    public static void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // InOrder Traversal in a Binary tree
    public static void inOrder(Node root) {
        // base case
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // PostOrder Traversal in a Binary tree
    public static void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Function that find the height of the binary tree
    public static int heightTree(Node root) {
        if (root == null)
            return 0;

        int lh = heightTree(root.left);
        int rh = heightTree(root.right);

        return Math.max(lh, rh) + 1;

    }

    // function that find the nodes in a binary tree
    public static int noOfNode(Node root) {
        if (root == null)
            return 0;

        int ln = noOfNode(root.left);
        int rn = noOfNode(root.right);
        return ln + rn + 1;
    }

    // function that find the sum of nodes in the binary tress

    public static int sum(Node root) {
        if (root == null)
            return 0;

        int ls = sum(root.left);
        int rs = sum(root.right);

        return ls + rs + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("PreOrder traversal : ");
        preOrder(root);
        System.out.println();

        System.out.println("InOrder traversal : ");
        inOrder(root);
        System.out.println();

        System.out.println("PostOrder traversal : ");
        postOrder(root);

        System.out.println();

        System.out.println("Number of Nodes in tree : " + noOfNode(root));
        System.out.println("Height of tree : " + heightTree(root));

        System.out.println("Sum of the Nodes in the tree : " + sum(root));

    }
}
