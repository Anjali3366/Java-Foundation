import java.util.Scanner;

public class BenjaminBulb {
    public static void main(String args[]){
          Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of bulb :");
        int n = scn.nextInt(); 

        for(int i =0 ;i*i<=n ;i++){
            System.out.println(i*i);
        }
    }
}
