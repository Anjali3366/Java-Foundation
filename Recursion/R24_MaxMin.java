public class R24_MaxMin {
    public static void findMaxMin(int arr[], int i, int max, int min) {
        // base case
        if (i >= arr.length) {
            System.out.println(max);
            System.out.println(min);
            return;
        }

        // kaam
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
        findMaxMin(arr, i + 1, max, min);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 6, 7, 4 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        findMaxMin(arr, 0, max, min);
    }

}
