public class B4_DiameterOfTree {
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

    public static int height(Node root, int[] maxi) {
        if (root == null)
            return 0;

        int lh = height(root.left, maxi);
        int rh = height(root.right, maxi);
        maxi[0] = Math.max(maxi[0], lh + rh);

        return Math.max(lh, rh) + 1;
    }

    public static int findDiameter(Node root) {
        int dia[] = new int[1];
        int height = height(root, dia);
        System.out.println("Height of the tree : " + height);
        return dia[0];

    }

    public static void main(String args[]) {
        Node root = buildTree();
        System.out.println(
                "Diameter of the tree : " + findDiameter(root));
    }

}
