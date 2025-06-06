// statement -- find the length of string through recursion 

public class R13_FindLength {
    public static int findLength(String str, int count) {
        if (str.isEmpty()) {
            return count;
        }
        count++;
        count = findLength(str.substring(1), count);
        return count;

    }

    public static void main(String[] args) {
        String str = "anjali tomar";
        System.out.println(findLength(str, 0));
    }

}
