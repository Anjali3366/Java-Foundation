// inverse the number with respect to their places  2314 --> 2134 or 81456273 --> 82456137  or 2143 --> 2143 or 15234 --> 41235

import java.util.Scanner;

public class InverseNo {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your number: ");

int num = sc.nextInt();
int counter =0;
int inverseNo =0;
while(num>0){
counter++;
int lastDigit = num%10;
int power = (int)Math.pow(10, lastDigit-1);
inverseNo = inverseNo+(counter*power);
num/=10;


}
System.out.println(inverseNo);

    }
    
}
