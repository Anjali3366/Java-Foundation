
import java.util.*;

public class A4_Swap {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(22);
        list.add(3);
        list.add(43);
        list.add(5);
        list.add(26);
        list.add(57);

        System.out.println(list);
        swap(list, 2, 4);
        System.out.println(list);

    }
}
