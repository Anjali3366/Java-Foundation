// print name five times through recursion 

public class R0_PrintName {
    public static void printName(String name, int count) {
        // base case
        if (count == 6) {
            return;
        }
        count++;
        System.out.println(name);
        printName(name, count);
    }

    public static void main(String[] args) {
        String name = "Anjali ";
        int count = 0;
        printName(name, count);

    }

}
