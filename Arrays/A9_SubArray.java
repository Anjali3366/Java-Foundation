

import java.util.Scanner;

public class A9_SubArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the value : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int tp = 0;
       System.out.println("SubArray : ");
        for(int j =0;j<arr.length;j++){
            for(int i = j; i<arr.length; i++) {
              for(int k =j;k<=i;k++){
                System.out.print(arr[k] +"  ");
            
              }
              tp++;
              System.out.println();
            }
        }
        System.out.println("total Subarray : " +tp);

        
    }

}
