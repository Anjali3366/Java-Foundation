import java.util.Scanner;

public class P4_InvertedTriangle{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the row: ");
       int n = scn.nextInt();

      int tl = n;
      int cl =1;
      int spaces = 0;
      int stars =n;
      while(cl<=tl){
          // spaces 
          for(int i =0;i<spaces;i++){
              System.out.print("  ");
          }

          // stars 
          for(int i =0;i<stars;i++){
              System.out.print("* ");
          }
          // prepare next line
          System.out.println();
          stars--;
          spaces++;
          cl++;
      }
      
      
  }
}