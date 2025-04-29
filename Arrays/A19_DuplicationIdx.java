import java.util.Scanner;

public class A19_DuplicationIdx {

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
            int firstIdx = -1;
          
            while(low<=high){
                int mid = (low +high)/2;
                if(arr[mid]<num){
                    low = mid+1;

                }else if(arr[mid]>num){
                    high = mid-1;

                }else{
                    firstIdx = mid;
                    high = mid-1;

                }
            }
            System.out.println("First Index : "+ firstIdx);
            low =0;
             high = arr.length-1;
            int lastIdx = -1;
          
            while(low<=high){
                int mid = (low +high)/2;
                if(arr[mid]>num){
                    low = mid+1;

                }else if(arr[mid]<num){
                    high = mid-1;

                }else{
                    lastIdx = mid;
                    low = mid+1;

                }
            }
            System.out.println("Last Index : "+lastIdx);


        }
    
}
