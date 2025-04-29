import java.util.Scanner;

public class P5_diamond {
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the row: ");
       int n = scn.nextInt();

      int tl = 2*n-1;
      int cl =1;
      int spaces = n-1;
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
         if(cl<n){
            spaces--;
            stars+=2;
         }else{
            spaces++;
            stars-=2;
         }
          cl++;
      }
      
      
  }
}
