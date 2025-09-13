public class B5_MaxSumPath {

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

        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.right.left.left = new Node(5);
        root.right.left.left.left = new Node(9);

        root.right.right.right = new Node(7);
        root.right.right.right.right = new Node(8);

        return root;
    }

    public static void main(String[] args) {
        Node root = buildTree();
        int[] sum = new int[1];
        sum[0] = Integer.MIN_VALUE;
        solve(root, sum);
        System.out.println("Maximum path sum : " + sum[0]);
    }

    public static int solve(Node root, int[] sum) {
        if (root == null)
            return 0;

        int lh = Math.max(0, solve(root.left, sum));
        int rh = Math.max(0, solve(root.right, sum));
        sum[0] = Math.max(sum[0], lh + rh + root.val);
        return Math.max(lh, rh) + root.val;
    }
}
