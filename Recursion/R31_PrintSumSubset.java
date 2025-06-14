// Statement -- Print the all the sum of subset of given string . 

public class R31_PrintSumSubset {
    public static void printSubset(int arr[], int idx, int sum) {
        if (idx == arr.length) {
            System.out.println(sum);
            return;
        }
        // condition where we chose the element
        printSubset(arr, idx + 1, sum + arr[idx]);
        // condition where we are not gonna pick the element
        printSubset(arr, idx + 1, sum);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4 };
        printSubset(arr, 0, 0);

    }

}
