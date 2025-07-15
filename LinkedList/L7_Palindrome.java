public class L7_Palindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
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

    public static void main(String[] args) {

    }

}
