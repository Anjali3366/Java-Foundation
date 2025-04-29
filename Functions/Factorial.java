import java.util.*;

public class Factorial {
    public static int fact( int num){
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n : "
    );
    int n = sc.nextInt();
    System.out.println("factorial of "+ n  +" = " + fact(n));

}
    
}
