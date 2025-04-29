import java.util.Scanner;

public class P7_diagonal {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the row: ");
       int n = scn.nextInt();

      int tl = n;
      int cl =1;
      int spaces = 0;
      int stars =1;
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
          spaces++;
          cl++;
      }
      
      
  }
}
