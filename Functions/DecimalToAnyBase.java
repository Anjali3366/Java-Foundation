
//  Convert any decimal number to any base b 
import java.util.*;

public class DecimalToAnyBase {
    public static int convert(int n, int b) {
        int retValue = 0;
        int p =1;
        while (n > 0) {

            int lastdig = n % b;
            n/=b;
           
            retValue +=lastdig*p;
            p*=10;
            

        }
        return retValue;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number and base : ");
        int n = scn.nextInt();
        int b = scn.nextInt();

        int convertNo = convert(n, b);
        System.out.println("Converted Number : " + convertNo);

    }
}