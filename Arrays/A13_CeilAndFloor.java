import java.util.Scanner;

public class A13_CeilAndFloor {

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
            
            int low =0;
            int high = arr.length-1;
            int floor= 0;
            int ceil = 0;

            while(low<=high){
                int mid = (low + high)/2;

                if(arr[mid] == num){
                    ceil = arr[mid];
                    floor = arr[mid];
                    break;

                }else if(arr[mid]>num){
                    high = mid-1;
                    ceil = arr[mid];
                }else{
                    low = mid+1;
                    floor= arr[mid];
                }
            }

            System.out.println("Floor : "
            +floor);
            System.out.println("Ceil : "+ ceil);
    
}
}
