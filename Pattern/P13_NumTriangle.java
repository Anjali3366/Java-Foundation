import java.util.Scanner;

public class P13_NumTriangle {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the row: ");
       int n = scn.nextInt();

      int tl = n;
      int cl =0;
      int num =1;
      while(cl<=tl){
        
          // stars 
          for(int i =0;i<=num;i++){
              System.out.print(num + " ");
           
           

        
          }
          // prepare next line
          System.out.println();
          cl++;
          num++;
      }
      
    
  }
}