import java.util.Scanner;

public class A0_PrintArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i =0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Your Element : ");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    
}
