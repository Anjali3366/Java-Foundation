import java.util.Scanner;

public class P9_X {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the row: ");
       int n = scn.nextInt();
    
      int tl = 2*n-1;
      int cl =1;
      int spaces1 = 0;
      int spaces2 = 2;
      int stars =1;
      while(cl<=tl){
          // spaces 
          for(int j =0;j<spaces1;j++){
            System.out.print("  ");
        }
         // stars 
         for(int i =0;i<stars;i++){
            System.out.print("* ");
         }
          // spaces 
          for(int j =0;j<spaces1;j++){
              System.out.print("  ");
          }
    
          // stars 
          for(int k =0;k<stars;k++){
              System.out.print("* ");
          }
          // prepare next line
          System.out.println();
          spaces1++;
          cl++;
      }
      
      
    }
}
