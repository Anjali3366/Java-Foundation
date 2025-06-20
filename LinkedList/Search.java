public class Search {

    public static class Node {
        int data;
        Node next;

        public Node(int n) {
            this.data = n;
            this.next = null;
        }

    }

    public static boolean search(Node head, int val) {
        // search the element
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;

        }
        return false;
    }

    public static void main(String[] args) {
        // creating the 4 nodes of LL
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        // creating head
        Node head = node1;

        System.out.println(search(head, 7));

    }

}
