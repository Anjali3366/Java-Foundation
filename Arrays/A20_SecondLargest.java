//Statement -- find the largest and second largest && smallest and second smallest in array 

public class A20_SecondLargest {
    public static int[] findLargest(int arr[], int n) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            }
            if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return new int[] { largest, sLargest };
    }

    public static int[] findSmallest(int arr[], int n) {
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;
        ;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            }
            if (arr[i] != smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }
        return new int[] { smallest, secSmallest };
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 0, 5, 3, 6, 7, 7, 8, 4, 3, 5, 3, 1 };
        int n = arr.length;
        int largest[] = findLargest(arr, n);
        int smallest[] = findSmallest(arr, n);
        System.out.println("Largest ...");
        printArr(largest);

        System.out.println("Smallest ....");
        printArr(smallest);

    }

}
