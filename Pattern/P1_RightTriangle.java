

import java.util.Scanner;

public class P1_RightTriangle {
    public static void main( String args[]){
        Scanner scn = new Scanner(System.in);
         System.out.print("Enter the row: ");
         int row = scn.nextInt();

         for(int i=1;i<=row;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}
