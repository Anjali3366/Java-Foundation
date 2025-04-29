import java.util.*;


public class SumOfDigit {
    public static int sumOfDigit(int n){
        int rv =0;

        while(n>0){
            int lastdig = n%10;
            n/=10;
            rv = rv+lastdig;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        int sum = sumOfDigit(n);
        System.out.println("Sum of digit = " + sum);
    }
    
}
