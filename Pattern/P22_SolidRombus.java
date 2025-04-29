import java.util.Scanner;

public class P22_SolidRombus {
        public static void main(String args[]){
          Scanner scn = new Scanner(System.in);
         System.out.print("Enter the row: ");
         int n = scn.nextInt();
          int tl = n;
          int cl =1;
          int star = n;
          int spaces = n-1;

          while(cl<=tl){
            // spaces 
            for(int i =0;i<spaces;i++){
              System.out.print("  ");
            }

            // stars
            for(int j =0;j<star;j++){
              System.out.print( "* ");

            }

            // next line 
            System.out.println();
            cl++;
            spaces--;
          }
         
         
    }
}
