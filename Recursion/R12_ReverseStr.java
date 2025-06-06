// statement -- print the reverse of a string using recursion by 3 approach

public class R12_ReverseStr {

    // The idea for this approach is to make a recursive call for the substring
    // starting from the second character and then print the first character.
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String name = "Anjali";
        System.out.println(reverse(name));
        ;
    }

}
