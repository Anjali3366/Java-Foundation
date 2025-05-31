// statement -- Remove duplicates in-places from sorted array ! 
// you have to modify given array and return the no. of unique element in array!
// without sorting 

public class A22_RemoveDuplicate {
    public static int removeDuplicates(int[] arr, int n) {
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[idx]) {
                arr[idx + 1] = arr[i];
                idx++;
            }

        }
        return idx + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7 };
        int countUnique = removeDuplicates(arr, arr.length);

        System.out.println(countUnique);

    }
}
