// Statement -- Given an array of distinct integers candidate and a target integer target, return a listo of all unique combination of candiates where the chosen number sum to target . you may return the combinations in any order 

// The same number may be chosen from candiates an unlimited number of times. 

// EG : INPUT - [2,3,6,7] , target = 7 OUTPUT = [[2,2,3], [7]]

import java.util.*;

public class R26_SumCombination {
    public static void findCombination(int idx, int target, ArrayList<Integer> list, int[] arr) {
        // base case
        if (idx == arr.length) {
            if (target == 0) {
                System.out.println(list);
            }
            return;
        }

        // kaam
        if (arr[idx] <= target) {
            list.add(arr[idx]);

            // this is the condition where we chose same element from the array till target
            // became zero
            findCombination(idx, target - arr[idx], list, arr);
            list.remove(list.size() - 1); // backtrack step

        }

        // this is the condition where we move to the next index of array
        findCombination(idx + 1, target, list, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        findCombination(0, 8, new ArrayList<>(), arr);

    }
}