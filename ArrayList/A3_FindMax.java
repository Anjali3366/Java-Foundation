
import java.util.*;

public class A3_FindMax {
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

        int max = Integer.MIN_VALUE;
        System.out.println(max);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}
