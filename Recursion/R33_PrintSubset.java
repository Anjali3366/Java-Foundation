import java.util.ArrayList;

public class R33_PrintSubset {
    public static void printSubset(int arr[], int idx, ArrayList subset) {
        if (idx == arr.length) {
            System.out.println(subset);
            return;
        }

        // pick the element
        subset.add(arr[idx]);
        printSubset(arr, idx + 1, subset);
        // remove the last element
        subset.remove(subset.size() - 1);

        // don't pick the element
        printSubset(arr, idx + 1, subset);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        printSubset(arr, 0, new ArrayList<Integer>());
    }

}
