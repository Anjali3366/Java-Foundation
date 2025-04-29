import java.util.*;

public class Permutation {
  

    public static int fact( int num){
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n and r : "
    );
    int n = sc.nextInt();
    int r = sc.nextInt();

    int factn = fact(n);
    int nmrfact = fact(n-r);

    int npr = factn/nmrfact;
    System.out.println("permutation of "+ n +" and " +r +" = " + npr);

}
    
}
    

