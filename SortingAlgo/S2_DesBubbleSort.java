
public class S2_DesBubbleSort {
    public static void main(String[] args) {

        int arr[] = { 2, 5, 6, 3, 7, 11, 8, 9 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
