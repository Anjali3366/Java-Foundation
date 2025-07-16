
import java.util.ArrayList;

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

    public static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;
        Node temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (list.get(list.size() - 1) != temp.data) {
                return false;
            }
            list.remove(list.size() - 1);
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 1 };
        Node head = convertToLL(arr);
        printLL(head);
        System.out.println(checkPalindrome(head));
    }

}
