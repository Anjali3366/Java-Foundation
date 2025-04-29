

import java.util.Scanner;

public class A16_MaxSubarraySum {
       public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the Elements : ");
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            
            int maxSum =arr[0];

            System.out.println("SubArray : ");
            for(int i =0;i<arr.length;i++){

                for(int j =i+1;j<=arr.length;j++){
                    int sum = 0;
                    for(int k = i;k<j;k++){
                        System.out.print(arr[k] + " ");
                        sum +=arr[k];
                       

                    }
                    System.out.print("sum: "+ sum);
                    if(sum>maxSum){
                        maxSum = sum;
                    }
                    System.out.println();
                }
            }
            System.out.println("Max sum : "+ maxSum);
        }
    
}
