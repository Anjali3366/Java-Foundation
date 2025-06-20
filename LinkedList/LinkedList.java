class Node {
    int data;
    Node next;

    public Node(int n, Node next) {
        this.data = n;
        this.next = next;
    }

}

public class LinkedList {
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        Node node1 = new Node(2, null);
        head = node1;
        Node node2 = new Node(3, null);
        node1.next = node2;
        tail = node2;
        Node temp = head;
        Node node3 = new Node(4, null);
        node2.next = node3;
        tail = node3;

        int count = 0;

        while (temp != null) {
            count++;
            System.out.print(temp.data + "-->");
            temp = temp.next;

        }
        System.out.println();
        System.out.println("Length of Linked List " + count);
        System.out.println("Head of LL " + head.data);
        System.out.println("Tail Of LL :  " + tail.data);
    }

}
