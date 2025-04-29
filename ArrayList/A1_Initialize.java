import java.util.*;

public class A1_Initialize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // adding element
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print(list + " ");

        // set an element at specific index
        list.set(2, 6);
        System.out.print(list + " ");
        System.out.println(list.get(3));

        // getting size of arrayy list
        System.out.println(list.size());
        list.add(0, 8);
        // remove element
        list.remove(1);

        // checking element
        System.out.println(list.contains(8));
        System.out.println(list.indexOf(8));
        System.out.println(list.lastIndexOf(8));

        // capacity

        System.out.println(list.isEmpty());
        // sorting

        Collections.sort(list);
        System.out.print(list);

    }

}