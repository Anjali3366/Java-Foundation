import java.util.Scanner;

public class P12_NumLeftTri {

        public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
           System.out.print("Enter the row: ");
           int n = scn.nextInt();
    
          int tl = n;
          int cl =1;
          int num =1;
          int digit1 =0;
          int digit2 =1;
          while(cl<=tl){
            
              // stars 
              for(int i =1;i<=num;i++){
                  System.out.print(digit1 + " ");
                  int digit = digit1+digit2;
                  digit1 =digit2;
                  digit2 = digit;
    
            
              }
              // prepare next line
              System.out.println();
              num++;
              cl++;
          }
          
        
      }
}
