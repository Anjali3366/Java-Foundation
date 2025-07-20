public class L10_DetectLoop {

    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

    }

    public static Node createLL(int[] arr1) {

        Node head = new Node(arr1[0]);
        Node temp = head;
        for (int i = 1; i < arr1.length; i++) {
            Node n = new Node(arr1[i]);
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

    // for detecting loop we have naive approach using hashing
    // 1. hashing

    // 2. hare and tortoise method
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    // length of loop 1. using hashing (brute approach) 2. hare and
    // tortoise(optimized)
    // public static int findLength(Node head) {

    // }

    public static int optimized(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return findL(slow, fast);

        }
        return 0;
    }

    public static int findL(Node slow, Node fast) {
        int count = 1;
        fast = fast.next;
        while (slow != fast) {
            count++;
            fast = fast.next;

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 7, 8, 9 };
        Node head = createLL(arr);
        printLL(head);
        System.out.println(detectLoop(head));
        System.out.println(optimized(head));
    }

}
