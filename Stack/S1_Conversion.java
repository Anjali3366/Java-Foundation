import java.util.*;

// If u want to check if a Char is digit or letter we can use -- 1. 
// if((s.charAt(i) >= 'A' && s.charAt(i)<='Z')||     (s.charAt(i)>='a' && s.charAt(i)<= 'z') ||         (s.charAt(i)>= '0' && s.charAt(i)<= '9')) {}

// or 2.  if (Character.isLetterOrDigit(c)){}

public class S1_Conversion {

    public static int prio(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return -1;
    }

    // Convertion -- 1. Infix to PostFix
    public static String infixToPostFix(String str) {
        StringBuilder s = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            char curr = str.charAt(i);

            if (Character.isLetterOrDigit(curr)) {
                s.append(curr);
            } else if (curr == '(') {
                st.push(curr);
            } else if (curr == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    s.append(st.pop());
                }
                st.pop(); // remove open parenthesis
            } else {
                while (!st.isEmpty() &&
                        (prio(curr) < prio(st.peek()) ||
                                (prio(curr) == prio(st.peek()) && curr != '^'))) {
                    s.append(st.pop());
                }
                st.push(curr);
            }

            i++;

        }

        while (!st.isEmpty()) {
            s.append(st.pop());
        }

        return s.toString();
    }

    // 2. Infix to Prefix
    public static String infixToPrefix(String str) {
        StringBuilder rev = new StringBuilder();

        // reverse the string str
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == '(')
                rev.append(')');
            else if (c == ')')
                rev.append('(');
            else
                rev.append(c);

        }

        // convert the rev string into postfix
        String postfix = infixToPostFix(rev.toString());

        // reverse the postfix to get infix
        return new StringBuilder(postfix).reverse().toString();
    }

    // 3. Postfix to Infix
    public static String postfixToInfix(String str) {
        Stack<String> st = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            String curr = "" + str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(curr);
            } else {
                String top1 = st.pop(); // right operand
                String top2 = st.pop();// left operand
                st.push("(" + top2 + curr + top1 + ")");
            }

            i++;
        }

        return st.peek();
    }

    // 4. Prefix to Infix
    public static String prefixToInfix(String str) {
        Stack<String> st = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            String curr = "" + ch;

            if (Character.isLetterOrDigit(ch)) {
                st.push(curr);
            } else {
                String left = st.pop();
                String right = st.pop();
                st.push("(" + left + curr + right + ")");
            }

        }

        return st.peek();
    }

    // 5. PostFix to Prefix
    public static String postfixToPrefix(String str) {
        Stack<String> st = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            String curr = "" + ch;
            if (Character.isLetterOrDigit(ch)) {
                st.push(curr);
            } else {
                String right = st.pop();
                String left = st.pop();
                st.push(curr + left + right);
            }
            i++;
        }

        return st.peek();
    }

    // 6. Prefix to PostFix
    public static String prefixToPostfix(String str) {
        Stack<String> st = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            String curr = "" + ch;

            if (Character.isLetterOrDigit(ch)) {
                st.push(curr);
            } else {
                String left = st.pop();
                String right = st.pop();
                st.push(left + right + curr);
            }
        }

        return st.peek();
    }

    public static void main(String[] args) {
        System.out.println("Infix to PostFix : " + infixToPostFix("(A+(B*C-(D/E^F)*G)*H)"));
        System.out.println("Infix to Prefix : " + infixToPrefix("(A+(B*C-(D/E^F)*G)*H)"));
        System.out.println("Postfix to Infix : " + postfixToInfix("ABC*DEF^/G*-H*+"));
        System.out.println("Prefix to Infix : " + prefixToInfix("+A*BC"));

        System.out.println("Postfix to Prefix : " + postfixToPrefix("AB/C^"));

        System.out.println("Prefix to Postfix : " + prefixToPostfix("+A*BC"));
    }
}
