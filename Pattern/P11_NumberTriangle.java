import java.util.Scanner;

public class P11_NumberTriangle {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the row: ");
       int n = scn.nextInt();

      int tl = n;
      int cl =1;
      int num =1;
      int digit =1;
      while(cl<=tl){
        
          // stars 
          for(int i =1;i<=num;i++){
              System.out.print(digit + " ");
              digit++;
        
          }
          // prepare next line
          System.out.println();
          num++;
          cl++;
      }
      
      
  }
}