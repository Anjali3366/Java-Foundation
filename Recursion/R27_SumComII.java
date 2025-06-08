// statement -- Given  a collection of candidate number and a target (target), find all the unique combinations in candiates where the candidate numbers sum to target . 
// Each number in candiates may only be used once in the combination 
// Note : The solutionn set must not contain duplicate combinations. 

// Eg : candidate = [10,1,2,7,6,1,5] target = 8
// OUTPUT = [1,1,6], [1,2,5], [1,7], [2,6]

import java.util.*;

public class R27_SumComII {

    // this approach provide you duplicate in answer
    public static void findCombination(int idx, int arr[], int target, ArrayList<Integer> ans) {
        // Base Case
        if (idx == arr.length) {
            if (target == 0) {
                System.out.println(ans);
            }
            return;
        }

        // kaam + recursive call
        if (arr[idx] <= target) {
            ans.add(arr[idx]);
            findCombination(idx + 1, arr, target - arr[idx], ans);
            ans.remove(ans.size() - 1);
        }
        findCombination(idx + 1, arr, target, ans);
    }

    // this appraoch provide the unique solution
    public static void optimizedCombinations(int idx, int arr[], int target, ArrayList<Integer> ans) {

        // base case
        if (target == 0) {
            System.out.println(ans);
            return;
        }

        // backtracking
        for (int i = idx; i < arr.length; i++) {
            // previous vale same ho toh skip kr do
            if (i > idx && arr[i] == arr[i - 1])
                continue;

            // element should be lesser than target
            if (arr[i] > target)
                break;
            // adding element to ans
            ans.add(arr[i]);
            optimizedCombinations(i + 1, arr, target - arr[i], ans);

            // ensuring while backtrack ans must be untouched !
            ans.remove(ans.size() - 1);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
        int arr2[] = { 1, 1, 1, 2, 2 };
        // findCombination(0, arr, 8, new ArrayList<>());
        Arrays.sort(arr);
        optimizedCombinations(0, arr, 8, new ArrayList<>());
    }

}
