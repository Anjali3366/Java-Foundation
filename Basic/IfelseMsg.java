import java.util.Scanner;

public class IfelseMsg {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = scn.nextInt();

        if(marks>90){
            System.out.println("Excellent");
        }else if(marks>80 && marks<=90){
            System.out.println("Good");
        }else if(marks>70 && marks<=80){
            System.out.println("Meets expectations");
        }else{
            System.out.println("below par");
        }
    }
    
}
