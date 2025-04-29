

import java.util.Scanner;

public class AnyBasetoAnyBase {
    public static int baseToDecimal(int n , int b ){
        int retValue =0;
        int pow =1;
        while(n>0){
            int lastdig = n%10;
            n/= 10;
           
            retValue = retValue+ (pow*lastdig);
            pow*=b;

        }
        return retValue;
    }
    
    public static int DecimalToAnyBase(int n, int b) {
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

    public static int anyBaseToBase(int n , int b1 ,int b2){
        int dec = baseToDecimal(n,b1);
        int rv = DecimalToAnyBase(dec,b2);
        return rv;
    }

    // This code is not working for binary number conversion !! 
    // public static int anyBaseToBase(int n, int b1, int b2 ){
    //     int retValue =0;
    //     int pow =1;

    //     while(n>0){
    //         int lastdig = n%b2;
    //     n/=b2;
    //     retValue += pow*lastdig;
    //     pow =pow*b1;

    //     }
    //     return retValue;
    // }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number , base1 and base2 : ");
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int convertNo = anyBaseToBase(n, b1, b2);
        System.out.println("Converted number : "+ convertNo);
    }
}
