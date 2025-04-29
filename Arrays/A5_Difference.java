import java.util.Scanner;

public class A5_Difference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n1 = scn.nextInt();
        int[] arr = new int[n1];
        System.out.println("Enter the Elements of array1 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }


        System.out.println("Enter the size of array 2 : ");
        int n2 = scn.nextInt();
        int[] brr = new int[n2];
        System.out.println("Enter the Elements of array2 : ");
        for (int i = 0; i < brr.length; i++) {
            brr[i] = scn.nextInt();
        }
        int[] diff = new int[n2];

        int i = arr.length-1;
        int j=brr.length-1;
        int k = diff.length -1;
        int c =0;

        while(k>=0 ){
            int d = 0;
            // arr ki value
            int arr_val = i>=0?arr[i]:0;


            if(brr[j]+c >= arr_val){
                d = brr[j]+c -arr_val;
                c =0;
            }else{
                d = brr[j]+c+10-arr_val;
                c =-1;
            }

            diff[k] =d;
            i--;
            j--;
            k--;
        }
        
        int idx =0;
        while(idx<diff.length){
            if(diff[idx] == 0){
                idx++;
            }else{
                break;
            }
        }
        System.out.println("Difference of two array : ");
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }

}
