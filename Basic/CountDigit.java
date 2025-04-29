import java.util.*;

public class CountDigit {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scn.nextInt();
        int count = 0;
        for (int i = n; i >= 0;i-- ) {
            count++;
            System.out.println("Before divide "+ i);
            i /= 10;
            System.out.println(i);
        
        }
        System.out.println("There are " + count + " digit in given number !");
        System.out.println(n);
    }

}
