// This program change the value of array .
public class B0_Basic {
    public static void changeArr(int arr[], int idx, int val) {
        // base case
        if (idx == arr.length) {
            printArr(arr);
            return;
        }

        // recursion (kaam)
        arr[idx] = val;
        changeArr(arr, idx + 1, val + 1);
        arr[idx] = val - 2;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

    }

}
