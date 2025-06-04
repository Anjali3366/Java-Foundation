// statement -- Check if a String is palindrome or not !

public class R10_CheckPalindrome {

    // function with two pointer
    public static boolean checkPalindrome(String str, int left, int right) {

        // base case
        if (left >= right) {
            return true;
        }

        // hypothessis
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return checkPalindrome(str, left + 1, right - 1);

    }

    // function with one pointer
    public static boolean palindrome(String str, int i) {
        if (i >= str.length() / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
        return palindrome(str, i + 1);

    }

    public static void main(String[] args) {
        String str = "madsm";
        System.out.println(checkPalindrome(str, 0, str.length() - 1));
        System.out.println(palindrome(str, 0));

    }
}
