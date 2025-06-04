public class R9_ReverseArray {
    public static void reverseArr(int arr[], int left, int right) {

        // base case
        if (left >= right) {
            return;
        }

        // hypothesis
        reverseArr(arr, left + 1, right - 1);
        // induction -- swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }

    // Its my IDEA -- It is not optimized but make my confidence boost
    public static void reverse(int[] arr, int size) {
        // base case
        if (size < 0) {
            return;
        }

        // hypothesis
        int lastVal = arr[size];
        reverse(arr, size - 1);
        // induction
        arr[arr.length - 1 - size] = lastVal;

    }

    public static void printARR(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 5, 6, 7, 5, 9 };
        // reverseArr(arr, 0, arr.length - 1);
        reverse(arr, arr.length - 1);
        printARR(arr);
    }

}
