// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2^x.

public class R30_PowerOfTwo {
    public static boolean isPowerOfTwo(int n, int expo) {
        if (expo == n) {
            return false;
        }
        int pow = (int) Math.pow(2, expo);
        if (n == pow) {
            return true;
        }
        return isPowerOfTwo(n, expo + 1);

    }

    // optimized version
    public static boolean PowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n % 2 != 0) {
            return false;
        }
        return PowerOfTwo(n / 2);
    }

    public static boolean isPower(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2, 0));
        System.out.println(PowerOfTwo(17));
        System.out.println(isPower(30));
    }

}
