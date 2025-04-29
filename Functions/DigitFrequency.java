
import java.util.Scanner;


public class DigitFrequency{
    public static int digitFre(int n, int digit){
        int counter =0;
        while(n>0){
            int lastdig = n%10;
            n/=10;
            if(lastdig == digit){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number and digit : ");
        int n = scn.nextInt();
        int digit = scn.nextInt();

        int freq = digitFre(n, digit);
        System.out.println("Frequency : "+ freq);

    }

}
