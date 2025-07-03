public class Deletion {

    public static class Node {
        int data;
        Node next;

        public Node(int val) {
            data = val;
            next = null;
        }

        public Node(int val, Node next) {
            data = val;
            this.next = next;
        }
    }

    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;

    }

    public static void printLL(Node head) {
        Node mover = head;
        while (mover != null) {
            System.out.print(mover.data + " --> ");
            mover = mover.next;
        }
        System.out.println();
    }

    // delete from head
    public static Node deleteFromHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    // delete from tail
    public static void deleteFromTail(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node mover = head;
        while (mover.next.next != null) {
            mover = mover.next;
        }
        mover.next = null;
    }

    // delete kth Node
    public static Node deleteKthNode(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;

        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    // delete Node that had given value
    public static Node deleteNodeWithVal(Node head, int val) {
        if (head == null)
            return head;

        Node temp = head;
        Node prev = null;
        while (temp != null) {

            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 7 };
        Node head = convertArrToLL(arr);
        printLL(head);
        // System.out.println(head.next.data);
        // head = deleteFromHead(head);
        // printLL(head);
        // deleteFromTail(head);

        // printLL(head);
        // head = deleteKthNode(head, 2);
        // printLL(head);
        head = deleteNodeWithVal(head, 4);
        printLL(head);

    }

}
