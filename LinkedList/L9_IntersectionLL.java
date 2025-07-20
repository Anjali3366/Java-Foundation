public class L9_IntersectionLL {
    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

    }

    public static Node createLL(int[] arr1) {
        Node head = new Node(arr1[0]);
        Node temp = head;
        for (int i = 1; i < arr1.length; i++) {
            Node n = new Node(arr1[i]);
            temp.next = n;
            temp = temp.next;
        }
        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // There are 3 method that can be used for finding out intersection point

    // 1. using hashing --- brute force approach

    // 2. by shifting the second pointer make the pointer equal to one another

    // 3. using pointer --- that give O(n1+n2) time complexity and space -- O(1);

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 9 };
        int[] arr2 = { 1, 2, 4, 6, 7, 9 };
        Node head1 = createLL(arr);
        Node head2 = createLL(arr2);
        printLL(head2);
        printLL(head1);

    }

}
