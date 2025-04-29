import java.util.Scanner;

public class PrintReverseNo {
    public static void main(String args[]){
          Scanner scn = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scn.nextInt();
        while (n>0)  
        {
            int lastDigit = n%10;
            System.out.println(lastDigit);
            n/=10;
            
        }
    }
    
}
