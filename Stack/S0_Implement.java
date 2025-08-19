import java.util.*;

public class S0_Implement {

    // Implementation of stack using Arrays
    public static class ArrStack {
        static int s = 10;
        static int[] st = new int[10];
        static int top = -1;

        // push function
        public static void push(int n) {

            if (top == s - 1) {
                System.out.println("Stack overflow");

            }
            top++;
            st[top] = n;
        }

        // pop
        public static int pop() {
            if (top == -1) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int ele = st[top];
            top--;
            return ele;

        }

        // top or peek
        public static int peek() {
            if (top == -1) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return st[top];
        }

        // size
        public static int size() {

            return top + 1;
        }
    }

    // Implementation of stack using ArrayList
    public static class listStack {
        static ArrayList<Integer> stack = new ArrayList<>();

        public static void push(int n) {
            stack.add(n);
        }

        public static int pop() {
            if (stack.size() == 0) {
                System.out.println("Stack is empty");
                return -1;
            }

            return stack.remove(stack.size() - 1);

        }

        public static int peek() {
            if (stack.size() == 0) {
                System.out.println("Stack is empty !");
                return -1;
            }
            return stack.get(stack.size() - 1);
        }

        public static int size() {
            return stack.size();
        }

    }

    // Implementation of stack using LinkedList
    public static class Node {
        int data;
        Node next;

        public Node(int n) {
            data = n;
            next = null;
        }

    }

    public static class LLStack {
        static int s = 0;
        static Node top = null;

        public static void push(int n) {
            Node temp = new Node(n);
            temp.next = top;
            top = temp;
            s += 1;
        }

        public static int pop() {
            if (s == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int n = top.data;
            top = top.next;
            s -= 1;
            return n;
        }

        public static int peek() {
            if (s == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        public static int size() {
            return s;
        }

    }

    // Implementation of Stack using two queue

    // Implementation of queue using stack

    // Implementation usinng recursion

    public static void main(String[] args) {
        // ArrStack st = new ArrStack();
        // st.push(1);

        // st.push(2);
        // st.push(3);
        // st.push(4);
        // while (st.top != -1) {
        // System.out.println(st.pop());
        // }

        // listStack st = new listStack();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(40);

        // System.out.println("Top: " + st.peek());
        // System.out.println("Popped: " + st.pop());
        // System.out.println("Size: " + st.size());

        LLStack st = new LLStack();

        st.push(3);
        st.push(4);
        st.push(9);
        st.push(1);

        System.out.println("top " + st.peek());
        System.out.println("deleted " + st.pop());
        System.out.println("deleted " + st.pop());
        System.out.println("deleted " + st.pop());

        System.out.println("top " + st.peek());

        System.out.println("size " + st.size());
        System.out.println("deleted " + st.pop());
        System.out.println("top " + st.peek());

        System.out.println("size " + st.size());
        System.out.println("deleted " + st.pop());

    }
}
