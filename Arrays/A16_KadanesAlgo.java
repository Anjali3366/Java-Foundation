import java.util.Scanner;

public class A16_KadanesAlgo {
         public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
          
    
            System.out.println("Enter the Elements : ");
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            int maxSum =0;
            int currSum = 0;

            for(int i =0;i<arr.length;i++){
                currSum +=arr[i];
                if(currSum<0){
                  currSum =0;

                }
                if(maxSum<currSum){
                    maxSum = currSum;
                }

            }
            int smallestNo = arr[0];
            for(int j =0;j<arr.length;j++){
                if(arr[j]<smallestNo){
                    smallestNo = arr[j];
                }
                if(maxSum == 0){
                    maxSum = smallestNo;
                }
            }
            System.out.println("Max SubArray sum : " + maxSum);

          
            

        }
    
}
