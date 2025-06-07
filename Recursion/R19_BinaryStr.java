// Statement -- Case 1 : Print all binary strings of size N without consecutive ones 
// Case 2 : print all binary strings of size N without consecutive zeroes

public class R19_BinaryStr {

    // First Case
    public static void findBinaryString(int lastPlace, String str, int n) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        // zero bithao
        findBinaryString(0, str + "0", n - 1);

        // agar lastplace zero hai toh 1 ko bithao
        if (lastPlace == 0) {
            findBinaryString(1, str + "1", n - 1);
        }

    }

    // Second Case -- by using StringBuilder
    public static void printBinaryString(int lastPlace, StringBuilder str, int n) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        // 1 ko bithao
        printBinaryString(1, str.append("1"), n - 1);
        str.deleteCharAt(str.length() - 1);
        if (lastPlace == 1) {
            printBinaryString(0, str.append("0"), n - 1);
            str.deleteCharAt(str.length() - 1);

        }
    }

    public static void main(String[] main) {
        // first case call
        // findBinaryString(0, "", 4);

        // second Case call
        printBinaryString(1, new StringBuilder(""), 5);

    }

}
