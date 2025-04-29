import java.util.Scanner;

public class P10_hollowRombus {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the row: ");
       int n = scn.nextInt();
    
      int tl = n;
      int cl =1;
      int spacesInner = -1;
      int spacesOuter = n/2;
      int stars = 1;
      while(cl<=n){
          // spaces 
          for(int j =0;j<spacesOuter;j++){
            System.out.print("  ");
        }
         // stars 
         for(int i =0;i<stars;i++){
            System.out.print("* ");
         }
          // spaces 
          for(int j =0;j<spacesInner;j++){
              System.out.print("  ");
          }
    
          // stars 
          for(int k =0;k<stars;k++){
            if(cl==1 || cl==tl){
                break;
            }
              System.out.print("* ");
          }
          // prepare next line
          System.out.println();
          if(cl<=n/2){
            spacesInner+=2;
            spacesOuter--;
          }else{
            spacesInner-=2;
            spacesOuter++;
          }
          cl++;
      }
      
      
    }
}
