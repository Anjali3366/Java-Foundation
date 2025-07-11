// problem statment - given two linked list return the sum of two linked list in another linked list 

public class L2_AddNo {

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

    public static Node sumOfTwoLL(Node head1, Node head2) { // time = O(n1 +n2);

        Node dummy = new Node(-1);
        Node temp1 = head1;
        Node temp2 = head2;
        Node curr = dummy;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null)
                sum += temp1.data;
            if (temp2 != null)
                sum += temp2.data;

            Node n = new Node(sum % 10);
            carry = sum / 10;
            curr.next = n;

            if (temp1 != null)
                temp1 = temp1.next;
            if (temp2 != null)
                temp2 = temp2.next;
            curr = curr.next;

        }
        if (carry > 0) {
            Node last = new Node(carry);
            curr.next = last;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 5 };
        int[] arr2 = { 4, 5, 9, 9 };

        Node LL1 = convertToLL(arr1);
        Node LL2 = convertToLL(arr2);

        Node sum = sumOfTwoLL(LL1, LL2);

        printLL(LL1);
        printLL(LL2);
        printLL(sum);

    }

}
