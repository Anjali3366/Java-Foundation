import java.util.*;
public class Factorial {
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number: ");
        int num = scn.nextInt();
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println(fact);

    }
}
