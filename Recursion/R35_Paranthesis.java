// Statement - Given the integer n and you have to print balance paranthesis 
// Eg = n =2 then output : ()(), (())

public class R35_Paranthesis {
    public static void printParanthesis(int n) {
        int open = n;
        int close = n;

    }

    public static void solve(int open, int close, StringBuilder str) {
        // base condition
        if (open == 0 && close == 0) {
            System.out.println(str);
            return;
        }

        // open choice

        // close choice
    }

    public static void main(String[] args) {
        printParanthesis(3);
    }

}
