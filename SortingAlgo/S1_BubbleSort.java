
public class S1_BubbleSort {
    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 3, 7, 11, 8, 9 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

}
