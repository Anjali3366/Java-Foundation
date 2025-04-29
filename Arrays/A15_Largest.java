import java.util.Scanner;

public class A15_Largest {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the Elements : ");
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }

          int largest = arr[0];

          for(int i=0;i<arr.length;i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
          }
          System.out.println("Largest Value : " + largest);

        }

}
