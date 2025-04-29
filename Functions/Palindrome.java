import java.util.Scanner;

public class Palindrome {
     public static boolean palindrome(int n){
        int retValue =0;
        int pow=0;
        int temp =n;
        while(temp>0){
            pow++;
            temp/=10;
        }
        int mul = (int) Math.pow(10, pow-1);
        int temp2 =n;
        while(temp2>0){
            int lastdig = temp2%10;
            temp2/=10;
            retValue +=lastdig*mul;
            mul/=10;
        }
        if(retValue == n){
            return true;
        }

        return false;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        boolean pal = palindrome(n);
        System.out.println("Is it palindrome?  " + pal);
    }
    
}
