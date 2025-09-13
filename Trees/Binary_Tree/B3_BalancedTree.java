import java.util.*;

public class B3_BalancedTree {
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
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);

        root.left.left = new Node(8);
        root.left.right = new Node(12);

        root.right.left = new Node(22);
        root.right.right = new Node(25);
        return root;
    }

    public static void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);

    }

    public static boolean check(Node root) {
        return height(root) != -1;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;

        int lh = height(root.left);
        if (lh == -1)
            return -1;
        int rh = height(root.right);
        if (rh == -1)
            return -1;
        if (Math.abs(rh - lh) > 1)
            return -1;
        return Math.max(lh, rh) + 1;

    }

    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("InOrder Traversal : ");
        inOrder(root);
        System.out.println();
        System.out.println("Is it a balanced Tree ?  " + check(root));

    }

}
