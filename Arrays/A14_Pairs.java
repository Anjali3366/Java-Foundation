

import java.util.Scanner;

public class A14_Pairs {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the Elements : ");
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            int tp =0;
            System.out.println("Pair : ");
            for(int i =0;i<arr.length;i++){
                for(int j =i+1;j<arr.length;j++){
                    System.out.print("("+ arr[i]+","+arr[j]+"),  ");
                    tp++;
                }
                System.out.println();
            }
            System.out.println("Total Pair : " + tp);
    }
    

    
}
