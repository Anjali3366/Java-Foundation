import java.util.Scanner;

public class ReverseNum {
    public static int reverse(int n){
        int retValue =0;
        int pow=0;
        int temp =n;
        while(temp>0){
            pow++;
            System.out.println(pow);
            temp/=10;
        }
        int mul = (int) Math.pow(10, pow-1);

        while(n>0){
            int lastdig = n%10;
            n/=10;
            retValue +=lastdig*mul;
            mul/=10;
        }

        return retValue;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        int rev = reverse(n);
        System.out.println("Reverse Number = " + rev);
    }
    
}
