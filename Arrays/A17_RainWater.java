import java.util.Scanner;

public class A17_RainWater {
    public static int trapRainwater(int[] arr, int n){
        int retValue =0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = arr[0];
        for(int i =1;i<leftMax.length;i++){
          
            leftMax[i] = arr[i]>leftMax[i-1]?arr[i]:leftMax[i-1];

        }
        rightMax[n-1] = arr[n-1];
        for(int j = n-2;j>0;j--){
          rightMax[j] = arr[j]>rightMax[j+1]?arr[j]:rightMax[j+1];
        }

        for(int k =0;k<n;k++){
            int min = Math.min(leftMax[k], rightMax[k]);
            int waterLevel = min-arr[k];
          if(waterLevel>0){
            retValue +=waterLevel;
          }
        }


        return retValue;
    }

    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the Elements : ");
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();

            }
            System.out.println("Water Qty : " +trapRainwater(arr, n));


    }
    
}
