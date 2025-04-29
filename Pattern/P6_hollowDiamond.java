import java.util.Scanner;

public class P6_hollowDiamond {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the row: ");
       int n = scn.nextInt();

      int tl = 2*n-1;
      int cl =1;
      int spaces = 1;
      int stars =n;
      while(cl<=tl){
           // stars 
           for(int i =0;i<stars;i++){
            System.out.print("* ");
           }
          // spaces 
          for(int j =0;j<spaces;j++){
              System.out.print("  ");
          }

          // stars 
          for(int k =0;k<stars;k++){
              System.out.print("* ");
          }
          // prepare next line
          System.out.println();

          if(cl<n){
            stars--;
            spaces+=2;
          }else{
            stars++;
            spaces-=2;
          }

          cl++;
      }
      
    }
  }

