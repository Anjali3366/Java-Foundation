import java.util.*;
// This is the second part of basic -- It include Iterative traversal of all type 

public class B1_basic2 {
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

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        return root;
    }

    // 1. Iterative PreOrder Traversal -- use of stack
    public static List<Integer> preOrder(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        if (root == null)
            return preOrder;
        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node curr = st.pop();
            preOrder.add(curr.data);

            if (curr.right != null)
                st.push(curr.right);

            if (curr.left != null)
                st.push(curr.left);
        }
        return preOrder;
    }

    // 2. Iterative InOrder Traversal -- use of stack
    public static List<Integer> inOrder(Node root) {
        List<Integer> inOrder = new ArrayList<>();

        if (root == null)
            return inOrder;

        Stack<Node> st = new Stack<>();
        Node n = root;
        while (true) {
            if (n != null) {
                st.push(n);
                n = n.left;
            } else {
                if (st.isEmpty())
                    break;

                n = st.pop();
                inOrder.add(n.data);
                n = n.right;
            }
        }
        return inOrder;

    }

    // 3. Iterative PostOrder TRaversal --- using two stacks
    public static List<Integer> postOrder(Node root) {
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        List<Integer> postOrder = new ArrayList<>();

        if (root == null)
            return postOrder;

        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if (root.left != null)
                st1.push(root.left);
            if (root.right != null)
                st1.push(root.right);
        }
        while (!st2.isEmpty()) {
            postOrder.add(st2.pop().data);
        }
        return postOrder;
    }

    // 4. Iterative PostOrder Traversal -- using one stack
    public static List<Integer> post(Node root) {
        List<Integer> post = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if (root == null)
            return post;

        Node curr = root;
        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.pop();
                    post.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.pop();
                        post.add(temp.data);
                    }
                } else
                    curr = temp;
            }

        }

        return post;

    }

    // 5. Iterative all Traversal
    public static class Pair {
        Node node;
        int num;

        public Pair(Node n, int num) {
            this.node = n;
            this.num = num;
        }

    }

    public static void allTraversal(Node root) {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();

        if (root == null)
            return;
        while (!st.isEmpty()) {
            Pair it = st.pop();
            if (it.num == 1) {
                preOrder.add(it.node.data);
                it.num++;
                st.push(it);
                if (it.node.left != null)
                    st.push(new Pair(it.node.left, 1));
            } else if (it.num == 2) {
                inOrder.add(it.node.data);
                it.num++;
                st.push(it);
                if (it.node.right != null)
                    st.push(new Pair(it.node.right, 1));
            } else {
                postOrder.add(it.node.data);
            }
        }

        System.out.println("PreOrder : " + preOrder);
        System.out.println("InOrder : " + inOrder);
        System.out.println("PostOrder : " + postOrder);
    }

    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("Iterative PreOrder Traversal : " + preOrder(root));
        System.out.println("Iterative Inorder Traversal : " + inOrder(root));
        System.out.println("Iterative PostOrder Traversal : " + postOrder(root));
        System.out.println("PostOrder using 1 Stack : " + post(root));
        allTraversal(root);

    }

}
