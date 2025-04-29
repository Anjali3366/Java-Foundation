import java.util.Scanner;

public class P21_Butterfly {
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
   System.out.print("Enter the row: ");
   int n = scn.nextInt();
   int tl =2*n ;
   int cl = 1;
   int stars =1;
   int spaces = 2*n-3;
while(cl <=tl){
  // stars 
  for(int i = 0;i<stars ; i++){
    System.out.print("* ");
  }

  // spaces 
  for(int j =0;j<spaces;j++){
    System.out.print("  ");
  }
    // stars 
    if(cl == tl/2){
      stars--;
    }

    for(int i = 0;i<stars ; i++){
    
      System.out.print("* ");
     
    }
    if(cl == tl/2){
      stars++;
    }
  // next line 
  System.out.println();
if(cl<n){
  stars++;
  spaces=spaces-2;

}

else{
  stars--;
  spaces = spaces+2;

}
cl++;
}
   
}
}
