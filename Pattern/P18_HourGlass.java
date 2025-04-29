import java.util.Scanner;

public class P18_HourGlass {
        public static void main(String args[]){
          Scanner scn = new Scanner(System.in);
         System.out.print("Enter the row: ");
         int n = scn.nextInt();
         int tl = n;
         int cl = 1;
         int star = n;
         int spaces =0;

         while(cl<=tl){
          // spaces 
          for(int i =0;i<spaces;i++){
            System.out.print("  ");
          }

          // stars 
          for(int j =0;j<star;j++){
            if(j>0 && j<star-1 && cl>1 && cl<n/2+1){
              System.out.print("  ");
            }else{
              System.out.print("* ");
            }
           
          }

          // next line 
          System.out.println();
        
          if(cl<=tl/2){
            star-=2;
            spaces++;

          }else{
            star+=2;
            spaces--;
          }
          cl++;
         }


         
    }
}
