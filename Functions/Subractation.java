import java.util.Scanner;

public class Subractation {
    public static int sub(int b , int n1, int n2){
        int retValue =0;
        int borrow =0;
        int pow =1;

        while (n2>0||n1>0) {
            int d1 = n1%10;
            int d2 = n2%10;
            n1 /= 10;
            n2 /=10;

        
            int d = 0 ;
            d2 = d2+borrow;
            if(d2>=d1){
                borrow =0;
                d = d2 -d1;
            }else{
                borrow = -1;
                d = d2 + b -d1;
            }
            retValue += d*pow;
            pow*=10;

            
        }

        return retValue;
    }
public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter base and then Numbers : ");
        int b = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int sub = sub(b , num1, num2);
        System.out.println("Difference  : " + sub);
}
    
}
