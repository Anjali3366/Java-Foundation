import java.util.Scanner;

public class A7_RotateArray {
    public static int[] reverse(int[] arr, int i , int j ){
       
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
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

            System.out.println("Enter the rotating factor : ");
            int k = scn.nextInt();
          
            // controling the rotating factor 
            k = k%arr.length;
            if(k<0){
                k+=arr.length;
            }

            // rotating the array into 3 parts 
            // part1 
            reverse(arr, 0, (arr.length-k-1));

            // part2
            reverse(arr, (arr.length-k), (arr.length-1));
            // part3
            reverse(arr, 0, arr.length-1);

            // printing the array 
            for(int count =0;count<arr.length;count++){
                System.out.print(arr[count]  +"   ");
            }


        }
    }

