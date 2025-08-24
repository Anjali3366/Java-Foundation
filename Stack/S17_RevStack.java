import java.util.*;

public class S17_RevStack {
    public static void printSt(Stack<Integer> st) {
        for (int i = st.size() - 1; i >= 0; i--) {
            System.out.println(st.get(i));
        }
    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty())
            return;

        int temp = st.pop();
        reverse(st);
        insertAtBottom(st, temp);
    }

    private static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        printSt(st);
        reverse(st);
        System.out.println("After reversing : ");
        printSt(st);

    }

}
