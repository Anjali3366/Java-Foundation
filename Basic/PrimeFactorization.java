import java.util.*;
public class PrimeFactorization {
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = scn.nextInt();
       
        System.out.println("Your Factor : ");
      

        for(int i =2;i*i<=n;i++){
            while(n%i == 0){
                n =n/i;
                System.out.println(i);
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
