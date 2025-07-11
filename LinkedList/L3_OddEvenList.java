
// problem statement -- Given an linked list return the linked list where odd indexed grouped and even indexed grouped!
import java.util.*;

public class L3_OddEvenList {

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

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static Node convertLL(int[] arr) {

        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node n = new Node(arr[i]);
            temp.next = n;
            temp = temp.next;
        }

        return head;
    }

    public static Node groupOddEvenIdx(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node odd = head;

        while (odd != null && odd.next != null) {
            list.add(odd.data);
            odd = odd.next.next;
        }

        if (odd != null)
            list.add(odd.data);

        Node even = head.next;

        while (even != null && even.next != null) {
            list.add(even.data);
            even = even.next.next;
        }
        if (even != null)
            list.add(even.data);

        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = list.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }

    public static Node optimized(Node head) {
        Node headE = head.next;
        Node odd = head;
        Node even = head.next;

        if (head == null || head.next == null) {
            return head;
        }

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = headE;

        return head;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Node LL = convertLL(arr);
        LL = optimized(LL);

        printLL(LL);

    }

}
