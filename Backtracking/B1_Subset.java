// In this piece of code we are gonna find the subset from the given string 

public class B1_Subset {
    public static void subset(String str, String ans, int idx) {
        // base case
        if (idx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion + backtracking
        // yes choice
        subset(str, ans + str.charAt(idx), idx + 1);

        // No choice
        subset(str, ans, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(str, "", 0);
    }

}
