public class D3_QuickSort {
    public static void printARR(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        // get the pivot index with the help of partition function
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];

        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // for swapping the pivot itself
        i++;

        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void main(String[] args) {

        int arr[] = { 8, 6, 4, 7, 2, 0, 8, 5 };

        quickSort(arr, 0, arr.length - 1);
        printARR(arr);
    }
}
