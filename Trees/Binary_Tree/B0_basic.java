// Traversal can be done in two ways -- 1. Depth first search (PreOrder, Inorder, PostOrder)        2. Breadth first search(Level Order)

import java.util.*;

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

    // Level Order Traversal in a binary tree
    public static void levelOrder(Node root) {
        // use a queue
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
        }

    }

    // return array list
    public static List<List<Integer>> levelOr(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = q.remove();
                level.add(curr.data);

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            result.add(level);
        }
        return result;
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
        System.out.println("Level Order Traversal : ");
        levelOrder(root);

        System.out.println("Stored Ans : " + levelOr(root));

        System.out.println("Number of Nodes in tree : " + noOfNode(root));
        System.out.println("Height of tree : " + heightTree(root));

        System.out.println("Sum of the Nodes in the tree : " + sum(root));

    }
}
