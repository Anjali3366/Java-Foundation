public class B2_Permutations {
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            // pick the current char
            char currChar = str.charAt(i);
            // remove kro string se
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + currChar);

        }
    }

    public static void main(String[] args) {

        String str = "anjali";
        findPermutation(str, "");
    }
}
