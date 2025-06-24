public class Deletion {

    public class Node {
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

    public class LinkedList {
        Node tail;
        Node Head;

        public void deleteFromStart(Node head) {
            head = head.next;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 2, 9 };

    }

}
