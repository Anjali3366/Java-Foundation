
import java.util.Scanner;

public class A6_ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the value : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println("Reversed Array : ");

        for(int k =0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

        
    }
    
}
