// problem statement -- given a head of linklist that store a number which at each node each digit is present , you have to return head of linked list by adding one to number ;

//eg :  1--> 5--> 9  return  1--> 6 --> 0

public class L8_Add1ToNo {
    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

        public Node(int d, Node n) {
            data = d;
            next = n;
        }

    }

    public static Node createList() {
        Node head = new Node(9);
        Node temp = head;

        for (int i = 2; i < 5; i++) {
            Node n = new Node(9);
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

    public static Node reverse(Node head) {
        Node temp = head;
        Node front = null;
        Node prev = null;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static Node addOneToNum(Node head) {
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while (temp != null) {
            temp.data += carry;

            if (temp.data < 10) {
                carry = 0;
                break;

            } else {
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;
        }

        if (carry == 1) {
            Node n = new Node(1);
            head = reverse(head);
            n.next = head;
            return n;
        }
        head = reverse(head);

        return head;
    }

    // without reverse function -- only way of back traversal in singly linked list
    // is recrusion
    public static Node optimized(Node head) {
        int carry = helper(head);
        if (carry == 1) {
            Node n = new Node(carry);
            n.next = head;
            return n;
        }
        return head;
    }

    public static int helper(Node temp) {
        if (temp == null) {
            return 1;
        }
        int carry = helper(temp.next);
        temp.data += carry;
        if (temp.data < 10) {
            return 0;
        }
        temp.data = 0;
        return 1;
    }

    public static void main(String[] args) {
        Node head = createList();
        printLL(head);

        // head = addOneToNum(head);
        // printLL(head);

        head = optimized(head);
        printLL(head);
    }

}
