import java.util.Scanner;

public class Multiplication {
    public static int multiply(int b, int n1, int n2){
        int retValue =0;
        int pow =1;
        if(n1 ==0 || n2==0){
            return 0;
        }
        while(n2>0){
            int d2 = n2%10;
            n2/=10;
            int layer1 = singleDigitProduct(b, n1, d2);

            retValue = add(b, retValue, layer1*pow);
            pow *= 10;


           
            

        }

        return retValue;
    }

    public static int singleDigitProduct(int b, int n1 , int d2){
        int retValue =0;
        int carry =0;
        int pow =1;
        while(n1>0 || carry >0){
            int d1 = n1%10;
            n1/=10;
            int d = d1*d2+carry;
            carry = d/b;
             d = d%b;
            retValue += d*pow;
            pow =pow*10;

        }

        return retValue;
    }

    public static int add(int b, int n1 , int n2){
        int retValue =0;
        int c =0;
        int pow =1;

        while(n1>0 || c>0 || n2>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1 /=10;
            n2 /=10;
            int d =  d1+d2+c;
            c = d/b;
            d = d%b;

            retValue += d*pow;
            pow =pow*10;




        }

        return retValue;
    }

    
    public static void main(String[] args) {
             Scanner scn = new Scanner(System.in);

        System.out.println("Enter base and then Numbers : ");
        int b = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int mul = multiply(b , num1, num2);
        System.out.println("Product  : " + mul);
    }
    
}
