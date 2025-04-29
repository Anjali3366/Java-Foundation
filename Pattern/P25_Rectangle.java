import java.util.Scanner;

public class P25_Rectangle {
        public static void main(String args[]){
          Scanner scn = new Scanner(System.in);
         System.out.print("Enter the width : ");

         int row = scn.nextInt();
         System.out.print("Enter the length : ");
         int col = scn.nextInt();

         for(int i =0 ;i<row;i++){
          for(int j =0;j<col;j++){
            System.out. print("* ");
          }
          System.out.println();
         }
         
    }
}
