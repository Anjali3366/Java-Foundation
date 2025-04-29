import java.util.Scanner;

class P2_InvertedRighttri{

    public static void main(String args[]){
             Scanner scn = new Scanner(System.in);
         System.out.print("Enter the row: ");
         int row = scn.nextInt();

         for(int i=row;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}