

import java.util.Scanner;

public class A3_BarChart {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the Elements : ");
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }

            // finding the max value 
            int max = arr[0];
            for(int i =0;i<arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }

            }
            // traversing the max building 
            for(int i =max;i>=1;i--){
                for(int j =0;j<arr.length;j++){
                    if(arr[j]>= i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        
        
        }
    
}
