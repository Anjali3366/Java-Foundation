// problem statement : Sum of natural number n using recursion  

public class R7_SumOfNatural {

    public static int sumOfNaturalNo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNo(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNaturalNo(n));

    }

}
