// Statment -- Print all Subsquences(a contigous or non-contigous sequences , which follows the order )

// Subsequence -- [3,1,2] = {}, {3}, {1},{2}, {3,1}, {1,2}, {3,2}, {3,1,2}  for  generating subquence order of array should be maintain
// all subset can be subquences but all subquences can't be subset

// We have to solve this problem in three way -- print all subsequence , print one solution only  and count all the subsequences .

public class R11_Subsquences {
    public static void printSubsequence(int arr[], int idx) {

        // base case
        if (idx > arr.length) {
            printArr(arr);
            return;
        }

        // hypothesis + induction

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean printOneSeq() {
        return true;
    }

    public static int countSequence() {
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 8 };
        printSubsequence(arr, arr.length);
    }

}
