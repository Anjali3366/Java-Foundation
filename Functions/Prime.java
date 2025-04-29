import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        for(int i =2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int n = scn.nextInt();
        System.out.println("Given number is prime -- " +isPrime(n));
    }
    
}
