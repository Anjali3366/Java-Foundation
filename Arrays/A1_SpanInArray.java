
import java.util.Scanner;

public class A1_SpanInArray {
         
         public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the Elements : ");
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            int max = arr[0];
            int min =arr[0];
            for(int i =0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            System.out.println("Maximum and minimum : ");
            System.out.println(max);
            System.out.println(min);
            System.out.println(" Span of max and min : " +( max-min));
        
            
         }
     
}
