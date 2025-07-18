public class SearchInLL {
    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

    }

    public static Node createLL() {
        Node head = new Node(1);
        Node temp = head;
        for (int i = 2; i < 6; i++) {
            Node n = new Node(i);
            temp.next = n;
            temp = temp.next;

        }

        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static int iterSearch(Node head, int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }

    public static int recSearch(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = recSearch(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public static void main(String[] args) {
        Node head = createLL();
        printLL(head);
        System.out.println(iterSearch(head, 2));
        System.out.println(recSearch(head, 5));
    }
}
