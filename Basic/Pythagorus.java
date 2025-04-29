import java.util.Scanner;

public class Pythagorus {
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your numbers : ");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        if(n1>n2 && n1>n3){
            if((n1*n1) == (n2*n2 + n3*n3)){
                System.out.println("True !");
            }else{
                System.out.println("False!");
            }}
        else if(n2>n3){
            if((n2*n2) == (n1*n1 + n3*n3)){
                System.out.println("True!!");

            }else{
                System.out.println("False!!");
            }

        }else{
            if((n3*n3)== (n1*n1+ n2*n2)){
                System.out.println("True!!!");
            }else{
                System.out.println("false!!!");
            }
        }
       
    }
    
}
