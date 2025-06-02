public class R5_MeanOfArray {
    public static int sum(int arr[], int sum, int i) {
        // base
        if (i == arr.length) {
            return sum;
        }

        // kaam
        return sum += arr[i] + sum(arr, sum, i + 1);
    }

    public static double findMean(int[] arr) {

        double mean = (double) sum(arr, 0, 0) / arr.length;

        return mean;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 2, 5, 3, 5, 8, 9 };
        System.out.println(sum(arr, 0, 0));
        System.out.println(findMean(arr));

    }
}