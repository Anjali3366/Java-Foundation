import java.util.Scanner;

public class P15_numDiamond {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the row: ");
    int row = scn.nextInt();
    int tl = row;
    int curLine = 1;
    int space = row / 2;
    int star = 1;
    int digit =1;

    for (int j = 0; j < row; j++) {

      // print spaces
      for (int i = 0; i < space; i++) {
        System.out.print("  ");
      }
      // int star
      int cdigit = digit;

      for (int i = 0; i < star; i++) {
       
        System.out.print( (cdigit) + " ");
      if(i<star/2){
          cdigit++;
      }else{
        cdigit--;
      }

      }

      // next line
      System.out.println();
      if (curLine <= row / 2) {
        space--;
        star+=2;
        digit++;

      } else {
        space++;
        star -= 2;
        digit--;
      }
      curLine++;
      
    }

  }
}
