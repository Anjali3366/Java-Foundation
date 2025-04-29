import java.util.Scanner;

public class P14_TablePattern {
    
        public static void main(String args[]){
          Scanner scn = new Scanner(System.in);
         System.out.print("Enter the number for table : ");
         int n = scn.nextInt();
         
         for(int i =1 ;i<=10;i++){
          System.out.println(n + " * "+ i+" = " + n*i);
         }
         
    }
    
}
