

import java.util.Scanner;

public class A8_InverseArray {
    public static int[] inverse(int[] arr){
        for(int j =0;j<arr.length;j++){
            int inv = arr[j];
            arr[inv] =j;
        }
        return arr;
    }
      public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the value : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        
        arr= inverse(arr);
       
        for(int j =0;j<arr.length;j++){
            System.out.print(arr[j] + "   ");
        }

        
    }

    
}
