// statement -- Given a number, we need to find sum of its digits using recursion.

public class R14_SumOfDigit {
    public static int sumOfDigit(int num, int sum) {
        // base case
        if (num == 0) {
            return sum;
        }

        // kaam
        int lastDigit = num % 10;

        sum = sumOfDigit(num / 10, sum) + lastDigit;

        return sum;
    }

    public static void main(String[] args) {
        int num = 1111112;
        System.out.println(sumOfDigit(num, 0));
    }

}
