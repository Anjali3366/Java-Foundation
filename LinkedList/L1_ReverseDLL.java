public class L1_ReverseDLL {

    // Node class
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int d, Node n, Node p) {
            data = d;
            next = n;
            prev = p;
        }

        public Node(int d) {
            data = d;
            next = null;
            prev = null;

        }
    }

    // covert the arr into DLL
    public static Node covert(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node n = new Node(arr[i], null, temp);
            temp.next = n;
            temp = temp.next;
        }

        return head;
    }

    // function for printing linked list
    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -- ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }

    // reverse the LL - with data
    public static Node reverseDLL(Node head) {
        Node start = head;
        Node end = head;
        while (end.next != null) {
            end = end.next;
        }

        while (start != end) {
            int temp = start.data;
            start.data = end.data;
            end.data = temp;

            start = start.next;
            end = end.prev;
        }

        return head;
    }

    // reverse the DLL - using links

    public static Node reverseWithLinks(Node head) {
        Node curr = head;
        while (curr != null) {
            // swap the links

            Node last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;
            head = curr;
            curr = curr.prev;

        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 7, 9 };
        Node head = covert(arr);
        printDLL(head);
        head = reverseDLL(head);
        printDLL(head);
        head = reverseWithLinks(head);
        printDLL(head);

    }
}
