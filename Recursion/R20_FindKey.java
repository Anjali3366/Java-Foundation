// statement -- For a given integer array of size N.You have to find all the occurrences(indices)  of a given element(Key) and  print them using recursion.

public class R20_FindKey {
    public static void findAllOccurrence(int arr[], int key, int idx) {

        // base case
        if (idx == arr.length) {
            return;
        }

        // kaam
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        findAllOccurrence(arr, key, idx + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        findAllOccurrence(arr, 2, 0);

    }

}
