
public class R4_Fibonacci {

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        int fibo = fibonacci(n - 1) + fibonacci(n - 2);
        return fibo;
    }

    public static void main(String[] args) {
        int n = 23;

        System.out.println(fibonacci(n));
    }
}
