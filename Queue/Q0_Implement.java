
import java.util.ArrayList;

public class Q0_Implement {
    // Implementation of queue using arrays
    public static class ArrQueue {
        static int s = 10;
        static int currsize = 0;
        static int[] qu = new int[s];
        static int start = -1;
        static int end = -1;

        // push function
        public static void push(int n) {
            if (currsize == s) {
                System.out.println("Queue overflow!");
                return;
            }
            if (currsize == 0) {
                start = end = 0;
            } else {
                end = (end + 1) % s;
            }
            qu[end] = n;
            currsize += 1;

        }

        // pop function
        public static int pop() {
            if (currsize == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int ele = qu[start];
            if (currsize == 1) {
                start = end = -1;
            } else {
                start = (start + 1) % s;
            }
            currsize -= 1;
            return ele;

        }

        // peek function
        public static int peek() {
            if (currsize == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return qu[start];
        }

        // size function
        public static int size() {
            return currsize;
        }

    }

    // Implementation of queue using arrayList
    public static class ListQueue {
        static ArrayList<Integer> qu = new ArrayList<>();
        static int curr = 0;

        public static void push(int x) {

            qu.add(x);
            curr += 1;

        }

        public static int pop() {
            if (curr == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }

            curr -= 1;
            return qu.removeFirst();
        }

        public static int peek() {
            if (curr == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return qu.getFirst();
        }

        public static int size() {
            return qu.size();
        }

    }

    // Implementation of queue using linked list
    public static class Node {
        int data;
        Node next;

        public Node(int x) {
            data = x;
            next = null;
        }
    }

    public static class LLQueue {
        static Node start = null;
        static Node end = null;
        static int s = 0;

        public static void push(int n) {
            Node temp = new Node(n);
            if (start == null) {
                start = end = temp;

            } else {
                end.next = temp;
                end = temp;
            }
            s += 1;
        }

        public static int pop() {
            if (start == null) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int val = start.data;
            if (start.next == null) {
                start = end = null;
            } else {

                start = start.next;
            }
            s -= 1;
            return val;
        }

        public static int peek() {
            if (start == null) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return start.data;
        }

        public static int size() {
            return s;
        }
    }

    public static void main(String[] args) {
        // ArrQueue q = new ArrQueue();
        // q.push(4);
        // q.push(5);
        // q.push(8);
        // q.push(9);
        // q.push(2);
        // q.push(10);
        // System.out.println("top: " + q.peek());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("top: " + q.peek());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("top: " + q.peek());
        // System.out.println("size: " + q.size());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("size: " + q.size());
        // System.out.println("deleted : " + q.pop());

        // ListQueue q = new ListQueue();
        // q.push(4);
        // q.push(5);
        // q.push(8);
        // q.push(9);
        // q.push(2);
        // q.push(10);
        // System.out.println("top: " + q.peek());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("top: " + q.peek());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("top: " + q.peek());
        // System.out.println("size: " + q.size());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("deleted : " + q.pop());
        // System.out.println("size: " + q.size());
        // System.out.println("deleted : " + q.pop());

        LLQueue q = new LLQueue();
        q.push(4);
        q.push(5);
        q.push(8);
        q.push(9);
        q.push(2);
        q.push(10);
        System.out.println("top: " + q.peek());
        System.out.println("deleted : " + q.pop());
        System.out.println("deleted : " + q.pop());
        System.out.println("top: " + q.peek());
        System.out.println("deleted : " + q.pop());
        System.out.println("top: " + q.peek());
        System.out.println("size: " + q.size());
        System.out.println("deleted : " + q.pop());
        System.out.println("deleted : " + q.pop());
        System.out.println("deleted : " + q.pop());
        System.out.println("size: " + q.size());
        System.out.println("deleted : " + q.pop());

    }
}
