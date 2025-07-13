public class L4_Count012 {
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

    public static Node convertToLL(int[] arr) {
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

    // It is the brute force solution with two passes of N so we need an optimized
    // version --- we use data replacement
    public static Node count012(Node head) {
        Node temp = head;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        while (temp != null) {
            if (temp.data == 0)
                count0++;

            if (temp.data == 1)
                count1++;

            if (temp.data == 2)
                count2++;
            temp = temp.next;
        }
        temp = head;

        while (temp != null) {
            if (count0 > 0) {
                temp.data = 0;
                count0--;
            } else if (count1 > 0) {
                temp.data = 1;
                count1--;

            } else {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }

        return head;
    }

    // optimized version -- we use link change way
    public static Node optimized(Node head) {
        // time = O(n) space = O(1);
        if (head == null || head.next == null)
            return head;

        Node temp = head;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;

            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;

        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next; // important!
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 2, 0, 2, 2, 2, 0, 2 };
        Node head = convertToLL(arr);
        printLL(head);
        // head = count012(head);
        // printLL(head);
        head = optimized(head);
        printLL(head);

    }
}
