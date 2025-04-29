// print the number from starting 

import java.util.Scanner;

public class PrintDigit {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scn.nextInt();

        int noOFZeros = 0;
        int temp = n;
        while (temp > 0) {
            noOFZeros++;
            temp /= 10;
        }
        int power = (int) Math.pow(10, noOFZeros - 1);
        while (power > 0) { // while(n>0) is not worked for number jinke picche zero hai toh change kia
            int firstDigit = n / power;
            System.out.println(firstDigit);
            n %= power;
            power /= 10;
        }
    }
}
