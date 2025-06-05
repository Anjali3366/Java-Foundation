public class D2_MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        // kaam

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid) {

        // ek array bnao
        int temp[] = new int[ei - si + 1];

        // pointers bnao for left , right or temp k liye

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
            k++;
        }

        // agar koi element baccha hai left part me toh add kro

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy kro temp array ko original array
        for (i = 0, k = si; i < temp.length; i++, k++) {
            arr[k] = temp[i];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 3, 3, 5, 45, 6, 2, 8, 9, 7 };
        int si = 0;
        int ei = arr.length - 1;
        mergeSort(arr, si, ei);
        printArr(arr);

    }

}

// time complexity -- O(N*logN)
// space complexity -- O(n )
