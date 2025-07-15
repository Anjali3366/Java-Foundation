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

    public static Node deleteNthNode(Node head, int n) {

        Node temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n == size) {
            return head.next;
        }

        int preVal = size - n;
        int count = 0;
        temp = head;
        while (temp != null) {
            count++;
            if (count == preVal)
                break;
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }

    public static Node optimized(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;

        // Move fast ahead by n+1 steps
        for (int i = 0; i <= n; i++) {
            if (fast == null)
                return head; // n > length
            fast = fast.next;
        }

        // Move both until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 7, 8, 9, 11 };

        Node head = convertLL(arr);
        printLL(head);
        // head = deleteNthNode(head, 7);
        // printLL(head);
        head = optimized(head, 7);
        printLL(head);

    }

}
