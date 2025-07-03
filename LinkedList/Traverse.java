
public class Traverse {
    public static class Node {
        int data;
        Node next;

        public Node(int d, Node next) {
            data = d;
            this.next = next;
        }

        public Node(int d) {
            data = d;
            next = null;
        }

    }

    public static Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);

        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

    public static int sizeOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 17, 12, 7, 9, 10 };
        Node head = convertToLL(arr);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;

        }
        System.out.println();

        System.out.println("Size Of LL " + sizeOfLL(head));
    }

}
