import java.util.*;

public class S1_sortChar {

    public String frequencySort(String s) {

        if (s.length() == 0) {
            return "";
        }
        // char[] str = s.toCharArray();
        int[] arr = new int[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) s.charAt(i);

        }

        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        // String sorted = new String(arr);
        // return sorted;

    }
}

public static void main(String[] args) {
    System.out.println();

}
