
import java.util.Scanner;


public class AnyBasetoDecimal {
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
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number and its base : ");
        int num = scn.nextInt();
        int base = scn.nextInt();
        int decimalVal = baseToDecimal(num,base);

        System.out.println("Decimal Value : " + decimalVal);

    }
}
