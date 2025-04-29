import java.util.Scanner;

public class P16_halfNumbered {

        public static void main(String args[]){
          Scanner scn = new Scanner(System.in);
         System.out.print("Enter the row: ");
         int n = scn.nextInt();
         int tl =n ;
         int cl = 1;
         int stars =1;
         int spaces = 2*n-3;
      
      while(cl <=tl){
        int digit =1;
        // stars 
        for(int i = 0;i<stars ; i++){
         
          System.out.print(digit+" ");
          digit++;
        }

        // spaces 
        for(int j =0;j<spaces;j++){
          System.out.print("  ");
        }
          // stars 
           if(cl == tl ){
              stars--;
            }
          for(int i = 0;i<stars ; i++){
            digit --;
          
            System.out.print(digit+" ");
           
          }
        // next line 
        System.out.println();
        stars++;
        spaces=spaces-2;
        cl++;
      }
         
    }
}