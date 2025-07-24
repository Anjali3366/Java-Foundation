public class B10_PowerOf2 {
    public static boolean powerof2(int n) {
        return n != 0 && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(powerof2(17));

    }

}
