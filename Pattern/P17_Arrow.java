import java.util.Scanner;

public class P17_Arrow {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the row: ");
    int n = scn.nextInt();
    int tl = n;
    int cl = 1;
    int star = 1;
    int spaces = tl / 2;

    while (cl <= tl) {
      
       
      // print spaces
      for (int i = 0; i < spaces; i++) {
        if(cl == n/2+1){
          System.out.print("* ");
        }else{
          System.out.print("  ");

        }

   

      }

      // print stars
      for (int j = 0; j < star; j++) {
        System.out.print("* ");
      }
      // next line
      System.out.println();
      if (cl <= tl / 2) {
        star++;
      }  else {
        star--;
      }

      cl++;
    }

  }
}
