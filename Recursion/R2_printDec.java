
public class R2_printDec {

    public static void printDecr(int num) {
        // base case
        if (num < 0) {
            return;

        }

        // recursion + kaam
        System.out.println(num);
        num--;
        printDecr(num);
    }

    public static void main(String[] args) {
        int num = 10;
        printDecr(num);
    }
}
