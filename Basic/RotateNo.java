import java.util.Scanner;

public class RotateNo {
  public static void main(String args[]){

      Scanner scn = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scn.nextInt();
        System.out.println("Enter the no of rotation :");
        int rot = scn.nextInt();

        int temp =n ;
        int totaldig =0;


        while (temp>0){
            totaldig++;
            temp /=10;
        }
        int div =1;
        int mul =1;
        rot =rot%totaldig;
        if(rot<0){
            rot = rot+totaldig;
        }
        for(int i =1;i<=totaldig;i++){
            if(i<=rot){
                div*=10;
            }else{
                mul*=10;
            }
        }
        int quo = n/div;
        int rem = n%div;

        int rotateNo = rem*mul +quo;
        System.out.println(rotateNo);

    

        // This is my code just for positive number less than total digit in a number !!
        // int divisor = (int)Math.pow(10,rot);
        // int remainder = n%divisor;
        // int quotient = n/divisor;
        // System.out.println("remainder "+remainder);
        // System.out.println("quotient " + quotient);
        // int totalDig = 0;
        // int temp = quotient;
        // while(temp>0){
        //     totalDig++;
        //     temp/=10;
        // }
        // System.out.println(totalDig);
        // int mul = (int)Math.pow(10, totalDig);
        // int rotateNo = (mul*remainder)+(quotient);
        // System.out.println("Your rotated number is " + rotateNo);
     

  }  
}
