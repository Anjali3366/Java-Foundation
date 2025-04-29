
import java.util.Scanner;

public class A11_LinearSearch {
    public static int linearSearch(int[] arr, int k ){
        int idx = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == k){
                idx = i;
                break;
            }

            }
            return idx;

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

            System.out.println("Enter the number  you want to find : ");
            int num = scn.nextInt();
            // finding the element 
          
       
                System.out.println("Found at "+linearSearch(arr, num)+" Index !");

            }
    
}
