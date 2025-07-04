
public class InsertInList {
    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
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
        System.out.println();
    }

    // Insertion at head
    public static Node insertAtHead(Node head, int val) {
        return new Node(val, head);

    }

    // Insertion at tail
    public static void insertAtTail(Node head, int val) {
        if (head == null)
            return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node n = new Node(val);
        temp.next = n;
    }

    // Insertion at Kth position
    public static Node insertAtKth(Node head, int val, int k) {
        if (head == null) {
            if (k == 1)
                return new Node(val);
        }
        if (k == 1) {
            head = insertAtHead(head, val);
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node n = new Node(val, temp.next);
                temp.next = n;
                break;
            }
            temp = temp.next;

        }

        return head;
    }

    // Insertion before the given value X

    public static Node insertBeforeVal(Node head, int ele, int x) {
        if (x == head.data) {
            head = insertAtHead(head, ele);
        }

        Node temp = head;
        boolean found = false;
        while (temp.next != null) {
            if (temp.next.data == x) {
                found = true;
                Node n = new Node(ele, temp.next);
                temp.next = n;
                break;

            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Given Value X not found in the LinkedList");
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 22 };
        Node head = convertToLL(arr);
        printLL(head);
        // head = insertAtHead(head, 4);
        // head = insertAtHead(head, 5);
        // printLL(head);
        // insertAtTail(head, 9);
        // printLL(head);

        // head = insertAtKth(head, 0, 1);
        // printLL(head);
        // head = insertAtKth(head, 32, 2);
        // printLL(head);
        head = insertAtKth(head, 34, 8);
        printLL(head);
        head = insertBeforeVal(head, 356, 27);
        printLL(head);
    }

}
