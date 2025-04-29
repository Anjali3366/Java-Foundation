

import java.util.Scanner;

public class A12_BinarySearch {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the Elements : ");
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }

            System.out.println("Enter the number  you want to find : ");
            int num = scn.nextInt();
            int idx =-1;

            int low = 0;
            int high = arr.length-1;
         

            while(low<=high){
                int mid = (low+high)/2;
                if(num == arr[mid]){
                    idx = mid;
                    break;
                }else if(arr[mid]>num){
                    high = mid-1;
                }else{
                    low = mid+1;
                }

            }

            System.out.println("Element found at " + idx);
        }
}
