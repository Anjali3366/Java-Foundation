// problem statement -- delete the nth node from the last in linked list ...

public class L5_DelNthfromLast {
    public static class Node {
        int data;
        Node next;

        public Node(int d, Node n) {
            data = d;
            next = n;
        }

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node convertLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node n = new Node(arr[i]);
            temp.next = n;
            temp = temp.next;
        }

        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 7, 8, 9, 11 };

        Node head = convertLL(arr);
        printLL(head);

    }

}
