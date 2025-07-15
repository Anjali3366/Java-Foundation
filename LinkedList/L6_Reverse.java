import java.util.ArrayList;

public class L6_Reverse {

    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node createLL() {
        Node head = new Node(0);
        Node temp = head;
        for (int i = 1; i < 7; i++) {
            Node n = new Node(i);
            temp.next = n;
            temp = temp.next;

        }

        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // it is the brute force approach in which we use to change the data field of
    // the node
    // time -- O(2N) SPACE -- O(N)
    public static Node reverse(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            temp.data = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            temp = temp.next;
        }
        System.out.println(list);
        return head;
    }

    public static Node reverseLink(Node head) {
        Node temp = head;
        Node prev = null;
        Node front = null;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;

        }

        return prev;
    }

    public static Node recursive(Node temp, Node prev) {
        if (temp == null) {
            return prev;
        }
        Node front = temp.next;
        temp.next = prev;

        return recursive(front, temp);
    }

    public static void main(String[] args) {
        Node head = createLL();
        printLL(head);
        head = reverseLink(head);
        printLL(head);
        head = recursive(head, null);
        printLL(head);
    }
}
