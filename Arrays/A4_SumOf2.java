

import java.util.Scanner;

public class A4_SumOf2 {

    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n1 = scn.nextInt();
            int[] arr = new int[n1];
            System.out.println("Enter the Elements of array1 : ");
            for(int i =0;i<arr.length;i++){
                arr[i] = scn.nextInt();
            }
System.out.println("Enter the size of array 2 : ");
            int n2 = scn.nextInt();
            int[] brr = new int[n2];
            System.out.println("Enter the Elements of array2 : ");
            for(int i =0;i<brr.length;i++){
                brr[i] = scn.nextInt();
            }

            // array of large size 
            int[] sum= new int[ n1 > n2? n1 : n2];

            // addition of two array ; 
          System.out.println("Addition of two : ");

           int i = arr.length-1;
           int j = brr.length-1;
           int k = sum.length-1;
           int c =0;

          while (k>=0) {
            int d =c;
            if(i>=0){
                d+=arr[i];
            }
            if(j>=0){
                d+=brr[j];
            }

            // carry ko increase 
            c =d/10;
            d = d%10;

            sum[k] = d;
            i--;
            j--;
            k--;
            
          }
          if(c!=0){
            System.out.println(c);
          }

          // print the array 
          for(int val : sum){
            System.out.println(val);
          }
         
        
        
        }
    
}
