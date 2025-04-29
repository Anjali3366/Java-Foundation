import java.util.Scanner;

public class Addition {
    public static int add(int b, int n1 , int n2){
        int retValue =0;
        int c =0;
        int pow =1;

        while(n1>0 || c>0){
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

        int add = add(b , num1, num2);
        System.out.println("Sum : " + add);
    }
}
